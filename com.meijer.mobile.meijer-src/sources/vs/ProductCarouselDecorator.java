package vs;

import ii.AbstractC14761h;
import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u00126\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b\b\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b4\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b,\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010>\u001a\u0004\b(\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u0010\"R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\b\u0014\u00103RG\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u001a0\u00158\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b8\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b@\u0010 R\u0011\u0010F\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bB\u00103¨\u0006G"}, d2 = {"Lvs/d;", "", "Lkk/a;", "carouselType", "retryAction", "", "carouselTitle", "", "isWhiteLabelCarousel", "Lnk/d;", "personalizedProductType", "", "Lvs/f;", "productDecorators", "LPj/a;", "loadingState", "bannerResource", "", "bannerErrorImageResource", "uri", "isLoggedIn", "Lkotlin/Function2;", "LPk/c;", "Lkotlin/ParameterName;", "name", "coupon", "", "productCouponButtonClicked", "<init>", "(Lkk/a;Ljava/lang/Object;Ljava/lang/String;ZLnk/d;Ljava/util/List;LPj/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "Lii/h;", "i", "()Lii/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk/a;", "d", "()Lkk/a;", "b", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "c", "Ljava/lang/String;", "Z", "()Z", "e", "Lnk/d;", "getPersonalizedProductType", "()Lnk/d;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "LPj/a;", "()LPj/a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "j", "k", "l", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "trackingState", "isCarouselEmpty", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductCarouselDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC15218a carouselType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object retryAction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carouselTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWhiteLabelCarousel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.d personalizedProductType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductListDecorator> productDecorators;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pj.a loadingState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerResource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bannerErrorImageResource;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uri;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Pk.c, EnumC15218a, Unit> productCouponButtonClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCarouselDecorator(EnumC15218a carouselType, Object retryAction, String str, boolean z10, nk.d personalizedProductType, List<ProductListDecorator> productDecorators, Pj.a loadingState, String str2, Integer num, String str3, boolean z11, Function2<? super Pk.c, ? super EnumC15218a, Unit> productCouponButtonClicked) {
        Intrinsics.j(carouselType, "carouselType");
        Intrinsics.j(retryAction, "retryAction");
        Intrinsics.j(personalizedProductType, "personalizedProductType");
        Intrinsics.j(productDecorators, "productDecorators");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(productCouponButtonClicked, "productCouponButtonClicked");
        this.carouselType = carouselType;
        this.retryAction = retryAction;
        this.carouselTitle = str;
        this.isWhiteLabelCarousel = z10;
        this.personalizedProductType = personalizedProductType;
        this.productDecorators = productDecorators;
        this.loadingState = loadingState;
        this.bannerResource = str2;
        this.bannerErrorImageResource = num;
        this.uri = str3;
        this.isLoggedIn = z11;
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
        return this.carouselType == productCarouselDecorator.carouselType && Intrinsics.e(this.retryAction, productCarouselDecorator.retryAction) && Intrinsics.e(this.carouselTitle, productCarouselDecorator.carouselTitle) && this.isWhiteLabelCarousel == productCarouselDecorator.isWhiteLabelCarousel && this.personalizedProductType == productCarouselDecorator.personalizedProductType && Intrinsics.e(this.productDecorators, productCarouselDecorator.productDecorators) && Intrinsics.e(this.loadingState, productCarouselDecorator.loadingState) && Intrinsics.e(this.bannerResource, productCarouselDecorator.bannerResource) && Intrinsics.e(this.bannerErrorImageResource, productCarouselDecorator.bannerErrorImageResource) && Intrinsics.e(this.uri, productCarouselDecorator.uri) && this.isLoggedIn == productCarouselDecorator.isLoggedIn && Intrinsics.e(this.productCouponButtonClicked, productCarouselDecorator.productCouponButtonClicked);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ii.AbstractC14761h i() {
        /*
            r9 = this;
            java.lang.String r0 = r9.uri
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            r0 = r1
        L7:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.util.Set r2 = r0.getQueryParameterNames()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto Ldd
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            goto Ldd
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
            java.lang.String r4 = ": Product Clicked"
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L70
            java.lang.String r2 = "buyAgain"
            boolean r2 = kotlin.text.StringsKt.d0(r1, r2, r6, r5, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = "Buy Again: Product Clicked"
            ii.h$b r2 = ii.C14756c.h(r2)
            goto L71
        L43:
            java.lang.String r2 = "favoritesOnSale"
            boolean r2 = kotlin.text.StringsKt.d0(r1, r2, r6, r5, r3)
            if (r2 == 0) goto L52
            java.lang.String r2 = "Favorites on Sale: Product Clicked"
            ii.h$b r2 = ii.C14756c.h(r2)
            goto L71
        L52:
            java.lang.String r2 = "meijerRecommendations"
            boolean r2 = kotlin.text.StringsKt.d0(r1, r2, r6, r5, r3)
            if (r2 == 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r9.carouselTitle
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            ii.h$b r2 = ii.C14756c.h(r2)
            goto L71
        L70:
            r2 = r3
        L71:
            java.util.Set r7 = r0.getQueryParameterNames()
            java.lang.String r8 = "department"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto La9
            java.lang.String r7 = "L2-10778"
            boolean r7 = kotlin.text.StringsKt.d0(r1, r7, r6, r5, r3)
            if (r7 == 0) goto L8c
            java.lang.String r1 = "Produce-L2-10778: Product Clicked"
            ii.h$b r2 = ii.C14756c.h(r1)
            goto La9
        L8c:
            java.lang.String r7 = "L2-9974"
            boolean r7 = kotlin.text.StringsKt.d0(r1, r7, r6, r5, r3)
            if (r7 == 0) goto L9b
            java.lang.String r1 = "Dairy-L2-9974: Product Clicked"
            ii.h$b r2 = ii.C14756c.h(r1)
            goto La9
        L9b:
            java.lang.String r7 = "L2-9980"
            boolean r1 = kotlin.text.StringsKt.d0(r1, r7, r6, r5, r3)
            if (r1 == 0) goto La9
            java.lang.String r1 = "Snacks-L2-9980: Product Clicked"
            ii.h$b r2 = ii.C14756c.h(r1)
        La9:
            java.util.Set r1 = r0.getQueryParameterNames()
            java.lang.String r3 = "collectionId"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto Lc7
            java.util.Set r0 = r0.getQueryParameterNames()
            java.lang.String r1 = "id"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lc7
            boolean r0 = r9.isWhiteLabelCarousel
            if (r0 == 0) goto Lc6
            goto Lc7
        Lc6:
            return r2
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.carouselTitle
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            ii.h$b r0 = ii.C14756c.h(r0)
            return r0
        Ldd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductCarouselDecorator.i():ii.h");
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
    public final EnumC15218a getCarouselType() {
        return this.carouselType;
    }

    /* renamed from: e, reason: from getter */
    public final Pj.a getLoadingState() {
        return this.loadingState;
    }

    public final Function2<Pk.c, EnumC15218a, Unit> f() {
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
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isWhiteLabelCarousel)) * 31) + this.personalizedProductType.hashCode()) * 31) + this.productDecorators.hashCode()) * 31) + this.loadingState.hashCode()) * 31;
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
        return "ProductCarouselDecorator(carouselType=" + this.carouselType + ", retryAction=" + this.retryAction + ", carouselTitle=" + this.carouselTitle + ", isWhiteLabelCarousel=" + this.isWhiteLabelCarousel + ", personalizedProductType=" + this.personalizedProductType + ", productDecorators=" + this.productDecorators + ", loadingState=" + this.loadingState + ", bannerResource=" + this.bannerResource + ", bannerErrorImageResource=" + this.bannerErrorImageResource + ", uri=" + this.uri + ", isLoggedIn=" + this.isLoggedIn + ", productCouponButtonClicked=" + this.productCouponButtonClicked + ')';
    }

    public final AbstractC14761h j() {
        return i();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductCarouselDecorator(kk.EnumC15218a r17, java.lang.Object r18, java.lang.String r19, boolean r20, nk.d r21, java.util.List r22, Pj.a r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, boolean r27, kotlin.jvm.functions.Function2 r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L9
            r6 = r2
            goto Lb
        L9:
            r6 = r19
        Lb:
            r1 = r0 & 8
            if (r1 == 0) goto L12
            r1 = 0
            r7 = r1
            goto L14
        L12:
            r7 = r20
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            nk.d r1 = nk.d.f152479b
            r8 = r1
            goto L1e
        L1c:
            r8 = r21
        L1e:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            r9 = r1
            goto L2a
        L28:
            r9 = r22
        L2a:
            r1 = r0 & 64
            r3 = 1
            if (r1 == 0) goto L36
            Pj.a$c r1 = new Pj.a$c
            r1.<init>(r2, r3, r2)
            r10 = r1
            goto L38
        L36:
            r10 = r23
        L38:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3e
            r11 = r2
            goto L40
        L3e:
            r11 = r24
        L40:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L46
            r12 = r2
            goto L48
        L46:
            r12 = r25
        L48:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L50
            java.lang.String r1 = ""
            r13 = r1
            goto L52
        L50:
            r13 = r26
        L52:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L60
            r14 = r3
            r4 = r17
            r5 = r18
            r15 = r28
            r3 = r16
            goto L6a
        L60:
            r14 = r27
            r3 = r16
            r4 = r17
            r5 = r18
            r15 = r28
        L6a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductCarouselDecorator.<init>(kk.a, java.lang.Object, java.lang.String, boolean, nk.d, java.util.List, Pj.a, java.lang.String, java.lang.Integer, java.lang.String, boolean, kotlin.jvm.functions.Function2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
