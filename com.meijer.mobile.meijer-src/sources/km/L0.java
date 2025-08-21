package km;

import Il.FulfillmentBarDecorator;
import Ki.C;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import Xl.a;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.C15183n;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import km.L0;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import ys.C18372b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u001a[\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0015\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0018\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "greeting", "", "cartItemCount", "LIl/a;", "fulfillmentMode", "Lbk/a;", "navigationContentDescription", "LKk/a;", "appVersion", "Lkotlin/Function1;", "LXl/a;", "", "onNavigationRequest", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ILIl/a;Lbk/a;LKk/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "o", "(LKi/M;Landroidx/compose/ui/Modifier;LKk/a;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lbk/a;Landroidx/compose/runtime/Composer;II)V", "placeholder", "g", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "navContentDescription", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class L0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Xl.a, Unit> f142733b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.L0$a$a, reason: collision with other inner class name */
        static final class C2259a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142734a;

            C2259a(LocalThemeScope localThemeScope) {
                this.f142734a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-230154490, i10, -1, "com.meijer.mobile.home.ux.views.ClickableSearchField.<anonymous>.<anonymous>.<anonymous> (HomeScreenTopBar.kt:272)");
                }
                C18054z0.a(C16335d.c(C.b.h.C0301b.f17006e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C16338g.c(C18372b.f172061l, composer, 0), null, this.f142734a.getAdsColors().getAdsColorUIBackground02().getColor(), composer, 0, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1) {
            this.f142732a = localThemeScope;
            this.f142733b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.f.f42327a);
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1982047187, i10, -1, "com.meijer.mobile.home.ux.views.ClickableSearchField.<anonymous>.<anonymous> (HomeScreenTopBar.kt:271)");
            }
            LocalThemeScope localThemeScope = this.f142732a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f142733b);
            final Function1<Xl.a, Unit> function1 = this.f142733b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: km.K0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return L0.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-230154490, true, new C2259a(this.f142732a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f142736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Xl.a, Unit> f142737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142738d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f142739e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AppVersion f142740f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f142741g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FulfillmentBarDecorator f142742h;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super Xl.a, Unit> function1, String str, AbstractC6392a abstractC6392a, AppVersion appVersion, int i10, FulfillmentBarDecorator fulfillmentBarDecorator) {
            this.f142735a = localThemeScope;
            this.f142736b = modifier;
            this.f142737c = function1;
            this.f142738d = str;
            this.f142739e = abstractC6392a;
            this.f142740f = appVersion;
            this.f142741g = i10;
            this.f142742h = fulfillmentBarDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.e.f42326a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(281987535, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenTopBar.<anonymous> (HomeScreenTopBar.kt:81)");
            }
            LocalThemeScope localThemeScope = this.f142735a;
            Modifier modifier = this.f142736b;
            final Function1<Xl.a, Unit> function1 = this.f142737c;
            String str = this.f142738d;
            AbstractC6392a abstractC6392a = this.f142739e;
            AppVersion appVersion = this.f142740f;
            int i11 = this.f142741g;
            FulfillmentBarDecorator fulfillmentBarDecorator = this.f142742h;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            int i12 = LocalThemeScope.f17314g;
            L0.l(localThemeScope, modifier, function1, str, abstractC6392a, composer, (AbstractC6392a.f60445b << 12) | i12, 0);
            L0.o(localThemeScope, null, appVersion, i11, function1, composer, i12, 1);
            FulfillmentBarDecorator fulfillmentBarDecorator2 = fulfillmentBarDecorator == null ? new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, null, 1023, null) : fulfillmentBarDecorator;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: km.M0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return L0.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Il.g.b(localThemeScope, fulfillmentBarDecorator2, null, (Function0) objB, composer, (FulfillmentBarDecorator.f14849m << 3) | i12, 2);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Xl.a, Unit> f142744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142745c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Xl.a, Unit> f142747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f142748c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: km.L0$c$a$a, reason: collision with other inner class name */
            static final class C2260a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f142749a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f142750b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f142751c;

                C2260a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                    this.f142749a = localThemeScope;
                    this.f142750b = j1Var;
                    this.f142751c = str;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(772555140, i10, -1, "com.meijer.mobile.home.ux.views.PrimaryHomeTopBar.<anonymous>.<anonymous>.<anonymous> (HomeScreenTopBar.kt:160)");
                    }
                    si.j.h(this.f142749a, q1.Label.y(this.f142750b.getLabels().getEnabledLabel(), null, this.f142749a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f142749a.getAdsTypography().getHeadings().getSix(), null, 381, null), this.f142751c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(4)), composer, 6);
                    C18054z0.a(C16335d.c(C.b.a.C0288a.f16915e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C16338g.c(ps.j0.f157333j, composer, 0), null, this.f142749a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1, String str) {
                this.f142746a = localThemeScope;
                this.f142747b = function1;
                this.f142748c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(a.C0901a.f42322a);
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(494069655, i10, -1, "com.meijer.mobile.home.ux.views.PrimaryHomeTopBar.<anonymous>.<anonymous> (HomeScreenTopBar.kt:156)");
                }
                LocalThemeScope localThemeScope = this.f142746a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f142747b);
                final Function1<Xl.a, Unit> function1 = this.f142747b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.N0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return L0.c.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(772555140, true, new C2260a(this.f142746a, Assemble, this.f142748c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1, String str) {
            this.f142743a = localThemeScope;
            this.f142744b = function1;
            this.f142745c = str;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(74669363, i10, -1, "com.meijer.mobile.home.ux.views.PrimaryHomeTopBar.<anonymous> (HomeScreenTopBar.kt:155)");
            }
            LocalThemeScope localThemeScope = this.f142743a;
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(494069655, true, new a(localThemeScope, this.f142744b, this.f142745c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.c.f142546b << 3));
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
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Xl.a, Unit> f142753b;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1) {
            this.f142752a = localThemeScope;
            this.f142753b = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1255409623, i10, -1, "com.meijer.mobile.home.ux.views.SecondaryHomeTopBar.<anonymous> (HomeScreenTopBar.kt:113)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            L0.g(this.f142752a, C16338g.c(C18372b.f172052c, composer, 0), modifierH, this.f142753b, composer, LocalThemeScope.f17314g | 384, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppVersion f142754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142755b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Xl.a, Unit> f142756c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f142757d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142758a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Xl.a, Unit> f142759b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: km.L0$e$a$a, reason: collision with other inner class name */
            static final class C2261a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f142760a;

                C2261a(LocalThemeScope localThemeScope) {
                    this.f142760a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-344117585, i10, -1, "com.meijer.mobile.home.ux.views.SecondaryHomeTopBar.<anonymous>.<anonymous>.<anonymous> (HomeScreenTopBar.kt:130)");
                    }
                    C18054z0.a(C16335d.c(C.j.s.f17138d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C16338g.c(com.meijer.mobile.home.ux.r0.f99349h, composer, 0), null, this.f142760a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1) {
                this.f142758a = localThemeScope;
                this.f142759b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(a.h.f42329a);
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-32334078, i10, -1, "com.meijer.mobile.home.ux.views.SecondaryHomeTopBar.<anonymous>.<anonymous> (HomeScreenTopBar.kt:126)");
                }
                LocalThemeScope localThemeScope = this.f142758a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f142759b);
                final Function1<Xl.a, Unit> function1 = this.f142759b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.Q0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return L0.e.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-344117585, true, new C2261a(this.f142758a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(AppVersion appVersion, LocalThemeScope localThemeScope, Function1<? super Xl.a, Unit> function1, int i10) {
            this.f142754a = appVersion;
            this.f142755b = localThemeScope;
            this.f142756c = function1;
            this.f142757d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(a.c.f42324a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(a.i.f42330a);
            return Unit.f143329a;
        }

        public final void c(InterfaceC14888I TopAppBar, Composer composer, int i10) {
            Intrinsics.j(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1972533662, i10, -1, "com.meijer.mobile.home.ux.views.SecondaryHomeTopBar.<anonymous> (HomeScreenTopBar.kt:120)");
            }
            composer.startReplaceGroup(1524272265);
            if (this.f142754a.getIsDevMode()) {
                LocalThemeScope localThemeScope = this.f142755b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f142756c);
                final Function1<Xl.a, Unit> function1 = this.f142756c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.O0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return L0.e.d(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.s.m(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f142755b;
            C15183n c15183n = C15183n.f142165a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-32334078, true, new a(localThemeScope2, this.f142756c), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            Ki.Q.e(localThemeScope2, c15183n, composableLambdaC, composer, i11 | 384 | (C15183n.f142166b << 3));
            LocalThemeScope localThemeScope3 = this.f142755b;
            Integer numValueOf = Integer.valueOf(this.f142757d);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f142756c);
            final Function1<Xl.a, Unit> function12 = this.f142756c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: km.P0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return L0.e.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Dr.s.k(localThemeScope3, numValueOf, null, (Function0) objB2, composer, i11, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            c(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r36, final java.lang.String r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function1<? super Xl.a, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.L0.g(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1) {
        function1.invoke(a.g.f42328a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final java.lang.String r24, final int r25, final Il.FulfillmentBarDecorator r26, final bk.AbstractC6392a r27, final Kk.AppVersion r28, final kotlin.jvm.functions.Function1<? super Xl.a, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.L0.j(Ki.M, androidx.compose.ui.Modifier, java.lang.String, int, Il.a, bk.a, Kk.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, FulfillmentBarDecorator fulfillmentBarDecorator, AbstractC6392a abstractC6392a, AppVersion appVersion, Function1 function1, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, modifier, str, i10, fulfillmentBarDecorator, abstractC6392a, appVersion, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function1<? super Xl.a, kotlin.Unit> r18, final java.lang.String r19, final bk.AbstractC6392a r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.L0.l(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, java.lang.String, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(a.d.f42325a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, String str, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function1, str, abstractC6392a, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final Kk.AppVersion r21, final int r22, final kotlin.jvm.functions.Function1<? super Xl.a, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.L0.o(Ki.M, androidx.compose.ui.Modifier, Kk.a, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, AppVersion appVersion, int i10, Function1 function1, int i11, int i12, Composer composer, int i13) {
        o(localThemeScope, modifier, appVersion, i10, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
