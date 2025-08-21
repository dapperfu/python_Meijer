package on;

import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.x;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import d0.C13575i;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.C15133B;
import ki.C15134C;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18045v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import on.C16245x;
import p1.C16338g;
import sn.C17096l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000b\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "", "toolbarTitle", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onUpPressed", "g", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "k", "i", "Lsn/l;", "a", "Lsn/l;", "viewModel", "Lsn/l$e;", "viewState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: on.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16245x {

    /* renamed from: a, reason: collision with root package name */
    private static C17096l f155047a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: on.x$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155049b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155050c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.x$a$a, reason: collision with other inner class name */
        static final class C2404a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f155052b;

            C2404a(LocalThemeScope localThemeScope, String str) {
                this.f155051a = localThemeScope;
                this.f155052b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1267784308, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:73)");
                }
                Dr.g.g(this.f155051a, this.f155052b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f155048a = localThemeScope;
            this.f155049b = function0;
            this.f155050c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(557106996, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous> (FlyBuyConfirmationScreen.kt:71)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            C.f.d dVar = C.f.d.f17051e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100572N8, new Object[0]);
            LocalThemeScope localThemeScope = this.f155048a;
            Dr.g.f(localThemeScope, modifierH, null, null, ComposableLambdaKt.c(1267784308, true, new C2404a(localThemeScope, this.f155050c), composer, 54), this.f155049b, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24624 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 198);
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
    /* renamed from: on.x$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155053a;

        b(LocalThemeScope localThemeScope) {
            this.f155053a = localThemeScope;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(730496795, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous> (FlyBuyConfirmationScreen.kt:80)");
            }
            C16245x.e(this.f155053a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: on.x$c */
    public static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f155054f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.A a10) {
            super(1);
            this.f155054f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f155054f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: on.x$d */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155055f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155056g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155057h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f155058i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155059j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, Modifier modifier, LocalThemeScope localThemeScope) {
            super(2);
            this.f155056g = nVar;
            this.f155057h = function0;
            this.f155058i = modifier;
            this.f155059j = localThemeScope;
            this.f155055f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155056g.getHelpersHashCode();
            this.f155056g.i();
            L1.n nVar = this.f155056g;
            composer.startReplaceGroup(1859841411);
            L1.h hVarL = nVar.l();
            Modifier modifier = this.f155058i;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = e.f155060a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifier, hVarL, (Function1) objB);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, this.f155059j.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
            LocalThemeScope localThemeScope = this.f155059j;
            C15133B c15133b = C15133B.f141857a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-426531243, true, new f(localThemeScope), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            Ki.Q.e(localThemeScope, c15133b, composableLambdaC, composer, i11 | 384 | (C15133B.f141858b << 3));
            LocalThemeScope localThemeScope2 = this.f155059j;
            Ki.Q.e(localThemeScope2, C15134C.f141860a, ComposableLambdaKt.c(1366362430, true, new g(localThemeScope2), composer, 54), composer, i11 | 384 | (C15134C.f141861b << 3));
            composer.v();
            composer.P();
            if (this.f155056g.getHelpersHashCode() != helpersHashCode) {
                this.f155057h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: on.x$e */
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f155060a = new e();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: on.x$f */
    static final class f implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155061a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.x$f$b */
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f155064b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f155063a = localThemeScope;
                this.f155064b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2014994488, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:191)");
                }
                LocalThemeScope localThemeScope = this.f155063a;
                q1.Label enabledLabel = this.f155064b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f101192t2, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        /* renamed from: on.x$f$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f155062a = new a();

            a() {
            }

            public final void a() {
                C17096l c17096l = C16245x.f155047a;
                if (c17096l == null) {
                    Intrinsics.x("viewModel");
                    c17096l = null;
                }
                c17096l.q(C17096l.d.a.f161427a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        f(LocalThemeScope localThemeScope) {
            this.f155061a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-426531243, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:183)");
            }
            LocalThemeScope localThemeScope = this.f155061a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f155062a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-2014994488, true, new b(this.f155061a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: on.x$g */
    static final class g implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155065a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.x$g$b */
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155067a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f155068b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f155067a = localThemeScope;
                this.f155068b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-433425935, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:210)");
                }
                LocalThemeScope localThemeScope = this.f155067a;
                q1.Label labelY = q1.Label.y(this.f155068b.getLabels().getEnabledLabel(), null, this.f155067a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, null, null, 509, null);
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f101132q2, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        /* renamed from: on.x$g$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f155066a = new a();

            a() {
            }

            public final void a() {
                C17096l c17096l = C16245x.f155047a;
                if (c17096l == null) {
                    Intrinsics.x("viewModel");
                    c17096l = null;
                }
                c17096l.q(C17096l.d.b.f161428a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        g(LocalThemeScope localThemeScope) {
            this.f155065a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1366362430, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:199)");
            }
            LocalThemeScope localThemeScope = this.f155065a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null);
            C18045v c18045v = C18045v.f169801a;
            long color = this.f155065a.getAdsColors().getAdsColorHoverInverse().getColor();
            int i11 = C18045v.f169812l;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, c18045v.b(H1.h.p(2), 0.0f, 0.0f, 0.0f, 0.0f, composer, (i11 << 15) | 6, 30), null, C13575i.a(H1.h.p(0), this.f155065a.getAdsColors().getAdsColorHoverInverse().getColor()), c18045v.a(color, 0L, 0L, 0L, composer, i11 << 12, 14), null, modifierM, false, null, 843, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f155066a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-433425935, true, new b(this.f155065a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3456);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: on.x$h */
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155069a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.x$h$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155070a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f155071b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f155070a = localThemeScope;
                this.f155071b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1203402713, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:143)");
                }
                si.j.h(this.f155070a, this.f155071b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f101172s2, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        h(LocalThemeScope localThemeScope) {
            this.f155069a = localThemeScope;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-639155852, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:141)");
            }
            LocalThemeScope localThemeScope = this.f155069a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16245x.h.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1203402713, true, new a(this.f155069a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            C17096l c17096l = C16245x.f155047a;
            if (c17096l == null) {
                Intrinsics.x("viewModel");
                c17096l = null;
            }
            c17096l.q(C17096l.d.c.f161429a);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r33, final java.lang.String r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.C16245x.g(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void i(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.C16245x.i(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void k(Ki.LocalThemeScope r47, androidx.compose.ui.Modifier r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.C16245x.k(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1103525782);
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
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1103525782, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationMainContent (FlyBuyConfirmationScreen.kt:86)");
            }
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            int i16 = LocalThemeScope.f17314g;
            int i17 = i12 & 14;
            k(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            i(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16245x.f(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final C17096l.ViewState l(z1<C17096l.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
