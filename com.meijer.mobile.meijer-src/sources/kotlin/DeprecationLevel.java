package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeprecationLevel {

    /* renamed from: a, reason: collision with root package name */
    public static final DeprecationLevel f143274a = new DeprecationLevel("WARNING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final DeprecationLevel f143275b = new DeprecationLevel("ERROR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final DeprecationLevel f143276c = new DeprecationLevel("HIDDEN", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ DeprecationLevel[] f143277d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143278e;

    private static final /* synthetic */ DeprecationLevel[] a() {
        return new DeprecationLevel[]{f143274a, f143275b, f143276c};
    }

    static {
        DeprecationLevel[] deprecationLevelArrA = a();
        f143277d = deprecationLevelArrA;
        f143278e = EnumEntriesKt.a(deprecationLevelArrA);
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f143277d.clone();
    }

    private DeprecationLevel(String str, int i10) {
    }
}
