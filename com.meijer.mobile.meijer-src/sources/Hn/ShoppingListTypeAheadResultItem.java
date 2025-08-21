package Hn;

import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"LHn/v0;", "", "LFq/a;", "favoriteListItem", "", "title", "", "isFavorite", "<init>", "(LFq/a;Ljava/lang/String;Z)V", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/a;", "getFavoriteListItem", "()LFq/a;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "LFq/c;", "()LFq/c;", "shoppingListItem", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hn.v0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ShoppingListTypeAheadResultItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FavoriteListItem favoriteListItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    @JvmOverloads
    public ShoppingListTypeAheadResultItem() {
        this(null, null, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListTypeAheadResultItem)) {
            return false;
        }
        ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem = (ShoppingListTypeAheadResultItem) other;
        return Intrinsics.e(this.favoriteListItem, shoppingListTypeAheadResultItem.favoriteListItem) && Intrinsics.e(this.title, shoppingListTypeAheadResultItem.title) && this.isFavorite == shoppingListTypeAheadResultItem.isFavorite;
    }

    @JvmOverloads
    public ShoppingListTypeAheadResultItem(FavoriteListItem favoriteListItem, String str, boolean z10) {
        this.favoriteListItem = favoriteListItem;
        this.title = str;
        this.isFavorite = z10;
    }

    public final ShoppingListItem a() {
        ShoppingListItem shoppingListItemD;
        FavoriteListItem favoriteListItem = this.favoriteListItem;
        return (favoriteListItem == null || (shoppingListItemD = Fq.d.d(favoriteListItem)) == null) ? new ShoppingListItem(0L, 0, 0, null, this.title, 0, 0, null, false, false, null, null, null, 0L, null, 32751, null) : shoppingListItemD;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public int hashCode() {
        FavoriteListItem favoriteListItem = this.favoriteListItem;
        int iHashCode = (favoriteListItem == null ? 0 : favoriteListItem.hashCode()) * 31;
        String str = this.title;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFavorite);
    }

    public String toString() {
        return "ShoppingListTypeAheadResultItem(favoriteListItem=" + this.favoriteListItem + ", title=" + this.title + ", isFavorite=" + this.isFavorite + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShoppingListTypeAheadResultItem(FavoriteListItem favoriteListItem, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        favoriteListItem = (i10 & 1) != 0 ? null : favoriteListItem;
        this(favoriteListItem, (i10 & 2) != 0 ? favoriteListItem != null ? favoriteListItem.b() : null : str, (i10 & 4) != 0 ? favoriteListItem != null : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShoppingListTypeAheadResultItem(String title) {
        this(null, title, false);
        Intrinsics.j(title, "title");
    }
}
