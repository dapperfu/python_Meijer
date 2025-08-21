package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class Variance {

    /* renamed from: e, reason: collision with root package name */
    public static final Variance f147703e = new Variance("INVARIANT", 0, "", true, true, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Variance f147704f = new Variance("IN_VARIANCE", 1, "in", true, false, -1);

    /* renamed from: g, reason: collision with root package name */
    public static final Variance f147705g = new Variance("OUT_VARIANCE", 2, "out", false, true, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ Variance[] f147706h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147707i;

    /* renamed from: a, reason: collision with root package name */
    private final String f147708a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f147709b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f147710c;

    /* renamed from: d, reason: collision with root package name */
    private final int f147711d;

    private static final /* synthetic */ Variance[] a() {
        return new Variance[]{f147703e, f147704f, f147705g};
    }

    static {
        Variance[] varianceArrA = a();
        f147706h = varianceArrA;
        f147707i = EnumEntriesKt.a(varianceArrA);
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) f147706h.clone();
    }

    public final boolean b() {
        return this.f147710c;
    }

    public final String e() {
        return this.f147708a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f147708a;
    }

    private Variance(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f147708a = str2;
        this.f147709b = z10;
        this.f147710c = z11;
        this.f147711d = i11;
    }
}
