package e8;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Le8/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC13779b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13779b f130023a = new EnumC13779b("DOWN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13779b f130024b = new EnumC13779b("UP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13779b f130025c = new EnumC13779b("MOVE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13779b f130026d = new EnumC13779b("POINTER_DOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC13779b f130027e = new EnumC13779b("POINTER_UP", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC13779b f130028f = new EnumC13779b("UNKNOWN", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC13779b[] f130029g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f130030h;

    static {
        EnumC13779b[] enumC13779bArrA = a();
        f130029g = enumC13779bArrA;
        f130030h = EnumEntriesKt.a(enumC13779bArrA);
    }

    private static final /* synthetic */ EnumC13779b[] a() {
        return new EnumC13779b[]{f130023a, f130024b, f130025c, f130026d, f130027e, f130028f};
    }

    public static EnumC13779b valueOf(String str) {
        return (EnumC13779b) Enum.valueOf(EnumC13779b.class, str);
    }

    public static EnumC13779b[] values() {
        return (EnumC13779b[]) f130029g.clone();
    }

    private EnumC13779b(String str, int i10) {
    }
}
