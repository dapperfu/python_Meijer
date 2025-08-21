package com.meijer.mobile.shoppinglist.service.responses;

import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010%R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010%R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010(\u001a\u0004\b\u001d\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;", "", "", "listId", "", "listName", "", "listTypeId", "totalCount", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "listItems", "<init>", "(JLjava/lang/String;IILjava/util/List;)V", "copy", "(JLjava/lang/String;IILjava/util/List;)Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "setListId", "(J)V", "b", "Ljava/lang/String;", "c", "setListName", "(Ljava/lang/String;)V", "I", "d", "setListTypeId", "(I)V", "e", "setTotalCount", "Ljava/util/List;", "()Ljava/util/List;", "setListItems", "(Ljava/util/List;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetShoppingListResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long listId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String listName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int listTypeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int totalCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private List<ShoppingListItemWireModel> listItems;

    public GetShoppingListResponse() {
        this(0L, null, 0, 0, null, 31, null);
    }

    public final GetShoppingListResponse copy(@g(name = "listId") long listId, @g(name = "listName") String listName, @g(name = "listTypeId") int listTypeId, @g(name = "totalCount") int totalCount, @g(name = "listItems") List<ShoppingListItemWireModel> listItems) {
        Intrinsics.j(listItems, "listItems");
        return new GetShoppingListResponse(listId, listName, listTypeId, totalCount, listItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetShoppingListResponse)) {
            return false;
        }
        GetShoppingListResponse getShoppingListResponse = (GetShoppingListResponse) other;
        return this.listId == getShoppingListResponse.listId && Intrinsics.e(this.listName, getShoppingListResponse.listName) && this.listTypeId == getShoppingListResponse.listTypeId && this.totalCount == getShoppingListResponse.totalCount && Intrinsics.e(this.listItems, getShoppingListResponse.listItems);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.listId) * 31;
        String str = this.listName;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.listTypeId)) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.listItems.hashCode();
    }

    public String toString() {
        return "GetShoppingListResponse(listId=" + this.listId + ", listName=" + this.listName + ", listTypeId=" + this.listTypeId + ", totalCount=" + this.totalCount + ", listItems=" + this.listItems + ')';
    }

    public GetShoppingListResponse(@g(name = "listId") long j10, @g(name = "listName") String str, @g(name = "listTypeId") int i10, @g(name = "totalCount") int i11, @g(name = "listItems") List<ShoppingListItemWireModel> listItems) {
        Intrinsics.j(listItems, "listItems");
        this.listId = j10;
        this.listName = str;
        this.listTypeId = i10;
        this.totalCount = i11;
        this.listItems = listItems;
    }

    /* renamed from: a, reason: from getter */
    public final long getListId() {
        return this.listId;
    }

    public final List<ShoppingListItemWireModel> b() {
        return this.listItems;
    }

    /* renamed from: c, reason: from getter */
    public final String getListName() {
        return this.listName;
    }

    /* renamed from: d, reason: from getter */
    public final int getListTypeId() {
        return this.listTypeId;
    }

    /* renamed from: e, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public /* synthetic */ GetShoppingListResponse(long j10, String str, int i10, int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? CollectionsKt.m() : list);
    }
}
