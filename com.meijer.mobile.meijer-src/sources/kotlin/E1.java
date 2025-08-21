package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/E1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static final E1 f167969a = new E1("Tabs", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final E1 f167970b = new E1("Divider", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final E1 f167971c = new E1("Indicator", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ E1[] f167972d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f167973e;

    static {
        E1[] e1ArrA = a();
        f167972d = e1ArrA;
        f167973e = EnumEntriesKt.a(e1ArrA);
    }

    private static final /* synthetic */ E1[] a() {
        return new E1[]{f167969a, f167970b, f167971c};
    }

    public static E1 valueOf(String str) {
        return (E1) Enum.valueOf(E1.class, str);
    }

    public static E1[] values() {
        return (E1[]) f167972d.clone();
    }

    private E1(String str, int i10) {
    }
}
