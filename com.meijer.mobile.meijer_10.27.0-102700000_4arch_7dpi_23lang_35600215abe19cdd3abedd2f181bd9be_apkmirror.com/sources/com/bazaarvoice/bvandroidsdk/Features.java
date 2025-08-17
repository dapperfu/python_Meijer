package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Features extends IncludeableContent {

    @InterfaceC15617c("features")
    private List<FeatureKeyword> features;

    @InterfaceC15617c("language")
    private String language;

    @InterfaceC15617c("productId")
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
