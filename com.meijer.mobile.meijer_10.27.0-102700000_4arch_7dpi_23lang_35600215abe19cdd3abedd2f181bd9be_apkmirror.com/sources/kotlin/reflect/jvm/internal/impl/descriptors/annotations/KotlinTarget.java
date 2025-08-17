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
/* loaded from: classes13.dex */
public final class KotlinTarget {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f143735c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, KotlinTarget> f143737d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<KotlinTarget> f143739e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<KotlinTarget> f143741f;

    /* renamed from: g, reason: collision with root package name */
    private static final List<KotlinTarget> f143743g;

    /* renamed from: h, reason: collision with root package name */
    private static final List<KotlinTarget> f143745h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<KotlinTarget> f143747i;

    /* renamed from: j, reason: collision with root package name */
    private static final List<KotlinTarget> f143749j;

    /* renamed from: k, reason: collision with root package name */
    private static final List<KotlinTarget> f143751k;

    /* renamed from: k0, reason: collision with root package name */
    private static final /* synthetic */ KotlinTarget[] f143752k0;

    /* renamed from: l, reason: collision with root package name */
    private static final List<KotlinTarget> f143753l;

    /* renamed from: l0, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143754l0;

    /* renamed from: m, reason: collision with root package name */
    private static final List<KotlinTarget> f143755m;

    /* renamed from: n, reason: collision with root package name */
    private static final List<KotlinTarget> f143756n;

    /* renamed from: o, reason: collision with root package name */
    private static final List<KotlinTarget> f143757o;

    /* renamed from: p, reason: collision with root package name */
    private static final List<KotlinTarget> f143758p;

    /* renamed from: q, reason: collision with root package name */
    private static final List<KotlinTarget> f143759q;

    /* renamed from: r, reason: collision with root package name */
    private static final List<KotlinTarget> f143760r;

    /* renamed from: s, reason: collision with root package name */
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> f143761s;

    /* renamed from: a, reason: collision with root package name */
    private final String f143769a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f143770b;

    /* renamed from: t, reason: collision with root package name */
    public static final KotlinTarget f143762t = new KotlinTarget("CLASS", 0, "class", false, 2, null);

    /* renamed from: u, reason: collision with root package name */
    public static final KotlinTarget f143763u = new KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);

    /* renamed from: v, reason: collision with root package name */
    public static final KotlinTarget f143764v = new KotlinTarget("TYPE_PARAMETER", 2, "type parameter", false);

    /* renamed from: w, reason: collision with root package name */
    public static final KotlinTarget f143765w = new KotlinTarget("PROPERTY", 3, "property", false, 2, null);

    /* renamed from: x, reason: collision with root package name */
    public static final KotlinTarget f143766x = new KotlinTarget("FIELD", 4, "field", false, 2, null);

    /* renamed from: y, reason: collision with root package name */
    public static final KotlinTarget f143767y = new KotlinTarget("LOCAL_VARIABLE", 5, "local variable", false, 2, null);

    /* renamed from: z, reason: collision with root package name */
    public static final KotlinTarget f143768z = new KotlinTarget("VALUE_PARAMETER", 6, "value parameter", false, 2, null);

    /* renamed from: A, reason: collision with root package name */
    public static final KotlinTarget f143707A = new KotlinTarget("CONSTRUCTOR", 7, "constructor", false, 2, null);

    /* renamed from: B, reason: collision with root package name */
    public static final KotlinTarget f143708B = new KotlinTarget("FUNCTION", 8, "function", false, 2, null);

    /* renamed from: C, reason: collision with root package name */
    public static final KotlinTarget f143709C = new KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);

    /* renamed from: D, reason: collision with root package name */
    public static final KotlinTarget f143710D = new KotlinTarget("PROPERTY_SETTER", 10, "setter", false, 2, null);

    /* renamed from: E, reason: collision with root package name */
    public static final KotlinTarget f143711E = new KotlinTarget("TYPE", 11, "type usage", false);

    /* renamed from: F, reason: collision with root package name */
    public static final KotlinTarget f143712F = new KotlinTarget("EXPRESSION", 12, "expression", false);

    /* renamed from: G, reason: collision with root package name */
    public static final KotlinTarget f143713G = new KotlinTarget("FILE", 13, "file", false);

    /* renamed from: H, reason: collision with root package name */
    public static final KotlinTarget f143714H = new KotlinTarget("TYPEALIAS", 14, "typealias", false);

    /* renamed from: I, reason: collision with root package name */
    public static final KotlinTarget f143715I = new KotlinTarget("TYPE_PROJECTION", 15, "type projection", false);

    /* renamed from: J, reason: collision with root package name */
    public static final KotlinTarget f143716J = new KotlinTarget("STAR_PROJECTION", 16, "star projection", false);

    /* renamed from: K, reason: collision with root package name */
    public static final KotlinTarget f143717K = new KotlinTarget("PROPERTY_PARAMETER", 17, "property constructor parameter", false);

    /* renamed from: L, reason: collision with root package name */
    public static final KotlinTarget f143718L = new KotlinTarget("CLASS_ONLY", 18, "class", false);

    /* renamed from: M, reason: collision with root package name */
    public static final KotlinTarget f143719M = new KotlinTarget("OBJECT", 19, "object", false);

    /* renamed from: N, reason: collision with root package name */
    public static final KotlinTarget f143720N = new KotlinTarget("STANDALONE_OBJECT", 20, "standalone object", false);

    /* renamed from: O, reason: collision with root package name */
    public static final KotlinTarget f143721O = new KotlinTarget("COMPANION_OBJECT", 21, "companion object", false);

    /* renamed from: P, reason: collision with root package name */
    public static final KotlinTarget f143722P = new KotlinTarget("INTERFACE", 22, "interface", false);

    /* renamed from: Q, reason: collision with root package name */
    public static final KotlinTarget f143723Q = new KotlinTarget("ENUM_CLASS", 23, "enum class", false);

    /* renamed from: R, reason: collision with root package name */
    public static final KotlinTarget f143724R = new KotlinTarget("ENUM_ENTRY", 24, "enum entry", false);

    /* renamed from: S, reason: collision with root package name */
    public static final KotlinTarget f143725S = new KotlinTarget("LOCAL_CLASS", 25, "local class", false);

    /* renamed from: T, reason: collision with root package name */
    public static final KotlinTarget f143726T = new KotlinTarget("LOCAL_FUNCTION", 26, "local function", false);

    /* renamed from: U, reason: collision with root package name */
    public static final KotlinTarget f143727U = new KotlinTarget("MEMBER_FUNCTION", 27, "member function", false);

    /* renamed from: V, reason: collision with root package name */
    public static final KotlinTarget f143728V = new KotlinTarget("TOP_LEVEL_FUNCTION", 28, "top level function", false);

    /* renamed from: W, reason: collision with root package name */
    public static final KotlinTarget f143729W = new KotlinTarget("MEMBER_PROPERTY", 29, "member property", false);

    /* renamed from: X, reason: collision with root package name */
    public static final KotlinTarget f143730X = new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);

    /* renamed from: Y, reason: collision with root package name */
    public static final KotlinTarget f143731Y = new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);

    /* renamed from: Z, reason: collision with root package name */
    public static final KotlinTarget f143732Z = new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);

    /* renamed from: a0, reason: collision with root package name */
    public static final KotlinTarget f143733a0 = new KotlinTarget("TOP_LEVEL_PROPERTY", 33, "top level property", false);

    /* renamed from: b0, reason: collision with root package name */
    public static final KotlinTarget f143734b0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);

    /* renamed from: c0, reason: collision with root package name */
    public static final KotlinTarget f143736c0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);

    /* renamed from: d0, reason: collision with root package name */
    public static final KotlinTarget f143738d0 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);

    /* renamed from: e0, reason: collision with root package name */
    public static final KotlinTarget f143740e0 = new KotlinTarget("BACKING_FIELD", 37, "backing field", false, 2, null);

    /* renamed from: f0, reason: collision with root package name */
    public static final KotlinTarget f143742f0 = new KotlinTarget("INITIALIZER", 38, "initializer", false);

    /* renamed from: g0, reason: collision with root package name */
    public static final KotlinTarget f143744g0 = new KotlinTarget("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);

    /* renamed from: h0, reason: collision with root package name */
    public static final KotlinTarget f143746h0 = new KotlinTarget("LAMBDA_EXPRESSION", 40, "lambda expression", false);

    /* renamed from: i0, reason: collision with root package name */
    public static final KotlinTarget f143748i0 = new KotlinTarget("ANONYMOUS_FUNCTION", 41, "anonymous function", false);

    /* renamed from: j0, reason: collision with root package name */
    public static final KotlinTarget f143750j0 = new KotlinTarget("OBJECT_LITERAL", 42, "object literal", false);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private KotlinTarget(String str, int i10, String str2, boolean z10) {
        this.f143769a = str2;
        this.f143770b = z10;
    }

    private static final /* synthetic */ KotlinTarget[] a() {
        return new KotlinTarget[]{f143762t, f143763u, f143764v, f143765w, f143766x, f143767y, f143768z, f143707A, f143708B, f143709C, f143710D, f143711E, f143712F, f143713G, f143714H, f143715I, f143716J, f143717K, f143718L, f143719M, f143720N, f143721O, f143722P, f143723Q, f143724R, f143725S, f143726T, f143727U, f143728V, f143729W, f143730X, f143731Y, f143732Z, f143733a0, f143734b0, f143736c0, f143738d0, f143740e0, f143742f0, f143744g0, f143746h0, f143748i0, f143750j0};
    }

    public static EnumEntries<KotlinTarget> b() {
        return f143754l0;
    }

    static {
        KotlinTarget[] kotlinTargetArrA = a();
        f143752k0 = kotlinTargetArrA;
        f143754l0 = EnumEntriesKt.a(kotlinTargetArrA);
        f143735c = new Companion(null);
        f143737d = new HashMap<>();
        for (KotlinTarget kotlinTarget : b()) {
            f143737d.put(kotlinTarget.name(), kotlinTarget);
        }
        EnumEntries<KotlinTarget> enumEntriesB = b();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : enumEntriesB) {
            if (kotlinTarget2.f143770b) {
                arrayList.add(kotlinTarget2);
            }
        }
        f143739e = CollectionsKt.o1(arrayList);
        f143741f = CollectionsKt.o1(b());
        KotlinTarget kotlinTarget3 = f143763u;
        KotlinTarget kotlinTarget4 = f143762t;
        f143743g = CollectionsKt.p(kotlinTarget3, kotlinTarget4);
        f143745h = CollectionsKt.p(f143725S, kotlinTarget4);
        f143747i = CollectionsKt.p(f143718L, kotlinTarget4);
        KotlinTarget kotlinTarget5 = f143721O;
        KotlinTarget kotlinTarget6 = f143719M;
        f143749j = CollectionsKt.p(kotlinTarget5, kotlinTarget6, kotlinTarget4);
        f143751k = CollectionsKt.p(f143720N, kotlinTarget6, kotlinTarget4);
        f143753l = CollectionsKt.p(f143722P, kotlinTarget4);
        f143755m = CollectionsKt.p(f143723Q, kotlinTarget4);
        KotlinTarget kotlinTarget7 = f143724R;
        KotlinTarget kotlinTarget8 = f143765w;
        KotlinTarget kotlinTarget9 = f143766x;
        f143756n = CollectionsKt.p(kotlinTarget7, kotlinTarget8, kotlinTarget9);
        KotlinTarget kotlinTarget10 = f143710D;
        f143757o = CollectionsKt.e(kotlinTarget10);
        KotlinTarget kotlinTarget11 = f143709C;
        f143758p = CollectionsKt.e(kotlinTarget11);
        f143759q = CollectionsKt.e(f143708B);
        KotlinTarget kotlinTarget12 = f143713G;
        f143760r = CollectionsKt.e(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.f143678i;
        KotlinTarget kotlinTarget13 = f143768z;
        f143761s = MapsKt.o(TuplesKt.a(annotationUseSiteTarget, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f143672c, kotlinTarget9), TuplesKt.a(AnnotationUseSiteTarget.f143674e, kotlinTarget8), TuplesKt.a(AnnotationUseSiteTarget.f143673d, kotlinTarget12), TuplesKt.a(AnnotationUseSiteTarget.f143675f, kotlinTarget11), TuplesKt.a(AnnotationUseSiteTarget.f143676g, kotlinTarget10), TuplesKt.a(AnnotationUseSiteTarget.f143677h, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f143679j, kotlinTarget13), TuplesKt.a(AnnotationUseSiteTarget.f143680k, kotlinTarget9));
    }

    /* synthetic */ KotlinTarget(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) f143752k0.clone();
    }
}
