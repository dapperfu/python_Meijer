package Or;

import Ji.LocalThemeScope;
import Ji.Q;
import Or.n;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a]\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u00020\b*\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJi/M;", "", "isCouponClipped", "isCouponMeijerBuck", "showNotInterestedButton", "LPk/b;", "couponActionLoadingState", "Lkotlin/Function0;", "", "onNotInterestedClicked", "onClipCouponClicked", "onUnclipCouponClicked", "d", "(LJi/M;ZZZLPk/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "m", "(LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "actionLoadingState", "f", "(LJi/M;ZZLPk/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24324b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24325c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f24326d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24327e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Pk.b f24328f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Or.n$a$a, reason: collision with other inner class name */
        static final class C0440a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24329a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f24330b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Pk.b f24331c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f24332d;

            C0440a(LocalThemeScope localThemeScope, j1 j1Var, Pk.b bVar, boolean z10) {
                this.f24329a = localThemeScope;
                this.f24330b = j1Var;
                this.f24331c = bVar;
                this.f24332d = z10;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1561308449, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ClipUnclipButton.<anonymous>.<anonymous> (CouponDetailActionButton.kt:159)");
                }
                ri.j.h(this.f24329a, n.j(this.f24330b, this.f24331c), n.i(this.f24331c, this.f24332d, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, boolean z11, Function0<Unit> function02, Pk.b bVar) {
            this.f24323a = localThemeScope;
            this.f24324b = z10;
            this.f24325c = function0;
            this.f24326d = z11;
            this.f24327e = function02;
            this.f24328f = bVar;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1831419250, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ClipUnclipButton.<anonymous> (CouponDetailActionButton.kt:149)");
            }
            LocalThemeScope localThemeScope = this.f24323a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(n.g(Assemble, this.f24328f), false, null, null, null, null, null, null, C18299z.f(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f24324b ? "coupon_detail_unclip_button" : "coupon_detail_clip_button", null, 2, null), false, null, 895, null);
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(this.f24324b) | composer.V(this.f24325c) | composer.a(this.f24326d) | composer.V(this.f24327e);
            final boolean z10 = this.f24324b;
            final Function0<Unit> function0 = this.f24325c;
            final boolean z11 = this.f24326d;
            final Function0<Unit> function02 = this.f24327e;
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Or.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.a.c(z10, function0, z11, function02);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1561308449, true, new C0440a(this.f24323a, Assemble, this.f24328f, this.f24324b), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, Function0 function0, boolean z11, Function0 function02) {
            n.l(z10, function0, z11, function02);
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final boolean z10, final boolean z11, final boolean z12, final Pk.b couponActionLoadingState, final Function0<Unit> onNotInterestedClicked, final Function0<Unit> onClipCouponClicked, final Function0<Unit> onUnclipCouponClicked, Composer composer, final int i10) {
        int i11;
        boolean z13;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(couponActionLoadingState, "couponActionLoadingState");
        Intrinsics.j(onNotInterestedClicked, "onNotInterestedClicked");
        Intrinsics.j(onClipCouponClicked, "onClipCouponClicked");
        Intrinsics.j(onUnclipCouponClicked, "onUnclipCouponClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(139604380);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z13 = z11;
            i11 |= composerStartRestartGroup.a(z13) ? 256 : 128;
        } else {
            z13 = z11;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z12) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.d(couponActionLoadingState.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onNotInterestedClicked) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onClipCouponClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onUnclipCouponClicked) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(139604380, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.ActionButtonContainer (CouponDetailActionButton.kt:51)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16));
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(885533574);
            if (z12) {
                m(localThemeScope, onNotInterestedClicked, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | ((i11 >> 12) & 112));
            }
            composerStartRestartGroup.P();
            int i12 = LocalThemeScope.f15770g | (i11 & 14) | (i11 & 112) | (i11 & 896) | ((i11 >> 3) & 7168);
            int i13 = i11 >> 6;
            f(localThemeScope, z10, z13, couponActionLoadingState, onClipCouponClicked, onUnclipCouponClicked, composerStartRestartGroup, i12 | (57344 & i13) | (i13 & 458752));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.e(localThemeScope, z10, z11, z12, couponActionLoadingState, onNotInterestedClicked, onClipCouponClicked, onUnclipCouponClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, Pk.b bVar, Function0 function0, Function0 function02, Function0 function03, int i10, Composer composer, int i11) {
        d(localThemeScope, z10, z11, z12, bVar, function0, function02, function03, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void f(final LocalThemeScope localThemeScope, final boolean z10, final boolean z11, final Pk.b actionLoadingState, final Function0<Unit> onClipCouponClicked, final Function0<Unit> onUnclipCouponClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(actionLoadingState, "actionLoadingState");
        Intrinsics.j(onClipCouponClicked, "onClipCouponClicked");
        Intrinsics.j(onUnclipCouponClicked, "onUnclipCouponClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(232275214);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.d(actionLoadingState.ordinal()) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onClipCouponClicked) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onUnclipCouponClicked) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(232275214, i12, -1, "com.meijer.mobile.ui.coupon.composable.detail.ClipUnclipButton (CouponDetailActionButton.kt:100)");
            }
            Q.e(localThemeScope, h(z10), ComposableLambdaKt.c(1831419250, true, new a(localThemeScope, z10, onClipCouponClicked, z11, onUnclipCouponClicked, actionLoadingState), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.k(localThemeScope, z10, z11, actionLoadingState, onClipCouponClicked, onUnclipCouponClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final InterfaceC14971y.a h(boolean z10) {
        return !z10 ? InterfaceC14971y.a.d.f140292a : InterfaceC14971y.a.e.f140294a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, boolean z10, boolean z11, Pk.b bVar, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        f(localThemeScope, z10, z11, bVar, function0, function02, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(boolean z10, Function0<Unit> function0, boolean z11, Function0<Unit> function02) {
        if (!z10) {
            function0.invoke();
        } else {
            if (!z10 || z11) {
                return;
            }
            function02.invoke();
        }
    }

    public static final void m(final LocalThemeScope localThemeScope, final Function0<Unit> onNotInterestedClicked, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onNotInterestedClicked, "onNotInterestedClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(516458750);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onNotInterestedClicked) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(516458750, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.NotInterestedButton (CouponDetailActionButton.kt:74)");
            }
            Modifier modifierH = J.H(Modifier.INSTANCE, null, false, 3, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = h0.k.a();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            N1.b(C16193g.c(Nr.g.f22691B, composerStartRestartGroup, 0), androidx.compose.foundation.layout.D.m(ClickableKt.c(modifierH, (h0.l) objB, null, false, null, null, onNotInterestedClicked, 28, null), 0.0f, 0.0f, 0.0f, H1.h.p(16), 7, null), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, null, null, null, 0L, F1.k.INSTANCE.d(), null, 0L, 0, false, 0, 0, null, TextStyle.c(localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), 0L, 0L, FontWeight.INSTANCE.i(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 100663296, 0, 65272);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.n(localThemeScope, onNotInterestedClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        m(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.d.StandardButton g(j1 j1Var, Pk.b bVar) {
        q1.d.StandardButton enabledButton;
        if (bVar.getIsLoading()) {
            enabledButton = j1Var.getButtons().getDisabledButton();
        } else {
            enabledButton = j1Var.getButtons().getEnabledButton();
        }
        q1.d.StandardButton standardButton = enabledButton;
        return q1.d.StandardButton.y(standardButton, false, null, null, null, null, null, null, J.h(standardButton.getModifier(), 0.0f, 1, null), false, null, 895, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(Pk.b bVar, boolean z10, Composer composer, int i10) {
        int i11;
        composer.startReplaceGroup(328288255);
        if (ComposerKt.M()) {
            ComposerKt.U(328288255, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ClipUnclipButton.getClipUnclipText (CouponDetailActionButton.kt:103)");
        }
        if (bVar.getIsLoading()) {
            if (bVar == Pk.b.f28323d) {
                i11 = Nr.g.f22692B0;
            } else {
                i11 = Nr.g.f22752q;
            }
        } else if (z10) {
            i11 = Nr.g.f22690A0;
        } else {
            i11 = Nr.g.f22742l;
        }
        String upperCase = C16193g.c(i11, composer, 0).toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.Label j(j1 j1Var, Pk.b bVar) {
        if (bVar.getIsLoading()) {
            return j1Var.getLabels().getDisabledLabel();
        }
        return j1Var.getLabels().getEnabledLabel();
    }
}
