package ok;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001f\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0013j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lok/b;", "Landroid/os/Parcelable;", "", "", "fullName", "fuelType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ok.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC16091b implements Parcelable {
    public static final Parcelable.Creator<EnumC16091b> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    @com.squareup.moshi.g(name = "UNL-Regular Unleaded")
    public static final EnumC16091b f153844c = new EnumC16091b("REGULAR", 0, "UNL-Regular Unleaded", "Regular");

    /* renamed from: d, reason: collision with root package name */
    @com.squareup.moshi.g(name = "MID-Medium Unleaded")
    public static final EnumC16091b f153845d = new EnumC16091b("MIDGRADE", 1, "MID-Medium Unleaded", "Mid-Grade");

    /* renamed from: e, reason: collision with root package name */
    @com.squareup.moshi.g(name = "PREM-Premium Unleaded")
    public static final EnumC16091b f153846e = new EnumC16091b("PREMIUM", 2, "PREM-Premium Unleaded", "Premium");

    /* renamed from: f, reason: collision with root package name */
    @com.squareup.moshi.g(name = "DSL-Diesel")
    public static final EnumC16091b f153847f = new EnumC16091b("DIESEL", 3, "DSL-Diesel", "Diesel");

    /* renamed from: g, reason: collision with root package name */
    @com.squareup.moshi.g(name = "E85-Premium Unleaded")
    public static final EnumC16091b f153848g = new EnumC16091b("E85", 4, "E85-Premium Unleaded", "E-85");

    /* renamed from: h, reason: collision with root package name */
    @com.squareup.moshi.g(name = "BIO-Regular Unleaded")
    public static final EnumC16091b f153849h = new EnumC16091b("BIO", 5, "BIO-Regular Unleaded", "BIO");

    /* renamed from: i, reason: collision with root package name */
    @com.squareup.moshi.g(name = "RAC-Racing Fuel")
    public static final EnumC16091b f153850i = new EnumC16091b("RAC", 6, "RAC-Racing Fuel", "RAC");

    /* renamed from: j, reason: collision with root package name */
    @com.squareup.moshi.g(name = "KERO-Kerosene")
    public static final EnumC16091b f153851j = new EnumC16091b("KEROSENE", 7, "KERO-Kerosene", "Kerosene");

    /* renamed from: k, reason: collision with root package name */
    @com.squareup.moshi.g(name = "E15-Unleaded 88")
    public static final EnumC16091b f153852k = new EnumC16091b("E15", 8, "E15-Unleaded 88", "E15");

    /* renamed from: l, reason: collision with root package name */
    @com.squareup.moshi.g(name = "REC-Ethanol free rec fuel")
    public static final EnumC16091b f153853l = new EnumC16091b("RECETHANOL", 9, "REC-Ethanol free rec fuel", "REC");

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC16091b f153854m = new EnumC16091b("UNKNOWN", 10, null, "Unknown");

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC16091b[] f153855n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f153856o;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fullName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String fuelType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(name());
    }

    static {
        EnumC16091b[] enumC16091bArrA = a();
        f153855n = enumC16091bArrA;
        f153856o = EnumEntriesKt.a(enumC16091bArrA);
        CREATOR = new Parcelable.Creator<EnumC16091b>() { // from class: ok.b.a
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC16091b createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return EnumC16091b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EnumC16091b[] newArray(int i10) {
                return new EnumC16091b[i10];
            }
        };
    }

    private static final /* synthetic */ EnumC16091b[] a() {
        return new EnumC16091b[]{f153844c, f153845d, f153846e, f153847f, f153848g, f153849h, f153850i, f153851j, f153852k, f153853l, f153854m};
    }

    public static EnumC16091b valueOf(String str) {
        return (EnumC16091b) Enum.valueOf(EnumC16091b.class, str);
    }

    public static EnumC16091b[] values() {
        return (EnumC16091b[]) f153855n.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getFuelType() {
        return this.fuelType;
    }

    /* renamed from: e, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    private EnumC16091b(String str, int i10, String str2, String str3) {
        this.fullName = str2;
        this.fuelType = str3;
    }
}
