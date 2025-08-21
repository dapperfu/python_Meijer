package l6;

import H1.s;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13576j;
import h6.C14478i;
import h6.EnumC14470a;
import h6.K;
import h6.y;
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

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010%\u001a\u00020$*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lh6/i;", "composition", "Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "applyShadowToLayers", "enableMergePaths", "Lh6/K;", "renderMode", "maintainOriginalImageBounds", "Ll6/n;", "dynamicProperties", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lh6/a;", "asyncUpdates", "safeMode", "", "a", "(Lh6/i;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZZLh6/K;ZLl6/n;LP0/e;Landroidx/compose/ui/layout/k;ZZLjava/util/Map;Lh6/a;ZLandroidx/compose/runtime/Composer;III)V", "LU0/k;", "Landroidx/compose/ui/layout/m0;", "scale", "LH1/r;", "g", "(JJ)J", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15461e {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l6.e$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14478i f149379f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f149380g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f149381h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149382i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f149383j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f149384k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f149385l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f149386m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f149387n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n f149388o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ P0.e f149389p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5926k f149390q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f149391r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f149392s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f149393t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ EnumC14470a f149394u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f149395v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f149396w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f149397x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f149398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C14478i c14478i, Function0<Float> function0, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5926k interfaceC5926k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14470a enumC14470a, boolean z17, int i10, int i11, int i12) {
            super(2);
            this.f149379f = c14478i;
            this.f149380g = function0;
            this.f149381h = modifier;
            this.f149382i = z10;
            this.f149383j = z11;
            this.f149384k = z12;
            this.f149385l = z13;
            this.f149386m = k10;
            this.f149387n = z14;
            this.f149388o = nVar;
            this.f149389p = eVar;
            this.f149390q = interfaceC5926k;
            this.f149391r = z15;
            this.f149392s = z16;
            this.f149393t = map;
            this.f149394u = enumC14470a;
            this.f149395v = z17;
            this.f149396w = i10;
            this.f149397x = i11;
            this.f149398y = i12;
        }

        public final void a(Composer composer, int i10) {
            C15461e.a(this.f149379f, this.f149380g, this.f149381h, this.f149382i, this.f149383j, this.f149384k, this.f149385l, this.f149386m, this.f149387n, this.f149388o, this.f149389p, this.f149390q, this.f149391r, this.f149392s, this.f149393t, this.f149394u, this.f149395v, composer, J0.a(this.f149396w | 1), J0.a(this.f149397x), this.f149398y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: l6.e$b */
    static final class b extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Rect f149399f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5926k f149400g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ P0.e f149401h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Matrix f149402i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.o f149403j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f149404k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f149405l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f149406m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EnumC14470a f149407n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C14478i f149408o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f149409p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ n f149410q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f149411r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f149412s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f149413t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f149414u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f149415v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f149416w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Context f149417x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f149418y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<n> f149419z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Rect rect, InterfaceC5926k interfaceC5926k, P0.e eVar, Matrix matrix, com.airbnb.lottie.o oVar, boolean z10, boolean z11, K k10, EnumC14470a enumC14470a, C14478i c14478i, Map<String, ? extends Typeface> map, n nVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Context context, Function0<Float> function0, InterfaceC5872l0<n> interfaceC5872l0) {
            super(1);
            this.f149399f = rect;
            this.f149400g = interfaceC5926k;
            this.f149401h = eVar;
            this.f149402i = matrix;
            this.f149403j = oVar;
            this.f149404k = z10;
            this.f149405l = z11;
            this.f149406m = k10;
            this.f149407n = enumC14470a;
            this.f149408o = c14478i;
            this.f149409p = map;
            this.f149410q = nVar;
            this.f149411r = z12;
            this.f149412s = z13;
            this.f149413t = z14;
            this.f149414u = z15;
            this.f149415v = z16;
            this.f149416w = z17;
            this.f149417x = context;
            this.f149418y = function0;
            this.f149419z = interfaceC5872l0;
        }

        public final void a(X0.f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            Rect rect = this.f149399f;
            InterfaceC5926k interfaceC5926k = this.f149400g;
            P0.e eVar = this.f149401h;
            Matrix matrix = this.f149402i;
            com.airbnb.lottie.o oVar = this.f149403j;
            boolean z10 = this.f149404k;
            boolean z11 = this.f149405l;
            K k10 = this.f149406m;
            EnumC14470a enumC14470a = this.f149407n;
            C14478i c14478i = this.f149408o;
            Map<String, Typeface> map = this.f149409p;
            n nVar = this.f149410q;
            boolean z12 = this.f149411r;
            boolean z13 = this.f149412s;
            boolean z14 = this.f149413t;
            boolean z15 = this.f149414u;
            boolean z16 = this.f149415v;
            boolean z17 = this.f149416w;
            Context context = this.f149417x;
            Function0<Float> function0 = this.f149418y;
            InterfaceC5872l0<n> interfaceC5872l0 = this.f149419z;
            Canvas canvasG = Canvas.getDrawContext().g();
            long jA = U0.l.a(rect.width(), rect.height());
            long jA2 = s.a(MathKt.d(U0.k.i(Canvas.b())), MathKt.d(U0.k.g(Canvas.b())));
            long jA3 = interfaceC5926k.a(jA, Canvas.b());
            long jA4 = eVar.a(C15461e.g(jA, jA3), jA2, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(H1.n.k(jA4), H1.n.l(jA4));
            matrix.preScale(m0.b(jA3), m0.c(jA3));
            oVar.A(y.MergePathsApi19, z10);
            oVar.Q0(z11);
            oVar.N0(k10);
            oVar.q0(enumC14470a);
            oVar.t0(c14478i);
            oVar.w0(map);
            if (nVar != C15461e.b(interfaceC5872l0)) {
                n nVarB = C15461e.b(interfaceC5872l0);
                if (nVarB != null) {
                    nVarB.b(oVar);
                }
                if (nVar != null) {
                    nVar.a(oVar);
                }
                C15461e.c(interfaceC5872l0, nVar);
            }
            oVar.K0(z12);
            oVar.o0(z13);
            oVar.p0(z14);
            oVar.B0(z15);
            oVar.s0(z16);
            oVar.r0(z17);
            o6.h hVarR = oVar.R();
            if (oVar.r(context) || hVarR == null) {
                oVar.M0(function0.invoke().floatValue());
            } else {
                oVar.M0(hVarR.f153654b);
            }
            oVar.setBounds(0, 0, rect.width(), rect.height());
            oVar.x(AndroidCanvas_androidKt.getNativeCanvas(canvasG), matrix);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l6.e$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14478i f149420f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f149421g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f149422h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149423i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f149424j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f149425k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f149426l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f149427m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f149428n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n f149429o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ P0.e f149430p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5926k f149431q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f149432r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f149433s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f149434t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ EnumC14470a f149435u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f149436v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f149437w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f149438x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f149439y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C14478i c14478i, Function0<Float> function0, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5926k interfaceC5926k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14470a enumC14470a, boolean z17, int i10, int i11, int i12) {
            super(2);
            this.f149420f = c14478i;
            this.f149421g = function0;
            this.f149422h = modifier;
            this.f149423i = z10;
            this.f149424j = z11;
            this.f149425k = z12;
            this.f149426l = z13;
            this.f149427m = k10;
            this.f149428n = z14;
            this.f149429o = nVar;
            this.f149430p = eVar;
            this.f149431q = interfaceC5926k;
            this.f149432r = z15;
            this.f149433s = z16;
            this.f149434t = map;
            this.f149435u = enumC14470a;
            this.f149436v = z17;
            this.f149437w = i10;
            this.f149438x = i11;
            this.f149439y = i12;
        }

        public final void a(Composer composer, int i10) {
            C15461e.a(this.f149420f, this.f149421g, this.f149422h, this.f149423i, this.f149424j, this.f149425k, this.f149426l, this.f149427m, this.f149428n, this.f149429o, this.f149430p, this.f149431q, this.f149432r, this.f149433s, this.f149434t, this.f149435u, this.f149436v, composer, J0.a(this.f149437w | 1), J0.a(this.f149438x), this.f149439y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @JvmOverloads
    public static final void a(C14478i c14478i, Function0<Float> progress, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, K k10, boolean z14, n nVar, P0.e eVar, InterfaceC5926k interfaceC5926k, boolean z15, boolean z16, Map<String, ? extends Typeface> map, EnumC14470a enumC14470a, boolean z17, Composer composer, int i10, int i11, int i12) {
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
        InterfaceC5926k interfaceC5926kE = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? InterfaceC5926k.INSTANCE.e() : interfaceC5926k;
        boolean z23 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? true : z15;
        boolean z24 = (i12 & 8192) != 0 ? false : z16;
        Map<String, ? extends Typeface> map2 = (i12 & 16384) != 0 ? null : map;
        EnumC14470a enumC14470a2 = (i12 & 32768) != 0 ? EnumC14470a.AUTOMATIC : enumC14470a;
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
        boolean zV = composerStartRestartGroup.V(c14478i);
        Object objB3 = composerStartRestartGroup.B();
        if (zV || objB3 == companion.a()) {
            objB3 = t1.e(null, null, 2, null);
            composerStartRestartGroup.t(objB3);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB3;
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(185152364);
        if (c14478i == null || c14478i.d() == 0.0f) {
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
            InterfaceC5926k interfaceC5926k2 = interfaceC5926kE;
            boolean z32 = z22;
            EnumC14470a enumC14470a3 = enumC14470a2;
            C5804h.a(modifier3, composerStartRestartGroup, (i10 >> 6) & 14);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L != null) {
                t0L.a(new a(c14478i, progress, modifier3, z26, z27, z28, z21, k12, z32, nVar3, eVar2, interfaceC5926k2, z29, z30, map3, enumC14470a3, z31, i10, i11, i12));
                return;
            }
            return;
        }
        composerStartRestartGroup.U();
        Rect rectB = c14478i.b();
        Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
        Modifier modifierA = C15463g.a(modifier2, rectB.width(), rectB.height());
        InterfaceC5926k interfaceC5926k3 = interfaceC5926kE;
        EnumC14470a enumC14470a4 = enumC14470a2;
        Map<String, ? extends Typeface> map4 = map2;
        n nVar4 = nVar2;
        Modifier modifier4 = modifier2;
        boolean z33 = z21;
        P0.e eVar3 = eVarE;
        K k13 = k11;
        boolean z34 = z25;
        b bVar = new b(rectB, interfaceC5926k3, eVar3, matrix, oVar, z33, z34, k13, enumC14470a4, c14478i, map4, nVar4, z18, z19, z20, z22, z23, z24, context, progress, interfaceC5872l0);
        boolean z35 = z22;
        boolean z36 = z18;
        boolean z37 = z19;
        boolean z38 = z23;
        boolean z39 = z24;
        boolean z40 = z20;
        C13576j.a(modifierA, bVar, composerStartRestartGroup, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 != null) {
            t0L2.a(new c(c14478i, progress, modifier4, z36, z37, z40, z33, k13, z35, nVar4, eVar3, interfaceC5926k3, z38, z39, map4, enumC14470a4, z34, i10, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n b(InterfaceC5872l0<n> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5872l0<n> interfaceC5872l0, n nVar) {
        interfaceC5872l0.setValue(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j10, long j11) {
        return s.a((int) (U0.k.i(j10) * m0.b(j11)), (int) (U0.k.g(j10) * m0.c(j11)));
    }
}
