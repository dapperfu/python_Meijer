package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsRequest;", "", "", "startDate", "endDate", "", "pageSize", "pageIndex", "sortType", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "I", "d", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DigitalReceiptsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startDate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sortType;

    public DigitalReceiptsRequest(@g(name = "fromDate") String startDate, @g(name = "toDate") String endDate, @g(name = "numberOfReceiptsInEachPage") int i10, @g(name = "pageIndex") int i11, @g(name = "options") String sortType) {
        Intrinsics.j(startDate, "startDate");
        Intrinsics.j(endDate, "endDate");
        Intrinsics.j(sortType, "sortType");
        this.startDate = startDate;
        this.endDate = endDate;
        this.pageSize = i10;
        this.pageIndex = i11;
        this.sortType = sortType;
    }

    public final DigitalReceiptsRequest copy(@g(name = "fromDate") String startDate, @g(name = "toDate") String endDate, @g(name = "numberOfReceiptsInEachPage") int pageSize, @g(name = "pageIndex") int pageIndex, @g(name = "options") String sortType) {
        Intrinsics.j(startDate, "startDate");
        Intrinsics.j(endDate, "endDate");
        Intrinsics.j(sortType, "sortType");
        return new DigitalReceiptsRequest(startDate, endDate, pageSize, pageIndex, sortType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalReceiptsRequest)) {
            return false;
        }
        DigitalReceiptsRequest digitalReceiptsRequest = (DigitalReceiptsRequest) other;
        return Intrinsics.e(this.startDate, digitalReceiptsRequest.startDate) && Intrinsics.e(this.endDate, digitalReceiptsRequest.endDate) && this.pageSize == digitalReceiptsRequest.pageSize && this.pageIndex == digitalReceiptsRequest.pageIndex && Intrinsics.e(this.sortType, digitalReceiptsRequest.sortType);
    }

    public int hashCode() {
        return (((((((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.pageIndex)) * 31) + this.sortType.hashCode();
    }

    public String toString() {
        return "DigitalReceiptsRequest(startDate=" + this.startDate + ", endDate=" + this.endDate + ", pageSize=" + this.pageSize + ", pageIndex=" + this.pageIndex + ", sortType=" + this.sortType + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: b, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* renamed from: c, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: d, reason: from getter */
    public final String getSortType() {
        return this.sortType;
    }

    /* renamed from: e, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public /* synthetic */ DigitalReceiptsRequest(String str, String str2, int i10, int i11, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11, (i12 & 16) != 0 ? "SortReceiptByDateDescending" : str3);
    }
}
