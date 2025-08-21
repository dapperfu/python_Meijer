package no;

import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"Lno/f;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "transactionType", "", "points", "", "label", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "getTransactionType", "()Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "b", "I", "c", "Ljava/lang/String;", "d", "Z", "()Z", "isPositivePoints", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.f, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class TransactionDetail {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksTransaction.TransactionType transactionType;

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
        return this.transactionType == transactionDetail.transactionType && this.points == transactionDetail.points && Intrinsics.e(this.label, transactionDetail.label);
    }

    public TransactionDetail(MperksTransaction.TransactionType transactionType, int i10, String label) {
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(label, "label");
        this.transactionType = transactionType;
        this.points = i10;
        this.label = label;
        this.isPositivePoints = transactionType == MperksTransaction.TransactionType.CREDIT;
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
