package Vl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b*\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b,\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R!\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"LVl/k;", "LVl/a;", "", "cardTitle", "seeAllTitle", "seeAllDeepLink", "carouselBanner", "LVl/e;", "componentType", "cardId", "viewBeaconUrl", "loadBeaconUrl", "LVl/d;", "error", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LVl/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LVl/d;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "getSeeAllTitle", "c", "g", "d", "f", "e", "LVl/e;", "getComponentType", "()LVl/e;", "getCardId", "getViewBeaconUrl", "getLoadBeaconUrl", "i", "LVl/d;", "getError", "()LVl/d;", "j", "Ljava/util/List;", "()Ljava/util/List;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.k, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductCarouselV3 implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllDeepLink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carouselBanner;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final e componentType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String viewBeaconUrl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String loadBeaconUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomeCardError error;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> products;

    public ProductCarouselV3(String cardTitle, String str, String str2, String str3, e componentType, String cardId, String str4, String str5, HomeCardError homeCardError, List<String> products) {
        Intrinsics.j(cardTitle, "cardTitle");
        Intrinsics.j(componentType, "componentType");
        Intrinsics.j(cardId, "cardId");
        Intrinsics.j(products, "products");
        this.cardTitle = cardTitle;
        this.seeAllTitle = str;
        this.seeAllDeepLink = str2;
        this.carouselBanner = str3;
        this.componentType = componentType;
        this.cardId = cardId;
        this.viewBeaconUrl = str4;
        this.loadBeaconUrl = str5;
        this.error = homeCardError;
        this.products = products;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCarouselV3)) {
            return false;
        }
        ProductCarouselV3 productCarouselV3 = (ProductCarouselV3) other;
        return Intrinsics.e(this.cardTitle, productCarouselV3.cardTitle) && Intrinsics.e(this.seeAllTitle, productCarouselV3.seeAllTitle) && Intrinsics.e(this.seeAllDeepLink, productCarouselV3.seeAllDeepLink) && Intrinsics.e(this.carouselBanner, productCarouselV3.carouselBanner) && Intrinsics.e(this.componentType, productCarouselV3.componentType) && Intrinsics.e(this.cardId, productCarouselV3.cardId) && Intrinsics.e(this.viewBeaconUrl, productCarouselV3.viewBeaconUrl) && Intrinsics.e(this.loadBeaconUrl, productCarouselV3.loadBeaconUrl) && Intrinsics.e(this.error, productCarouselV3.error) && Intrinsics.e(this.products, productCarouselV3.products);
    }

    @Override // Vl.a
    /* renamed from: f, reason: from getter */
    public String getCarouselBanner() {
        return this.carouselBanner;
    }

    @Override // Vl.a
    /* renamed from: g, reason: from getter */
    public String getSeeAllDeepLink() {
        return this.seeAllDeepLink;
    }

    @Override // Vl.a
    /* renamed from: h, reason: from getter */
    public String getCardTitle() {
        return this.cardTitle;
    }

    public int hashCode() {
        int iHashCode = this.cardTitle.hashCode() * 31;
        String str = this.seeAllTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.seeAllDeepLink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carouselBanner;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.componentType.hashCode()) * 31) + this.cardId.hashCode()) * 31;
        String str4 = this.viewBeaconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.loadBeaconUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HomeCardError homeCardError = this.error;
        return ((iHashCode6 + (homeCardError != null ? homeCardError.hashCode() : 0)) * 31) + this.products.hashCode();
    }

    public final List<String> i() {
        return this.products;
    }

    public String toString() {
        return "ProductCarouselV3(cardTitle=" + this.cardTitle + ", seeAllTitle=" + this.seeAllTitle + ", seeAllDeepLink=" + this.seeAllDeepLink + ", carouselBanner=" + this.carouselBanner + ", componentType=" + this.componentType + ", cardId=" + this.cardId + ", viewBeaconUrl=" + this.viewBeaconUrl + ", loadBeaconUrl=" + this.loadBeaconUrl + ", error=" + this.error + ", products=" + this.products + ')';
    }

    public /* synthetic */ ProductCarouselV3(String str, String str2, String str3, String str4, e eVar, String str5, String str6, String str7, HomeCardError homeCardError, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, eVar, str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : homeCardError, (i10 & 512) != 0 ? CollectionsKt.m() : list);
    }
}
