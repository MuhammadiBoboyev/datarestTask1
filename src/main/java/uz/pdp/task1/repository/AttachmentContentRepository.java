package uz.pdp.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.AttachmentContent;
import uz.pdp.task1.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
