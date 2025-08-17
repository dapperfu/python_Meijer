package jm;

import Co.ProductFullDetails;
import Ji.LocalThemeScope;
import Ok.Coupon;
import Pk.a;
import Ul.HomeDepartment;
import Ul.MarketingBanner;
import Ul.e;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import as.C6149c;
import ck.C6408b;
import com.meijer.mobile.home.ux.k0;
import cs.AbstractC13422a;
import dl.SpecialOffer;
import ds.AbstractC13565b;
import ds.C13569f;
import ds.DepartmentCarouselDecorator;
import em.AbstractC13687a;
import em.AbstractC13688b;
import em.AbstractC13689c;
import em.AbstractC13696j;
import em.AbstractC13697k;
import es.AbstractC13761f;
import es.OrderStatusCardDecorator;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import fm.HomeEmailBannerDecorator;
import fm.SpecialOffersCarouselDecorator;
import fm.TeachersListCardDecorator;
import fs.AbstractC13947a;
import hi.C14476c;
import j0.C14802K;
import java.util.List;
import jk.EnumC14984a;
import jm.C15021f0;
import kotlin.C17917Z;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import sr.AbstractC17021a;
import vs.CarouselDecorator;
import vs.ProductListDecorator;
import xr.InterfaceC18086a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u009f\u0002\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\u000e\u0010$\u001a\u0004\u0018\u00010#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/home/ux/k0$m;", "viewState", "", "isMperksNewHomeScreenUiEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lxr/a;", "", "onChipClicked", "Les/f;", "onOrderStatusAction", "Lds/b;", "onDepartmentCarouselAction", "Lem/k;", "onSpecialOffersCarouselAction", "LPk/a;", "onCouponAction", "Lsr/a;", "onGoogleAdViewAction", "Lem/j;", "onMarketingBannerAction", "Lem/b;", "onFeatureEntryPointAction", "Lem/c;", "onHomeMperksAction", "Lem/a;", "onEmailBannerAction", "Lcs/a;", "onProductCarouselAction", "Lfs/a;", "onCarouselBeaconTrackingAction", "d", "(LJi/M;Lcom/meijer/mobile/home/ux/k0$m;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lvs/a;", "carouselDecorator", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jm.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15021f0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140682b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17021a, Unit> f140683c;

        /* JADX WARN: Multi-variable type inference failed */
        a(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC17021a, Unit> function1) {
            this.f140681a = viewState;
            this.f140682b = localThemeScope;
            this.f140683c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, GoogleAdAnalytics it) {
            Intrinsics.j(it, "it");
            function1.invoke(new AbstractC17021a.GoogleAdViewClicked(it));
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-484785723, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:334)");
            }
            GoogleAdData googleAdSlot1 = this.f140681a.getGoogleAdSlot1();
            if (googleAdSlot1 != null) {
                LocalThemeScope localThemeScope = this.f140682b;
                final Function1<AbstractC17021a, Unit> function1 = this.f140683c;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: jm.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15021f0.a.c(function1, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                sr.p.C(localThemeScope, modifierF, googleAdSlot1, (Function1) objB, composer, LocalThemeScope.f15770g | 48 | (GoogleAdData.f131149f << 6), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140685b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17021a, Unit> f140686c;

        /* JADX WARN: Multi-variable type inference failed */
        b(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC17021a, Unit> function1) {
            this.f140684a = viewState;
            this.f140685b = localThemeScope;
            this.f140686c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, GoogleAdAnalytics it) {
            Intrinsics.j(it, "it");
            function1.invoke(new AbstractC17021a.GoogleAdViewClicked(it));
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1606743814, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:346)");
            }
            GoogleAdData googleAdSlot2 = this.f140684a.getGoogleAdSlot2();
            if (googleAdSlot2 != null) {
                LocalThemeScope localThemeScope = this.f140685b;
                final Function1<AbstractC17021a, Unit> function1 = this.f140686c;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: jm.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15021f0.b.c(function1, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                sr.p.C(localThemeScope, modifierF, googleAdSlot2, (Function1) objB, composer, LocalThemeScope.f15770g | 48 | (GoogleAdData.f131149f << 6), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.f0$c */
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13696j, Unit> f140687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MarketingBanner f140688b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super AbstractC13696j, Unit> function1, MarketingBanner marketingBanner) {
            this.f140687a = function1;
            this.f140688b = marketingBanner;
        }

        public final void a() {
            this.f140687a.invoke(new AbstractC13696j.BannerClicked(this.f140688b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.f0$d */
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC18086a, Unit> f140691c;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, k0.ViewState viewState, Function1<? super InterfaceC18086a, Unit> function1) {
            this.f140689a = localThemeScope;
            this.f140690b = viewState;
            this.f140691c = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(520323335, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:80)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f140689a.getAdsSpacing().getSix().getDp()), composer, 0);
            xr.g.c(this.f140689a, this.f140690b.d(), this.f140691c, androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 3072, 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f140689a.getAdsSpacing().getSix().getDp()), composer, 0);
            C17917Z.a(null, this.f140689a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$e */
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13687a, Unit> f140694c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: jm.f0$e$a */
        static final class a implements Function4<InterfaceC6163b, HomeEmailBannerDecorator, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f140695a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC13687a, Unit> f140696b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super AbstractC13687a, Unit> function1) {
                this.f140695a = localThemeScope;
                this.f140696b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1) {
                function1.invoke(AbstractC13687a.C2026a.f129032a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(AbstractC13687a.b.f129033a);
                return Unit.f142422a;
            }

            public final void c(InterfaceC6163b AnimatedContent, HomeEmailBannerDecorator homeEmailBannerDecorator, Composer composer, int i10) {
                Intrinsics.j(AnimatedContent, "$this$AnimatedContent");
                if (ComposerKt.M()) {
                    ComposerKt.U(1497965321, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:92)");
                }
                if (homeEmailBannerDecorator != null) {
                    LocalThemeScope localThemeScope = this.f140695a;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f140696b);
                    final Function1<AbstractC13687a, Unit> function1 = this.f140696b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: jm.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C15021f0.e.a.d(function1);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(this.f140696b);
                    final Function1<AbstractC13687a, Unit> function12 = this.f140696b;
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: jm.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C15021f0.e.a.e(function12);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = AbstractC5607a.f45514b;
                    C15024h.k(localThemeScope, homeEmailBannerDecorator, null, function0, (Function0) objB2, composer, i11 | ((i12 | (Ji.C.f15315b | i12)) << 3) | (i10 & 112), 2);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, HomeEmailBannerDecorator homeEmailBannerDecorator, Composer composer, Integer num) {
                c(interfaceC6163b, homeEmailBannerDecorator, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13687a, Unit> function1) {
            this.f140692a = viewState;
            this.f140693b = localThemeScope;
            this.f140694c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(HomeEmailBannerDecorator homeEmailBannerDecorator) {
            return Boolean.valueOf(homeEmailBannerDecorator != null);
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2054376702, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:91)");
            }
            HomeEmailBannerDecorator homeEmailBannerDecorator = this.f140692a.getHomeEmailBannerDecorator();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: jm.h0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15021f0.e.c((HomeEmailBannerDecorator) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1497965321, true, new a(this.f140693b, this.f140694c), composer, 54);
            int i11 = AbstractC5607a.f45514b;
            androidx.compose.animation.a.b(homeEmailBannerDecorator, null, null, null, null, function1, composableLambdaC, composer, i11 | Ji.C.f15315b | i11 | 1769472, 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$f */
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13761f, Unit> f140699c;

        /* JADX WARN: Multi-variable type inference failed */
        f(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13761f, Unit> function1) {
            this.f140697a = viewState;
            this.f140698b = localThemeScope;
            this.f140699c = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-149061057, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:103)");
            }
            List<OrderStatusCardDecorator> listP = this.f140697a.p();
            if (listP.isEmpty()) {
                listP = null;
            }
            List<OrderStatusCardDecorator> list = listP;
            if (list != null) {
                es.I.i(this.f140698b, null, list, this.f140699c, composer, LocalThemeScope.f15770g, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$g */
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13688b, Unit> f140702c;

        /* JADX WARN: Multi-variable type inference failed */
        g(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13688b, Unit> function1) {
            this.f140700a = viewState;
            this.f140701b = localThemeScope;
            this.f140702c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, TeachersListCardDecorator teachersListCardDecorator) {
            function1.invoke(new AbstractC13688b.NavigateToTeachersList(teachersListCardDecorator.getDestinationDeeplink()));
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1942468480, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:112)");
            }
            final TeachersListCardDecorator teacherListsCardDecorator = this.f140700a.getTeacherListsCardDecorator();
            if (teacherListsCardDecorator != null) {
                LocalThemeScope localThemeScope = this.f140701b;
                final Function1<AbstractC13688b, Unit> function1 = this.f140702c;
                AbstractC5607a title = teacherListsCardDecorator.getTitle();
                AbstractC5607a description = teacherListsCardDecorator.getDescription();
                AbstractC5607a actionButtonTitle = teacherListsCardDecorator.getActionButtonTitle();
                int image = teacherListsCardDecorator.getImage();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function1) | composer.D(teacherListsCardDecorator);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: jm.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15021f0.g.c(function1, teacherListsCardDecorator);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                int i12 = AbstractC5607a.f45514b;
                C6149c.b(localThemeScope, null, title, description, actionButtonTitle, image, (Function0) objB, composer, i11 | (i12 << 6) | (i12 << 9) | (i12 << 12), 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$h */
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.f f140703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140705c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f140706d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13422a, Unit> f140707e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13947a, Unit> f140708f;

        /* JADX WARN: Multi-variable type inference failed */
        h(e.f fVar, k0.ViewState viewState, LocalThemeScope localThemeScope, List<ProductListDecorator> list, Function1<? super AbstractC13422a, Unit> function1, Function1<? super AbstractC13947a, Unit> function12) {
            this.f140703a = fVar;
            this.f140704b = viewState;
            this.f140705c = localThemeScope;
            this.f140706d = list;
            this.f140707e = function1;
            this.f140708f = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state, EnumC14984a carouselType) {
            Intrinsics.j(product, "product");
            Intrinsics.j(state, "state");
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13422a.UpdateProductEntry(product, state.getValueState().getQuantity(), carouselType));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, Ok.c coupon, EnumC14984a carouselType) {
            Intrinsics.j(coupon, "coupon");
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13422a.ProductCouponClicked(coupon, carouselType));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, z1 z1Var) {
            EnumC14984a carouselType;
            CarouselDecorator carouselDecoratorT = t(z1Var);
            String deepLink = carouselDecoratorT != null ? carouselDecoratorT.getDeepLink() : null;
            CarouselDecorator carouselDecoratorT2 = t(z1Var);
            String title = carouselDecoratorT2 != null ? carouselDecoratorT2.getTitle() : null;
            if (title == null) {
                title = "";
            }
            CarouselDecorator carouselDecoratorT3 = t(z1Var);
            if (carouselDecoratorT3 == null || (carouselType = carouselDecoratorT3.getCarouselType()) == null) {
                carouselType = EnumC14984a.f140312a;
            }
            function1.invoke(new AbstractC13422a.ViewAll(deepLink, title, carouselType));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1, int i10, EnumC14984a carouselType, boolean z10) {
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13422a.ProductClickedPosition(i10, carouselType, z10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, z1 z1Var) {
            EnumC14984a carouselType;
            CarouselDecorator carouselDecoratorT = t(z1Var);
            String deepLink = carouselDecoratorT != null ? carouselDecoratorT.getDeepLink() : null;
            CarouselDecorator carouselDecoratorT2 = t(z1Var);
            String title = carouselDecoratorT2 != null ? carouselDecoratorT2.getTitle() : null;
            if (title == null) {
                title = "";
            }
            CarouselDecorator carouselDecoratorT3 = t(z1Var);
            if (carouselDecoratorT3 == null || (carouselType = carouselDecoratorT3.getCarouselType()) == null) {
                carouselType = EnumC14984a.f140312a;
            }
            function1.invoke(new AbstractC13422a.ViewAll(deepLink, title, carouselType));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, e.f fVar) {
            function1.invoke(new AbstractC13422a.Retry(fVar));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, z1 z1Var, ProductFullDetails product, String str) {
            EnumC14984a carouselType;
            Intrinsics.j(product, "product");
            CarouselDecorator carouselDecoratorT = t(z1Var);
            if (carouselDecoratorT == null || (carouselType = carouselDecoratorT.getCarouselType()) == null) {
                carouselType = EnumC14984a.f140312a;
            }
            function1.invoke(new AbstractC13422a.ProductClicked(product, str, carouselType));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            l(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void l(l0.InterfaceC15343c r29, androidx.compose.runtime.Composer r30, int r31) {
            /*
                Method dump skipped, instructions count: 635
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jm.C15021f0.h.l(l0.c, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CarouselDecorator o(k0.ViewState viewState, e.f fVar) {
            return viewState.q().get(fVar);
        }

        private static final CarouselDecorator t(z1<CarouselDecorator> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.f0$i */
    static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140709a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f140710b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140711c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13689c, Unit> f140712d;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, boolean z10, k0.ViewState viewState, Function1<? super AbstractC13689c, Unit> function1) {
            this.f140709a = localThemeScope;
            this.f140710b = z10;
            this.f140711c = viewState;
            this.f140712d = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-260969279, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:215)");
            }
            C15056x.o(this.f140709a, this.f140710b, this.f140711c.getMPerksDecorator(), this.f140711c.getUser().getIsLoggedIn(), this.f140711c.getUser().getFirstName(), null, this.f140712d, composer, LocalThemeScope.f15770g, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$j */
    static final class j implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13565b, Unit> f140715c;

        /* JADX WARN: Multi-variable type inference failed */
        j(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13565b, Unit> function1) {
            this.f140713a = viewState;
            this.f140714b = localThemeScope;
            this.f140715c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, String str, String str2) {
            function1.invoke(new AbstractC13565b.ViewAll(e.c.b.f36111b, str, str2));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(new AbstractC13565b.Retry(e.c.b.f36111b));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String str, HomeDepartment department) {
            Intrinsics.j(department, "department");
            function1.invoke(new AbstractC13565b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.b.f36111b));
            return Unit.f142422a;
        }

        public final void d(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1830560258, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:225)");
            }
            DepartmentCarouselDecorator shopByDepartmentDecorator = this.f140713a.getShopByDepartmentDecorator();
            LocalThemeScope localThemeScope = this.f140714b;
            final Function1<AbstractC13565b, Unit> function1 = this.f140715c;
            AbstractC5607a carouselTitle = shopByDepartmentDecorator.getCarouselTitle();
            int i11 = AbstractC5607a.f45514b;
            final String strA = C6408b.a(carouselTitle, composer, i11);
            final String seeAllDeeplink = shopByDepartmentDecorator.getSeeAllDeeplink();
            Oj.a loadingState = shopByDepartmentDecorator.getLoadingState();
            List<HomeDepartment> listC = shopByDepartmentDecorator.c();
            AbstractC5607a viewAllTitle = shopByDepartmentDecorator.getViewAllTitle();
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.V(strA) | composer.V(seeAllDeeplink);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: jm.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15021f0.j.e(function1, strA, seeAllDeeplink);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(function1);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: jm.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15021f0.j.f(function1);
                    }
                };
                composer.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(function1) | composer.V(strA);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: jm.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15021f0.j.g(function1, strA, (HomeDepartment) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C13569f.b(localThemeScope, null, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, LocalThemeScope.f15770g | (Oj.a.f23966c << 9) | (i11 << 15), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            d(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$k */
    static final class k implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140717b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13565b, Unit> f140718c;

        /* JADX WARN: Multi-variable type inference failed */
        k(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13565b, Unit> function1) {
            this.f140716a = viewState;
            this.f140717b = localThemeScope;
            this.f140718c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, String str, String str2) {
            function1.invoke(new AbstractC13565b.ViewAll(e.c.a.f36110b, str, str2));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(new AbstractC13565b.Retry(e.c.a.f36110b));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String str, HomeDepartment department) {
            Intrinsics.j(department, "department");
            function1.invoke(new AbstractC13565b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.a.f36110b));
            return Unit.f142422a;
        }

        public final void d(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-372877501, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:262)");
            }
            DepartmentCarouselDecorator seasonalCarouselDecorator = this.f140716a.getSeasonalCarouselDecorator();
            LocalThemeScope localThemeScope = this.f140717b;
            final Function1<AbstractC13565b, Unit> function1 = this.f140718c;
            AbstractC5607a carouselTitle = seasonalCarouselDecorator.getCarouselTitle();
            int i11 = AbstractC5607a.f45514b;
            final String strA = C6408b.a(carouselTitle, composer, i11);
            final String seeAllDeeplink = seasonalCarouselDecorator.getSeeAllDeeplink();
            Oj.a loadingState = seasonalCarouselDecorator.getLoadingState();
            List<HomeDepartment> listC = seasonalCarouselDecorator.c();
            AbstractC5607a viewAllTitle = seasonalCarouselDecorator.getViewAllTitle();
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.V(strA) | composer.V(seeAllDeeplink);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: jm.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15021f0.k.e(function1, strA, seeAllDeeplink);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(function1);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: jm.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15021f0.k.f(function1);
                    }
                };
                composer.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(function1) | composer.V(strA);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: jm.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15021f0.k.g(function1, strA, (HomeDepartment) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C13569f.b(localThemeScope, null, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, LocalThemeScope.f15770g | (Oj.a.f23966c << 9) | (i11 << 15), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            d(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.f0$l */
    static final class l implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f140719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140720b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13697k, Unit> f140721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f140722d;

        /* JADX WARN: Multi-variable type inference failed */
        l(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13697k, Unit> function1, Function1<? super Pk.a, Unit> function12) {
            this.f140719a = viewState;
            this.f140720b = localThemeScope;
            this.f140721c = function1;
            this.f140722d = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1) {
            function1.invoke(new AbstractC13697k.ViewAll(C14476c.h("Special Offers: View all")));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1) {
            function1.invoke(new AbstractC13697k.ViewAll(C14476c.h("Special Offers: View all")));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1) {
            function1.invoke(AbstractC13697k.a.f129068a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function1 function1, Coupon it) {
            Intrinsics.j(it, "it");
            function1.invoke(new a.ViewCouponDetails(it, null, 2, null));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, Coupon it) {
            Intrinsics.j(it, "it");
            function1.invoke(new a.Clip(it, null, 2, null));
            return Unit.f142422a;
        }

        public final void f(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1718652036, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:299)");
            }
            SpecialOffersCarouselDecorator specialOffersCarouselDecorator = this.f140719a.getSpecialOffersCarouselDecorator();
            if (specialOffersCarouselDecorator.e().isEmpty()) {
                specialOffersCarouselDecorator = null;
            }
            if (specialOffersCarouselDecorator != null) {
                SpecialOffersCarouselDecorator specialOffersCarouselDecorator2 = specialOffersCarouselDecorator;
                LocalThemeScope localThemeScope = this.f140720b;
                final Function1<AbstractC13697k, Unit> function1 = this.f140721c;
                final Function1<Pk.a, Unit> function12 = this.f140722d;
                List<SpecialOffer> listE = specialOffersCarouselDecorator2.e();
                int carouselItemsCount = specialOffersCarouselDecorator2.getCarouselItemsCount();
                String strA = C6408b.a(specialOffersCarouselDecorator2.getCarouselTitle(), composer, AbstractC5607a.f45514b);
                Oj.a loadingState = specialOffersCarouselDecorator2.getLoadingState();
                String bannerResource = specialOffersCarouselDecorator2.getBannerResource();
                Integer bannerErrorImageResource = specialOffersCarouselDecorator2.getBannerErrorImageResource();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: jm.z0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15021f0.l.k(function1);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: jm.A0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15021f0.l.l(function1);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function12);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: jm.B0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15021f0.l.o(function12, (Coupon) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function13 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV4 = composer.V(function12);
                Object objB4 = composer.B();
                if (zV4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function1() { // from class: jm.C0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15021f0.l.p(function12, (Coupon) obj);
                        }
                    };
                    composer.t(objB4);
                }
                Function1 function14 = (Function1) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV5 = composer.V(function1);
                Object objB5 = composer.B();
                if (zV5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function0() { // from class: jm.D0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15021f0.l.g(function1);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                d1.b(localThemeScope, listE, strA, loadingState, null, bannerResource, bannerErrorImageResource, carouselItemsCount, function0, function02, function13, function14, (Function0) objB5, composer, LocalThemeScope.f15770g | (Oj.a.f23966c << 9), 0, 8);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            f(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: jm.f0$m */
    public static final class m extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final m f140723f = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(MarketingBanner marketingBanner) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: jm.f0$n */
    public static final class n extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f140724f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f140725g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function1 function1, List list) {
            super(1);
            this.f140724f = function1;
            this.f140725g = list;
        }

        public final Object a(int i10) {
            return this.f140724f.invoke(this.f140725g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: jm.f0$o */
    public static final class o extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f140726f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140727g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f140728h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f140726f = list;
            this.f140727g = localThemeScope;
            this.f140728h = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            MarketingBanner marketingBanner = (MarketingBanner) this.f140726f.get(i10);
            composer.startReplaceGroup(1353839095);
            LocalThemeScope localThemeScope = this.f140727g;
            String bannerImageURL = marketingBanner.getBannerImageURL();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f140728h) | composer.D(marketingBanner);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f140728h, marketingBanner);
                composer.t(objB);
            }
            composer.P();
            W.d(localThemeScope, bannerImageURL, null, null, (Function0) objB, composer, LocalThemeScope.f15770g, 6);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r30, final com.meijer.mobile.home.ux.k0.ViewState r31, final boolean r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super xr.InterfaceC18086a, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super es.AbstractC13761f, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super ds.AbstractC13565b, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super em.AbstractC13697k, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super sr.AbstractC17021a, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super em.AbstractC13696j, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super em.AbstractC13688b, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super em.AbstractC13689c, kotlin.Unit> r42, kotlin.jvm.functions.Function1<? super em.AbstractC13687a, kotlin.Unit> r43, final kotlin.jvm.functions.Function1<? super cs.AbstractC13422a, kotlin.Unit> r44, final kotlin.jvm.functions.Function1<? super fs.AbstractC13947a, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15021f0.d(Ji.M, com.meijer.mobile.home.ux.k0$m, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(AbstractC13687a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, boolean z10, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, Function1 function112, l0.w LazyColumn) {
        k0.ViewState viewState2;
        LocalThemeScope localThemeScope2;
        k0.ViewState viewState3 = viewState;
        LocalThemeScope localThemeScope3 = localThemeScope;
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, "home_chip_carousel", null, ComposableLambdaKt.composableLambdaInstance(520323335, true, new d(localThemeScope3, viewState3, function1)), 2, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2054376702, true, new e(viewState3, localThemeScope3, function12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-149061057, true, new f(viewState3, localThemeScope3, function13)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1942468480, true, new g(viewState3, localThemeScope3, function14)), 3, null);
        for (e.f fVar : viewState3.g()) {
            List<ProductListDecorator> list = viewState3.r().get(fVar);
            if (list != null) {
                viewState2 = viewState3;
                localThemeScope2 = localThemeScope3;
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1850151973, true, new h(fVar, viewState3, localThemeScope3, list, function15, function16)), 3, null);
            } else {
                viewState2 = viewState3;
                localThemeScope2 = localThemeScope3;
            }
            viewState3 = viewState2;
            localThemeScope3 = localThemeScope2;
        }
        k0.ViewState viewState4 = viewState3;
        LocalThemeScope localThemeScope4 = localThemeScope3;
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-260969279, true, new i(localThemeScope4, z10, viewState4, function17)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1830560258, true, new j(viewState4, localThemeScope4, function18)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-372877501, true, new k(viewState4, localThemeScope4, function18)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1718652036, true, new l(viewState4, localThemeScope4, function19, function110)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-484785723, true, new a(viewState4, localThemeScope4, function111)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1606743814, true, new b(viewState4, localThemeScope4, function111)), 3, null);
        List<MarketingBanner> listO = viewState4.o();
        LazyColumn.i(listO.size(), null, new n(m.f140723f, listO), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new o(listO, localThemeScope4, function112)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, k0.ViewState viewState, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, Function1 function112, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, viewState, z10, modifier, function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, function112, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }
}
