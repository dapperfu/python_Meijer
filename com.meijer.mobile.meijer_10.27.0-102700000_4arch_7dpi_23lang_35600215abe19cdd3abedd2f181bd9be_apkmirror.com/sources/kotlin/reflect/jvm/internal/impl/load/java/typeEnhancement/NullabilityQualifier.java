package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class NullabilityQualifier {

    /* renamed from: a, reason: collision with root package name */
    public static final NullabilityQualifier f144651a = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final NullabilityQualifier f144652b = new NullabilityQualifier("NULLABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final NullabilityQualifier f144653c = new NullabilityQualifier("NOT_NULL", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ NullabilityQualifier[] f144654d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144655e;

    private static final /* synthetic */ NullabilityQualifier[] a() {
        return new NullabilityQualifier[]{f144651a, f144652b, f144653c};
    }

    static {
        NullabilityQualifier[] nullabilityQualifierArrA = a();
        f144654d = nullabilityQualifierArrA;
        f144655e = EnumEntriesKt.a(nullabilityQualifierArrA);
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f144654d.clone();
    }

    private NullabilityQualifier(String str, int i10) {
    }
}
