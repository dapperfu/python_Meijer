package no;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lno/a;", "", "", "transactionHeaderTitle", "orderNumber", "clipLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ExpandTransactionHeader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionHeaderTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipLabel;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandTransactionHeader)) {
            return false;
        }
        ExpandTransactionHeader expandTransactionHeader = (ExpandTransactionHeader) other;
        return Intrinsics.e(this.transactionHeaderTitle, expandTransactionHeader.transactionHeaderTitle) && Intrinsics.e(this.orderNumber, expandTransactionHeader.orderNumber) && Intrinsics.e(this.clipLabel, expandTransactionHeader.clipLabel);
    }

    public ExpandTransactionHeader(String transactionHeaderTitle, String str, String str2) {
        Intrinsics.j(transactionHeaderTitle, "transactionHeaderTitle");
        this.transactionHeaderTitle = transactionHeaderTitle;
        this.orderNumber = str;
        this.clipLabel = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getClipLabel() {
        return this.clipLabel;
    }

    /* renamed from: b, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: c, reason: from getter */
    public final String getTransactionHeaderTitle() {
        return this.transactionHeaderTitle;
    }

    public int hashCode() {
        int iHashCode = this.transactionHeaderTitle.hashCode() * 31;
        String str = this.orderNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clipLabel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ExpandTransactionHeader(transactionHeaderTitle=" + this.transactionHeaderTitle + ", orderNumber=" + this.orderNumber + ", clipLabel=" + this.clipLabel + ')';
    }
}
