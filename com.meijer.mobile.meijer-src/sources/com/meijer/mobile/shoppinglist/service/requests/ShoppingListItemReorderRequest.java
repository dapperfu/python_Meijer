package com.meijer.mobile.shoppinglist.service.requests;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;", "", "", "itemId", "itemBelowId", "<init>", "(JJ)V", "copy", "(JJ)Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "setItemId", "(J)V", "setItemBelowId", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingListItemReorderRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long itemBelowId;

    public final ShoppingListItemReorderRequest copy(@g(name = "itemId") long itemId, @g(name = "listItemPositionId") long itemBelowId) {
        return new ShoppingListItemReorderRequest(itemId, itemBelowId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListItemReorderRequest)) {
            return false;
        }
        ShoppingListItemReorderRequest shoppingListItemReorderRequest = (ShoppingListItemReorderRequest) other;
        return this.itemId == shoppingListItemReorderRequest.itemId && this.itemBelowId == shoppingListItemReorderRequest.itemBelowId;
    }

    public int hashCode() {
        return (Long.hashCode(this.itemId) * 31) + Long.hashCode(this.itemBelowId);
    }

    public String toString() {
        return "ShoppingListItemReorderRequest(itemId=" + this.itemId + ", itemBelowId=" + this.itemBelowId + ')';
    }

    /* renamed from: a, reason: from getter */
    public final long getItemBelowId() {
        return this.itemBelowId;
    }

    /* renamed from: b, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    public ShoppingListItemReorderRequest(@g(name = "itemId") long j10, @g(name = "listItemPositionId") long j11) {
        this.itemId = j10;
        this.itemBelowId = j11;
    }
}
