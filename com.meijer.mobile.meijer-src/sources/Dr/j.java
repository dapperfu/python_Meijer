package Dr;

import Dr.j;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import j0.C14889J;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.C15183n;
import ki.j1;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f6576a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f6577b = ComposableLambdaKt.composableLambdaInstance(548102476, false, c.f6593a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f6578c = ComposableLambdaKt.composableLambdaInstance(-970552257, false, b.f6592a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f6579d = ComposableLambdaKt.composableLambdaInstance(-349328395, false, a.f6580a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6580a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dr.j$a$a, reason: collision with other inner class name */
        static final class C0128a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6581a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f6582b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6583c;

            C0128a(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                this.f6581a = localThemeScope;
                this.f6582b = interfaceC5872l0;
                this.f6583c = interfaceC5872l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                a.g(interfaceC5872l0, z10 ? "subtitle" : null);
                return Unit.f143329a;
            }

            public final void c(InterfaceC14902f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-314215616, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous> (AdsTopBar.kt:147)");
                }
                LocalThemeScope localThemeScope = this.f6581a;
                boolean z10 = a.f(this.f6582b) != null;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f6582b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Dr.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a.C0128a.d(interfaceC5872l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                Mi.h.o(localThemeScope, "Subtitle", z10, null, (Function1) objB, composer, i11 | 24624, 4);
                LocalThemeScope localThemeScope2 = this.f6581a;
                boolean zK = a.k(this.f6583c);
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f6583c;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: Dr.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a.C0128a.e(interfaceC5872l02, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Mi.h.o(localThemeScope2, "Show Navigation Icon", zK, null, (Function1) objB2, composer, i11 | 24624, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                c(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                a.l(interfaceC5872l0, z10);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6584a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6585b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f6586c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Dr.j$a$b$a, reason: collision with other inner class name */
            static final class C0129a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f6587a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Dr.j$a$b$a$a, reason: collision with other inner class name */
                static final class C0130a implements Function3<j1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f6588a;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: Dr.j$a$b$a$a$a, reason: collision with other inner class name */
                    static final class C0131a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f6589a;

                        C0131a(LocalThemeScope localThemeScope) {
                            this.f6589a = localThemeScope;
                        }

                        public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                            Intrinsics.j(AdsButton, "$this$AdsButton");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1051407040, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:167)");
                            }
                            C18054z0.a(C16335d.c(C.a.B.f16864e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), "Search", null, this.f6589a.getAdsColors().getAdsColorInverse().getColor(), composer, 48, 4);
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

                    C0130a(LocalThemeScope localThemeScope) {
                        this.f6588a = localThemeScope;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c() {
                        return Unit.f143329a;
                    }

                    public final void b(j1 Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-473849267, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:163)");
                        }
                        LocalThemeScope localThemeScope = this.f6588a;
                        q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Dr.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return j.a.b.C0129a.C0130a.c();
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1051407040, true, new C0131a(this.f6588a), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
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

                C0129a(LocalThemeScope localThemeScope) {
                    this.f6587a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                    Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1438127893, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:161)");
                    }
                    LocalThemeScope localThemeScope = this.f6587a;
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
                    Q.e(localThemeScope, C15183n.f142165a, ComposableLambdaKt.c(-473849267, true, new C0130a(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15183n.f142166b << 3));
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
            /* renamed from: Dr.j$a$b$b, reason: collision with other inner class name */
            static final class C0132b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f6590a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f6591b;

                C0132b(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0) {
                    this.f6590a = localThemeScope;
                    this.f6591b = interfaceC5872l0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1230911249, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:157)");
                    }
                    g.g(this.f6590a, "Debug Options", null, false, a.f(this.f6591b), 0, null, 0, composer, LocalThemeScope.f17314g | 48, 118);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(758592943, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.ComposableSingletons$AdsTopBarKt.lambda$-349328395.<anonymous>.<anonymous> (AdsTopBar.kt:156)");
                }
                C.f.o oVar = C.f.o.f17066e;
                AbstractC6392a abstractC6392aC = AbstractC6392a.INSTANCE.c("Navigate Up");
                Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zK = a.k(this.f6585b);
                LocalThemeScope localThemeScope = this.f6584a;
                g.f(localThemeScope, modifierH, ComposableLambdaKt.c(1438127893, true, new C0129a(localThemeScope), composer, 54), null, ComposableLambdaKt.c(-1230911249, true, new C0132b(this.f6584a, this.f6586c), composer, 54), null, oVar, 0.0f, zK, abstractC6392aC, composer, LocalThemeScope.f17314g | 25008 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 84);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            b(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
                this.f6584a = localThemeScope;
                this.f6585b = interfaceC5872l0;
                this.f6586c = interfaceC5872l02;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
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
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            Mi.h.f(AdsTheme, ComposableLambdaKt.c(-314215616, true, new C0128a(AdsTheme, interfaceC5872l0, interfaceC5872l02), composer, 54), ComposableLambdaKt.c(758592943, true, new b(AdsTheme, interfaceC5872l02, interfaceC5872l0), composer, 54), composer, (i10 & 14) | LocalThemeScope.f17314g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            e(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6592a = new b();

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
            return Unit.f143329a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6593a = new c();

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14888I, "<this>");
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f6578c;
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> b() {
        return f6577b;
    }
}
