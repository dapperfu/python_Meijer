package com.meijer.mobile.meijer.activity.find.productdetail;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "", "", "bazaarVoiceFeedback", "favoritesProductList", "newShoppingList", "showGoogleAds", "preventGMOnlyDelivery", "useGraphQL", "showVariants", "subscription", "<init>", "(ZZZZZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "d", "e", "f", "getUseGraphQL", "g", "h", "getSubscription", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.W0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductDetailFeatureFlags {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bazaarVoiceFeedback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean favoritesProductList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newShoppingList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showGoogleAds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean preventGMOnlyDelivery;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useGraphQL;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showVariants;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean subscription;

    public ProductDetailFeatureFlags() {
        this(false, false, false, false, false, false, false, false, l3.f93323c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailFeatureFlags)) {
            return false;
        }
        ProductDetailFeatureFlags productDetailFeatureFlags = (ProductDetailFeatureFlags) other;
        return this.bazaarVoiceFeedback == productDetailFeatureFlags.bazaarVoiceFeedback && this.favoritesProductList == productDetailFeatureFlags.favoritesProductList && this.newShoppingList == productDetailFeatureFlags.newShoppingList && this.showGoogleAds == productDetailFeatureFlags.showGoogleAds && this.preventGMOnlyDelivery == productDetailFeatureFlags.preventGMOnlyDelivery && this.useGraphQL == productDetailFeatureFlags.useGraphQL && this.showVariants == productDetailFeatureFlags.showVariants && this.subscription == productDetailFeatureFlags.subscription;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.bazaarVoiceFeedback) * 31) + Boolean.hashCode(this.favoritesProductList)) * 31) + Boolean.hashCode(this.newShoppingList)) * 31) + Boolean.hashCode(this.showGoogleAds)) * 31) + Boolean.hashCode(this.preventGMOnlyDelivery)) * 31) + Boolean.hashCode(this.useGraphQL)) * 31) + Boolean.hashCode(this.showVariants)) * 31) + Boolean.hashCode(this.subscription);
    }

    public String toString() {
        return "ProductDetailFeatureFlags(bazaarVoiceFeedback=" + this.bazaarVoiceFeedback + ", favoritesProductList=" + this.favoritesProductList + ", newShoppingList=" + this.newShoppingList + ", showGoogleAds=" + this.showGoogleAds + ", preventGMOnlyDelivery=" + this.preventGMOnlyDelivery + ", useGraphQL=" + this.useGraphQL + ", showVariants=" + this.showVariants + ", subscription=" + this.subscription + ')';
    }

    public ProductDetailFeatureFlags(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.bazaarVoiceFeedback = z10;
        this.favoritesProductList = z11;
        this.newShoppingList = z12;
        this.showGoogleAds = z13;
        this.preventGMOnlyDelivery = z14;
        this.useGraphQL = z15;
        this.showVariants = z16;
        this.subscription = z17;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getBazaarVoiceFeedback() {
        return this.bazaarVoiceFeedback;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getFavoritesProductList() {
        return this.favoritesProductList;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getNewShoppingList() {
        return this.newShoppingList;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getPreventGMOnlyDelivery() {
        return this.preventGMOnlyDelivery;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getShowGoogleAds() {
        return this.showGoogleAds;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowVariants() {
        return this.showVariants;
    }

    public /* synthetic */ ProductDetailFeatureFlags(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC18503f.C2788f.f172876h.getDefault() : z10, (i10 & 2) != 0 ? AbstractC18503f.A.f172842h.getDefault() : z11, (i10 & 4) != 0 ? AbstractC18503f.O.f172854h.getDefault() : z12, (i10 & 8) != 0 ? AbstractC18503f.C.f172844h.getDefault() : z13, (i10 & 16) != 0 ? AbstractC18503f.V.f172861h.getDefault() : z14, (i10 & 32) != 0 ? AbstractC18503f.W.f172862h.getDefault() : z15, (i10 & 64) != 0 ? AbstractC18503f.C18522t.f172904h.getDefault() : z16, (i10 & 128) != 0 ? AbstractC18503f.Z.f172865h.getDefault() : z17);
    }
}
