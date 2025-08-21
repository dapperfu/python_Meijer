package no;

import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001a\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+R\u0017\u0010/\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.¨\u00060"}, d2 = {"Lno/b;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "transactionType", "", "postedDate", "j$/time/ZonedDateTime", "postedDateInZone", "label", "", "points", "Lno/a;", "expandTransactionHeader", "", "Lno/f;", "expandedTransactionDetailList", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;ILno/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "getTransactionType", "()Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "b", "Ljava/lang/String;", "e", "c", "Lj$/time/ZonedDateTime;", "f", "()Lj$/time/ZonedDateTime;", "d", "I", "Lno/a;", "()Lno/a;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "Z", "()Z", "isPositivePoints", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ExpandableTransactionDetailItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksTransaction.TransactionType transactionType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postedDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime postedDateInZone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int points;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ExpandTransactionHeader expandTransactionHeader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TransactionDetail> expandedTransactionDetailList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isPositivePoints;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableTransactionDetailItem)) {
            return false;
        }
        ExpandableTransactionDetailItem expandableTransactionDetailItem = (ExpandableTransactionDetailItem) other;
        return this.transactionType == expandableTransactionDetailItem.transactionType && Intrinsics.e(this.postedDate, expandableTransactionDetailItem.postedDate) && Intrinsics.e(this.postedDateInZone, expandableTransactionDetailItem.postedDateInZone) && Intrinsics.e(this.label, expandableTransactionDetailItem.label) && this.points == expandableTransactionDetailItem.points && Intrinsics.e(this.expandTransactionHeader, expandableTransactionDetailItem.expandTransactionHeader) && Intrinsics.e(this.expandedTransactionDetailList, expandableTransactionDetailItem.expandedTransactionDetailList);
    }

    public ExpandableTransactionDetailItem(MperksTransaction.TransactionType transactionType, String postedDate, ZonedDateTime zonedDateTime, String str, int i10, ExpandTransactionHeader expandTransactionHeader, List<TransactionDetail> expandedTransactionDetailList) {
        Intrinsics.j(postedDate, "postedDate");
        Intrinsics.j(expandedTransactionDetailList, "expandedTransactionDetailList");
        this.transactionType = transactionType;
        this.postedDate = postedDate;
        this.postedDateInZone = zonedDateTime;
        this.label = str;
        this.points = i10;
        this.expandTransactionHeader = expandTransactionHeader;
        this.expandedTransactionDetailList = expandedTransactionDetailList;
        boolean z10 = false;
        if (transactionType == null ? i10 > 0 : transactionType == MperksTransaction.TransactionType.CREDIT) {
            z10 = true;
        }
        this.isPositivePoints = z10;
    }

    /* renamed from: a, reason: from getter */
    public final ExpandTransactionHeader getExpandTransactionHeader() {
        return this.expandTransactionHeader;
    }

    public final List<TransactionDetail> b() {
        return this.expandedTransactionDetailList;
    }

    /* renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: d, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: e, reason: from getter */
    public final String getPostedDate() {
        return this.postedDate;
    }

    /* renamed from: f, reason: from getter */
    public final ZonedDateTime getPostedDateInZone() {
        return this.postedDateInZone;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsPositivePoints() {
        return this.isPositivePoints;
    }

    public int hashCode() {
        MperksTransaction.TransactionType transactionType = this.transactionType;
        int iHashCode = (((transactionType == null ? 0 : transactionType.hashCode()) * 31) + this.postedDate.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.postedDateInZone;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str = this.label;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.points)) * 31;
        ExpandTransactionHeader expandTransactionHeader = this.expandTransactionHeader;
        return ((iHashCode3 + (expandTransactionHeader != null ? expandTransactionHeader.hashCode() : 0)) * 31) + this.expandedTransactionDetailList.hashCode();
    }

    public String toString() {
        return "ExpandableTransactionDetailItem(transactionType=" + this.transactionType + ", postedDate=" + this.postedDate + ", postedDateInZone=" + this.postedDateInZone + ", label=" + this.label + ", points=" + this.points + ", expandTransactionHeader=" + this.expandTransactionHeader + ", expandedTransactionDetailList=" + this.expandedTransactionDetailList + ')';
    }
}
