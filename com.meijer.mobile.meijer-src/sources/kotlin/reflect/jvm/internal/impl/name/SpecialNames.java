package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SpecialNames {

    /* renamed from: a, reason: collision with root package name */
    public static final SpecialNames f146601a = new SpecialNames();

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final Name f146602b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Name f146603c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Name f146604d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final Name f146605e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Name f146606f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final FqName f146607g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final Name f146608h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final Name f146609i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final Name f146610j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final Name f146611k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final Name f146612l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final Name f146613m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final Name f146614n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final Name f146615o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final Name f146616p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final Name f146617q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final Name f146618r;

    static {
        Name nameU = Name.u("<no name provided>");
        Intrinsics.i(nameU, "special(...)");
        f146602b = nameU;
        Name nameU2 = Name.u("<root package>");
        Intrinsics.i(nameU2, "special(...)");
        f146603c = nameU2;
        Name nameO = Name.o("Companion");
        Intrinsics.i(nameO, "identifier(...)");
        f146604d = nameO;
        Name nameO2 = Name.o("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Intrinsics.i(nameO2, "identifier(...)");
        f146605e = nameO2;
        Name nameU3 = Name.u("<anonymous>");
        Intrinsics.i(nameU3, "special(...)");
        f146606f = nameU3;
        FqName.Companion companion = FqName.f146585c;
        Name nameU4 = Name.u("<anonymous>");
        Intrinsics.i(nameU4, "special(...)");
        f146607g = companion.a(nameU4);
        Name nameU5 = Name.u("<unary>");
        Intrinsics.i(nameU5, "special(...)");
        f146608h = nameU5;
        Name nameU6 = Name.u("<this>");
        Intrinsics.i(nameU6, "special(...)");
        f146609i = nameU6;
        Name nameU7 = Name.u("<init>");
        Intrinsics.i(nameU7, "special(...)");
        f146610j = nameU7;
        Name nameU8 = Name.u("<iterator>");
        Intrinsics.i(nameU8, "special(...)");
        f146611k = nameU8;
        Name nameU9 = Name.u("<destruct>");
        Intrinsics.i(nameU9, "special(...)");
        f146612l = nameU9;
        Name nameU10 = Name.u("<local>");
        Intrinsics.i(nameU10, "special(...)");
        f146613m = nameU10;
        Name nameU11 = Name.u("<unused var>");
        Intrinsics.i(nameU11, "special(...)");
        f146614n = nameU11;
        Name nameU12 = Name.u("<set-?>");
        Intrinsics.i(nameU12, "special(...)");
        f146615o = nameU12;
        Name nameU13 = Name.u("<array>");
        Intrinsics.i(nameU13, "special(...)");
        f146616p = nameU13;
        Name nameU14 = Name.u("<receiver>");
        Intrinsics.i(nameU14, "special(...)");
        f146617q = nameU14;
        Name nameU15 = Name.u("<get-entries>");
        Intrinsics.i(nameU15, "special(...)");
        f146618r = nameU15;
    }

    @JvmStatic
    public static final Name b(Name name) {
        return (name == null || name.p()) ? f146605e : name;
    }

    public final boolean a(Name name) {
        Intrinsics.j(name, "name");
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        return strB.length() > 0 && !name.p();
    }

    private SpecialNames() {
    }
}
