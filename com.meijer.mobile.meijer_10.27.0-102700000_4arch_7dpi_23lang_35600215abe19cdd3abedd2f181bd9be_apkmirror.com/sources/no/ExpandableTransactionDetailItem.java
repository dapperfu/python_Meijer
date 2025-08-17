package no;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&R\u0017\u0010*\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u0019\u0010/\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.¨\u00060"}, d2 = {"Lno/b;", "", "", "transactionType", "postedDate", "originalDateString", "label", "", "points", "Lno/a;", "expandTransactionHeader", "", "Lno/f;", "expandedTransactionDetailList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILno/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTransactionType", "b", "e", "c", "getOriginalDateString", "d", "I", "f", "Lno/a;", "()Lno/a;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "Z", "()Z", "isPositivePoints", "j$/time/ZonedDateTime", "i", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "postedDateInZone", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: no.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ExpandableTransactionDetailItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postedDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalDateString;

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

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ZonedDateTime postedDateInZone;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableTransactionDetailItem)) {
            return false;
        }
        ExpandableTransactionDetailItem expandableTransactionDetailItem = (ExpandableTransactionDetailItem) other;
        return Intrinsics.e(this.transactionType, expandableTransactionDetailItem.transactionType) && Intrinsics.e(this.postedDate, expandableTransactionDetailItem.postedDate) && Intrinsics.e(this.originalDateString, expandableTransactionDetailItem.originalDateString) && Intrinsics.e(this.label, expandableTransactionDetailItem.label) && this.points == expandableTransactionDetailItem.points && Intrinsics.e(this.expandTransactionHeader, expandableTransactionDetailItem.expandTransactionHeader) && Intrinsics.e(this.expandedTransactionDetailList, expandableTransactionDetailItem.expandedTransactionDetailList);
    }

    public ExpandableTransactionDetailItem(String str, String postedDate, String originalDateString, String str2, int i10, ExpandTransactionHeader expandTransactionHeader, List<TransactionDetail> list) {
        Intrinsics.j(postedDate, "postedDate");
        Intrinsics.j(originalDateString, "originalDateString");
        this.transactionType = str;
        this.postedDate = postedDate;
        this.originalDateString = originalDateString;
        this.label = str2;
        this.points = i10;
        this.expandTransactionHeader = expandTransactionHeader;
        this.expandedTransactionDetailList = list;
        this.isPositivePoints = str != null ? Intrinsics.e(str, "Credit") : i10 > 0;
        LocalDateTime localDateTime = (LocalDateTime) vk.d.b(originalDateString, C17590a.f164803a.s(), new j());
        this.postedDateInZone = localDateTime != null ? localDateTime.N(ZoneId.systemDefault()) : null;
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
        String str = this.transactionType;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.postedDate.hashCode()) * 31) + this.originalDateString.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.points)) * 31;
        ExpandTransactionHeader expandTransactionHeader = this.expandTransactionHeader;
        int iHashCode3 = (iHashCode2 + (expandTransactionHeader == null ? 0 : expandTransactionHeader.hashCode())) * 31;
        List<TransactionDetail> list = this.expandedTransactionDetailList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExpandableTransactionDetailItem(transactionType=" + this.transactionType + ", postedDate=" + this.postedDate + ", originalDateString=" + this.originalDateString + ", label=" + this.label + ", points=" + this.points + ", expandTransactionHeader=" + this.expandTransactionHeader + ", expandedTransactionDetailList=" + this.expandedTransactionDetailList + ')';
    }
}
