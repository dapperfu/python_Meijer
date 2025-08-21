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
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import java.util.Map;
import ki.C15207z;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18000f;
import kotlin.InterfaceC6305e;
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
import oi.E0;
import on.G;
import p1.C16338g;
import pk.StoreDetails;
import r1.C16819m;
import sn.C17101q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u001d\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "", "toolbarTitle", "Lpk/h;", "storeDetails", "Landroidx/compose/ui/Modifier;", "modifier", "", "i", "(LKi/M;Ljava/lang/String;Lpk/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "g", "(LKi/M;Lpk/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "visible", "k", "(LKi/M;ZLandroidx/compose/runtime/Composer;I)V", "o", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lsn/q;", "a", "Lsn/q;", "viewModel", "Lsn/q$e;", "viewState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static C17101q f154804a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154806b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.G$a$a, reason: collision with other inner class name */
        static final class C2395a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154807a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f154808b;

            C2395a(LocalThemeScope localThemeScope, String str) {
                this.f154807a = localThemeScope;
                this.f154808b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1713346715, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:92)");
                }
                Dr.g.g(this.f154807a, this.f154808b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1769677477, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous> (FlyBuyImHereScreen.kt:90)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            C.f.d dVar = C.f.d.f17051e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100572N8, new Object[0]);
            LocalThemeScope localThemeScope = this.f154805a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1713346715, true, new C2395a(localThemeScope, this.f154806b), composer, 54);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, modifierH, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, 221232 | LocalThemeScope.f17314g | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 198);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, String str) {
            this.f154805a = localThemeScope;
            this.f154806b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() throws Exception {
            C17101q c17101q = G.f154804a;
            if (c17101q == null) {
                Intrinsics.x("viewModel");
                c17101q = null;
            }
            c17101q.v(C17101q.c.C2525c.f161519a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetails f154810b;

        b(LocalThemeScope localThemeScope, StoreDetails storeDetails) {
            this.f154809a = localThemeScope;
            this.f154810b = storeDetails;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) throws Exception {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1491507934, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous> (FlyBuyImHereScreen.kt:99)");
            }
            G.g(this.f154809a, this.f154810b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws Exception {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154811a;

        c(LocalThemeScope localThemeScope) {
            this.f154811a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1615787931, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState.<anonymous> (FlyBuyImHereScreen.kt:120)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f154811a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f154812f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.A a10) {
            super(1);
            this.f154812f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f154812f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f154813f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f154814g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f154815h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154816i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope) {
            super(2);
            this.f154814g = nVar;
            this.f154815h = function0;
            this.f154816i = localThemeScope;
            this.f154813f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f154814g.getHelpersHashCode();
            this.f154814g.i();
            L1.n nVar = this.f154814g;
            composer.startReplaceGroup(-523480935);
            L1.h hVarL = nVar.l();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = f.f154817a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarL, (Function1) objB);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, 0L, H1.h.p(1), 0.0f, composer, 384, 11);
            LocalThemeScope localThemeScope = this.f154816i;
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(1325127030, true, new g(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            composer.v();
            composer.P();
            if (this.f154814g.getHelpersHashCode() != helpersHashCode) {
                this.f154815h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f154817a = new f();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154818a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f154821b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f154820a = localThemeScope;
                this.f154821b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1842782505, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:393)");
                }
                LocalThemeScope localThemeScope = this.f154820a;
                q1.Label enabledLabel = this.f154821b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100617Pf, composer, 0).toUpperCase(Locale.ROOT);
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
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154819a = new a();

            a() {
            }

            public final void a() throws Exception {
                C17101q c17101q = G.f154804a;
                if (c17101q == null) {
                    Intrinsics.x("viewModel");
                    c17101q = null;
                }
                c17101q.v(C17101q.c.d.f161520a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                a();
                return Unit.f143329a;
            }
        }

        g(LocalThemeScope localThemeScope) {
            this.f154818a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1325127030, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:386)");
            }
            LocalThemeScope localThemeScope = this.f154818a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10)), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f154819a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1842782505, true, new b(this.f154818a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f154823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1<C17101q.ViewState> f154824c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154825a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f154826b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<C17101q.ViewState> f154827c;

            a(LocalThemeScope localThemeScope, j1 j1Var, z1<C17101q.ViewState> z1Var) {
                this.f154825a = localThemeScope;
                this.f154826b = j1Var;
                this.f154827c = z1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1934268443, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:158)");
                }
                si.j.h(this.f154825a, this.f154826b.getLabels().getEnabledLabel(), C13698b.a(G.r(this.f154827c).getStoreAddressDetails(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        h(LocalThemeScope localThemeScope, InterfaceC14902f interfaceC14902f, z1<C17101q.ViewState> z1Var) {
            this.f154822a = localThemeScope;
            this.f154823b = interfaceC14902f;
            this.f154824c = z1Var;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2082213368, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:152)");
            }
            LocalThemeScope localThemeScope = this.f154822a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getDestructiveButton(), false, null, null, null, null, null, null, this.f154823b.c(Modifier.INSTANCE, P0.e.INSTANCE.g()), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.h.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1934268443, true, new a(this.f154822a, Assemble, this.f154824c), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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
        public static final Unit c() throws Exception {
            C17101q c17101q = G.f154804a;
            if (c17101q == null) {
                Intrinsics.x("viewModel");
                c17101q = null;
            }
            c17101q.v(C17101q.c.e.f161521a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f154828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17101q.d f154830c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154831a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f154832b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154833c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: on.G$i$a$a, reason: collision with other inner class name */
            static final class C2396a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f154834a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f154835b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17101q.d f154836c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: on.G$i$a$a$a, reason: collision with other inner class name */
                static final class C2397a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f154837a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f154838b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17101q.d f154839c;

                    C2397a(LocalThemeScope localThemeScope, j1 j1Var, C17101q.d dVar) {
                        this.f154837a = localThemeScope;
                        this.f154838b = j1Var;
                        this.f154839c = dVar;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(657650032, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:255)");
                        }
                        si.j.h(this.f154837a, this.f154838b.getLabels().getEnabledLabel(), C16338g.c(((C17101q.d.FailEvent) this.f154839c).getPositiveBtnTxt(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                C2396a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                    this.f154834a = localThemeScope;
                    this.f154835b = interfaceC5872l0;
                    this.f154836c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                    interfaceC5872l0.setValue(Boolean.FALSE);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-894810243, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:251)");
                    }
                    LocalThemeScope localThemeScope = this.f154834a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154835b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: on.J
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.i.a.C2396a.c(interfaceC5872l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(657650032, true, new C2397a(this.f154834a, Assemble, this.f154836c), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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

            a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                this.f154831a = localThemeScope;
                this.f154832b = interfaceC5872l0;
                this.f154833c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-889786271, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:250)");
                }
                LocalThemeScope localThemeScope = this.f154831a;
                Ki.Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(-894810243, true, new C2396a(localThemeScope, this.f154832b, this.f154833c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154840a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154841b;

            b(LocalThemeScope localThemeScope, C17101q.d dVar) {
                this.f154840a = localThemeScope;
                this.f154841b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1143108158, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:238)");
                }
                si.j.h(this.f154840a, new q1.Label(null, null, null, null, 0, false, 0, this.f154840a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(((C17101q.d.FailEvent) this.f154841b).getTitle(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154843b;

            c(LocalThemeScope localThemeScope, C17101q.d dVar) {
                this.f154842a = localThemeScope;
                this.f154843b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(389083869, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:244)");
                }
                si.j.h(this.f154842a, new q1.Label(null, null, null, null, 0, false, 0, this.f154842a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(((C17101q.d.FailEvent) this.f154843b).getMessage(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        i(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, C17101q.d dVar) {
            this.f154828a = interfaceC5872l0;
            this.f154829b = localThemeScope;
            this.f154830c = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.FALSE);
            return Unit.f143329a;
        }

        public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1783418455, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:235)");
            }
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154828a;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.i.c(interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18000f.a((Function0) objB, ComposableLambdaKt.c(-889786271, true, new a(this.f154829b, this.f154828a, this.f154830c), composer, 54), null, null, ComposableLambdaKt.c(1143108158, true, new b(this.f154829b, this.f154830c), composer, 54), ComposableLambdaKt.c(389083869, true, new c(this.f154829b, this.f154830c), composer, 54), null, 0L, 0L, null, composer, 221238, 972);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            b(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f154844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17101q.d f154846c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154847a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f154848b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154849c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: on.G$j$a$a, reason: collision with other inner class name */
            static final class C2398a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f154850a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f154851b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17101q.d f154852c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: on.G$j$a$a$a, reason: collision with other inner class name */
                static final class C2399a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f154853a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f154854b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17101q.d f154855c;

                    C2399a(LocalThemeScope localThemeScope, j1 j1Var, C17101q.d dVar) {
                        this.f154853a = localThemeScope;
                        this.f154854b = j1Var;
                        this.f154855c = dVar;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1716719081, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:297)");
                        }
                        si.j.h(this.f154853a, this.f154854b.getLabels().getEnabledLabel(), C16338g.c(((C17101q.d.LocationPermissionInfoDialogEvent) this.f154855c).getPositiveButton(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                C2398a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                    this.f154850a = localThemeScope;
                    this.f154851b = interfaceC5872l0;
                    this.f154852c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                    interfaceC5872l0.setValue(Boolean.FALSE);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1017575652, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:293)");
                    }
                    LocalThemeScope localThemeScope = this.f154850a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154851b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: on.L
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.j.a.C2398a.c(interfaceC5872l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1716719081, true, new C2399a(this.f154850a, Assemble, this.f154852c), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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

            a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                this.f154847a = localThemeScope;
                this.f154848b = interfaceC5872l0;
                this.f154849c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1550645448, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:292)");
                }
                LocalThemeScope localThemeScope = this.f154847a;
                Ki.Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(1017575652, true, new C2398a(localThemeScope, this.f154848b, this.f154849c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154856a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f154857b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154858c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f154859a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f154860b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17101q.d f154861c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: on.G$j$b$a$a, reason: collision with other inner class name */
                static final class C2400a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f154862a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f154863b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17101q.d f154864c;

                    C2400a(LocalThemeScope localThemeScope, j1 j1Var, C17101q.d dVar) {
                        this.f154862a = localThemeScope;
                        this.f154863b = j1Var;
                        this.f154864c = dVar;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(747543509, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:312)");
                        }
                        si.j.h(this.f154862a, this.f154863b.getLabels().getEnabledLabel(), C16338g.c(((C17101q.d.LocationPermissionInfoDialogEvent) this.f154864c).getNegativeButton(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                    this.f154859a = localThemeScope;
                    this.f154860b = interfaceC5872l0;
                    this.f154861c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                    interfaceC5872l0.setValue(Boolean.FALSE);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-813129054, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:306)");
                    }
                    LocalThemeScope localThemeScope = this.f154859a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154860b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: on.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.j.b.a.c(interfaceC5872l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(747543509, true, new C2400a(this.f154859a, Assemble, this.f154861c), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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

            b(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, C17101q.d dVar) {
                this.f154856a = localThemeScope;
                this.f154857b = interfaceC5872l0;
                this.f154858c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-280059258, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:305)");
                }
                LocalThemeScope localThemeScope = this.f154856a;
                Ki.Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(-813129054, true, new a(localThemeScope, this.f154857b, this.f154858c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154865a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154866b;

            c(LocalThemeScope localThemeScope, C17101q.d dVar) {
                this.f154865a = localThemeScope;
                this.f154866b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(952072037, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:280)");
                }
                si.j.h(this.f154865a, new q1.Label(null, null, null, null, 0, false, 0, this.f154865a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(((C17101q.d.LocationPermissionInfoDialogEvent) this.f154866b).getTitle(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154867a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17101q.d f154868b;

            d(LocalThemeScope localThemeScope, C17101q.d dVar) {
                this.f154867a = localThemeScope;
                this.f154868b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2110763964, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:286)");
                }
                si.j.h(this.f154867a, new q1.Label(null, null, null, null, 0, false, 0, this.f154867a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(((C17101q.d.LocationPermissionInfoDialogEvent) this.f154868b).getMessage(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        j(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, C17101q.d dVar) {
            this.f154844a = interfaceC5872l0;
            this.f154845b = localThemeScope;
            this.f154846c = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.FALSE);
            return Unit.f143329a;
        }

        public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1763575824, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:277)");
            }
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154844a;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.j.c(interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18000f.a((Function0) objB, ComposableLambdaKt.c(1550645448, true, new a(this.f154845b, this.f154844a, this.f154846c), composer, 54), null, ComposableLambdaKt.c(-280059258, true, new b(this.f154845b, this.f154844a, this.f154846c), composer, 54), ComposableLambdaKt.c(952072037, true, new c(this.f154845b, this.f154846c), composer, 54), ComposableLambdaKt.c(-2110763964, true, new d(this.f154845b, this.f154846c), composer, 54), null, 0L, 0L, null, composer, 224310, 964);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            b(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        g(localThemeScope, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r33, final java.lang.String r34, final pk.StoreDetails r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.G.i(Ki.M, java.lang.String, pk.h, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, String str, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, str, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        k(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(final Ki.LocalThemeScope r51, final pk.StoreDetails r52, androidx.compose.ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.G.o(Ki.M, pk.h, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Map it) throws Exception {
        Intrinsics.j(it, "it");
        C17101q c17101q = f154804a;
        if (c17101q == null) {
            Intrinsics.x("viewModel");
            c17101q = null;
        }
        c17101q.v(C17101q.c.b.f161518a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        o(localThemeScope, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final LocalThemeScope localThemeScope, final StoreDetails storeDetails, Modifier modifier, Composer composer, final int i10, final int i11) throws Exception {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1536676919);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(storeDetails)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1536676919, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereMainContent (FlyBuyImHereScreen.kt:108)");
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
            int i17 = LocalThemeScope.f17314g;
            int i18 = i12 & 14;
            o(localThemeScope, storeDetails, null, composerStartRestartGroup, i17 | i18 | (i12 & 112), 2);
            m(localThemeScope, null, composerStartRestartGroup, i17 | i18, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.h(localThemeScope, storeDetails, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void k(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-517395739);
        if ((i10 & 6) == 0) {
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
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-517395739, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState (FlyBuyImHereScreen.kt:117)");
            }
            if (z10) {
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(1615787931, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.l(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void m(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(622061061);
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
            composer2 = composerStartRestartGroup;
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(622061061, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent (FlyBuyImHereScreen.kt:378)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new e(nVar, 0, pairH.b(), localThemeScope)), pairH.a(), composerStartRestartGroup, 48, 0);
            composer2 = composerStartRestartGroup;
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.n(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17101q.ViewState r(z1<C17101q.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
