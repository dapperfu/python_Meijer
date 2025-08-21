package hn;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lhn/s;", "", "Lbk/a;", "transactionId", "date", "amount", "", "isRefund", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "d", "Z", "()Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.s, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class TransactionDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f136059f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a transactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a date;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRefund;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhn/s$a;", "", "<init>", "()V", "Lhn/d;", "Lhn/s;", "b", "(Lhn/d;)Lhn/s;", "Lhn/c;", "a", "(Lhn/c;)Lhn/s;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransactionDecorator a(C14544c c14544c) {
            Intrinsics.j(c14544c, "<this>");
            return new TransactionDecorator(c14544c.getTransactionId(), c14544c.getDate(), c14544c.getAmount(), false);
        }

        public final TransactionDecorator b(EbtTransactionItemDecorator ebtTransactionItemDecorator) {
            Intrinsics.j(ebtTransactionItemDecorator, "<this>");
            return new TransactionDecorator(ebtTransactionItemDecorator.getTransactionId(), ebtTransactionItemDecorator.getDate(), ebtTransactionItemDecorator.getAmount(), ebtTransactionItemDecorator.getIsRefund());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDecorator)) {
            return false;
        }
        TransactionDecorator transactionDecorator = (TransactionDecorator) other;
        return Intrinsics.e(this.transactionId, transactionDecorator.transactionId) && Intrinsics.e(this.date, transactionDecorator.date) && Intrinsics.e(this.amount, transactionDecorator.amount) && this.isRefund == transactionDecorator.isRefund;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsRefund() {
        return this.isRefund;
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.transactionId;
        int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.date;
        int iHashCode2 = (iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.amount;
        return ((iHashCode2 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRefund);
    }

    public String toString() {
        return "TransactionDecorator(transactionId=" + this.transactionId + ", date=" + this.date + ", amount=" + this.amount + ", isRefund=" + this.isRefund + ')';
    }

    public TransactionDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10) {
        this.transactionId = abstractC6392a;
        this.date = abstractC6392a2;
        this.amount = abstractC6392a3;
        this.isRefund = z10;
    }
}
