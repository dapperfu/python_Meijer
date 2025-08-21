package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class Modality {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144525a;

    /* renamed from: b, reason: collision with root package name */
    public static final Modality f144526b = new Modality("FINAL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Modality f144527c = new Modality("SEALED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Modality f144528d = new Modality("OPEN", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Modality f144529e = new Modality("ABSTRACT", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ Modality[] f144530f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144531g;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Modality a(boolean z10, boolean z11, boolean z12) {
            return z10 ? Modality.f144527c : z11 ? Modality.f144529e : z12 ? Modality.f144528d : Modality.f144526b;
        }
    }

    private static final /* synthetic */ Modality[] a() {
        return new Modality[]{f144526b, f144527c, f144528d, f144529e};
    }

    static {
        Modality[] modalityArrA = a();
        f144530f = modalityArrA;
        f144531g = EnumEntriesKt.a(modalityArrA);
        f144525a = new Companion(null);
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f144530f.clone();
    }

    private Modality(String str, int i10) {
    }
}
