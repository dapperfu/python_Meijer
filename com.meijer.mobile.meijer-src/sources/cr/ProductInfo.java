package cr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcr/i;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "productImageThumbnail", "productName", "productPrice", "", "productQty", "productUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g2", "b", "c", "d", "e", "I", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.i, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductInfo implements Parcelable {
    public static final Parcelable.Creator<ProductInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImageThumbnail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productPrice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productQty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productUnit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.i$a */
    public static final class a implements Parcelable.Creator<ProductInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductInfo createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductInfo[] newArray(int i10) {
            return new ProductInfo[i10];
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
        if (!(other instanceof ProductInfo)) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) other;
        return Intrinsics.e(this.productCode, productInfo.productCode) && Intrinsics.e(this.productImageThumbnail, productInfo.productImageThumbnail) && Intrinsics.e(this.productName, productInfo.productName) && Intrinsics.e(this.productPrice, productInfo.productPrice) && this.productQty == productInfo.productQty && Intrinsics.e(this.productUnit, productInfo.productUnit);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.productCode);
        dest.writeString(this.productImageThumbnail);
        dest.writeString(this.productName);
        dest.writeString(this.productPrice);
        dest.writeInt(this.productQty);
        dest.writeString(this.productUnit);
    }

    public ProductInfo(String productCode, String str, String str2, String str3, int i10, String str4) {
        Intrinsics.j(productCode, "productCode");
        this.productCode = productCode;
        this.productImageThumbnail = str;
        this.productName = str2;
        this.productPrice = str3;
        this.productQty = i10;
        this.productUnit = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getProductImageThumbnail() {
        return this.productImageThumbnail;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: d, reason: from getter */
    public final int getProductQty() {
        return this.productQty;
    }

    /* renamed from: e, reason: from getter */
    public final String getProductUnit() {
        return this.productUnit;
    }

    /* renamed from: g2, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        int iHashCode = this.productCode.hashCode() * 31;
        String str = this.productImageThumbnail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productPrice;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.productQty)) * 31;
        String str4 = this.productUnit;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ProductInfo(productCode=" + this.productCode + ", productImageThumbnail=" + this.productImageThumbnail + ", productName=" + this.productName + ", productPrice=" + this.productPrice + ", productQty=" + this.productQty + ", productUnit=" + this.productUnit + ')';
    }
}
