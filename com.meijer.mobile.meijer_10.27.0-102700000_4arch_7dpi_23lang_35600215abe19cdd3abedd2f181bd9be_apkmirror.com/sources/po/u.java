package po;

import F1.j;
import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.T;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import bo.g;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.j0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import ji.q1;
import kotlin.C15440g;
import kotlin.C17917Z;
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
import ni.C15861t;
import ni.C15862t0;
import ni.C15868w0;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import po.u;
import r1.C16705m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001aT\u0010\f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a@\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u000f\u001a\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0016\u001a'\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u0014\u001a+\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aH\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\"\u0010#\u001aH\u0010%\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010$\u001a\u00020 2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b%\u0010&\u001aH\u0010(\u001a\u00020\u0005*\u00020\u00002\u0006\u0010'\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b(\u0010#\u001a\u001d\u0010)\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lbo/g;", "", "onNavigationRequest", "Lbo/i;", "Lkotlin/ParameterName;", "name", "entryToMperks", "navigationToMperks", "N", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "J", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "V", "R", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "G", "(LJi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "D", "a0", "T", "Lkotlin/Function0;", "closePage", "L", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "u", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "showStartEarningButton", "P", "(LJi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showClaimRewardsButton", "w", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showViewRewardsButton", "X", "B", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"InvalidImport"})
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f156126f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A a10) {
            super(1);
            this.f156126f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f156126f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f156127f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f156128g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f156129h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f156130i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156131j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, Modifier modifier, LocalThemeScope localThemeScope) {
            super(2);
            this.f156128g = nVar;
            this.f156129h = function0;
            this.f156130i = modifier;
            this.f156131j = localThemeScope;
            this.f156127f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f156128g.getHelpersHashCode();
            this.f156128g.i();
            L1.n nVar = this.f156128g;
            composer.startReplaceGroup(2084930424);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            Z0.c cVarC = C16190d.c(g0.f114068n, composer, 0);
            String strC = C16193g.c(j0.f114270w0, composer, 0);
            Modifier modifier = this.f156130i;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = c.f156132a;
                composer.t(objB);
            }
            composer.P();
            C13457y.a(cVarC, strC, D.m(nVar.k(modifier, hVarA, (Function1) objB), 0.0f, this.f156131j.getAdsSpacing().getNine().getDp(), 0.0f, 0.0f, 13, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope = this.f156131j;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier modifier2 = this.f156130i;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new d(hVarA);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierM = D.m(nVar.k(modifier2, hVarC, (Function1) objB2), 0.0f, this.f156131j.getAdsSpacing().getSeven().getDp(), 0.0f, 0.0f, 13, null);
            j.Companion companion2 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion2.a()), 0, false, 0, six, null, 374, null);
            String strC2 = C16193g.c(j0.f114270w0, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC2, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f156131j;
            I two = localThemeScope2.getAdsTypography().getBodyCompact().getTwo();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new e(hVarC);
                composer.t(objB3);
            }
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(D.l(nVar.k(companion3, hVarD, (Function1) objB3), this.f156131j.getAdsSpacing().getTen().getDp(), this.f156131j.getAdsSpacing().getThree().getDp(), this.f156131j.getAdsSpacing().getTen().getDp(), this.f156131j.getAdsSpacing().getNine().getDp()), null, null, F1.j.h(companion2.a()), 0, false, 0, two, null, 374, null), C16193g.c(j0.f114267v0, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.P();
            if (this.f156128g.getHelpersHashCode() != helpersHashCode) {
                this.f156129h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f156132a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f156133a;

        d(L1.h hVar) {
            this.f156133a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f156133a.getBottom(), 0.0f, 0.0f, 6, null);
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f156134a;

        e(L1.h hVar) {
            this.f156134a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f156134a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f156134a.getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f156134a.getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.d());
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156135a;

        f(LocalThemeScope localThemeScope) {
            this.f156135a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(795521571, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnTopBar.<anonymous> (LearnToEarnComposable.kt:266)");
            }
            LocalThemeScope localThemeScope = this.f156135a;
            ri.j.h(localThemeScope, new q1.Label(null, this.f156135a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(j0.f114204e2, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f156137b;

        g(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f156136a = localThemeScope;
            this.f156137b = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1605111839, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnTopBar.<anonymous> (LearnToEarnComposable.kt:276)");
            }
            LocalThemeScope localThemeScope = this.f156136a;
            C.f.o oVar = C.f.o.f15522e;
            T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f156137b);
            final Function0<Unit> function0 = this.f156137b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: po.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.g.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(oVar, null, null, null, 0.0f, adsColorInverse, androidx.compose.foundation.layout.D.m(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), this.f156136a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), 30, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<bo.g, Unit> f156139b;

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(403262094, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnUnAuthScreen.<anonymous> (LearnToEarnComposable.kt:102)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f156138a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f156138a;
            Function1<bo.g, Unit> function1 = this.f156139b;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.o(localThemeScope.getAdsSpacing().getThree().getDp()), companion2.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            int i11 = LocalThemeScope.f15770g;
            u.D(localThemeScope, function1, composer, i11);
            u.a0(localThemeScope, function1, composer, i11);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, Function1<? super bo.g, Unit> function1) {
            this.f156138a = localThemeScope;
            this.f156139b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f156140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<bo.i, Unit> f156142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<bo.g, Unit> f156143d;

        /* JADX WARN: Multi-variable type inference failed */
        i(Modifier modifier, LocalThemeScope localThemeScope, Function1<? super bo.i, Unit> function1, Function1<? super bo.g, Unit> function12) {
            this.f156140a = modifier;
            this.f156141b = localThemeScope;
            this.f156142c = function1;
            this.f156143d = function12;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2055396218, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnUnAuthScreen.<anonymous> (LearnToEarnComposable.kt:65)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.D.h(d0.T.g(this.f156140a, d0.T.c(0, composer, 0, 1), false, null, false, 14, null), paddingValues);
            LocalThemeScope localThemeScope = this.f156141b;
            Function1<bo.i, Unit> function1 = this.f156142c;
            Modifier modifier = this.f156140a;
            Function1<bo.g, Unit> function12 = this.f156143d;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            int i12 = LocalThemeScope.f15770g;
            C15440g.g(localThemeScope, null, false, null, composer, i12 | 384, 5);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            u.u(androidx.compose.foundation.layout.D.m(J.f(companion2, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            u.P(localThemeScope, false, J.f(companion2, 0.0f, 1, null), function1, composer, i12 | 432, 0);
            u.w(localThemeScope, modifier, false, function1, composer, i12 | 384, 0);
            u.X(localThemeScope, false, J.f(companion2, 0.0f, 1, null), function1, composer, i12 | 432, 0);
            u.B(localThemeScope, modifier, composer, i12, 0);
            u.V(localThemeScope, J.f(companion2, 0.0f, 1, null), function12, composer, i12 | 48, 0);
            u.z(localThemeScope, J.h(companion2, 0.0f, 1, null), composer, i12 | 48, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f156144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(A a10) {
            super(1);
            this.f156144f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f156144f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f156145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f156146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f156147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156148i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f156149j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f156150k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f156151l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1) {
            super(2);
            this.f156146g = nVar;
            this.f156147h = function0;
            this.f156148i = localThemeScope;
            this.f156149j = modifier;
            this.f156150k = z10;
            this.f156151l = function1;
            this.f156145f = i10;
        }

        public final void a(Composer composer, int i10) {
            L1.h hVar;
            Modifier.Companion companion;
            int i11;
            int i12;
            L1.h hVar2;
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f156146g.getHelpersHashCode();
            this.f156146g.i();
            L1.n nVar = this.f156146g;
            composer2.startReplaceGroup(-1463264803);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f156148i;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = l.f156152a;
                composer2.t(objB);
            }
            composer2.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion2, hVarA, (Function1) objB), 0.0f, this.f156148i.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, six, null, 382, null);
            String strC = C16193g.c(j0.f114189b, composer2, 0);
            int i13 = LocalThemeScope.f15770g;
            int i14 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer2, i13 | (i14 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f156148i;
            I two = localThemeScope2.getAdsTypography().getBody().getTwo();
            Modifier modifier = this.f156149j;
            composer2.startReplaceGroup(-1633490746);
            boolean zV = composer2.V(hVarA) | composer2.V(hVarD);
            Object objB2 = composer2.B();
            if (zV || objB2 == companion3.a()) {
                objB2 = new m(hVarA, hVarD);
                composer2.t(objB2);
            }
            composer2.P();
            ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(modifier, hVarC, (Function1) objB2), 0.0f, this.f156148i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, two, null, 382, null), C16193g.c(j0.f114185a, composer2, 0), null, composer2, i13 | (i14 << 3), 4);
            composer2.startReplaceGroup(507018381);
            if (this.f156150k) {
                C14802K.a(J.i(companion2, this.f156148i.getAdsSpacing().getFive().getDp()), composer2, 0);
                C15862t0 c15862t0 = C15862t0.f151797a;
                String strC2 = C16193g.c(j0.f114172V1, composer2, 0);
                LocalThemeScope localThemeScope3 = this.f156148i;
                composer2.startReplaceGroup(5004770);
                boolean zV2 = composer2.V(this.f156151l);
                Object objB3 = composer2.B();
                if (zV2 || objB3 == companion3.a()) {
                    objB3 = new n(this.f156151l);
                    composer2.t(objB3);
                }
                composer2.P();
                hVar = hVarD;
                companion = companion2;
                i12 = helpersHashCode;
                hVar2 = hVarA;
                i11 = 0;
                P0.k(localThemeScope3, c15862t0, strC2, (Function0) objB3, null, null, true, 0L, false, composer, 1572864 | i13 | (C15862t0.f151798b << 3), 216);
                composer2 = composer;
            } else {
                hVar = hVarD;
                companion = companion2;
                i11 = 0;
                i12 = helpersHashCode;
                hVar2 = hVarA;
            }
            composer2.P();
            Z0.c cVarC = C16190d.c(g0.f114063i, composer2, i11);
            String strC3 = C16193g.c(j0.f114189b, composer2, i11);
            composer2.startReplaceGroup(5004770);
            boolean zV3 = composer2.V(hVar2);
            Object objB4 = composer2.B();
            if (zV3 || objB4 == companion3.a()) {
                objB4 = new o(hVar2);
                composer2.t(objB4);
            }
            composer2.P();
            C13457y.a(cVarC, strC3, nVar.k(companion, hVar, (Function1) objB4), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            composer.P();
            if (this.f156146g.getHelpersHashCode() != i12) {
                this.f156147h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f156152a = new l();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        l() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f156153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f156154b;

        m(L1.h hVar, L1.h hVar2) {
            this.f156153a = hVar;
            this.f156154b = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f156153a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f156154b.getStart(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<bo.i, Unit> f156155a;

        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super bo.i, Unit> function1) {
            this.f156155a = function1;
        }

        public final void a() {
            this.f156155a.invoke(bo.i.f60581a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f156156a;

        o(L1.h hVar) {
            this.f156156a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f156156a.getTop(), 0.0f, 0.0f, 6, null);
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
    static final class p implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<bo.g, Unit> f156158b;

        /* JADX WARN: Multi-variable type inference failed */
        p(LocalThemeScope localThemeScope, Function1<? super bo.g, Unit> function1) {
            this.f156157a = localThemeScope;
            this.f156158b = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1963952112, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.QuestionsAboutMperksWebLinkSection.<anonymous> (LearnToEarnComposable.kt:189)");
            }
            Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
            C5658d.f fVarB = C5658d.f48555a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f156157a;
            Function1<bo.g, Unit> function1 = this.f156158b;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            int i11 = LocalThemeScope.f15770g;
            u.T(localThemeScope, composer, i11);
            u.R(localThemeScope, composer, i11);
            u.G(localThemeScope, function1, composer, i11);
            composer.v();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final LocalThemeScope localThemeScope, final Function1<? super bo.g, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-175118713);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-175118713, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.JoinMperksTodayButton (LearnToEarnComposable.kt:229)");
            }
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC = C16193g.c(j0.f114120E0, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: po.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.E(function1);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            P0.k(localThemeScope, c15862t0, strC, (Function0) objB, null, null, true, 0L, false, composerStartRestartGroup, (i11 & 14) | 1572864 | LocalThemeScope.f15770g | (C15862t0.f151798b << 3), 216);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.F(localThemeScope, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Function1 function1) {
        function1.invoke(g.f.f60549a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        D(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(final LocalThemeScope localThemeScope, final Function1<? super bo.g, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-763728979);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-763728979, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnMoreButton (LearnToEarnComposable.kt:216)");
            }
            C15861t c15861t = C15861t.f151795a;
            int i12 = i11;
            C.a.p pVar = C.a.p.f15354e;
            String strC = C16193g.c(j0.f114123F0, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: po.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.H(function1);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            P0.h(localThemeScope, c15861t, (Function0) objB, pVar, strC, null, null, true, false, false, 0L, composerStartRestartGroup, (i12 & 14) | 12582912 | LocalThemeScope.f15770g | (C15861t.f151796b << 3) | (C.a.p.f15355f << 9), 0, 944);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.I(localThemeScope, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(Function1 function1) {
        function1.invoke(g.C1192g.f60550a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        G(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(final Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super bo.i, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.J(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        J(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.L(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super bo.i, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.N(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ji.LocalThemeScope r18, final boolean r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super bo.i, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.P(Ji.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427001413);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1427001413, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.QuestionsAboutMperksBody (LearnToEarnComposable.kt:202)");
            }
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 5, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 374, null), C16193g.c(j0.f114265u1, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i11 & 14) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.S(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        R(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(425756021);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(425756021, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.QuestionsAboutMperksTitle (LearnToEarnComposable.kt:251)");
            }
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), 0.0f, 9, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 382, null), C16193g.c(j0.f114262t1, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i11 & 14) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.U(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        T(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.V(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void X(final Ji.LocalThemeScope r36, final boolean r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function1<? super bo.i, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.X(Ji.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(Function1 function1) {
        function1.invoke(bo.i.f60583c);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        X(localThemeScope, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(final LocalThemeScope localThemeScope, final Function1<? super bo.g, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(631686264);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(631686264, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.SignInButton (LearnToEarnComposable.kt:241)");
            }
            C15868w0 c15868w0 = C15868w0.f151812a;
            String strC = C16193g.c(j0.f114160R1, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: po.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.b0(function1);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            P0.k(localThemeScope, c15868w0, strC, (Function0) objB, null, null, true, 0L, false, composerStartRestartGroup, (i11 & 14) | 1572864 | LocalThemeScope.f15770g | (C15868w0.f151813b << 3), 216);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.c0(localThemeScope, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(Function1 function1) {
        function1.invoke(g.k.f60554a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        a0(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Modifier modifier, int i10, int i11, Composer composer, int i12) {
        u(modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final boolean r36, final kotlin.jvm.functions.Function1<? super bo.i, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.w(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1) {
        function1.invoke(bo.i.f60582b);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final Ji.LocalThemeScope r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.u.z(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        final LocalThemeScope localThemeScope2;
        Composer composerStartRestartGroup = composer.startRestartGroup(692877956);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(692877956, i12, -1, "com.meijer.mobile.mperks.ux.learnToEarn.ExpiringPointsSection (LearnToEarnComposable.kt:452)");
            }
            int i16 = (i12 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            A a10 = (A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            composerStartRestartGroup = composerStartRestartGroup;
            localThemeScope2 = localThemeScope;
            androidx.compose.ui.layout.A.a(C16705m.d(modifier2, false, new a(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, i16, pairH.b(), modifier2, localThemeScope2)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.C(localThemeScope2, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(840035287);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i14 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(840035287, i12, -1, "com.meijer.mobile.mperks.ux.learnToEarn.DollarToPointsImage (LearnToEarnComposable.kt:291)");
            }
            C13457y.a(C16190d.c(g0.f114060f, composerStartRestartGroup, 0), C16193g.c(j0.f114166T1, composerStartRestartGroup, 0), modifier2, null, InterfaceC5784k.INSTANCE.d(), 0.0f, null, composerStartRestartGroup, ((i12 << 6) & 896) | 24576, 104);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: po.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.v(modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
