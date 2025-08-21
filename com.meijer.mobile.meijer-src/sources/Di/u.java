package Di;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LDi/u;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6281a = new u("Left", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f6282b = new u("Initial", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final u f6283c = new u("Right", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ u[] f6284d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6285e;

    static {
        u[] uVarArrA = a();
        f6284d = uVarArrA;
        f6285e = EnumEntriesKt.a(uVarArrA);
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f6281a, f6282b, f6283c};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6284d.clone();
    }

    private u(String str, int i10) {
    }
}
