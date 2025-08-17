package com.meijer.mobile.shoppinglist.service.requests;

import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListAddItemRequest;", "", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "listItems", "<init>", "(Ljava/util/List;)V", "item", "(Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListAddItemRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShoppingListAddItemRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShoppingListItemWireModel> listItems;

    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingListAddItemRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ShoppingListAddItemRequest copy(@g(name = "listItems") List<ShoppingListItemWireModel> listItems) {
        Intrinsics.j(listItems, "listItems");
        return new ShoppingListAddItemRequest(listItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShoppingListAddItemRequest) && Intrinsics.e(this.listItems, ((ShoppingListAddItemRequest) other).listItems);
    }

    public int hashCode() {
        return this.listItems.hashCode();
    }

    public String toString() {
        return "ShoppingListAddItemRequest(listItems=" + this.listItems + ')';
    }

    public ShoppingListAddItemRequest(@g(name = "listItems") List<ShoppingListItemWireModel> listItems) {
        Intrinsics.j(listItems, "listItems");
        this.listItems = listItems;
    }

    public final List<ShoppingListItemWireModel> a() {
        return this.listItems;
    }

    public /* synthetic */ ShoppingListAddItemRequest(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<ShoppingListItemWireModel>) ((i10 & 1) != 0 ? CollectionsKt.m() : list));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShoppingListAddItemRequest(ShoppingListItemWireModel item) {
        this((List<ShoppingListItemWireModel>) CollectionsKt.e(item));
        Intrinsics.j(item, "item");
    }
}
