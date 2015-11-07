package org.ihc.clinical.sbs.providers.system;

import ca.uhn.fhir.model.api.Tag;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.rest.annotation.GetTags;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cmbylund on 11/7/15.
 */
public class SystemTagsProvider {

    @GetTags
    public TagList getAllTagsOnServer(HttpServletRequest theRequest) {
        TagList tags = new TagList();
        Tag tag = new Tag(Tag.ATTR_SCHEME, "Example Tag");
        tags.add(tag);
        return tags;
    }
}
