package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class NullabilityQualifier {

    /* renamed from: a, reason: collision with root package name */
    public static final NullabilityQualifier f145558a = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final NullabilityQualifier f145559b = new NullabilityQualifier("NULLABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final NullabilityQualifier f145560c = new NullabilityQualifier("NOT_NULL", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ NullabilityQualifier[] f145561d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145562e;

    private static final /* synthetic */ NullabilityQualifier[] a() {
        return new NullabilityQualifier[]{f145558a, f145559b, f145560c};
    }

    static {
        NullabilityQualifier[] nullabilityQualifierArrA = a();
        f145561d = nullabilityQualifierArrA;
        f145562e = EnumEntriesKt.a(nullabilityQualifierArrA);
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f145561d.clone();
    }

    private NullabilityQualifier(String str, int i10) {
    }
}
