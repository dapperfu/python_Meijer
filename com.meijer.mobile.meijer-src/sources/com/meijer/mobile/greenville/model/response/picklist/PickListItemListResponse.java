package com.meijer.mobile.greenville.model.response.picklist;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponse;", "", "", "isSyncRequired", "", "Lcom/meijer/mobile/greenville/model/response/picklist/PicklistItemResponse;", "items", "Lcom/meijer/mobile/greenville/model/response/picklist/PicklistGroupResponse;", "groups", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "copy", "(ZLjava/util/List;Ljava/util/List;)Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PickListItemListResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSyncRequired;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PicklistItemResponse> items;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PicklistGroupResponse> groups;

    public final PickListItemListResponse copy(@g(name = "isSyncRequired") boolean isSyncRequired, @g(name = "items") List<PicklistItemResponse> items, @g(name = "groups") List<PicklistGroupResponse> groups) {
        Intrinsics.j(items, "items");
        Intrinsics.j(groups, "groups");
        return new PickListItemListResponse(isSyncRequired, items, groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickListItemListResponse)) {
            return false;
        }
        PickListItemListResponse pickListItemListResponse = (PickListItemListResponse) other;
        return this.isSyncRequired == pickListItemListResponse.isSyncRequired && Intrinsics.e(this.items, pickListItemListResponse.items) && Intrinsics.e(this.groups, pickListItemListResponse.groups);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSyncRequired) * 31) + this.items.hashCode()) * 31) + this.groups.hashCode();
    }

    public String toString() {
        return "PickListItemListResponse(isSyncRequired=" + this.isSyncRequired + ", items=" + this.items + ", groups=" + this.groups + ')';
    }

    public PickListItemListResponse(@g(name = "isSyncRequired") boolean z10, @g(name = "items") List<PicklistItemResponse> items, @g(name = "groups") List<PicklistGroupResponse> groups) {
        Intrinsics.j(items, "items");
        Intrinsics.j(groups, "groups");
        this.isSyncRequired = z10;
        this.items = items;
        this.groups = groups;
    }

    public final List<PicklistGroupResponse> a() {
        return this.groups;
    }

    public final List<PicklistItemResponse> b() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSyncRequired() {
        return this.isSyncRequired;
    }
}
