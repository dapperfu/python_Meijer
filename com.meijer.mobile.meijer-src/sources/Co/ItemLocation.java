package Co;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u001d$B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b$\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"LCo/g;", "Landroid/os/Parcelable;", "", "code", "LCo/g$c;", "zone", "zoneCode", "aisle", "section", "position", "<init>", "(Ljava/lang/String;LCo/g$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "LCo/g$c;", "d", "()LCo/g$c;", "c", "e", "f", "getPosition", "g", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Co.g, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ItemLocation implements Parcelable {

    /* renamed from: h, reason: collision with root package name */
    private static final Map<String, Zone> f5278h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Zone zone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zoneCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aisle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String section;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String position;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ItemLocation> CREATOR = new b();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR)\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LCo/g$a;", "", "<init>", "()V", "", "code", "LCo/g;", "a", "(Ljava/lang/String;)LCo/g;", "", "LCo/g$c;", "zones", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "getZones$annotations", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Co.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final Co.ItemLocation a(java.lang.String r13) {
            /*
                r12 = this;
                java.lang.String r0 = "toUpperCase(...)"
                java.lang.String r1 = "US"
                java.lang.String r2 = "code"
                kotlin.jvm.internal.Intrinsics.j(r13, r2)
                r2 = 0
                r3 = 0
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L98
                java.lang.String r4 = "-"
                java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L98
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r13
                java.util.List r13 = kotlin.text.StringsKt.b1(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87
                java.lang.Object r4 = r13.get(r3)     // Catch: java.lang.Throwable -> L87
                r7 = r4
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L87
                r4 = 1
                java.lang.Object r4 = r13.get(r4)     // Catch: java.lang.Throwable -> L87
                r8 = r4
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L87
                r4 = 2
                java.lang.Object r4 = r13.get(r4)     // Catch: java.lang.Throwable -> L87
                r9 = r4
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L87
                r4 = 3
                java.lang.Object r13 = r13.get(r4)     // Catch: java.lang.Throwable -> L87
                r10 = r13
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L87
                Co.g$a r13 = Co.ItemLocation.INSTANCE     // Catch: java.lang.Throwable -> L87
                java.util.Map r4 = r13.b()     // Catch: java.lang.Throwable -> L87
                java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Throwable -> L87
                kotlin.jvm.internal.Intrinsics.i(r6, r1)     // Catch: java.lang.Throwable -> L87
                java.lang.String r6 = r7.toUpperCase(r6)     // Catch: java.lang.Throwable -> L87
                kotlin.jvm.internal.Intrinsics.i(r6, r0)     // Catch: java.lang.Throwable -> L87
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L87
                Co.g$c r4 = (Co.ItemLocation.Zone) r4     // Catch: java.lang.Throwable -> L87
                if (r4 != 0) goto L8d
                java.util.Map r13 = r13.b()     // Catch: java.lang.Throwable -> L87
                java.util.Collection r13 = r13.values()     // Catch: java.lang.Throwable -> L87
                java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: java.lang.Throwable -> L87
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L87
            L63:
                boolean r4 = r13.hasNext()     // Catch: java.lang.Throwable -> L87
                if (r4 == 0) goto L8a
                java.lang.Object r4 = r13.next()     // Catch: java.lang.Throwable -> L87
                r6 = r4
                Co.g$c r6 = (Co.ItemLocation.Zone) r6     // Catch: java.lang.Throwable -> L87
                java.util.List r6 = r6.a()     // Catch: java.lang.Throwable -> L87
                java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> L87
                kotlin.jvm.internal.Intrinsics.i(r11, r1)     // Catch: java.lang.Throwable -> L87
                java.lang.String r11 = r7.toUpperCase(r11)     // Catch: java.lang.Throwable -> L87
                kotlin.jvm.internal.Intrinsics.i(r11, r0)     // Catch: java.lang.Throwable -> L87
                boolean r6 = r6.contains(r11)     // Catch: java.lang.Throwable -> L87
                if (r6 == 0) goto L63
                goto L8b
            L87:
                r0 = move-exception
            L88:
                r13 = r0
                goto L9b
            L8a:
                r4 = r2
            L8b:
                Co.g$c r4 = (Co.ItemLocation.Zone) r4     // Catch: java.lang.Throwable -> L87
            L8d:
                r6 = r4
                Co.g r4 = new Co.g     // Catch: java.lang.Throwable -> L87
                r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87
                java.lang.Object r13 = kotlin.Result.b(r4)     // Catch: java.lang.Throwable -> L87
                goto La5
            L98:
                r0 = move-exception
                r5 = r13
                goto L88
            L9b:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r13 = kotlin.ResultKt.a(r13)
                java.lang.Object r13 = kotlin.Result.b(r13)
            La5:
                java.lang.Throwable r0 = kotlin.Result.e(r13)
                if (r0 == 0) goto Lc3
                qw.a$a r1 = qw.a.INSTANCE
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "Failed to parse ILC code "
                r4.append(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r1.u(r0, r4, r3)
            Lc3:
                boolean r0 = kotlin.Result.g(r13)
                if (r0 == 0) goto Lca
                goto Lcb
            Lca:
                r2 = r13
            Lcb:
                Co.g r2 = (Co.ItemLocation) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Co.ItemLocation.Companion.a(java.lang.String):Co.g");
        }

        public final Map<String, Zone> b() {
            return ItemLocation.f5278h;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.g$b */
    public static final class b implements Parcelable.Creator<ItemLocation> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ItemLocation createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ItemLocation(parcel.readString(), parcel.readInt() == 0 ? null : Zone.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ItemLocation[] newArray(int i10) {
            return new ItemLocation[i10];
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"LCo/g$c;", "Landroid/os/Parcelable;", "", "code", "name", "", "altCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "getName", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.g$c, reason: from toString */
    public static final /* data */ class Zone implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> altCodes;
        public static final Parcelable.Creator<Zone> CREATOR = new b();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Co.g$c$b */
        public static final class b implements Parcelable.Creator<Zone> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Zone createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Zone(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Zone[] newArray(int i10) {
                return new Zone[i10];
            }
        }

        public Zone(String code, String name, List<String> altCodes) {
            Intrinsics.j(code, "code");
            Intrinsics.j(name, "name");
            Intrinsics.j(altCodes, "altCodes");
            this.code = code;
            this.name = name;
            this.altCodes = altCodes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zone)) {
                return false;
            }
            Zone zone = (Zone) other;
            return Intrinsics.e(this.code, zone.code) && Intrinsics.e(this.name, zone.name) && Intrinsics.e(this.altCodes, zone.altCodes);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.name);
            dest.writeStringList(this.altCodes);
        }

        public final List<String> a() {
            return this.altCodes;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.altCodes.hashCode();
        }

        public String toString() {
            return "Zone(code=" + this.code + ", name=" + this.name + ", altCodes=" + this.altCodes + ')';
        }

        public /* synthetic */ Zone(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? CollectionsKt.m() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listP = CollectionsKt.p(new Zone("AUTO", "Automotive", CollectionsKt.e("F")), new Zone("BABY", "Baby Center", CollectionsKt.e("U")), new Zone("BLKF", "Black Friday", null, 4, null), new Zone("BAKE", "Bakery", CollectionsKt.e("YU")), new Zone("CARD", "Card and Party", CollectionsKt.e("P")), new Zone("COSM", "Cosmetics", CollectionsKt.e("A")), new Zone("CONS", "Consumables", null, 4, null), new Zone("CRFT", "Crafts", CollectionsKt.e("N")), new Zone("SUPY", "Central Supply", CollectionsKt.e("CS")), new Zone("DELI", "Deli", CollectionsKt.e("YK")), new Zone("HBC", "HBCOTC", null, 4, null), new Zone("ELEC", "Electronics", CollectionsKt.e("C")), new Zone("PHTO", "Photo", CollectionsKt.e("CP")), new Zone("EVNT", "Event", null, 4, null), new Zone("FLOR", "Floral", CollectionsKt.e("Q")), new Zone("FURN", "Furniture", CollectionsKt.e("M")), new Zone("DIY", "Hardware", CollectionsKt.p("G", "H")), new Zone("GAS", "Gas Station", CollectionsKt.e("GS")), new Zone("HDEC", "Home Decor", CollectionsKt.e("L")), new Zone("HRDH", "Hard Home", CollectionsKt.e("J")), new Zone("HOME", "Home", null, 4, null), new Zone("HSOL", "Home Solutions", null, 4, null), new Zone("SEAS", "Seasonal", CollectionsKt.e("B")), new Zone("FROZ", "Frozen", CollectionsKt.e("YF")), new Zone("KIDS", "Kids", CollectionsKt.e("T")), new Zone("LIQU", "Liquor Store", CollectionsKt.e("YL")), new Zone("MEAT", "Meat", CollectionsKt.e("YS")), new Zone("MENS", "Men's", CollectionsKt.e("W")), new Zone("DARY", "Dairy", CollectionsKt.p("YM", "YW")), new Zone("STAT", "School / Home / Office", CollectionsKt.e("O")), new Zone("OUTG", "Outdoor Garden", null, 4, null), new Zone("PETS", "Pets", CollectionsKt.e("I")), new Zone("PROD", "Produce", CollectionsKt.e("YP")), new Zone("JEWL", "Jewelry", CollectionsKt.e("R")), new Zone("SFTH", "Soft Home", CollectionsKt.e("K")), new Zone("SPAD", "Seasonal Pad", null, 4, null), new Zone("SPTS", "Sporting Goods", CollectionsKt.e("E")), new Zone("THNK", "Thanksgiving", 0 == true ? 1 : 0, 4, null), new Zone("TOYS", "Toys", CollectionsKt.e("D")), new Zone("SHOE", "Shoes", CollectionsKt.e("V")), new Zone("WOMS", "Women's", CollectionsKt.e("S")), new Zone("SFTD", "Softlines Drive Aisle", CollectionsKt.e("XD")), new Zone("FDCA", "Foods Center Aisle", CollectionsKt.e("XF")), new Zone("GMCA", "GM Center Aisle", CollectionsKt.e("XG")), new Zone("TCA", "T-Aisle", CollectionsKt.e("XT")), new Zone("GROC", "Grocery", CollectionsKt.p("YA", "YB", "YC", "YD", "Y", "YO")), new Zone("WMNS", "Women's Missy / Plus", null, 4, null), new Zone("WACT", "Women's Active Wear", null, 4, null), new Zone("WBAS", "Women's Basics", null, 4, null), new Zone("WSEA", "Women's Seasonal", null, 4, null), new Zone("JNRS", "Juniors", null, 4, null), new Zone("WIA", "Women's Intimate Apparel", null, 4, null), new Zone("MSPT", "Men's Sportswear", null, 4, null), new Zone("MBAS", "Men's Basics", null, 4, null), new Zone("MACT", "Men's Activewear", null, 4, null), new Zone("MSEA", "Men's Seasonal", null, 4, null), new Zone("TEAM", "Team Sports", null, 4, null), new Zone("YMEN", "Young Men's", null, 4, null), new Zone("GIRL", "Girls / Girls Sleepwear", null, 4, null), new Zone("GBAS", "Girls Basics", null, 4, null), new Zone("BOYS", "Boys / Boys Sleepwear", null, 4, null), new Zone("NIFT", "Newborn / Infant / Toddler / NIT Sleepwear", null, 4, null), new Zone("BBAS", "Boys Basics", null, 4, null), new Zone("XMAS", "Christmas", null, 4, null), new Zone("WIN", "Winter", null, 4, null), new Zone("SPRG", "Spring", null, 4, null), new Zone("SMMR", "Summer", null, 4, null), new Zone("FALL", "Fall", null, 4, null), new Zone("VAL", "Valentines", null, 4, null), new Zone("EAST", "Easter", null, 4, null), new Zone("BTS", "Back-To-School", null, 4, null), new Zone("CKLN", "Checkout Lane", CollectionsKt.p("Z", "ZD")), new Zone("THX", "Thanksgiving", 0 == true ? 1 : 0, 4, null), new Zone("CTC", "CTC 8515", null, 4, null), new Zone("BR", "Back Room", null, 4, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listP, 10)), 16));
        for (Object obj : listP) {
            linkedHashMap.put(((Zone) obj).getCode(), obj);
        }
        f5278h = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemLocation)) {
            return false;
        }
        ItemLocation itemLocation = (ItemLocation) other;
        return Intrinsics.e(this.code, itemLocation.code) && Intrinsics.e(this.zone, itemLocation.zone) && Intrinsics.e(this.zoneCode, itemLocation.zoneCode) && Intrinsics.e(this.aisle, itemLocation.aisle) && Intrinsics.e(this.section, itemLocation.section) && Intrinsics.e(this.position, itemLocation.position);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.code);
        Zone zone = this.zone;
        if (zone == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            zone.writeToParcel(dest, flags);
        }
        dest.writeString(this.zoneCode);
        dest.writeString(this.aisle);
        dest.writeString(this.section);
        dest.writeString(this.position);
    }

    public ItemLocation(String code, Zone zone, String zoneCode, String aisle, String section, String position) {
        Intrinsics.j(code, "code");
        Intrinsics.j(zoneCode, "zoneCode");
        Intrinsics.j(aisle, "aisle");
        Intrinsics.j(section, "section");
        Intrinsics.j(position, "position");
        this.code = code;
        this.zone = zone;
        this.zoneCode = zoneCode;
        this.aisle = aisle;
        this.section = section;
        this.position = position;
    }

    /* renamed from: b, reason: from getter */
    public final String getAisle() {
        return this.aisle;
    }

    /* renamed from: c, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: d, reason: from getter */
    public final Zone getZone() {
        return this.zone;
    }

    /* renamed from: e, reason: from getter */
    public final String getZoneCode() {
        return this.zoneCode;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        Zone zone = this.zone;
        return ((((((((iHashCode + (zone == null ? 0 : zone.hashCode())) * 31) + this.zoneCode.hashCode()) * 31) + this.aisle.hashCode()) * 31) + this.section.hashCode()) * 31) + this.position.hashCode();
    }

    public String toString() {
        return "ItemLocation(code=" + this.code + ", zone=" + this.zone + ", zoneCode=" + this.zoneCode + ", aisle=" + this.aisle + ", section=" + this.section + ", position=" + this.position + ')';
    }
}
