package net.olegan.rrr.ua.repository;

import net.olegan.rrr.ua.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}