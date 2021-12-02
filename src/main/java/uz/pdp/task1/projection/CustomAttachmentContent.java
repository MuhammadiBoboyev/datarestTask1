package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Attachment;
import uz.pdp.task1.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    int getId();

    byte[] getContent();

    Attachment getAttachment();
}
