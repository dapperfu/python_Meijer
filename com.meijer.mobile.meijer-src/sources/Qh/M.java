package Qh;

import Gh.a;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import Yh.YourMeijerStoreCardDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import bk.C6393b;
import j0.C14889J;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16142L;
import oi.P0;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LYh/f;", "decorator", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(LKi/M;LYh/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f28221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YourMeijerStoreCardDecorator f28222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f28224d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qh.M$a$a, reason: collision with other inner class name */
        static final class C0513a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0513a f28225a = new C0513a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            C0513a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f28226a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ YourMeijerStoreCardDecorator f28227b;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super Gh.a, Unit> function1, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator) {
                this.f28226a = function1;
                this.f28227b = yourMeijerStoreCardDecorator;
            }

            public final void a() {
                this.f28226a.invoke(new a.EditHomeStoreLocation(this.f28227b.getStoreId()));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f28228a;

            c(L1.h hVar) {
                this.f28228a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f28228a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f28229a;

            d(L1.h hVar) {
                this.f28229a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f28229a.getBottom(), H1.h.p(16), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f28230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f28231b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f28232c;

            e(L1.h hVar, L1.h hVar2, L1.h hVar3) {
                this.f28230a = hVar;
                this.f28231b = hVar2;
                this.f28232c = hVar3;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f28230a.getEnd(), H1.h.p(8), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f28231b.getBottom(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f28232c.getTop(), 0.0f, 0.0f, 6, null);
                C4010g.e(constrainAs, this.f28230a, 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class f extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f28233f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.A a10) {
                super(1);
                this.f28233f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f28233f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f28234f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f28235g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f28236h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Modifier f28237i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ YourMeijerStoreCardDecorator f28238j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28239k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1 f28240l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(L1.n nVar, int i10, Function0 function0, Modifier modifier, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f28235g = nVar;
                this.f28236h = function0;
                this.f28237i = modifier;
                this.f28238j = yourMeijerStoreCardDecorator;
                this.f28239k = localThemeScope;
                this.f28240l = function1;
                this.f28234f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f28235g.getHelpersHashCode();
                this.f28235g.i();
                L1.n nVar = this.f28235g;
                composer.startReplaceGroup(1646717925);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(this.f28237i, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = C0513a.f28225a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(modifierH, hVarA, (Function1) objB);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                LocalThemeScope localThemeScope = this.f28239k;
                Ki.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion3, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, six, null, 382, null);
                String strC = C16338g.c(Gh.h.f12824W5, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f28239k;
                C16142L c16142l = C16142L.f153955a;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f28240l) | composer.D(this.f28238j);
                Object objB2 = composer.B();
                if (zV || objB2 == companion.a()) {
                    objB2 = new b(this.f28240l, this.f28238j);
                    composer.t(objB2);
                }
                composer.P();
                P0.i(localThemeScope2, c16142l, (Function0) objB2, C.a.C3927m.f16894e, C16338g.c(Gh.h.f12700F0, composer, 0), null, C6393b.a(this.f28238j.getLoadingErrorMessage()), false, 0L, composer, i11 | (C16142L.f153956b << 3) | (C.a.C3927m.f16895f << 9), 208);
                composer.v();
                if (C6393b.a(this.f28238j.getLoadingErrorMessage())) {
                    composer.startReplaceGroup(1648607250);
                    LocalThemeScope localThemeScope3 = this.f28239k;
                    float f10 = 24;
                    Modifier modifierI = androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(f10)), H1.h.p(f10));
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion.a()) {
                        objB3 = new d(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    C16671b.b(localThemeScope3, new q1.h.DrawableIcon(C.e.C0304e.f17045d, null, null, null, 0.0f, this.f28239k.getAdsColors().getAdsColorIcon02(), nVar.k(modifierI, hVarC, (Function1) objB3), 30, null), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                    LocalThemeScope localThemeScope4 = this.f28239k;
                    composer.startReplaceGroup(-1746271574);
                    boolean zV3 = composer.V(hVarC) | composer.V(hVarA) | composer.V(hVarD);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion.a()) {
                        objB4 = new e(hVarC, hVarA, hVarD);
                        composer.t(objB4);
                    }
                    composer.P();
                    si.j.h(localThemeScope4, new q1.Label(nVar.k(companion3, hVarD, (Function1) objB4), null, null, null, 0, false, 0, this.f28239k.getAdsTypography().getBody().getOne(), null, 382, null), this.f28238j.getStoreName(), null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1648156200);
                    LocalThemeScope localThemeScope5 = this.f28239k;
                    AbstractC6392a loadingErrorMessage = this.f28238j.getLoadingErrorMessage();
                    composer.startReplaceGroup(5004770);
                    boolean zV4 = composer.V(hVarA);
                    Object objB5 = composer.B();
                    if (zV4 || objB5 == companion.a()) {
                        objB5 = new c(hVarA);
                        composer.t(objB5);
                    }
                    composer.P();
                    C4692l.b(localThemeScope5, loadingErrorMessage, nVar.k(companion3, hVarE, (Function1) objB5), composer, i11 | (AbstractC6392a.f60445b << 3), 0);
                    composer.P();
                }
                composer.P();
                if (this.f28235g.getHelpersHashCode() != helpersHashCode) {
                    this.f28236h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
            this.f28221a = modifier;
            this.f28222b = yourMeijerStoreCardDecorator;
            this.f28223c = localThemeScope;
            this.f28224d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1279156843, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.YourMeijerStoreCard.<anonymous> (YourMeijerStoreCard.kt:59)");
            }
            float f10 = 8;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(Modifier.INSTANCE, H1.h.p(16), H1.h.p(f10), H1.h.p(f10), H1.h.p(24));
            Modifier modifier = this.f28221a;
            YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator = this.f28222b;
            LocalThemeScope localThemeScope = this.f28223c;
            Function1<Gh.a, Unit> function1 = this.f28224d;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierL, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 6, pairH.b(), modifier, yourMeijerStoreCardDecorator, localThemeScope, function1)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r19, final Yh.YourMeijerStoreCardDecorator r20, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.M.b(Ki.M, Yh.f, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, yourMeijerStoreCardDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
