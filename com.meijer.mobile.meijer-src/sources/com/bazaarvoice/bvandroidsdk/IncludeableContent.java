package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsInclude;

/* loaded from: classes4.dex */
class IncludeableContent<ConversationsIncludeType extends ConversationsInclude> {
    private transient ConversationsIncludeType includedIn;

    public ConversationsIncludeType getIncludedIn() {
        return this.includedIn;
    }

    protected void setIncludedIn(ConversationsIncludeType conversationsincludetype) {
        this.includedIn = conversationsincludetype;
    }

    IncludeableContent() {
    }
}
