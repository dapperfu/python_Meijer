package ej;

import io.constructor.data.local.PreferencesHelper;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lej/I;", "", "", PreferencesHelper.PREF_ID, "Lej/H;", "type", "j$/time/OffsetDateTime", "date", "", "amount", "<init>", "(Ljava/lang/String;Lej/H;Lj$/time/OffsetDateTime;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lej/H;", "d", "()Lej/H;", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.I, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class TransactionDetail {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final H type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double amount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetail)) {
            return false;
        }
        TransactionDetail transactionDetail = (TransactionDetail) other;
        return Intrinsics.e(this.id, transactionDetail.id) && this.type == transactionDetail.type && Intrinsics.e(this.date, transactionDetail.date) && Intrinsics.e(this.amount, transactionDetail.amount);
    }

    public TransactionDetail(String str, H type, OffsetDateTime offsetDateTime, Double d10) {
        Intrinsics.j(type, "type");
        this.id = str;
        this.type = type;
        this.date = offsetDateTime;
        this.amount = d10;
    }

    /* renamed from: a, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final H getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.date;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Double d10 = this.amount;
        return iHashCode2 + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "TransactionDetail(id=" + this.id + ", type=" + this.type + ", date=" + this.date + ", amount=" + this.amount + ')';
    }
}
