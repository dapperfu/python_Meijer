package zp;

import j$.time.LocalDate;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzp/i;", "", "", "transactionId", "lane", "storeNumber", "j$/time/LocalDate", "transactionDate", "j$/time/LocalTime", "transactionTime", "<init>", "(IIILj$/time/LocalDate;Lj$/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "e", "Lj$/time/LocalTime;", "()Lj$/time/LocalTime;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.i, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class TransactionDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int transactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lane;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate transactionDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime transactionTime;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails transactionDetails = (TransactionDetails) other;
        return this.transactionId == transactionDetails.transactionId && this.lane == transactionDetails.lane && this.storeNumber == transactionDetails.storeNumber && Intrinsics.e(this.transactionDate, transactionDetails.transactionDate) && Intrinsics.e(this.transactionTime, transactionDetails.transactionTime);
    }

    public TransactionDetails(int i10, int i11, int i12, LocalDate transactionDate, LocalTime transactionTime) {
        Intrinsics.j(transactionDate, "transactionDate");
        Intrinsics.j(transactionTime, "transactionTime");
        this.transactionId = i10;
        this.lane = i11;
        this.storeNumber = i12;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
    }

    /* renamed from: a, reason: from getter */
    public final int getLane() {
        return this.lane;
    }

    /* renamed from: b, reason: from getter */
    public final int getStoreNumber() {
        return this.storeNumber;
    }

    /* renamed from: c, reason: from getter */
    public final LocalDate getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: d, reason: from getter */
    public final int getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: e, reason: from getter */
    public final LocalTime getTransactionTime() {
        return this.transactionTime;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.transactionId) * 31) + Integer.hashCode(this.lane)) * 31) + Integer.hashCode(this.storeNumber)) * 31) + this.transactionDate.hashCode()) * 31) + this.transactionTime.hashCode();
    }

    public String toString() {
        return "TransactionDetails(transactionId=" + this.transactionId + ", lane=" + this.lane + ", storeNumber=" + this.storeNumber + ", transactionDate=" + this.transactionDate + ", transactionTime=" + this.transactionTime + ')';
    }
}
