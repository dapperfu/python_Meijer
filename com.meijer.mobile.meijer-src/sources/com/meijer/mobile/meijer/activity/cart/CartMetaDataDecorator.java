package com.meijer.mobile.meijer.activity.cart;

import bk.AbstractC6392a;
import fj.CardType;
import fj.MultiTenderPaymentInfo;
import fj.ShoppingCart;
import fj.TendersItem;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wo.C17904a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\u001c¨\u0006)"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/l0;", "", "Lfj/C;", "cart", "", "isLoading", "cartLoadingError", "<init>", "(Lfj/C;ZZ)V", "", "Lfj/G;", "tenders", "c", "(Ljava/util/List;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj/C;", "()Lfj/C;", "b", "Z", "()Z", "f", "isCartErrorVisible", "e", "isCartEmptyVisible", "g", "isCartInfoVisible", "Lbk/a;", "d", "()Lbk/a;", "totalItemCount", "h", "isEBTCardAdded", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.cart.l0, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class CartMetaDataDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingCart cart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cartLoadingError;

    private final boolean c(List<TendersItem> tenders) {
        if (tenders != null) {
            List<TendersItem> list = tenders;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TendersItem tendersItem : list) {
                    if (Intrinsics.e(tendersItem != null ? tendersItem.getCardType() : null, CardType.INSTANCE.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartMetaDataDecorator)) {
            return false;
        }
        CartMetaDataDecorator cartMetaDataDecorator = (CartMetaDataDecorator) other;
        return Intrinsics.e(this.cart, cartMetaDataDecorator.cart) && this.isLoading == cartMetaDataDecorator.isLoading && this.cartLoadingError == cartMetaDataDecorator.cartLoadingError;
    }

    public int hashCode() {
        ShoppingCart shoppingCart = this.cart;
        return ((((shoppingCart == null ? 0 : shoppingCart.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.cartLoadingError);
    }

    public String toString() {
        return "CartMetaDataDecorator(cart=" + this.cart + ", isLoading=" + this.isLoading + ", cartLoadingError=" + this.cartLoadingError + ')';
    }

    /* renamed from: a, reason: from getter */
    public final ShoppingCart getCart() {
        return this.cart;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCartLoadingError() {
        return this.cartLoadingError;
    }

    public final AbstractC6392a d() {
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = C17904a.f167305a;
        ShoppingCart shoppingCart = this.cart;
        return companion.b(i10, shoppingCart != null ? shoppingCart.getTotalItems() : 0, new Object[0]);
    }

    public final boolean e() {
        ShoppingCart shoppingCart = this.cart;
        return (shoppingCart == null || !shoppingCart.p().isEmpty() || !this.cart.z().isEmpty() || this.isLoading || f()) ? false : true;
    }

    public final boolean f() {
        return this.cartLoadingError;
    }

    public final boolean h() {
        MultiTenderPaymentInfo multiTenderPaymentInfo;
        ShoppingCart shoppingCart = this.cart;
        return c((shoppingCart == null || (multiTenderPaymentInfo = shoppingCart.getMultiTenderPaymentInfo()) == null) ? null : multiTenderPaymentInfo.a());
    }

    public CartMetaDataDecorator(ShoppingCart shoppingCart, boolean z10, boolean z11) {
        this.cart = shoppingCart;
        this.isLoading = z10;
        this.cartLoadingError = z11;
    }

    public final boolean g() {
        return !e();
    }
}
