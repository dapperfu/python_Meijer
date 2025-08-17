package gn;

import Co.Image;
import Co.ProductFullDetails;
import ak.AbstractC5607a;
import android.os.Parcel;
import android.os.Parcelable;
import com.meijer.mobile.meijer.Y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uo.OrderOutOfStockItem;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u00101\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b\u001e\u00100¨\u00063"}, d2 = {"Lgn/p;", "Landroid/os/Parcelable;", "", "title", "Lmk/g;", "thumbnail", "totalPriceRawValue", "LCo/h;", "product", "", "quantity", "<init>", "(Ljava/lang/String;Lmk/g;Ljava/lang/String;LCo/h;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lmk/g;", "getThumbnail", "()Lmk/g;", "c", "d", "LCo/h;", "getProduct", "()LCo/h;", "e", "D", "getQuantity", "()D", "thumbnailUrl", "Lak/a;", "()Lak/a;", "itemQuantity", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.p, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderOutOfStockListDecorator implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.g thumbnail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceRawValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f133945g = 8;
    public static final Parcelable.Creator<OrderOutOfStockListDecorator> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgn/p$a;", "", "<init>", "()V", "Luo/a;", "outOfStockItems", "Lgn/p;", "a", "(Luo/a;)Lgn/p;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gn.p$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: gn.p$a$a, reason: collision with other inner class name */
        public static final class C2110a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((Image) t10).z()), Boolean.valueOf(((Image) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: gn.p$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: gn.p$a$c */
        public static final class c<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f133951a;

            public c(Comparator comparator) {
                this.f133951a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f133951a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((Image) t10).a1(), ((Image) t11).a1());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderOutOfStockListDecorator a(OrderOutOfStockItem outOfStockItems) {
            Image image;
            Intrinsics.j(outOfStockItems, "outOfStockItems");
            List<Image> listB = outOfStockItems.b();
            if (listB != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((Image) obj).h()) {
                        arrayList.add(obj);
                    }
                }
                List listZ0 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList, new c(new C2110a())), new b());
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listZ0) {
                    if (((Image) obj2).f() <= 200) {
                        arrayList2.add(obj2);
                    } else {
                        arrayList3.add(obj2);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list = (List) pair.a();
                List list2 = (List) pair.b();
                Image imageJ = (Image) CollectionsKt.F0(list);
                if (imageJ == null) {
                    Image image2 = (Image) CollectionsKt.u0(list2);
                    imageJ = image2 != null ? image2.j(HttpResponseStatus.SUCCESS_OK) : null;
                }
                image = imageJ;
            } else {
                image = null;
            }
            String productName = outOfStockItems.getProductName();
            String str = productName == null ? "" : productName;
            double productQuantity = outOfStockItems.getProductQuantity();
            mk.b productPrice = outOfStockItems.getProductPrice();
            String formattedValue = productPrice != null ? productPrice.getFormattedValue() : null;
            return new OrderOutOfStockListDecorator(str, image, formattedValue == null ? "" : formattedValue, null, productQuantity, 8, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.p$b */
    public static final class b implements Parcelable.Creator<OrderOutOfStockListDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderOutOfStockListDecorator createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new OrderOutOfStockListDecorator(parcel.readString(), (mk.g) parcel.readParcelable(OrderOutOfStockListDecorator.class.getClassLoader()), parcel.readString(), (ProductFullDetails) parcel.readParcelable(OrderOutOfStockListDecorator.class.getClassLoader()), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderOutOfStockListDecorator[] newArray(int i10) {
            return new OrderOutOfStockListDecorator[i10];
        }
    }

    public OrderOutOfStockListDecorator() {
        this(null, null, null, null, 0.0d, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOutOfStockListDecorator)) {
            return false;
        }
        OrderOutOfStockListDecorator orderOutOfStockListDecorator = (OrderOutOfStockListDecorator) other;
        return Intrinsics.e(this.title, orderOutOfStockListDecorator.title) && Intrinsics.e(this.thumbnail, orderOutOfStockListDecorator.thumbnail) && Intrinsics.e(this.totalPriceRawValue, orderOutOfStockListDecorator.totalPriceRawValue) && Intrinsics.e(this.product, orderOutOfStockListDecorator.product) && Double.compare(this.quantity, orderOutOfStockListDecorator.quantity) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.title);
        dest.writeParcelable(this.thumbnail, flags);
        dest.writeString(this.totalPriceRawValue);
        dest.writeParcelable(this.product, flags);
        dest.writeDouble(this.quantity);
    }

    public OrderOutOfStockListDecorator(String title, mk.g gVar, String totalPriceRawValue, ProductFullDetails product, double d10) {
        Intrinsics.j(title, "title");
        Intrinsics.j(totalPriceRawValue, "totalPriceRawValue");
        Intrinsics.j(product, "product");
        this.title = title;
        this.thumbnail = gVar;
        this.totalPriceRawValue = totalPriceRawValue;
        this.product = product;
        this.quantity = d10;
    }

    public final AbstractC5607a a() {
        return AbstractC5607a.INSTANCE.d(Y.f100335t7, Integer.valueOf((int) this.quantity));
    }

    public final String b() {
        mk.g gVar = this.thumbnail;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final String getTotalPriceRawValue() {
        return this.totalPriceRawValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        mk.g gVar = this.thumbnail;
        return ((((((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.totalPriceRawValue.hashCode()) * 31) + this.product.hashCode()) * 31) + Double.hashCode(this.quantity);
    }

    public String toString() {
        return "OrderOutOfStockListDecorator(title=" + this.title + ", thumbnail=" + this.thumbnail + ", totalPriceRawValue=" + this.totalPriceRawValue + ", product=" + this.product + ", quantity=" + this.quantity + ')';
    }

    public /* synthetic */ OrderOutOfStockListDecorator(String str, mk.g gVar, String str2, ProductFullDetails productFullDetails, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : gVar, (i10 & 4) == 0 ? str2 : "", (i10 & 8) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails, (i10 & 16) != 0 ? 0.0d : d10);
    }
}
