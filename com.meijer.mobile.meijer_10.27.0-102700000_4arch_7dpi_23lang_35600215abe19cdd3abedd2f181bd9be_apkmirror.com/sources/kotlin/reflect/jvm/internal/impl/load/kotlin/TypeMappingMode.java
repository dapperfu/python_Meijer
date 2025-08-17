package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public final class TypeMappingMode {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f144831k = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144832l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144833m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144834n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144835o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144836p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144837q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144838r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144839s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final TypeMappingMode f144840t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f144841a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144842b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144843c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f144844d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f144845e;

    /* renamed from: f, reason: collision with root package name */
    private final TypeMappingMode f144846f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f144847g;

    /* renamed from: h, reason: collision with root package name */
    private final TypeMappingMode f144848h;

    /* renamed from: i, reason: collision with root package name */
    private final TypeMappingMode f144849i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f144850j;

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
                iArr[Variance.f146797f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f146796e.ordinal()] = 2;
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
        f144832l = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f144833m = typeMappingMode2;
        f144834n = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f144835o = new TypeMappingMode(z10, z11, z12, z13, z14, typeMappingMode, false, null, null, z15, 988, null);
        f144836p = new TypeMappingMode(false, false, z15, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z16 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        f144837q = new TypeMappingMode(z10, true, z12, z13, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 988, defaultConstructorMarker);
        boolean z17 = false;
        boolean z18 = true;
        f144838r = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 983, defaultConstructorMarker);
        f144839s = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 919, defaultConstructorMarker);
        f144840t = new TypeMappingMode(z10, z17, true, false, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 984, defaultConstructorMarker);
    }

    public TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TypeMappingMode typeMappingMode, boolean z15, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z16) {
        this.f144841a = z10;
        this.f144842b = z11;
        this.f144843c = z12;
        this.f144844d = z13;
        this.f144845e = z14;
        this.f144846f = typeMappingMode;
        this.f144847g = z15;
        this.f144848h = typeMappingMode2;
        this.f144849i = typeMappingMode3;
        this.f144850j = z16;
    }

    public final boolean a() {
        return this.f144847g;
    }

    public final boolean b() {
        return this.f144850j;
    }

    public final boolean c() {
        return this.f144842b;
    }

    public final boolean d() {
        return this.f144841a;
    }

    public final boolean e() {
        return this.f144843c;
    }

    public final TypeMappingMode f(Variance effectiveVariance, boolean z10) {
        Intrinsics.j(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f144843c) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i10 == 1) {
                TypeMappingMode typeMappingMode = this.f144848h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i10 != 2) {
                TypeMappingMode typeMappingMode2 = this.f144846f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f144849i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode g() {
        return new TypeMappingMode(this.f144841a, true, this.f144843c, this.f144844d, this.f144845e, this.f144846f, this.f144847g, this.f144848h, this.f144849i, false, 512, null);
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
