package Dr;

import Dr.j;
import Ji.C;
import Ji.LocalThemeScope;
import Ji.Q;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.C14949n;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16190d;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f7269a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f7270b = ComposableLambdaKt.composableLambdaInstance(548102476, false, c.f7286a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f7271c = ComposableLambdaKt.composableLambdaInstance(-970552257, false, b.f7285a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f7272d = ComposableLambdaKt.composableLambdaInstance(-349328395, false, a.f7273a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7273a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dr.j$a$a, reason: collision with other inner class name */
        static final class C0114a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f7274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f7275b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f7276c;

            C0114a(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02) {
                this.f7274a = localThemeScope;
                this.f7275b = interfaceC5730l0;
                this.f7276c = interfaceC5730l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                a.g(interfaceC5730l0, z10 ? "subtitle" : null);
                return Unit.f142422a;
            }

            public final void c(InterfaceC14814f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-314215616, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous> (AdsTopBar.kt:147)");
                }
                LocalThemeScope localThemeScope = this.f7274a;
                boolean z10 = a.f(this.f7275b) != null;
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<String> interfaceC5730l0 = this.f7275b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Dr.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a.C0114a.d(interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                Li.h.o(localThemeScope, "Subtitle", z10, null, (Function1) objB, composer, i11 | 24624, 4);
                LocalThemeScope localThemeScope2 = this.f7274a;
                boolean zK = a.k(this.f7276c);
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f7276c;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: Dr.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a.C0114a.e(interfaceC5730l02, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Li.h.o(localThemeScope2, "Show Navigation Icon", zK, null, (Function1) objB2, composer, i11 | 24624, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                c(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                a.l(interfaceC5730l0, z10);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f7277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f7278b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f7279c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Dr.j$a$b$a, reason: collision with other inner class name */
            static final class C0115a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f7280a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Dr.j$a$b$a$a, reason: collision with other inner class name */
                static final class C0116a implements Function3<j1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f7281a;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: Dr.j$a$b$a$a$a, reason: collision with other inner class name */
                    static final class C0117a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f7282a;

                        C0117a(LocalThemeScope localThemeScope) {
                            this.f7282a = localThemeScope;
                        }

                        public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                            Intrinsics.j(AdsButton, "$this$AdsButton");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1051407040, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:167)");
                            }
                            C17988z0.a(C16190d.c(C.a.B.f15320e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), "Search", null, this.f7282a.getAdsColors().getAdsColorInverse().getColor(), composer, 48, 4);
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

                    C0116a(LocalThemeScope localThemeScope) {
                        this.f7281a = localThemeScope;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c() {
                        return Unit.f142422a;
                    }

                    public final void b(j1 Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-473849267, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:163)");
                        }
                        LocalThemeScope localThemeScope = this.f7281a;
                        q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Dr.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return j.a.b.C0115a.C0116a.c();
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1051407040, true, new C0117a(this.f7281a), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                        b(j1Var, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C0115a(LocalThemeScope localThemeScope) {
                    this.f7280a = localThemeScope;
                }

                public final void a(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
                    Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1438127893, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:161)");
                    }
                    LocalThemeScope localThemeScope = this.f7280a;
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
                    Q.e(localThemeScope, C14949n.f139910a, ComposableLambdaKt.c(-473849267, true, new C0116a(localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14949n.f139911b << 3));
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
            /* renamed from: Dr.j$a$b$b, reason: collision with other inner class name */
            static final class C0118b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f7283a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f7284b;

                C0118b(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0) {
                    this.f7283a = localThemeScope;
                    this.f7284b = interfaceC5730l0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1230911249, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:157)");
                    }
                    g.g(this.f7283a, "Debug Options", null, false, a.f(this.f7284b), 0, null, 0, composer, LocalThemeScope.f15770g | 48, 118);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(758592943, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous> (AdsTopBar.kt:156)");
                }
                C.f.o oVar = C.f.o.f15522e;
                AbstractC5607a abstractC5607aC = AbstractC5607a.INSTANCE.c("Navigate Up");
                Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zK = a.k(this.f7278b);
                LocalThemeScope localThemeScope = this.f7277a;
                g.f(localThemeScope, modifierH, ComposableLambdaKt.c(1438127893, true, new C0115a(localThemeScope), composer, 54), null, ComposableLambdaKt.c(-1230911249, true, new C0118b(this.f7277a, this.f7279c), composer, 54), null, oVar, 0.0f, zK, abstractC5607aC, composer, LocalThemeScope.f15770g | 25008 | (C.f.o.f15523f << 18) | (AbstractC5607a.f45514b << 27), 84);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            b(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02) {
                this.f7277a = localThemeScope;
                this.f7278b = interfaceC5730l0;
                this.f7279c = interfaceC5730l02;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-349328395, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous> (AdsTopBar.kt:143)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e("subtitle", null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composer.P();
            Li.h.f(AdsTheme, ComposableLambdaKt.c(-314215616, true, new C0114a(AdsTheme, interfaceC5730l0, interfaceC5730l02), composer, 54), ComposableLambdaKt.c(758592943, true, new b(AdsTheme, interfaceC5730l02, interfaceC5730l0), composer, 54), composer, (i10 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            e(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7285a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-970552257, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-970552257.<anonymous> (AdsTopBar.kt:51)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7286a = new c();

        public final void a(InterfaceC14800I interfaceC14800I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14800I, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(548102476, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$548102476.<anonymous> (AdsTopBar.kt:49)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        c() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f7271c;
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> b() {
        return f7270b;
    }
}
