package fj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002(\u0016B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b(\u0010.R\u0011\u00101\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lfj/j;", "Landroid/os/Parcelable;", "Lfj/i;", "entry", "Lnk/i;", "productQuantity", "Lfj/j$c;", "statusCode", "", "expectedQuantityChange", "actualQuantityChange", "<init>", "(Lfj/i;Lnk/i;Lfj/j$c;DD)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Lfj/i;Lnk/i;Lfj/j$c;DD)Lfj/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfj/i;", "d", "()Lfj/i;", "b", "Lnk/i;", "f", "()Lnk/i;", "c", "Lfj/j$c;", "g", "()Lfj/j$c;", "D", "e", "()D", "h", "()Z", "isSuccess", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.j, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class EntryChange implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Entry entry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.i productQuantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c statusCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double expectedQuantityChange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantityChange;
    public static final Parcelable.Creator<EntryChange> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    private static final List<c> f131914g = CollectionsKt.p(c.f131924f, c.f131920b);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.j$b */
    public static final class b implements Parcelable.Creator<EntryChange> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryChange createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new EntryChange(parcel.readInt() == 0 ? null : Entry.CREATOR.createFromParcel(parcel), (nk.i) parcel.readParcelable(EntryChange.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EntryChange[] newArray(int i10) {
            return new EntryChange[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lfj/j$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.j$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f131920b = new c("SUCCESS", 0, "success");

        /* renamed from: c, reason: collision with root package name */
        public static final c f131921c = new c("NO_STOCK", 1, "noStock");

        /* renamed from: d, reason: collision with root package name */
        public static final c f131922d = new c("LOW_STOCK", 2, "lowStock");

        /* renamed from: e, reason: collision with root package name */
        public static final c f131923e = new c("UNAVAILABLE", 3, "unavailable");

        /* renamed from: f, reason: collision with root package name */
        public static final c f131924f = new c("SUCCESSFULLY_REMOVED", 4, "succesfullyRemoved");

        /* renamed from: g, reason: collision with root package name */
        public static final c f131925g = new c("ALREADY_REMOVED", 5, "Quantity must be a positive non-zero value");

        /* renamed from: h, reason: collision with root package name */
        public static final c f131926h = new c("UNKNOWN_UPC", 6, "unknownUpc");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f131927i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f131928j;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String code;

        public static EnumEntries<c> e() {
            return f131928j;
        }

        static {
            c[] cVarArrA = a();
            f131927i = cVarArrA;
            f131928j = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f131920b, f131921c, f131922d, f131923e, f131924f, f131925g, f131926h};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f131927i.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        private c(String str, int i10, String str2) {
            this.code = str2;
        }
    }

    public EntryChange() {
        this(null, null, null, 0.0d, 0.0d, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryChange)) {
            return false;
        }
        EntryChange entryChange = (EntryChange) other;
        return Intrinsics.e(this.entry, entryChange.entry) && Intrinsics.e(this.productQuantity, entryChange.productQuantity) && this.statusCode == entryChange.statusCode && Double.compare(this.expectedQuantityChange, entryChange.expectedQuantityChange) == 0 && Double.compare(this.actualQuantityChange, entryChange.actualQuantityChange) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Entry c14013i = this.entry;
        if (c14013i == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c14013i.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.productQuantity, flags);
        dest.writeString(this.statusCode.name());
        dest.writeDouble(this.expectedQuantityChange);
        dest.writeDouble(this.actualQuantityChange);
    }

    public EntryChange(Entry c14013i, nk.i iVar, c statusCode, double d10, double d11) {
        Intrinsics.j(statusCode, "statusCode");
        this.entry = c14013i;
        this.productQuantity = iVar;
        this.statusCode = statusCode;
        this.expectedQuantityChange = d10;
        this.actualQuantityChange = d11;
    }

    public static /* synthetic */ EntryChange b(EntryChange entryChange, Entry c14013i, nk.i iVar, c cVar, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c14013i = entryChange.entry;
        }
        if ((i10 & 2) != 0) {
            iVar = entryChange.productQuantity;
        }
        if ((i10 & 4) != 0) {
            cVar = entryChange.statusCode;
        }
        if ((i10 & 8) != 0) {
            d10 = entryChange.expectedQuantityChange;
        }
        if ((i10 & 16) != 0) {
            d11 = entryChange.actualQuantityChange;
        }
        double d12 = d11;
        c cVar2 = cVar;
        return entryChange.a(c14013i, iVar, cVar2, d10, d12);
    }

    public final EntryChange a(Entry entry, nk.i productQuantity, c statusCode, double expectedQuantityChange, double actualQuantityChange) {
        Intrinsics.j(statusCode, "statusCode");
        return new EntryChange(entry, productQuantity, statusCode, expectedQuantityChange, actualQuantityChange);
    }

    /* renamed from: c, reason: from getter */
    public final double getActualQuantityChange() {
        return this.actualQuantityChange;
    }

    /* renamed from: d, reason: from getter */
    public final Entry getEntry() {
        return this.entry;
    }

    /* renamed from: e, reason: from getter */
    public final double getExpectedQuantityChange() {
        return this.expectedQuantityChange;
    }

    /* renamed from: f, reason: from getter */
    public final nk.i getProductQuantity() {
        return this.productQuantity;
    }

    /* renamed from: g, reason: from getter */
    public final c getStatusCode() {
        return this.statusCode;
    }

    public final boolean h() {
        return f131914g.contains(this.statusCode);
    }

    public int hashCode() {
        Entry c14013i = this.entry;
        int iHashCode = (c14013i == null ? 0 : c14013i.hashCode()) * 31;
        nk.i iVar = this.productQuantity;
        return ((((((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.statusCode.hashCode()) * 31) + Double.hashCode(this.expectedQuantityChange)) * 31) + Double.hashCode(this.actualQuantityChange);
    }

    public String toString() {
        return "EntryChange(entry=" + this.entry + ", productQuantity=" + this.productQuantity + ", statusCode=" + this.statusCode + ", expectedQuantityChange=" + this.expectedQuantityChange + ", actualQuantityChange=" + this.actualQuantityChange + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EntryChange(Entry c14013i, nk.i iVar, c cVar, double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        c14013i = (i10 & 1) != 0 ? null : c14013i;
        this(c14013i, (i10 & 2) != 0 ? c14013i : iVar, (i10 & 4) != 0 ? c.f131920b : cVar, (i10 & 8) != 0 ? 0.0d : d10, (i10 & 16) != 0 ? 0.0d : d11);
    }
}
