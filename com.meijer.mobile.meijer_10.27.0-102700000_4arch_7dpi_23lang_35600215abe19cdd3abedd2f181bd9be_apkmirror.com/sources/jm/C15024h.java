package jm;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import ak.AbstractC5607a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import ck.C6408b;
import fm.HomeEmailBannerDecorator;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.Q0;
import ji.j1;
import ji.q1;
import jm.C15024h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\n¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lfm/a;", "decorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onClick", "onDismiss", "k", "(LJi/M;Lfm/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "g", "LH1/h;", "height", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jm.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15024h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.h$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f140737f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f140737f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f140737f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.h$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f140738f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f140739g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f140740h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140741i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ HomeEmailBannerDecorator f140742j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f140743k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f140744l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, HomeEmailBannerDecorator homeEmailBannerDecorator, Function0 function02, Function0 function03) {
            super(2);
            this.f140739g = nVar;
            this.f140740h = function0;
            this.f140741i = localThemeScope;
            this.f140742j = homeEmailBannerDecorator;
            this.f140743k = function02;
            this.f140744l = function03;
            this.f140738f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f140739g.getHelpersHashCode();
            this.f140739g.i();
            L1.n nVar = this.f140739g;
            composer.startReplaceGroup(464928182);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            Drawable drawableE = Z1.b.e((Context) composer.o(AndroidCompositionLocals_androidKt.g()), Bj.i.f2719b);
            InterfaceC5784k interfaceC5784kB = InterfaceC5784k.INSTANCE.b();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f140745a;
                composer.t(objB);
            }
            composer.P();
            b5.v.a(drawableE, null, nVar.k(companion, hVarA, (Function1) objB), null, null, null, interfaceC5784kB, 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
            Modifier modifierD = companion;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(modifierD, this.f140741i.getAdsSpacing().getSeven().getDp(), this.f140741i.getAdsSpacing().getFive().getDp(), 0.0f, this.f140741i.getAdsSpacing().getFive().getDp(), 4, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarD);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new d(hVarD);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM, hVarC, (Function1) objB2);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            LocalThemeScope localThemeScope = this.f140741i;
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.h(modifierD, 0.0f, 1, null), this.f140741i.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f140741i.getAdsTypography().getHeadings().getSeven(), null, 380, null);
            AbstractC5607a title = this.f140742j.getTitle();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(title, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, (i13 << 3) | i12, 4);
            LocalThemeScope localThemeScope2 = this.f140741i;
            Ji.I one = localThemeScope2.getAdsTypography().getBodyCompact().getOne();
            ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(modifierD, 0.0f, 1, null), 0.0f, this.f140741i.getAdsSpacing().getTwo().getDp(), 0.0f, this.f140741i.getAdsSpacing().getThree().getDp(), 5, null), this.f140741i.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, one, null, 380, null), C6408b.a(this.f140742j.getBody(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f140741i;
            Ji.Q.e(localThemeScope3, InterfaceC14971y.a.c.f140290a, ComposableLambdaKt.c(61259371, true, new e(localThemeScope3, this.f140742j, this.f140744l), composer, 54), composer, i12 | 384 | (InterfaceC14971y.a.c.f140291b << 3));
            composer.v();
            LocalThemeScope localThemeScope4 = this.f140741i;
            C.f.o oVar = C.f.o.f15522e;
            Ji.T adsColorInverse = localThemeScope4.getAdsColors().getAdsColorInverse();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(modifierD, this.f140741i.getAdsSpacing().getFive().getDp(), this.f140741i.getAdsSpacing().getFive().getDp(), this.f140741i.getAdsSpacing().getSix().getDp(), 0.0f, 8, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new f(hVarC);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(modifierM2, hVarD, (Function1) objB3);
            composer.startReplaceGroup(1954782055);
            if (!this.f140742j.getIsLoading()) {
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f140743k);
                Object objB4 = composer.B();
                if (zV3 || objB4 == companion2.a()) {
                    objB4 = new g(this.f140743k);
                    composer.t(objB4);
                }
                composer.P();
                modifierD = ClickableKt.d(modifierD, false, null, null, (Function0) objB4, 7, null);
            }
            composer.P();
            C16307b.b(localThemeScope4, new q1.h.DrawableIcon(oVar, null, null, null, 0.0f, adsColorInverse, modifierK2.then(modifierD), 30, null), null, null, composer, i12 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composer.P();
            if (this.f140739g.getHelpersHashCode() != helpersHashCode) {
                this.f140740h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.h$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f140745a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            v.Companion companion = L1.v.INSTANCE;
            constrainAs.p(companion.a());
            constrainAs.r(companion.a());
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
    /* renamed from: jm.h$d */
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f140746a;

        d(L1.h hVar) {
            this.f140746a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f140746a.getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            v.Companion companion = L1.v.INSTANCE;
            constrainAs.p(companion.d());
            constrainAs.r(companion.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.h$e */
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeEmailBannerDecorator f140748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f140749c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.h$e$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f140750a;

            a(Function0<Unit> function0) {
                this.f140750a = function0;
            }

            public final void a() {
                this.f140750a.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.h$e$b */
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f140751a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f140752b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeEmailBannerDecorator f140753c;

            b(LocalThemeScope localThemeScope, j1 j1Var, HomeEmailBannerDecorator homeEmailBannerDecorator) {
                this.f140751a = localThemeScope;
                this.f140752b = j1Var;
                this.f140753c = homeEmailBannerDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1260499614, i10, -1, "com.meijer.mobile.home.ux.views.HomeEmailBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeEmailBannerCard.kt:176)");
                }
                LocalThemeScope localThemeScope = this.f140751a;
                q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(this.f140752b.getIcons().getEnabledIcon(), this.f140753c.getActionIcon(), null, null, null, 0.0f, this.f140751a.getAdsColors().getAdsColorInverse(), null, 94, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIconY, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f140751a.getAdsSpacing().getThree().getDp()), composer, 0);
                LocalThemeScope localThemeScope2 = this.f140751a;
                ri.j.h(localThemeScope2, new q1.Label(null, this.f140751a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null), C6408b.a(this.f140753c.getActionTitle(), composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, HomeEmailBannerDecorator homeEmailBannerDecorator, Function0<Unit> function0) {
            this.f140747a = localThemeScope;
            this.f140748b = homeEmailBannerDecorator;
            this.f140749c = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(61259371, i10, -1, "com.meijer.mobile.home.ux.views.HomeEmailBanner.<anonymous>.<anonymous>.<anonymous> (HomeEmailBannerCard.kt:172)");
            }
            LocalThemeScope localThemeScope = this.f140747a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), this.f140748b.getIsActionEnabled() && !this.f140748b.getIsLoading(), null, null, null, null, null, null, null, false, null, 1022, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f140749c);
            Function0<Unit> function0 = this.f140749c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function0);
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1260499614, true, new b(this.f140747a, Assemble, this.f140748b), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.h$f */
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f140754a;

        f(L1.h hVar) {
            this.f140754a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f140754a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.h$g */
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f140755a;

        g(Function0<Unit> function0) {
            this.f140755a = function0;
        }

        public final void a() {
            this.f140755a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.h$h, reason: collision with other inner class name */
    static final class C2226h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeEmailBannerDecorator f140757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f140758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f140759d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.h$h$a */
        static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f140760a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<H1.h> f140761b;

            a(LocalThemeScope localThemeScope, InterfaceC5730l0<H1.h> interfaceC5730l0) {
                this.f140760a = localThemeScope;
                this.f140761b = interfaceC5730l0;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(723722109, i10, -1, "com.meijer.mobile.home.ux.views.HomeEmailBannerCard.<anonymous>.<anonymous> (HomeEmailBannerCard.kt:89)");
                }
                LocalThemeScope localThemeScope = this.f140760a;
                Bi.m.f(localThemeScope, androidx.compose.foundation.layout.J.i(androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorUIOverlay().getColor(), null, 2, null), C2226h.d(this.f140761b)), Assemble.getLoading().getSmallLoading(), Bi.o.f2584a, null, false, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Small.f140102f << 6), 56);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                a(interfaceC14920X, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        C2226h(LocalThemeScope localThemeScope, HomeEmailBannerDecorator homeEmailBannerDecorator, Function0<Unit> function0, Function0<Unit> function02) {
            this.f140756a = localThemeScope;
            this.f140757b = homeEmailBannerDecorator;
            this.f140758c = function0;
            this.f140759d = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(H1.d dVar, InterfaceC5730l0 interfaceC5730l0, LayoutCoordinates it) {
            Intrinsics.j(it, "it");
            e(interfaceC5730l0, dVar.K((int) (it.c() & 4294967295L)));
            return Unit.f142422a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-534295097, i10, -1, "com.meijer.mobile.home.ux.views.HomeEmailBannerCard.<anonymous> (HomeEmailBannerCard.kt:76)");
            }
            final H1.d dVar = (H1.d) composer.o(C5892t0.g());
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(H1.h.l(H1.h.p(0)), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(dVar);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: jm.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15024h.C2226h.f(dVar, interfaceC5730l0, (LayoutCoordinates) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = androidx.compose.ui.layout.T.a(companion2, (Function1) objB2);
            LocalThemeScope localThemeScope = this.f140756a;
            HomeEmailBannerDecorator homeEmailBannerDecorator = this.f140757b;
            Function0<Unit> function0 = this.f140758c;
            Function0<Unit> function02 = this.f140759d;
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            C15024h.g(localThemeScope, homeEmailBannerDecorator, modifierA, function0, function02, composer, i11 | ((i12 | (Ji.C.f15315b | i12)) << 3), 0);
            if (this.f140757b.getIsLoading()) {
                LocalThemeScope localThemeScope2 = this.f140756a;
                Ji.Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(723722109, true, new a(localThemeScope2, interfaceC5730l0), composer, 54), composer, i11 | 384 | (Q0.b.f139712b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float d(InterfaceC5730l0<H1.h> interfaceC5730l0) {
            return interfaceC5730l0.getValue().getValue();
        }

        private static final void e(InterfaceC5730l0<H1.h> interfaceC5730l0, float f10) {
            interfaceC5730l0.setValue(H1.h.l(f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r16, final fm.HomeEmailBannerDecorator r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15024h.g(Ji.M, fm.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, HomeEmailBannerDecorator homeEmailBannerDecorator, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, homeEmailBannerDecorator, modifier, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r19, final fm.HomeEmailBannerDecorator r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15024h.k(Ji.M, fm.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, HomeEmailBannerDecorator homeEmailBannerDecorator, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, homeEmailBannerDecorator, modifier, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
