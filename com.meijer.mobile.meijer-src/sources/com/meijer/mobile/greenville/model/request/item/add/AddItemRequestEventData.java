package com.meijer.mobile.greenville.model.request.item.add;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;", "", "", "barcodeData", "unitEntryType", "", "quantityWeight", "correlationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "D", "()D", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddItemRequestEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String barcodeData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitEntryType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String correlationId;

    public final AddItemRequestEventData copy(@g(name = "barcodeData") String barcodeData, @g(name = "unitEntryType") String unitEntryType, @g(name = "quantityWeight") double quantityWeight, @g(name = "correlationId") String correlationId) {
        Intrinsics.j(barcodeData, "barcodeData");
        Intrinsics.j(unitEntryType, "unitEntryType");
        Intrinsics.j(correlationId, "correlationId");
        return new AddItemRequestEventData(barcodeData, unitEntryType, quantityWeight, correlationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddItemRequestEventData)) {
            return false;
        }
        AddItemRequestEventData addItemRequestEventData = (AddItemRequestEventData) other;
        return Intrinsics.e(this.barcodeData, addItemRequestEventData.barcodeData) && Intrinsics.e(this.unitEntryType, addItemRequestEventData.unitEntryType) && Double.compare(this.quantityWeight, addItemRequestEventData.quantityWeight) == 0 && Intrinsics.e(this.correlationId, addItemRequestEventData.correlationId);
    }

    public int hashCode() {
        return (((((this.barcodeData.hashCode() * 31) + this.unitEntryType.hashCode()) * 31) + Double.hashCode(this.quantityWeight)) * 31) + this.correlationId.hashCode();
    }

    public String toString() {
        return "AddItemRequestEventData(barcodeData=" + this.barcodeData + ", unitEntryType=" + this.unitEntryType + ", quantityWeight=" + this.quantityWeight + ", correlationId=" + this.correlationId + ')';
    }

    public AddItemRequestEventData(@g(name = "barcodeData") String barcodeData, @g(name = "unitEntryType") String unitEntryType, @g(name = "quantityWeight") double d10, @g(name = "correlationId") String correlationId) {
        Intrinsics.j(barcodeData, "barcodeData");
        Intrinsics.j(unitEntryType, "unitEntryType");
        Intrinsics.j(correlationId, "correlationId");
        this.barcodeData = barcodeData;
        this.unitEntryType = unitEntryType;
        this.quantityWeight = d10;
        this.correlationId = correlationId;
    }

    /* renamed from: a, reason: from getter */
    public final String getBarcodeData() {
        return this.barcodeData;
    }

    /* renamed from: b, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: c, reason: from getter */
    public final double getQuantityWeight() {
        return this.quantityWeight;
    }

    /* renamed from: d, reason: from getter */
    public final String getUnitEntryType() {
        return this.unitEntryType;
    }
}
