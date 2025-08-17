package vs;

import ak.AbstractC5607a;
import ak.C5608b;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mk.InterfaceC15637a;
import us.C17305C;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010)\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u0010R\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00102\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00104\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u0014\u00108\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010-R\u0014\u0010:\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\"R\u0014\u0010<\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0014\u0010>\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010-R\u0011\u0010?\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010-R\u0011\u0010@\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010-R\u0011\u0010B\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bA\u0010\u001eR\u0011\u0010C\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010-R\u0011\u0010D\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010E\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0011\u0010F\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0013\u0010G\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0013\u0010H\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010-R\u0013\u0010J\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bI\u0010-R\u0013\u0010L\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bK\u0010-R\u0013\u0010N\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bM\u0010-R\u0011\u0010P\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bO\u0010-R\u0011\u0010R\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bQ\u0010\"R\u0011\u0010T\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bS\u0010-R\u0011\u0010U\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010-R\u0011\u0010W\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010-¨\u0006X"}, d2 = {"Lvs/m;", "", "Lmk/h;", "pricing", "", "filterEaches", "", "actualQuantity", "<init>", "(Lmk/h;ZD)V", "Lak/a;", "priceText", "x", "(Lak/a;)Lak/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/h;", "getPricing", "()Lmk/h;", "b", "Z", "getFilterEaches", "()Z", "c", "D", "getActualQuantity", "()D", "d", "Ljava/lang/String;", "getPriceUnit", "priceUnit", "e", "getSellUnit", "sellUnit", "f", "Lak/a;", "s", "()Lak/a;", "regularPrice", "g", "mapPricing", "h", "salePriceMarketing", "i", "discountedPricePerUnit", "j", "w", "isEstimatedUnitPrice", "currentPriceWithQuantity", "m", "estimatedUnitPriceRegular", "l", "estimatedUnitPriceOnSale", "q", "estimatedWeightTextInCartScreen", "displayCurrentValue", "displayCurrentValueCartScreen", "r", "hasDeposit", "currentPrice", "displayCurrentValueWithQuantity", "displayMapPricing", "displayMapPricingNoDeposit", "displaySavedValue", "amountPerUnit", "k", "estimatedUnitPrice", "n", "estimatedUnitSize", "o", "estimatedUnitSizeInCartScreen", "p", "estimatedWeightText", "u", "salePrice", "v", "weightInfo", "currentPriceContentDescription", "t", "regularPriceContentDescription", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.m, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductPriceDecorator {

    /* renamed from: k, reason: collision with root package name */
    public static final int f165065k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.h pricing;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean filterEaches;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String priceUnit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String sellUnit;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a regularPrice;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a mapPricing;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a salePriceMarketing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a discountedPricePerUnit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isEstimatedUnitPrice;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProductPriceDecorator(mk.h r8, boolean r9, double r10) {
        /*
            r7 = this;
            java.lang.String r0 = "pricing"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            r7.<init>()
            r7.pricing = r8
            r7.filterEaches = r9
            r7.actualQuantity = r10
            java.lang.String r10 = r8.z1()
            r11 = 0
            if (r10 != 0) goto L35
            mk.b r10 = r8.getPrice()
            java.lang.String r10 = r10.getUnit()
            if (r10 == 0) goto L30
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.String r10 = r10.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            goto L31
        L30:
            r10 = r11
        L31:
            if (r10 != 0) goto L35
            java.lang.String r10 = ""
        L35:
            r7.priceUnit = r10
            java.lang.String r0 = r8.Z()
            r7.sellUnit = r0
            mk.b r1 = r8.getPrice()
            ak.a r1 = vs.C17618n.b(r1, r0, r9)
            r7.regularPrice = r1
            boolean r1 = r8.getIsMap()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            if (r1 == 0) goto L52
            goto L53
        L52:
            r2 = r11
        L53:
            r1 = 0
            if (r2 == 0) goto L61
            ak.a$a r2 = ak.AbstractC5607a.INSTANCE
            int r3 = us.C17305C.f163321R
            java.lang.Object[] r4 = new java.lang.Object[r1]
            ak.a r2 = r2.d(r3, r4)
            goto L62
        L61:
            r2 = r11
        L62:
            r7.mapPricing = r2
            mk.a r2 = r8.getDiscount()
            if (r2 == 0) goto L83
            java.lang.String r2 = r2.getSalePriceText()
            if (r2 == 0) goto L83
            boolean r3 = kotlin.text.StringsKt.r0(r2)
            if (r3 != 0) goto L77
            goto L78
        L77:
            r2 = r11
        L78:
            if (r2 == 0) goto L83
            ak.a$a r3 = ak.AbstractC5607a.INSTANCE
            ak.a r2 = r3.c(r2)
            if (r2 == 0) goto L83
            goto La1
        L83:
            mk.b r2 = r8.getDiscountedPrice()
            if (r2 == 0) goto La0
            java.lang.String r2 = r2.getPriceText()
            if (r2 == 0) goto La0
            boolean r3 = kotlin.text.StringsKt.r0(r2)
            if (r3 != 0) goto L96
            goto L97
        L96:
            r2 = r11
        L97:
            if (r2 == 0) goto La0
            ak.a$a r3 = ak.AbstractC5607a.INSTANCE
            ak.a r2 = r3.c(r2)
            goto La1
        La0:
            r2 = r11
        La1:
            r7.salePriceMarketing = r2
            double r2 = r7.u()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lae
            goto Lc0
        Lae:
            double r2 = r7.u()
            mk.b r6 = r8.getDiscountedPrice()
            if (r6 == 0) goto Lbc
            java.lang.String r11 = r6.getUnit()
        Lbc:
            ak.a r11 = vs.C17618n.a(r2, r11, r0, r9)
        Lc0:
            r7.discountedPricePerUnit = r11
            r9 = 1
            boolean r10 = kotlin.text.StringsKt.H(r10, r0, r9)
            if (r10 != 0) goto Lde
            boolean r10 = r8.getIsMap()
            if (r10 != 0) goto Lde
            mk.b r8 = r8.getPrice()
            java.lang.Double r8 = r8.getAveragePoundEach()
            boolean r8 = kotlin.jvm.internal.Intrinsics.b(r8, r4)
            if (r8 != 0) goto Lde
            r1 = r9
        Lde:
            r7.isEstimatedUnitPrice = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductPriceDecorator.<init>(mk.h, boolean, double):void");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPriceDecorator)) {
            return false;
        }
        ProductPriceDecorator productPriceDecorator = (ProductPriceDecorator) other;
        return Intrinsics.e(this.pricing, productPriceDecorator.pricing) && this.filterEaches == productPriceDecorator.filterEaches && Double.compare(this.actualQuantity, productPriceDecorator.actualQuantity) == 0;
    }

    private final AbstractC5607a d() {
        AbstractC5607a abstractC5607a = this.salePriceMarketing;
        if (abstractC5607a == null && (abstractC5607a = this.discountedPricePerUnit) == null) {
            abstractC5607a = this.regularPrice;
        }
        return Double.valueOf(this.actualQuantity % ((double) 1)).equals(Double.valueOf(0.0d)) ? AbstractC5607a.INSTANCE.d(C17305C.f163327b, Integer.valueOf((int) this.actualQuantity), abstractC5607a) : AbstractC5607a.INSTANCE.d(C17305C.f163326a, Double.valueOf(this.actualQuantity), abstractC5607a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final double m() {
        /*
            r7 = this;
            mk.h r0 = r7.pricing
            mk.b r0 = r0.getPrice()
            double r0 = r0.getValue()
            mk.h r2 = r7.pricing
            mk.b r2 = r2.getPrice()
            java.lang.Double r2 = r2.getAveragePoundEach()
            if (r2 == 0) goto L28
            double r3 = r2.doubleValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L21
            r2 = 0
        L21:
            if (r2 == 0) goto L28
            double r2 = r2.doubleValue()
            goto L2a
        L28:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L2a:
            double r0 = r0 / r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductPriceDecorator.m():double");
    }

    private final AbstractC5607a x(AbstractC5607a priceText) {
        AbstractC5607a abstractC5607aD;
        return (this.pricing.getDepositPrice() == null || (abstractC5607aD = AbstractC5607a.INSTANCE.d(C17305C.f163348w, priceText)) == null) ? priceText : abstractC5607aD;
    }

    public final AbstractC5607a a() {
        AbstractC5607a abstractC5607aD;
        InterfaceC15637a discount = this.pricing.getDiscount();
        if (discount == null) {
            return null;
        }
        String str = this.priceUnit;
        String str2 = StringsKt.r0(str) ? null : str;
        return (str2 == null || (abstractC5607aD = AbstractC5607a.INSTANCE.d(C17305C.f163333h, Double.valueOf(discount.getValue()), str2)) == null) ? AbstractC5607a.INSTANCE.d(C17305C.f163331f, Double.valueOf(discount.getValue())) : abstractC5607aD;
    }

    public final AbstractC5607a b() {
        AbstractC5607a abstractC5607a = this.salePriceMarketing;
        if (abstractC5607a != null) {
            return abstractC5607a;
        }
        AbstractC5607a abstractC5607a2 = this.discountedPricePerUnit;
        return abstractC5607a2 == null ? this.regularPrice : abstractC5607a2;
    }

    public final AbstractC5607a c() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return companion.d(C17305C.f163312I, this.pricing.getIsSale() ? companion.d(C17305C.f163317N, new Object[0]) : companion.a(), h());
    }

    public final AbstractC5607a h() {
        AbstractC5607a abstractC5607a = this.mapPricing;
        return abstractC5607a == null ? e() : abstractC5607a;
    }

    public int hashCode() {
        return (((this.pricing.hashCode() * 31) + Boolean.hashCode(this.filterEaches)) * 31) + Double.hashCode(this.actualQuantity);
    }

    public final AbstractC5607a i() {
        AbstractC5607a abstractC5607a = this.mapPricing;
        return abstractC5607a == null ? b() : abstractC5607a;
    }

    public final AbstractC5607a j() {
        AbstractC5607a abstractC5607aD;
        InterfaceC15637a discount = this.pricing.getDiscount();
        String str = null;
        if (discount == null) {
            return null;
        }
        String strZ1 = this.pricing.z1();
        if (strZ1 == null || !(!StringsKt.r0(strZ1)) || StringsKt.H(strZ1, "ea", true)) {
            strZ1 = null;
        }
        if (strZ1 != null && (abstractC5607aD = AbstractC5607a.INSTANCE.d(C17305C.f163335j, Double.valueOf(discount.getValue()), strZ1)) != null) {
            return abstractC5607aD;
        }
        String strZ = this.pricing.Z();
        if (!StringsKt.r0(strZ) && !StringsKt.H(strZ, "ea", true)) {
            str = strZ;
        }
        return str != null ? AbstractC5607a.INSTANCE.d(C17305C.f163335j, Double.valueOf(discount.getValue()), str) : AbstractC5607a.INSTANCE.d(C17305C.f163334i, Double.valueOf(discount.getValue()));
    }

    public final AbstractC5607a k() {
        if (this.isEstimatedUnitPrice) {
            return AbstractC5607a.INSTANCE.d(C17305C.f163351z, new DecimalFormat("$#,##0.00").format(this.pricing.getIsSale() ? l() : m()), this.priceUnit);
        }
        return null;
    }

    public final AbstractC5607a n() {
        if (!this.isEstimatedUnitPrice || this.pricing.getPrice().getAveragePoundEach() == null) {
            return null;
        }
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = C17305C.f163346u;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        Double averagePoundEach = this.pricing.getPrice().getAveragePoundEach();
        return companion.d(i10, decimalFormat.format(averagePoundEach != null ? averagePoundEach.doubleValue() : 0.0d), this.priceUnit, this.sellUnit);
    }

    public final AbstractC5607a o() {
        if (!this.isEstimatedUnitPrice || this.pricing.getPrice().getAveragePoundEach() == null) {
            return null;
        }
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = C17305C.f163345t;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        Double averagePoundEach = this.pricing.getPrice().getAveragePoundEach();
        return companion.d(i10, decimalFormat.format(averagePoundEach != null ? averagePoundEach.doubleValue() : 0.0d), this.priceUnit);
    }

    public final boolean r() {
        mk.b depositPrice = this.pricing.getDepositPrice();
        return depositPrice != null && depositPrice.getValue() > 0.0d;
    }

    /* renamed from: s, reason: from getter */
    public final AbstractC5607a getRegularPrice() {
        return this.regularPrice;
    }

    public final AbstractC5607a t() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return companion.d(C17305C.f163312I, this.pricing.getIsSale() ? companion.d(C17305C.f163310G, new Object[0]) : companion.a(), this.regularPrice);
    }

    public String toString() {
        return "ProductPriceDecorator(pricing=" + this.pricing + ", filterEaches=" + this.filterEaches + ", actualQuantity=" + this.actualQuantity + ')';
    }

    public final double u() {
        mk.b discountedPrice = this.pricing.getDiscountedPrice();
        if (discountedPrice != null) {
            return discountedPrice.getValue();
        }
        return 0.0d;
    }

    public final AbstractC5607a v() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = C17305C.f163325V;
        Object objK = k();
        if (objK == null) {
            objK = "";
        }
        AbstractC5607a abstractC5607aN = n();
        return companion.d(i10, objK, abstractC5607aN != null ? abstractC5607aN : "");
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsEstimatedUnitPrice() {
        return this.isEstimatedUnitPrice;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final double l() {
        /*
            r7 = this;
            double r0 = r7.u()
            mk.h r2 = r7.pricing
            mk.b r2 = r2.getPrice()
            java.lang.Double r2 = r2.getAveragePoundEach()
            if (r2 == 0) goto L22
            double r3 = r2.doubleValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1b
            r2 = 0
        L1b:
            if (r2 == 0) goto L22
            double r2 = r2.doubleValue()
            goto L24
        L22:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L24:
            double r0 = r0 / r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductPriceDecorator.l():double");
    }

    private final AbstractC5607a q() {
        if (k() != null && o() != null) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = C17305C.f163325V;
            AbstractC5607a abstractC5607aK = k();
            if (abstractC5607aK == null) {
                abstractC5607aK = companion.a();
            }
            AbstractC5607a abstractC5607aO = o();
            if (abstractC5607aO == null) {
                abstractC5607aO = companion.a();
            }
            return companion.d(i10, abstractC5607aK, abstractC5607aO);
        }
        return AbstractC5607a.INSTANCE.a();
    }

    public final AbstractC5607a e() {
        return x(b());
    }

    public final AbstractC5607a f() {
        if (C5608b.a(p())) {
            return x(b());
        }
        return q();
    }

    public final AbstractC5607a g() {
        return x(d());
    }

    public final AbstractC5607a p() {
        if (k() != null && n() != null) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = C17305C.f163325V;
            AbstractC5607a abstractC5607aK = k();
            if (abstractC5607aK == null) {
                abstractC5607aK = companion.a();
            }
            AbstractC5607a abstractC5607aN = n();
            if (abstractC5607aN == null) {
                abstractC5607aN = companion.a();
            }
            return companion.d(i10, abstractC5607aK, abstractC5607aN);
        }
        return AbstractC5607a.INSTANCE.a();
    }

    public /* synthetic */ ProductPriceDecorator(mk.h hVar, boolean z10, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
