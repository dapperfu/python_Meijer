package Hr;

import H1.h;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14800I;
import ji.C14910M;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import pi.C16307b;
import ri.j;
import yi.EnumC18214a;
import yr.Q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJi/M;", "LHr/a;", "couponCountDownStateDecorator", "Lkotlin/Function0;", "", "clippableCouponAction", "c", "(LJi/M;LHr/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lak/a;", "tagText", "Lji/q1$r;", "template", "e", "(LJi/M;Lak/a;Lji/q1$r;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<C14910M, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClippableCouponDecorator f13171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f13173c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Hr.d$a$a, reason: collision with other inner class name */
        static final class C0206a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f13174a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14910M f13175b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClippableCouponDecorator f13176c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Hr.d$a$a$a, reason: collision with other inner class name */
            static final class C0207a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f13177a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14910M f13178b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f13179c;

                C0207a(LocalThemeScope localThemeScope, C14910M c14910m, ClippableCouponDecorator clippableCouponDecorator) {
                    this.f13177a = localThemeScope;
                    this.f13178b = c14910m;
                    this.f13179c = clippableCouponDecorator;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(836429534, i10, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClippableCoupon.kt:57)");
                    }
                    LocalThemeScope localThemeScope = this.f13177a;
                    q1.h.DrawableIcon unclipped = this.f13178b.y().getUnclipped();
                    int i11 = LocalThemeScope.f15770g;
                    C16307b.b(localThemeScope, unclipped, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                    C14802K.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, h.p(8), 0.0f, 11, null), composer, 6);
                    j.h(this.f13177a, this.f13178b.z().getButtonLabel(), C6408b.a(this.f13179c.b().getValue(), composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

            C0206a(LocalThemeScope localThemeScope, C14910M c14910m, ClippableCouponDecorator clippableCouponDecorator) {
                this.f13174a = localThemeScope;
                this.f13175b = c14910m;
                this.f13176c = clippableCouponDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-261013418, i10, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon.<anonymous>.<anonymous>.<anonymous> (ClippableCoupon.kt:55)");
                }
                LocalThemeScope localThemeScope = this.f13174a;
                C14910M c14910m = this.f13175b;
                ClippableCouponDecorator clippableCouponDecorator = this.f13176c;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                g.e(null, 0.0f, ComposableLambdaKt.c(836429534, true, new C0207a(localThemeScope, c14910m, clippableCouponDecorator), composer, 54), composer, 384, 3);
                composer.v();
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC18214a.values().length];
                try {
                    iArr[EnumC18214a.f170500d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC18214a.f170497a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC18214a.f170499c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC18214a.f170498b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC18214a.f170501e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC18214a.f170502f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        a(ClippableCouponDecorator clippableCouponDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f13171a = clippableCouponDecorator;
            this.f13172b = localThemeScope;
            this.f13173c = function0;
        }

        public final void a(C14910M Assemble, Composer composer, int i10) {
            InterfaceC5730l0<EnumC18214a> interfaceC5730l0A;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-604450753, i10, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon.<anonymous> (ClippableCoupon.kt:43)");
            }
            ClippableCouponDecorator clippableCouponDecorator = this.f13171a;
            EnumC18214a value = (clippableCouponDecorator == null || (interfaceC5730l0A = clippableCouponDecorator.a()) == null) ? null : interfaceC5730l0A.getValue();
            switch (value != null ? b.$EnumSwitchMapping$0[value.ordinal()] : -1) {
                case -1:
                case 6:
                    composer.startReplaceGroup(1607183130);
                    d.e(this.f13172b, AbstractC5607a.INSTANCE.d(Q.f170983Z, new Object[0]), Assemble.A().getError(), composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3) | (q1.Tag.f140168e << 6));
                    composer.P();
                    break;
                case 0:
                default:
                    composer.startReplaceGroup(-1056586544);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                case 1:
                    composer.startReplaceGroup(1605623241);
                    float f10 = 4;
                    Modifier modifierH = J.h(D.j(Modifier.INSTANCE, h.p(f10), h.p(f10)), 0.0f, 1, null);
                    C5658d.f fVarE = C5658d.f48555a.e();
                    LocalThemeScope localThemeScope = this.f13172b;
                    Function0<Unit> function0 = this.f13173c;
                    ClippableCouponDecorator clippableCouponDecorator2 = this.f13171a;
                    MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
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
                    D1.c(composerA, measurePolicyB, companion.e());
                    D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C14801J c14801j = C14801J.f139030a;
                    E0.b(localThemeScope, Assemble.x().getUnclipped(), function0, ComposableLambdaKt.c(-261013418, true, new C0206a(localThemeScope, Assemble, clippableCouponDecorator2), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.ClippableCouponButton.f139951l << 3));
                    composer.v();
                    composer.P();
                    break;
                case 2:
                    composer.startReplaceGroup(1606628664);
                    d.e(this.f13172b, AbstractC5607a.INSTANCE.d(Q.f171003l, new Object[0]), Assemble.A().getLoading(), composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3) | (q1.Tag.f140168e << 6));
                    composer.P();
                    break;
                case 3:
                    composer.startReplaceGroup(1606758771);
                    d.e(this.f13172b, this.f13171a.b().getValue(), Assemble.A().getClipped(), composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3) | (q1.Tag.f140168e << 6));
                    composer.P();
                    break;
                case 4:
                    composer.startReplaceGroup(1606895729);
                    d.e(this.f13172b, this.f13171a.b().getValue(), Assemble.A().getIncentive(), composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3) | (q1.Tag.f140168e << 6));
                    composer.P();
                    break;
                case 5:
                    composer.startReplaceGroup(1607032563);
                    d.e(this.f13172b, this.f13171a.b().getValue(), Assemble.A().getSuccess(), composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3) | (q1.Tag.f140168e << 6));
                    composer.P();
                    break;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C14910M c14910m, Composer composer, Integer num) {
            a(c14910m, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<C14910M, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Tag f13181b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f13182c;

        b(LocalThemeScope localThemeScope, q1.Tag tag, AbstractC5607a abstractC5607a) {
            this.f13180a = localThemeScope;
            this.f13181b = tag;
            this.f13182c = abstractC5607a;
        }

        public final void a(C14910M Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1030207215, i10, -1, "com.meijer.mobile.ui.common.coupon.CouponTag.<anonymous> (ClippableCoupon.kt:94)");
            }
            Modifier modifierH = J.h(D.k(Modifier.INSTANCE, 0.0f, h.p(4), 1, null), 0.0f, 1, null);
            C5658d.f fVarE = C5658d.f48555a.e();
            LocalThemeScope localThemeScope = this.f13180a;
            q1.Tag tag = this.f13181b;
            AbstractC5607a abstractC5607a = this.f13182c;
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            Hi.h.h(localThemeScope, tag, C6408b.a(abstractC5607a, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C14910M c14910m, Composer composer, Integer num) {
            a(c14910m, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void c(final LocalThemeScope localThemeScope, final ClippableCouponDecorator clippableCouponDecorator, final Function0<Unit> clippableCouponAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(clippableCouponAction, "clippableCouponAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(397420753);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(clippableCouponDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(clippableCouponAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(397420753, i11, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon (ClippableCoupon.kt:41)");
            }
            Ji.Q.d(localThemeScope, C14910M.f139677a, ComposableLambdaKt.c(-604450753, true, new a(clippableCouponDecorator, localThemeScope, clippableCouponAction), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (C14910M.f139686j << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Hr.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.d(localThemeScope, clippableCouponDecorator, clippableCouponAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, ClippableCouponDecorator clippableCouponDecorator, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, clippableCouponDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, q1.Tag tag, int i10, Composer composer, int i11) {
        e(localThemeScope, abstractC5607a, tag, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final LocalThemeScope localThemeScope, final AbstractC5607a abstractC5607a, final q1.Tag tag, Composer composer, final int i10) {
        int i11;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        boolean zD3;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970661149);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD3 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD3 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD3) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD2 = composerStartRestartGroup.V(abstractC5607a);
            } else {
                zD2 = composerStartRestartGroup.D(abstractC5607a);
            }
            if (zD2) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                zD = composerStartRestartGroup.V(tag);
            } else {
                zD = composerStartRestartGroup.D(tag);
            }
            if (zD) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1970661149, i11, -1, "com.meijer.mobile.ui.common.coupon.CouponTag (ClippableCoupon.kt:92)");
            }
            Ji.Q.d(localThemeScope, C14910M.f139677a, ComposableLambdaKt.c(1030207215, true, new b(localThemeScope, tag, abstractC5607a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (C14910M.f139686j << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Hr.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(localThemeScope, abstractC5607a, tag, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
