package hn;

import Co.Image;
import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0002(-B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010\"R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b4\u00103R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b>\u00107R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b?\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u0010+\u001a\u0004\b(\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0013\u0010I\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0011\u0010L\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\b-\u0010K¨\u0006N"}, d2 = {"Lhn/q;", "Landroid/os/Parcelable;", "", "itemId", "", "title", "Lnk/g;", "thumbnail", "LCo/h;", "product", "", "quantity", "totalPriceRawValue", "titleSubstituted", "thumbnailSubstituted", "productSubstituted", "quantitySubstituted", "totalPriceRawValueSubstituted", "Lvo/b;", "substitutionScreenType", "customerSubstitutionPreference", "", "showSubstitutedSection", "<init>", "(ILjava/lang/String;Lnk/g;LCo/h;DLjava/lang/String;Ljava/lang/String;Lnk/g;LCo/h;DLjava/lang/String;Lvo/b;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getTitle", "c", "Lnk/g;", "getThumbnail", "()Lnk/g;", "d", "LCo/h;", "()LCo/h;", "e", "D", "getQuantity", "()D", "f", "j", "g", "i", "h", "getThumbnailSubstituted", "getQuantitySubstituted", "k", "l", "Lvo/b;", "()Lvo/b;", "m", "n", "Ljava/lang/Boolean;", "getShowSubstitutedSection", "()Ljava/lang/Boolean;", "thumbnailUrl", "thumbnailUrlSubstituted", "Lbk/a;", "()Lbk/a;", "itemQuantity", "o", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.q, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderSubstitutionsListDecorator implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.g thumbnail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceRawValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleSubstituted;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.g thumbnailSubstituted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails productSubstituted;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantitySubstituted;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceRawValueSubstituted;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final vo.b substitutionScreenType;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerSubstitutionPreference;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showSubstitutedSection;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f136021p = 8;
    public static final Parcelable.Creator<OrderSubstitutionsListDecorator> CREATOR = new b();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhn/q$a;", "", "<init>", "()V", "Lvo/a;", "substitutedItems", "Lvo/b;", "substitutionScreenType", "", "showSubstitutedSection", "Lhn/q;", "a", "(Lvo/a;Lvo/b;Ljava/lang/Boolean;)Lhn/q;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.q$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$a, reason: collision with other inner class name */
        public static final class C2152a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((Image) t10).z()), Boolean.valueOf(((Image) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$c */
        public static final class c<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f136036a;

            public c(Comparator comparator) {
                this.f136036a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f136036a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((Image) t10).Z0(), ((Image) t11).Z0());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$d */
        public static final class d<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((Image) t10).z()), Boolean.valueOf(((Image) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$e */
        public static final class e<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.q$a$f */
        public static final class f<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f136037a;

            public f(Comparator comparator) {
                this.f136037a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f136037a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((Image) t10).Z0(), ((Image) t11).Z0());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ OrderSubstitutionsListDecorator b(Companion companion, OrderSubstitutionItem orderSubstitutionItem, vo.b bVar, Boolean bool, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bVar = null;
            }
            if ((i10 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            return companion.a(orderSubstitutionItem, bVar, bool);
        }

        public final OrderSubstitutionsListDecorator a(OrderSubstitutionItem substitutedItems, vo.b substitutionScreenType, Boolean showSubstitutedSection) {
            Image image;
            Image image2;
            Intrinsics.j(substitutedItems, "substitutedItems");
            List<Image> listD = substitutedItems.d();
            if (listD != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (((Image) obj).h()) {
                        arrayList.add(obj);
                    }
                }
                List listZ0 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList, new f(new d())), new e());
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
                    Image image3 = (Image) CollectionsKt.u0(list2);
                    imageJ = image3 != null ? image3.j(HttpResponseStatus.SUCCESS_OK) : null;
                }
                image = imageJ;
            } else {
                image = null;
            }
            List<Image> listE = substitutedItems.e();
            if (listE != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listE) {
                    if (((Image) obj3).h()) {
                        arrayList4.add(obj3);
                    }
                }
                List listZ02 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList4, new c(new C2152a())), new b());
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : listZ02) {
                    if (((Image) obj4).f() <= 200) {
                        arrayList5.add(obj4);
                    } else {
                        arrayList6.add(obj4);
                    }
                }
                Pair pair2 = new Pair(arrayList5, arrayList6);
                List list3 = (List) pair2.a();
                List list4 = (List) pair2.b();
                Image imageJ2 = (Image) CollectionsKt.F0(list3);
                if (imageJ2 == null) {
                    Image image4 = (Image) CollectionsKt.u0(list4);
                    imageJ2 = image4 != null ? image4.j(HttpResponseStatus.SUCCESS_OK) : null;
                }
                image2 = imageJ2;
            } else {
                image2 = null;
            }
            int itemId = substitutedItems.getItemId();
            String productName = substitutedItems.getProductName();
            String str = productName == null ? "" : productName;
            double productQuantity = substitutedItems.getProductQuantity();
            nk.b productPrice = substitutedItems.getProductPrice();
            String formattedValue = productPrice != null ? productPrice.getFormattedValue() : null;
            String str2 = formattedValue == null ? "" : formattedValue;
            String productNameSubstituted = substitutedItems.getProductNameSubstituted();
            String str3 = productNameSubstituted == null ? "" : productNameSubstituted;
            ProductFullDetails product = substitutedItems.getProduct();
            ProductFullDetails productFullDetails = product == null ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : product;
            ProductFullDetails productSubstituted = substitutedItems.getProductSubstituted();
            ProductFullDetails productFullDetails2 = productSubstituted == null ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productSubstituted;
            nk.b productPriceSubstituted = substitutedItems.getProductPriceSubstituted();
            String formattedValue2 = productPriceSubstituted != null ? productPriceSubstituted.getFormattedValue() : null;
            return new OrderSubstitutionsListDecorator(itemId, str, image, productFullDetails, productQuantity, str2, str3, image2, productFullDetails2, 0.0d, formattedValue2 == null ? "" : formattedValue2, substitutionScreenType, substitutedItems.getCustomerSubstitutionPreference(), showSubstitutedSection, 512, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.q$b */
    public static final class b implements Parcelable.Creator<OrderSubstitutionsListDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionsListDecorator createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            nk.g gVar = (nk.g) parcel.readParcelable(OrderSubstitutionsListDecorator.class.getClassLoader());
            ProductFullDetails productFullDetails = (ProductFullDetails) parcel.readParcelable(OrderSubstitutionsListDecorator.class.getClassLoader());
            double d10 = parcel.readDouble();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            nk.g gVar2 = (nk.g) parcel.readParcelable(OrderSubstitutionsListDecorator.class.getClassLoader());
            ProductFullDetails productFullDetails2 = (ProductFullDetails) parcel.readParcelable(OrderSubstitutionsListDecorator.class.getClassLoader());
            double d11 = parcel.readDouble();
            String string4 = parcel.readString();
            Boolean boolValueOf = null;
            vo.b bVarValueOf = parcel.readInt() == 0 ? null : vo.b.valueOf(parcel.readString());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrderSubstitutionsListDecorator(i10, string, gVar, productFullDetails, d10, string2, string3, gVar2, productFullDetails2, d11, string4, bVarValueOf, string5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionsListDecorator[] newArray(int i10) {
            return new OrderSubstitutionsListDecorator[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lhn/q$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.q$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f136038a = new c("SUBSTITUTED", 0);

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ c[] f136039b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f136040c;

        static {
            c[] cVarArrA = a();
            f136039b = cVarArrA;
            f136040c = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f136038a};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f136039b.clone();
        }

        private c(String str, int i10) {
        }
    }

    public OrderSubstitutionsListDecorator(int i10, String title, nk.g gVar, ProductFullDetails product, double d10, String totalPriceRawValue, String titleSubstituted, nk.g gVar2, ProductFullDetails productSubstituted, double d11, String totalPriceRawValueSubstituted, vo.b bVar, String str, Boolean bool) {
        Intrinsics.j(title, "title");
        Intrinsics.j(product, "product");
        Intrinsics.j(totalPriceRawValue, "totalPriceRawValue");
        Intrinsics.j(titleSubstituted, "titleSubstituted");
        Intrinsics.j(productSubstituted, "productSubstituted");
        Intrinsics.j(totalPriceRawValueSubstituted, "totalPriceRawValueSubstituted");
        this.itemId = i10;
        this.title = title;
        this.thumbnail = gVar;
        this.product = product;
        this.quantity = d10;
        this.totalPriceRawValue = totalPriceRawValue;
        this.titleSubstituted = titleSubstituted;
        this.thumbnailSubstituted = gVar2;
        this.productSubstituted = productSubstituted;
        this.quantitySubstituted = d11;
        this.totalPriceRawValueSubstituted = totalPriceRawValueSubstituted;
        this.substitutionScreenType = bVar;
        this.customerSubstitutionPreference = str;
        this.showSubstitutedSection = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSubstitutionsListDecorator)) {
            return false;
        }
        OrderSubstitutionsListDecorator orderSubstitutionsListDecorator = (OrderSubstitutionsListDecorator) other;
        return this.itemId == orderSubstitutionsListDecorator.itemId && Intrinsics.e(this.title, orderSubstitutionsListDecorator.title) && Intrinsics.e(this.thumbnail, orderSubstitutionsListDecorator.thumbnail) && Intrinsics.e(this.product, orderSubstitutionsListDecorator.product) && Double.compare(this.quantity, orderSubstitutionsListDecorator.quantity) == 0 && Intrinsics.e(this.totalPriceRawValue, orderSubstitutionsListDecorator.totalPriceRawValue) && Intrinsics.e(this.titleSubstituted, orderSubstitutionsListDecorator.titleSubstituted) && Intrinsics.e(this.thumbnailSubstituted, orderSubstitutionsListDecorator.thumbnailSubstituted) && Intrinsics.e(this.productSubstituted, orderSubstitutionsListDecorator.productSubstituted) && Double.compare(this.quantitySubstituted, orderSubstitutionsListDecorator.quantitySubstituted) == 0 && Intrinsics.e(this.totalPriceRawValueSubstituted, orderSubstitutionsListDecorator.totalPriceRawValueSubstituted) && this.substitutionScreenType == orderSubstitutionsListDecorator.substitutionScreenType && Intrinsics.e(this.customerSubstitutionPreference, orderSubstitutionsListDecorator.customerSubstitutionPreference) && Intrinsics.e(this.showSubstitutedSection, orderSubstitutionsListDecorator.showSubstitutedSection);
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerSubstitutionPreference() {
        return this.customerSubstitutionPreference;
    }

    /* renamed from: b, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    public final AbstractC6392a c() {
        return AbstractC6392a.INSTANCE.d(Y.f101257w7, Integer.valueOf((int) this.quantity));
    }

    /* renamed from: d, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: e, reason: from getter */
    public final ProductFullDetails getProductSubstituted() {
        return this.productSubstituted;
    }

    /* renamed from: f, reason: from getter */
    public final vo.b getSubstitutionScreenType() {
        return this.substitutionScreenType;
    }

    public final String g() {
        nk.g gVar = this.thumbnail;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String h() {
        nk.g gVar = this.thumbnailSubstituted;
        if (gVar != null) {
            return gVar.getUrl();
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.itemId) * 31) + this.title.hashCode()) * 31;
        nk.g gVar = this.thumbnail;
        int iHashCode2 = (((((((((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.product.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.totalPriceRawValue.hashCode()) * 31) + this.titleSubstituted.hashCode()) * 31;
        nk.g gVar2 = this.thumbnailSubstituted;
        int iHashCode3 = (((((((iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31) + this.productSubstituted.hashCode()) * 31) + Double.hashCode(this.quantitySubstituted)) * 31) + this.totalPriceRawValueSubstituted.hashCode()) * 31;
        vo.b bVar = this.substitutionScreenType;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.customerSubstitutionPreference;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showSubstitutedSection;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getTitleSubstituted() {
        return this.titleSubstituted;
    }

    /* renamed from: j, reason: from getter */
    public final String getTotalPriceRawValue() {
        return this.totalPriceRawValue;
    }

    /* renamed from: k, reason: from getter */
    public final String getTotalPriceRawValueSubstituted() {
        return this.totalPriceRawValueSubstituted;
    }

    public String toString() {
        return "OrderSubstitutionsListDecorator(itemId=" + this.itemId + ", title=" + this.title + ", thumbnail=" + this.thumbnail + ", product=" + this.product + ", quantity=" + this.quantity + ", totalPriceRawValue=" + this.totalPriceRawValue + ", titleSubstituted=" + this.titleSubstituted + ", thumbnailSubstituted=" + this.thumbnailSubstituted + ", productSubstituted=" + this.productSubstituted + ", quantitySubstituted=" + this.quantitySubstituted + ", totalPriceRawValueSubstituted=" + this.totalPriceRawValueSubstituted + ", substitutionScreenType=" + this.substitutionScreenType + ", customerSubstitutionPreference=" + this.customerSubstitutionPreference + ", showSubstitutedSection=" + this.showSubstitutedSection + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.itemId);
        dest.writeString(this.title);
        dest.writeParcelable(this.thumbnail, flags);
        dest.writeParcelable(this.product, flags);
        dest.writeDouble(this.quantity);
        dest.writeString(this.totalPriceRawValue);
        dest.writeString(this.titleSubstituted);
        dest.writeParcelable(this.thumbnailSubstituted, flags);
        dest.writeParcelable(this.productSubstituted, flags);
        dest.writeDouble(this.quantitySubstituted);
        dest.writeString(this.totalPriceRawValueSubstituted);
        vo.b bVar = this.substitutionScreenType;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.customerSubstitutionPreference);
        Boolean bool = this.showSubstitutedSection;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ OrderSubstitutionsListDecorator(int i10, String str, nk.g gVar, ProductFullDetails productFullDetails, double d10, String str2, String str3, nk.g gVar2, ProductFullDetails productFullDetails2, double d11, String str4, vo.b bVar, String str5, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : gVar, (i11 & 8) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails, (i11 & 16) != 0 ? 0.0d : d10, (i11 & 32) != 0 ? "" : str2, (i11 & 64) != 0 ? "" : str3, (i11 & 128) != 0 ? null : gVar2, (i11 & 256) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails2, (i11 & 512) == 0 ? d11 : 0.0d, (i11 & 1024) != 0 ? "" : str4, (i11 & RecyclerView.m.FLAG_MOVED) == 0 ? bVar : null, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? str5 : "", (i11 & 8192) != 0 ? Boolean.FALSE : bool);
    }
}
