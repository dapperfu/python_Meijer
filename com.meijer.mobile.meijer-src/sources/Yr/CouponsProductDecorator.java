package Yr;

import Co.Image;
import Co.ProductFullDetails;
import Ho.SponsoredData;
import Hr.CouponCountDownStateDecorator;
import Pk.c;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.g;
import vs.InterfaceC17723c;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u00011B\u0099\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J¤\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\b1\u0010>R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\b?\u0010BR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010@\u001a\u0004\bI\u0010BR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010BR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010@\u001a\u0004\bL\u0010BR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bM\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010<\u001a\u0004\b5\u0010>R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010=\u001a\u0004\bG\u0010PR\u001a\u0010\u0017\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bQ\u0010BR\u001a\u0010\u0018\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\b:\u0010SR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bO\u0010VR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010W\u001a\u0004\bT\u0010XR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bE\u0010[R\u001c\u0010!\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010<\u001a\u0004\bC\u0010>R\u001a\u0010\"\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bH\u0010BR\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010<\u001a\u0004\b8\u0010>R\u0014\u0010^\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010B¨\u0006`"}, d2 = {"LYr/a;", "Lvs/c;", "LCo/h;", "product", "", "upc", "thumbnailUrl", "thumbnailDescription", "Lbk/a;", "currentPrice", "", "hasDeposit", "regularPrice", "title", "weight", "shouldShowWeight", "isOutOfStock", "isLowStock", "isOnSale", "hasMPerksOffers", "amountSaved", "", "actualQuantity", "inQtyStepperTransition", "resetStepperState", "Lwl/b$a;", "cartEligibility", "LPk/c;", "couponIdentity", "LHr/e;", "couponCountDownStateDecorator", "LHo/c;", "criteoInfo", "currentPriceDescription", "productContainsTag", "regularPriceDescription", "<init>", "(LCo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbk/a;ZLbk/a;Ljava/lang/String;Lbk/a;ZZZZZLbk/a;DZZLwl/b$a;LPk/c;LHr/e;LHo/c;Lbk/a;ZLbk/a;)V", "u", "(LCo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbk/a;ZLbk/a;Ljava/lang/String;Lbk/a;ZZZZZLbk/a;DZZLwl/b$a;LPk/c;LHr/e;LHo/c;Lbk/a;ZLbk/a;)LYr/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "m", "()LCo/h;", "b", "Ljava/lang/String;", "getUpc", "c", "e", "d", "getThumbnailDescription", "Lbk/a;", "D", "()Lbk/a;", "f", "Z", "k", "()Z", "g", "q", "h", "getTitle", "i", "j", "n", "l", "x", "s", "getHasMPerksOffers", "o", "p", "()D", "r", "Lwl/b$a;", "()Lwl/b$a;", "t", "LPk/c;", "()LPk/c;", "LHr/e;", "()LHr/e;", "v", "LHo/c;", "()LHo/c;", "w", "y", "isEligibleForCart", "z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Yr.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class CouponsProductDecorator implements InterfaceC17723c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasDeposit;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a regularPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a weight;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowWeight;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOutOfStock;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLowStock;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMPerksOffers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amountSaved;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inQtyStepperTransition;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetStepperState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a cartEligibility;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final c couponIdentity;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponCountDownStateDecorator couponCountDownStateDecorator;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final SponsoredData criteoInfo;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentPriceDescription;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean productContainsTag;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a regularPriceDescription;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name */
    public static final int f43247A = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LYr/a$a;", "", "<init>", "()V", "LCo/h;", "product", "", "actualQuantity", "Lwl/b$a;", "cartEligibility", "LYr/a;", "a", "(LCo/h;DLwl/b$a;)LYr/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Yr.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Yr.a$a$a, reason: collision with other inner class name */
        public static final class C0915a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((g) t10).z()), Boolean.valueOf(((g) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Yr.a$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Yr.a$a$c */
        public static final class c<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f43274a;

            public c(Comparator comparator) {
                this.f43274a = comparator;
            }

            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f43274a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((g) t10).Z0(), ((g) t11).Z0());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final Yr.CouponsProductDecorator a(Co.ProductFullDetails r31, double r32, wl.ProductEligibility.a r34) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Yr.CouponsProductDecorator.Companion.a(Co.h, double, wl.b$a):Yr.a");
        }
    }

    public CouponsProductDecorator(ProductFullDetails product, String str, String str2, String str3, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, String str4, AbstractC6392a abstractC6392a3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC6392a abstractC6392a4, double d10, boolean z16, boolean z17, ProductEligibility.a cartEligibility, c cVar, CouponCountDownStateDecorator couponCountDownStateDecorator, SponsoredData sponsoredData, AbstractC6392a abstractC6392a5, boolean z18, AbstractC6392a abstractC6392a6) {
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEligibility, "cartEligibility");
        this.product = product;
        this.upc = str;
        this.thumbnailUrl = str2;
        this.thumbnailDescription = str3;
        this.currentPrice = abstractC6392a;
        this.hasDeposit = z10;
        this.regularPrice = abstractC6392a2;
        this.title = str4;
        this.weight = abstractC6392a3;
        this.shouldShowWeight = z11;
        this.isOutOfStock = z12;
        this.isLowStock = z13;
        this.isOnSale = z14;
        this.hasMPerksOffers = z15;
        this.amountSaved = abstractC6392a4;
        this.actualQuantity = d10;
        this.inQtyStepperTransition = z16;
        this.resetStepperState = z17;
        this.cartEligibility = cartEligibility;
        this.couponIdentity = cVar;
        this.couponCountDownStateDecorator = couponCountDownStateDecorator;
        this.criteoInfo = sponsoredData;
        this.currentPriceDescription = abstractC6392a5;
        this.productContainsTag = z18;
        this.regularPriceDescription = abstractC6392a6;
    }

    public static /* synthetic */ CouponsProductDecorator v(CouponsProductDecorator couponsProductDecorator, ProductFullDetails productFullDetails, String str, String str2, String str3, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, String str4, AbstractC6392a abstractC6392a3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC6392a abstractC6392a4, double d10, boolean z16, boolean z17, ProductEligibility.a aVar, c cVar, CouponCountDownStateDecorator couponCountDownStateDecorator, SponsoredData sponsoredData, AbstractC6392a abstractC6392a5, boolean z18, AbstractC6392a abstractC6392a6, int i10, Object obj) {
        AbstractC6392a abstractC6392a7;
        boolean z19;
        ProductFullDetails productFullDetails2 = (i10 & 1) != 0 ? couponsProductDecorator.product : productFullDetails;
        String str5 = (i10 & 2) != 0 ? couponsProductDecorator.upc : str;
        String str6 = (i10 & 4) != 0 ? couponsProductDecorator.thumbnailUrl : str2;
        String str7 = (i10 & 8) != 0 ? couponsProductDecorator.thumbnailDescription : str3;
        AbstractC6392a abstractC6392a8 = (i10 & 16) != 0 ? couponsProductDecorator.currentPrice : abstractC6392a;
        boolean z20 = (i10 & 32) != 0 ? couponsProductDecorator.hasDeposit : z10;
        AbstractC6392a abstractC6392a9 = (i10 & 64) != 0 ? couponsProductDecorator.regularPrice : abstractC6392a2;
        String str8 = (i10 & 128) != 0 ? couponsProductDecorator.title : str4;
        AbstractC6392a abstractC6392a10 = (i10 & 256) != 0 ? couponsProductDecorator.weight : abstractC6392a3;
        boolean z21 = (i10 & 512) != 0 ? couponsProductDecorator.shouldShowWeight : z11;
        boolean z22 = (i10 & 1024) != 0 ? couponsProductDecorator.isOutOfStock : z12;
        boolean z23 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? couponsProductDecorator.isLowStock : z13;
        boolean z24 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponsProductDecorator.isOnSale : z14;
        boolean z25 = (i10 & 8192) != 0 ? couponsProductDecorator.hasMPerksOffers : z15;
        ProductFullDetails productFullDetails3 = productFullDetails2;
        AbstractC6392a abstractC6392a11 = (i10 & 16384) != 0 ? couponsProductDecorator.amountSaved : abstractC6392a4;
        double d11 = (i10 & 32768) != 0 ? couponsProductDecorator.actualQuantity : d10;
        boolean z26 = (i10 & 65536) != 0 ? couponsProductDecorator.inQtyStepperTransition : z16;
        boolean z27 = (i10 & 131072) != 0 ? couponsProductDecorator.resetStepperState : z17;
        boolean z28 = z26;
        ProductEligibility.a aVar2 = (i10 & 262144) != 0 ? couponsProductDecorator.cartEligibility : aVar;
        c cVar2 = (i10 & 524288) != 0 ? couponsProductDecorator.couponIdentity : cVar;
        CouponCountDownStateDecorator couponCountDownStateDecorator2 = (i10 & 1048576) != 0 ? couponsProductDecorator.couponCountDownStateDecorator : couponCountDownStateDecorator;
        SponsoredData sponsoredData2 = (i10 & 2097152) != 0 ? couponsProductDecorator.criteoInfo : sponsoredData;
        AbstractC6392a abstractC6392a12 = (i10 & 4194304) != 0 ? couponsProductDecorator.currentPriceDescription : abstractC6392a5;
        boolean z29 = (i10 & 8388608) != 0 ? couponsProductDecorator.productContainsTag : z18;
        if ((i10 & 16777216) != 0) {
            z19 = z29;
            abstractC6392a7 = couponsProductDecorator.regularPriceDescription;
        } else {
            abstractC6392a7 = abstractC6392a6;
            z19 = z29;
        }
        return couponsProductDecorator.u(productFullDetails3, str5, str6, str7, abstractC6392a8, z20, abstractC6392a9, str8, abstractC6392a10, z21, z22, z23, z24, z25, abstractC6392a11, d11, z28, z27, aVar2, cVar2, couponCountDownStateDecorator2, sponsoredData2, abstractC6392a12, z19, abstractC6392a7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsProductDecorator)) {
            return false;
        }
        CouponsProductDecorator couponsProductDecorator = (CouponsProductDecorator) other;
        return Intrinsics.e(this.product, couponsProductDecorator.product) && Intrinsics.e(this.upc, couponsProductDecorator.upc) && Intrinsics.e(this.thumbnailUrl, couponsProductDecorator.thumbnailUrl) && Intrinsics.e(this.thumbnailDescription, couponsProductDecorator.thumbnailDescription) && Intrinsics.e(this.currentPrice, couponsProductDecorator.currentPrice) && this.hasDeposit == couponsProductDecorator.hasDeposit && Intrinsics.e(this.regularPrice, couponsProductDecorator.regularPrice) && Intrinsics.e(this.title, couponsProductDecorator.title) && Intrinsics.e(this.weight, couponsProductDecorator.weight) && this.shouldShowWeight == couponsProductDecorator.shouldShowWeight && this.isOutOfStock == couponsProductDecorator.isOutOfStock && this.isLowStock == couponsProductDecorator.isLowStock && this.isOnSale == couponsProductDecorator.isOnSale && this.hasMPerksOffers == couponsProductDecorator.hasMPerksOffers && Intrinsics.e(this.amountSaved, couponsProductDecorator.amountSaved) && Double.compare(this.actualQuantity, couponsProductDecorator.actualQuantity) == 0 && this.inQtyStepperTransition == couponsProductDecorator.inQtyStepperTransition && this.resetStepperState == couponsProductDecorator.resetStepperState && Intrinsics.e(this.cartEligibility, couponsProductDecorator.cartEligibility) && Intrinsics.e(this.couponIdentity, couponsProductDecorator.couponIdentity) && Intrinsics.e(this.couponCountDownStateDecorator, couponsProductDecorator.couponCountDownStateDecorator) && Intrinsics.e(this.criteoInfo, couponsProductDecorator.criteoInfo) && Intrinsics.e(this.currentPriceDescription, couponsProductDecorator.currentPriceDescription) && this.productContainsTag == couponsProductDecorator.productContainsTag && Intrinsics.e(this.regularPriceDescription, couponsProductDecorator.regularPriceDescription);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: D, reason: from getter */
    public AbstractC6392a getCurrentPrice() {
        return this.currentPrice;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: a, reason: from getter */
    public AbstractC6392a getWeight() {
        return this.weight;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: b, reason: from getter */
    public AbstractC6392a getAmountSaved() {
        return this.amountSaved;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: c, reason: from getter */
    public AbstractC6392a getRegularPriceDescription() {
        return this.regularPriceDescription;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: d, reason: from getter */
    public ProductEligibility.a getCartEligibility() {
        return this.cartEligibility;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: e, reason: from getter */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: f, reason: from getter */
    public boolean getShouldShowWeight() {
        return this.shouldShowWeight;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: g, reason: from getter */
    public AbstractC6392a getCurrentPriceDescription() {
        return this.currentPriceDescription;
    }

    @Override // vs.InterfaceC17723c
    public String getTitle() {
        return this.title;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: h, reason: from getter */
    public SponsoredData getCriteoInfo() {
        return this.criteoInfo;
    }

    public int hashCode() {
        int iHashCode = this.product.hashCode() * 31;
        String str = this.upc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbnailUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailDescription;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AbstractC6392a abstractC6392a = this.currentPrice;
        int iHashCode5 = (((iHashCode4 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.hasDeposit)) * 31;
        AbstractC6392a abstractC6392a2 = this.regularPrice;
        int iHashCode6 = (iHashCode5 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.weight;
        int iHashCode8 = (((((((((((iHashCode7 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31) + Boolean.hashCode(this.shouldShowWeight)) * 31) + Boolean.hashCode(this.isOutOfStock)) * 31) + Boolean.hashCode(this.isLowStock)) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.hasMPerksOffers)) * 31;
        AbstractC6392a abstractC6392a4 = this.amountSaved;
        int iHashCode9 = (((((((((iHashCode8 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Boolean.hashCode(this.inQtyStepperTransition)) * 31) + Boolean.hashCode(this.resetStepperState)) * 31) + this.cartEligibility.hashCode()) * 31;
        c cVar = this.couponIdentity;
        int iHashCode10 = (iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        CouponCountDownStateDecorator couponCountDownStateDecorator = this.couponCountDownStateDecorator;
        int iHashCode11 = (iHashCode10 + (couponCountDownStateDecorator == null ? 0 : couponCountDownStateDecorator.hashCode())) * 31;
        SponsoredData sponsoredData = this.criteoInfo;
        int iHashCode12 = (iHashCode11 + (sponsoredData == null ? 0 : sponsoredData.hashCode())) * 31;
        AbstractC6392a abstractC6392a5 = this.currentPriceDescription;
        int iHashCode13 = (((iHashCode12 + (abstractC6392a5 == null ? 0 : abstractC6392a5.hashCode())) * 31) + Boolean.hashCode(this.productContainsTag)) * 31;
        AbstractC6392a abstractC6392a6 = this.regularPriceDescription;
        return iHashCode13 + (abstractC6392a6 != null ? abstractC6392a6.hashCode() : 0);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: i, reason: from getter */
    public double getActualQuantity() {
        return this.actualQuantity;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: j, reason: from getter */
    public boolean getProductContainsTag() {
        return this.productContainsTag;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: k, reason: from getter */
    public boolean getHasDeposit() {
        return this.hasDeposit;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: l, reason: from getter */
    public boolean getResetStepperState() {
        return this.resetStepperState;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: m, reason: from getter */
    public ProductFullDetails getProduct() {
        return this.product;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: n, reason: from getter */
    public boolean getIsOutOfStock() {
        return this.isOutOfStock;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: p, reason: from getter */
    public c getCouponIdentity() {
        return this.couponIdentity;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: q, reason: from getter */
    public AbstractC6392a getRegularPrice() {
        return this.regularPrice;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: r, reason: from getter */
    public boolean getInQtyStepperTransition() {
        return this.inQtyStepperTransition;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: s, reason: from getter */
    public boolean getIsOnSale() {
        return this.isOnSale;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: t, reason: from getter */
    public CouponCountDownStateDecorator getCouponCountDownStateDecorator() {
        return this.couponCountDownStateDecorator;
    }

    public String toString() {
        return "CouponsProductDecorator(product=" + this.product + ", upc=" + this.upc + ", thumbnailUrl=" + this.thumbnailUrl + ", thumbnailDescription=" + this.thumbnailDescription + ", currentPrice=" + this.currentPrice + ", hasDeposit=" + this.hasDeposit + ", regularPrice=" + this.regularPrice + ", title=" + this.title + ", weight=" + this.weight + ", shouldShowWeight=" + this.shouldShowWeight + ", isOutOfStock=" + this.isOutOfStock + ", isLowStock=" + this.isLowStock + ", isOnSale=" + this.isOnSale + ", hasMPerksOffers=" + this.hasMPerksOffers + ", amountSaved=" + this.amountSaved + ", actualQuantity=" + this.actualQuantity + ", inQtyStepperTransition=" + this.inQtyStepperTransition + ", resetStepperState=" + this.resetStepperState + ", cartEligibility=" + this.cartEligibility + ", couponIdentity=" + this.couponIdentity + ", couponCountDownStateDecorator=" + this.couponCountDownStateDecorator + ", criteoInfo=" + this.criteoInfo + ", currentPriceDescription=" + this.currentPriceDescription + ", productContainsTag=" + this.productContainsTag + ", regularPriceDescription=" + this.regularPriceDescription + ')';
    }

    public final CouponsProductDecorator u(ProductFullDetails product, String upc, String thumbnailUrl, String thumbnailDescription, AbstractC6392a currentPrice, boolean hasDeposit, AbstractC6392a regularPrice, String title, AbstractC6392a weight, boolean shouldShowWeight, boolean isOutOfStock, boolean isLowStock, boolean isOnSale, boolean hasMPerksOffers, AbstractC6392a amountSaved, double actualQuantity, boolean inQtyStepperTransition, boolean resetStepperState, ProductEligibility.a cartEligibility, c couponIdentity, CouponCountDownStateDecorator couponCountDownStateDecorator, SponsoredData criteoInfo, AbstractC6392a currentPriceDescription, boolean productContainsTag, AbstractC6392a regularPriceDescription) {
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEligibility, "cartEligibility");
        return new CouponsProductDecorator(product, upc, thumbnailUrl, thumbnailDescription, currentPrice, hasDeposit, regularPrice, title, weight, shouldShowWeight, isOutOfStock, isLowStock, isOnSale, hasMPerksOffers, amountSaved, actualQuantity, inQtyStepperTransition, resetStepperState, cartEligibility, couponIdentity, couponCountDownStateDecorator, criteoInfo, currentPriceDescription, productContainsTag, regularPriceDescription);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: x, reason: from getter */
    public boolean getIsLowStock() {
        return this.isLowStock;
    }

    @Override // vs.InterfaceC17723c
    public boolean o() {
        ProductEligibility.a cartEligibility = getCartEligibility();
        qw.a.INSTANCE.a("Eligibility checked: " + cartEligibility, new Object[0]);
        if (!Intrinsics.e(cartEligibility, ProductEligibility.a.C2660a.f167269a) && !Intrinsics.e(getCartEligibility(), ProductEligibility.a.c.f167271a)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ CouponsProductDecorator(ProductFullDetails productFullDetails, String str, String str2, String str3, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, String str4, AbstractC6392a abstractC6392a3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC6392a abstractC6392a4, double d10, boolean z16, boolean z17, ProductEligibility.a aVar, c cVar, CouponCountDownStateDecorator couponCountDownStateDecorator, SponsoredData sponsoredData, AbstractC6392a abstractC6392a5, boolean z18, AbstractC6392a abstractC6392a6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(productFullDetails, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : abstractC6392a, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : abstractC6392a2, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : abstractC6392a3, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z14, (i10 & 8192) != 0 ? false : z15, (i10 & 16384) != 0 ? null : abstractC6392a4, (i10 & 32768) != 0 ? 0.0d : d10, (i10 & 65536) != 0 ? false : z16, (i10 & 131072) != 0 ? false : z17, (i10 & 262144) != 0 ? ProductEligibility.a.e.f167273a : aVar, (i10 & 524288) != 0 ? null : cVar, (i10 & 1048576) != 0 ? null : couponCountDownStateDecorator, (i10 & 2097152) != 0 ? null : sponsoredData, (i10 & 4194304) != 0 ? null : abstractC6392a5, (i10 & 8388608) == 0 ? z18 : false, (i10 & 16777216) != 0 ? null : abstractC6392a6);
    }
}
