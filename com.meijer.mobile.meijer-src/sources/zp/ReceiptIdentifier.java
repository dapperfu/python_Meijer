package zp;

import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzp/f;", "", "", "receiptId", "", "uuid", "j$/time/LocalDateTime", "transactionDateTime", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lj$/time/LocalDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "c", "Lj$/time/LocalDateTime;", "getTransactionDateTime", "()Lj$/time/LocalDateTime;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ReceiptIdentifier {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long receiptId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime transactionDateTime;

    public ReceiptIdentifier() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptIdentifier)) {
            return false;
        }
        ReceiptIdentifier receiptIdentifier = (ReceiptIdentifier) other;
        return Intrinsics.e(this.receiptId, receiptIdentifier.receiptId) && Intrinsics.e(this.uuid, receiptIdentifier.uuid) && Intrinsics.e(this.transactionDateTime, receiptIdentifier.transactionDateTime);
    }

    public ReceiptIdentifier(Long l10, String str, LocalDateTime localDateTime) {
        this.receiptId = l10;
        this.uuid = str;
        this.transactionDateTime = localDateTime;
    }

    /* renamed from: a, reason: from getter */
    public final Long getReceiptId() {
        return this.receiptId;
    }

    /* renamed from: b, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        Long l10 = this.receiptId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.uuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDateTime localDateTime = this.transactionDateTime;
        return iHashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptIdentifier(receiptId=" + this.receiptId + ", uuid=" + this.uuid + ", transactionDateTime=" + this.transactionDateTime + ')';
    }

    public /* synthetic */ ReceiptIdentifier(Long l10, String str, LocalDateTime localDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : localDateTime);
    }
}
