package com.meijer.mobile.shoppinglist.service.requests;

import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;", "", "", "Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest$AddItemInfo;", "listItems", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "AddItemInfo", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddFavoriteItemsToShoppingListRequest {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AddItemInfo> listItems;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest$AddItemInfo;", "", "", "listItemId", "", "itemPartNumber", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest$AddItemInfo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddItemInfo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long listItemId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String itemPartNumber;

        public AddItemInfo(@g(name = "listItemId") long j10, @g(name = "itemPartNumber") String str) {
            this.listItemId = j10;
            this.itemPartNumber = str;
        }

        public final AddItemInfo copy(@g(name = "listItemId") long listItemId, @g(name = "itemPartNumber") String itemPartNumber) {
            return new AddItemInfo(listItemId, itemPartNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddItemInfo)) {
                return false;
            }
            AddItemInfo addItemInfo = (AddItemInfo) other;
            return this.listItemId == addItemInfo.listItemId && Intrinsics.e(this.itemPartNumber, addItemInfo.itemPartNumber);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.listItemId) * 31;
            String str = this.itemPartNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AddItemInfo(listItemId=" + this.listItemId + ", itemPartNumber=" + this.itemPartNumber + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getItemPartNumber() {
            return this.itemPartNumber;
        }

        /* renamed from: b, reason: from getter */
        public final long getListItemId() {
            return this.listItemId;
        }

        public /* synthetic */ AddItemInfo(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest$a;", "", "<init>", "()V", "", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "favoriteListItems", "Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;", "a", "(Ljava/util/List;)Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.service.requests.AddFavoriteItemsToShoppingListRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddFavoriteItemsToShoppingListRequest a(List<FavoriteListItemWireModel> favoriteListItems) {
            Intrinsics.j(favoriteListItems, "favoriteListItems");
            List<FavoriteListItemWireModel> list = favoriteListItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (FavoriteListItemWireModel favoriteListItemWireModel : list) {
                arrayList.add(new AddItemInfo(favoriteListItemWireModel.getListItemId(), favoriteListItemWireModel.getItemPartNumber()));
            }
            return new AddFavoriteItemsToShoppingListRequest(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddFavoriteItemsToShoppingListRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AddFavoriteItemsToShoppingListRequest copy(@g(name = "listItems") List<AddItemInfo> listItems) {
        Intrinsics.j(listItems, "listItems");
        return new AddFavoriteItemsToShoppingListRequest(listItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddFavoriteItemsToShoppingListRequest) && Intrinsics.e(this.listItems, ((AddFavoriteItemsToShoppingListRequest) other).listItems);
    }

    public int hashCode() {
        return this.listItems.hashCode();
    }

    public String toString() {
        return "AddFavoriteItemsToShoppingListRequest(listItems=" + this.listItems + ')';
    }

    public AddFavoriteItemsToShoppingListRequest(@g(name = "listItems") List<AddItemInfo> listItems) {
        Intrinsics.j(listItems, "listItems");
        this.listItems = listItems;
    }

    public final List<AddItemInfo> a() {
        return this.listItems;
    }

    public /* synthetic */ AddFavoriteItemsToShoppingListRequest(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}
