package nk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002#\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R$\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lnk/b;", "Landroid/os/Parcelable;", "Lnk/b$c;", "enrollmentStatus", "", "dollarProgress", "dollarProgressTarget", "<init>", "(Lnk/b$c;FF)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/b$c;", "getEnrollmentStatus", "()Lnk/b$c;", "setEnrollmentStatus", "(Lnk/b$c;)V", "b", "F", "c", "Lnk/a;", "value", "()Lnk/a;", "setEarnRequirement", "(Lnk/a;)V", "earnRequirement", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nk.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class MccProgram implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("enrollmentStatus")
    private c enrollmentStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("dollarProgress")
    private float dollarProgress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("dollarProgressTarget")
    private float dollarProgressTarget;
    public static final Parcelable.Creator<MccProgram> CREATOR = new C2346b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.b$b, reason: collision with other inner class name */
    public static final class C2346b implements Parcelable.Creator<MccProgram> {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lnk/b$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.b$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @InterfaceC15617c(alternate = {"1"}, value = "notEnrolled")
        public static final c f151834a = new c("NOT_ENROLLED", 0);

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC15617c(alternate = {"2"}, value = "enrolled")
        public static final c f151835b = new c("ENROLLED", 1);

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC15617c(alternate = {"6"}, value = "optedOut")
        public static final c f151836c = new c("OPTED_OUT", 2);

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC15617c(alternate = {"8"}, value = "optedOutWithin48Hours")
        public static final c f151837d = new c("OPTED_OUT_WITHIN_48_HOURS", 3);

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC15617c(zzbz.UNKNOWN_CONTENT_TYPE)
        public static final c f151838e = new c("UNKNOWN", 4);

        /* renamed from: f, reason: collision with root package name */
        @InterfaceC15617c("inactive")
        public static final c f151839f = new c("INACTIVE", 5);

        /* renamed from: g, reason: collision with root package name */
        @InterfaceC15617c("unenrolled")
        public static final c f151840g = new c("UNENROLLED", 6);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ c[] f151841h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f151842i;

        public static EnumEntries<c> b() {
            return f151842i;
        }

        static {
            c[] cVarArrA = a();
            f151841h = cVarArrA;
            f151842i = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f151834a, f151835b, f151836c, f151837d, f151838e, f151839f, f151840g};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f151841h.clone();
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
        this((i10 & 1) != 0 ? c.f151838e : cVar, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }
}
