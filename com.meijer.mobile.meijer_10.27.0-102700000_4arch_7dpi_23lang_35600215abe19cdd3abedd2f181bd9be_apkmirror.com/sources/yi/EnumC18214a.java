package yi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lyi/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yi.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC18214a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18214a f170497a = new EnumC18214a("LOADING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18214a f170498b = new EnumC18214a("INCENTIVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC18214a f170499c = new EnumC18214a("CLIPPED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC18214a f170500d = new EnumC18214a("UNCLIPPED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC18214a f170501e = new EnumC18214a("SUCCESS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC18214a f170502f = new EnumC18214a("ERROR", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC18214a[] f170503g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f170504h;

    static {
        EnumC18214a[] enumC18214aArrA = a();
        f170503g = enumC18214aArrA;
        f170504h = EnumEntriesKt.a(enumC18214aArrA);
    }

    private static final /* synthetic */ EnumC18214a[] a() {
        return new EnumC18214a[]{f170497a, f170498b, f170499c, f170500d, f170501e, f170502f};
    }

    public static EnumC18214a valueOf(String str) {
        return (EnumC18214a) Enum.valueOf(EnumC18214a.class, str);
    }

    public static EnumC18214a[] values() {
        return (EnumC18214a[]) f170503g.clone();
    }

    private EnumC18214a(String str, int i10) {
    }
}
