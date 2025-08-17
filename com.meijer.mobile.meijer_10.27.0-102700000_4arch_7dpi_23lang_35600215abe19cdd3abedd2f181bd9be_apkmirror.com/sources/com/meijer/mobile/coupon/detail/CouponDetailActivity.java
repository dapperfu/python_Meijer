package com.meijer.mobile.coupon.detail;

import Co.ProductFullDetails;
import Ir.UserActionDialogInfo;
import Ji.LocalThemeScope;
import Ok.Coupon;
import Or.C4496c;
import Pk.a;
import Sr.b;
import V2.CreationExtras;
import Wr.CouponSavingsCountdownDecorator;
import Yr.CouponsProductDecorator;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.coupon.detail.CouponDetailActivity;
import com.meijer.mobile.coupon.detail.L;
import e.C13589e;
import el.C13686c;
import java.util.List;
import java.util.Locale;
import kotlin.C17927c1;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mk.l;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import ur.AbstractC17302a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u001f\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J=\u00103\u001a\u00020\f*\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\b\b\u0002\u00102\u001a\u000201H\u0003¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105H\u0014¢\u0006\u0004\b7\u00108J3\u00109\u001a\u00020\f*\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0014¢\u0006\u0004\b;\u0010\u0003R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/meijer/mobile/coupon/detail/CouponDetailActivity;", "Lcom/meijer/mobile/coupon/di/CouponFeatureActivity;", "<init>", "()V", "LJi/M;", "", "messageResId", "actionResId", "LOk/a;", "coupon", "", "newShoppingListEnabled", "", "e2", "(LJi/M;IILOk/a;Z)V", "g2", "(LJi/M;II)V", "f2", "(LJi/M;I)V", "i2", "(I)V", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "exception", "Lcom/meijer/mobile/coupon/detail/L$d;", "couponActionType", "h2", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;Lcom/meijer/mobile/coupon/detail/L$d;)V", "titleResId", "requireAcknowledgement", "j2", "(IIZ)V", "c2", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "a2", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "", "previousTrackAction", "b2", "(LCo/h;Ljava/lang/String;)V", "Z1", "(LOk/a;)V", "Lcom/meijer/mobile/coupon/detail/L$g;", "viewState", "isUserLoggedIn", "showPrimary", "showSecondary", "Landroidx/compose/ui/Modifier;", "modifier", "H1", "(LJi/M;Lcom/meijer/mobile/coupon/detail/L$g;ZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "F1", "(LJi/M;Lcom/meijer/mobile/coupon/detail/L$g;ZZZLandroidx/compose/runtime/Composer;I)V", "onPause", "Lcom/meijer/mobile/coupon/detail/L;", "C", "Lkotlin/Lazy;", "Y1", "()Lcom/meijer/mobile/coupon/detail/L;", "couponDetailViewModel", "Lx0/c1;", "D", "Lx0/c1;", "scaffoldState", "Lqv/O;", "E", "Lqv/O;", "coroutineScope", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CouponDetailActivity extends Hilt_CouponDetailActivity {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponDetailViewModel = new e0(Reflection.b(L.class), new j(this), new i(this), new k(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private C17927c1 scaffoldState;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O coroutineScope;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L.ViewState f96167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Coupon f96168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96169c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96170d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96171e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CouponDetailActivity f96172f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f96173g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.CouponDetailActivity$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1360a extends FunctionReferenceImpl implements Function2<ProductFullDetails, String, Unit> {
            C1360a(Object obj) {
                super(2, obj, CouponDetailActivity.class, "onProductClicked", "onProductClicked(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Ljava/lang/String;)V", 0);
            }

            public final void a(ProductFullDetails p02, String str) {
                Intrinsics.j(p02, "p0");
                ((CouponDetailActivity) this.receiver).b2(p02, str);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, String str) {
                a(productFullDetails, str);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
            b(Object obj) {
                super(2, obj, CouponDetailActivity.class, "onEntryUpdate", "onEntryUpdate(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
            }

            public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                Intrinsics.j(p02, "p0");
                Intrinsics.j(p12, "p1");
                ((CouponDetailActivity) this.receiver).a2(p02, p12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                a(productFullDetails, aVar);
                return Unit.f142422a;
            }
        }

        a(L.ViewState viewState, Coupon coupon, boolean z10, boolean z11, LocalThemeScope localThemeScope, CouponDetailActivity couponDetailActivity, boolean z12) {
            this.f96167a = viewState;
            this.f96168b = coupon;
            this.f96169c = z10;
            this.f96170d = z11;
            this.f96171e = localThemeScope;
            this.f96172f = couponDetailActivity;
            this.f96173g = z12;
        }

        public final void f(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2116039558, i10, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.CDPContent.<anonymous> (CouponDetailActivity.kt:423)");
            }
            final UserActionDialogInfo<AbstractC17302a> userActionDialogInfoD = this.f96167a.d();
            composer2.startReplaceGroup(-1994482054);
            if (userActionDialogInfoD != null) {
                LocalThemeScope localThemeScope = this.f96171e;
                final CouponDetailActivity couponDetailActivity = this.f96172f;
                String strC = C16193g.c(userActionDialogInfoD.getTitle(), composer2, 0);
                String strC2 = C16193g.c(userActionDialogInfoD.getBody(), composer2, 0);
                String strC3 = C16193g.c(userActionDialogInfoD.getPositiveButtonText(), composer2, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC3.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                String upperCase2 = C16193g.c(userActionDialogInfoD.getNegativeButtonText(), composer2, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(couponDetailActivity) | composer2.D(userActionDialogInfoD);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.coupon.detail.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.a.l(couponDetailActivity, userActionDialogInfoD);
                        }
                    };
                    composer2.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD2 = composer2.D(couponDetailActivity) | composer2.D(userActionDialogInfoD);
                Object objB2 = composer2.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.coupon.detail.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.a.o(couponDetailActivity, userActionDialogInfoD);
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                C4496c.c(localThemeScope, strC, strC2, upperCase, upperCase2, function0, (Function0) objB2, composer2, LocalThemeScope.f15770g);
                composer2 = composer2;
            }
            composer2.P();
            composer2.startReplaceGroup(-1994452740);
            if (this.f96167a.getCouponState().getAssociatedProductsState().b().isEmpty()) {
                Or.A.s(this.f96168b.getImageURL(), null, composer2, 0, 2);
            }
            composer2.P();
            AbstractC5607a abstractC5607aI = Qr.a.i(this.f96168b, this.f96169c, this.f96170d);
            composer2.startReplaceGroup(-1994444594);
            if (abstractC5607aI != null) {
                LocalThemeScope localThemeScope2 = this.f96171e;
                final Coupon coupon = this.f96168b;
                boolean z10 = this.f96169c;
                boolean z11 = this.f96170d;
                final CouponDetailActivity couponDetailActivity2 = this.f96172f;
                boolean zL = Qr.a.l(coupon, z10, z11);
                composer2.startReplaceGroup(-1633490746);
                boolean zD3 = composer2.D(couponDetailActivity2) | composer2.D(coupon);
                Object objB3 = composer2.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.coupon.detail.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.a.p(couponDetailActivity2, coupon);
                        }
                    };
                    composer2.t(objB3);
                }
                composer2.P();
                Or.A.C(localThemeScope2, abstractC5607aI, zL, null, (Function0) objB3, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            }
            composer.P();
            LocalThemeScope localThemeScope3 = this.f96171e;
            String title = this.f96168b.getTitle();
            int i11 = LocalThemeScope.f15770g;
            Or.A.y(localThemeScope3, title, null, composer, i11, 2);
            Or.A.m(this.f96171e, this.f96168b.getDescription(), null, composer, i11, 2);
            LocalThemeScope localThemeScope4 = this.f96171e;
            CouponSavingsCountdownDecorator countdownDecorator = this.f96167a.getCountdownDecorator();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Or.I.g(localThemeScope4, countdownDecorator, androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null), composer, i11 | (CouponSavingsCountdownDecorator.f38995f << 3), 0);
            Or.A.o(this.f96171e, androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), composer, i11 | 48, 0);
            String termsAndConditions = this.f96168b.getTermsAndConditions();
            composer.startReplaceGroup(-1994405026);
            if (termsAndConditions != null) {
                Or.A.w(this.f96171e, termsAndConditions, composer, i11);
                Unit unit = Unit.f142422a;
            }
            composer.P();
            Or.A.o(this.f96171e, null, composer, i11, 1);
            Or.A.q(this.f96171e, C13686c.b(this.f96168b, (Context) composer.o(AndroidCompositionLocals_androidKt.g()), null, 2, null), null, composer, i11 | (AbstractC5607a.f45514b << 3), 2);
            boolean isLoading = this.f96167a.getCouponState().getAssociatedProductsState().getLoadingState().getIsLoading();
            boolean shouldShowHeader = this.f96167a.getShouldShowHeader();
            List<CouponsProductDecorator> listF = this.f96167a.f();
            boolean z12 = !(listF == null || listF.isEmpty());
            CouponsProductDecorator couponDetailProductDecoratorSingleItem = this.f96167a.getCouponDetailProductDecoratorSingleItem();
            List<CouponsProductDecorator> listF2 = this.f96167a.f();
            boolean z13 = this.f96167a.getCouponState().getAssociatedProductsState().getLoadingState() == Xk.a.f39412d;
            int size = this.f96167a.getCouponState().getAssociatedProductsState().b().size();
            CouponDetailActivity couponDetailActivity3 = this.f96172f;
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(couponDetailActivity3);
            Object objB4 = composer.B();
            if (zD4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new C1360a(couponDetailActivity3);
                composer.t(objB4);
            }
            KFunction kFunction = (KFunction) objB4;
            composer.P();
            CouponDetailActivity couponDetailActivity4 = this.f96172f;
            composer.startReplaceGroup(5004770);
            boolean zD5 = composer.D(couponDetailActivity4);
            Object objB5 = composer.B();
            if (zD5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new b(couponDetailActivity4);
                composer.t(objB5);
            }
            composer.P();
            LocalThemeScope localThemeScope5 = this.f96171e;
            boolean z14 = this.f96173g;
            Function2 function2 = (Function2) kFunction;
            Function2 function22 = (Function2) ((KFunction) objB5);
            composer.startReplaceGroup(-1633490746);
            boolean zD6 = composer.D(this.f96172f) | composer.D(this.f96168b);
            final CouponDetailActivity couponDetailActivity5 = this.f96172f;
            final Coupon coupon2 = this.f96168b;
            Object objB6 = composer.B();
            if (zD6 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.coupon.detail.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CouponDetailActivity.a.g(couponDetailActivity5, coupon2);
                    }
                };
                composer.t(objB6);
            }
            Function0 function02 = (Function0) objB6;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD7 = composer.D(this.f96172f);
            final CouponDetailActivity couponDetailActivity6 = this.f96172f;
            Object objB7 = composer.B();
            if (zD7 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new Function0() { // from class: com.meijer.mobile.coupon.detail.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CouponDetailActivity.a.k(couponDetailActivity6);
                    }
                };
                composer.t(objB7);
            }
            composer.P();
            Or.A.u(localThemeScope5, isLoading, shouldShowHeader, z12, z13, size, z14, null, couponDetailProductDecoratorSingleItem, listF2, function2, function22, function02, (Function0) objB7, composer, (CouponsProductDecorator.f40467A << 24) | i11, 0, 64);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            f(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(CouponDetailActivity couponDetailActivity, Coupon coupon) {
            couponDetailActivity.Z1(coupon);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(CouponDetailActivity couponDetailActivity) {
            couponDetailActivity.Y1().n0(L.AbstractC11592c.d.f96259a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(CouponDetailActivity couponDetailActivity, UserActionDialogInfo userActionDialogInfo) {
            couponDetailActivity.Y1().n0(new L.AbstractC11592c.UserAcceptAddToCartAction((AbstractC17302a) userActionDialogInfo.b()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(CouponDetailActivity couponDetailActivity, UserActionDialogInfo userActionDialogInfo) {
            couponDetailActivity.Y1().n0(new L.AbstractC11592c.UserDeclineAddToCartAction(((AbstractC17302a) userActionDialogInfo.b()).getProductCode()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(CouponDetailActivity couponDetailActivity, Coupon coupon) {
            couponDetailActivity.startActivity(Al.c.b(couponDetailActivity, coupon.s(), coupon.getHatText(), false, couponDetailActivity.u1().e(AbstractC18227f.M.f170552h)));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L.ViewState f96174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96175b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponDetailActivity f96176c;

        b(L.ViewState viewState, LocalThemeScope localThemeScope, CouponDetailActivity couponDetailActivity) {
            this.f96174a = viewState;
            this.f96175b = localThemeScope;
            this.f96176c = couponDetailActivity;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(407095740, i10, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.CouponDetailLayout.<anonymous> (CouponDetailActivity.kt:377)");
            }
            final Coupon coupon = this.f96174a.getCouponState().getCoupon();
            if (this.f96174a.getCouponIsLoaded() && (!coupon.x() || (coupon.x() && !coupon.getIsMeijerBuck()))) {
                LocalThemeScope localThemeScope = this.f96175b;
                boolean zX = coupon.x();
                boolean isMeijerBuck = coupon.getIsMeijerBuck();
                boolean z10 = (coupon.x() || coupon.y() || coupon.getIsSpecialOffer()) ? false : true;
                Pk.b couponActionLoadingState = this.f96174a.getCouponState().getCouponActionLoadingState();
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f96176c) | composer.D(coupon);
                final CouponDetailActivity couponDetailActivity = this.f96176c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.coupon.detail.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.b.e(couponDetailActivity, coupon);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f96176c) | composer.D(coupon);
                final CouponDetailActivity couponDetailActivity2 = this.f96176c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.coupon.detail.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.b.f(couponDetailActivity2, coupon);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(this.f96176c) | composer.D(coupon);
                final CouponDetailActivity couponDetailActivity3 = this.f96176c;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.coupon.detail.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CouponDetailActivity.b.g(couponDetailActivity3, coupon);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Or.n.d(localThemeScope, zX, isMeijerBuck, z10, couponActionLoadingState, function0, function02, (Function0) objB3, composer, LocalThemeScope.f15770g);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(CouponDetailActivity couponDetailActivity, Coupon coupon) {
            couponDetailActivity.Y1().onAction(new a.NotInterested(coupon, null, 2, null));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(CouponDetailActivity couponDetailActivity, Coupon coupon) {
            couponDetailActivity.Y1().onAction(new a.Clip(coupon, null, 2, null));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(CouponDetailActivity couponDetailActivity, Coupon coupon) {
            couponDetailActivity.Y1().onAction(new a.Unclip(coupon, null, 2, null));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L.ViewState f96179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f96181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f96182f;

        c(LocalThemeScope localThemeScope, L.ViewState viewState, boolean z10, boolean z11, boolean z12) {
            this.f96178b = localThemeScope;
            this.f96179c = viewState;
            this.f96180d = z10;
            this.f96181e = z11;
            this.f96182f = z12;
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(942919654, i10, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.CouponDetailLayout.<anonymous> (CouponDetailActivity.kt:404)");
            }
            CouponDetailActivity.this.F1(this.f96178b, this.f96179c, this.f96180d, this.f96181e, this.f96182f, composer, LocalThemeScope.f15770g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f96184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96185c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CouponDetailActivity f96186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f96187b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f96188c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$onCreate$1$1$1$1", f = "CouponDetailActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.coupon.detail.CouponDetailActivity$d$a$a, reason: collision with other inner class name */
            static final class C1361a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96189a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponDetailActivity f96190b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96191c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$onCreate$1$1$1$1$1", f = "CouponDetailActivity.kt", l = {l3.f92485d}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.coupon.detail.CouponDetailActivity$d$a$a$a, reason: collision with other inner class name */
                static final class C1362a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f96192a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CouponDetailActivity f96193b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f96194c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$onCreate$1$1$1$1$1$1", f = "CouponDetailActivity.kt", l = {128}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.coupon.detail.CouponDetailActivity$d$a$a$a$a, reason: collision with other inner class name */
                    static final class C1363a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f96195a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ CouponDetailActivity f96196b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f96197c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.coupon.detail.CouponDetailActivity$d$a$a$a$a$a, reason: collision with other inner class name */
                        static final class C1364a<T> implements InterfaceC17153g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ CouponDetailActivity f96198a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f96199b;

                            C1364a(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope) {
                                this.f96198a = couponDetailActivity;
                                this.f96199b = localThemeScope;
                            }

                            @Override // tv.InterfaceC17153g
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Object emit(L.f fVar, Continuation<? super Unit> continuation) {
                                if (fVar instanceof L.f.CouponAddedToShoppingListEvent) {
                                    L.f.CouponAddedToShoppingListEvent couponAddedToShoppingListEvent = (L.f.CouponAddedToShoppingListEvent) fVar;
                                    this.f96198a.e2(this.f96199b, couponAddedToShoppingListEvent.getMessageResId(), couponAddedToShoppingListEvent.getActionResId(), couponAddedToShoppingListEvent.getCoupon(), couponAddedToShoppingListEvent.getNewShoppingListEnabled());
                                } else if (fVar instanceof L.f.UpdateCartSuccessEvent) {
                                    L.f.UpdateCartSuccessEvent updateCartSuccessEvent = (L.f.UpdateCartSuccessEvent) fVar;
                                    this.f96198a.g2(this.f96199b, updateCartSuccessEvent.getMessageResId(), updateCartSuccessEvent.getActionResId());
                                } else if (fVar instanceof L.f.UpdateCartFailedEvent) {
                                    this.f96198a.f2(this.f96199b, ((L.f.UpdateCartFailedEvent) fVar).getMessageResId());
                                } else if (fVar instanceof L.f.RequiresLoginEvent) {
                                    this.f96198a.i2(((L.f.RequiresLoginEvent) fVar).getMessageResId());
                                } else if (fVar instanceof L.f.SimpleOkAlertDialogEvent) {
                                    L.f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = (L.f.SimpleOkAlertDialogEvent) fVar;
                                    this.f96198a.j2(simpleOkAlertDialogEvent.getMessageResId(), simpleOkAlertDialogEvent.getTitleResId(), simpleOkAlertDialogEvent.getRequireAcknowledgement());
                                } else if (fVar instanceof L.f.ClipUnclipCouponFailureEvent) {
                                    L.f.ClipUnclipCouponFailureEvent clipUnclipCouponFailureEvent = (L.f.ClipUnclipCouponFailureEvent) fVar;
                                    this.f96198a.h2(clipUnclipCouponFailureEvent.getCouponException(), clipUnclipCouponFailureEvent.getCouponActionType());
                                } else {
                                    if (!Intrinsics.e(fVar, L.f.c.f96315a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f96198a.c2();
                                }
                                return Unit.f142422a;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1363a(this.f96196b, this.f96197c, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1363a(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1363a> continuation) {
                            super(2, continuation);
                            this.f96196b = couponDetailActivity;
                            this.f96197c = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1363a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f96195a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                InterfaceC17144F<L.f> interfaceC17144FA0 = this.f96196b.Y1().a0();
                                C1364a c1364a = new C1364a(this.f96196b, this.f96197c);
                                this.f96195a = 1;
                                if (interfaceC17144FA0.collect(c1364a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1362a(this.f96193b, this.f96194c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1362a(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1362a> continuation) {
                        super(2, continuation);
                        this.f96193b = couponDetailActivity;
                        this.f96194c = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1362a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f96192a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            CouponDetailActivity couponDetailActivity = this.f96193b;
                            AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                            C1363a c1363a = new C1363a(couponDetailActivity, this.f96194c, null);
                            this.f96192a = 1;
                            if (C5994J.b(couponDetailActivity, bVar, c1363a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1361a(this.f96190b, this.f96191c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1361a(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1361a> continuation) {
                    super(2, continuation);
                    this.f96190b = couponDetailActivity;
                    this.f96191c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1361a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96189a == 0) {
                        ResultKt.b(obj);
                        C16648k.d(C6031t.a(this.f96190b), null, null, new C1362a(this.f96190b, this.f96191c, null), 3, null);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(CouponDetailActivity couponDetailActivity, boolean z10, boolean z11) {
                this.f96186a = couponDetailActivity;
                this.f96187b = z10;
                this.f96188c = z11;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Object obj;
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
                    ComposerKt.U(-1445914043, i11, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.onCreate.<anonymous>.<anonymous> (CouponDetailActivity.kt:116)");
                }
                CouponDetailActivity couponDetailActivity = this.f96186a;
                int i12 = i11 & 14;
                couponDetailActivity.H1(AdsTheme, (L.ViewState) o1.b(couponDetailActivity.Y1().Z(), null, composer, 0, 1).getValue(), this.f96187b, this.f96188c, this.f96186a.w1().b(), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, LocalThemeScope.f15770g | i12, 0);
                Boolean bool = Boolean.TRUE;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f96186a) | (i12 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme)));
                CouponDetailActivity couponDetailActivity2 = this.f96186a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1361a(couponDetailActivity2, AdsTheme, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
                L lY1 = this.f96186a.Y1();
                Intent intent = this.f96186a.getIntent();
                Intrinsics.i(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.COUPON", Ok.c.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.COUPON");
                    obj = (Ok.c) (parcelableExtra instanceof Ok.c ? parcelableExtra : null);
                }
                Intrinsics.g(obj);
                lY1.n0(new L.AbstractC11592c.Initialize((Ok.c) obj, this.f96186a.getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION")));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(boolean z10, boolean z11) {
            this.f96184b = z10;
            this.f96185c = z11;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2006154484, i10, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.onCreate.<anonymous> (CouponDetailActivity.kt:115)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1445914043, true, new a(CouponDetailActivity.this, this.f96184b, this.f96185c), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$showAddedToShoppingListMessage$1", f = "CouponDetailActivity.kt", l = {195, 195}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96200a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponDetailActivity f96202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96204e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Coupon f96205f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f96206g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f96201b, this.f96202c, this.f96203d, this.f96204e, this.f96205f, this.f96206g, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(LocalThemeScope localThemeScope, CouponDetailActivity couponDetailActivity, int i10, int i11, Coupon coupon, boolean z10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f96201b = localThemeScope;
            this.f96202c = couponDetailActivity;
            this.f96203d = i10;
            this.f96204e = i11;
            this.f96205f = coupon;
            this.f96206g = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(CouponDetailActivity couponDetailActivity, Coupon coupon, boolean z10) {
            couponDetailActivity.startActivity(couponDetailActivity.v1().F(couponDetailActivity, new l.Coupon(coupon), z10));
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            if (Gi.i.i((Gi.i) r0, r2, r3, r3, false, r5, r10, null, null, r13, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_OK, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f96200a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L77
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L2f
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f96201b
                r13.f96200a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L76
            L2f:
                Gi.i r0 = (Gi.i) r0
                com.meijer.mobile.coupon.detail.CouponDetailActivity r2 = r13.f96202c
                int r3 = r13.f96203d
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                com.meijer.mobile.coupon.detail.CouponDetailActivity r4 = r13.f96202c
                int r5 = r13.f96204e
                java.lang.String r4 = r4.getString(r5)
                kotlin.jvm.internal.Intrinsics.i(r4, r3)
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r3 = r4.toUpperCase(r3)
                java.lang.String r4 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.i(r3, r4)
                r4 = r2
                r2 = r3
                Gi.e r3 = Gi.e.f11481a
                ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                com.meijer.mobile.coupon.detail.CouponDetailActivity r6 = r13.f96202c
                Ok.a r7 = r13.f96205f
                boolean r8 = r13.f96206g
                com.meijer.mobile.coupon.detail.o r10 = new com.meijer.mobile.coupon.detail.o
                r10.<init>()
                r13.f96200a = r1
                r1 = r4
                r4 = 0
                r7 = 0
                r8 = 0
                r6 = r10
                r10 = 200(0xc8, float:2.8E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L77
            L76:
                return r12
            L77:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.CouponDetailActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$showCartUpdateFailureMessage$1", f = "CouponDetailActivity.kt", l = {234, 234}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponDetailActivity f96209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96210d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f96208b, this.f96209c, this.f96210d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(LocalThemeScope localThemeScope, CouponDetailActivity couponDetailActivity, int i10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f96208b = localThemeScope;
            this.f96209c = couponDetailActivity;
            this.f96210d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        
            if (Gi.i.i((Gi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 234, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f96207a
                r1 = 2
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L20
                if (r0 == r3) goto L1b
                if (r0 != r1) goto L13
                kotlin.ResultKt.b(r14)
                goto L5d
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1b:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L2f
            L20:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f96208b
                r13.f96207a = r3
                r4 = 0
                java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r4, r13, r3, r2)
                if (r0 != r12) goto L2f
                goto L5c
            L2f:
                Gi.i r0 = (Gi.i) r0
                com.meijer.mobile.coupon.detail.CouponDetailActivity r3 = r13.f96209c
                int r4 = r13.f96210d
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r3, r4)
                r4 = 0
                android.text.Spanned r2 = m2.b.a(r3, r4, r2, r2)
                java.lang.String r2 = r2.toString()
                Gi.e r3 = Gi.e.f11481a
                ji.q1$m$a$b r5 = ji.q1.m.a.b.f140113a
                r13.f96207a = r1
                r1 = r2
                r2 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 234(0xea, float:3.28E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L5d
            L5c:
                return r12
            L5d:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.CouponDetailActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailActivity$showCartUpdateSuccessMessage$1", f = "CouponDetailActivity.kt", l = {219, 219}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96212b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponDetailActivity f96213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96214d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96215e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f96212b, this.f96213c, this.f96214d, this.f96215e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(LocalThemeScope localThemeScope, CouponDetailActivity couponDetailActivity, int i10, int i11, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f96212b = localThemeScope;
            this.f96213c = couponDetailActivity;
            this.f96214d = i10;
            this.f96215e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(CouponDetailActivity couponDetailActivity) {
            couponDetailActivity.startActivity(couponDetailActivity.t1().d());
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
            if (Gi.i.i((Gi.i) r0, r2, r3, r3, false, r5, r7, null, null, r13, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_OK, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f96211a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L73
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L2f
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f96212b
                r13.f96211a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L72
            L2f:
                Gi.i r0 = (Gi.i) r0
                com.meijer.mobile.coupon.detail.CouponDetailActivity r2 = r13.f96213c
                int r3 = r13.f96214d
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                com.meijer.mobile.coupon.detail.CouponDetailActivity r4 = r13.f96213c
                int r5 = r13.f96215e
                java.lang.String r4 = r4.getString(r5)
                kotlin.jvm.internal.Intrinsics.i(r4, r3)
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r3 = r4.toUpperCase(r3)
                java.lang.String r4 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.i(r3, r4)
                r4 = r2
                r2 = r3
                Gi.e r3 = Gi.e.f11481a
                ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                com.meijer.mobile.coupon.detail.CouponDetailActivity r6 = r13.f96213c
                com.meijer.mobile.coupon.detail.p r7 = new com.meijer.mobile.coupon.detail.p
                r7.<init>()
                r13.f96211a = r1
                r1 = r4
                r4 = 0
                r6 = r7
                r7 = 0
                r8 = 0
                r10 = 200(0xc8, float:2.8E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L73
            L72:
                return r12
            L73:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.CouponDetailActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/meijer/mobile/coupon/detail/CouponDetailActivity$h", "LPj/g;", "", "onCreateAccount", "()V", "onSignIn", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Pj.g {
        h() {
        }

        @Override // Pj.g
        public void onCreateAccount() {
            CouponDetailActivity couponDetailActivity = CouponDetailActivity.this;
            couponDetailActivity.startActivity(Al.f.f666a.a(couponDetailActivity, couponDetailActivity.u1().e(AbstractC18227f.h0.f170581h)));
        }

        @Override // Pj.g
        public void onSignIn() {
            CouponDetailActivity couponDetailActivity = CouponDetailActivity.this;
            couponDetailActivity.startActivity(Al.k.b(couponDetailActivity, false, null, 536871032, null, null, null, 118, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96217f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f96217f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f96217f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96218f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f96218f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f96218f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f96219f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96220g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f96219f = function0;
            this.f96220g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f96219f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f96220g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(CouponDetailActivity couponDetailActivity) {
        couponDetailActivity.setResult(-1);
        couponDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope, L.ViewState viewState, boolean z10, boolean z11, boolean z12, int i10, Composer composer, int i11) {
        couponDetailActivity.F1(localThemeScope, viewState, z10, z11, z12, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(final Ji.LocalThemeScope r21, final com.meijer.mobile.coupon.detail.L.ViewState r22, final boolean r23, final boolean r24, final boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.CouponDetailActivity.H1(Ji.M, com.meijer.mobile.coupon.detail.L$g, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(CouponDetailActivity couponDetailActivity, LocalThemeScope localThemeScope, L.ViewState viewState, boolean z10, boolean z11, boolean z12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        couponDetailActivity.H1(localThemeScope, viewState, z10, z11, z12, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L Y1() {
        return (L) this.couponDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2() {
        Sr.b.b(this, new b.InterfaceC0768b() { // from class: com.meijer.mobile.coupon.detail.e
            @Override // Sr.b.InterfaceC0768b
            public final void a() {
                CouponDetailActivity.d2(this.f96418a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(LocalThemeScope localThemeScope, int i10, int i11, Coupon coupon, boolean z10) {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O != null) {
            C16648k.d(interfaceC16622O, null, null, new e(localThemeScope, this, i10, i11, coupon, z10, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(LocalThemeScope localThemeScope, int i10) {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O != null) {
            C16648k.d(interfaceC16622O, null, null, new f(localThemeScope, this, i10, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(LocalThemeScope localThemeScope, int i10, int i11) {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O != null) {
            C16648k.d(interfaceC16622O, null, null, new g(localThemeScope, this, i10, i11, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(int messageResId) {
        new Pj.f(this, messageResId, new h()).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(int messageResId, int titleResId, boolean requireAcknowledgement) {
        Pj.j jVar = new Pj.j(this, messageResId, new Object[0]);
        if (requireAcknowledgement) {
            jVar.n();
        }
        jVar.r(titleResId, new Object[0]);
        jVar.g();
    }

    public final void F1(final LocalThemeScope localThemeScope, final L.ViewState viewState, final boolean z10, final boolean z11, final boolean z12, Composer composer, final int i10) {
        int i11;
        boolean z13;
        boolean z14;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-665033006);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            z13 = z11;
            i11 |= composerStartRestartGroup.a(z13) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            z13 = z11;
        }
        if ((i10 & 24576) == 0) {
            z14 = z12;
            i11 |= composerStartRestartGroup.a(z14) ? 16384 : 8192;
        } else {
            z14 = z12;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-665033006, i11, -1, "com.meijer.mobile.coupon.detail.CouponDetailActivity.CDPContent (CouponDetailActivity.kt:420)");
            }
            Or.A.F(null, ComposableLambdaKt.c(-2116039558, true, new a(viewState, viewState.getCouponState().getCoupon(), z13, z14, localThemeScope, this, z10), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.coupon.detail.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CouponDetailActivity.G1(this.f96419a, localThemeScope, viewState, z10, z11, z12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        Gi.i.INSTANCE.b();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(CouponDetailActivity couponDetailActivity) {
        couponDetailActivity.finish();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(CouponDetailActivity couponDetailActivity, boolean z10) {
        L.AbstractC11592c abstractC11592c;
        L lY1 = couponDetailActivity.Y1();
        if (z10) {
            abstractC11592c = L.AbstractC11592c.C1365c.f96258a;
        } else {
            abstractC11592c = L.AbstractC11592c.a.f96255a;
        }
        lY1.n0(abstractC11592c);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(CouponDetailActivity couponDetailActivity) {
        couponDetailActivity.startActivity(couponDetailActivity.t1().d());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(Coupon coupon) {
        startActivity(Al.g.k(t1(), new l.Coupon(coupon), null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        Y1().n0(new L.AbstractC11592c.StepperChange(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(ProductFullDetails product, String previousTrackAction) {
        startActivity(t1().s(product, false, true, previousTrackAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h2(com.meijer.mobile.coupons.domain.models.CouponException r3, com.meijer.mobile.coupon.detail.L.d r4) {
        /*
            r2 = this;
            com.meijer.mobile.core.networking.exceptions.RetrofitException$b r0 = r3.getExceptionKind()
            com.meijer.mobile.core.networking.exceptions.RetrofitException$b r1 = com.meijer.mobile.core.networking.exceptions.RetrofitException.b.f96142b
            if (r0 != r1) goto Lf
            int r4 = pk.f.f155797k
            java.lang.String r4 = r2.getString(r4)
            goto L3d
        Lf:
            rk.b r0 = r3.getErrorType()
            if (r0 == 0) goto L30
            rk.b r0 = r3.getErrorType()
            kotlin.jvm.internal.Intrinsics.g(r0)
            int r0 = r0.getResultCode()
            r1 = 30
            if (r0 > r1) goto L30
            rk.b r4 = r3.getErrorType()
            kotlin.jvm.internal.Intrinsics.g(r4)
            java.lang.String r4 = r4.getErrorString(r2)
            goto L3d
        L30:
            com.meijer.mobile.coupon.detail.L$d r0 = com.meijer.mobile.coupon.detail.L.d.f96264a
            if (r4 != r0) goto L37
            int r4 = Nr.g.f22756s
            goto L39
        L37:
            int r4 = Nr.g.f22697E
        L39:
            java.lang.String r4 = r2.getString(r4)
        L3d:
            kotlin.jvm.internal.Intrinsics.g(r4)
            Pj.j r0 = new Pj.j
            r0.<init>(r2, r4)
            rk.b r3 = r3.getErrorType()
            com.meijer.mobile.coupons.api.models.AddOfferErrorType r4 = com.meijer.mobile.coupons.api.models.AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR
            r1 = 0
            if (r3 != r4) goto L51
            int r3 = Nr.g.f22700G
            goto L52
        L51:
            r3 = r1
        L52:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            Pj.j r3 = r0.r(r3, r4)
            r3.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.CouponDetailActivity.h2(com.meijer.mobile.coupons.domain.models.CouponException, com.meijer.mobile.coupon.detail.L$d):void");
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(Y1());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(2006154484, true, new d(getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_COUPON_DETAIL_SHOW_PRIMARY", true), getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_COUPON_DETAIL_SHOW_SECONDARY", true))), 1, null);
    }
}
