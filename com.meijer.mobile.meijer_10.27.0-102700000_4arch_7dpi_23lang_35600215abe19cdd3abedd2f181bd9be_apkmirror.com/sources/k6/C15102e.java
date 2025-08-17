package k6;

import H1.s;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13443j;
import g6.C14209i;
import g6.EnumC14201a;
import g6.K;
import g6.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010%\u001a\u00020$*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lg6/i;", "composition", "Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "applyShadowToLayers", "enableMergePaths", "Lg6/K;", "renderMode", "maintainOriginalImageBounds", "Lk6/n;", "dynamicProperties", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lg6/a;", "asyncUpdates", "safeMode", "", "a", "(Lg6/i;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZZLg6/K;ZLk6/n;LP0/e;Landroidx/compose/ui/layout/k;ZZLjava/util/Map;Lg6/a;ZLandroidx/compose/runtime/Composer;III)V", "LU0/k;", "Landroidx/compose/ui/layout/m0;", "scale", "LH1/r;", "g", "(JJ)J", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15102e {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k6.e$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14209i f141482f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f141483g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f141484h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f141485i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f141486j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f141487k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f141488l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f141489m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f141490n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n f141491o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ P0.e f141492p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5784k f141493q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f141494r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f141495s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f141496t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ EnumC14201a f141497u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f141498v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f141499w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f141500x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f141501y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C14209i c14209i, Function0<Float> function0, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5784k interfaceC5784k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14201a enumC14201a, boolean z17, int i10, int i11, int i12) {
            super(2);
            this.f141482f = c14209i;
            this.f141483g = function0;
            this.f141484h = modifier;
            this.f141485i = z10;
            this.f141486j = z11;
            this.f141487k = z12;
            this.f141488l = z13;
            this.f141489m = k10;
            this.f141490n = z14;
            this.f141491o = nVar;
            this.f141492p = eVar;
            this.f141493q = interfaceC5784k;
            this.f141494r = z15;
            this.f141495s = z16;
            this.f141496t = map;
            this.f141497u = enumC14201a;
            this.f141498v = z17;
            this.f141499w = i10;
            this.f141500x = i11;
            this.f141501y = i12;
        }

        public final void a(Composer composer, int i10) {
            C15102e.a(this.f141482f, this.f141483g, this.f141484h, this.f141485i, this.f141486j, this.f141487k, this.f141488l, this.f141489m, this.f141490n, this.f141491o, this.f141492p, this.f141493q, this.f141494r, this.f141495s, this.f141496t, this.f141497u, this.f141498v, composer, J0.a(this.f141499w | 1), J0.a(this.f141500x), this.f141501y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: k6.e$b */
    static final class b extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Rect f141502f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5784k f141503g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ P0.e f141504h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Matrix f141505i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.o f141506j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f141507k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f141508l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f141509m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EnumC14201a f141510n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C14209i f141511o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f141512p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ n f141513q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f141514r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f141515s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f141516t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f141517u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f141518v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f141519w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Context f141520x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f141521y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<n> f141522z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Rect rect, InterfaceC5784k interfaceC5784k, P0.e eVar, Matrix matrix, com.airbnb.lottie.o oVar, boolean z10, boolean z11, K k10, EnumC14201a enumC14201a, C14209i c14209i, Map<String, ? extends Typeface> map, n nVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Context context, Function0<Float> function0, InterfaceC5730l0<n> interfaceC5730l0) {
            super(1);
            this.f141502f = rect;
            this.f141503g = interfaceC5784k;
            this.f141504h = eVar;
            this.f141505i = matrix;
            this.f141506j = oVar;
            this.f141507k = z10;
            this.f141508l = z11;
            this.f141509m = k10;
            this.f141510n = enumC14201a;
            this.f141511o = c14209i;
            this.f141512p = map;
            this.f141513q = nVar;
            this.f141514r = z12;
            this.f141515s = z13;
            this.f141516t = z14;
            this.f141517u = z15;
            this.f141518v = z16;
            this.f141519w = z17;
            this.f141520x = context;
            this.f141521y = function0;
            this.f141522z = interfaceC5730l0;
        }

        public final void a(X0.f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            Rect rect = this.f141502f;
            InterfaceC5784k interfaceC5784k = this.f141503g;
            P0.e eVar = this.f141504h;
            Matrix matrix = this.f141505i;
            com.airbnb.lottie.o oVar = this.f141506j;
            boolean z10 = this.f141507k;
            boolean z11 = this.f141508l;
            K k10 = this.f141509m;
            EnumC14201a enumC14201a = this.f141510n;
            C14209i c14209i = this.f141511o;
            Map<String, Typeface> map = this.f141512p;
            n nVar = this.f141513q;
            boolean z12 = this.f141514r;
            boolean z13 = this.f141515s;
            boolean z14 = this.f141516t;
            boolean z15 = this.f141517u;
            boolean z16 = this.f141518v;
            boolean z17 = this.f141519w;
            Context context = this.f141520x;
            Function0<Float> function0 = this.f141521y;
            InterfaceC5730l0<n> interfaceC5730l0 = this.f141522z;
            Canvas canvasG = Canvas.getDrawContext().g();
            long jA = U0.l.a(rect.width(), rect.height());
            long jA2 = s.a(MathKt.d(U0.k.i(Canvas.b())), MathKt.d(U0.k.g(Canvas.b())));
            long jA3 = interfaceC5784k.a(jA, Canvas.b());
            long jA4 = eVar.a(C15102e.g(jA, jA3), jA2, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(H1.n.k(jA4), H1.n.l(jA4));
            matrix.preScale(m0.b(jA3), m0.c(jA3));
            oVar.A(y.MergePathsApi19, z10);
            oVar.Q0(z11);
            oVar.N0(k10);
            oVar.q0(enumC14201a);
            oVar.t0(c14209i);
            oVar.w0(map);
            if (nVar != C15102e.b(interfaceC5730l0)) {
                n nVarB = C15102e.b(interfaceC5730l0);
                if (nVarB != null) {
                    nVarB.b(oVar);
                }
                if (nVar != null) {
                    nVar.a(oVar);
                }
                C15102e.c(interfaceC5730l0, nVar);
            }
            oVar.K0(z12);
            oVar.o0(z13);
            oVar.p0(z14);
            oVar.B0(z15);
            oVar.s0(z16);
            oVar.r0(z17);
            n6.h hVarR = oVar.R();
            if (oVar.r(context) || hVarR == null) {
                oVar.M0(function0.invoke().floatValue());
            } else {
                oVar.M0(hVarR.f151052b);
            }
            oVar.setBounds(0, 0, rect.width(), rect.height());
            oVar.x(AndroidCanvas_androidKt.getNativeCanvas(canvasG), matrix);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k6.e$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14209i f141523f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f141524g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f141525h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f141526i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f141527j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f141528k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f141529l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f141530m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f141531n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n f141532o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ P0.e f141533p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5784k f141534q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f141535r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f141536s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f141537t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ EnumC14201a f141538u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f141539v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f141540w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f141541x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f141542y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C14209i c14209i, Function0<Float> function0, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5784k interfaceC5784k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14201a enumC14201a, boolean z17, int i10, int i11, int i12) {
            super(2);
            this.f141523f = c14209i;
            this.f141524g = function0;
            this.f141525h = modifier;
            this.f141526i = z10;
            this.f141527j = z11;
            this.f141528k = z12;
            this.f141529l = z13;
            this.f141530m = k10;
            this.f141531n = z14;
            this.f141532o = nVar;
            this.f141533p = eVar;
            this.f141534q = interfaceC5784k;
            this.f141535r = z15;
            this.f141536s = z16;
            this.f141537t = map;
            this.f141538u = enumC14201a;
            this.f141539v = z17;
            this.f141540w = i10;
            this.f141541x = i11;
            this.f141542y = i12;
        }

        public final void a(Composer composer, int i10) {
            C15102e.a(this.f141523f, this.f141524g, this.f141525h, this.f141526i, this.f141527j, this.f141528k, this.f141529l, this.f141530m, this.f141531n, this.f141532o, this.f141533p, this.f141534q, this.f141535r, this.f141536s, this.f141537t, this.f141538u, this.f141539v, composer, J0.a(this.f141540w | 1), J0.a(this.f141541x), this.f141542y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @JvmOverloads
    public static final void a(C14209i c14209i, Function0<Float> progress, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5784k interfaceC5784k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14201a enumC14201a, boolean z17, Composer composer, int i10, int i11, int i12) {
        Intrinsics.j(progress, "progress");
        Composer composerStartRestartGroup = composer.startRestartGroup(382909894);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z18 = (i12 & 8) != 0 ? false : z10;
        boolean z19 = (i12 & 16) != 0 ? false : z11;
        boolean z20 = (i12 & 32) != 0 ? true : z12;
        boolean z21 = (i12 & 64) != 0 ? false : z13;
        K k11 = (i12 & 128) != 0 ? K.AUTOMATIC : k10;
        boolean z22 = (i12 & 256) != 0 ? false : z14;
        n nVar2 = (i12 & 512) != 0 ? null : nVar;
        P0.e eVarE = (i12 & 1024) != 0 ? P0.e.INSTANCE.e() : eVar;
        InterfaceC5784k interfaceC5784kE = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? InterfaceC5784k.INSTANCE.e() : interfaceC5784k;
        boolean z23 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? true : z15;
        boolean z24 = (i12 & 8192) != 0 ? false : z16;
        Map<String, ? extends Typeface> map2 = (i12 & 16384) != 0 ? null : map;
        EnumC14201a enumC14201a2 = (i12 & 32768) != 0 ? EnumC14201a.AUTOMATIC : enumC14201a;
        boolean z25 = (i12 & 65536) != 0 ? false : z17;
        if (ComposerKt.M()) {
            ComposerKt.U(382909894, i10, i11, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        composerStartRestartGroup.startReplaceableGroup(185152185);
        Object objB = composerStartRestartGroup.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new com.airbnb.lottie.o();
            composerStartRestartGroup.t(objB);
        }
        com.airbnb.lottie.o oVar = (com.airbnb.lottie.o) objB;
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(185152232);
        Object objB2 = composerStartRestartGroup.B();
        if (objB2 == companion.a()) {
            objB2 = new Matrix();
            composerStartRestartGroup.t(objB2);
        }
        Matrix matrix = (Matrix) objB2;
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(185152312);
        boolean zV = composerStartRestartGroup.V(c14209i);
        Object objB3 = composerStartRestartGroup.B();
        if (zV || objB3 == companion.a()) {
            objB3 = t1.e(null, null, 2, null);
            composerStartRestartGroup.t(objB3);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB3;
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(185152364);
        if (c14209i == null || c14209i.d() == 0.0f) {
            n nVar3 = nVar2;
            P0.e eVar2 = eVarE;
            K k12 = k11;
            Modifier modifier3 = modifier2;
            boolean z26 = z18;
            boolean z27 = z19;
            boolean z28 = z20;
            boolean z29 = z23;
            boolean z30 = z24;
            boolean z31 = z25;
            Map<String, ? extends Typeface> map3 = map2;
            InterfaceC5784k interfaceC5784k2 = interfaceC5784kE;
            boolean z32 = z22;
            EnumC14201a enumC14201a3 = enumC14201a2;
            C5662h.a(modifier3, composerStartRestartGroup, (i10 >> 6) & 14);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L != null) {
                t0L.a(new a(c14209i, progress, modifier3, z26, z27, z28, z21, k12, z32, nVar3, eVar2, interfaceC5784k2, z29, z30, map3, enumC14201a3, z31, i10, i11, i12));
                return;
            }
            return;
        }
        composerStartRestartGroup.U();
        Rect rectB = c14209i.b();
        Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
        Modifier modifierA = C15104g.a(modifier2, rectB.width(), rectB.height());
        InterfaceC5784k interfaceC5784k3 = interfaceC5784kE;
        EnumC14201a enumC14201a4 = enumC14201a2;
        Map<String, ? extends Typeface> map4 = map2;
        n nVar4 = nVar2;
        Modifier modifier4 = modifier2;
        boolean z33 = z21;
        P0.e eVar3 = eVarE;
        K k13 = k11;
        boolean z34 = z25;
        b bVar = new b(rectB, interfaceC5784k3, eVar3, matrix, oVar, z33, z34, k13, enumC14201a4, c14209i, map4, nVar4, z18, z19, z20, z22, z23, z24, context, progress, interfaceC5730l0);
        boolean z35 = z22;
        boolean z36 = z18;
        boolean z37 = z19;
        boolean z38 = z23;
        boolean z39 = z24;
        boolean z40 = z20;
        C13443j.a(modifierA, bVar, composerStartRestartGroup, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 != null) {
            t0L2.a(new c(c14209i, progress, modifier4, z36, z37, z40, z33, k13, z35, nVar4, eVar3, interfaceC5784k3, z38, z39, map4, enumC14201a4, z34, i10, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n b(InterfaceC5730l0<n> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5730l0<n> interfaceC5730l0, n nVar) {
        interfaceC5730l0.setValue(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j10, long j11) {
        return s.a((int) (U0.k.i(j10) * m0.b(j11)), (int) (U0.k.g(j10) * m0.c(j11)));
    }
}
