package com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/AvailableItemsResponse;", "", "", "quantityRequested", "", "itemName", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;", "product", "<init>", "(ILjava/lang/String;Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;)V", "copy", "(ILjava/lang/String;Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/AvailableItemsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;", "()Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvailableItemsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityRequested;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ItemResponse product;

    public AvailableItemsResponse(@g(name = "quantity_requested") int i10, @g(name = "item_name") String str, @g(name = "product") ItemResponse product) {
        Intrinsics.j(product, "product");
        this.quantityRequested = i10;
        this.itemName = str;
        this.product = product;
    }

    public final AvailableItemsResponse copy(@g(name = "quantity_requested") int quantityRequested, @g(name = "item_name") String itemName, @g(name = "product") ItemResponse product) {
        Intrinsics.j(product, "product");
        return new AvailableItemsResponse(quantityRequested, itemName, product);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableItemsResponse)) {
            return false;
        }
        AvailableItemsResponse availableItemsResponse = (AvailableItemsResponse) other;
        return this.quantityRequested == availableItemsResponse.quantityRequested && Intrinsics.e(this.itemName, availableItemsResponse.itemName) && Intrinsics.e(this.product, availableItemsResponse.product);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.quantityRequested) * 31;
        String str = this.itemName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.product.hashCode();
    }

    public String toString() {
        return "AvailableItemsResponse(quantityRequested=" + this.quantityRequested + ", itemName=" + this.itemName + ", product=" + this.product + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: b, reason: from getter */
    public final ItemResponse getProduct() {
        return this.product;
    }

    /* renamed from: c, reason: from getter */
    public final int getQuantityRequested() {
        return this.quantityRequested;
    }

    public /* synthetic */ AvailableItemsResponse(int i10, String str, ItemResponse itemResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, itemResponse);
    }
}
