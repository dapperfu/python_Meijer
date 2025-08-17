package vs;

import Co.Image;
import Co.ProductFullDetails;
import Co.StockInfo;
import ak.AbstractC5607a;
import ak.C5608b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import ej.AllDiscountDetails;
import ej.Entry;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import us.C17305C;
import vs.AbstractC17619o;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001.B»\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010&J\u001a\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bA\u0010@R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bB\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\bG\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\b=\u0010(R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bF\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bM\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bX\u0010@R\u0014\u0010[\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010ZR\u0011\u0010\\\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b4\u0010@R\u0011\u0010^\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b]\u0010@R\u0013\u0010a\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0013\u0010c\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0013\u0010e\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bd\u0010(R\u0011\u0010f\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b1\u0010`R\u0013\u0010g\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b.\u0010`R\u0011\u0010i\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\bh\u0010`R\u0013\u0010k\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\bj\u0010`R\u0011\u0010m\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bl\u0010@¨\u0006n"}, d2 = {"Lvs/b;", "Landroid/os/Parcelable;", "Lmk/i;", "", "entryNumber", "", "title", "notes", "LCo/h;", "product", "Lmk/g;", "thumbnail", "", "isOnSale", "hasMperksOffers", "", "quantity", "inQtyStepperTransition", "totalPriceRawValue", "savingsAmount", "Lej/a;", "productSavings", "formattedQuantity", "maxQuantityAllowed", "Lvs/o;", "substituteItem", "LCo/o;", "stockInfo", "isFromSisterStore", "<init>", "(ILjava/lang/String;Ljava/lang/String;LCo/h;Lmk/g;ZZDZLjava/lang/String;Ljava/lang/Double;Lej/a;Ljava/lang/String;DLvs/o;LCo/o;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Ljava/lang/String;", "getTitle", "c", "j", "d", "LCo/h;", "k", "()LCo/h;", "Lmk/g;", "v", "()Lmk/g;", "f", "Z", "E", "()Z", "g", "h", "D", "getQuantity", "()D", "i", "y", "Ljava/lang/Double;", "q", "()Ljava/lang/Double;", "l", "Lej/a;", "o", "()Lej/a;", "m", "n", "Lvs/o;", "getSubstituteItem", "()Lvs/o;", "p", "LCo/o;", "s", "()LCo/o;", "C", "Lvs/m;", "()Lvs/m;", "productPricing", "entryHasSubstituteItem", "B", "isEntryHasNote", "Lak/a;", "()Lak/a;", "entryNote", "t", "substituteItemName", "w", "thumbnailUrl", "currentPrice", "amountSaved", "x", "totalPrice", "r", "seeSavingsLink", "A", "isDisplayFinalCostByWeight", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class CartProductListDecorator implements Parcelable, mk.i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.g thumbnail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMperksOffers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inQtyStepperTransition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceRawValue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double savingsAmount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AllDiscountDetails productSavings;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedQuantity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxQuantityAllowed;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC17619o substituteItem;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final StockInfo stockInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromSisterStore;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f164957s = 8;
    public static final Parcelable.Creator<CartProductListDecorator> CREATOR = new C2606b();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvs/b$a;", "", "<init>", "()V", "Lej/i;", "entry", "", "isInQtyStepperTransition", "Lvs/b;", "a", "(Lej/i;Z)Lvs/b;", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vs.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CartProductListDecorator b(Companion companion, Entry entry, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(entry, z10);
        }

        public final CartProductListDecorator a(Entry entry, boolean isInQtyStepperTransition) {
            ProductFullDetails productFullDetails;
            double dIntValue;
            String str;
            AbstractC17619o bVar;
            Intrinsics.j(entry, "entry");
            Image imageA = Co.f.a(entry.m().j());
            int entryNumber = entry.getEntryNumber();
            String name = entry.m().getName();
            String substitutionNotes = entry.getSubstitutionNotes();
            if (substitutionNotes == null || StringsKt.r0(substitutionNotes)) {
                substitutionNotes = null;
            }
            ProductFullDetails productFullDetailsM = entry.m();
            boolean z10 = (entry.m().getDiscount() == null || entry.m().getDiscountedPrice() == null) ? false : true;
            boolean hasMPerksOffers = entry.m().getHasMPerksOffers();
            double actualQuantity = entry.getActualQuantity();
            String formattedValue = entry.getTotalPrice().getFormattedValue();
            double value = entry.getAllDiscountDetails().getTotalSavings().getValue();
            AllDiscountDetails allDiscountDetails = entry.getAllDiscountDetails();
            String strE = Ak.b.e(entry.getActualQuantity());
            StockInfo stockInfo = entry.m().getStockInfo();
            Integer maxOrderQuantity = entry.m().getMaxOrderQuantity();
            if (maxOrderQuantity != null) {
                productFullDetails = productFullDetailsM;
                dIntValue = maxOrderQuantity.intValue();
            } else {
                productFullDetails = productFullDetailsM;
                dIntValue = 2.147483647E9d;
            }
            ProductFullDetails substituteItem = entry.getSubstituteItem();
            if (substituteItem != null) {
                str = substitutionNotes;
                bVar = new AbstractC17619o.Product(substituteItem);
            } else {
                str = substitutionNotes;
                boolean isDoNotSubstitute = entry.getIsDoNotSubstitute();
                Boolean boolValueOf = Boolean.valueOf(isDoNotSubstitute);
                if (!isDoNotSubstitute) {
                    boolValueOf = null;
                }
                bVar = boolValueOf != null ? AbstractC17619o.a.f165076a : null;
            }
            return new CartProductListDecorator(entryNumber, name, str, productFullDetails, imageA, z10, hasMPerksOffers, actualQuantity, isInQtyStepperTransition, formattedValue, Double.valueOf(value), allDiscountDetails, strE, dIntValue, bVar, stockInfo, Intrinsics.e(entry.m().getStockInfo().getEligibility(), "SISTER"));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vs.b$b, reason: collision with other inner class name */
    public static final class C2606b implements Parcelable.Creator<CartProductListDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CartProductListDecorator createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            double d10;
            boolean z12;
            AllDiscountDetails allDiscountDetails;
            String str;
            boolean z13;
            StockInfo stockInfo;
            AbstractC17619o abstractC17619o;
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ProductFullDetails productFullDetails = (ProductFullDetails) parcel.readParcelable(CartProductListDecorator.class.getClassLoader());
            mk.g gVar = (mk.g) parcel.readParcelable(CartProductListDecorator.class.getClassLoader());
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z10 = false;
                z14 = true;
            } else {
                z10 = false;
            }
            double d11 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                z11 = true;
                d10 = d11;
                z12 = true;
            } else {
                z11 = true;
                d10 = d11;
                z12 = z10;
            }
            double d12 = d10;
            String string3 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            AllDiscountDetails allDiscountDetails2 = (AllDiscountDetails) parcel.readParcelable(CartProductListDecorator.class.getClassLoader());
            boolean z16 = z11;
            Double d13 = dValueOf;
            String string4 = parcel.readString();
            double d14 = parcel.readDouble();
            AbstractC17619o abstractC17619o2 = (AbstractC17619o) parcel.readParcelable(CartProductListDecorator.class.getClassLoader());
            StockInfo stockInfo2 = (StockInfo) parcel.readParcelable(CartProductListDecorator.class.getClassLoader());
            if (parcel.readInt() != 0) {
                allDiscountDetails = allDiscountDetails2;
                str = string3;
                z13 = z16;
                abstractC17619o = abstractC17619o2;
                stockInfo = stockInfo2;
            } else {
                allDiscountDetails = allDiscountDetails2;
                str = string3;
                z13 = false;
                stockInfo = stockInfo2;
                abstractC17619o = abstractC17619o2;
            }
            return new CartProductListDecorator(i10, string, string2, productFullDetails, gVar, z15, z14, d12, z12, str, d13, allDiscountDetails, string4, d14, abstractC17619o, stockInfo, z13);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CartProductListDecorator[] newArray(int i10) {
            return new CartProductListDecorator[i10];
        }
    }

    public CartProductListDecorator() {
        this(0, null, null, null, null, false, false, 0.0d, false, null, null, null, null, 0.0d, null, null, false, 131071, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProductListDecorator)) {
            return false;
        }
        CartProductListDecorator cartProductListDecorator = (CartProductListDecorator) other;
        return this.entryNumber == cartProductListDecorator.entryNumber && Intrinsics.e(this.title, cartProductListDecorator.title) && Intrinsics.e(this.notes, cartProductListDecorator.notes) && Intrinsics.e(this.product, cartProductListDecorator.product) && Intrinsics.e(this.thumbnail, cartProductListDecorator.thumbnail) && this.isOnSale == cartProductListDecorator.isOnSale && this.hasMperksOffers == cartProductListDecorator.hasMperksOffers && Double.compare(this.quantity, cartProductListDecorator.quantity) == 0 && this.inQtyStepperTransition == cartProductListDecorator.inQtyStepperTransition && Intrinsics.e(this.totalPriceRawValue, cartProductListDecorator.totalPriceRawValue) && Intrinsics.e(this.savingsAmount, cartProductListDecorator.savingsAmount) && Intrinsics.e(this.productSavings, cartProductListDecorator.productSavings) && Intrinsics.e(this.formattedQuantity, cartProductListDecorator.formattedQuantity) && Double.compare(this.maxQuantityAllowed, cartProductListDecorator.maxQuantityAllowed) == 0 && Intrinsics.e(this.substituteItem, cartProductListDecorator.substituteItem) && Intrinsics.e(this.stockInfo, cartProductListDecorator.stockInfo) && this.isFromSisterStore == cartProductListDecorator.isFromSisterStore;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeString(this.title);
        dest.writeString(this.notes);
        dest.writeParcelable(this.product, flags);
        dest.writeParcelable(this.thumbnail, flags);
        dest.writeInt(this.isOnSale ? 1 : 0);
        dest.writeInt(this.hasMperksOffers ? 1 : 0);
        dest.writeDouble(this.quantity);
        dest.writeInt(this.inQtyStepperTransition ? 1 : 0);
        dest.writeString(this.totalPriceRawValue);
        Double d10 = this.savingsAmount;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeParcelable(this.productSavings, flags);
        dest.writeString(this.formattedQuantity);
        dest.writeDouble(this.maxQuantityAllowed);
        dest.writeParcelable(this.substituteItem, flags);
        dest.writeParcelable(this.stockInfo, flags);
        dest.writeInt(this.isFromSisterStore ? 1 : 0);
    }

    public CartProductListDecorator(int i10, String title, String str, ProductFullDetails product, mk.g gVar, boolean z10, boolean z11, double d10, boolean z12, String str2, Double d11, AllDiscountDetails productSavings, String formattedQuantity, double d12, AbstractC17619o abstractC17619o, StockInfo stockInfo, boolean z13) {
        Intrinsics.j(title, "title");
        Intrinsics.j(product, "product");
        Intrinsics.j(productSavings, "productSavings");
        Intrinsics.j(formattedQuantity, "formattedQuantity");
        Intrinsics.j(stockInfo, "stockInfo");
        this.entryNumber = i10;
        this.title = title;
        this.notes = str;
        this.product = product;
        this.thumbnail = gVar;
        this.isOnSale = z10;
        this.hasMperksOffers = z11;
        this.quantity = d10;
        this.inQtyStepperTransition = z12;
        this.totalPriceRawValue = str2;
        this.savingsAmount = d11;
        this.productSavings = productSavings;
        this.formattedQuantity = formattedQuantity;
        this.maxQuantityAllowed = d12;
        this.substituteItem = abstractC17619o;
        this.stockInfo = stockInfo;
        this.isFromSisterStore = z13;
    }

    private final ProductPriceDecorator n() {
        return new ProductPriceDecorator(getProduct(), false, 0.0d, 4, null);
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsFromSisterStore() {
        return this.isFromSisterStore;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getIsOnSale() {
        return this.isOnSale;
    }

    public final boolean c() {
        return this.substituteItem != null;
    }

    public final AbstractC5607a d() {
        String str = this.notes;
        if (str != null) {
            return AbstractC5607a.INSTANCE.d(C17305C.f163337l, str);
        }
        return null;
    }

    /* renamed from: e, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: f, reason: from getter */
    public final String getFormattedQuantity() {
        return this.formattedQuantity;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHasMperksOffers() {
        return this.hasMperksOffers;
    }

    @Override // mk.i
    public double getQuantity() {
        return this.quantity;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getInQtyStepperTransition() {
        return this.inQtyStepperTransition;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.entryNumber) * 31) + this.title.hashCode()) * 31;
        String str = this.notes;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.product.hashCode()) * 31;
        mk.g gVar = this.thumbnail;
        int iHashCode3 = (((((((((iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.hasMperksOffers)) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.inQtyStepperTransition)) * 31;
        String str2 = this.totalPriceRawValue;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.savingsAmount;
        int iHashCode5 = (((((((iHashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31) + this.productSavings.hashCode()) * 31) + this.formattedQuantity.hashCode()) * 31) + Double.hashCode(this.maxQuantityAllowed)) * 31;
        AbstractC17619o abstractC17619o = this.substituteItem;
        return ((((iHashCode5 + (abstractC17619o != null ? abstractC17619o.hashCode() : 0)) * 31) + this.stockInfo.hashCode()) * 31) + Boolean.hashCode(this.isFromSisterStore);
    }

    /* renamed from: i, reason: from getter */
    public final double getMaxQuantityAllowed() {
        return this.maxQuantityAllowed;
    }

    /* renamed from: j, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    @Override // mk.i
    /* renamed from: k, reason: from getter */
    public ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: o, reason: from getter */
    public final AllDiscountDetails getProductSavings() {
        return this.productSavings;
    }

    /* renamed from: q, reason: from getter */
    public final Double getSavingsAmount() {
        return this.savingsAmount;
    }

    public final AbstractC5607a r() {
        if (Intrinsics.b(this.savingsAmount, 0.0d)) {
            return null;
        }
        return AbstractC5607a.INSTANCE.d(C17305C.f163338m, NumberFormat.getCurrencyInstance().format(this.savingsAmount));
    }

    /* renamed from: s, reason: from getter */
    public final StockInfo getStockInfo() {
        return this.stockInfo;
    }

    public final AbstractC5607a t() {
        AbstractC17619o abstractC17619o = this.substituteItem;
        if (abstractC17619o != null) {
            return abstractC17619o.a();
        }
        return null;
    }

    public String toString() {
        return "CartProductListDecorator(entryNumber=" + this.entryNumber + ", title=" + this.title + ", notes=" + this.notes + ", product=" + this.product + ", thumbnail=" + this.thumbnail + ", isOnSale=" + this.isOnSale + ", hasMperksOffers=" + this.hasMperksOffers + ", quantity=" + this.quantity + ", inQtyStepperTransition=" + this.inQtyStepperTransition + ", totalPriceRawValue=" + this.totalPriceRawValue + ", savingsAmount=" + this.savingsAmount + ", productSavings=" + this.productSavings + ", formattedQuantity=" + this.formattedQuantity + ", maxQuantityAllowed=" + this.maxQuantityAllowed + ", substituteItem=" + this.substituteItem + ", stockInfo=" + this.stockInfo + ", isFromSisterStore=" + this.isFromSisterStore + ')';
    }

    /* renamed from: v, reason: from getter */
    public final mk.g getThumbnail() {
        return this.thumbnail;
    }

    public final String w() {
        mk.g gVar = this.thumbnail;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    public final AbstractC5607a x() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        String str = this.totalPriceRawValue;
        if (str == null) {
            str = "";
        }
        return companion.c(str);
    }

    /* renamed from: y, reason: from getter */
    public final String getTotalPriceRawValue() {
        return this.totalPriceRawValue;
    }

    public final boolean A() {
        return !C5608b.a(n().p());
    }

    public final boolean B() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final AbstractC5607a a() {
        return n().j();
    }

    public final AbstractC5607a b() {
        return n().f();
    }

    public /* synthetic */ CartProductListDecorator(int i10, String str, String str2, ProductFullDetails productFullDetails, mk.g gVar, boolean z10, boolean z11, double d10, boolean z12, String str3, Double d11, AllDiscountDetails allDiscountDetails, String str4, double d12, AbstractC17619o abstractC17619o, StockInfo stockInfo, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int i12;
        AllDiscountDetails allDiscountDetails2;
        mk.g gVar2;
        double dIntValue;
        int i13 = (i11 & 1) != 0 ? -1 : i10;
        String str5 = (i11 & 2) != 0 ? "" : str;
        String str6 = (i11 & 4) != 0 ? null : str2;
        ProductFullDetails productFullDetails2 = (i11 & 8) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails;
        mk.g gVar3 = (i11 & 16) != 0 ? null : gVar;
        boolean z14 = (i11 & 32) != 0 ? false : z10;
        boolean z15 = (i11 & 64) != 0 ? false : z11;
        double d13 = (i11 & 128) != 0 ? 0.0d : d10;
        boolean z16 = (i11 & 256) != 0 ? false : z12;
        String str7 = (i11 & 512) != 0 ? "" : str3;
        Double dValueOf = (i11 & 1024) != 0 ? Double.valueOf(0.0d) : d11;
        if ((i11 & RecyclerView.m.FLAG_MOVED) != 0) {
            i12 = i13;
            allDiscountDetails2 = new AllDiscountDetails(null, null, 3, null);
        } else {
            i12 = i13;
            allDiscountDetails2 = allDiscountDetails;
        }
        String str8 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? str4 : "";
        if ((i11 & 8192) != 0) {
            Integer maxOrderQuantity = productFullDetails2.getMaxOrderQuantity();
            if (maxOrderQuantity != null) {
                gVar2 = gVar3;
                dIntValue = maxOrderQuantity.intValue();
            } else {
                gVar2 = gVar3;
                dIntValue = 2.147483647E9d;
            }
        } else {
            gVar2 = gVar3;
            dIntValue = d12;
        }
        this(i12, str5, str6, productFullDetails2, gVar2, z14, z15, d13, z16, str7, dValueOf, allDiscountDetails2, str8, dIntValue, (i11 & 16384) != 0 ? null : abstractC17619o, (i11 & 32768) != 0 ? new StockInfo(null, 0, null, null, null, false, 63, null) : stockInfo, (i11 & 65536) != 0 ? false : z13);
    }
}
