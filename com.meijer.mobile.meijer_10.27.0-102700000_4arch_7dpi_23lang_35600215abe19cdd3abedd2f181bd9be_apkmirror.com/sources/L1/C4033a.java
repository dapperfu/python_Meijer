package L1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR@\u0010\u0016\u001a+\u0012'\u0012%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u00110\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R:\u0010\u001b\u001a%\u0012!\u0012\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0002\b\u00110\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR.\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LL1/a;", "", "<init>", "()V", "LO1/a;", "LH1/t;", "layoutDirection", "", "c", "(LO1/a;LH1/t;)V", "d", "", "index", "g", "(ILH1/t;)I", "", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "b", "[[Lkotlin/jvm/functions/Function3;", "f", "()[[Lkotlin/jvm/functions/Function3;", "verticalAnchorFunctions", "Lkotlin/Function2;", "[[Lkotlin/jvm/functions/Function2;", "e", "()[[Lkotlin/jvm/functions/Function2;", "horizontalAnchorFunctions", "Lkotlin/jvm/functions/Function2;", "getBaselineAnchorFunction", "()Lkotlin/jvm/functions/Function2;", "baselineAnchorFunction", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: L1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4033a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4033a f17662a = new C4033a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Function3<O1.a, Object, H1.t, O1.a>[][] verticalAnchorFunctions = {new Function3[]{g.f17671f, h.f17672f}, new Function3[]{i.f17673f, j.f17674f}};

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Function2<O1.a, Object, O1.a>[][] horizontalAnchorFunctions = {new Function2[]{c.f17667f, d.f17668f}, new Function2[]{e.f17669f, f.f17670f}};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Function2<O1.a, Object, O1.a> baselineAnchorFunction = b.f17666f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO1/a;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$b */
    static final class b extends Lambda implements Function2<O1.a, Object, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f17666f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a aVar, Object other) {
            Intrinsics.j(aVar, "$this$null");
            Intrinsics.j(other, "other");
            aVar.V(null);
            aVar.U(null);
            aVar.k(null);
            aVar.j(null);
            O1.a aVarH = aVar.h(other);
            Intrinsics.i(aVarH, "baselineToBaseline(other)");
            return aVarH;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO1/a;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$c */
    static final class c extends Lambda implements Function2<O1.a, Object, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f17667f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            arrayOf.U(null);
            arrayOf.h(null);
            O1.a aVarV = arrayOf.V(other);
            Intrinsics.i(aVarV, "topToTop(other)");
            return aVarV;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO1/a;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$d */
    static final class d extends Lambda implements Function2<O1.a, Object, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f17668f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            arrayOf.V(null);
            arrayOf.h(null);
            O1.a aVarU = arrayOf.U(other);
            Intrinsics.i(aVarU, "topToBottom(other)");
            return aVarU;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO1/a;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$e */
    static final class e extends Lambda implements Function2<O1.a, Object, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f17669f = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            arrayOf.j(null);
            arrayOf.h(null);
            O1.a aVarK = arrayOf.k(other);
            Intrinsics.i(aVarK, "bottomToTop(other)");
            return aVarK;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO1/a;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$f */
    static final class f extends Lambda implements Function2<O1.a, Object, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f17670f = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            arrayOf.k(null);
            arrayOf.h(null);
            O1.a aVarJ = arrayOf.j(other);
            Intrinsics.i(aVarJ, "bottomToBottom(other)");
            return aVarJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LO1/a;", "", "other", "LH1/t;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;LH1/t;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$g */
    static final class g extends Lambda implements Function3<O1.a, Object, H1.t, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f17671f = new g();

        g() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other, H1.t layoutDirection) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            Intrinsics.j(layoutDirection, "layoutDirection");
            C4033a.f17662a.c(arrayOf, layoutDirection);
            O1.a aVarA = arrayOf.A(other);
            Intrinsics.i(aVarA, "leftToLeft(other)");
            return aVarA;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LO1/a;", "", "other", "LH1/t;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;LH1/t;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$h */
    static final class h extends Lambda implements Function3<O1.a, Object, H1.t, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f17672f = new h();

        h() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other, H1.t layoutDirection) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            Intrinsics.j(layoutDirection, "layoutDirection");
            C4033a.f17662a.c(arrayOf, layoutDirection);
            O1.a aVarB = arrayOf.B(other);
            Intrinsics.i(aVarB, "leftToRight(other)");
            return aVarB;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LO1/a;", "", "other", "LH1/t;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;LH1/t;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$i */
    static final class i extends Lambda implements Function3<O1.a, Object, H1.t, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f17673f = new i();

        i() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other, H1.t layoutDirection) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            Intrinsics.j(layoutDirection, "layoutDirection");
            C4033a.f17662a.d(arrayOf, layoutDirection);
            O1.a aVarH = arrayOf.H(other);
            Intrinsics.i(aVarH, "rightToLeft(other)");
            return aVarH;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LO1/a;", "", "other", "LH1/t;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>", "(LO1/a;Ljava/lang/Object;LH1/t;)LO1/a;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.a$j */
    static final class j extends Lambda implements Function3<O1.a, Object, H1.t, O1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f17674f = new j();

        j() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O1.a invoke(O1.a arrayOf, Object other, H1.t layoutDirection) {
            Intrinsics.j(arrayOf, "$this$arrayOf");
            Intrinsics.j(other, "other");
            Intrinsics.j(layoutDirection, "layoutDirection");
            C4033a.f17662a.d(arrayOf, layoutDirection);
            O1.a aVarI = arrayOf.I(other);
            Intrinsics.i(aVarI, "rightToRight(other)");
            return aVarI;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(O1.a aVar, H1.t tVar) {
        aVar.A(null);
        aVar.B(null);
        int i10 = C0299a.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            aVar.S(null);
            aVar.R(null);
        } else {
            if (i10 != 2) {
                return;
            }
            aVar.s(null);
            aVar.r(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(O1.a aVar, H1.t tVar) {
        aVar.H(null);
        aVar.I(null);
        int i10 = C0299a.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            aVar.s(null);
            aVar.r(null);
        } else {
            if (i10 != 2) {
                return;
            }
            aVar.S(null);
            aVar.R(null);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0299a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H1.t.values().length];
            iArr[H1.t.f12006a.ordinal()] = 1;
            iArr[H1.t.f12007b.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Function2<O1.a, Object, O1.a>[][] e() {
        return horizontalAnchorFunctions;
    }

    public final Function3<O1.a, Object, H1.t, O1.a>[][] f() {
        return verticalAnchorFunctions;
    }

    public final int g(int index, H1.t layoutDirection) {
        Intrinsics.j(layoutDirection, "layoutDirection");
        return index >= 0 ? index : layoutDirection == H1.t.f12006a ? index + 2 : (-index) - 1;
    }

    private C4033a() {
    }
}
