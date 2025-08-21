package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class FeatureKeyword extends IncludeableContent {

    @InterfaceC16127c("feature")
    private String feature;

    @InterfaceC16127c("localizedFeature")
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
