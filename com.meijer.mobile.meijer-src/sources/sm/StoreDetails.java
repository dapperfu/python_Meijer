package sm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.instoreshopping.service.store.models.StoreDetailsItemResponse;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u000302+BÅ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010#J\u001a\u0010)\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b4\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b2\u00107R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b+\u0010%R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b8\u0010%R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b5\u0010%R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u0010%R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\b0\u0010@R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\b\u0015\u0010FR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u0010%R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\b:\u0010FR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\b\u0018\u0010FR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\b\u0019\u0010F¨\u0006N"}, d2 = {"Lsm/a;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "", "storeName", "storeShortName", "storePhoneNumber", "storeHours", "Lsm/a$c;", "state", "city", "zip", "streetAddress", "storeCityStateZip", "", "latitude", "longitude", "milesFromCurrentLocation", "", "isLabStore", "isPharmacy", "pharmacyPhone", "isShopAndScanEnabledStore", "isMobileShoppingEnabled", "isMobilePaymentEnabled", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDZZLjava/lang/String;ZZZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getStoreName", "c", "e", "d", "getStorePhoneNumber", "getStoreHours", "f", "Lsm/a$c;", "()Lsm/a$c;", "g", "h", "i", "j", "getStoreCityStateZip", "k", "D", "getLatitude", "()D", "l", "getLongitude", "m", "n", "Z", "()Z", "o", "p", "getPharmacyPhone", "q", "r", "s", "t", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sm.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class StoreDetails implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeShortName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storePhoneNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeHours;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeCityStateZip;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final double latitude;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final double longitude;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final double milesFromCurrentLocation;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLabStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPharmacy;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyPhone;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShopAndScanEnabledStore;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobileShoppingEnabled;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobilePaymentEnabled;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<StoreDetails> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsm/a$a;", "", "<init>", "()V", "Lcom/meijer/mobile/instoreshopping/service/store/models/StoreDetailsItemResponse;", "Lsm/a;", "a", "(Lcom/meijer/mobile/instoreshopping/service/store/models/StoreDetailsItemResponse;)Lsm/a;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: sm.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StoreDetails a(StoreDetailsItemResponse storeDetailsItemResponse) {
            c next;
            Intrinsics.j(storeDetailsItemResponse, "<this>");
            Iterator<c> it = c.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(next.getAbbreviation(), storeDetailsItemResponse.getStateCode())) {
                    break;
                }
            }
            c cVar = next;
            if (cVar == null) {
                cVar = c.f160863i;
            }
            c cVar2 = cVar;
            boolean zH = StringsKt.H(storeDetailsItemResponse.getIsMobileShoppingEnabled(), "Y", true);
            boolean zH2 = StringsKt.H(storeDetailsItemResponse.getIsMobilePaymentEnabled(), "Y", true);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str = String.format(Locale.US, "%s, %s %s", Arrays.copyOf(new Object[]{storeDetailsItemResponse.getCity(), cVar2.getAbbreviation(), storeDetailsItemResponse.getZip()}, 3));
            Intrinsics.i(str, "format(...)");
            return new StoreDetails(storeDetailsItemResponse.getStoreId(), storeDetailsItemResponse.getStoreName(), storeDetailsItemResponse.getStoreShortName(), storeDetailsItemResponse.getStorePhoneNumber(), storeDetailsItemResponse.getStoreHours(), cVar2, storeDetailsItemResponse.getCity(), storeDetailsItemResponse.getZip(), storeDetailsItemResponse.getStreetAddress(), str, storeDetailsItemResponse.getLatitude(), storeDetailsItemResponse.getLongitude(), storeDetailsItemResponse.getMilesFrom(), StringsKt.b0(storeDetailsItemResponse.getStoreShortName(), "LAB", true), storeDetailsItemResponse.getIsPharmacy(), storeDetailsItemResponse.getPharmacyPhone(), zH && Intrinsics.e(storeDetailsItemResponse.getStoreTypeCode(), d.f160868b.getCode()), zH, zH2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sm.a$b */
    public static final class b implements Parcelable.Creator<StoreDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoreDetails createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            String str;
            boolean z13;
            boolean z14;
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            double d10 = parcel.readDouble();
            double d11 = parcel.readDouble();
            double d12 = parcel.readDouble();
            boolean z15 = false;
            boolean z16 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z15 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z16 = z10;
            }
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z11;
                str = string9;
                z13 = z12;
            } else {
                z12 = z11;
                str = string9;
                z13 = z10;
            }
            if (parcel.readInt() != 0) {
                z14 = z12;
            } else {
                z14 = z12;
                z12 = z10;
            }
            if (parcel.readInt() == 0) {
                z14 = z10;
            }
            return new StoreDetails(i10, string, string2, string3, string4, cVarValueOf, string5, string6, string7, string8, d10, d11, d12, z15, z16, str, z13, z12, z14);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoreDetails[] newArray(int i10) {
            return new StoreDetails[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lsm/a$c;", "", "", "sortOrder", "", "abbreviation", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "I", "l", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sm.a$c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f160857c = new c("MICHIGAN", 0, 0, "MI");

        /* renamed from: d, reason: collision with root package name */
        public static final c f160858d = new c("ILLINOIS", 1, 1, "IL");

        /* renamed from: e, reason: collision with root package name */
        public static final c f160859e = new c("INDIANA", 2, 2, "IN");

        /* renamed from: f, reason: collision with root package name */
        public static final c f160860f = new c("OHIO", 3, 3, "OH");

        /* renamed from: g, reason: collision with root package name */
        public static final c f160861g = new c("WISCONSIN", 4, 4, "WI");

        /* renamed from: h, reason: collision with root package name */
        public static final c f160862h = new c("KENTUCKY", 5, 5, "KY");

        /* renamed from: i, reason: collision with root package name */
        public static final c f160863i = new c("UNKNOWN", 6, 99, "");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f160864j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f160865k;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int sortOrder;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String abbreviation;

        public static EnumEntries<c> e() {
            return f160865k;
        }

        static {
            c[] cVarArrA = a();
            f160864j = cVarArrA;
            f160865k = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f160857c, f160858d, f160859e, f160860f, f160861g, f160862h, f160863i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f160864j.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getAbbreviation() {
            return this.abbreviation;
        }

        /* renamed from: l, reason: from getter */
        public final int getSortOrder() {
            return this.sortOrder;
        }

        private c(String str, int i10, int i11, String str2) {
            this.sortOrder = i11;
            this.abbreviation = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lsm/a$d;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sm.a$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f160868b = new d("MEIJER_STORE", 0, "MS");

        /* renamed from: c, reason: collision with root package name */
        public static final d f160869c = new d("CONVENIENT_STOP", 1, "CS");

        /* renamed from: d, reason: collision with root package name */
        public static final d f160870d = new d("MEIJER_PHARMACY", 2, "MP");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f160871e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f160872f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String code;

        static {
            d[] dVarArrA = a();
            f160871e = dVarArrA;
            f160872f = EnumEntriesKt.a(dVarArrA);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f160868b, f160869c, f160870d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f160871e.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        private d(String str, int i10, String str2) {
            this.code = str2;
        }
    }

    public StoreDetails() {
        this(0, null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, 0.0d, false, false, null, false, false, false, 524287, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreDetails)) {
            return false;
        }
        StoreDetails storeDetails = (StoreDetails) other;
        return this.id == storeDetails.id && Intrinsics.e(this.storeName, storeDetails.storeName) && Intrinsics.e(this.storeShortName, storeDetails.storeShortName) && Intrinsics.e(this.storePhoneNumber, storeDetails.storePhoneNumber) && Intrinsics.e(this.storeHours, storeDetails.storeHours) && this.state == storeDetails.state && Intrinsics.e(this.city, storeDetails.city) && Intrinsics.e(this.zip, storeDetails.zip) && Intrinsics.e(this.streetAddress, storeDetails.streetAddress) && Intrinsics.e(this.storeCityStateZip, storeDetails.storeCityStateZip) && Double.compare(this.latitude, storeDetails.latitude) == 0 && Double.compare(this.longitude, storeDetails.longitude) == 0 && Double.compare(this.milesFromCurrentLocation, storeDetails.milesFromCurrentLocation) == 0 && this.isLabStore == storeDetails.isLabStore && this.isPharmacy == storeDetails.isPharmacy && Intrinsics.e(this.pharmacyPhone, storeDetails.pharmacyPhone) && this.isShopAndScanEnabledStore == storeDetails.isShopAndScanEnabledStore && this.isMobileShoppingEnabled == storeDetails.isMobileShoppingEnabled && this.isMobilePaymentEnabled == storeDetails.isMobilePaymentEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.storeName);
        dest.writeString(this.storeShortName);
        dest.writeString(this.storePhoneNumber);
        dest.writeString(this.storeHours);
        dest.writeString(this.state.name());
        dest.writeString(this.city);
        dest.writeString(this.zip);
        dest.writeString(this.streetAddress);
        dest.writeString(this.storeCityStateZip);
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeDouble(this.milesFromCurrentLocation);
        dest.writeInt(this.isLabStore ? 1 : 0);
        dest.writeInt(this.isPharmacy ? 1 : 0);
        dest.writeString(this.pharmacyPhone);
        dest.writeInt(this.isShopAndScanEnabledStore ? 1 : 0);
        dest.writeInt(this.isMobileShoppingEnabled ? 1 : 0);
        dest.writeInt(this.isMobilePaymentEnabled ? 1 : 0);
    }

    public StoreDetails(int i10, String storeName, String storeShortName, String storePhoneNumber, String storeHours, c state, String city, String zip, String streetAddress, String storeCityStateZip, double d10, double d11, double d12, boolean z10, boolean z11, String pharmacyPhone, boolean z12, boolean z13, boolean z14) {
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(storeShortName, "storeShortName");
        Intrinsics.j(storePhoneNumber, "storePhoneNumber");
        Intrinsics.j(storeHours, "storeHours");
        Intrinsics.j(state, "state");
        Intrinsics.j(city, "city");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(storeCityStateZip, "storeCityStateZip");
        Intrinsics.j(pharmacyPhone, "pharmacyPhone");
        this.id = i10;
        this.storeName = storeName;
        this.storeShortName = storeShortName;
        this.storePhoneNumber = storePhoneNumber;
        this.storeHours = storeHours;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.streetAddress = streetAddress;
        this.storeCityStateZip = storeCityStateZip;
        this.latitude = d10;
        this.longitude = d11;
        this.milesFromCurrentLocation = d12;
        this.isLabStore = z10;
        this.isPharmacy = z11;
        this.pharmacyPhone = pharmacyPhone;
        this.isShopAndScanEnabledStore = z12;
        this.isMobileShoppingEnabled = z13;
        this.isMobilePaymentEnabled = z14;
    }

    /* renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final double getMilesFromCurrentLocation() {
        return this.milesFromCurrentLocation;
    }

    /* renamed from: d, reason: from getter */
    public final c getState() {
        return this.state;
    }

    /* renamed from: e, reason: from getter */
    public final String getStoreShortName() {
        return this.storeShortName;
    }

    /* renamed from: f, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: g, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsLabStore() {
        return this.isLabStore;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.storeName.hashCode()) * 31) + this.storeShortName.hashCode()) * 31) + this.storePhoneNumber.hashCode()) * 31) + this.storeHours.hashCode()) * 31) + this.state.hashCode()) * 31) + this.city.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.streetAddress.hashCode()) * 31) + this.storeCityStateZip.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.milesFromCurrentLocation)) * 31) + Boolean.hashCode(this.isLabStore)) * 31) + Boolean.hashCode(this.isPharmacy)) * 31) + this.pharmacyPhone.hashCode()) * 31) + Boolean.hashCode(this.isShopAndScanEnabledStore)) * 31) + Boolean.hashCode(this.isMobileShoppingEnabled)) * 31) + Boolean.hashCode(this.isMobilePaymentEnabled);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsShopAndScanEnabledStore() {
        return this.isShopAndScanEnabledStore;
    }

    public String toString() {
        return "StoreDetails(id=" + this.id + ", storeName=" + this.storeName + ", storeShortName=" + this.storeShortName + ", storePhoneNumber=" + this.storePhoneNumber + ", storeHours=" + this.storeHours + ", state=" + this.state + ", city=" + this.city + ", zip=" + this.zip + ", streetAddress=" + this.streetAddress + ", storeCityStateZip=" + this.storeCityStateZip + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", milesFromCurrentLocation=" + this.milesFromCurrentLocation + ", isLabStore=" + this.isLabStore + ", isPharmacy=" + this.isPharmacy + ", pharmacyPhone=" + this.pharmacyPhone + ", isShopAndScanEnabledStore=" + this.isShopAndScanEnabledStore + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", isMobilePaymentEnabled=" + this.isMobilePaymentEnabled + ')';
    }

    public /* synthetic */ StoreDetails(int i10, String str, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, String str8, double d10, double d11, double d12, boolean z10, boolean z11, String str9, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? c.f160863i : cVar, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7, (i11 & 512) != 0 ? "" : str8, (i11 & 1024) != 0 ? 0.0d : d10, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? 0.0d : d11, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? d12 : 0.0d, (i11 & 8192) != 0 ? false : z10, (i11 & 16384) != 0 ? false : z11, (i11 & 32768) == 0 ? str9 : "", (i11 & 65536) != 0 ? false : z12, (i11 & 131072) != 0 ? false : z13, (i11 & 262144) != 0 ? false : z14);
    }
}
