package Ol;

import com.meijer.mobile.greenville.model.domain.CartItem;
import com.meijer.mobile.greenville.model.domain.TransactionException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"LOl/e;", "", "LOl/c;", "header", "LOl/a;", "cartTotals", "", "Lcom/meijer/mobile/greenville/model/domain/a;", "cartItems", "Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "exception", "<init>", "(LOl/c;LOl/a;Ljava/util/List;Lcom/meijer/mobile/greenville/model/domain/TransactionException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOl/c;", "d", "()LOl/c;", "b", "LOl/a;", "()LOl/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "()Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ol.e, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class Transaction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Header header;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartTotals cartTotals;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CartItem> cartItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionException exception;

    public Transaction(Header header, CartTotals cartTotals, List<CartItem> cartItems, TransactionException transactionException) {
        Intrinsics.j(header, "header");
        Intrinsics.j(cartTotals, "cartTotals");
        Intrinsics.j(cartItems, "cartItems");
        this.header = header;
        this.cartTotals = cartTotals;
        this.cartItems = cartItems;
        this.exception = transactionException;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Intrinsics.e(this.header, transaction.header) && Intrinsics.e(this.cartTotals, transaction.cartTotals) && Intrinsics.e(this.cartItems, transaction.cartItems) && Intrinsics.e(this.exception, transaction.exception);
    }

    public final List<CartItem> a() {
        return this.cartItems;
    }

    /* renamed from: b, reason: from getter */
    public final CartTotals getCartTotals() {
        return this.cartTotals;
    }

    /* renamed from: c, reason: from getter */
    public final TransactionException getException() {
        return this.exception;
    }

    /* renamed from: d, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    public int hashCode() {
        int iHashCode = ((((this.header.hashCode() * 31) + this.cartTotals.hashCode()) * 31) + this.cartItems.hashCode()) * 31;
        TransactionException transactionException = this.exception;
        return iHashCode + (transactionException == null ? 0 : transactionException.hashCode());
    }

    public String toString() {
        return "Transaction(header=" + this.header + ", cartTotals=" + this.cartTotals + ", cartItems=" + this.cartItems + ", exception=" + this.exception + ')';
    }

    public /* synthetic */ Transaction(Header header, CartTotals cartTotals, List list, TransactionException transactionException, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(header, cartTotals, list, (i10 & 8) != 0 ? null : transactionException);
    }
}
