package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class JavaTypeFlexibility {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaTypeFlexibility f144586a = new JavaTypeFlexibility("INFLEXIBLE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final JavaTypeFlexibility f144587b = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final JavaTypeFlexibility f144588c = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ JavaTypeFlexibility[] f144589d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144590e;

    private static final /* synthetic */ JavaTypeFlexibility[] a() {
        return new JavaTypeFlexibility[]{f144586a, f144587b, f144588c};
    }

    static {
        JavaTypeFlexibility[] javaTypeFlexibilityArrA = a();
        f144589d = javaTypeFlexibilityArrA;
        f144590e = EnumEntriesKt.a(javaTypeFlexibilityArrA);
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f144589d.clone();
    }

    private JavaTypeFlexibility(String str, int i10) {
    }
}
