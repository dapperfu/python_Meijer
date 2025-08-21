package kotlin;

import F1.j;
import Ki.I;
import Ki.K;
import Ki.LocalThemeScope;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.n;
import L1.v;
import L1.x;
import P0.e;
import V0.x1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.j0;
import d0.C13590y;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16200v0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "", "submitReceiptClickAction", "b", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lo.u, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15565u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lo.u$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149917a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$a, reason: collision with other inner class name */
        static final class C2312a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f149918a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f149919b;

            C2312a(L1.h hVar, L1.h hVar2) {
                this.f149918a = hVar;
                this.f149919b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f149918a.getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f149919b.getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.p(v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$b */
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f149920a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f149921b;

            b(L1.h hVar, L1.h hVar2) {
                this.f149920a = hVar;
                this.f149921b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f149920a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f149921b.getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.p(v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$c */
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f149922a = new c();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                C4010g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            c() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$d */
        static final class d implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f149923a;

            d(L1.h hVar) {
                this.f149923a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f149923a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$e */
        static final class e implements Function1<u, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f149924a = new e();

            public final void a(u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                s.v(semantics);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f143329a;
            }

            e() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.u$a$f */
        public static final class f extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A f149925f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(A a10) {
                super(1);
                this.f149925f = a10;
            }

            public final void a(u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                C.a(semantics, this.f149925f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lo.u$a$g */
        public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f149926f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f149927g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f149928h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149929i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0 f149930j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Function0 function02) {
                super(2);
                this.f149927g = nVar;
                this.f149928h = function0;
                this.f149929i = localThemeScope;
                this.f149930j = function02;
                this.f149926f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f149927g.getHelpersHashCode();
                this.f149927g.i();
                L1.n nVar = this.f149927g;
                composer.startReplaceGroup(-476855959);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(J.h(T0.e.a(companion, x1.a()), 0.0f, 1, null), this.f149929i.getAdsColors().getAdsColorInverse().getColor(), null, 2, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(hVarD) | composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C2312a(hVarD, hVarC);
                    composer.t(objB);
                }
                composer.P();
                C5804h.a(nVar.k(modifierD, hVarA, (Function1) objB), composer, 0);
                Modifier modifierD2 = androidx.compose.foundation.b.d(J.h(T0.e.a(companion, x1.a()), 0.0f, 1, null), this.f149929i.getAdsColors().getAdsColorHover02().getColor(), null, 2, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.V(hVarD);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(hVarA, hVarD);
                    composer.t(objB2);
                }
                composer.P();
                C5804h.a(nVar.k(modifierD2, hVarC, (Function1) objB2), composer, 0);
                Modifier modifierI = D.i(androidx.compose.foundation.b.d(T0.e.a(companion, C16806i.f()), this.f149929i.getAdsColors().getAdsColorInverse().getColor(), null, 2, null), H1.h.p(18));
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB3 == companion2.a()) {
                    objB3 = c.f149922a;
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierK = nVar.k(modifierI, hVarD, (Function1) objB3);
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyG, companion4.e());
                D1.c(composerA, interfaceC5884sR, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C5806j c5806j = C5806j.f48836a;
                C13590y.a(C16335d.c(g0.f115012l, composer, 0), null, J.f(J.v(companion, H1.h.p(30)), 0.0f, 1, null), null, InterfaceC5926k.INSTANCE.e(), 0.0f, null, composer, 25008, 104);
                composer.v();
                e.b bVarG = companion3.g();
                float f10 = 36;
                float f11 = 16;
                Modifier modifierL = D.l(androidx.compose.foundation.b.d(companion, this.f149929i.getAdsColors().getAdsColorHover02().getColor(), null, 2, null), H1.h.p(f10), H1.h.p(f11), H1.h.p(f10), H1.h.p(24));
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(hVarD);
                Object objB4 = composer.B();
                if (zV3 || objB4 == companion2.a()) {
                    objB4 = new d(hVarD);
                    composer.t(objB4);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(modifierL, hVarE, (Function1) objB4);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                Function0<InterfaceC5953g> function0A2 = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyA, companion4.e());
                D1.c(composerA2, interfaceC5884sR2, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion4.f());
                C14903g c14903g = C14903g.f139698a;
                LocalThemeScope localThemeScope = this.f149929i;
                I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                j.Companion companion5 = F1.j.INSTANCE;
                int iA3 = companion5.a();
                composer.startReplaceGroup(1849434622);
                Object objB5 = composer.B();
                if (objB5 == companion2.a()) {
                    objB5 = e.f149924a;
                    composer.t(objB5);
                }
                composer.P();
                q1.Label label = new q1.Label(C16819m.d(companion, false, (Function1) objB5, 1, null), null, null, F1.j.h(iA3), 0, false, 0, six, null, 374, null);
                String strC = C16338g.c(j0.f115196q0, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f149929i;
                float f12 = 28;
                si.j.h(localThemeScope2, new q1.Label(D.l(companion, H1.h.p(f12), H1.h.p(8), H1.h.p(f12), H1.h.p(f11)), null, null, F1.j.h(companion5.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16338g.c(j0.f115192p0, composer, 0), null, composer, i11 | (i12 << 3), 4);
                P0.k(this.f149929i, C16200v0.f154265a, C16338g.c(j0.f115118V1, composer, 0), this.f149930j, null, null, false, 0L, false, composer, i11 | (C16200v0.f154266b << 3), 248);
                composer.v();
                composer.P();
                if (this.f149927g.getHelpersHashCode() != helpersHashCode) {
                    this.f149928h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(Function0<Unit> function0) {
            this.f149917a = function0;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2112044094, i11, -1, "com.meijer.mobile.mperks.ux.common.ReceiptPromptView.<anonymous> (ReceiptPromptView.kt:50)");
            }
            Function0<Unit> function0 = this.f149917a;
            composer.startReplaceableGroup(-270267587);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = new A();
                composer.t(objB);
            }
            composer.U();
            A a10 = (A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(companion, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 0, pairH.b(), AdsTheme, function0)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final Function0<Unit> submitReceiptClickAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(submitReceiptClickAction, "submitReceiptClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1650210543);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(submitReceiptClickAction) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1650210543, i11, -1, "com.meijer.mobile.mperks.ux.common.ReceiptPromptView (ReceiptPromptView.kt:48)");
            }
            K.b(null, ComposableLambdaKt.c(2112044094, true, new a(submitReceiptClickAction), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lo.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15565u.c(submitReceiptClickAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function0 function0, int i10, Composer composer, int i11) {
        b(function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
