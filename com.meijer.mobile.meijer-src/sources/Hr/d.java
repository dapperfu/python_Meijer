package Hr;

import H1.h;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import ki.C15144M;
import ki.q1;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import qi.C16671b;
import si.j;
import yr.Q;
import zi.EnumC18490a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKi/M;", "LHr/a;", "couponCountDownStateDecorator", "Lkotlin/Function0;", "", "clippableCouponAction", "c", "(LKi/M;LHr/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lbk/a;", "tagText", "Lki/q1$r;", "template", "e", "(LKi/M;Lbk/a;Lki/q1$r;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<C15144M, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClippableCouponDecorator f13981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f13983c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Hr.d$a$a, reason: collision with other inner class name */
        static final class C0219a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f13984a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15144M f13985b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClippableCouponDecorator f13986c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Hr.d$a$a$a, reason: collision with other inner class name */
            static final class C0220a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f13987a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C15144M f13988b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f13989c;

                C0220a(LocalThemeScope localThemeScope, C15144M c15144m, ClippableCouponDecorator clippableCouponDecorator) {
                    this.f13987a = localThemeScope;
                    this.f13988b = c15144m;
                    this.f13989c = clippableCouponDecorator;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(836429534, i10, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClippableCoupon.kt:57)");
                    }
                    LocalThemeScope localThemeScope = this.f13987a;
                    q1.h.DrawableIcon unclipped = this.f13988b.y().getUnclipped();
                    int i11 = LocalThemeScope.f17314g;
                    C16671b.b(localThemeScope, unclipped, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                    C14890K.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, h.p(8), 0.0f, 11, null), composer, 6);
                    j.h(this.f13987a, this.f13988b.z().getButtonLabel(), C13698b.a(this.f13989c.b().getValue(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

            C0219a(LocalThemeScope localThemeScope, C15144M c15144m, ClippableCouponDecorator clippableCouponDecorator) {
                this.f13984a = localThemeScope;
                this.f13985b = c15144m;
                this.f13986c = clippableCouponDecorator;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-261013418, i10, -1, "com.meijer.mobile.ui.common.coupon.ClippableCoupon.<anonymous>.<anonymous>.<anonymous> (ClippableCoupon.kt:55)");
                }
                LocalThemeScope localThemeScope = this.f13984a;
                C15144M c15144m = this.f13985b;
                ClippableCouponDecorator clippableCouponDecorator = this.f13986c;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(836429534, true, new C0220a(localThemeScope, c15144m, clippableCouponDecorator), composer, 54), composer, 384, 3);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC18490a.values().length];
                try {
                    iArr[EnumC18490a.f172800d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC18490a.f172797a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC18490a.f172799c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC18490a.f172798b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC18490a.f172801e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC18490a.f172802f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        a(ClippableCouponDecorator clippableCouponDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f13981a = clippableCouponDecorator;
            this.f13982b = localThemeScope;
            this.f13983c = function0;
        }

        public final void a(C15144M Assemble, Composer composer, int i10) {
            InterfaceC5872l0<EnumC18490a> interfaceC5872l0A;
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
            ClippableCouponDecorator clippableCouponDecorator = this.f13981a;
            EnumC18490a value = (clippableCouponDecorator == null || (interfaceC5872l0A = clippableCouponDecorator.a()) == null) ? null : interfaceC5872l0A.getValue();
            switch (value != null ? b.$EnumSwitchMapping$0[value.ordinal()] : -1) {
                case -1:
                case 6:
                    composer.startReplaceGroup(1607183130);
                    d.e(this.f13982b, AbstractC6392a.INSTANCE.d(Q.f171758Z, new Object[0]), Assemble.A().getError(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3) | (q1.Tag.f142423e << 6));
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
                    C5800d.f fVarE = C5800d.f48779a.e();
                    LocalThemeScope localThemeScope = this.f13982b;
                    Function0<Unit> function0 = this.f13983c;
                    ClippableCouponDecorator clippableCouponDecorator2 = this.f13981a;
                    MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
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
                    D1.c(composerA, measurePolicyB, companion.e());
                    D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C14889J c14889j = C14889J.f139620a;
                    E0.b(localThemeScope, Assemble.x().getUnclipped(), function0, ComposableLambdaKt.c(-261013418, true, new C0219a(localThemeScope, Assemble, clippableCouponDecorator2), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.ClippableCouponButton.f142206l << 3));
                    composer.v();
                    composer.P();
                    break;
                case 2:
                    composer.startReplaceGroup(1606628664);
                    d.e(this.f13982b, AbstractC6392a.INSTANCE.d(Q.f171778l, new Object[0]), Assemble.A().getLoading(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3) | (q1.Tag.f142423e << 6));
                    composer.P();
                    break;
                case 3:
                    composer.startReplaceGroup(1606758771);
                    d.e(this.f13982b, this.f13981a.b().getValue(), Assemble.A().getClipped(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3) | (q1.Tag.f142423e << 6));
                    composer.P();
                    break;
                case 4:
                    composer.startReplaceGroup(1606895729);
                    d.e(this.f13982b, this.f13981a.b().getValue(), Assemble.A().getIncentive(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3) | (q1.Tag.f142423e << 6));
                    composer.P();
                    break;
                case 5:
                    composer.startReplaceGroup(1607032563);
                    d.e(this.f13982b, this.f13981a.b().getValue(), Assemble.A().getSuccess(), composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3) | (q1.Tag.f142423e << 6));
                    composer.P();
                    break;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C15144M c15144m, Composer composer, Integer num) {
            a(c15144m, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<C15144M, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Tag f13991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f13992c;

        b(LocalThemeScope localThemeScope, q1.Tag tag, AbstractC6392a abstractC6392a) {
            this.f13990a = localThemeScope;
            this.f13991b = tag;
            this.f13992c = abstractC6392a;
        }

        public final void a(C15144M Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1030207215, i10, -1, "com.meijer.mobile.ui.common.coupon.CouponTag.<anonymous> (ClippableCoupon.kt:94)");
            }
            Modifier modifierH = J.h(D.k(Modifier.INSTANCE, 0.0f, h.p(4), 1, null), 0.0f, 1, null);
            C5800d.f fVarE = C5800d.f48779a.e();
            LocalThemeScope localThemeScope = this.f13990a;
            q1.Tag tag = this.f13991b;
            AbstractC6392a abstractC6392a = this.f13992c;
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            Ii.h.h(localThemeScope, tag, C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Tag.f142423e << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C15144M c15144m, Composer composer, Integer num) {
            a(c15144m, composer, num.intValue());
            return Unit.f143329a;
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
            Ki.Q.d(localThemeScope, C15144M.f141932a, ComposableLambdaKt.c(-604450753, true, new a(clippableCouponDecorator, localThemeScope, clippableCouponAction), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15144M.f141941j << 3));
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, q1.Tag tag, int i10, Composer composer, int i11) {
        e(localThemeScope, abstractC6392a, tag, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, final q1.Tag tag, Composer composer, final int i10) {
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
                zD2 = composerStartRestartGroup.V(abstractC6392a);
            } else {
                zD2 = composerStartRestartGroup.D(abstractC6392a);
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
            Ki.Q.d(localThemeScope, C15144M.f141932a, ComposableLambdaKt.c(1030207215, true, new b(localThemeScope, tag, abstractC6392a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15144M.f141941j << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Hr.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(localThemeScope, abstractC6392a, tag, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
