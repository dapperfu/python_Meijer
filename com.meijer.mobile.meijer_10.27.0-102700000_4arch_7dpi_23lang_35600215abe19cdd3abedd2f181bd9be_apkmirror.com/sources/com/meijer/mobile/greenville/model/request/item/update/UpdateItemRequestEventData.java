package com.meijer.mobile.greenville.model.request.item.update;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequestEventData;", "", "", "remoteId", "", "quantityWeight", "", "unitEntryType", "<init>", "(IDLjava/lang/String;)V", "copy", "(IDLjava/lang/String;)Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequestEventData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "()D", "c", "Ljava/lang/String;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UpdateItemRequestEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remoteId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityWeight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitEntryType;

    public final UpdateItemRequestEventData copy(@g(name = "lineNumber") int remoteId, @g(name = "quantityWeight") double quantityWeight, @g(name = "unitEntryType") String unitEntryType) {
        Intrinsics.j(unitEntryType, "unitEntryType");
        return new UpdateItemRequestEventData(remoteId, quantityWeight, unitEntryType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateItemRequestEventData)) {
            return false;
        }
        UpdateItemRequestEventData updateItemRequestEventData = (UpdateItemRequestEventData) other;
        return this.remoteId == updateItemRequestEventData.remoteId && Double.compare(this.quantityWeight, updateItemRequestEventData.quantityWeight) == 0 && Intrinsics.e(this.unitEntryType, updateItemRequestEventData.unitEntryType);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.remoteId) * 31) + Double.hashCode(this.quantityWeight)) * 31) + this.unitEntryType.hashCode();
    }

    public String toString() {
        return "UpdateItemRequestEventData(remoteId=" + this.remoteId + ", quantityWeight=" + this.quantityWeight + ", unitEntryType=" + this.unitEntryType + ')';
    }

    public UpdateItemRequestEventData(@g(name = "lineNumber") int i10, @g(name = "quantityWeight") double d10, @g(name = "unitEntryType") String unitEntryType) {
        Intrinsics.j(unitEntryType, "unitEntryType");
        this.remoteId = i10;
        this.quantityWeight = d10;
        this.unitEntryType = unitEntryType;
    }

    /* renamed from: a, reason: from getter */
    public final double getQuantityWeight() {
        return this.quantityWeight;
    }

    /* renamed from: b, reason: from getter */
    public final int getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: c, reason: from getter */
    public final String getUnitEntryType() {
        return this.unitEntryType;
    }
}
