package org.springframework.online.store.accounts.web;

import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.online.store.accounts.model.Account;
import org.springframework.online.store.accounts.model.AccountRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("/accounts")
@RestController
@Timed("onlinestore.accounts")
@RequiredArgsConstructor
@Slf4j
class AccountResource {

    /*private final AccountRepository accountRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping(value = "/{accountId}")
    public Optional<Account> findAccount(@PathVariable("accountId") int accountId) {
        return accountRepository.findById(accountId);
    }

    @GetMapping
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @PutMapping(value = "/{accountId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItem(@PathVariable("accountId") int accountId, @Valid @RequestBody Account accountRequest) {
        final Optional<Account> item = accountRepository.findById(accountId);

        final Account accountModel = item.orElseThrow(() -> new ResourceNotFoundException("Owner "+ accountId +" not found"));
        // This is done by hand for simplicity purpose. In a real life use-case we should consider using MapStruct.
        accountModel.setName(accountRequest.getName());
        log.info("Saving item {}", accountModel);
        accountRepository.save(accountModel);
    }
}*/

    private final AccountRepository accountRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@Valid @RequestBody Account accounts) {
        return accountRepository.save(accounts);
    }

    @GetMapping(value = "/{accountsId}")
    public Optional<Account> findAccount(@PathVariable("accountsId") int accountsId) {
        return accountRepository.findById(accountsId);
    }

    @GetMapping
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @PutMapping(value = "/{accountsId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItem(@PathVariable("accountsId") int accountsId, @Valid @RequestBody Account accountRequest) {
        final Optional<Account> item = accountRepository.findById(accountsId);

        final Account accountModel = item.orElseThrow(() -> new ResourceNotFoundException("Owner "+ accountsId +" not found"));
        // This is done by hand for simplicity purpose. In a real life use-case we should consider using MapStruct.
        accountModel.setFirstName(accountRequest.getFirstName());
        accountModel.setName(accountRequest.getName());
        accountModel.setGender(accountRequest.getGender());
        //accountModel.setDate(accountRequest.getDate());
        log.info("Saving item {}", accountModel);
        accountRepository.save(accountModel);
    }
}
