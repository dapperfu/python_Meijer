package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.Image;
import Co.ProductFullDetails;
import Ho.SponsoredData;
import Hr.CouponCountDownStateDecorator;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.InterfaceC15960a;
import sp.ProductState;
import vs.InterfaceC17723c;
import wl.CartEntry;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bR\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0001,BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010 Jê\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0014\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010O\u001a\u0004\bA\u0010PR\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010>R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010<\u001a\u0004\bK\u0010>R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b5\u0010VR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b?\u0010YR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010Z\u001a\u0004\b;\u0010[R\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\bE\u0010>R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b3\u0010[R\u0016\u0010]\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ZR\u0014\u0010_\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010ZR\u001a\u0010a\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010Z\u001a\u0004\bO\u0010[R\u001a\u0010b\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010Z\u001a\u0004\bW\u0010[R\u001c\u0010d\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010Z\u001a\u0004\b0\u0010[R\u001a\u0010f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010<\u001a\u0004\b9\u0010>R\u0016\u0010h\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010ZR\u0016\u0010j\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010ZR\u001a\u0010l\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010Z\u001a\u0004\b,\u0010[R\u001a\u0010m\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bQ\u0010>R\u001c\u0010p\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u00101\u001a\u0004\bo\u0010$R\u001c\u0010r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u00101\u001a\u0004\b7\u0010$R\u001c\u0010u\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u00101\u001a\u0004\bt\u0010$R\u001c\u0010x\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u00101\u001a\u0004\bw\u0010$R\u001a\u0010z\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\by\u0010<\u001a\u0004\bG\u0010>R\u001c\u0010\u007f\u001a\u0004\u0018\u00010{8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b\\\u0010~R!\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\bT\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010>¨\u0006\u0087\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "Lvs/c;", "LCo/h;", "product", "", PreferencesHelper.PREF_ID, "name", "imageUrl", "description", "unit", "", "isOnSale", "isLowStock", "Lnk/b;", "currentItemPrice", "regularItemPrice", "Lnk/a;", "savedPrice", "", "qtyIncrement", "actualQuantity", "inQtyStepperTransition", "resetStepperState", "Lwl/b$a;", "cartEligibility", "LHo/c;", "criteoInfo", "Lbk/a;", "currentPriceDescription", "productContainsTag", "regularPriceDescription", "<init>", "(LCo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLnk/b;Lnk/b;Lnk/a;Ljava/lang/Double;DZZLwl/b$a;LHo/c;Lbk/a;ZLbk/a;)V", "u", "(LCo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLnk/b;Lnk/b;Lnk/a;Ljava/lang/Double;DZZLwl/b$a;LHo/c;Lbk/a;ZLbk/a;)Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "m", "()LCo/h;", "b", "Ljava/lang/String;", "getId", "c", "getName", "d", "getImageUrl", "e", "getDescription", "f", "getUnit", "g", "Z", "s", "()Z", "h", "x", "i", "Lnk/b;", "getCurrentItemPrice", "()Lnk/b;", "j", "getRegularItemPrice", "k", "Lnk/a;", "getSavedPrice", "()Lnk/a;", "l", "Ljava/lang/Double;", "getQtyIncrement", "()Ljava/lang/Double;", "D", "()D", "n", "r", "o", "p", "Lwl/b$a;", "()Lwl/b$a;", "q", "LHo/c;", "()LHo/c;", "Lbk/a;", "()Lbk/a;", "t", "mapPricing", "v", "currentPriceValue", "w", "currentPrice", "regularPrice", "y", "amountSaved", "z", "shouldShowWeight", "A", "estimateUnitPrice", "B", "estimatedUnitSize", "C", "weight", "isOutOfStock", "E", "getUpc", "upc", "F", "thumbnailUrl", "G", "getThumbnailDescription", "thumbnailDescription", "H", "getTitle", "title", "I", "hasDeposit", "LHr/e;", "J", "LHr/e;", "()LHr/e;", "couponCountDownStateDecorator", "LPk/c;", "K", "LPk/c;", "()LPk/c;", "couponIdentity", "isEligibleForCart", "L", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.o2, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class SuggestedProductCarouselDecorator implements InterfaceC17723c {

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: M, reason: collision with root package name */
    public static final int f108526M = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a estimateUnitPrice;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a estimatedUnitSize;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a weight;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final boolean isOutOfStock;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final String upc;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final String thumbnailUrl;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final String thumbnailDescription;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final boolean hasDeposit;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final CouponCountDownStateDecorator couponCountDownStateDecorator;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Pk.c couponIdentity;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLowStock;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b currentItemPrice;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b regularItemPrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC15960a savedPrice;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double qtyIncrement;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inQtyStepperTransition;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetStepperState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a cartEligibility;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final SponsoredData criteoInfo;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentPriceDescription;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean productContainsTag;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a regularPriceDescription;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a mapPricing;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a currentPriceValue;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a currentPrice;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a regularPrice;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a amountSaved;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowWeight;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/o2$a;", "", "<init>", "()V", "Lsp/b;", "LCo/h;", "productState", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "a", "(Lsp/b;)Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.o2$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SuggestedProductCarouselDecorator a(ProductState<ProductFullDetails> productState) {
            Intrinsics.j(productState, "productState");
            ProductFullDetails productFullDetails = (ProductFullDetails) productState.g();
            String code = productState.getCode();
            String name = ((ProductFullDetails) productState.g()).getName();
            String url = ((Image) CollectionsKt.s0(((ProductFullDetails) productState.g()).j())).getUrl();
            String description = ((ProductFullDetails) productState.g()).getDescription();
            String unitCode = ((ProductFullDetails) productState.g()).getUnitCode();
            boolean z10 = (((ProductFullDetails) productState.g()).getDiscount() == null || ((ProductFullDetails) productState.g()).getDiscountedPrice() == null || ((ProductFullDetails) productState.g()).getIsMap()) ? false : true;
            boolean zC = ((ProductFullDetails) productState.g()).getStockInfo().c();
            nk.b price = ((ProductFullDetails) productState.g()).getPrice();
            nk.b bVarD = ((ProductFullDetails) productState.g()).D();
            InterfaceC15960a discount = ((ProductFullDetails) productState.g()).getDiscount();
            double qtyIncrement = ((ProductFullDetails) productState.g()).getQtyIncrement();
            CartEntry cartEntry = productState.getCartEntry();
            return new SuggestedProductCarouselDecorator(productFullDetails, code, name, url, description, unitCode, z10, zC, bVarD, price, discount, Double.valueOf(qtyIncrement), cartEntry != null ? cartEntry.getQuantity() : 0.0d, false, false, productState.getEligibility().k(), ((ProductFullDetails) productState.g()).getBeaconInfo(), null, false, null, 942080, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SuggestedProductCarouselDecorator(Co.ProductFullDetails r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, nk.b r26, nk.b r27, nk.InterfaceC15960a r28, java.lang.Double r29, double r30, boolean r32, boolean r33, wl.ProductEligibility.a r34, Ho.SponsoredData r35, bk.AbstractC6392a r36, boolean r37, bk.AbstractC6392a r38) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator.<init>(Co.h, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, nk.b, nk.b, nk.a, java.lang.Double, double, boolean, boolean, wl.b$a, Ho.c, bk.a, boolean, bk.a):void");
    }

    public static /* synthetic */ SuggestedProductCarouselDecorator v(SuggestedProductCarouselDecorator suggestedProductCarouselDecorator, ProductFullDetails productFullDetails, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, nk.b bVar, nk.b bVar2, InterfaceC15960a interfaceC15960a, Double d10, double d11, boolean z12, boolean z13, ProductEligibility.a aVar, SponsoredData sponsoredData, AbstractC6392a abstractC6392a, boolean z14, AbstractC6392a abstractC6392a2, int i10, Object obj) {
        AbstractC6392a abstractC6392a3;
        boolean z15;
        ProductFullDetails productFullDetails2 = (i10 & 1) != 0 ? suggestedProductCarouselDecorator.product : productFullDetails;
        String str6 = (i10 & 2) != 0 ? suggestedProductCarouselDecorator.id : str;
        String str7 = (i10 & 4) != 0 ? suggestedProductCarouselDecorator.name : str2;
        String str8 = (i10 & 8) != 0 ? suggestedProductCarouselDecorator.imageUrl : str3;
        String str9 = (i10 & 16) != 0 ? suggestedProductCarouselDecorator.description : str4;
        String str10 = (i10 & 32) != 0 ? suggestedProductCarouselDecorator.unit : str5;
        boolean z16 = (i10 & 64) != 0 ? suggestedProductCarouselDecorator.isOnSale : z10;
        boolean z17 = (i10 & 128) != 0 ? suggestedProductCarouselDecorator.isLowStock : z11;
        nk.b bVar3 = (i10 & 256) != 0 ? suggestedProductCarouselDecorator.currentItemPrice : bVar;
        nk.b bVar4 = (i10 & 512) != 0 ? suggestedProductCarouselDecorator.regularItemPrice : bVar2;
        InterfaceC15960a interfaceC15960a2 = (i10 & 1024) != 0 ? suggestedProductCarouselDecorator.savedPrice : interfaceC15960a;
        Double d12 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedProductCarouselDecorator.qtyIncrement : d10;
        double d13 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedProductCarouselDecorator.actualQuantity : d11;
        ProductFullDetails productFullDetails3 = productFullDetails2;
        boolean z18 = (i10 & 8192) != 0 ? suggestedProductCarouselDecorator.inQtyStepperTransition : z12;
        boolean z19 = (i10 & 16384) != 0 ? suggestedProductCarouselDecorator.resetStepperState : z13;
        ProductEligibility.a aVar2 = (i10 & 32768) != 0 ? suggestedProductCarouselDecorator.cartEligibility : aVar;
        SponsoredData sponsoredData2 = (i10 & 65536) != 0 ? suggestedProductCarouselDecorator.criteoInfo : sponsoredData;
        AbstractC6392a abstractC6392a4 = (i10 & 131072) != 0 ? suggestedProductCarouselDecorator.currentPriceDescription : abstractC6392a;
        boolean z20 = (i10 & 262144) != 0 ? suggestedProductCarouselDecorator.productContainsTag : z14;
        if ((i10 & 524288) != 0) {
            z15 = z20;
            abstractC6392a3 = suggestedProductCarouselDecorator.regularPriceDescription;
        } else {
            abstractC6392a3 = abstractC6392a2;
            z15 = z20;
        }
        return suggestedProductCarouselDecorator.u(productFullDetails3, str6, str7, str8, str9, str10, z16, z17, bVar3, bVar4, interfaceC15960a2, d12, d13, z18, z19, aVar2, sponsoredData2, abstractC6392a4, z15, abstractC6392a3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedProductCarouselDecorator)) {
            return false;
        }
        SuggestedProductCarouselDecorator suggestedProductCarouselDecorator = (SuggestedProductCarouselDecorator) other;
        return Intrinsics.e(this.product, suggestedProductCarouselDecorator.product) && Intrinsics.e(this.id, suggestedProductCarouselDecorator.id) && Intrinsics.e(this.name, suggestedProductCarouselDecorator.name) && Intrinsics.e(this.imageUrl, suggestedProductCarouselDecorator.imageUrl) && Intrinsics.e(this.description, suggestedProductCarouselDecorator.description) && Intrinsics.e(this.unit, suggestedProductCarouselDecorator.unit) && this.isOnSale == suggestedProductCarouselDecorator.isOnSale && this.isLowStock == suggestedProductCarouselDecorator.isLowStock && Intrinsics.e(this.currentItemPrice, suggestedProductCarouselDecorator.currentItemPrice) && Intrinsics.e(this.regularItemPrice, suggestedProductCarouselDecorator.regularItemPrice) && Intrinsics.e(this.savedPrice, suggestedProductCarouselDecorator.savedPrice) && Intrinsics.e(this.qtyIncrement, suggestedProductCarouselDecorator.qtyIncrement) && Double.compare(this.actualQuantity, suggestedProductCarouselDecorator.actualQuantity) == 0 && this.inQtyStepperTransition == suggestedProductCarouselDecorator.inQtyStepperTransition && this.resetStepperState == suggestedProductCarouselDecorator.resetStepperState && Intrinsics.e(this.cartEligibility, suggestedProductCarouselDecorator.cartEligibility) && Intrinsics.e(this.criteoInfo, suggestedProductCarouselDecorator.criteoInfo) && Intrinsics.e(this.currentPriceDescription, suggestedProductCarouselDecorator.currentPriceDescription) && this.productContainsTag == suggestedProductCarouselDecorator.productContainsTag && Intrinsics.e(this.regularPriceDescription, suggestedProductCarouselDecorator.regularPriceDescription);
    }

    public int hashCode() {
        int iHashCode = ((this.product.hashCode() * 31) + this.id.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unit;
        int iHashCode5 = (((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.isLowStock)) * 31) + this.currentItemPrice.hashCode()) * 31) + this.regularItemPrice.hashCode()) * 31;
        InterfaceC15960a interfaceC15960a = this.savedPrice;
        int iHashCode6 = (iHashCode5 + (interfaceC15960a == null ? 0 : interfaceC15960a.hashCode())) * 31;
        Double d10 = this.qtyIncrement;
        int iHashCode7 = (((((((((iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Boolean.hashCode(this.inQtyStepperTransition)) * 31) + Boolean.hashCode(this.resetStepperState)) * 31) + this.cartEligibility.hashCode()) * 31;
        SponsoredData sponsoredData = this.criteoInfo;
        int iHashCode8 = (iHashCode7 + (sponsoredData == null ? 0 : sponsoredData.hashCode())) * 31;
        AbstractC6392a abstractC6392a = this.currentPriceDescription;
        int iHashCode9 = (((iHashCode8 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.productContainsTag)) * 31;
        AbstractC6392a abstractC6392a2 = this.regularPriceDescription;
        return iHashCode9 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0);
    }

    public String toString() {
        return "SuggestedProductCarouselDecorator(product=" + this.product + ", id=" + this.id + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", description=" + this.description + ", unit=" + this.unit + ", isOnSale=" + this.isOnSale + ", isLowStock=" + this.isLowStock + ", currentItemPrice=" + this.currentItemPrice + ", regularItemPrice=" + this.regularItemPrice + ", savedPrice=" + this.savedPrice + ", qtyIncrement=" + this.qtyIncrement + ", actualQuantity=" + this.actualQuantity + ", inQtyStepperTransition=" + this.inQtyStepperTransition + ", resetStepperState=" + this.resetStepperState + ", cartEligibility=" + this.cartEligibility + ", criteoInfo=" + this.criteoInfo + ", currentPriceDescription=" + this.currentPriceDescription + ", productContainsTag=" + this.productContainsTag + ", regularPriceDescription=" + this.regularPriceDescription + ')';
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
    public Pk.c getCouponIdentity() {
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

    public final SuggestedProductCarouselDecorator u(ProductFullDetails product, String id2, String name, String imageUrl, String description, String unit, boolean isOnSale, boolean isLowStock, nk.b currentItemPrice, nk.b regularItemPrice, InterfaceC15960a savedPrice, Double qtyIncrement, double actualQuantity, boolean inQtyStepperTransition, boolean resetStepperState, ProductEligibility.a cartEligibility, SponsoredData criteoInfo, AbstractC6392a currentPriceDescription, boolean productContainsTag, AbstractC6392a regularPriceDescription) {
        Intrinsics.j(product, "product");
        Intrinsics.j(id2, "id");
        Intrinsics.j(currentItemPrice, "currentItemPrice");
        Intrinsics.j(regularItemPrice, "regularItemPrice");
        Intrinsics.j(cartEligibility, "cartEligibility");
        return new SuggestedProductCarouselDecorator(product, id2, name, imageUrl, description, unit, isOnSale, isLowStock, currentItemPrice, regularItemPrice, savedPrice, qtyIncrement, actualQuantity, inQtyStepperTransition, resetStepperState, cartEligibility, criteoInfo, currentPriceDescription, productContainsTag, regularPriceDescription);
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

    public /* synthetic */ SuggestedProductCarouselDecorator(ProductFullDetails productFullDetails, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, nk.b bVar, nk.b bVar2, InterfaceC15960a interfaceC15960a, Double d10, double d11, boolean z12, boolean z13, ProductEligibility.a aVar, SponsoredData sponsoredData, AbstractC6392a abstractC6392a, boolean z14, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(productFullDetails, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11, bVar, bVar2, (i10 & 1024) != 0 ? null : interfaceC15960a, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : d10, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0.0d : d11, (i10 & 8192) != 0 ? false : z12, (i10 & 16384) != 0 ? false : z13, (32768 & i10) != 0 ? ProductEligibility.a.e.f167273a : aVar, (65536 & i10) != 0 ? null : sponsoredData, (131072 & i10) != 0 ? null : abstractC6392a, (262144 & i10) != 0 ? false : z14, (i10 & 524288) != 0 ? null : abstractC6392a2);
    }
}
