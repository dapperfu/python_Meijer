package vs;

import Oj.a;
import hi.AbstractC14481h;
import java.util.List;
import jk.EnumC14984a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u00126\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b+\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b'\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b=\u0010!R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b\u0013\u0010@RG\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00190\u00148\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\b8\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b>\u0010\u001fR\u0011\u0010E\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bD\u0010@¨\u0006F"}, d2 = {"Lvs/d;", "", "Ljk/a;", "carouselType", "retryAction", "", "carouselTitle", "Lmk/d;", "personalizedProductType", "", "Lvs/f;", "productDecorators", "LOj/a;", "loadingState", "bannerResource", "", "bannerErrorImageResource", "uri", "", "isLoggedIn", "Lkotlin/Function2;", "LOk/c;", "Lkotlin/ParameterName;", "name", "coupon", "", "productCouponButtonClicked", "<init>", "(Ljk/a;Ljava/lang/Object;Ljava/lang/String;Lmk/d;Ljava/util/List;LOj/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "Lhi/h;", "i", "()Lhi/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljk/a;", "d", "()Ljk/a;", "b", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "c", "Ljava/lang/String;", "Lmk/d;", "getPersonalizedProductType", "()Lmk/d;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "LOj/a;", "()LOj/a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "k", "j", "Z", "()Z", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "trackingState", "l", "isCarouselEmpty", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductCarouselDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC14984a carouselType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object retryAction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carouselTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.d personalizedProductType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductListDecorator> productDecorators;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Oj.a loadingState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerResource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bannerErrorImageResource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uri;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Ok.c, EnumC14984a, Unit> productCouponButtonClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCarouselDecorator(EnumC14984a carouselType, Object retryAction, String str, mk.d personalizedProductType, List<ProductListDecorator> productDecorators, Oj.a loadingState, String str2, Integer num, String str3, boolean z10, Function2<? super Ok.c, ? super EnumC14984a, Unit> productCouponButtonClicked) {
        Intrinsics.j(carouselType, "carouselType");
        Intrinsics.j(retryAction, "retryAction");
        Intrinsics.j(personalizedProductType, "personalizedProductType");
        Intrinsics.j(productDecorators, "productDecorators");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(productCouponButtonClicked, "productCouponButtonClicked");
        this.carouselType = carouselType;
        this.retryAction = retryAction;
        this.carouselTitle = str;
        this.personalizedProductType = personalizedProductType;
        this.productDecorators = productDecorators;
        this.loadingState = loadingState;
        this.bannerResource = str2;
        this.bannerErrorImageResource = num;
        this.uri = str3;
        this.isLoggedIn = z10;
        this.productCouponButtonClicked = productCouponButtonClicked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCarouselDecorator)) {
            return false;
        }
        ProductCarouselDecorator productCarouselDecorator = (ProductCarouselDecorator) other;
        return this.carouselType == productCarouselDecorator.carouselType && Intrinsics.e(this.retryAction, productCarouselDecorator.retryAction) && Intrinsics.e(this.carouselTitle, productCarouselDecorator.carouselTitle) && this.personalizedProductType == productCarouselDecorator.personalizedProductType && Intrinsics.e(this.productDecorators, productCarouselDecorator.productDecorators) && Intrinsics.e(this.loadingState, productCarouselDecorator.loadingState) && Intrinsics.e(this.bannerResource, productCarouselDecorator.bannerResource) && Intrinsics.e(this.bannerErrorImageResource, productCarouselDecorator.bannerErrorImageResource) && Intrinsics.e(this.uri, productCarouselDecorator.uri) && this.isLoggedIn == productCarouselDecorator.isLoggedIn && Intrinsics.e(this.productCouponButtonClicked, productCarouselDecorator.productCouponButtonClicked);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final hi.AbstractC14481h i() {
        /*
            r8 = this;
            java.lang.String r0 = r8.uri
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            r0 = r1
        L7:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.util.Set r2 = r0.getQueryParameterNames()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto Lae
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            goto Lae
        L1c:
            java.lang.String r2 = r0.getQuery()
            if (r2 != 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            java.util.Set r2 = r0.getQueryParameterNames()
            java.lang.String r4 = "list"
            boolean r2 = r2.contains(r4)
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L50
            java.lang.String r2 = "buyAgain"
            boolean r2 = kotlin.text.StringsKt.c0(r1, r2, r5, r4, r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = "Buy Again: Product Clicked"
            hi.h$b r2 = hi.C14476c.h(r2)
            goto L51
        L41:
            java.lang.String r2 = "favoritesOnSale"
            boolean r2 = kotlin.text.StringsKt.c0(r1, r2, r5, r4, r3)
            if (r2 == 0) goto L50
            java.lang.String r2 = "Favorites on Sale: Product Clicked"
            hi.h$b r2 = hi.C14476c.h(r2)
            goto L51
        L50:
            r2 = r3
        L51:
            java.util.Set r6 = r0.getQueryParameterNames()
            java.lang.String r7 = "department"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L89
            java.lang.String r6 = "L2-10778"
            boolean r6 = kotlin.text.StringsKt.c0(r1, r6, r5, r4, r3)
            if (r6 == 0) goto L6c
            java.lang.String r1 = "Produce-L2-10778: Product Clicked"
            hi.h$b r2 = hi.C14476c.h(r1)
            goto L89
        L6c:
            java.lang.String r6 = "L2-9974"
            boolean r6 = kotlin.text.StringsKt.c0(r1, r6, r5, r4, r3)
            if (r6 == 0) goto L7b
            java.lang.String r1 = "Dairy-L2-9974: Product Clicked"
            hi.h$b r2 = hi.C14476c.h(r1)
            goto L89
        L7b:
            java.lang.String r6 = "L2-9980"
            boolean r1 = kotlin.text.StringsKt.c0(r1, r6, r5, r4, r3)
            if (r1 == 0) goto L89
            java.lang.String r1 = "Snacks-L2-9980: Product Clicked"
            hi.h$b r2 = hi.C14476c.h(r1)
        L89:
            java.util.Set r0 = r0.getQueryParameterNames()
            java.lang.String r1 = "collectionId"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.carouselTitle
            r0.append(r1)
            java.lang.String r1 = ": Product Clicked"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            hi.h$b r0 = hi.C14476c.h(r0)
            return r0
        Lad:
            return r2
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductCarouselDecorator.i():hi.h");
    }

    /* renamed from: a, reason: from getter */
    public final Integer getBannerErrorImageResource() {
        return this.bannerErrorImageResource;
    }

    /* renamed from: b, reason: from getter */
    public final String getBannerResource() {
        return this.bannerResource;
    }

    /* renamed from: c, reason: from getter */
    public final String getCarouselTitle() {
        return this.carouselTitle;
    }

    /* renamed from: d, reason: from getter */
    public final EnumC14984a getCarouselType() {
        return this.carouselType;
    }

    /* renamed from: e, reason: from getter */
    public final Oj.a getLoadingState() {
        return this.loadingState;
    }

    public final Function2<Ok.c, EnumC14984a, Unit> f() {
        return this.productCouponButtonClicked;
    }

    public final List<ProductListDecorator> g() {
        return this.productDecorators;
    }

    /* renamed from: h, reason: from getter */
    public final Object getRetryAction() {
        return this.retryAction;
    }

    public int hashCode() {
        int iHashCode = ((this.carouselType.hashCode() * 31) + this.retryAction.hashCode()) * 31;
        String str = this.carouselTitle;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.personalizedProductType.hashCode()) * 31) + this.productDecorators.hashCode()) * 31) + this.loadingState.hashCode()) * 31;
        String str2 = this.bannerResource;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.bannerErrorImageResource;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.uri;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + this.productCouponButtonClicked.hashCode();
    }

    /* renamed from: k, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final boolean l() {
        return this.productDecorators.isEmpty();
    }

    public String toString() {
        return "ProductCarouselDecorator(carouselType=" + this.carouselType + ", retryAction=" + this.retryAction + ", carouselTitle=" + this.carouselTitle + ", personalizedProductType=" + this.personalizedProductType + ", productDecorators=" + this.productDecorators + ", loadingState=" + this.loadingState + ", bannerResource=" + this.bannerResource + ", bannerErrorImageResource=" + this.bannerErrorImageResource + ", uri=" + this.uri + ", isLoggedIn=" + this.isLoggedIn + ", productCouponButtonClicked=" + this.productCouponButtonClicked + ')';
    }

    public final AbstractC14481h j() {
        return i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductCarouselDecorator(EnumC14984a enumC14984a, Object obj, String str, mk.d dVar, List list, Oj.a aVar, String str2, Integer num, String str3, boolean z10, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function22;
        boolean z11;
        str = (i10 & 4) != 0 ? null : str;
        dVar = (i10 & 8) != 0 ? mk.d.f150121b : dVar;
        list = (i10 & 16) != 0 ? CollectionsKt.m() : list;
        aVar = (i10 & 32) != 0 ? new a.NotLoading(null, 1, null) : aVar;
        str2 = (i10 & 64) != 0 ? null : str2;
        num = (i10 & 128) != 0 ? null : num;
        str3 = (i10 & 256) != 0 ? "" : str3;
        if ((i10 & 512) != 0) {
            function22 = function2;
            z11 = true;
        } else {
            function22 = function2;
            z11 = z10;
        }
        this(enumC14984a, obj, str, dVar, list, aVar, str2, num, str3, z11, function22);
    }
}
