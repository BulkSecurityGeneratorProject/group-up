package app.group.up.repository.search;

import app.group.up.domain.Address;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Address entity.
 */
public interface AddressSearchRepository extends ElasticsearchRepository<Address, Long> {
}
