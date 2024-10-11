package net.mihir.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.mihir.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
