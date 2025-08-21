package io.constructor.data.model.purchase;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lio/constructor/data/model/purchase/PurchaseItem;", "Ljava/io/Serializable;", "itemId", "", "variationId", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getItemId", "()Ljava/lang/String;", "getQuantity", "()I", "getVariationId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PurchaseItem implements Serializable {
    private final String itemId;
    private final transient int quantity;
    private final String variationId;

    public PurchaseItem(@g(name = "item_id") String str, @g(name = "variation_id") String str2, int i10) {
        this.itemId = str;
        this.variationId = str2;
        this.quantity = i10;
    }

    public static /* synthetic */ PurchaseItem copy$default(PurchaseItem purchaseItem, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = purchaseItem.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = purchaseItem.variationId;
        }
        if ((i11 & 4) != 0) {
            i10 = purchaseItem.quantity;
        }
        return purchaseItem.copy(str, str2, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final PurchaseItem copy(@g(name = "item_id") String itemId, @g(name = "variation_id") String variationId, int quantity) {
        return new PurchaseItem(itemId, variationId, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseItem)) {
            return false;
        }
        PurchaseItem purchaseItem = (PurchaseItem) other;
        return Intrinsics.e(this.itemId, purchaseItem.itemId) && Intrinsics.e(this.variationId, purchaseItem.variationId) && this.quantity == purchaseItem.quantity;
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variationId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        return "PurchaseItem(itemId=" + this.itemId + ", variationId=" + this.variationId + ", quantity=" + this.quantity + ")";
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getVariationId() {
        return this.variationId;
    }

    public /* synthetic */ PurchaseItem(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 1 : i10);
    }
}
