package c8;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lc8/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6375b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6375b f61641a = new EnumC6375b("DOWN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6375b f61642b = new EnumC6375b("UP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6375b f61643c = new EnumC6375b("MOVE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6375b f61644d = new EnumC6375b("POINTER_DOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6375b f61645e = new EnumC6375b("POINTER_UP", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6375b f61646f = new EnumC6375b("UNKNOWN", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC6375b[] f61647g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61648h;

    static {
        EnumC6375b[] enumC6375bArrA = a();
        f61647g = enumC6375bArrA;
        f61648h = EnumEntriesKt.a(enumC6375bArrA);
    }

    private static final /* synthetic */ EnumC6375b[] a() {
        return new EnumC6375b[]{f61641a, f61642b, f61643c, f61644d, f61645e, f61646f};
    }

    public static EnumC6375b valueOf(String str) {
        return (EnumC6375b) Enum.valueOf(EnumC6375b.class, str);
    }

    public static EnumC6375b[] values() {
        return (EnumC6375b[]) f61647g.clone();
    }

    private EnumC6375b(String str, int i10) {
    }
}
