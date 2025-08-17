package com.meijer.mobile.shoppinglist.service.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0001\u001fB¥\u0001\b\u0007\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J¬\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b(\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b)\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001f\u00106¨\u00068"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "", "", "listItemId", "", "itemDescription", "", "quantity", "itemPartNumber", "listItemTypeId", "itemDisplayOrder", "storeId", "notes", "", "isComplete", "isFavorite", "listingId", "promotionStart", "promotionEnd", "couponId", "<init>", "(JLjava/lang/String;ILjava/lang/String;IILjava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "copy", "(JLjava/lang/String;ILjava/lang/String;IILjava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "c", "I", "k", "d", "f", "g", "Ljava/lang/Integer;", "l", "()Ljava/lang/Integer;", "h", "i", "Z", "m", "()Z", "j", "n", "Ljava/lang/Long;", "()Ljava/lang/Long;", "o", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShoppingListItemWireModel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long listItemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPartNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int listItemTypeId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemDisplayOrder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer storeId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isComplete;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String listingId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionStart;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionEnd;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long couponId;

    @JvmOverloads
    public ShoppingListItemWireModel() {
        this(0L, null, 0, null, 0, 0, null, null, false, false, null, null, null, null, 16383, null);
    }

    public final ShoppingListItemWireModel copy(@g(name = "listItemId") long listItemId, @g(name = "itemDescription") String itemDescription, @g(name = "quantity") int quantity, @g(name = "itemPartNumber") String itemPartNumber, @g(name = "listItemTypeId") int listItemTypeId, @g(name = "itemDisplayOrder") int itemDisplayOrder, @g(name = "storeId") Integer storeId, @g(name = "notes") String notes, @g(name = "isComplete") boolean isComplete, @g(name = "isFavorite") boolean isFavorite, @g(name = "listingId") String listingId, @g(name = "promotionStart") String promotionStart, @g(name = "promotionEnd") String promotionEnd, @g(name = "couponId") Long couponId) {
        return new ShoppingListItemWireModel(listItemId, itemDescription, quantity, itemPartNumber, listItemTypeId, itemDisplayOrder, storeId, notes, isComplete, isFavorite, listingId, promotionStart, promotionEnd, couponId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListItemWireModel)) {
            return false;
        }
        ShoppingListItemWireModel shoppingListItemWireModel = (ShoppingListItemWireModel) other;
        return this.listItemId == shoppingListItemWireModel.listItemId && Intrinsics.e(this.itemDescription, shoppingListItemWireModel.itemDescription) && this.quantity == shoppingListItemWireModel.quantity && Intrinsics.e(this.itemPartNumber, shoppingListItemWireModel.itemPartNumber) && this.listItemTypeId == shoppingListItemWireModel.listItemTypeId && this.itemDisplayOrder == shoppingListItemWireModel.itemDisplayOrder && Intrinsics.e(this.storeId, shoppingListItemWireModel.storeId) && Intrinsics.e(this.notes, shoppingListItemWireModel.notes) && this.isComplete == shoppingListItemWireModel.isComplete && this.isFavorite == shoppingListItemWireModel.isFavorite && Intrinsics.e(this.listingId, shoppingListItemWireModel.listingId) && Intrinsics.e(this.promotionStart, shoppingListItemWireModel.promotionStart) && Intrinsics.e(this.promotionEnd, shoppingListItemWireModel.promotionEnd) && Intrinsics.e(this.couponId, shoppingListItemWireModel.couponId);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.listItemId) * 31;
        String str = this.itemDescription;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str2 = this.itemPartNumber;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.listItemTypeId)) * 31) + Integer.hashCode(this.itemDisplayOrder)) * 31;
        Integer num = this.storeId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.notes;
        int iHashCode5 = (((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isComplete)) * 31) + Boolean.hashCode(this.isFavorite)) * 31;
        String str4 = this.listingId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promotionStart;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promotionEnd;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l10 = this.couponId;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "ShoppingListItemWireModel(listItemId=" + this.listItemId + ", itemDescription=" + this.itemDescription + ", quantity=" + this.quantity + ", itemPartNumber=" + this.itemPartNumber + ", listItemTypeId=" + this.listItemTypeId + ", itemDisplayOrder=" + this.itemDisplayOrder + ", storeId=" + this.storeId + ", notes=" + this.notes + ", isComplete=" + this.isComplete + ", isFavorite=" + this.isFavorite + ", listingId=" + this.listingId + ", promotionStart=" + this.promotionStart + ", promotionEnd=" + this.promotionEnd + ", couponId=" + this.couponId + ')';
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10) {
        this(j10, null, 0, null, 0, 0, null, null, false, false, null, null, null, null, 16382, null);
    }

    /* renamed from: a, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    /* renamed from: b, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    /* renamed from: c, reason: from getter */
    public final int getItemDisplayOrder() {
        return this.itemDisplayOrder;
    }

    /* renamed from: d, reason: from getter */
    public final String getItemPartNumber() {
        return this.itemPartNumber;
    }

    /* renamed from: e, reason: from getter */
    public final long getListItemId() {
        return this.listItemId;
    }

    /* renamed from: f, reason: from getter */
    public final int getListItemTypeId() {
        return this.listItemTypeId;
    }

    /* renamed from: g, reason: from getter */
    public final String getListingId() {
        return this.listingId;
    }

    /* renamed from: h, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: i, reason: from getter */
    public final String getPromotionEnd() {
        return this.promotionEnd;
    }

    /* renamed from: j, reason: from getter */
    public final String getPromotionStart() {
        return this.promotionStart;
    }

    /* renamed from: k, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: l, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str) {
        this(j10, str, 0, null, 0, 0, null, null, false, false, null, null, null, null, 16380, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10) {
        this(j10, str, i10, null, 0, 0, null, null, false, false, null, null, null, null, 16376, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2) {
        this(j10, str, i10, str2, 0, 0, null, null, false, false, null, null, null, null, 16368, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11) {
        this(j10, str, i10, str2, i11, 0, null, null, false, false, null, null, null, null, 16352, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12) {
        this(j10, str, i10, str2, i11, i12, null, null, false, false, null, null, null, null, 16320, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num) {
        this(j10, str, i10, str2, i11, i12, num, null, false, false, null, null, null, null, 16256, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3) {
        this(j10, str, i10, str2, i11, i12, num, str3, false, false, null, null, null, null, 16128, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10) {
        this(j10, str, i10, str2, i11, i12, num, str3, z10, false, null, null, null, null, 15872, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10, @g(name = "isFavorite") boolean z11) {
        this(j10, str, i10, str2, i11, i12, num, str3, z10, z11, null, null, null, null, 15360, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10, @g(name = "isFavorite") boolean z11, @g(name = "listingId") String str4) {
        this(j10, str, i10, str2, i11, i12, num, str3, z10, z11, str4, null, null, null, 14336, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10, @g(name = "isFavorite") boolean z11, @g(name = "listingId") String str4, @g(name = "promotionStart") String str5) {
        this(j10, str, i10, str2, i11, i12, num, str3, z10, z11, str4, str5, null, null, 12288, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10, @g(name = "isFavorite") boolean z11, @g(name = "listingId") String str4, @g(name = "promotionStart") String str5, @g(name = "promotionEnd") String str6) {
        this(j10, str, i10, str2, i11, i12, num, str3, z10, z11, str4, str5, str6, null, 8192, null);
    }

    @JvmOverloads
    public ShoppingListItemWireModel(@g(name = "listItemId") long j10, @g(name = "itemDescription") String str, @g(name = "quantity") int i10, @g(name = "itemPartNumber") String str2, @g(name = "listItemTypeId") int i11, @g(name = "itemDisplayOrder") int i12, @g(name = "storeId") Integer num, @g(name = "notes") String str3, @g(name = "isComplete") boolean z10, @g(name = "isFavorite") boolean z11, @g(name = "listingId") String str4, @g(name = "promotionStart") String str5, @g(name = "promotionEnd") String str6, @g(name = "couponId") Long l10) {
        this.listItemId = j10;
        this.itemDescription = str;
        this.quantity = i10;
        this.itemPartNumber = str2;
        this.listItemTypeId = i11;
        this.itemDisplayOrder = i12;
        this.storeId = num;
        this.notes = str3;
        this.isComplete = z10;
        this.isFavorite = z11;
        this.listingId = str4;
        this.promotionStart = str5;
        this.promotionEnd = str6;
        this.couponId = l10;
    }

    public /* synthetic */ ShoppingListItemWireModel(long j10, String str, int i10, String str2, int i11, int i12, Integer num, String str3, boolean z10, boolean z11, String str4, String str5, String str6, Long l10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? 1 : i10, (i13 & 8) != 0 ? null : str2, (i13 & 16) == 0 ? i11 : 1, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? 0 : num, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? false : z10, (i13 & 512) == 0 ? z11 : false, (i13 & 1024) != 0 ? null : str4, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str5, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? str6 : null, (i13 & 8192) != 0 ? 0L : l10);
    }
}
