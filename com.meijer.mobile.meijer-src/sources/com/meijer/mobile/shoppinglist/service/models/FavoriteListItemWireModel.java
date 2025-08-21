package com.meijer.mobile.shoppinglist.service.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "", "", "listItemId", "", "listItemTypeId", "itemDisplayOrder", "", "itemPartNumber", "itemDescription", "", "isItemInActiveList", "<init>", "(JIILjava/lang/String;Ljava/lang/String;Z)V", "copy", "(JIILjava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "I", "e", "c", "Ljava/lang/String;", "f", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteListItemWireModel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long listItemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int listItemTypeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemDisplayOrder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPartNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isItemInActiveList;

    public FavoriteListItemWireModel() {
        this(0L, 0, 0, null, null, false, 63, null);
    }

    public final FavoriteListItemWireModel copy(@g(name = "listItemId") long listItemId, @g(name = "listItemTypeId") int listItemTypeId, @g(name = "itemDisplayOrder") int itemDisplayOrder, @g(name = "itemPartNumber") String itemPartNumber, @g(name = "itemDescription") String itemDescription, @g(name = "isItemInActiveList") boolean isItemInActiveList) {
        return new FavoriteListItemWireModel(listItemId, listItemTypeId, itemDisplayOrder, itemPartNumber, itemDescription, isItemInActiveList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteListItemWireModel)) {
            return false;
        }
        FavoriteListItemWireModel favoriteListItemWireModel = (FavoriteListItemWireModel) other;
        return this.listItemId == favoriteListItemWireModel.listItemId && this.listItemTypeId == favoriteListItemWireModel.listItemTypeId && this.itemDisplayOrder == favoriteListItemWireModel.itemDisplayOrder && Intrinsics.e(this.itemPartNumber, favoriteListItemWireModel.itemPartNumber) && Intrinsics.e(this.itemDescription, favoriteListItemWireModel.itemDescription) && this.isItemInActiveList == favoriteListItemWireModel.isItemInActiveList;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.listItemId) * 31) + Integer.hashCode(this.listItemTypeId)) * 31) + Integer.hashCode(this.itemDisplayOrder)) * 31;
        String str = this.itemPartNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDescription;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isItemInActiveList);
    }

    public String toString() {
        return "FavoriteListItemWireModel(listItemId=" + this.listItemId + ", listItemTypeId=" + this.listItemTypeId + ", itemDisplayOrder=" + this.itemDisplayOrder + ", itemPartNumber=" + this.itemPartNumber + ", itemDescription=" + this.itemDescription + ", isItemInActiveList=" + this.isItemInActiveList + ')';
    }

    public FavoriteListItemWireModel(@g(name = "listItemId") long j10, @g(name = "listItemTypeId") int i10, @g(name = "itemDisplayOrder") int i11, @g(name = "itemPartNumber") String str, @g(name = "itemDescription") String str2, @g(name = "isItemInActiveList") boolean z10) {
        this.listItemId = j10;
        this.listItemTypeId = i10;
        this.itemDisplayOrder = i11;
        this.itemPartNumber = str;
        this.itemDescription = str2;
        this.isItemInActiveList = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    /* renamed from: b, reason: from getter */
    public final int getItemDisplayOrder() {
        return this.itemDisplayOrder;
    }

    /* renamed from: c, reason: from getter */
    public final String getItemPartNumber() {
        return this.itemPartNumber;
    }

    /* renamed from: d, reason: from getter */
    public final long getListItemId() {
        return this.listItemId;
    }

    /* renamed from: e, reason: from getter */
    public final int getListItemTypeId() {
        return this.listItemTypeId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsItemInActiveList() {
        return this.isItemInActiveList;
    }

    public /* synthetic */ FavoriteListItemWireModel(long j10, int i10, int i11, String str, String str2, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? false : z10);
    }
}
