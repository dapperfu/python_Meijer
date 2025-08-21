package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KotlinTarget {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f144642c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, KotlinTarget> f144644d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<KotlinTarget> f144646e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<KotlinTarget> f144648f;

    /* renamed from: g, reason: collision with root package name */
    private static final List<KotlinTarget> f144650g;

    /* renamed from: h, reason: collision with root package name */
    private static final List<KotlinTarget> f144652h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<KotlinTarget> f144654i;

    /* renamed from: j, reason: collision with root package name */
    private static final List<KotlinTarget> f144656j;

    /* renamed from: k, reason: collision with root package name */
    private static final List<KotlinTarget> f144658k;

    /* renamed from: k0, reason: collision with root package name */
    private static final /* synthetic */ KotlinTarget[] f144659k0;

    /* renamed from: l, reason: collision with root package name */
    private static final List<KotlinTarget> f144660l;

    /* renamed from: l0, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144661l0;

    /* renamed from: m, reason: collision with root package name */
    private static final List<KotlinTarget> f144662m;

    /* renamed from: n, reason: collision with root package name */
    private static final List<KotlinTarget> f144663n;

    /* renamed from: o, reason: collision with root package name */
    private static final List<KotlinTarget> f144664o;

    /* renamed from: p, reason: collision with root package name */
    private static final List<KotlinTarget> f144665p;

    /* renamed from: q, reason: collision with root package name */
    private static final List<KotlinTarget> f144666q;

    /* renamed from: r, reason: collision with root package name */
    private static final List<KotlinTarget> f144667r;

    /* renamed from: s, reason: collision with root package name */
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> f144668s;

    /* renamed from: a, reason: collision with root package name */
    private final String f144676a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144677b;

    /* renamed from: t, reason: collision with root package name */
    public static final KotlinTarget f144669t = new KotlinTarget("CLASS", 0, "class", false, 2, null);

    /* renamed from: u, reason: collision with root package name */
    public static final KotlinTarget f144670u = new KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);

    /* renamed from: v, reason: collision with root package name */
    public static final KotlinTarget f144671v = new KotlinTarget("TYPE_PARAMETER", 2, "type parameter", false);

    /* renamed from: w, reason: collision with root package name */
    public static final KotlinTarget f144672w = new KotlinTarget("PROPERTY", 3, "property", false, 2, null);

    /* renamed from: x, reason: collision with root package name */
    public static final KotlinTarget f144673x = new KotlinTarget("FIELD", 4, "field", false, 2, null);

    /* renamed from: y, reason: collision with root package name */
    public static final KotlinTarget f144674y = new KotlinTarget("LOCAL_VARIABLE", 5, "local variable", false, 2, null);

    /* renamed from: z, reason: collision with root package name */
    public static final KotlinTarget f144675z = new KotlinTarget("VALUE_PARAMETER", 6, "value parameter", false, 2, null);

    /* renamed from: A, reason: collision with root package name */
    public static final KotlinTarget f144614A = new KotlinTarget("CONSTRUCTOR", 7, "constructor", false, 2, null);

    /* renamed from: B, reason: collision with root package name */
    public static final KotlinTarget f144615B = new KotlinTarget("FUNCTION", 8, "function", false, 2, null);

    /* renamed from: C, reason: collision with root package name */
    public static final KotlinTarget f144616C = new KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);

    /* renamed from: D, reason: collision with root package name */
    public static final KotlinTarget f144617D = new KotlinTarget("PROPERTY_SETTER", 10, "setter", false, 2, null);

    /* renamed from: E, reason: collision with root package name */
    public static final KotlinTarget f144618E = new KotlinTarget("TYPE", 11, "type usage", false);

    /* renamed from: F, reason: collision with root package name */
    public static final KotlinTarget f144619F = new KotlinTarget("EXPRESSION", 12, "expression", false);

    /* renamed from: G, reason: collision with root package name */
    public static final KotlinTarget f144620G = new KotlinTarget("FILE", 13, "file", false);

    /* renamed from: H, reason: collision with root package name */
    public static final KotlinTarget f144621H = new KotlinTarget("TYPEALIAS", 14, "typealias", false);

    /* renamed from: I, reason: collision with root package name */
    public static final KotlinTarget f144622I = new KotlinTarget("TYPE_PROJECTION", 15, "type projection", false);

    /* renamed from: J, reason: collision with root package name */
    public static final KotlinTarget f144623J = new KotlinTarget("STAR_PROJECTION", 16, "star projection", false);

    /* renamed from: K, reason: collision with root package name */
    public static final KotlinTarget f144624K = new KotlinTarget("PROPERTY_PARAMETER", 17, "property constructor parameter", false);

    /* renamed from: L, reason: collision with root package name */
    public static final KotlinTarget f144625L = new KotlinTarget("CLASS_ONLY", 18, "class", false);

    /* renamed from: M, reason: collision with root package name */
    public static final KotlinTarget f144626M = new KotlinTarget("OBJECT", 19, "object", false);

    /* renamed from: N, reason: collision with root package name */
    public static final KotlinTarget f144627N = new KotlinTarget("STANDALONE_OBJECT", 20, "standalone object", false);

    /* renamed from: O, reason: collision with root package name */
    public static final KotlinTarget f144628O = new KotlinTarget("COMPANION_OBJECT", 21, "companion object", false);

    /* renamed from: P, reason: collision with root package name */
    public static final KotlinTarget f144629P = new KotlinTarget("INTERFACE", 22, "interface", false);

    /* renamed from: Q, reason: collision with root package name */
    public static final KotlinTarget f144630Q = new KotlinTarget("ENUM_CLASS", 23, "enum class", false);

    /* renamed from: R, reason: collision with root package name */
    public static final KotlinTarget f144631R = new KotlinTarget("ENUM_ENTRY", 24, "enum entry", false);

    /* renamed from: S, reason: collision with root package name */
    public static final KotlinTarget f144632S = new KotlinTarget("LOCAL_CLASS", 25, "local class", false);

    /* renamed from: T, reason: collision with root package name */
    public static final KotlinTarget f144633T = new KotlinTarget("LOCAL_FUNCTION", 26, "local function", false);

    /* renamed from: U, reason: collision with root package name */
    public static final KotlinTarget f144634U = new KotlinTarget("MEMBER_FUNCTION", 27, "member function", false);

    /* renamed from: V, reason: collision with root package name */
    public static final KotlinTarget f144635V = new KotlinTarget("TOP_LEVEL_FUNCTION", 28, "top level function", false);

    /* renamed from: W, reason: collision with root package name */
    public static final KotlinTarget f144636W = new KotlinTarget("MEMBER_PROPERTY", 29, "member property", false);

    /* renamed from: X, reason: collision with root package name */
    public static final KotlinTarget f144637X = new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);

    /* renamed from: Y, reason: collision with root package name */
    public static final KotlinTarget f144638Y = new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);

    /* renamed from: Z, reason: collision with root package name */
    public static final KotlinTarget f144639Z = new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);

    /* renamed from: a0, reason: collision with root package name */
    public static final KotlinTarget f144640a0 = new KotlinTarget("TOP_LEVEL_PROPERTY", 33, "top level property", false);

    /* renamed from: b0, reason: collision with root package name */
    public static final KotlinTarget f144641b0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);

    /* renamed from: c0, reason: collision with root package name */
    public static final KotlinTarget f144643c0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);

    /* renamed from: d0, reason: collision with root package name */
    public static final KotlinTarget f144645d0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);

    /* renamed from: e0, reason: collision with root package name */
    public static final KotlinTarget f144647e0 = new KotlinTarget("BACKING_FIELD", 37, "backing field", false, 2, null);

    /* renamed from: f0, reason: collision with root package name */
    public static final KotlinTarget f144649f0 = new KotlinTarget("INITIALIZER", 38, "initializer", false);

    /* renamed from: g0, reason: collision with root package name */
    public static final KotlinTarget f144651g0 = new KotlinTarget("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);

    /* renamed from: h0, reason: collision with root package name */
    public static final KotlinTarget f144653h0 = new KotlinTarget("LAMBDA_EXPRESSION", 40, "lambda expression", false);

    /* renamed from: i0, reason: collision with root package name */
    public static final KotlinTarget f144655i0 = new KotlinTarget("ANONYMOUS_FUNCTION", 41, "anonymous function", false);

    /* renamed from: j0, reason: collision with root package name */
    public static final KotlinTarget f144657j0 = new KotlinTarget("OBJECT_LITERAL", 42, "object literal", false);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private KotlinTarget(String str, int i10, String str2, boolean z10) {
        this.f144676a = str2;
        this.f144677b = z10;
    }

    private static final /* synthetic */ KotlinTarget[] a() {
        return new KotlinTarget[]{f144669t, f144670u, f144671v, f144672w, f144673x, f144674y, f144675z, f144614A, f144615B, f144616C, f144617D, f144618E, f144619F, f144620G, f144621H, f144622I, f144623J, f144624K, f144625L, f144626M, f144627N, f144628O, f144629P, f144630Q, f144631R, f144632S, f144633T, f144634U, f144635V, f144636W, f144637X, f144638Y, f144639Z, f144640a0, f144641b0, f144643c0, f144645d0, f144647e0, f144649f0, f144651g0, f144653h0, f144655i0, f144657j0};
    }

    public static EnumEntries<KotlinTarget> b() {
        return f144661l0;
    }

    static {
        KotlinTarget[] kotlinTargetArrA = a();
        f144659k0 = kotlinTargetArrA;
        f144661l0 = EnumEntriesKt.a(kotlinTargetArrA);
        f144642c = new Companion(null);
        f144644d = new HashMap<>();
        for (KotlinTarget kotlinTarget : b()) {
            f144644d.put(kotlinTarget.name(), kotlinTarget);
        }
        EnumEntries<KotlinTarget> enumEntriesB = b();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : enumEntriesB) {
            if (kotlinTarget2.f144677b) {
                arrayList.add(kotlinTarget2);
            }
        }
        f144646e = CollectionsKt.o1(arrayList);
        f144648f = CollectionsKt.o1(b());
        KotlinTarget kotlinTarget3 = f144670u;
        KotlinTarget kotlinTarget4 = f144669t;
        f144650g = CollectionsKt.p(kotlinTarget3, kotlinTarget4);
        f144652h = CollectionsKt.p(f144632S, kotlinTarget4);
        f144654i = CollectionsKt.p(f144625L, kotlinTarget4);
        KotlinTarget kotlinTarget5 = f144628O;
        KotlinTarget kotlinTarget6 = f144626M;
        f144656j = CollectionsKt.p(kotlinTarget5, kotlinTarget6, kotlinTarget4);
        f144658k = CollectionsKt.p(f144627N, kotlinTarget6, kotlinTarget4);
        f144660l = CollectionsKt.p(f144629P, kotlinTarget4);
        f144662m = CollectionsKt.p(f144630Q, kotlinTarget4);
        KotlinTarget kotlinTarget7 = f144631R;
        KotlinTarget kotlinTarget8 = f144672w;
        KotlinTarget kotlinTarget9 = f144673x;
        f144663n = CollectionsKt.p(kotlinTarget7, kotlinTarget8, kotlinTarget9);
        KotlinTarget kotlinTarget10 = f144617D;
        f144664o = CollectionsKt.e(kotlinTarget10);
        KotlinTarget kotlinTarget11 = f144616C;
        f144665p = CollectionsKt.e(kotlinTarget11);
        f144666q = CollectionsKt.e(f144615B);
        KotlinTarget kotlinTarget12 = f144620G;
        f144667r = CollectionsKt.e(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.f144585i;
        KotlinTarget kotlinTarget13 = f144675z;
        f144668s = MapsKt.o(TuplesKt.a(annotationUseSiteTarget, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f144579c, kotlinTarget9), TuplesKt.a(AnnotationUseSiteTarget.f144581e, kotlinTarget8), TuplesKt.a(AnnotationUseSiteTarget.f144580d, kotlinTarget12), TuplesKt.a(AnnotationUseSiteTarget.f144582f, kotlinTarget11), TuplesKt.a(AnnotationUseSiteTarget.f144583g, kotlinTarget10), TuplesKt.a(AnnotationUseSiteTarget.f144584h, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f144586j, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f144587k, kotlinTarget9));
    }

    /* synthetic */ KotlinTarget(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) f144659k0.clone();
    }
}
