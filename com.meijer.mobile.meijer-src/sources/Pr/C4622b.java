package Pr;

import Ki.LocalThemeScope;
import Pr.C4622b;
import Xr.ToolBarDecorator;
import Xr.a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import kotlin.C17987a1;
import kotlin.C17993c1;
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

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4622b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4622b f26743a = new C4622b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f26744b = ComposableLambdaKt.composableLambdaInstance(1825648922, false, C0493b.f26759a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f26745c = ComposableLambdaKt.composableLambdaInstance(-1459336804, false, a.f26746a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.b$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26746a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pr.b$a$a, reason: collision with other inner class name */
        static final class C0490a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26747a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f26748b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f26749c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f26750d;

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, boolean z10) {
                a.r(interfaceC5872l0, true);
                a.p(interfaceC5872l02, "There are no available coupons to clip in this category.");
                return Unit.f143329a;
            }

            C0490a(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                this.f26747a = localThemeScope;
                this.f26748b = interfaceC5872l0;
                this.f26749c = interfaceC5872l02;
                this.f26750d = interfaceC5872l03;
            }

            public final void b(InterfaceC14902f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1248991975, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous>.<anonymous> (CouponListComposables.kt:338)");
                }
                LocalThemeScope localThemeScope = this.f26747a;
                String strValueOf = String.valueOf(a.k(this.f26748b));
                int i11 = LocalThemeScope.f17314g;
                Mi.h.h(localThemeScope, "Last Action", strValueOf, null, composer, i11 | 48, 4);
                LocalThemeScope localThemeScope2 = this.f26747a;
                boolean z10 = a.o(this.f26749c) == null;
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f26750d;
                final InterfaceC5872l0<String> interfaceC5872l02 = this.f26749c;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Pr.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C4622b.a.C0490a.c(interfaceC5872l0, interfaceC5872l02, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Mi.h.o(localThemeScope2, "Is NoCouponText null", z10, null, (Function1) objB, composer, i11 | 24624, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                b(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pr.b$a$b, reason: collision with other inner class name */
        static final class C0491b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26751a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f26752b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f26753c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f26754d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pr.b$a$b$a, reason: collision with other inner class name */
            static final class C0492a implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f26755a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f26756b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f26757c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f26758d;

                C0492a(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<String> interfaceC5872l03) {
                    this.f26755a = localThemeScope;
                    this.f26756b = interfaceC5872l0;
                    this.f26757c = interfaceC5872l02;
                    this.f26758d = interfaceC5872l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0, Qk.a it) {
                    Intrinsics.j(it, "it");
                    a.l(interfaceC5872l0, "onCouponAction");
                    return Unit.f143329a;
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
                    String strO = a.o(this.f26756b);
                    AbstractC6392a abstractC6392aC = strO != null ? AbstractC6392a.INSTANCE.c(strO) : null;
                    boolean zQ = a.q(this.f26757c);
                    int i13 = i11;
                    LocalThemeScope localThemeScope = this.f26755a;
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f26758d;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Pr.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4622b.a.C0491b.C0492a.c(interfaceC5872l0, (Qk.a) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C4635o.f(localThemeScope, arrayList, zQ, abstractC6392aC, contentModifier, null, null, null, (Function1) objB, composer, 100663296 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9) | ((i13 << 12) & 57344), 112);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    b(modifier, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0491b(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                this.f26751a = localThemeScope;
                this.f26752b = interfaceC5872l0;
                this.f26753c = interfaceC5872l02;
                this.f26754d = interfaceC5872l03;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5872l0 interfaceC5872l0) {
                a.l(interfaceC5872l0, "onBackClicked");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0) {
                a.l(interfaceC5872l0, "onRetryButtonClicked");
                return Unit.f143329a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1011294038, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$-1459336804.<anonymous>.<anonymous> (CouponListComposables.kt:351)");
                }
                C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
                ToolBarDecorator toolBarDecorator = new ToolBarDecorator(AbstractC6392a.INSTANCE.c("Coupons"));
                LocalThemeScope localThemeScope = this.f26751a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f26752b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function0() { // from class: Pr.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4622b.a.C0491b.d(interfaceC5872l0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<String> interfaceC5872l02 = this.f26752b;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: Pr.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4622b.a.C0491b.e(interfaceC5872l02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C4635o.i(localThemeScope, c17993c1G, false, false, null, toolBarDecorator, null, null, null, function0, (Function0) objB2, ComposableLambdaKt.c(562495160, true, new C0492a(this.f26751a, this.f26753c, this.f26754d, this.f26752b), composer, 54), composer, 805309824 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 15), 54, 232);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f143329a;
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
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB3;
            composer.P();
            Mi.h.f(AdsTheme, ComposableLambdaKt.c(1248991975, true, new C0490a(AdsTheme, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03), composer, 54), ComposableLambdaKt.c(1011294038, true, new C0491b(AdsTheme, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03), composer, 54), composer, (i10 & 14) | LocalThemeScope.f17314g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            g(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.b$b, reason: collision with other inner class name */
    static final class C0493b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0493b f26759a = new C0493b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1825648922, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.ComposableSingletons$CouponListComposablesKt.lambda$1825648922.<anonymous> (CouponListComposables.kt:191)");
            }
            C18054z0.a(C16335d.c(Cj.i.f4810n0, composer, 0), ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Aj.e.f1348a), null, 0L, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        C0493b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f26744b;
    }
}
