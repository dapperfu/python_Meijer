package Pr;

import Ji.LocalThemeScope;
import Pr.C5024b;
import Xr.ToolBarDecorator;
import Xr.a;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pr.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5024b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5024b f28861a = new C5024b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28862b = ComposableLambdaKt.composableLambdaInstance(1825648922, false, C0673b.f28877a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f28863c = ComposableLambdaKt.composableLambdaInstance(-1459336804, false, a.f28864a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.b$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28864a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pr.b$a$a, reason: collision with other inner class name */
        static final class C0670a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28865a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f28866b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f28867c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f28868d;

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, boolean z10) {
                a.r(interfaceC5730l0, true);
                a.p(interfaceC5730l02, "There are no available coupons to clip in this category.");
                return Unit.f142422a;
            }

            C0670a(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                this.f28865a = localThemeScope;
                this.f28866b = interfaceC5730l0;
                this.f28867c = interfaceC5730l02;
                this.f28868d = interfaceC5730l03;
            }

            public final void b(InterfaceC14814f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1248991975, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous>.<anonymous> (CouponListComposables.kt:338)");
                }
                LocalThemeScope localThemeScope = this.f28865a;
                String strValueOf = String.valueOf(a.k(this.f28866b));
                int i11 = LocalThemeScope.f15770g;
                Li.h.h(localThemeScope, "Last Action", strValueOf, null, composer, i11 | 48, 4);
                LocalThemeScope localThemeScope2 = this.f28865a;
                boolean z10 = a.o(this.f28867c) == null;
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f28868d;
                final InterfaceC5730l0<String> interfaceC5730l02 = this.f28867c;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Pr.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C5024b.a.C0670a.c(interfaceC5730l0, interfaceC5730l02, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Li.h.o(localThemeScope2, "Is NoCouponText null", z10, null, (Function1) objB, composer, i11 | 24624, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                b(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pr.b$a$b, reason: collision with other inner class name */
        static final class C0671b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28869a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f28870b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f28871c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f28872d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pr.b$a$b$a, reason: collision with other inner class name */
            static final class C0672a implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28873a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f28874b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f28875c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f28876d;

                C0672a(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<String> interfaceC5730l03) {
                    this.f28873a = localThemeScope;
                    this.f28874b = interfaceC5730l0;
                    this.f28875c = interfaceC5730l02;
                    this.f28876d = interfaceC5730l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0, Pk.a it) {
                    Intrinsics.j(it, "it");
                    a.l(interfaceC5730l0, "onCouponAction");
                    return Unit.f142422a;
                }

                public final void b(Modifier contentModifier, Composer composer, int i10) {
                    Intrinsics.j(contentModifier, "contentModifier");
                    int i11 = (i10 & 6) == 0 ? (composer.V(contentModifier) ? 4 : 2) | i10 : i10;
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(562495160, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:359)");
                    }
                    ArrayList arrayList = new ArrayList(5);
                    for (int i12 = 0; i12 < 5; i12++) {
                        arrayList.add(new a.Coupon(C.i()));
                    }
                    String strO = a.o(this.f28874b);
                    AbstractC5607a abstractC5607aC = strO != null ? AbstractC5607a.INSTANCE.c(strO) : null;
                    boolean zQ = a.q(this.f28875c);
                    int i13 = i11;
                    LocalThemeScope localThemeScope = this.f28873a;
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f28876d;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Pr.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5024b.a.C0671b.C0672a.c(interfaceC5730l0, (Pk.a) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C5037o.f(localThemeScope, arrayList, zQ, abstractC5607aC, contentModifier, null, null, null, (Function1) objB, composer, 100663296 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9) | ((i13 << 12) & 57344), 112);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    b(modifier, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0671b(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                this.f28869a = localThemeScope;
                this.f28870b = interfaceC5730l0;
                this.f28871c = interfaceC5730l02;
                this.f28872d = interfaceC5730l03;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5730l0 interfaceC5730l0) {
                a.l(interfaceC5730l0, "onBackClicked");
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5730l0 interfaceC5730l0) {
                a.l(interfaceC5730l0, "onRetryButtonClicked");
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1011294038, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous>.<anonymous> (CouponListComposables.kt:351)");
                }
                C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
                ToolBarDecorator toolBarDecorator = new ToolBarDecorator(AbstractC5607a.INSTANCE.c("Coupons"));
                LocalThemeScope localThemeScope = this.f28869a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<String> interfaceC5730l0 = this.f28870b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function0() { // from class: Pr.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5024b.a.C0671b.d(interfaceC5730l0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<String> interfaceC5730l02 = this.f28870b;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: Pr.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5024b.a.C0671b.e(interfaceC5730l02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C5037o.i(localThemeScope, c17927c1G, false, false, null, toolBarDecorator, null, null, null, function0, (Function0) objB2, ComposableLambdaKt.c(562495160, true, new C0672a(this.f28869a, this.f28871c, this.f28872d, this.f28870b), composer, 54), composer, 805309824 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 15), 54, 232);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void g(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1459336804, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous> (CouponListComposables.kt:332)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(null, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB3;
            composer.P();
            Li.h.f(AdsTheme, ComposableLambdaKt.c(1248991975, true, new C0670a(AdsTheme, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03), composer, 54), ComposableLambdaKt.c(1011294038, true, new C0671b(AdsTheme, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03), composer, 54), composer, (i10 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            g(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.b$b, reason: collision with other inner class name */
    static final class C0673b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0673b f28877a = new C0673b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1825648922, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$1825648922.<anonymous> (CouponListComposables.kt:191)");
            }
            C17988z0.a(C16190d.c(Bj.i.f2765n0, composer, 0), ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(zj.e.f172832a), null, 0L, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        C0673b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f28862b;
    }
}
