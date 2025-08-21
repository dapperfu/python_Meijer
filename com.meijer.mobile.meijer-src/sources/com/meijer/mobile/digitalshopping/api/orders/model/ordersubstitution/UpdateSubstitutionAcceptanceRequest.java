package com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJR\u0010\f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceRequest;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "unitId", "", "acceptedLineItemIds", "rejectedLineItemIds", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UpdateSubstitutionAcceptanceRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> acceptedLineItemIds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> rejectedLineItemIds;

    public UpdateSubstitutionAcceptanceRequest() {
        this(null, null, null, null, 15, null);
    }

    public final UpdateSubstitutionAcceptanceRequest copy(@g(name = "orderId") String orderId, @g(name = "unitId") Integer unitId, @g(name = "acceptedLineItemIds") List<Integer> acceptedLineItemIds, @g(name = "rejectedLineItemIds") List<Integer> rejectedLineItemIds) {
        return new UpdateSubstitutionAcceptanceRequest(orderId, unitId, acceptedLineItemIds, rejectedLineItemIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateSubstitutionAcceptanceRequest)) {
            return false;
        }
        UpdateSubstitutionAcceptanceRequest updateSubstitutionAcceptanceRequest = (UpdateSubstitutionAcceptanceRequest) other;
        return Intrinsics.e(this.orderId, updateSubstitutionAcceptanceRequest.orderId) && Intrinsics.e(this.unitId, updateSubstitutionAcceptanceRequest.unitId) && Intrinsics.e(this.acceptedLineItemIds, updateSubstitutionAcceptanceRequest.acceptedLineItemIds) && Intrinsics.e(this.rejectedLineItemIds, updateSubstitutionAcceptanceRequest.rejectedLineItemIds);
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.unitId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.acceptedLineItemIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.rejectedLineItemIds;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "UpdateSubstitutionAcceptanceRequest(orderId=" + this.orderId + ", unitId=" + this.unitId + ", acceptedLineItemIds=" + this.acceptedLineItemIds + ", rejectedLineItemIds=" + this.rejectedLineItemIds + ')';
    }

    public UpdateSubstitutionAcceptanceRequest(@g(name = "orderId") String str, @g(name = "unitId") Integer num, @g(name = "acceptedLineItemIds") List<Integer> list, @g(name = "rejectedLineItemIds") List<Integer> list2) {
        this.orderId = str;
        this.unitId = num;
        this.acceptedLineItemIds = list;
        this.rejectedLineItemIds = list2;
    }

    public final List<Integer> a() {
        return this.acceptedLineItemIds;
    }

    /* renamed from: b, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final List<Integer> c() {
        return this.rejectedLineItemIds;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getUnitId() {
        return this.unitId;
    }

    public /* synthetic */ UpdateSubstitutionAcceptanceRequest(String str, Integer num, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? CollectionsKt.m() : list2);
    }
}
