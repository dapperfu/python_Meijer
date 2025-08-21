package com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;", "", "", "itemName", "", "quantityRequested", "<init>", "(Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;I)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnavailableItemsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityRequested;

    public final UnavailableItemsResponse copy(@g(name = "item_name") String itemName, @g(name = "quantity_requested") int quantityRequested) {
        Intrinsics.j(itemName, "itemName");
        return new UnavailableItemsResponse(itemName, quantityRequested);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnavailableItemsResponse)) {
            return false;
        }
        UnavailableItemsResponse unavailableItemsResponse = (UnavailableItemsResponse) other;
        return Intrinsics.e(this.itemName, unavailableItemsResponse.itemName) && this.quantityRequested == unavailableItemsResponse.quantityRequested;
    }

    public int hashCode() {
        return (this.itemName.hashCode() * 31) + Integer.hashCode(this.quantityRequested);
    }

    public String toString() {
        return "UnavailableItemsResponse(itemName=" + this.itemName + ", quantityRequested=" + this.quantityRequested + ')';
    }

    public UnavailableItemsResponse(@g(name = "item_name") String itemName, @g(name = "quantity_requested") int i10) {
        Intrinsics.j(itemName, "itemName");
        this.itemName = itemName;
        this.quantityRequested = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantityRequested() {
        return this.quantityRequested;
    }
}
