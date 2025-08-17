package vk;

import j$.time.ZoneId;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lvk/e;", "", "<init>", "()V", "", "j$/time/ZoneId", "b", "(Ljava/lang/String;)Lj$/time/ZoneId;", "a", "(Lj$/time/ZoneId;)Ljava/lang/String;", "Lj$/time/ZoneId;", "EASTERN", "c", "CENTRAL", "d", "UTC", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f164830a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final ZoneId EASTERN;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final ZoneId CENTRAL;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final ZoneId UTC;

    static {
        ZoneId zoneIdOf = ZoneId.of("US/Eastern");
        Intrinsics.i(zoneIdOf, "of(...)");
        EASTERN = zoneIdOf;
        ZoneId zoneIdOf2 = ZoneId.of("US/Central");
        Intrinsics.i(zoneIdOf2, "of(...)");
        CENTRAL = zoneIdOf2;
        ZoneId zoneIdOf3 = ZoneId.of("Z");
        Intrinsics.i(zoneIdOf3, "of(...)");
        UTC = zoneIdOf3;
    }

    public final String a(ZoneId zoneId) {
        String id2 = zoneId != null ? zoneId.getId() : null;
        return (!Intrinsics.e(id2, "US/Eastern") && Intrinsics.e(id2, "US/Central")) ? "CT" : "ET";
    }

    public final ZoneId b(String str) {
        Intrinsics.j(str, "<this>");
        ZoneId zoneIdOf = ZoneId.of(str, MapsKt.o(TuplesKt.a("ET", "US/Eastern"), TuplesKt.a("CT", "US/Central")));
        Intrinsics.i(zoneIdOf, "of(...)");
        return zoneIdOf;
    }

    private e() {
    }
}
