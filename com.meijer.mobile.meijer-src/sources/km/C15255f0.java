package km;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Pk.Coupon;
import Qk.a;
import Vl.HomeDepartment;
import Vl.MarketingBanner;
import Vl.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import as.C6290c;
import bk.AbstractC6392a;
import com.meijer.mobile.home.ux.k0;
import cs.AbstractC13555a;
import dk.C13698b;
import ds.AbstractC13720b;
import ds.C13724f;
import ds.DepartmentCarouselDecorator;
import el.SpecialOffer;
import es.AbstractC13870f;
import es.OrderStatusCardDecorator;
import fm.AbstractC14019a;
import fm.AbstractC14020b;
import fm.AbstractC14021c;
import fm.AbstractC14028j;
import fm.AbstractC14029k;
import fs.AbstractC14072a;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import gm.HomeEmailBannerDecorator;
import gm.SpecialOffersCarouselDecorator;
import gm.TeachersListCardDecorator;
import ii.C14756c;
import j0.C14890K;
import java.util.List;
import kk.EnumC15218a;
import km.C15255f0;
import kotlin.C17983Z;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import sr.AbstractC17144a;
import vs.CarouselDecorator;
import vs.ProductListDecorator;
import xr.InterfaceC18214a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u009f\u0002\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\u000e\u0010$\u001a\u0004\u0018\u00010#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/home/ux/k0$m;", "viewState", "", "isMperksNewHomeScreenUiEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lxr/a;", "", "onChipClicked", "Les/f;", "onOrderStatusAction", "Lds/b;", "onDepartmentCarouselAction", "Lfm/k;", "onSpecialOffersCarouselAction", "LQk/a;", "onCouponAction", "Lsr/a;", "onGoogleAdViewAction", "Lfm/j;", "onMarketingBannerAction", "Lfm/b;", "onFeatureEntryPointAction", "Lfm/c;", "onHomeMperksAction", "Lfm/a;", "onEmailBannerAction", "Lcs/a;", "onProductCarouselAction", "Lfs/a;", "onCarouselBeaconTrackingAction", "d", "(LKi/M;Lcom/meijer/mobile/home/ux/k0$m;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lvs/a;", "carouselDecorator", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: km.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15255f0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142936a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17144a, Unit> f142938c;

        /* JADX WARN: Multi-variable type inference failed */
        a(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC17144a, Unit> function1) {
            this.f142936a = viewState;
            this.f142937b = localThemeScope;
            this.f142938c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, GoogleAdAnalytics it) {
            Intrinsics.j(it, "it");
            function1.invoke(new AbstractC17144a.GoogleAdViewClicked(it));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-484785723, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:335)");
            }
            GoogleAdData googleAdSlot1 = this.f142936a.getGoogleAdSlot1();
            if (googleAdSlot1 != null) {
                LocalThemeScope localThemeScope = this.f142937b;
                final Function1<AbstractC17144a, Unit> function1 = this.f142938c;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: km.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15255f0.a.c(function1, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                sr.p.C(localThemeScope, modifierF, googleAdSlot1, (Function1) objB, composer, LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 6), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17144a, Unit> f142941c;

        /* JADX WARN: Multi-variable type inference failed */
        b(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC17144a, Unit> function1) {
            this.f142939a = viewState;
            this.f142940b = localThemeScope;
            this.f142941c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, GoogleAdAnalytics it) {
            Intrinsics.j(it, "it");
            function1.invoke(new AbstractC17144a.GoogleAdViewClicked(it));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1606743814, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:347)");
            }
            GoogleAdData googleAdSlot2 = this.f142939a.getGoogleAdSlot2();
            if (googleAdSlot2 != null) {
                LocalThemeScope localThemeScope = this.f142940b;
                final Function1<AbstractC17144a, Unit> function1 = this.f142941c;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: km.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15255f0.b.c(function1, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                sr.p.C(localThemeScope, modifierF, googleAdSlot2, (Function1) objB, composer, LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 6), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.f0$c */
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14028j, Unit> f142942a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MarketingBanner f142943b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super AbstractC14028j, Unit> function1, MarketingBanner marketingBanner) {
            this.f142942a = function1;
            this.f142943b = marketingBanner;
        }

        public final void a() {
            this.f142942a.invoke(new AbstractC14028j.BannerClicked(this.f142943b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.f0$d */
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC18214a, Unit> f142946c;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, k0.ViewState viewState, Function1<? super InterfaceC18214a, Unit> function1) {
            this.f142944a = localThemeScope;
            this.f142945b = viewState;
            this.f142946c = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(520323335, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:81)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f142944a.getAdsSpacing().getSix().getDp()), composer, 0);
            xr.g.c(this.f142944a, this.f142945b.d(), this.f142946c, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), composer, LocalThemeScope.f17314g | 3072, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f142944a.getAdsSpacing().getSix().getDp()), composer, 0);
            C17983Z.a(null, this.f142944a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$e */
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14019a, Unit> f142949c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: km.f0$e$a */
        static final class a implements Function4<InterfaceC6302b, HomeEmailBannerDecorator, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142950a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14019a, Unit> f142951b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super AbstractC14019a, Unit> function1) {
                this.f142950a = localThemeScope;
                this.f142951b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1) {
                function1.invoke(AbstractC14019a.C2090a.f132021a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(AbstractC14019a.b.f132022a);
                return Unit.f143329a;
            }

            public final void c(InterfaceC6302b AnimatedContent, HomeEmailBannerDecorator homeEmailBannerDecorator, Composer composer, int i10) {
                Intrinsics.j(AnimatedContent, "$this$AnimatedContent");
                if (ComposerKt.M()) {
                    ComposerKt.U(1497965321, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:93)");
                }
                if (homeEmailBannerDecorator != null) {
                    LocalThemeScope localThemeScope = this.f142950a;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f142951b);
                    final Function1<AbstractC14019a, Unit> function1 = this.f142951b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: km.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C15255f0.e.a.d(function1);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(this.f142951b);
                    final Function1<AbstractC14019a, Unit> function12 = this.f142951b;
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: km.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C15255f0.e.a.e(function12);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = AbstractC6392a.f60445b;
                    C15258h.k(localThemeScope, homeEmailBannerDecorator, null, function0, (Function0) objB2, composer, i11 | ((i12 | (Ki.C.f16859b | i12)) << 3) | (i10 & 112), 2);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, HomeEmailBannerDecorator homeEmailBannerDecorator, Composer composer, Integer num) {
                c(interfaceC6302b, homeEmailBannerDecorator, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC14019a, Unit> function1) {
            this.f142947a = viewState;
            this.f142948b = localThemeScope;
            this.f142949c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(HomeEmailBannerDecorator homeEmailBannerDecorator) {
            return Boolean.valueOf(homeEmailBannerDecorator != null);
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2054376702, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:92)");
            }
            HomeEmailBannerDecorator homeEmailBannerDecorator = this.f142947a.getHomeEmailBannerDecorator();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: km.h0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15255f0.e.c((HomeEmailBannerDecorator) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1497965321, true, new a(this.f142948b, this.f142949c), composer, 54);
            int i11 = AbstractC6392a.f60445b;
            androidx.compose.animation.a.b(homeEmailBannerDecorator, null, null, null, null, function1, composableLambdaC, composer, i11 | Ki.C.f16859b | i11 | 1769472, 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$f */
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f142954c;

        /* JADX WARN: Multi-variable type inference failed */
        f(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13870f, Unit> function1) {
            this.f142952a = viewState;
            this.f142953b = localThemeScope;
            this.f142954c = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-149061057, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:104)");
            }
            List<OrderStatusCardDecorator> listP = this.f142952a.p();
            if (listP.isEmpty()) {
                listP = null;
            }
            List<OrderStatusCardDecorator> list = listP;
            if (list != null) {
                es.I.i(this.f142953b, null, list, this.f142954c, composer, LocalThemeScope.f17314g, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$g */
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14020b, Unit> f142957c;

        /* JADX WARN: Multi-variable type inference failed */
        g(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC14020b, Unit> function1) {
            this.f142955a = viewState;
            this.f142956b = localThemeScope;
            this.f142957c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, TeachersListCardDecorator teachersListCardDecorator) {
            function1.invoke(new AbstractC14020b.NavigateToTeachersList(teachersListCardDecorator.getDestinationDeeplink()));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1942468480, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:113)");
            }
            final TeachersListCardDecorator teacherListsCardDecorator = this.f142955a.getTeacherListsCardDecorator();
            if (teacherListsCardDecorator != null) {
                LocalThemeScope localThemeScope = this.f142956b;
                final Function1<AbstractC14020b, Unit> function1 = this.f142957c;
                AbstractC6392a title = teacherListsCardDecorator.getTitle();
                AbstractC6392a description = teacherListsCardDecorator.getDescription();
                AbstractC6392a actionButtonTitle = teacherListsCardDecorator.getActionButtonTitle();
                int image = teacherListsCardDecorator.getImage();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function1) | composer.D(teacherListsCardDecorator);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15255f0.g.c(function1, teacherListsCardDecorator);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                int i12 = AbstractC6392a.f60445b;
                C6290c.b(localThemeScope, null, title, description, actionButtonTitle, image, (Function0) objB, composer, i11 | (i12 << 6) | (i12 << 9) | (i12 << 12), 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$h */
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.f f142958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142959b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142960c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f142961d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13555a, Unit> f142962e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14072a, Unit> f142963f;

        /* JADX WARN: Multi-variable type inference failed */
        h(e.f fVar, k0.ViewState viewState, LocalThemeScope localThemeScope, List<ProductListDecorator> list, Function1<? super AbstractC13555a, Unit> function1, Function1<? super AbstractC14072a, Unit> function12) {
            this.f142958a = fVar;
            this.f142959b = viewState;
            this.f142960c = localThemeScope;
            this.f142961d = list;
            this.f142962e = function1;
            this.f142963f = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state, EnumC15218a carouselType) {
            Intrinsics.j(product, "product");
            Intrinsics.j(state, "state");
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13555a.UpdateProductEntry(product, state.getValueState().getQuantity(), carouselType));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, Pk.c coupon, EnumC15218a carouselType) {
            Intrinsics.j(coupon, "coupon");
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13555a.ProductCouponClicked(coupon, carouselType));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, z1 z1Var) {
            EnumC15218a carouselType;
            CarouselDecorator carouselDecoratorT = t(z1Var);
            String deepLink = carouselDecoratorT != null ? carouselDecoratorT.getDeepLink() : null;
            CarouselDecorator carouselDecoratorT2 = t(z1Var);
            String title = carouselDecoratorT2 != null ? carouselDecoratorT2.getTitle() : null;
            if (title == null) {
                title = "";
            }
            CarouselDecorator carouselDecoratorT3 = t(z1Var);
            if (carouselDecoratorT3 == null || (carouselType = carouselDecoratorT3.getCarouselType()) == null) {
                carouselType = EnumC15218a.f142567a;
            }
            function1.invoke(new AbstractC13555a.ViewAll(deepLink, title, carouselType));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1, int i10, EnumC15218a carouselType, boolean z10) {
            Intrinsics.j(carouselType, "carouselType");
            function1.invoke(new AbstractC13555a.ProductClickedPosition(i10, carouselType, z10));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, z1 z1Var) {
            EnumC15218a carouselType;
            CarouselDecorator carouselDecoratorT = t(z1Var);
            String deepLink = carouselDecoratorT != null ? carouselDecoratorT.getDeepLink() : null;
            CarouselDecorator carouselDecoratorT2 = t(z1Var);
            String title = carouselDecoratorT2 != null ? carouselDecoratorT2.getTitle() : null;
            if (title == null) {
                title = "";
            }
            CarouselDecorator carouselDecoratorT3 = t(z1Var);
            if (carouselDecoratorT3 == null || (carouselType = carouselDecoratorT3.getCarouselType()) == null) {
                carouselType = EnumC15218a.f142567a;
            }
            function1.invoke(new AbstractC13555a.ViewAll(deepLink, title, carouselType));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, e.f fVar) {
            function1.invoke(new AbstractC13555a.Retry(fVar));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, z1 z1Var, ProductFullDetails product, String str) {
            EnumC15218a carouselType;
            Intrinsics.j(product, "product");
            CarouselDecorator carouselDecoratorT = t(z1Var);
            if (carouselDecoratorT == null || (carouselType = carouselDecoratorT.getCarouselType()) == null) {
                carouselType = EnumC15218a.f142567a;
            }
            function1.invoke(new AbstractC13555a.ProductClicked(product, str, carouselType));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            l(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
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
        public final void l(l0.InterfaceC15433c r29, androidx.compose.runtime.Composer r30, int r31) {
            /*
                Method dump skipped, instructions count: 635
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: km.C15255f0.h.l(l0.c, androidx.compose.runtime.Composer, int):void");
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
    /* renamed from: km.f0$i */
    static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f142965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142966c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14021c, Unit> f142967d;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, boolean z10, k0.ViewState viewState, Function1<? super AbstractC14021c, Unit> function1) {
            this.f142964a = localThemeScope;
            this.f142965b = z10;
            this.f142966c = viewState;
            this.f142967d = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-260969279, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:216)");
            }
            C15290x.o(this.f142964a, this.f142965b, this.f142966c.getMPerksDecorator(), this.f142966c.getUser().getIsLoggedIn(), this.f142966c.getUser().getFirstName(), null, this.f142967d, composer, LocalThemeScope.f17314g, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$j */
    static final class j implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13720b, Unit> f142970c;

        /* JADX WARN: Multi-variable type inference failed */
        j(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13720b, Unit> function1) {
            this.f142968a = viewState;
            this.f142969b = localThemeScope;
            this.f142970c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, String str, String str2) {
            function1.invoke(new AbstractC13720b.ViewAll(e.c.b.f39992b, str, str2));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(new AbstractC13720b.Retry(e.c.b.f39992b));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String str, HomeDepartment department) {
            Intrinsics.j(department, "department");
            function1.invoke(new AbstractC13720b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.b.f39992b));
            return Unit.f143329a;
        }

        public final void d(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1830560258, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:226)");
            }
            DepartmentCarouselDecorator shopByDepartmentDecorator = this.f142968a.getShopByDepartmentDecorator();
            LocalThemeScope localThemeScope = this.f142969b;
            final Function1<AbstractC13720b, Unit> function1 = this.f142970c;
            AbstractC6392a carouselTitle = shopByDepartmentDecorator.getCarouselTitle();
            int i11 = AbstractC6392a.f60445b;
            final String strA = C13698b.a(carouselTitle, composer, i11);
            final String seeAllDeeplink = shopByDepartmentDecorator.getSeeAllDeeplink();
            Pj.a loadingState = shopByDepartmentDecorator.getLoadingState();
            List<HomeDepartment> listC = shopByDepartmentDecorator.c();
            AbstractC6392a viewAllTitle = shopByDepartmentDecorator.getViewAllTitle();
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.V(strA) | composer.V(seeAllDeeplink);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: km.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15255f0.j.e(function1, strA, seeAllDeeplink);
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
                objB2 = new Function0() { // from class: km.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15255f0.j.f(function1);
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
                objB3 = new Function1() { // from class: km.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15255f0.j.g(function1, strA, (HomeDepartment) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C13724f.b(localThemeScope, null, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, LocalThemeScope.f17314g | (Pj.a.f26096c << 9) | (i11 << 15), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            d(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$k */
    static final class k implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13720b, Unit> f142973c;

        /* JADX WARN: Multi-variable type inference failed */
        k(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13720b, Unit> function1) {
            this.f142971a = viewState;
            this.f142972b = localThemeScope;
            this.f142973c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, String str, String str2) {
            function1.invoke(new AbstractC13720b.ViewAll(e.c.a.f39991b, str, str2));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(new AbstractC13720b.Retry(e.c.a.f39991b));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String str, HomeDepartment department) {
            Intrinsics.j(department, "department");
            function1.invoke(new AbstractC13720b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.a.f39991b));
            return Unit.f143329a;
        }

        public final void d(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-372877501, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:263)");
            }
            DepartmentCarouselDecorator seasonalCarouselDecorator = this.f142971a.getSeasonalCarouselDecorator();
            LocalThemeScope localThemeScope = this.f142972b;
            final Function1<AbstractC13720b, Unit> function1 = this.f142973c;
            AbstractC6392a carouselTitle = seasonalCarouselDecorator.getCarouselTitle();
            int i11 = AbstractC6392a.f60445b;
            final String strA = C13698b.a(carouselTitle, composer, i11);
            final String seeAllDeeplink = seasonalCarouselDecorator.getSeeAllDeeplink();
            Pj.a loadingState = seasonalCarouselDecorator.getLoadingState();
            List<HomeDepartment> listC = seasonalCarouselDecorator.c();
            AbstractC6392a viewAllTitle = seasonalCarouselDecorator.getViewAllTitle();
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.V(strA) | composer.V(seeAllDeeplink);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: km.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15255f0.k.e(function1, strA, seeAllDeeplink);
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
                objB2 = new Function0() { // from class: km.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15255f0.k.f(function1);
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
                objB3 = new Function1() { // from class: km.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15255f0.k.g(function1, strA, (HomeDepartment) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C13724f.b(localThemeScope, null, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, LocalThemeScope.f17314g | (Pj.a.f26096c << 9) | (i11 << 15), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            d(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.f0$l */
    static final class l implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.ViewState f142974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14029k, Unit> f142976c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Qk.a, Unit> f142977d;

        /* JADX WARN: Multi-variable type inference failed */
        l(k0.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super AbstractC14029k, Unit> function1, Function1<? super Qk.a, Unit> function12) {
            this.f142974a = viewState;
            this.f142975b = localThemeScope;
            this.f142976c = function1;
            this.f142977d = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1) {
            function1.invoke(new AbstractC14029k.ViewAll(C14756c.h("Special Offers: View all")));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1) {
            function1.invoke(new AbstractC14029k.ViewAll(C14756c.h("Special Offers: View all")));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1) {
            function1.invoke(AbstractC14029k.a.f132057a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function1 function1, Coupon it) {
            Intrinsics.j(it, "it");
            function1.invoke(new a.ViewCouponDetails(it, null, 2, null));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, Coupon it) {
            Intrinsics.j(it, "it");
            function1.invoke(new a.Clip(it, null, 2, null));
            return Unit.f143329a;
        }

        public final void f(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1718652036, i10, -1, "com.meijer.mobile.home.ux.views.HomeScreenContent.<anonymous>.<anonymous>.<anonymous> (HomeScreenContent.kt:300)");
            }
            SpecialOffersCarouselDecorator specialOffersCarouselDecorator = this.f142974a.getSpecialOffersCarouselDecorator();
            if (specialOffersCarouselDecorator.e().isEmpty()) {
                specialOffersCarouselDecorator = null;
            }
            if (specialOffersCarouselDecorator != null) {
                SpecialOffersCarouselDecorator specialOffersCarouselDecorator2 = specialOffersCarouselDecorator;
                LocalThemeScope localThemeScope = this.f142975b;
                final Function1<AbstractC14029k, Unit> function1 = this.f142976c;
                final Function1<Qk.a, Unit> function12 = this.f142977d;
                List<SpecialOffer> listE = specialOffersCarouselDecorator2.e();
                int carouselItemsCount = specialOffersCarouselDecorator2.getCarouselItemsCount();
                String strA = C13698b.a(specialOffersCarouselDecorator2.getCarouselTitle(), composer, AbstractC6392a.f60445b);
                Pj.a loadingState = specialOffersCarouselDecorator2.getLoadingState();
                String bannerResource = specialOffersCarouselDecorator2.getBannerResource();
                Integer bannerErrorImageResource = specialOffersCarouselDecorator2.getBannerErrorImageResource();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.z0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15255f0.l.k(function1);
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
                    objB2 = new Function0() { // from class: km.A0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15255f0.l.l(function1);
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
                    objB3 = new Function1() { // from class: km.B0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15255f0.l.o(function12, (Coupon) obj);
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
                    objB4 = new Function1() { // from class: km.C0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15255f0.l.p(function12, (Coupon) obj);
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
                    objB5 = new Function0() { // from class: km.D0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15255f0.l.g(function1);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                d1.b(localThemeScope, listE, strA, loadingState, null, bannerResource, bannerErrorImageResource, carouselItemsCount, function0, function02, function13, function14, (Function0) objB5, composer, LocalThemeScope.f17314g | (Pj.a.f26096c << 9), 0, 8);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            f(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: km.f0$m */
    public static final class m extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final m f142978f = new m();

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
    /* renamed from: km.f0$n */
    public static final class n extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f142979f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f142980g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function1 function1, List list) {
            super(1);
            this.f142979f = function1;
            this.f142980g = list;
        }

        public final Object a(int i10) {
            return this.f142979f.invoke(this.f142980g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: km.f0$o */
    public static final class o extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f142981f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142982g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f142983h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f142981f = list;
            this.f142982g = localThemeScope;
            this.f142983h = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            MarketingBanner marketingBanner = (MarketingBanner) this.f142981f.get(i10);
            composer.startReplaceGroup(1353839095);
            LocalThemeScope localThemeScope = this.f142982g;
            String bannerImageURL = marketingBanner.getBannerImageURL();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f142983h) | composer.D(marketingBanner);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f142983h, marketingBanner);
                composer.t(objB);
            }
            composer.P();
            W.d(localThemeScope, bannerImageURL, null, null, (Function0) objB, composer, LocalThemeScope.f17314g, 6);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
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
    public static final void d(final Ki.LocalThemeScope r30, final com.meijer.mobile.home.ux.k0.ViewState r31, final boolean r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super xr.InterfaceC18214a, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super ds.AbstractC13720b, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super fm.AbstractC14029k, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super sr.AbstractC17144a, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super fm.AbstractC14028j, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super fm.AbstractC14020b, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super fm.AbstractC14021c, kotlin.Unit> r42, kotlin.jvm.functions.Function1<? super fm.AbstractC14019a, kotlin.Unit> r43, final kotlin.jvm.functions.Function1<? super cs.AbstractC13555a, kotlin.Unit> r44, final kotlin.jvm.functions.Function1<? super fs.AbstractC14072a, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C15255f0.d(Ki.M, com.meijer.mobile.home.ux.k0$m, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(AbstractC14019a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
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
        LazyColumn.i(listO.size(), null, new n(m.f142978f, listO), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new o(listO, localThemeScope4, function112)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, k0.ViewState viewState, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, Function1 function112, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, viewState, z10, modifier, function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, function112, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }
}
