package com.meijer.mobile.greenville.model.request.item.remove;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequestEventData;", "", "", "", "remoteIds", "", "reasonCode", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequestEventData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RemoveItemRequestEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> remoteIds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reasonCode;

    public RemoveItemRequestEventData(@g(name = "lineNumbers") List<Integer> remoteIds, @g(name = "reasonCode") String reasonCode) {
        Intrinsics.j(remoteIds, "remoteIds");
        Intrinsics.j(reasonCode, "reasonCode");
        this.remoteIds = remoteIds;
        this.reasonCode = reasonCode;
    }

    public final RemoveItemRequestEventData copy(@g(name = "lineNumbers") List<Integer> remoteIds, @g(name = "reasonCode") String reasonCode) {
        Intrinsics.j(remoteIds, "remoteIds");
        Intrinsics.j(reasonCode, "reasonCode");
        return new RemoveItemRequestEventData(remoteIds, reasonCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveItemRequestEventData)) {
            return false;
        }
        RemoveItemRequestEventData removeItemRequestEventData = (RemoveItemRequestEventData) other;
        return Intrinsics.e(this.remoteIds, removeItemRequestEventData.remoteIds) && Intrinsics.e(this.reasonCode, removeItemRequestEventData.reasonCode);
    }

    public int hashCode() {
        return (this.remoteIds.hashCode() * 31) + this.reasonCode.hashCode();
    }

    public String toString() {
        return "RemoveItemRequestEventData(remoteIds=" + this.remoteIds + ", reasonCode=" + this.reasonCode + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getReasonCode() {
        return this.reasonCode;
    }

    public final List<Integer> b() {
        return this.remoteIds;
    }

    public /* synthetic */ RemoveItemRequestEventData(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? "0" : str);
    }
}
