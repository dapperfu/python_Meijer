package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class Modality {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f143618a;

    /* renamed from: b, reason: collision with root package name */
    public static final Modality f143619b = new Modality("FINAL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Modality f143620c = new Modality("SEALED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Modality f143621d = new Modality("OPEN", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Modality f143622e = new Modality("ABSTRACT", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ Modality[] f143623f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143624g;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Modality a(boolean z10, boolean z11, boolean z12) {
            return z10 ? Modality.f143620c : z11 ? Modality.f143622e : z12 ? Modality.f143621d : Modality.f143619b;
        }
    }

    private static final /* synthetic */ Modality[] a() {
        return new Modality[]{f143619b, f143620c, f143621d, f143622e};
    }

    static {
        Modality[] modalityArrA = a();
        f143623f = modalityArrA;
        f143624g = EnumEntriesKt.a(modalityArrA);
        f143618a = new Companion(null);
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f143623f.clone();
    }

    private Modality(String str, int i10) {
    }
}
