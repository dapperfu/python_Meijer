package pj;

import com.meijer.mobile.cart.model.hybris.Cart;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b#\u0010&¨\u0006("}, d2 = {"Lpj/a;", "", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "cart", "", "Lpj/d;", "appliedCoupons", "", "resultCode", "", "message", "errorMessage", "", "isSuccess", "isClipSuccess", "<init>", "(Lcom/meijer/mobile/cart/model/hybris/Cart;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "b", "()Lcom/meijer/mobile/cart/model/hybris/Cart;", "Ljava/util/List;", "()Ljava/util/List;", "c", "I", "getResultCode", "d", "Ljava/lang/String;", "e", "f", "Z", "()Z", "g", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pj.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ApplyPromoCodeResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cart cart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromoCouponResult> appliedCoupons;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resultCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipSuccess;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyPromoCodeResult)) {
            return false;
        }
        ApplyPromoCodeResult applyPromoCodeResult = (ApplyPromoCodeResult) other;
        return Intrinsics.e(this.cart, applyPromoCodeResult.cart) && Intrinsics.e(this.appliedCoupons, applyPromoCodeResult.appliedCoupons) && this.resultCode == applyPromoCodeResult.resultCode && Intrinsics.e(this.message, applyPromoCodeResult.message) && Intrinsics.e(this.errorMessage, applyPromoCodeResult.errorMessage) && this.isSuccess == applyPromoCodeResult.isSuccess && this.isClipSuccess == applyPromoCodeResult.isClipSuccess;
    }

    public ApplyPromoCodeResult(Cart cart, List<PromoCouponResult> appliedCoupons, int i10, String message, String str, boolean z10, boolean z11) {
        Intrinsics.j(cart, "cart");
        Intrinsics.j(appliedCoupons, "appliedCoupons");
        Intrinsics.j(message, "message");
        this.cart = cart;
        this.appliedCoupons = appliedCoupons;
        this.resultCode = i10;
        this.message = message;
        this.errorMessage = str;
        this.isSuccess = z10;
        this.isClipSuccess = z11;
    }

    public final List<PromoCouponResult> a() {
        return this.appliedCoupons;
    }

    /* renamed from: b, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    /* renamed from: c, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: d, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsClipSuccess() {
        return this.isClipSuccess;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        int iHashCode = ((((((this.cart.hashCode() * 31) + this.appliedCoupons.hashCode()) * 31) + Integer.hashCode(this.resultCode)) * 31) + this.message.hashCode()) * 31;
        String str = this.errorMessage;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + Boolean.hashCode(this.isClipSuccess);
    }

    public String toString() {
        return "ApplyPromoCodeResult(cart=" + this.cart + ", appliedCoupons=" + this.appliedCoupons + ", resultCode=" + this.resultCode + ", message=" + this.message + ", errorMessage=" + this.errorMessage + ", isSuccess=" + this.isSuccess + ", isClipSuccess=" + this.isClipSuccess + ')';
    }
}
