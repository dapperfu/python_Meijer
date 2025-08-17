package vs;

import Co.ProductFullDetails;
import Ho.SponsoredData;
import Hr.CouponCountDownStateDecorator;
import ak.AbstractC5607a;
import kotlin.Metadata;
import vl.ProductEligibility;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0019\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u0014\u0010)\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0010R\u0016\u0010=\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\fR\u0016\u0010?\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\fR\u0014\u0010A\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006BÀ\u0006\u0001"}, d2 = {"Lvs/c;", "", "LCo/h;", "m", "()LCo/h;", "product", "", "e", "()Ljava/lang/String;", "thumbnailUrl", "Lak/a;", "D", "()Lak/a;", "currentPrice", "", "k", "()Z", "hasDeposit", "q", "regularPrice", "getTitle", "title", "a", "weight", "f", "shouldShowWeight", "n", "isOutOfStock", "x", "isLowStock", "s", "isOnSale", "b", "amountSaved", "", "i", "()D", "actualQuantity", "r", "inQtyStepperTransition", "l", "resetStepperState", "Lvl/b$a;", "d", "()Lvl/b$a;", "cartEligibility", "LOk/c;", "p", "()LOk/c;", "couponIdentity", "LHr/e;", "t", "()LHr/e;", "couponCountDownStateDecorator", "LHo/c;", "h", "()LHo/c;", "criteoInfo", "o", "isEligibleForCart", "g", "currentPriceDescription", "c", "regularPriceDescription", "j", "productContainsTag", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vs.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC17607c {
    /* renamed from: D */
    AbstractC5607a getCurrentPrice();

    /* renamed from: a */
    AbstractC5607a getWeight();

    /* renamed from: b */
    AbstractC5607a getAmountSaved();

    /* renamed from: c */
    AbstractC5607a getRegularPriceDescription();

    /* renamed from: d */
    ProductEligibility.a getCartEligibility();

    /* renamed from: e */
    String getThumbnailUrl();

    /* renamed from: f */
    boolean getShouldShowWeight();

    /* renamed from: g */
    AbstractC5607a getCurrentPriceDescription();

    String getTitle();

    /* renamed from: h */
    SponsoredData getCriteoInfo();

    /* renamed from: i */
    double getActualQuantity();

    /* renamed from: j */
    boolean getProductContainsTag();

    /* renamed from: k */
    boolean getHasDeposit();

    /* renamed from: l */
    boolean getResetStepperState();

    /* renamed from: m */
    ProductFullDetails getProduct();

    /* renamed from: n */
    boolean getIsOutOfStock();

    boolean o();

    /* renamed from: p */
    Ok.c getCouponIdentity();

    /* renamed from: q */
    AbstractC5607a getRegularPrice();

    /* renamed from: r */
    boolean getInQtyStepperTransition();

    /* renamed from: s */
    boolean getIsOnSale();

    /* renamed from: t */
    CouponCountDownStateDecorator getCouponCountDownStateDecorator();

    /* renamed from: x */
    boolean getIsLowStock();
}
