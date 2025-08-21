package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class JavaTypeFlexibility {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaTypeFlexibility f145493a = new JavaTypeFlexibility("INFLEXIBLE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final JavaTypeFlexibility f145494b = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final JavaTypeFlexibility f145495c = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ JavaTypeFlexibility[] f145496d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145497e;

    private static final /* synthetic */ JavaTypeFlexibility[] a() {
        return new JavaTypeFlexibility[]{f145493a, f145494b, f145495c};
    }

    static {
        JavaTypeFlexibility[] javaTypeFlexibilityArrA = a();
        f145496d = javaTypeFlexibilityArrA;
        f145497e = EnumEntriesKt.a(javaTypeFlexibilityArrA);
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f145496d.clone();
    }

    private JavaTypeFlexibility(String str, int i10) {
    }
}
