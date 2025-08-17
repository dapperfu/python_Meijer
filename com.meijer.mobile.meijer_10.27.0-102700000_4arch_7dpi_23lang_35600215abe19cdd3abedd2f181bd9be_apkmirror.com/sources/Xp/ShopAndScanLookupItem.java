package Xp;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"LXp/d;", "", "", PreferencesHelper.PREF_ID, "title", "", "quantity", "LXp/a;", "barcode", "", "unitPrice", "imageUrl", "", "isWeighted", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILXp/a;Ljava/lang/Double;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "I", "d", "LXp/a;", "()LXp/a;", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "g", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xp.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanLookupItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a barcode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double unitPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWeighted;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanLookupItem)) {
            return false;
        }
        ShopAndScanLookupItem shopAndScanLookupItem = (ShopAndScanLookupItem) other;
        return Intrinsics.e(this.id, shopAndScanLookupItem.id) && Intrinsics.e(this.title, shopAndScanLookupItem.title) && this.quantity == shopAndScanLookupItem.quantity && Intrinsics.e(this.barcode, shopAndScanLookupItem.barcode) && Intrinsics.e(this.unitPrice, shopAndScanLookupItem.unitPrice) && Intrinsics.e(this.imageUrl, shopAndScanLookupItem.imageUrl) && this.isWeighted == shopAndScanLookupItem.isWeighted;
    }

    public ShopAndScanLookupItem(String id2, String title, int i10, a barcode, Double d10, String str, boolean z10) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(barcode, "barcode");
        this.id = id2;
        this.title = title;
        this.quantity = i10;
        this.barcode = barcode;
        this.unitPrice = d10;
        this.imageUrl = str;
        this.isWeighted = z10;
    }

    /* renamed from: a, reason: from getter */
    public final a getBarcode() {
        return this.barcode;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final Double getUnitPrice() {
        return this.unitPrice;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsWeighted() {
        return this.isWeighted;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.barcode.hashCode()) * 31;
        Double d10 = this.unitPrice;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.imageUrl;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isWeighted);
    }

    public String toString() {
        return "ShopAndScanLookupItem(id=" + this.id + ", title=" + this.title + ", quantity=" + this.quantity + ", barcode=" + this.barcode + ", unitPrice=" + this.unitPrice + ", imageUrl=" + this.imageUrl + ", isWeighted=" + this.isWeighted + ')';
    }
}
