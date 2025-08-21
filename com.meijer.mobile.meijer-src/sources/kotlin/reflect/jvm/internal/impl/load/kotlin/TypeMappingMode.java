package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes14.dex */
public final class TypeMappingMode {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f145738k = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145739l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145740m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145741n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145742o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145743p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145744q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145745r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145746s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f145747t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f145748a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f145749b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145750c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f145751d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f145752e;

    /* renamed from: f, reason: collision with root package name */
    private final TypeMappingMode f145753f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f145754g;

    /* renamed from: h, reason: collision with root package name */
    private final TypeMappingMode f145755h;

    /* renamed from: i, reason: collision with root package name */
    private final TypeMappingMode f145756i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f145757j;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.f147704f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f147703e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f145739l = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f145740m = typeMappingMode2;
        f145741n = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f145742o = new TypeMappingMode(z10, z11, z12, z13, z14, typeMappingMode, false, null, null, z15, 988, null);
        f145743p = new TypeMappingMode(false, false, z15, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z16 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        f145744q = new TypeMappingMode(z10, true, z12, z13, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 988, defaultConstructorMarker);
        boolean z17 = false;
        boolean z18 = true;
        f145745r = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 983, defaultConstructorMarker);
        f145746s = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 919, defaultConstructorMarker);
        f145747t = new TypeMappingMode(z10, z17, true, false, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 984, defaultConstructorMarker);
    }

    public TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TypeMappingMode typeMappingMode, boolean z15, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z16) {
        this.f145748a = z10;
        this.f145749b = z11;
        this.f145750c = z12;
        this.f145751d = z13;
        this.f145752e = z14;
        this.f145753f = typeMappingMode;
        this.f145754g = z15;
        this.f145755h = typeMappingMode2;
        this.f145756i = typeMappingMode3;
        this.f145757j = z16;
    }

    public final boolean a() {
        return this.f145754g;
    }

    public final boolean b() {
        return this.f145757j;
    }

    public final boolean c() {
        return this.f145749b;
    }

    public final boolean d() {
        return this.f145748a;
    }

    public final boolean e() {
        return this.f145750c;
    }

    public final TypeMappingMode f(Variance effectiveVariance, boolean z10) {
        Intrinsics.j(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f145750c) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i10 == 1) {
                TypeMappingMode typeMappingMode = this.f145755h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i10 != 2) {
                TypeMappingMode typeMappingMode2 = this.f145753f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f145756i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode g() {
        return new TypeMappingMode(this.f145748a, true, this.f145750c, this.f145751d, this.f145752e, this.f145753f, this.f145754g, this.f145755h, this.f145756i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TypeMappingMode typeMappingMode, boolean z15, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        typeMappingMode = (i10 & 32) != 0 ? null : typeMappingMode;
        this(z10, z11, z12, z13, z14, typeMappingMode, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? typeMappingMode : typeMappingMode2, (i10 & 256) != 0 ? typeMappingMode : typeMappingMode3, (i10 & 512) != 0 ? false : z16);
    }
}
