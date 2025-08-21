package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class Features extends IncludeableContent {

    @InterfaceC16127c("features")
    private List<FeatureKeyword> features;

    @InterfaceC16127c("language")
    private String language;

    @InterfaceC16127c("productId")
    private String productId;

    public List<FeatureKeyword> getFeatures() {
        return this.features;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getProductId() {
        return this.productId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludeableContent
    public /* bridge */ /* synthetic */ ConversationsInclude getIncludedIn() {
        return super.getIncludedIn();
    }
}
