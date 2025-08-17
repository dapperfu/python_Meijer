package fi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010j\u0002\b\u0012j\u0002\b\u000bj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lfi/f;", "", "LEc/e;", "adSize", "", "placementPosition", "adDisplaySize", "<init>", "(Ljava/lang/String;ILEc/e;Ljava/lang/String;Ljava/lang/String;)V", "a", "LEc/e;", "e", "()LEc/e;", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "d", "f", "g", "h", "i", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fi.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC13905f {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13905f f131156d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC13905f f131157e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC13905f f131158f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC13905f f131159g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC13905f f131160h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC13905f f131161i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC13905f[] f131162j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f131163k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ec.e adSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String placementPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String adDisplaySize;

    static {
        Ec.e MEDIUM_RECTANGLE = Ec.e.f7770m;
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f131156d = new EnumC13905f("AD_300_250", 0, MEDIUM_RECTANGLE, "btf", "300 x 250");
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f131157e = new EnumC13905f("AD_300_250_BTF", 1, MEDIUM_RECTANGLE, "btf", "300 x 250");
        Intrinsics.i(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        f131158f = new EnumC13905f("AD_300_250_ATF", 2, MEDIUM_RECTANGLE, "atf", "300 x 250");
        Ec.e BANNER = Ec.e.f7766i;
        Intrinsics.i(BANNER, "BANNER");
        f131159g = new EnumC13905f("AD_320_50_ATF", 3, BANNER, "atf", "320 x 50");
        Ec.e INVALID = Ec.e.f7774q;
        Intrinsics.i(INVALID, "INVALID");
        f131160h = new EnumC13905f("AD_INVALID", 4, INVALID, "atf", "320 x 50");
        Ec.e FLUID = Ec.e.f7773p;
        Intrinsics.i(FLUID, "FLUID");
        f131161i = new EnumC13905f("AD_FLUID", 5, FLUID, "atf", "fluid");
        EnumC13905f[] enumC13905fArrA = a();
        f131162j = enumC13905fArrA;
        f131163k = EnumEntriesKt.a(enumC13905fArrA);
    }

    private static final /* synthetic */ EnumC13905f[] a() {
        return new EnumC13905f[]{f131156d, f131157e, f131158f, f131159g, f131160h, f131161i};
    }

    public static EnumC13905f valueOf(String str) {
        return (EnumC13905f) Enum.valueOf(EnumC13905f.class, str);
    }

    public static EnumC13905f[] values() {
        return (EnumC13905f[]) f131162j.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAdDisplaySize() {
        return this.adDisplaySize;
    }

    /* renamed from: e, reason: from getter */
    public final Ec.e getAdSize() {
        return this.adSize;
    }

    /* renamed from: l, reason: from getter */
    public final String getPlacementPosition() {
        return this.placementPosition;
    }

    private EnumC13905f(String str, int i10, Ec.e eVar, String str2, String str3) {
        this.adSize = eVar;
        this.placementPosition = str2;
        this.adDisplaySize = str3;
    }
}
