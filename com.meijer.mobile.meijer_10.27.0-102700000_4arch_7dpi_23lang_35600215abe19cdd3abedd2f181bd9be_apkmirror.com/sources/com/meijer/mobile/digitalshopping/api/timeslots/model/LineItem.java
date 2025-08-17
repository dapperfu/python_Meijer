package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/LineItem;", "", "", "retailerProductId", "retailerProductIdType", "", "quantity", "", "isAlcohol", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Boolean;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Boolean;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/LineItem;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LineItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String retailerProductId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String retailerProductIdType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isAlcohol;

    public LineItem(@g(name = "retailerProductId") String retailerProductId, @g(name = "retailerProductIdType") String retailerProductIdType, @g(name = "quantity") double d10, @g(name = "isAlcohol") Boolean bool) {
        Intrinsics.j(retailerProductId, "retailerProductId");
        Intrinsics.j(retailerProductIdType, "retailerProductIdType");
        this.retailerProductId = retailerProductId;
        this.retailerProductIdType = retailerProductIdType;
        this.quantity = d10;
        this.isAlcohol = bool;
    }

    public final LineItem copy(@g(name = "retailerProductId") String retailerProductId, @g(name = "retailerProductIdType") String retailerProductIdType, @g(name = "quantity") double quantity, @g(name = "isAlcohol") Boolean isAlcohol) {
        Intrinsics.j(retailerProductId, "retailerProductId");
        Intrinsics.j(retailerProductIdType, "retailerProductIdType");
        return new LineItem(retailerProductId, retailerProductIdType, quantity, isAlcohol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineItem)) {
            return false;
        }
        LineItem lineItem = (LineItem) other;
        return Intrinsics.e(this.retailerProductId, lineItem.retailerProductId) && Intrinsics.e(this.retailerProductIdType, lineItem.retailerProductIdType) && Double.compare(this.quantity, lineItem.quantity) == 0 && Intrinsics.e(this.isAlcohol, lineItem.isAlcohol);
    }

    public int hashCode() {
        int iHashCode = ((((this.retailerProductId.hashCode() * 31) + this.retailerProductIdType.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31;
        Boolean bool = this.isAlcohol;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "LineItem(retailerProductId=" + this.retailerProductId + ", retailerProductIdType=" + this.retailerProductIdType + ", quantity=" + this.quantity + ", isAlcohol=" + this.isAlcohol + ')';
    }

    /* renamed from: a, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: b, reason: from getter */
    public final String getRetailerProductId() {
        return this.retailerProductId;
    }

    /* renamed from: c, reason: from getter */
    public final String getRetailerProductIdType() {
        return this.retailerProductIdType;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getIsAlcohol() {
        return this.isAlcohol;
    }

    public /* synthetic */ LineItem(String str, String str2, double d10, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d10, (i10 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
