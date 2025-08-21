package vo;

import Co.Image;
import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b8\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b,\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u00109\u001a\u0004\b;\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b'\u0010!R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lvo/a;", "Landroid/os/Parcelable;", "", "itemId", "", "productName", "productNameSubstituted", "", "LCo/e;", "productImg", "productImgSubstituted", "", "productQuantity", "Lnk/b;", "productPrice", "productPriceSubstituted", "LCo/h;", "product", "productSubstituted", "customerSubstitutionPreference", "", "isAccepted", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;DLnk/b;Lnk/b;LCo/h;LCo/h;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "f", "c", "g", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "D", "j", "()D", "Lnk/b;", "h", "()Lnk/b;", "i", "LCo/h;", "()LCo/h;", "k", "l", "Z", "n", "()Z", "o", "(Z)V", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vo.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderSubstitutionItem implements Parcelable {
    public static final Parcelable.Creator<OrderSubstitutionItem> CREATOR = new C2627a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productNameSubstituted;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Image> productImg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Image> productImgSubstituted;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double productQuantity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b productPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b productPriceSubstituted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails productSubstituted;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerSubstitutionPreference;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAccepted;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vo.a$a, reason: collision with other inner class name */
    public static final class C2627a implements Parcelable.Creator<OrderSubstitutionItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()));
                }
            }
            return new OrderSubstitutionItem(i10, string, string2, arrayList, arrayList2, parcel.readDouble(), (nk.b) parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()), (nk.b) parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()), (ProductFullDetails) parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()), (ProductFullDetails) parcel.readParcelable(OrderSubstitutionItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionItem[] newArray(int i10) {
            return new OrderSubstitutionItem[i10];
        }
    }

    public OrderSubstitutionItem(int i10, String str, String str2, List<Image> list, List<Image> list2, double d10, nk.b bVar, nk.b bVar2, ProductFullDetails productFullDetails, ProductFullDetails productFullDetails2, String str3, boolean z10) {
        this.itemId = i10;
        this.productName = str;
        this.productNameSubstituted = str2;
        this.productImg = list;
        this.productImgSubstituted = list2;
        this.productQuantity = d10;
        this.productPrice = bVar;
        this.productPriceSubstituted = bVar2;
        this.product = productFullDetails;
        this.productSubstituted = productFullDetails2;
        this.customerSubstitutionPreference = str3;
        this.isAccepted = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSubstitutionItem)) {
            return false;
        }
        OrderSubstitutionItem orderSubstitutionItem = (OrderSubstitutionItem) other;
        return this.itemId == orderSubstitutionItem.itemId && Intrinsics.e(this.productName, orderSubstitutionItem.productName) && Intrinsics.e(this.productNameSubstituted, orderSubstitutionItem.productNameSubstituted) && Intrinsics.e(this.productImg, orderSubstitutionItem.productImg) && Intrinsics.e(this.productImgSubstituted, orderSubstitutionItem.productImgSubstituted) && Double.compare(this.productQuantity, orderSubstitutionItem.productQuantity) == 0 && Intrinsics.e(this.productPrice, orderSubstitutionItem.productPrice) && Intrinsics.e(this.productPriceSubstituted, orderSubstitutionItem.productPriceSubstituted) && Intrinsics.e(this.product, orderSubstitutionItem.product) && Intrinsics.e(this.productSubstituted, orderSubstitutionItem.productSubstituted) && Intrinsics.e(this.customerSubstitutionPreference, orderSubstitutionItem.customerSubstitutionPreference) && this.isAccepted == orderSubstitutionItem.isAccepted;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.itemId);
        dest.writeString(this.productName);
        dest.writeString(this.productNameSubstituted);
        List<Image> list = this.productImg;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Image> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<Image> list2 = this.productImgSubstituted;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<Image> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
        }
        dest.writeDouble(this.productQuantity);
        dest.writeParcelable(this.productPrice, flags);
        dest.writeParcelable(this.productPriceSubstituted, flags);
        dest.writeParcelable(this.product, flags);
        dest.writeParcelable(this.productSubstituted, flags);
        dest.writeString(this.customerSubstitutionPreference);
        dest.writeInt(this.isAccepted ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerSubstitutionPreference() {
        return this.customerSubstitutionPreference;
    }

    /* renamed from: b, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: c, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    public final List<Image> d() {
        return this.productImg;
    }

    public final List<Image> e() {
        return this.productImgSubstituted;
    }

    /* renamed from: f, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: g, reason: from getter */
    public final String getProductNameSubstituted() {
        return this.productNameSubstituted;
    }

    /* renamed from: h, reason: from getter */
    public final nk.b getProductPrice() {
        return this.productPrice;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.itemId) * 31;
        String str = this.productName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productNameSubstituted;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.productImg;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.productImgSubstituted;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + Double.hashCode(this.productQuantity)) * 31;
        nk.b bVar = this.productPrice;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        nk.b bVar2 = this.productPriceSubstituted;
        int iHashCode7 = (iHashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ProductFullDetails productFullDetails = this.product;
        int iHashCode8 = (iHashCode7 + (productFullDetails == null ? 0 : productFullDetails.hashCode())) * 31;
        ProductFullDetails productFullDetails2 = this.productSubstituted;
        int iHashCode9 = (iHashCode8 + (productFullDetails2 == null ? 0 : productFullDetails2.hashCode())) * 31;
        String str3 = this.customerSubstitutionPreference;
        return ((iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAccepted);
    }

    /* renamed from: i, reason: from getter */
    public final nk.b getProductPriceSubstituted() {
        return this.productPriceSubstituted;
    }

    /* renamed from: j, reason: from getter */
    public final double getProductQuantity() {
        return this.productQuantity;
    }

    /* renamed from: k, reason: from getter */
    public final ProductFullDetails getProductSubstituted() {
        return this.productSubstituted;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final void o(boolean z10) {
        this.isAccepted = z10;
    }

    public String toString() {
        return "OrderSubstitutionItem(itemId=" + this.itemId + ", productName=" + this.productName + ", productNameSubstituted=" + this.productNameSubstituted + ", productImg=" + this.productImg + ", productImgSubstituted=" + this.productImgSubstituted + ", productQuantity=" + this.productQuantity + ", productPrice=" + this.productPrice + ", productPriceSubstituted=" + this.productPriceSubstituted + ", product=" + this.product + ", productSubstituted=" + this.productSubstituted + ", customerSubstitutionPreference=" + this.customerSubstitutionPreference + ", isAccepted=" + this.isAccepted + ')';
    }

    public /* synthetic */ OrderSubstitutionItem(int i10, String str, String str2, List list, List list2, double d10, nk.b bVar, nk.b bVar2, ProductFullDetails productFullDetails, ProductFullDetails productFullDetails2, String str3, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, str2, (i11 & 8) != 0 ? null : list, list2, (i11 & 32) != 0 ? 0.0d : d10, (i11 & 64) != 0 ? null : bVar, bVar2, (i11 & 256) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails, (i11 & 512) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails2, (i11 & 1024) != 0 ? null : str3, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z10);
    }
}
