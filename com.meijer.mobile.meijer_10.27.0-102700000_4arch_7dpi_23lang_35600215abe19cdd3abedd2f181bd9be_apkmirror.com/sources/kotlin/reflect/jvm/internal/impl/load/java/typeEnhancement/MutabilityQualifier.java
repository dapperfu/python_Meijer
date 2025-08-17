package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class MutabilityQualifier {

    /* renamed from: a, reason: collision with root package name */
    public static final MutabilityQualifier f144645a = new MutabilityQualifier("READ_ONLY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final MutabilityQualifier f144646b = new MutabilityQualifier("MUTABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ MutabilityQualifier[] f144647c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144648d;

    private static final /* synthetic */ MutabilityQualifier[] a() {
        return new MutabilityQualifier[]{f144645a, f144646b};
    }

    static {
        MutabilityQualifier[] mutabilityQualifierArrA = a();
        f144647c = mutabilityQualifierArrA;
        f144648d = EnumEntriesKt.a(mutabilityQualifierArrA);
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f144647c.clone();
    }

    private MutabilityQualifier(String str, int i10) {
    }
}
