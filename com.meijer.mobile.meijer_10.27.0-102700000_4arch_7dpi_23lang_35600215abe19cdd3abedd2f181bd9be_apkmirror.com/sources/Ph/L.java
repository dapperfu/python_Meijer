package Ph;

import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Xh.YourMeijerStoreCardDecorator;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15808L;
import ni.P0;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LXh/f;", "decorator", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(LJi/M;LXh/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f25509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YourMeijerStoreCardDecorator f25510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f25512d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ph.L$a$a, reason: collision with other inner class name */
        static final class C0449a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0449a f25513a = new C0449a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            C0449a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f25514a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ YourMeijerStoreCardDecorator f25515b;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super Fh.a, Unit> function1, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator) {
                this.f25514a = function1;
                this.f25515b = yourMeijerStoreCardDecorator;
            }

            public final void a() {
                this.f25514a.invoke(new a.EditHomeStoreLocation(this.f25515b.getStoreId()));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25516a;

            c(L1.h hVar) {
                this.f25516a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f25516a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25517a;

            d(L1.h hVar) {
                this.f25517a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f25517a.getBottom(), H1.h.p(16), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25518a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f25519b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f25520c;

            e(L1.h hVar, L1.h hVar2, L1.h hVar3) {
                this.f25518a = hVar;
                this.f25519b = hVar2;
                this.f25520c = hVar3;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f25518a.getEnd(), H1.h.p(8), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f25519b.getBottom(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f25520c.getTop(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, this.f25518a, 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class f extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f25521f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.A a10) {
                super(1);
                this.f25521f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f25521f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f25522f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f25523g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f25524h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Modifier f25525i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ YourMeijerStoreCardDecorator f25526j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25527k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1 f25528l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(L1.n nVar, int i10, Function0 function0, Modifier modifier, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f25523g = nVar;
                this.f25524h = function0;
                this.f25525i = modifier;
                this.f25526j = yourMeijerStoreCardDecorator;
                this.f25527k = localThemeScope;
                this.f25528l = function1;
                this.f25522f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f25523g.getHelpersHashCode();
                this.f25523g.i();
                L1.n nVar = this.f25523g;
                composer.startReplaceGroup(1646717925);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(this.f25525i, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = C0449a.f25513a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(modifierH, hVarA, (Function1) objB);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f25527k;
                Ji.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion3, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, six, null, 382, null);
                String strC = C16193g.c(Fh.h.f10633W5, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f25527k;
                C15808L c15808l = C15808L.f151496a;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f25528l) | composer.D(this.f25526j);
                Object objB2 = composer.B();
                if (zV || objB2 == companion.a()) {
                    objB2 = new b(this.f25528l, this.f25526j);
                    composer.t(objB2);
                }
                composer.P();
                P0.i(localThemeScope2, c15808l, (Function0) objB2, C.a.C3841m.f15350e, C16193g.c(Fh.h.f10509F0, composer, 0), null, C5608b.a(this.f25526j.getLoadingErrorMessage()), false, 0L, composer, i11 | (C15808L.f151497b << 3) | (C.a.C3841m.f15351f << 9), 208);
                composer.v();
                if (C5608b.a(this.f25526j.getLoadingErrorMessage())) {
                    composer.startReplaceGroup(1648607250);
                    LocalThemeScope localThemeScope3 = this.f25527k;
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
                    C16307b.b(localThemeScope3, new q1.h.DrawableIcon(C.e.C0262e.f15501d, null, null, null, 0.0f, this.f25527k.getAdsColors().getAdsColorIcon02(), nVar.k(modifierI, hVarC, (Function1) objB3), 30, null), null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                    LocalThemeScope localThemeScope4 = this.f25527k;
                    composer.startReplaceGroup(-1746271574);
                    boolean zV3 = composer.V(hVarC) | composer.V(hVarA) | composer.V(hVarD);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion.a()) {
                        objB4 = new e(hVarC, hVarA, hVarD);
                        composer.t(objB4);
                    }
                    composer.P();
                    ri.j.h(localThemeScope4, new q1.Label(nVar.k(companion3, hVarD, (Function1) objB4), null, null, null, 0, false, 0, this.f25527k.getAdsTypography().getBody().getOne(), null, 382, null), this.f25526j.getStoreName(), null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1648156200);
                    LocalThemeScope localThemeScope5 = this.f25527k;
                    AbstractC5607a loadingErrorMessage = this.f25526j.getLoadingErrorMessage();
                    composer.startReplaceGroup(5004770);
                    boolean zV4 = composer.V(hVarA);
                    Object objB5 = composer.B();
                    if (zV4 || objB5 == companion.a()) {
                        objB5 = new c(hVarA);
                        composer.t(objB5);
                    }
                    composer.P();
                    C4609l.b(localThemeScope5, loadingErrorMessage, nVar.k(companion3, hVarE, (Function1) objB5), composer, i11 | (AbstractC5607a.f45514b << 3), 0);
                    composer.P();
                }
                composer.P();
                if (this.f25523g.getHelpersHashCode() != helpersHashCode) {
                    this.f25524h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f25509a = modifier;
            this.f25510b = yourMeijerStoreCardDecorator;
            this.f25511c = localThemeScope;
            this.f25512d = function1;
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
            Modifier modifier = this.f25509a;
            YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator = this.f25510b;
            LocalThemeScope localThemeScope = this.f25511c;
            Function1<Fh.a, Unit> function1 = this.f25512d;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierL, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 6, pairH.b(), modifier, yourMeijerStoreCardDecorator, localThemeScope, function1)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
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
    public static final void b(final Ji.LocalThemeScope r19, final Xh.YourMeijerStoreCardDecorator r20, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.L.b(Ji.M, Xh.f, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, yourMeijerStoreCardDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
