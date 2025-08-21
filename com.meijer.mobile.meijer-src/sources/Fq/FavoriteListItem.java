package Fq;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nk.f;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u00101R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u00101R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u0010!\"\u0004\b6\u00107R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b-\u0010!\"\u0004\b8\u00107R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"LFq/a;", "Landroid/os/Parcelable;", "", "listItemId", "", "listItemTypeId", "itemDisplayOrder", "", "itemPartNumber", "itemDescription", "", "isItemInActiveList", "<init>", "(JIILjava/lang/String;Ljava/lang/String;Z)V", "Lnk/c;", "product", "(Lnk/c;)V", "LFq/c;", "item", "isShoppingListCounterpart", "(LFq/c;Z)V", "Lnk/f;", "h", "(Lnk/f;)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "()Ljava/lang/String;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "setListItemId", "(J)V", "b", "I", "f", "setListItemTypeId", "(I)V", "c", "setItemDisplayOrder", "d", "Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "i", "Z", "g", "()Z", "j", "(Z)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fq.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class FavoriteListItem implements Parcelable {
    public static final Parcelable.Creator<FavoriteListItem> CREATOR = new C0177a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long listItemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int listItemTypeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int itemDisplayOrder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String itemPartNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String itemDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isItemInActiveList;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fq.a$a, reason: collision with other inner class name */
    public static final class C0177a implements Parcelable.Creator<FavoriteListItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FavoriteListItem createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FavoriteListItem(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FavoriteListItem[] newArray(int i10) {
            return new FavoriteListItem[i10];
        }
    }

    @JvmOverloads
    public FavoriteListItem() {
        this(0L, 0, 0, null, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteListItem)) {
            return false;
        }
        FavoriteListItem favoriteListItem = (FavoriteListItem) other;
        return this.listItemId == favoriteListItem.listItemId && this.listItemTypeId == favoriteListItem.listItemTypeId && this.itemDisplayOrder == favoriteListItem.itemDisplayOrder && Intrinsics.e(this.itemPartNumber, favoriteListItem.itemPartNumber) && Intrinsics.e(this.itemDescription, favoriteListItem.itemDescription) && this.isItemInActiveList == favoriteListItem.isItemInActiveList;
    }

    public final boolean h(f product) {
        if (product == null) {
            return false;
        }
        if (Intrinsics.e(this.itemPartNumber, product.getCode())) {
            return true;
        }
        String str = this.itemDescription;
        if (str == null || StringsKt.s0(str) || !(product instanceof nk.c)) {
            return false;
        }
        nk.c cVar = (nk.c) product;
        return Intrinsics.e(this.itemDescription, cVar.getName()) || Intrinsics.e(this.itemDescription, StringsKt.N1(cVar.getName(), 100));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.listItemId);
        dest.writeInt(this.listItemTypeId);
        dest.writeInt(this.itemDisplayOrder);
        dest.writeString(this.itemPartNumber);
        dest.writeString(this.itemDescription);
        dest.writeInt(this.isItemInActiveList ? 1 : 0);
    }

    @JvmOverloads
    public FavoriteListItem(long j10, int i10, int i11, String str, String str2, boolean z10) {
        this.listItemId = j10;
        this.listItemTypeId = i10;
        this.itemDisplayOrder = i11;
        this.itemPartNumber = str;
        this.itemDescription = str2;
        this.isItemInActiveList = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    public final String b() {
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
    public final boolean getIsItemInActiveList() {
        return this.isItemInActiveList;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.listItemId) * 31) + Integer.hashCode(this.listItemTypeId)) * 31) + Integer.hashCode(this.itemDisplayOrder)) * 31;
        String str = this.itemPartNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDescription;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isItemInActiveList);
    }

    public final void i(String str) {
        this.itemDescription = str;
    }

    public final void j(boolean z10) {
        this.isItemInActiveList = z10;
    }

    public final void k(String str) {
        this.itemPartNumber = str;
    }

    public String toString() {
        return "FavoriteListItem(listItemId=" + this.listItemId + ", listItemTypeId=" + this.listItemTypeId + ", itemDisplayOrder=" + this.itemDisplayOrder + ", itemPartNumber=" + this.itemPartNumber + ", itemDescription=" + this.itemDescription + ", isItemInActiveList=" + this.isItemInActiveList + ')';
    }

    public /* synthetic */ FavoriteListItem(long j10, int i10, int i11, String str, String str2, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavoriteListItem(nk.c product) {
        Intrinsics.j(product, "product");
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        this(j10, i10, i11, product.getCode(), product.getName(), false, 39, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavoriteListItem(ShoppingListItem item, boolean z10) {
        Intrinsics.j(item, "item");
        String itemDescription = item.getItemDescription();
        this(z10 ? item.getListItemId() : 0L, 0, 0, item.getItemPartNumber(), itemDescription, false, 38, null);
    }
}
