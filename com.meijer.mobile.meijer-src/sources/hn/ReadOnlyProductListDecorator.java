package hn;

import Co.Image;
import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fj.AllDiscountDetails;
import fj.Entry;
import java.text.NumberFormat;
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
import kotlin.text.StringsKt;
import tr.C17284b;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 D2\u00020\u0001:\u0001(B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b3\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010\"R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\bK\u00102R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bL\u0010:R\u0014\u0010O\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010NR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010:R\u0013\u0010T\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b.\u0010SR\u0013\u0010V\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bU\u0010\"R\u0011\u0010W\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\b+\u0010SR\u0013\u0010X\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b(\u0010SR\u0011\u0010Z\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bY\u0010SR\u0011\u0010[\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\b;\u0010SR\u0013\u0010]\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b\\\u0010SR\u0011\u0010^\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010:R\u0013\u0010_\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b@\u0010S¨\u0006`"}, d2 = {"Lhn/r;", "Landroid/os/Parcelable;", "", "entryNumber", "", "title", "notes", "LCo/h;", "product", "Lnk/g;", "thumbnail", "", "isOnSale", "hasMperksOffers", "", "quantity", "totalPriceRawValue", "outOfStock", "savingsAmount", "Lfj/a;", "productSavings", "proactiveSubstituteItem", "shouldDisplayLowStockIndicator", "<init>", "(ILjava/lang/String;Ljava/lang/String;LCo/h;Lnk/g;ZZDLjava/lang/String;ZLjava/lang/Double;Lfj/a;LCo/h;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "getTitle", "c", "getNotes", "LCo/h;", "j", "()LCo/h;", "e", "Lnk/g;", "s", "()Lnk/g;", "f", "Z", "y", "()Z", "g", "h", "D", "getQuantity", "()D", "i", "w", "k", "Ljava/lang/Double;", "o", "()Ljava/lang/Double;", "l", "Lfj/a;", "n", "()Lfj/a;", "m", "getProactiveSubstituteItem", "r", "Lvs/m;", "()Lvs/m;", "productPricing", "x", "isEntryHasNote", "Lbk/a;", "()Lbk/a;", "entryNote", "t", "thumbnailUrl", "currentPrice", "amountSaved", "v", "totalPrice", "itemQuantity", "q", "seeSavingsLink", "hasProactiveSubstituteItem", "proactiveSubstituteItemName", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.r, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ReadOnlyProductListDecorator implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.g thumbnail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMperksOffers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceRawValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean outOfStock;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double savingsAmount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AllDiscountDetails productSavings;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails proactiveSubstituteItem;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldDisplayLowStockIndicator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f136042p = 8;
    public static final Parcelable.Creator<ReadOnlyProductListDecorator> CREATOR = new b();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lhn/r$a;", "", "<init>", "()V", "Lfj/i;", "entry", "Lhj/f;", "orderStatusType", "Lhn/r;", "a", "(Lfj/i;Lhj/f;)Lhn/r;", "", "b", "(Lhj/f;)Z", "isOrderUnfulfilled", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.r$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.r$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((Image) t10).z()), Boolean.valueOf(((Image) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.r$a$c */
        public static final class c<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.r$a$d */
        public static final class d<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f136057a;

            public d(Comparator comparator) {
                this.f136057a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f136057a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((Image) t10).Z0(), ((Image) t11).Z0());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.r$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2153a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[hj.f.values().length];
                try {
                    iArr[hj.f.f135703t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hj.f.f135699p.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[hj.f.f135700q.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[hj.f.f135698o.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[hj.f.f135696m.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[hj.f.f135697n.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[hj.f.f135701r.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        private final boolean b(hj.f fVar) {
            switch (C2153a.$EnumSwitchMapping$0[fVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return false;
                default:
                    return true;
            }
        }

        public final ReadOnlyProductListDecorator a(Entry entry, hj.f orderStatusType) {
            Image image;
            ProductFullDetails productFullDetailsB;
            Intrinsics.j(entry, "entry");
            Intrinsics.j(orderStatusType, "orderStatusType");
            List<Image> listJ = entry.m().j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (((Image) obj).h()) {
                    arrayList.add(obj);
                }
            }
            List listZ0 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList, new d(new b())), new c());
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
            if (imageJ != null) {
                image = imageJ;
            } else {
                Image image2 = (Image) CollectionsKt.u0(list2);
                if (image2 != null) {
                    imageJ = image2.j(HttpResponseStatus.SUCCESS_OK);
                    image = imageJ;
                } else {
                    image = null;
                }
            }
            int entryNumber = entry.getEntryNumber();
            String name = entry.m().getName();
            String substitutionNotes = entry.getSubstitutionNotes();
            String str = (substitutionNotes == null || StringsKt.s0(substitutionNotes)) ? null : substitutionNotes;
            String formattedValue = entry.m().getPrice().getFormattedValue();
            if (StringsKt.s0(formattedValue) || Intrinsics.e(formattedValue, "$0.00")) {
                ProductFullDetails productFullDetailsM = entry.m();
                String currencyIso = entry.getPricePerUnit().getCurrencyIso();
                if (currencyIso == null) {
                    currencyIso = "USD";
                }
                String str2 = currencyIso;
                String formattedValue2 = entry.getPricePerUnit().getFormattedValue();
                String unit = entry.getUnit();
                double value = entry.getPricePerUnit().getValue();
                Double averagePoundEach = entry.getPricePerUnit().getAveragePoundEach();
                productFullDetailsB = ProductFullDetails.b(productFullDetailsM, null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, Co.l.e(str2, unit, value, formattedValue2, averagePoundEach != null ? averagePoundEach.doubleValue() : 0.0d, entry.getPricePerUnit().getPriceText()), false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131073, 268435455, null);
            } else {
                productFullDetailsB = entry.m();
            }
            return new ReadOnlyProductListDecorator(entryNumber, name, str, productFullDetailsB, image, (entry.m().getDiscount() == null || entry.m().getDiscountedPrice() == null) ? false : true, entry.m().getHasMPerksOffers(), entry.getActualQuantity(), entry.getTotalPrice().getFormattedValue(), entry.m().getStockInfo().e(), Double.valueOf(entry.getAllDiscountDetails().getTotalSavings().getValue()), entry.getAllDiscountDetails(), ReadOnlyProductListDecorator.INSTANCE.b(orderStatusType) ? entry.getSubstituteItem() : null, entry.m().getStockInfo().c() && b(orderStatusType));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.r$b */
    public static final class b implements Parcelable.Creator<ReadOnlyProductListDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReadOnlyProductListDecorator createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ProductFullDetails productFullDetails = (ProductFullDetails) parcel.readParcelable(ReadOnlyProductListDecorator.class.getClassLoader());
            nk.g gVar = (nk.g) parcel.readParcelable(ReadOnlyProductListDecorator.class.getClassLoader());
            boolean z12 = false;
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z10 = false;
                z12 = true;
            } else {
                z10 = false;
            }
            double d10 = parcel.readDouble();
            boolean z14 = z10;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = z14;
                z14 = true;
            } else {
                z11 = z14;
            }
            return new ReadOnlyProductListDecorator(i10, string, string2, productFullDetails, gVar, z13, z12, d10, string3, z14, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (AllDiscountDetails) parcel.readParcelable(ReadOnlyProductListDecorator.class.getClassLoader()), (ProductFullDetails) parcel.readParcelable(ReadOnlyProductListDecorator.class.getClassLoader()), parcel.readInt() != 0 ? true : z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReadOnlyProductListDecorator[] newArray(int i10) {
            return new ReadOnlyProductListDecorator[i10];
        }
    }

    public ReadOnlyProductListDecorator() {
        this(0, null, null, null, null, false, false, 0.0d, null, false, null, null, null, false, 16383, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadOnlyProductListDecorator)) {
            return false;
        }
        ReadOnlyProductListDecorator readOnlyProductListDecorator = (ReadOnlyProductListDecorator) other;
        return this.entryNumber == readOnlyProductListDecorator.entryNumber && Intrinsics.e(this.title, readOnlyProductListDecorator.title) && Intrinsics.e(this.notes, readOnlyProductListDecorator.notes) && Intrinsics.e(this.product, readOnlyProductListDecorator.product) && Intrinsics.e(this.thumbnail, readOnlyProductListDecorator.thumbnail) && this.isOnSale == readOnlyProductListDecorator.isOnSale && this.hasMperksOffers == readOnlyProductListDecorator.hasMperksOffers && Double.compare(this.quantity, readOnlyProductListDecorator.quantity) == 0 && Intrinsics.e(this.totalPriceRawValue, readOnlyProductListDecorator.totalPriceRawValue) && this.outOfStock == readOnlyProductListDecorator.outOfStock && Intrinsics.e(this.savingsAmount, readOnlyProductListDecorator.savingsAmount) && Intrinsics.e(this.productSavings, readOnlyProductListDecorator.productSavings) && Intrinsics.e(this.proactiveSubstituteItem, readOnlyProductListDecorator.proactiveSubstituteItem) && this.shouldDisplayLowStockIndicator == readOnlyProductListDecorator.shouldDisplayLowStockIndicator;
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
        dest.writeString(this.totalPriceRawValue);
        dest.writeInt(this.outOfStock ? 1 : 0);
        Double d10 = this.savingsAmount;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeParcelable(this.productSavings, flags);
        dest.writeParcelable(this.proactiveSubstituteItem, flags);
        dest.writeInt(this.shouldDisplayLowStockIndicator ? 1 : 0);
    }

    public ReadOnlyProductListDecorator(int i10, String title, String str, ProductFullDetails product, nk.g gVar, boolean z10, boolean z11, double d10, String str2, boolean z12, Double d11, AllDiscountDetails productSavings, ProductFullDetails productFullDetails, boolean z13) {
        Intrinsics.j(title, "title");
        Intrinsics.j(product, "product");
        Intrinsics.j(productSavings, "productSavings");
        this.entryNumber = i10;
        this.title = title;
        this.notes = str;
        this.product = product;
        this.thumbnail = gVar;
        this.isOnSale = z10;
        this.hasMperksOffers = z11;
        this.quantity = d10;
        this.totalPriceRawValue = str2;
        this.outOfStock = z12;
        this.savingsAmount = d11;
        this.productSavings = productSavings;
        this.proactiveSubstituteItem = productFullDetails;
        this.shouldDisplayLowStockIndicator = z13;
    }

    private final ProductPriceDecorator k() {
        return new ProductPriceDecorator(this.product, false, this.quantity);
    }

    public final AbstractC6392a c() {
        String str = this.notes;
        if (str != null) {
            return AbstractC6392a.INSTANCE.d(C17284b.f163351v, str);
        }
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasMperksOffers() {
        return this.hasMperksOffers;
    }

    public final boolean f() {
        return this.proactiveSubstituteItem != null;
    }

    public final AbstractC6392a g() {
        return AbstractC6392a.INSTANCE.d(Y.f101277x7, Bk.b.e(this.quantity));
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getOutOfStock() {
        return this.outOfStock;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.entryNumber) * 31) + this.title.hashCode()) * 31;
        String str = this.notes;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.product.hashCode()) * 31;
        nk.g gVar = this.thumbnail;
        int iHashCode3 = (((((((iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.hasMperksOffers)) * 31) + Double.hashCode(this.quantity)) * 31;
        String str2 = this.totalPriceRawValue;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.outOfStock)) * 31;
        Double d10 = this.savingsAmount;
        int iHashCode5 = (((iHashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31) + this.productSavings.hashCode()) * 31;
        ProductFullDetails productFullDetails = this.proactiveSubstituteItem;
        return ((iHashCode5 + (productFullDetails != null ? productFullDetails.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldDisplayLowStockIndicator);
    }

    public final AbstractC6392a i() {
        ProductFullDetails productFullDetails = this.proactiveSubstituteItem;
        if (productFullDetails != null) {
            return AbstractC6392a.INSTANCE.d(C17284b.f163355x, productFullDetails.getName());
        }
        return null;
    }

    /* renamed from: j, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: n, reason: from getter */
    public final AllDiscountDetails getProductSavings() {
        return this.productSavings;
    }

    /* renamed from: o, reason: from getter */
    public final Double getSavingsAmount() {
        return this.savingsAmount;
    }

    public final AbstractC6392a q() {
        if (Intrinsics.b(this.savingsAmount, 0.0d)) {
            return null;
        }
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = C17284b.f163353w;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Double d10 = this.savingsAmount;
        return companion.d(i10, currencyInstance.format(d10 != null ? d10.doubleValue() : 0.0d));
    }

    /* renamed from: r, reason: from getter */
    public final boolean getShouldDisplayLowStockIndicator() {
        return this.shouldDisplayLowStockIndicator;
    }

    /* renamed from: s, reason: from getter */
    public final nk.g getThumbnail() {
        return this.thumbnail;
    }

    public final String t() {
        nk.g gVar = this.thumbnail;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    public String toString() {
        return "ReadOnlyProductListDecorator(entryNumber=" + this.entryNumber + ", title=" + this.title + ", notes=" + this.notes + ", product=" + this.product + ", thumbnail=" + this.thumbnail + ", isOnSale=" + this.isOnSale + ", hasMperksOffers=" + this.hasMperksOffers + ", quantity=" + this.quantity + ", totalPriceRawValue=" + this.totalPriceRawValue + ", outOfStock=" + this.outOfStock + ", savingsAmount=" + this.savingsAmount + ", productSavings=" + this.productSavings + ", proactiveSubstituteItem=" + this.proactiveSubstituteItem + ", shouldDisplayLowStockIndicator=" + this.shouldDisplayLowStockIndicator + ')';
    }

    public final AbstractC6392a v() {
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        String str = this.totalPriceRawValue;
        if (str == null) {
            str = "";
        }
        return companion.c(str);
    }

    /* renamed from: w, reason: from getter */
    public final String getTotalPriceRawValue() {
        return this.totalPriceRawValue;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsOnSale() {
        return this.isOnSale;
    }

    public final AbstractC6392a a() {
        return k().j();
    }

    public final AbstractC6392a b() {
        return k().g();
    }

    public final boolean x() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ReadOnlyProductListDecorator(int i10, String str, String str2, ProductFullDetails productFullDetails, nk.g gVar, boolean z10, boolean z11, double d10, String str3, boolean z12, Double d11, AllDiscountDetails allDiscountDetails, ProductFullDetails productFullDetails2, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails, (i11 & 16) != 0 ? null : gVar, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? 0.0d : d10, (i11 & 256) == 0 ? str3 : "", (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? Double.valueOf(0.0d) : d11, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? new AllDiscountDetails(null, null, 3, null) : allDiscountDetails, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? productFullDetails2 : null, (i11 & 8192) != 0 ? false : z13);
    }
}
