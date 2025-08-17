package ej;

import ci.CustomerAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lej/s;", "", "", "accountHolderName", "Lci/c;", "billingAddress", "", "Lej/G;", "tenders", "<init>", "(Ljava/lang/String;Lci/c;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAccountHolderName", "b", "Lci/c;", "getBillingAddress", "()Lci/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.s, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class MultiTenderPaymentInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TendersItem> tenders;

    public MultiTenderPaymentInfo() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiTenderPaymentInfo)) {
            return false;
        }
        MultiTenderPaymentInfo multiTenderPaymentInfo = (MultiTenderPaymentInfo) other;
        return Intrinsics.e(this.accountHolderName, multiTenderPaymentInfo.accountHolderName) && Intrinsics.e(this.billingAddress, multiTenderPaymentInfo.billingAddress) && Intrinsics.e(this.tenders, multiTenderPaymentInfo.tenders);
    }

    public MultiTenderPaymentInfo(String str, CustomerAddress customerAddress, List<TendersItem> list) {
        this.accountHolderName = str;
        this.billingAddress = customerAddress;
        this.tenders = list;
    }

    public final List<TendersItem> a() {
        return this.tenders;
    }

    public int hashCode() {
        String str = this.accountHolderName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CustomerAddress customerAddress = this.billingAddress;
        int iHashCode2 = (iHashCode + (customerAddress == null ? 0 : customerAddress.hashCode())) * 31;
        List<TendersItem> list = this.tenders;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "MultiTenderPaymentInfo(accountHolderName=" + this.accountHolderName + ", billingAddress=" + this.billingAddress + ", tenders=" + this.tenders + ')';
    }

    public /* synthetic */ MultiTenderPaymentInfo(String str, CustomerAddress customerAddress, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : customerAddress, (i10 & 4) != 0 ? null : list);
    }
}
