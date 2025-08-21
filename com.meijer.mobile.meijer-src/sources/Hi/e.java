package Hi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LHi/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13556a = new e("Short", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f13557b = new e("Long", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f13558c = new e("Indefinite", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f13559d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13560e;

    static {
        e[] eVarArrA = a();
        f13559d = eVarArrA;
        f13560e = EnumEntriesKt.a(eVarArrA);
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f13556a, f13557b, f13558c};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f13559d.clone();
    }

    private e(String str, int i10) {
    }
}
