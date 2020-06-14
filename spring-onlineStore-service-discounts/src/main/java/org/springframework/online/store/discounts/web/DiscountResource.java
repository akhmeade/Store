
// #####################################################
// ########## Packages and imported libraries ##########
// #####################################################

// discounts.web
package org.springframework.online.store.discounts.web;
// from spring framework
import org.springframework.http.HttpStatus;
import org.springframework.online.store.discounts.model.Discount;
import org.springframework.online.store.discounts.model.DiscountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
// other
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

// #####################################################
// ############## Creating the resource ################
// #####################################################

@RequestMapping("/discounts")
@RestController
@Timed("onlinestore.discount")
@RequiredArgsConstructor
@Slf4j
public class DiscountResource {

    private final DiscountRepository discountRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Discount createDiscount(@Valid @RequestBody Discount discount) {
        return discountRepository.save(discount);
    }

    @GetMapping(value = "/{discountId}")
    public Optional<Discount> findDiscount(@PathVariable("discountId") int discountId) {
        return discountRepository.findById(discountId);
    }

    @GetMapping
    public List<Discount> findAll() {
        return discountRepository.findAll();
    }

    @PutMapping(value = "/{discountId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDiscount(@PathVariable("discountId") int discountId, @Valid @RequestBody Discount discountRequest) {

        final Optional<Discount> discount = discountRepository.findById(discountId);
        final Discount discountModel = discount.orElseThrow(() -> new ResourceNotFoundException("Owner "+ discountId +" not found"));

        discountModel.set_name(discountRequest.get_name());
        discountModel.set_discount(discountRequest.get_discount());
        discountModel.set_newPrice(discountRequest.get_newPrice());
        log.info("Saving discount {}", discountModel);
        discountRepository.save(discountModel);
    }
}
