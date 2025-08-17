package Pr;

import Ji.LocalThemeScope;
import P0.e;
import Pk.a;
import Pr.C5037o;
import Xr.ToolBarDecorator;
import Xr.a;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.C14815g;
import j0.InterfaceC14794C;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji.q1;
import kotlin.C17927c1;
import kotlin.C17986y0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import p1.C16193g;
import yr.C18286l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¤\u0001\u0010\u0016\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aV\u0010\u001a\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001au\u0010&\u001a\u00020\u000f*\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"LJi/M;", "Lx0/c1;", "scaffoldState", "", "isCouponsLoading", "isFetchCouponsFailed", "Landroidx/compose/ui/Modifier;", "modifier", "LXr/e;", "toolBarDecorator", "", "adBannerUrl", "adBannerTitle", "adBannerDescription", "Lkotlin/Function0;", "", "onBackClicked", "onRetryButtonClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "content", "i", "(LJi/M;Lx0/c1;ZZLandroidx/compose/ui/Modifier;LXr/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "LOj/a;", "loadingState", "k", "(LJi/M;LOj/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "m", "(LJi/M;LXr/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "LXr/a;", "couponItems", "noCouponResult", "Lak/a;", "noCouponText", "LPk/a;", "onCouponAction", "f", "(LJi/M;Ljava/util/List;ZLak/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pr.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5037o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pr.o$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28949a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f28950b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f28951c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Xr.a aVar, Function1<? super Pk.a, Unit> function1) {
            this.f28949a = localThemeScope;
            this.f28950b = aVar;
            this.f28951c = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2112984549, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:242)");
            }
            C.f(this.f28949a, null, ((a.Coupon) this.f28950b).getCouponListItemDecorator(), null, this.f28951c, composer, LocalThemeScope.f15770g, 5);
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
    /* renamed from: Pr.o$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f28953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f28954c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Xr.a aVar, Function1<? super Pk.a, Unit> function1) {
            this.f28952a = localThemeScope;
            this.f28953b = aVar;
            this.f28954c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Xr.a aVar, Function1 function1) {
            if (((a.SpecialOffersBanner) aVar).getIsClickable()) {
                function1.invoke(new a.ViewCouponList(Pk.c.f28336l, null, 2, null));
            }
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1972940978, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:251)");
            }
            LocalThemeScope localThemeScope = this.f28952a;
            String specialOffersUrl = ((a.SpecialOffersBanner) this.f28953b).getSpecialOffersUrl();
            boolean isClickable = ((a.SpecialOffersBanner) this.f28953b).getIsClickable();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f28953b) | composer.V(this.f28954c);
            final Xr.a aVar = this.f28953b;
            final Function1<Pk.a, Unit> function1 = this.f28954c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pr.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5037o.b.c(aVar, function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            w.e(localThemeScope, null, specialOffersUrl, null, null, isClickable, (Function0) objB, composer, LocalThemeScope.f15770g, 13);
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
    /* renamed from: Pr.o$c */
    static final class c implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f28956b;

        c(LocalThemeScope localThemeScope, Xr.a aVar) {
            this.f28955a = localThemeScope;
            this.f28956b = aVar;
        }

        public final void a(InterfaceC15343c stickyHeader, int i10, Composer composer, int i11) {
            Intrinsics.j(stickyHeader, "$this$stickyHeader");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-867836679, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:265)");
            }
            w.j(this.f28955a, ((a.SpecialOffersHeader) this.f28956b).getTitle(), null, composer, LocalThemeScope.f15770g, 2);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pr.o$d */
    static final class d implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f28958b;

        d(LocalThemeScope localThemeScope, Xr.a aVar) {
            this.f28957a = localThemeScope;
            this.f28958b = aVar;
        }

        public final void a(InterfaceC15343c stickyHeader, int i10, Composer composer, int i11) {
            Intrinsics.j(stickyHeader, "$this$stickyHeader");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-523273320, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:271)");
            }
            LocalThemeScope localThemeScope = this.f28957a;
            String imageURL = ((a.Ad) this.f28958b).getImageURL();
            String imageDescription = ((a.Ad) this.f28958b).getImageDescription();
            if (imageDescription == null) {
                imageDescription = ((a.Ad) this.f28958b).getTitle();
            }
            w.e(localThemeScope, null, imageURL, null, imageDescription, false, null, composer, LocalThemeScope.f15770g, 53);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.o$e */
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f28960b;

        e(LocalThemeScope localThemeScope, Xr.a aVar) {
            this.f28959a = localThemeScope;
            this.f28960b = aVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-939250901, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListComposables.kt:280)");
            }
            LocalThemeScope localThemeScope = this.f28959a;
            String name = ((a.Header) this.f28960b).getName();
            String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22695D, Integer.valueOf(((a.Header) this.f28960b).getSize()));
            Intrinsics.i(string, "getString(...)");
            w.h(localThemeScope, name, string, null, composer, LocalThemeScope.f15770g, 4);
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
    /* renamed from: Pr.o$f */
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ToolBarDecorator f28961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28963c;

        f(ToolBarDecorator toolBarDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f28961a = toolBarDecorator;
            this.f28962b = localThemeScope;
            this.f28963c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-890667489, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsLayout.<anonymous>.<anonymous> (CouponListComposables.kt:84)");
            }
            ToolBarDecorator toolBarDecorator = this.f28961a;
            if (toolBarDecorator != null) {
                C5037o.m(this.f28962b, toolBarDecorator, null, this.f28963c, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 2);
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
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.o$g */
    static final class g implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f28964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f28965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28966c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f28967d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28968e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28969f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f28970g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f28971h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28972i;

        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z10, Modifier modifier, boolean z11, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, String str, LocalThemeScope localThemeScope, String str2, String str3, Function0<Unit> function0) {
            this.f28964a = z10;
            this.f28965b = modifier;
            this.f28966c = z11;
            this.f28967d = function3;
            this.f28968e = str;
            this.f28969f = localThemeScope;
            this.f28970g = str2;
            this.f28971h = str3;
            this.f28972i = function0;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            LocalThemeScope localThemeScope;
            Composer composer2 = composer;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer2.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1657331560, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponsLayout.<anonymous>.<anonymous> (CouponListComposables.kt:92)");
            }
            if (this.f28964a) {
                composer2.startReplaceGroup(1379641869);
                Modifier modifierD = androidx.compose.foundation.layout.J.D(this.f28965b, null, false, 3, null);
                C5658d.f fVarB = C5658d.f48555a.b();
                e.b bVarG = P0.e.INSTANCE.g();
                String str = this.f28968e;
                LocalThemeScope localThemeScope2 = this.f28969f;
                String str2 = this.f28970g;
                String str3 = this.f28971h;
                Modifier modifier = this.f28965b;
                Function0<Unit> function0 = this.f28972i;
                MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer2, 54);
                int iA = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = D1.a(composer2);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                composer2.startReplaceGroup(-1502577797);
                if (str == null || str.length() == 0) {
                    localThemeScope = localThemeScope2;
                } else {
                    if (str2 == null) {
                        str2 = str3;
                    }
                    localThemeScope = localThemeScope2;
                    w.e(localThemeScope, null, str, null, str2, false, null, composer, LocalThemeScope.f15770g, 53);
                    composer2 = composer;
                }
                composer2.P();
                String strC = C16193g.c(Nr.g.f22702I, composer2, 0);
                String upperCase = C16193g.c(Nr.g.f22723b0, composer2, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                C18286l.b(localThemeScope, strC, upperCase, modifier, function0, composer2, LocalThemeScope.f15770g, 0);
                composer2.v();
                composer2.P();
            } else if (this.f28966c) {
                composer2.startReplaceGroup(1380732418);
                P0.e eVarE = P0.e.INSTANCE.e();
                Modifier modifierF = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
                LocalThemeScope localThemeScope3 = this.f28969f;
                MeasurePolicy measurePolicyG = C5662h.g(eVarE, false);
                int iA2 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierF);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A2 = companion2.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyG, companion2.e());
                D1.c(composerA2, interfaceC5742sR2, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C5664j c5664j = C5664j.f48612a;
                yr.N.b(localThemeScope3, null, composer2, LocalThemeScope.f15770g, 1);
                composer2.v();
                composer2.P();
            } else {
                composer2.startReplaceGroup(1381075898);
                this.f28967d.invoke(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer2, 0);
                composer2.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.o$h */
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ToolBarDecorator f28973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28974b;

        h(ToolBarDecorator toolBarDecorator, LocalThemeScope localThemeScope) {
            this.f28973a = toolBarDecorator;
            this.f28974b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1935282948, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.Toolbar.<anonymous> (CouponListComposables.kt:181)");
            }
            String strA = bk.d.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()), this.f28973a.getTitle());
            ri.j.h(this.f28974b, new q1.Label(null, this.f28974b.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f28974b.getAdsTypography().getHeadings().getSix(), null, 381, null), strA, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.o$i */
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28975a;

        i(Function0<Unit> function0) {
            this.f28975a = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1436726146, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.Toolbar.<anonymous> (CouponListComposables.kt:190)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f28975a);
            final Function0<Unit> function0 = this.f28975a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pr.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5037o.i.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17986y0.a((Function0) objB, null, false, null, C5024b.f28861a.a(), composer, 24576, 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4 A[PHI: r19
      0x00c4: PHI (r19v12 int) = (r19v0 int), (r19v6 int), (r19v7 int) binds: [B:60:0x00c2, B:70:0x00df, B:69:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r33, final kotlin.C17927c1 r34, final boolean r35, final boolean r36, androidx.compose.ui.Modifier r37, Xr.ToolBarDecorator r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C5037o.i(Ji.M, x0.c1, boolean, boolean, androidx.compose.ui.Modifier, Xr.e, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r43, final java.util.List<? extends Xr.a> r44, final boolean r45, final ak.AbstractC5607a r46, androidx.compose.ui.Modifier r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C5037o.f(Ji.M, java.util.List, boolean, ak.a, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, List list, boolean z10, AbstractC5607a abstractC5607a, Modifier modifier, String str, String str2, String str3, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, list, z10, abstractC5607a, modifier, str, str2, str3, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(List list, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Xr.a aVar = (Xr.a) it.next();
            if (aVar instanceof a.Coupon) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2112984549, true, new a(localThemeScope, aVar, function1)), 3, null);
            } else if (aVar instanceof a.SpecialOffersBanner) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1972940978, true, new b(localThemeScope, aVar, function1)), 3, null);
            } else if (aVar instanceof a.SpecialOffersHeader) {
                l0.w.d(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-867836679, true, new c(localThemeScope, aVar)), 3, null);
            } else if (aVar instanceof a.Ad) {
                l0.w.d(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-523273320, true, new d(localThemeScope, aVar)), 3, null);
            } else {
                if (!(aVar instanceof a.Header)) {
                    throw new NoWhenBranchMatchedException();
                }
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-939250901, true, new e(localThemeScope, aVar)), 3, null);
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, C17927c1 c17927c1, boolean z10, boolean z11, Modifier modifier, ToolBarDecorator toolBarDecorator, String str, String str2, String str3, Function0 function0, Function0 function02, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        i(localThemeScope, c17927c1, z10, z11, modifier, toolBarDecorator, str, str2, str3, function0, function02, function3, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r18, final Oj.a r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C5037o.k(Ji.M, Oj.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Oj.a aVar, Modifier modifier, Function0 function0, Function3 function3, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, aVar, modifier, function0, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r18, final Xr.ToolBarDecorator r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C5037o.m(Ji.M, Xr.e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, ToolBarDecorator toolBarDecorator, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, toolBarDecorator, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
