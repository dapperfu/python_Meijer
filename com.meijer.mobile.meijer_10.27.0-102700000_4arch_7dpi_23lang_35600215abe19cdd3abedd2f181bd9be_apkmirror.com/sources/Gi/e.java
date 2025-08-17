package Gi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LGi/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11481a = new e("Short", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f11482b = new e("Long", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f11483c = new e("Indefinite", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f11484d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11485e;

    static {
        e[] eVarArrA = a();
        f11484d = eVarArrA;
        f11485e = EnumEntriesKt.a(eVarArrA);
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f11481a, f11482b, f11483c};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11484d.clone();
    }

    private e(String str, int i10) {
    }
}
