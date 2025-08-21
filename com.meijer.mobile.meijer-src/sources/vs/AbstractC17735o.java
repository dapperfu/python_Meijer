package vs;

import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import us.C17457C;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lvs/o;", "Landroid/os/Parcelable;", "<init>", "()V", "Lbk/a;", "a", "()Lbk/a;", "displayName", "b", "Lvs/o$a;", "Lvs/o$b;", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vs.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC17735o implements Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvs/o$a;", "Lvs/o;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "a", "()Lbk/a;", "displayName", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vs.o$a */
    public static final /* data */ class a extends AbstractC17735o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f166310a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C2633a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vs.o$a$a, reason: collision with other inner class name */
        public static final class C2633a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                parcel.readInt();
                return a.f166310a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(1);
        }

        @Override // vs.AbstractC17735o
        public AbstractC6392a a() {
            return AbstractC6392a.INSTANCE.d(C17457C.f164421r, new Object[0]);
        }

        public String toString() {
            return "DoNotSubstitute";
        }

        public int hashCode() {
            return -1485105465;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lvs/o$b;", "Lvs/o;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "getProduct", "()LCo/h;", "Lbk/a;", "()Lbk/a;", "displayName", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vs.o$b, reason: from toString */
    public static final /* data */ class Product extends AbstractC17735o {
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vs.o$b$a */
        public static final class a implements Parcelable.Creator<Product> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Product createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Product((ProductFullDetails) parcel.readParcelable(Product.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Product[] newArray(int i10) {
                return new Product[i10];
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
            return (other instanceof Product) && Intrinsics.e(this.product, ((Product) other).product);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeParcelable(this.product, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(ProductFullDetails product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        @Override // vs.AbstractC17735o
        public AbstractC6392a a() {
            return AbstractC6392a.INSTANCE.d(C17457C.f164417n, this.product.getName());
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "Product(product=" + this.product + ')';
        }
    }

    public /* synthetic */ AbstractC17735o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AbstractC6392a a();

    private AbstractC17735o() {
    }
}
