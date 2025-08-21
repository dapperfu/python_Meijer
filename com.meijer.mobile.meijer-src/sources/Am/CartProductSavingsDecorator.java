package Am;

import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import fj.AllDiscountDetails;
import hn.ReadOnlyProductListDecorator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.g;
import tr.C17283a;
import vs.CartProductListDecorator;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 H2\u00020\u0001:\u0001#Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b)\u0010:R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b1\u0010=R\u0014\u0010@\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010?R\u0011\u0010C\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\b&\u0010BR\u0013\u0010D\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0013\u0010E\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b7\u0010BR\u0013\u0010F\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b;\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b#\u0010B¨\u0006I"}, d2 = {"LAm/b;", "Landroid/os/Parcelable;", "", "entryNumber", "", "title", "Lnk/g;", "thumbnail", "LCo/h;", "product", "", "quantity", "savingsAmount", "", "isOnSale", "hasMperksOffers", "Lfj/a;", "productSavings", "<init>", "(ILjava/lang/String;Lnk/g;LCo/h;DDZZLfj/a;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getEntryNumber", "b", "Ljava/lang/String;", "getTitle", "c", "Lnk/g;", "getThumbnail", "()Lnk/g;", "d", "LCo/h;", "getProduct", "()LCo/h;", "e", "D", "getQuantity", "()D", "f", "getSavingsAmount", "g", "Z", "i", "()Z", "h", "Lfj/a;", "()Lfj/a;", "Lvs/m;", "()Lvs/m;", "productPricing", "Lbk/a;", "()Lbk/a;", "currentPrice", "thumbnailUrl", "totalOffersApplied", "totalSavings", "amountPerUnit", "j", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Am.b, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CartProductSavingsDecorator implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g thumbnail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savingsAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMperksOffers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AllDiscountDetails productSavings;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f1355k = 8;
    public static final Parcelable.Creator<CartProductSavingsDecorator> CREATOR = new C0028b();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LAm/b$a;", "", "<init>", "()V", "Lhn/r;", "decorator", "LAm/b;", "a", "(Lhn/r;)LAm/b;", "Lvs/b;", "b", "(Lvs/b;)LAm/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Am.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CartProductSavingsDecorator a(ReadOnlyProductListDecorator decorator) {
            Intrinsics.j(decorator, "decorator");
            int entryNumber = decorator.getEntryNumber();
            String title = decorator.getTitle();
            g thumbnail = decorator.getThumbnail();
            ProductFullDetails product = decorator.getProduct();
            double quantity = decorator.getQuantity();
            Double savingsAmount = decorator.getSavingsAmount();
            return new CartProductSavingsDecorator(entryNumber, title, thumbnail, product, quantity, savingsAmount != null ? savingsAmount.doubleValue() : 0.0d, decorator.getIsOnSale(), decorator.getHasMperksOffers(), decorator.getProductSavings());
        }

        public final CartProductSavingsDecorator b(CartProductListDecorator decorator) {
            Intrinsics.j(decorator, "decorator");
            int entryNumber = decorator.getEntryNumber();
            String title = decorator.getTitle();
            g thumbnail = decorator.getThumbnail();
            ProductFullDetails product = decorator.getProduct();
            double quantity = decorator.getQuantity();
            Double savingsAmount = decorator.getSavingsAmount();
            return new CartProductSavingsDecorator(entryNumber, title, thumbnail, product, quantity, savingsAmount != null ? savingsAmount.doubleValue() : 0.0d, decorator.getIsOnSale(), decorator.getHasMperksOffers(), decorator.getProductSavings());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Am.b$b, reason: collision with other inner class name */
    public static final class C0028b implements Parcelable.Creator<CartProductSavingsDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CartProductSavingsDecorator createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CartProductSavingsDecorator(parcel.readInt(), parcel.readString(), (g) parcel.readParcelable(CartProductSavingsDecorator.class.getClassLoader()), (ProductFullDetails) parcel.readParcelable(CartProductSavingsDecorator.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0, (AllDiscountDetails) parcel.readParcelable(CartProductSavingsDecorator.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CartProductSavingsDecorator[] newArray(int i10) {
            return new CartProductSavingsDecorator[i10];
        }
    }

    public CartProductSavingsDecorator() {
        this(0, null, null, null, 0.0d, 0.0d, false, false, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProductSavingsDecorator)) {
            return false;
        }
        CartProductSavingsDecorator cartProductSavingsDecorator = (CartProductSavingsDecorator) other;
        return this.entryNumber == cartProductSavingsDecorator.entryNumber && Intrinsics.e(this.title, cartProductSavingsDecorator.title) && Intrinsics.e(this.thumbnail, cartProductSavingsDecorator.thumbnail) && Intrinsics.e(this.product, cartProductSavingsDecorator.product) && Double.compare(this.quantity, cartProductSavingsDecorator.quantity) == 0 && Double.compare(this.savingsAmount, cartProductSavingsDecorator.savingsAmount) == 0 && this.isOnSale == cartProductSavingsDecorator.isOnSale && this.hasMperksOffers == cartProductSavingsDecorator.hasMperksOffers && Intrinsics.e(this.productSavings, cartProductSavingsDecorator.productSavings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeString(this.title);
        dest.writeParcelable(this.thumbnail, flags);
        dest.writeParcelable(this.product, flags);
        dest.writeDouble(this.quantity);
        dest.writeDouble(this.savingsAmount);
        dest.writeInt(this.isOnSale ? 1 : 0);
        dest.writeInt(this.hasMperksOffers ? 1 : 0);
        dest.writeParcelable(this.productSavings, flags);
    }

    public CartProductSavingsDecorator(int i10, String title, g gVar, ProductFullDetails product, double d10, double d11, boolean z10, boolean z11, AllDiscountDetails productSavings) {
        Intrinsics.j(title, "title");
        Intrinsics.j(product, "product");
        Intrinsics.j(productSavings, "productSavings");
        this.entryNumber = i10;
        this.title = title;
        this.thumbnail = gVar;
        this.product = product;
        this.quantity = d10;
        this.savingsAmount = d11;
        this.isOnSale = z10;
        this.hasMperksOffers = z11;
        this.productSavings = productSavings;
    }

    private final ProductPriceDecorator d() {
        return new ProductPriceDecorator(this.product, false, 0.0d, 6, null);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasMperksOffers() {
        return this.hasMperksOffers;
    }

    /* renamed from: e, reason: from getter */
    public final AllDiscountDetails getProductSavings() {
        return this.productSavings;
    }

    public final String f() {
        g gVar = this.thumbnail;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    public final AbstractC6392a g() {
        Integer numValueOf = Integer.valueOf(this.productSavings.a().size());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return AbstractC6392a.INSTANCE.b(C17283a.f163259b, numValueOf.intValue(), new Object[0]);
    }

    public final String getTitle() {
        return this.title;
    }

    public final AbstractC6392a h() {
        Double dValueOf = Double.valueOf(this.savingsAmount);
        if (dValueOf.doubleValue() == 0.0d) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return null;
        }
        return AbstractC6392a.INSTANCE.d(Y.f100404Ec, Double.valueOf(dValueOf.doubleValue()));
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.entryNumber) * 31) + this.title.hashCode()) * 31;
        g gVar = this.thumbnail;
        return ((((((((((((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.product.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.savingsAmount)) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.hasMperksOffers)) * 31) + this.productSavings.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsOnSale() {
        return this.isOnSale;
    }

    public String toString() {
        return "CartProductSavingsDecorator(entryNumber=" + this.entryNumber + ", title=" + this.title + ", thumbnail=" + this.thumbnail + ", product=" + this.product + ", quantity=" + this.quantity + ", savingsAmount=" + this.savingsAmount + ", isOnSale=" + this.isOnSale + ", hasMperksOffers=" + this.hasMperksOffers + ", productSavings=" + this.productSavings + ')';
    }

    public final AbstractC6392a a() {
        return d().a();
    }

    public final AbstractC6392a b() {
        return d().e();
    }

    public /* synthetic */ CartProductSavingsDecorator(int i10, String str, g gVar, ProductFullDetails productFullDetails, double d10, double d11, boolean z10, boolean z11, AllDiscountDetails allDiscountDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : gVar, (i11 & 8) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails, (i11 & 16) != 0 ? 0.0d : d10, (i11 & 32) == 0 ? d11 : 0.0d, (i11 & 64) != 0 ? false : z10, (i11 & 128) == 0 ? z11 : false, (i11 & 256) != 0 ? new AllDiscountDetails(null, null, 3, null) : allDiscountDetails);
    }
}
