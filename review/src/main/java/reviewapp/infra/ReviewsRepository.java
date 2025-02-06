package reviewapp.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reviewapp.domain.*;

@RepositoryRestResource(collectionResourceRel = "reviews", path = "reviews")
public interface ReviewsRepository
    extends PagingAndSortingRepository<Reviews, Long> {}
