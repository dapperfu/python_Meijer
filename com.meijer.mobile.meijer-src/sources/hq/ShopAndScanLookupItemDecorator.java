package hq;

import Xp.ShopAndScanLookupItem;
import bk.AbstractC6392a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001\u0017BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011¨\u0006("}, d2 = {"Lhq/g;", "", "", PreferencesHelper.PREF_ID, "title", "", "quantity", "LXp/a;", "barcode", "Lbk/a;", "price", "", "isWeighted", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILXp/a;Lbk/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "e", "c", "I", "d", "LXp/a;", "()LXp/a;", "Lbk/a;", "()Lbk/a;", "f", "Z", "()Z", "g", "h", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.g, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanLookupItemDecorator {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f136128i = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Xp.a barcode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a price;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWeighted;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhq/g$a;", "", "<init>", "()V", "LXp/d;", "Lbk/a;", "b", "(LXp/d;)Lbk/a;", "Lhq/g;", "a", "(LXp/d;)Lhq/g;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hq.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShopAndScanLookupItemDecorator a(ShopAndScanLookupItem shopAndScanLookupItem) {
            Intrinsics.j(shopAndScanLookupItem, "<this>");
            return new ShopAndScanLookupItemDecorator(shopAndScanLookupItem.getId(), shopAndScanLookupItem.getTitle(), shopAndScanLookupItem.getQuantity(), shopAndScanLookupItem.getBarcode(), b(shopAndScanLookupItem), shopAndScanLookupItem.getIsWeighted(), shopAndScanLookupItem.getImageUrl());
        }

        private final AbstractC6392a b(ShopAndScanLookupItem shopAndScanLookupItem) {
            if (shopAndScanLookupItem.getUnitPrice() != null) {
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117887U, shopAndScanLookupItem.getUnitPrice());
            }
            return AbstractC6392a.INSTANCE.a();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanLookupItemDecorator)) {
            return false;
        }
        ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator = (ShopAndScanLookupItemDecorator) other;
        return Intrinsics.e(this.id, shopAndScanLookupItemDecorator.id) && Intrinsics.e(this.title, shopAndScanLookupItemDecorator.title) && this.quantity == shopAndScanLookupItemDecorator.quantity && Intrinsics.e(this.barcode, shopAndScanLookupItemDecorator.barcode) && Intrinsics.e(this.price, shopAndScanLookupItemDecorator.price) && this.isWeighted == shopAndScanLookupItemDecorator.isWeighted && Intrinsics.e(this.imageUrl, shopAndScanLookupItemDecorator.imageUrl);
    }

    public ShopAndScanLookupItemDecorator(String id2, String title, int i10, Xp.a barcode, AbstractC6392a price, boolean z10, String str) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(price, "price");
        this.id = id2;
        this.title = title;
        this.quantity = i10;
        this.barcode = barcode;
        this.price = price;
        this.isWeighted = z10;
        this.imageUrl = str;
    }

    /* renamed from: a, reason: from getter */
    public final Xp.a getBarcode() {
        return this.barcode;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getPrice() {
        return this.price;
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
    public final boolean getIsWeighted() {
        return this.isWeighted;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.barcode.hashCode()) * 31) + this.price.hashCode()) * 31) + Boolean.hashCode(this.isWeighted)) * 31;
        String str = this.imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ShopAndScanLookupItemDecorator(id=" + this.id + ", title=" + this.title + ", quantity=" + this.quantity + ", barcode=" + this.barcode + ", price=" + this.price + ", isWeighted=" + this.isWeighted + ", imageUrl=" + this.imageUrl + ')';
    }
}
