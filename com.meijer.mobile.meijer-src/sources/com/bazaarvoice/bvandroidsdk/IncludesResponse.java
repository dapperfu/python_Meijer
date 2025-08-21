package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsInclude;
import com.bazaarvoice.bvandroidsdk.IncludeableContent;
import java.util.Iterator;
import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
class IncludesResponse<IncludableContentType extends IncludeableContent, ConversationsIncludeType extends ConversationsInclude> extends ConversationsDisplayResponse<IncludableContentType> {
    private boolean hasAssociatedIncludes = false;

    @InterfaceC16127c("Includes")
    private ConversationsIncludeType includes;

    public ConversationsIncludeType getIncludes() {
        return this.includes;
    }

    IncludesResponse() {
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayResponse
    public List<IncludableContentType> getResults() {
        List<IncludableContentType> results = super.getResults();
        if (!this.hasAssociatedIncludes) {
            Iterator<IncludableContentType> it = results.iterator();
            while (it.hasNext()) {
                it.next().setIncludedIn(this.includes);
            }
        }
        return results;
    }
}
