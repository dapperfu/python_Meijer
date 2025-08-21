package uo;

import Co.Image;
import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nk.b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b*\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b!\u00102¨\u00063"}, d2 = {"Luo/a;", "Landroid/os/Parcelable;", "", "itemId", "", "productName", "", "LCo/e;", "productImg", "", "productQuantity", "Lnk/b;", "productPrice", "LCo/h;", "product", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;DLnk/b;LCo/h;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getItemId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "D", "e", "()D", "Lnk/b;", "()Lnk/b;", "f", "LCo/h;", "()LCo/h;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uo.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderOutOfStockItem implements Parcelable {
    public static final Parcelable.Creator<OrderOutOfStockItem> CREATOR = new C2607a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Image> productImg;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double productQuantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b productPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$a, reason: collision with other inner class name */
    public static final class C2607a implements Parcelable.Creator<OrderOutOfStockItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderOutOfStockItem createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(OrderOutOfStockItem.class.getClassLoader()));
                }
            }
            return new OrderOutOfStockItem(numValueOf, string, arrayList, parcel.readDouble(), (b) parcel.readParcelable(OrderOutOfStockItem.class.getClassLoader()), (ProductFullDetails) parcel.readParcelable(OrderOutOfStockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderOutOfStockItem[] newArray(int i10) {
            return new OrderOutOfStockItem[i10];
        }
    }

    public OrderOutOfStockItem(Integer num, String str, List<Image> list, double d10, b bVar, ProductFullDetails productFullDetails) {
        this.itemId = num;
        this.productName = str;
        this.productImg = list;
        this.productQuantity = d10;
        this.productPrice = bVar;
        this.product = productFullDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOutOfStockItem)) {
            return false;
        }
        OrderOutOfStockItem orderOutOfStockItem = (OrderOutOfStockItem) other;
        return Intrinsics.e(this.itemId, orderOutOfStockItem.itemId) && Intrinsics.e(this.productName, orderOutOfStockItem.productName) && Intrinsics.e(this.productImg, orderOutOfStockItem.productImg) && Double.compare(this.productQuantity, orderOutOfStockItem.productQuantity) == 0 && Intrinsics.e(this.productPrice, orderOutOfStockItem.productPrice) && Intrinsics.e(this.product, orderOutOfStockItem.product);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.itemId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.productName);
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
        dest.writeDouble(this.productQuantity);
        dest.writeParcelable(this.productPrice, flags);
        dest.writeParcelable(this.product, flags);
    }

    /* renamed from: a, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    public final List<Image> b() {
        return this.productImg;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: d, reason: from getter */
    public final b getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: e, reason: from getter */
    public final double getProductQuantity() {
        return this.productQuantity;
    }

    public int hashCode() {
        Integer num = this.itemId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.productName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Image> list = this.productImg;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Double.hashCode(this.productQuantity)) * 31;
        b bVar = this.productPrice;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ProductFullDetails productFullDetails = this.product;
        return iHashCode4 + (productFullDetails != null ? productFullDetails.hashCode() : 0);
    }

    public String toString() {
        return "OrderOutOfStockItem(itemId=" + this.itemId + ", productName=" + this.productName + ", productImg=" + this.productImg + ", productQuantity=" + this.productQuantity + ", productPrice=" + this.productPrice + ", product=" + this.product + ')';
    }

    public /* synthetic */ OrderOutOfStockItem(Integer num, String str, List list, double d10, b bVar, ProductFullDetails productFullDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, list, (i10 & 8) != 0 ? 0.0d : d10, bVar, (i10 & 32) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails);
    }
}
