package com.meijer.mobile.shoppinglist.service.responses;

import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/responses/GetFavoritesListResponse;", "", "", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "favoriteListItems", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/shoppinglist/service/responses/GetFavoritesListResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "setFavoriteListItems", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetFavoritesListResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private List<FavoriteListItemWireModel> favoriteListItems;

    /* JADX WARN: Multi-variable type inference failed */
    public GetFavoritesListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final GetFavoritesListResponse copy(@g(name = "favoriteListItems") List<FavoriteListItemWireModel> favoriteListItems) {
        Intrinsics.j(favoriteListItems, "favoriteListItems");
        return new GetFavoritesListResponse(favoriteListItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetFavoritesListResponse) && Intrinsics.e(this.favoriteListItems, ((GetFavoritesListResponse) other).favoriteListItems);
    }

    public int hashCode() {
        return this.favoriteListItems.hashCode();
    }

    public String toString() {
        return "GetFavoritesListResponse(favoriteListItems=" + this.favoriteListItems + ')';
    }

    public GetFavoritesListResponse(@g(name = "favoriteListItems") List<FavoriteListItemWireModel> favoriteListItems) {
        Intrinsics.j(favoriteListItems, "favoriteListItems");
        this.favoriteListItems = favoriteListItems;
    }

    public final List<FavoriteListItemWireModel> a() {
        return this.favoriteListItems;
    }

    public /* synthetic */ GetFavoritesListResponse(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}
