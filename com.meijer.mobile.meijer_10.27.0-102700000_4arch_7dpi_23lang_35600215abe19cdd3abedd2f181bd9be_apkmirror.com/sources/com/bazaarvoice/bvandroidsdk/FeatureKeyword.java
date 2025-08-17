package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class FeatureKeyword extends IncludeableContent {

    @InterfaceC15617c("feature")
    private String feature;

    @InterfaceC15617c("localizedFeature")
    private String localizedFeature;

    public String getFeature() {
        return this.feature;
    }

    public String getLocalizedFeature() {
        return this.localizedFeature;
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludeableContent
    public /* bridge */ /* synthetic */ ConversationsInclude getIncludedIn() {
        return super.getIncludedIn();
    }
}
