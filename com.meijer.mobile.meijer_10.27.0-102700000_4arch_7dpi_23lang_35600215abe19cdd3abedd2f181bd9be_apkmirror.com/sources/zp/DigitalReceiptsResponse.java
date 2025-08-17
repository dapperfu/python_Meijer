package zp;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lzp/d;", "", "", "Lzp/b;", "receiptsList", "Lzp/e;", "savingsByMonth", "", "currentPage", "nextPage", "totalPages", "<init>", "(Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;I)V", "a", "(Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;I)Lzp/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "f", "c", "I", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class DigitalReceiptsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DigitalReceipt> receiptsList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MonthSavingsSummary> savingsByMonth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer nextPage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalPages;

    public DigitalReceiptsResponse() {
        this(null, null, 0, null, 0, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalReceiptsResponse)) {
            return false;
        }
        DigitalReceiptsResponse digitalReceiptsResponse = (DigitalReceiptsResponse) other;
        return Intrinsics.e(this.receiptsList, digitalReceiptsResponse.receiptsList) && Intrinsics.e(this.savingsByMonth, digitalReceiptsResponse.savingsByMonth) && this.currentPage == digitalReceiptsResponse.currentPage && Intrinsics.e(this.nextPage, digitalReceiptsResponse.nextPage) && this.totalPages == digitalReceiptsResponse.totalPages;
    }

    public DigitalReceiptsResponse(List<DigitalReceipt> receiptsList, List<MonthSavingsSummary> savingsByMonth, int i10, Integer num, int i11) {
        Intrinsics.j(receiptsList, "receiptsList");
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        this.receiptsList = receiptsList;
        this.savingsByMonth = savingsByMonth;
        this.currentPage = i10;
        this.nextPage = num;
        this.totalPages = i11;
    }

    public static /* synthetic */ DigitalReceiptsResponse b(DigitalReceiptsResponse digitalReceiptsResponse, List list, List list2, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = digitalReceiptsResponse.receiptsList;
        }
        if ((i12 & 2) != 0) {
            list2 = digitalReceiptsResponse.savingsByMonth;
        }
        if ((i12 & 4) != 0) {
            i10 = digitalReceiptsResponse.currentPage;
        }
        if ((i12 & 8) != 0) {
            num = digitalReceiptsResponse.nextPage;
        }
        if ((i12 & 16) != 0) {
            i11 = digitalReceiptsResponse.totalPages;
        }
        int i13 = i11;
        int i14 = i10;
        return digitalReceiptsResponse.a(list, list2, i14, num, i13);
    }

    public final DigitalReceiptsResponse a(List<DigitalReceipt> receiptsList, List<MonthSavingsSummary> savingsByMonth, int currentPage, Integer nextPage, int totalPages) {
        Intrinsics.j(receiptsList, "receiptsList");
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        return new DigitalReceiptsResponse(receiptsList, savingsByMonth, currentPage, nextPage, totalPages);
    }

    /* renamed from: c, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getNextPage() {
        return this.nextPage;
    }

    public final List<DigitalReceipt> e() {
        return this.receiptsList;
    }

    public final List<MonthSavingsSummary> f() {
        return this.savingsByMonth;
    }

    /* renamed from: g, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        int iHashCode = ((((this.receiptsList.hashCode() * 31) + this.savingsByMonth.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31;
        Integer num = this.nextPage;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages);
    }

    public String toString() {
        return "DigitalReceiptsResponse(receiptsList=" + this.receiptsList + ", savingsByMonth=" + this.savingsByMonth + ", currentPage=" + this.currentPage + ", nextPage=" + this.nextPage + ", totalPages=" + this.totalPages + ')';
    }

    public /* synthetic */ DigitalReceiptsResponse(List list, List list2, int i10, Integer num, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? CollectionsKt.m() : list, (i12 & 2) != 0 ? CollectionsKt.m() : list2, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? 1 : i11);
    }
}
