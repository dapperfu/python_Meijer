package xo;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;
import wo.C17904a;
import wo.C17905b;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0016\u0010\u001c¨\u0006\""}, d2 = {"Lxo/a;", "Lxo/b;", "Lzp/b;", "receipt", "Lbk/a;", "storeAddress", "", "transactionDate", "totalSpent", "numberOfItems", "<init>", "(Lzp/b;Lbk/a;Ljava/lang/String;Lbk/a;Lbk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzp/b;", "c", "()Lzp/b;", "Lbk/a;", "d", "()Lbk/a;", "Ljava/lang/String;", "f", "e", "g", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class InStoreOrdersItemDecorator extends AbstractC18202b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DigitalReceipt receipt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a storeAddress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a totalSpent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a numberOfItems;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxo/a$a;", "", "<init>", "()V", "Lzp/b;", "receipt", "Lxo/a;", "a", "(Lzp/b;)Lxo/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xo.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InStoreOrdersItemDecorator a(DigitalReceipt receipt) {
            Intrinsics.j(receipt, "receipt");
            String storeAddress = receipt.getStoreAddress();
            AbstractC6392a abstractC6392aC = storeAddress != null ? AbstractC6392a.INSTANCE.c(storeAddress) : null;
            String str = receipt.getTransactionDateTime().format(C17898a.f167225a.l());
            if (str == null) {
                str = "";
            }
            String str2 = str;
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new InStoreOrdersItemDecorator(receipt, abstractC6392aC, str2, companion.d(C17905b.f167308C, Double.valueOf(receipt.getTotalSpent())), companion.b(C17904a.f167305a, receipt.getNumberOfItems(), new Object[0]));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InStoreOrdersItemDecorator)) {
            return false;
        }
        InStoreOrdersItemDecorator inStoreOrdersItemDecorator = (InStoreOrdersItemDecorator) other;
        return Intrinsics.e(this.receipt, inStoreOrdersItemDecorator.receipt) && Intrinsics.e(this.storeAddress, inStoreOrdersItemDecorator.storeAddress) && Intrinsics.e(this.transactionDate, inStoreOrdersItemDecorator.transactionDate) && Intrinsics.e(this.totalSpent, inStoreOrdersItemDecorator.totalSpent) && Intrinsics.e(this.numberOfItems, inStoreOrdersItemDecorator.numberOfItems);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreOrdersItemDecorator(DigitalReceipt receipt, AbstractC6392a abstractC6392a, String transactionDate, AbstractC6392a totalSpent, AbstractC6392a numberOfItems) {
        super(receipt.getIdentifier().toString());
        Intrinsics.j(receipt, "receipt");
        Intrinsics.j(transactionDate, "transactionDate");
        Intrinsics.j(totalSpent, "totalSpent");
        Intrinsics.j(numberOfItems, "numberOfItems");
        this.receipt = receipt;
        this.storeAddress = abstractC6392a;
        this.transactionDate = transactionDate;
        this.totalSpent = totalSpent;
        this.numberOfItems = numberOfItems;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getNumberOfItems() {
        return this.numberOfItems;
    }

    /* renamed from: c, reason: from getter */
    public final DigitalReceipt getReceipt() {
        return this.receipt;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getStoreAddress() {
        return this.storeAddress;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getTotalSpent() {
        return this.totalSpent;
    }

    /* renamed from: f, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public int hashCode() {
        int iHashCode = this.receipt.hashCode() * 31;
        AbstractC6392a abstractC6392a = this.storeAddress;
        return ((((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + this.transactionDate.hashCode()) * 31) + this.totalSpent.hashCode()) * 31) + this.numberOfItems.hashCode();
    }

    public String toString() {
        return "InStoreOrdersItemDecorator(receipt=" + this.receipt + ", storeAddress=" + this.storeAddress + ", transactionDate=" + this.transactionDate + ", totalSpent=" + this.totalSpent + ", numberOfItems=" + this.numberOfItems + ')';
    }
}
