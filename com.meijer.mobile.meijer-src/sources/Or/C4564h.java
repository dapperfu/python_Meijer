package Or;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Or.C4564h;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.C17943E0;
import kotlin.C18054z0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.t1;
import p1.C16335d;
import p1.C16338g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Or.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4564h {

    /* renamed from: a, reason: collision with root package name */
    public static final C4564h f24983a = new C4564h();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24984b = ComposableLambdaKt.composableLambdaInstance(-447398737, false, c.f24993a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24985c = ComposableLambdaKt.composableLambdaInstance(1723369677, false, e.f24995a);

    /* renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24986d = ComposableLambdaKt.composableLambdaInstance(-1841423002, false, b.f24992a);

    /* renamed from: e, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24987e = ComposableLambdaKt.composableLambdaInstance(-56232478, false, d.f24994a);

    /* renamed from: f, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24988f = ComposableLambdaKt.composableLambdaInstance(999190368, false, f.f24996a);

    /* renamed from: g, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24989g = ComposableLambdaKt.composableLambdaInstance(-1604512631, false, a.f24990a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Or.h$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24990a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Or.h$a$a, reason: collision with other inner class name */
        static final class C0418a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24991a;

            C0418a(LocalThemeScope localThemeScope) {
                this.f24991a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ProductFullDetails productFullDetails, String str) {
                Intrinsics.j(productFullDetails, "<unused var>");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                Intrinsics.j(productFullDetails, "<unused var>");
                Intrinsics.j(aVar, "<unused var>");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k() {
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l() {
                return Unit.f143329a;
            }

            public final void e(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1631425733, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$-1604512631.<anonymous>.<anonymous> (CouponDetailComposables.kt:512)");
                }
                List listP = CollectionsKt.p(A.f24891b, A.f24892c, A.f24893d);
                LocalThemeScope localThemeScope = this.f24991a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function2() { // from class: Or.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C4564h.a.C0418a.f((ProductFullDetails) obj, (String) obj2);
                        }
                    };
                    composer.t(objB);
                }
                Function2 function2 = (Function2) objB;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function2() { // from class: Or.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C4564h.a.C0418a.g((ProductFullDetails) obj, (com.meijer.mobile.core.design.widget.stepperview.a) obj2);
                        }
                    };
                    composer.t(objB2);
                }
                Function2 function22 = (Function2) objB2;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: Or.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4564h.a.C0418a.k();
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function0 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = new Function0() { // from class: Or.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4564h.a.C0418a.l();
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                A.u(localThemeScope, false, true, true, false, 3, true, null, null, listP, function2, function22, function0, (Function0) objB4, composer, LocalThemeScope.f17314g | 102460848, 3510, 64);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                e(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1604512631, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$-1604512631.<anonymous> (CouponDetailComposables.kt:511)");
            }
            t1.a(androidx.compose.foundation.b.d(Modifier.INSTANCE, AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(1631425733, true, new C0418a(AdsTheme), composer, 54), composer, 1572864, 62);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Or.h$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24992a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1841423002, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$-1841423002.<anonymous> (CouponDetailComposables.kt:189)");
            }
            C18054z0.a(C16335d.c(Cj.i.f4811n1, composer, 0), ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22665P), null, C17943E0.f167967a.a(composer, C17943E0.f167968b).g(), composer, 0, 4);
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
    /* renamed from: Or.h$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f24993a = new c();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-447398737, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$-447398737.<anonymous> (CouponDetailComposables.kt:149)");
            }
            N1.b(C16338g.c(Nr.g.f22720w, composer, 0), null, 0L, 0L, null, FontWeight.INSTANCE.f(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 196608, 0, 131038);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Or.h$d */
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24994a = new d();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-56232478, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$-56232478.<anonymous> (CouponDetailComposables.kt:467)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Or.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4564h.d.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            yr.r.f(AdsTheme, null, null, (Function0) objB, composer, LocalThemeScope.f17314g | 3072 | (i10 & 14), 3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Or.h$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f24995a = new e();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1723369677, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$1723369677.<anonymous> (CouponDetailComposables.kt:156)");
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

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Or.h$f */
    static final class f implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f24996a = new f();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Or.h$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24997a;

            a(LocalThemeScope localThemeScope) {
                this.f24997a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1179676060, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$999190368.<anonymous>.<anonymous> (CouponDetailComposables.kt:501)");
                }
                A.w(this.f24997a, SequencesKt.K(new G1.a(50).b(), " ", null, null, 0, null, null, 62, null), composer, LocalThemeScope.f17314g);
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

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(999190368, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.ComposableSingletons$CouponDetailComposablesKt.lambda$999190368.<anonymous> (CouponDetailComposables.kt:500)");
            }
            t1.a(androidx.compose.foundation.b.d(Modifier.INSTANCE, AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(1179676060, true, new a(AdsTheme), composer, 54), composer, 1572864, 62);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        f() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f24986d;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f24984b;
    }

    public final Function2<Composer, Integer, Unit> c() {
        return f24985c;
    }
}
