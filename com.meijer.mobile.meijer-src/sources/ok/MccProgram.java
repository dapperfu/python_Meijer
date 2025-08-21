package ok;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002!\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lok/b;", "Landroid/os/Parcelable;", "Lok/b$c;", "enrollmentStatus", "", "dollarProgress", "dollarProgressTarget", "<init>", "(Lok/b$c;FF)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lok/b$c;", "getEnrollmentStatus", "()Lok/b$c;", "b", "F", "c", "Lok/a;", "value", "()Lok/a;", "setEarnRequirement", "(Lok/a;)V", "earnRequirement", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ok.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class MccProgram implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c enrollmentStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private float dollarProgress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private float dollarProgressTarget;
    public static final Parcelable.Creator<MccProgram> CREATOR = new C2387b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.b$b, reason: collision with other inner class name */
    public static final class C2387b implements Parcelable.Creator<MccProgram> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MccProgram createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new MccProgram(c.valueOf(parcel.readString()), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MccProgram[] newArray(int i10) {
            return new MccProgram[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lok/b$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.b$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f154293a = new c("UNKNOWN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f154294b = new c("NOT_ENROLLED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f154295c = new c("ENROLLED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f154296d = new c("NEW_TERMS_OPTIONAL", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final c f154297e = new c("NEW_TERMS_REQUIRED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final c f154298f = new c("INACTIVE", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final c f154299g = new c("OPTED_OUT", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final c f154300h = new c("UNENROLLED", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final c f154301i = new c("OPTED_OUT_WITHIN_48_HOURS", 8);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f154302j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f154303k;

        public static EnumEntries<c> b() {
            return f154303k;
        }

        static {
            c[] cVarArrA = a();
            f154302j = cVarArrA;
            f154303k = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f154293a, f154294b, f154295c, f154296d, f154297e, f154298f, f154299g, f154300h, f154301i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f154302j.clone();
        }

        private c(String str, int i10) {
        }
    }

    public MccProgram() {
        this(null, 0.0f, 0.0f, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MccProgram)) {
            return false;
        }
        MccProgram mccProgram = (MccProgram) other;
        return this.enrollmentStatus == mccProgram.enrollmentStatus && Float.compare(this.dollarProgress, mccProgram.dollarProgress) == 0 && Float.compare(this.dollarProgressTarget, mccProgram.dollarProgressTarget) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.enrollmentStatus.name());
        dest.writeFloat(this.dollarProgress);
        dest.writeFloat(this.dollarProgressTarget);
    }

    public MccProgram(c enrollmentStatus, float f10, float f11) {
        Intrinsics.j(enrollmentStatus, "enrollmentStatus");
        this.enrollmentStatus = enrollmentStatus;
        this.dollarProgress = f10;
        this.dollarProgressTarget = f11;
    }

    public final DollarEarnRequirement a() {
        return new DollarEarnRequirement(this.dollarProgress, this.dollarProgressTarget);
    }

    public int hashCode() {
        return (((this.enrollmentStatus.hashCode() * 31) + Float.hashCode(this.dollarProgress)) * 31) + Float.hashCode(this.dollarProgressTarget);
    }

    public String toString() {
        return "MccProgram(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ", dollarProgressTarget=" + this.dollarProgressTarget + ')';
    }

    public /* synthetic */ MccProgram(c cVar, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f154293a : cVar, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }
}
