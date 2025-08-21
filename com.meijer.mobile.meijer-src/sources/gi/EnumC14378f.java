package gi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010j\u0002\b\u0012j\u0002\b\u000bj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lgi/f;", "", "LGc/e;", "adSize", "", "placementPosition", "adDisplaySize", "<init>", "(Ljava/lang/String;ILGc/e;Ljava/lang/String;Ljava/lang/String;)V", "a", "LGc/e;", "e", "()LGc/e;", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "d", "f", "g", "h", "i", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC14378f {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC14378f f134255d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC14378f f134256e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC14378f f134257f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC14378f f134258g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC14378f f134259h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC14378f f134260i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC14378f[] f134261j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f134262k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Gc.e adSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String placementPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String adDisplaySize;

    static {
        Gc.e MEDIUM_RECTANGLE = Gc.e.f11322m;
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f134255d = new EnumC14378f("AD_300_250", 0, MEDIUM_RECTANGLE, "btf", "300 x 250");
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f134256e = new EnumC14378f("AD_300_250_BTF", 1, MEDIUM_RECTANGLE, "btf", "300 x 250");
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f134257f = new EnumC14378f("AD_300_250_ATF", 2, MEDIUM_RECTANGLE, "atf", "300 x 250");
        Gc.e BANNER = Gc.e.f11318i;
        Intrinsics.i(BANNER, "BANNER");
        f134258g = new EnumC14378f("AD_320_50_ATF", 3, BANNER, "atf", "320 x 50");
        Gc.e INVALID = Gc.e.f11326q;
        Intrinsics.i(INVALID, "INVALID");
        f134259h = new EnumC14378f("AD_INVALID", 4, INVALID, "atf", "320 x 50");
        Gc.e FLUID = Gc.e.f11325p;
        Intrinsics.i(FLUID, "FLUID");
        f134260i = new EnumC14378f("AD_FLUID", 5, FLUID, "atf", "fluid");
        EnumC14378f[] enumC14378fArrA = a();
        f134261j = enumC14378fArrA;
        f134262k = EnumEntriesKt.a(enumC14378fArrA);
    }

    private static final /* synthetic */ EnumC14378f[] a() {
        return new EnumC14378f[]{f134255d, f134256e, f134257f, f134258g, f134259h, f134260i};
    }

    public static EnumC14378f valueOf(String str) {
        return (EnumC14378f) Enum.valueOf(EnumC14378f.class, str);
    }

    public static EnumC14378f[] values() {
        return (EnumC14378f[]) f134261j.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAdDisplaySize() {
        return this.adDisplaySize;
    }

    /* renamed from: e, reason: from getter */
    public final Gc.e getAdSize() {
        return this.adSize;
    }

    /* renamed from: l, reason: from getter */
    public final String getPlacementPosition() {
        return this.placementPosition;
    }

    private EnumC14378f(String str, int i10, Gc.e eVar, String str2, String str3) {
        this.adSize = eVar;
        this.placementPosition = str2;
        this.adDisplaySize = str3;
    }
}
