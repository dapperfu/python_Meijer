package Co;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LCo/j;", "Landroid/os/Parcelable;", "Lnk/f;", PreferencesHelper.PREF_ID, "", "attribute", "LCo/e;", "image", "LCo/o;", "stock", "Lnk/b;", "price", "<init>", "(Lnk/f;Ljava/lang/String;LCo/e;LCo/o;Lnk/b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "b", "()Lnk/f;", "Ljava/lang/String;", "c", "LCo/e;", "()LCo/e;", "d", "LCo/o;", "()LCo/o;", "e", "Lnk/b;", "l", "()Lnk/b;", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Co.j, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductVariant implements Parcelable {
    public static final Parcelable.Creator<ProductVariant> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.f id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String attribute;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image image;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final StockInfo stock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b price;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.j$a */
    public static final class a implements Parcelable.Creator<ProductVariant> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductVariant createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductVariant((nk.f) parcel.readParcelable(ProductVariant.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StockInfo.CREATOR.createFromParcel(parcel) : null, (nk.b) parcel.readParcelable(ProductVariant.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductVariant[] newArray(int i10) {
            return new ProductVariant[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariant)) {
            return false;
        }
        ProductVariant productVariant = (ProductVariant) other;
        return Intrinsics.e(this.id, productVariant.id) && Intrinsics.e(this.attribute, productVariant.attribute) && Intrinsics.e(this.image, productVariant.image) && Intrinsics.e(this.stock, productVariant.stock) && Intrinsics.e(this.price, productVariant.price);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeParcelable(this.id, flags);
        dest.writeString(this.attribute);
        Image image = this.image;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        StockInfo stockInfo = this.stock;
        if (stockInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            stockInfo.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.price, flags);
    }

    public ProductVariant(nk.f id2, String attribute, Image image, StockInfo stockInfo, nk.b bVar) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(attribute, "attribute");
        this.id = id2;
        this.attribute = attribute;
        this.image = image;
        this.stock = stockInfo;
        this.price = bVar;
    }

    /* renamed from: a, reason: from getter */
    public final String getAttribute() {
        return this.attribute;
    }

    /* renamed from: b, reason: from getter */
    public final nk.f getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: d, reason: from getter */
    public final StockInfo getStock() {
        return this.stock;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.attribute.hashCode()) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        StockInfo stockInfo = this.stock;
        int iHashCode3 = (iHashCode2 + (stockInfo == null ? 0 : stockInfo.hashCode())) * 31;
        nk.b bVar = this.price;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* renamed from: l, reason: from getter */
    public final nk.b getPrice() {
        return this.price;
    }

    public String toString() {
        return "ProductVariant(id=" + this.id + ", attribute=" + this.attribute + ", image=" + this.image + ", stock=" + this.stock + ", price=" + this.price + ')';
    }
}
