package no;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lno/f;", "", "", "transactionType", "", "points", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTransactionType", "b", "I", "c", "d", "Z", "()Z", "isPositivePoints", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.f, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class TransactionDetail {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int points;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isPositivePoints;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetail)) {
            return false;
        }
        TransactionDetail transactionDetail = (TransactionDetail) other;
        return Intrinsics.e(this.transactionType, transactionDetail.transactionType) && this.points == transactionDetail.points && Intrinsics.e(this.label, transactionDetail.label);
    }

    public TransactionDetail(String transactionType, int i10, String label) {
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(label, "label");
        this.transactionType = transactionType;
        this.points = i10;
        this.label = label;
        this.isPositivePoints = Intrinsics.e(transactionType, "Credit");
    }

    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: b, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsPositivePoints() {
        return this.isPositivePoints;
    }

    public int hashCode() {
        return (((this.transactionType.hashCode() * 31) + Integer.hashCode(this.points)) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "TransactionDetail(transactionType=" + this.transactionType + ", points=" + this.points + ", label=" + this.label + ')';
    }
}
