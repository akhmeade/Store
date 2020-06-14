/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.online.store.carts.web;

import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.online.store.carts.model.Carts;
import org.springframework.online.store.carts.model.CartsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RequestMapping("/carts")
@RestController
@RequiredArgsConstructor
@Slf4j
@Timed("onlinestore.carts")
class CartsResource {

   /* private final CartRepository cartRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cart createCart(@Valid @RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    @GetMapping(value = "/{cartId}")
    public Optional<Cart> findAccount(@PathVariable("cartId") int cartId) {
        return cartRepository.findById(cartId);
    }

    @GetMapping
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @PutMapping(value = "/{cartId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItem(@PathVariable("cartId") int cartId, @Valid @RequestBody Cart cartRequest) {
        final Optional<Cart> item = cartRepository.findById(cartId);

        final Cart cartModel = item.orElseThrow(() -> new RuntimeException("Cart "+ cartId +" not found"));
        cartModel.setId(cartRequest.getId());
        log.info("Saving item {}", cartModel);
        cartRepository.save(cartModel);
    }
}
*/
   private final CartsRepository cartsRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carts createItem(@Valid @RequestBody Carts carts) {
        return cartsRepository.save(carts);
    }

    @GetMapping(value = "/{cartsId}")
    public Optional<Carts> findCart(@PathVariable("cartsId") int cartsId) {
        return cartsRepository.findById(cartsId);
    }

    @GetMapping
    public List<Carts> findAll() {
        return cartsRepository.findAll();
    }

    @PutMapping(value = "/{cartsId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCarts(@PathVariable("cartsId") int cartsId, @Valid @RequestBody Carts cartsRequest) {
        final Optional<Carts> carts = cartsRepository.findById(cartsId);

        final Carts cartsModel = carts.orElseThrow(() -> new ResourceNotFoundException("Owner " + cartsId + " not found"));
        // This is done by hand for simplicity purpose. In a real life use-case we should consider using MapStruct.
        cartsModel.setName(cartsRequest.getName());
        cartsModel.setAccount(cartsRequest.getAccount());
        cartsModel.setPrice(cartsRequest.getPrice());
        cartsModel.setDiscount(cartsRequest.getDiscount());
        cartsModel.setPayment(cartsRequest.getPayment());
        log.info("Saving item {}", cartsModel);
        cartsRepository.save(cartsModel);
    }
}
