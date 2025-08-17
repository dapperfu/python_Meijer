package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsResponseJson;", "", "", "receiptsCount", "", "Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptJson;", "receiptsList", "Lcom/meijer/mobile/receipt/service/api/models/MonthSavingsSummaryJson;", "savingsByMonth", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "copy", "(ILjava/util/List;Ljava/util/List;)Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsResponseJson;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DigitalReceiptsResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int receiptsCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DigitalReceiptJson> receiptsList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MonthSavingsSummaryJson> savingsByMonth;

    public DigitalReceiptsResponseJson() {
        this(0, null, null, 7, null);
    }

    public final DigitalReceiptsResponseJson copy(@g(name = "totalReceiptCount") int receiptsCount, @g(name = "receipts") List<DigitalReceiptJson> receiptsList, @g(name = "months") List<MonthSavingsSummaryJson> savingsByMonth) {
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        return new DigitalReceiptsResponseJson(receiptsCount, receiptsList, savingsByMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalReceiptsResponseJson)) {
            return false;
        }
        DigitalReceiptsResponseJson digitalReceiptsResponseJson = (DigitalReceiptsResponseJson) other;
        return this.receiptsCount == digitalReceiptsResponseJson.receiptsCount && Intrinsics.e(this.receiptsList, digitalReceiptsResponseJson.receiptsList) && Intrinsics.e(this.savingsByMonth, digitalReceiptsResponseJson.savingsByMonth);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.receiptsCount) * 31;
        List<DigitalReceiptJson> list = this.receiptsList;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.savingsByMonth.hashCode();
    }

    public String toString() {
        return "DigitalReceiptsResponseJson(receiptsCount=" + this.receiptsCount + ", receiptsList=" + this.receiptsList + ", savingsByMonth=" + this.savingsByMonth + ')';
    }

    public DigitalReceiptsResponseJson(@g(name = "totalReceiptCount") int i10, @g(name = "receipts") List<DigitalReceiptJson> list, @g(name = "months") List<MonthSavingsSummaryJson> savingsByMonth) {
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        this.receiptsCount = i10;
        this.receiptsList = list;
        this.savingsByMonth = savingsByMonth;
    }

    /* renamed from: a, reason: from getter */
    public final int getReceiptsCount() {
        return this.receiptsCount;
    }

    public final List<DigitalReceiptJson> b() {
        return this.receiptsList;
    }

    public final List<MonthSavingsSummaryJson> c() {
        return this.savingsByMonth;
    }

    public /* synthetic */ DigitalReceiptsResponseJson(int i10, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? CollectionsKt.m() : list2);
    }
}
