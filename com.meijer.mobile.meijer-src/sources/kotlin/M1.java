package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/M1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M1 f168308a = new M1("Filled", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final M1 f168309b = new M1("Outlined", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ M1[] f168310c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168311d;

    static {
        M1[] m1ArrA = a();
        f168310c = m1ArrA;
        f168311d = EnumEntriesKt.a(m1ArrA);
    }

    private static final /* synthetic */ M1[] a() {
        return new M1[]{f168308a, f168309b};
    }

    public static M1 valueOf(String str) {
        return (M1) Enum.valueOf(M1.class, str);
    }

    public static M1[] values() {
        return (M1[]) f168310c.clone();
    }

    private M1(String str, int i10) {
    }
}
