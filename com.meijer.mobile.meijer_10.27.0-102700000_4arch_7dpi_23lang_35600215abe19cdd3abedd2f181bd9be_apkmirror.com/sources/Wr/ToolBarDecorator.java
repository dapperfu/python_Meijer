package Wr;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\r¨\u0006\u0017"}, d2 = {"LWr/c;", "", "", "isCouponClipped", "isShoppingListAdded", "", "cartItemCount", "<init>", "(ZZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wr.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ToolBarDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f39005d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCouponClipped;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShoppingListAdded;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolBarDecorator)) {
            return false;
        }
        ToolBarDecorator toolBarDecorator = (ToolBarDecorator) other;
        return this.isCouponClipped == toolBarDecorator.isCouponClipped && this.isShoppingListAdded == toolBarDecorator.isShoppingListAdded && this.cartItemCount == toolBarDecorator.cartItemCount;
    }

    /* renamed from: a, reason: from getter */
    public final int getCartItemCount() {
        return this.cartItemCount;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsCouponClipped() {
        return this.isCouponClipped;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsShoppingListAdded() {
        return this.isShoppingListAdded;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isCouponClipped) * 31) + Boolean.hashCode(this.isShoppingListAdded)) * 31) + Integer.hashCode(this.cartItemCount);
    }

    public String toString() {
        return "ToolBarDecorator(isCouponClipped=" + this.isCouponClipped + ", isShoppingListAdded=" + this.isShoppingListAdded + ", cartItemCount=" + this.cartItemCount + ')';
    }

    public ToolBarDecorator(boolean z10, boolean z11, int i10) {
        this.isCouponClipped = z10;
        this.isShoppingListAdded = z11;
        this.cartItemCount = i10;
    }
}
