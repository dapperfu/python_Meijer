package fj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Lfj/F;", "", "", "cardNumber", "Lfj/d;", "cardType", "tenderType", "", "Lfj/I;", "transactionDetails", "<init>", "(Ljava/lang/String;Lfj/d;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardNumber", "b", "Lfj/d;", "getCardType", "()Lfj/d;", "c", "getTenderType", "d", "Ljava/util/List;", "()Ljava/util/List;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.F, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Tender {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardType cardType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tenderType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TransactionDetail> transactionDetails;

    public Tender(String cardNumber, CardType cardType, String tenderType, List<TransactionDetail> transactionDetails) {
        Intrinsics.j(cardNumber, "cardNumber");
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(tenderType, "tenderType");
        Intrinsics.j(transactionDetails, "transactionDetails");
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.tenderType = tenderType;
        this.transactionDetails = transactionDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tender)) {
            return false;
        }
        Tender tender = (Tender) other;
        return Intrinsics.e(this.cardNumber, tender.cardNumber) && Intrinsics.e(this.cardType, tender.cardType) && Intrinsics.e(this.tenderType, tender.tenderType) && Intrinsics.e(this.transactionDetails, tender.transactionDetails);
    }

    public final List<TransactionDetail> a() {
        return this.transactionDetails;
    }

    public int hashCode() {
        return (((((this.cardNumber.hashCode() * 31) + this.cardType.hashCode()) * 31) + this.tenderType.hashCode()) * 31) + this.transactionDetails.hashCode();
    }

    public String toString() {
        return "Tender(cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", tenderType=" + this.tenderType + ", transactionDetails=" + this.transactionDetails + ')';
    }

    public /* synthetic */ Tender(String str, CardType cardType, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, cardType, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? CollectionsKt.m() : list);
    }
}
