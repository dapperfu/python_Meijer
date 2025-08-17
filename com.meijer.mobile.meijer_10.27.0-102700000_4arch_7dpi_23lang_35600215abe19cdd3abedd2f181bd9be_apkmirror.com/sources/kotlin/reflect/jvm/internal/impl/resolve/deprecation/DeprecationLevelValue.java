package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class DeprecationLevelValue {

    /* renamed from: a, reason: collision with root package name */
    public static final DeprecationLevelValue f146204a = new DeprecationLevelValue("WARNING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final DeprecationLevelValue f146205b = new DeprecationLevelValue("ERROR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final DeprecationLevelValue f146206c = new DeprecationLevelValue("HIDDEN", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ DeprecationLevelValue[] f146207d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146208e;

    private static final /* synthetic */ DeprecationLevelValue[] a() {
        return new DeprecationLevelValue[]{f146204a, f146205b, f146206c};
    }

    static {
        DeprecationLevelValue[] deprecationLevelValueArrA = a();
        f146207d = deprecationLevelValueArrA;
        f146208e = EnumEntriesKt.a(deprecationLevelValueArrA);
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f146207d.clone();
    }

    private DeprecationLevelValue(String str, int i10) {
    }
}
