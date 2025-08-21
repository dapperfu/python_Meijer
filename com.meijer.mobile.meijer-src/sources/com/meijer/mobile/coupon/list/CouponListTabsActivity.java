package com.meijer.mobile.coupon.list;

import Ki.C;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import Qk.a;
import Sk.CouponOptions;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.coupon.list.CouponListTabsActivity;
import com.meijer.mobile.coupon.list.M;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import ii.C14756c;
import ii.TrackingData;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC16037C;
import kotlin.C17993c1;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import l0.C15429A;
import mv.C15809k;
import mv.InterfaceC15783O;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import ps.j0;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\u0003R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010@¨\u0006F²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/coupon/list/CouponListTabsActivity;", "Lcom/meijer/mobile/coupon/di/CouponFeatureActivity;", "<init>", "()V", "LQk/a;", "action", "", "a2", "(LQk/a;)V", "LPk/c;", "couponIdentity", "V1", "(LPk/c;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "U1", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", "Y1", "Lo0/C;", "pagerState", "Lcom/meijer/mobile/coupon/list/M$f;", "viewState", "W1", "(Lo0/C;Lcom/meijer/mobile/coupon/list/M$f;)V", "", "messageResId", "b2", "(I)V", "Lg/a;", "result", "T1", "(Lg/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "Lcom/meijer/mobile/coupon/list/M;", "C", "Lkotlin/Lazy;", "Q1", "()Lcom/meijer/mobile/coupon/list/M;", "couponListTabsViewModel", "D", "P1", "()I", "couponListTabIndex", "Lg/c;", "Landroid/content/Intent;", "E", "Lg/c;", "couponFilterResultLauncher", "Ll0/A;", "F", "Ll0/A;", "listState", "Lps/g;", "G", "S1", "()Lps/g;", "navigationHelper", "Lps/L;", "H", "R1", "()Lps/L;", "navigationDrawerViewModel", "I", "a", "Lx0/c1;", "scaffoldState", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CouponListTabsActivity extends Hilt_CouponListTabsActivity {

    /* renamed from: J, reason: collision with root package name */
    public static final int f97363J = 8;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private C15429A listState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponListTabsViewModel = new e0(Reflection.b(M.class), new f(this), new e(this), new g(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponListTabIndex = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CouponListTabsActivity.O1(this.f97719a));
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> couponFilterResultLauncher = registerForActivityResult(new h.i(), new InterfaceC14275b() { // from class: com.meijer.mobile.coupon.list.q
        @Override // g.InterfaceC14275b
        public final void a(Object obj) {
            CouponListTabsActivity.N1(this.f97720a, (C14274a) obj);
        }
    });

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListTabsActivity.Z1(this.f97721a);
        }
    });

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16508L.class), new i(this), new h(this), new j(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$handleCouponFilterResult$1", f = "CouponListTabsActivity.kt", l = {514}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97370a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CouponListTabsActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97370a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15429A c15429a = CouponListTabsActivity.this.listState;
                if (c15429a == null) {
                    Intrinsics.x("listState");
                    c15429a = null;
                }
                this.f97370a = 1;
                if (C15429A.J(c15429a, 0, 0, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CouponListTabsActivity f97373a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$1$1", f = "CouponListTabsActivity.kt", l = {181}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$a, reason: collision with other inner class name */
            static final class C1382a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f97374a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M.ViewState f97375b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<Xr.a> f97376c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97377d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1382a(M.ViewState viewState, List<? extends Xr.a> list, CouponListTabsActivity couponListTabsActivity, Continuation<? super C1382a> continuation) {
                    super(2, continuation);
                    this.f97375b = viewState;
                    this.f97376c = list;
                    this.f97377d = couponListTabsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1382a(this.f97375b, this.f97376c, this.f97377d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1382a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f97374a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        if (this.f97375b.getPreviousItemCount() < this.f97376c.size()) {
                            C15429A c15429a = this.f97377d.listState;
                            if (c15429a == null) {
                                Intrinsics.x("listState");
                                c15429a = null;
                            }
                            this.f97374a = 1;
                            if (c15429a.I(0, 0, this) == objF) {
                                return objF;
                            }
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97378a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97379b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ M.ViewState f97380c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$b$a, reason: collision with other inner class name */
                static final class C1383a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97381a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ M.ViewState f97382b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CouponListTabsActivity f97383c;

                    C1383a(LocalThemeScope localThemeScope, M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                        this.f97381a = localThemeScope;
                        this.f97382b = viewState;
                        this.f97383c = couponListTabsActivity;
                    }

                    public final void b(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(978969923, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:215)");
                        }
                        LocalThemeScope localThemeScope = this.f97381a;
                        Integer numValueOf = Integer.valueOf(this.f97382b.getCouponListTabsDecorator().getCartItemCount());
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f97383c);
                        final CouponListTabsActivity couponListTabsActivity = this.f97383c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.coupon.list.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CouponListTabsActivity.c.a.b.C1383a.c(couponListTabsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.k(localThemeScope, numValueOf, null, (Function0) objB, composer, LocalThemeScope.f17314g, 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        b(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CouponListTabsActivity couponListTabsActivity) {
                        couponListTabsActivity.startActivity(couponListTabsActivity.t1().d());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$b$b, reason: collision with other inner class name */
                static final class C1384b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97384a;

                    C1384b(LocalThemeScope localThemeScope) {
                        this.f97384a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(443501085, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:207)");
                        }
                        Dr.g.g(this.f97384a, C16338g.c(Nk.a.f21007c, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(2084198109, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:205)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(j0.f157327d, new Object[0]);
                    C.a.s sVar = C.a.s.f16902e;
                    LocalThemeScope localThemeScope = this.f97378a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(978969923, true, new C1383a(localThemeScope, this.f97380c, this.f97379b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(443501085, true, new C1384b(this.f97378a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f97379b);
                    final CouponListTabsActivity couponListTabsActivity = this.f97379b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.coupon.list.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CouponListTabsActivity.c.a.b.c(couponListTabsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, sVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24960 | (C.a.s.f16903f << 18) | (AbstractC6392a.f60445b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                b(LocalThemeScope localThemeScope, CouponListTabsActivity couponListTabsActivity, M.ViewState viewState) {
                    this.f97378a = localThemeScope;
                    this.f97379b = couponListTabsActivity;
                    this.f97380c = viewState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.S1().j();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$c, reason: collision with other inner class name */
            static final class C1385c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f97385a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f97386b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97387c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97388d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1386a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                    C1386a(Object obj) {
                        super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16499C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16521g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                        a(abstractC16499C);
                        return Unit.f143329a;
                    }
                }

                C1385c(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope) {
                    this.f97385a = z1Var;
                    this.f97386b = z1Var2;
                    this.f97387c = couponListTabsActivity;
                    this.f97388d = localThemeScope;
                }

                public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(43476359, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:225)");
                    }
                    HeaderDecorator value = this.f97385a.getValue();
                    DrawerLayoutDecorator value2 = this.f97386b.getValue();
                    C16521g c16521gS1 = this.f97387c.S1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16521gS1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1386a(c16521gS1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionS1 = this.f97387c.s1();
                    C16498B.h(this.f97388d, value, value2, appVersionS1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97389a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M.ViewState f97390b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97391c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<Xr.a> f97392d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ AbstractC16037C f97393e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$d$a, reason: collision with other inner class name */
                /* synthetic */ class C1387a extends FunctionReferenceImpl implements Function1<Qk.a, Unit> {
                    C1387a(Object obj) {
                        super(1, obj, CouponListTabsActivity.class, "onAction", "onAction(Lcom/meijer/mobile/coupon/model/common/action/CouponAction;)V", 0);
                    }

                    public final void a(Qk.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((CouponListTabsActivity) this.receiver).a2(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Qk.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<CouponAd, Unit> {
                    b(Object obj) {
                        super(1, obj, CouponListTabsActivity.class, "navigateToAdCouponsListPage", "navigateToAdCouponsListPage(Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", 0);
                    }

                    public final void a(CouponAd p02) {
                        Intrinsics.j(p02, "p0");
                        ((CouponListTabsActivity) this.receiver).U1(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CouponAd couponAd) {
                        a(couponAd);
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                d(LocalThemeScope localThemeScope, M.ViewState viewState, CouponListTabsActivity couponListTabsActivity, List<? extends Xr.a> list, AbstractC16037C abstractC16037C) {
                    this.f97389a = localThemeScope;
                    this.f97390b = viewState;
                    this.f97391c = couponListTabsActivity;
                    this.f97392d = list;
                    this.f97393e = abstractC16037C;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(CouponListTabsActivity couponListTabsActivity, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    couponListTabsActivity.Q1().L(new M.c.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f143329a;
                }

                /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0237  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0264  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x02a1  */
                /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void g(j0.InterfaceC14882C r24, androidx.compose.runtime.Composer r25, int r26) {
                    /*
                        Method dump skipped, instructions count: 677
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.d.g(j0.C, androidx.compose.runtime.Composer, int):void");
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    g(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                    if (!viewState.getCouponListTabsDecorator().getIsStoreSet()) {
                        new Cl.a(couponListTabsActivity).g();
                    } else if (couponListTabsActivity.u1().e(AbstractC18503f.t0.f172905h)) {
                        couponListTabsActivity.startActivity(Bl.h.c(couponListTabsActivity, Pp.b.f26239b, null, null, false, null, 60, null));
                    } else {
                        couponListTabsActivity.startActivity(Bl.h.g(couponListTabsActivity, Pp.b.f26239b, null, null, false, null, 60, null));
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.Q1().L(new M.c.RefreshCoupons(true));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                    if (!viewState.getCouponListTabsDecorator().getIsStoreSet()) {
                        new Cl.a(couponListTabsActivity).g();
                    } else if (couponListTabsActivity.u1().e(AbstractC18503f.t0.f172905h)) {
                        couponListTabsActivity.startActivity(Bl.h.e(couponListTabsActivity, false, 2, null));
                    } else {
                        couponListTabsActivity.startActivity(Bl.h.i(couponListTabsActivity, false, 2, null));
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(CouponListTabsActivity couponListTabsActivity, AbstractC16037C abstractC16037C, M.ViewState viewState) {
                    couponListTabsActivity.W1(abstractC16037C, viewState);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.Q1().L(new M.c.RefreshCoupons(false));
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1", f = "CouponListTabsActivity.kt", l = {}, m = "invokeSuspend")
            static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f97394a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f97395b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97396c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97397d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ AbstractC16037C f97398e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1", f = "CouponListTabsActivity.kt", l = {330}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a, reason: collision with other inner class name */
                static final class C1388a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f97399a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CouponListTabsActivity f97400b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97401c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ AbstractC16037C f97402d;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1", f = "CouponListTabsActivity.kt", l = {331}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a, reason: collision with other inner class name */
                    static final class C1389a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f97403a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ CouponListTabsActivity f97404b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f97405c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ AbstractC16037C f97406d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a, reason: collision with other inner class name */
                        static final class C1390a<T> implements InterfaceC16562g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ CouponListTabsActivity f97407a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f97408b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ AbstractC16037C f97409c;

                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1$1$3$1", f = "CouponListTabsActivity.kt", l = {385}, m = "invokeSuspend")
                            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a$a, reason: collision with other inner class name */
                            static final class C1391a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                                /* renamed from: a, reason: collision with root package name */
                                int f97410a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ AbstractC16037C f97411b;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C1391a(this.f97411b, continuation);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C1391a(AbstractC16037C abstractC16037C, Continuation<? super C1391a> continuation) {
                                    super(2, continuation);
                                    this.f97411b = abstractC16037C;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                                    return ((C1391a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object objF = IntrinsicsKt.f();
                                    int i10 = this.f97410a;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            ResultKt.b(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.b(obj);
                                        AbstractC16037C abstractC16037C = this.f97411b;
                                        this.f97410a = 1;
                                        if (AbstractC16037C.d0(abstractC16037C, 1, 0.0f, this, 2, null) == objF) {
                                            return objF;
                                        }
                                    }
                                    return Unit.f143329a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1$1", f = "CouponListTabsActivity.kt", l = {343, 343, 359, 359, 379, 379}, m = "emit")
                            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a$b */
                            static final class b extends ContinuationImpl {

                                /* renamed from: a, reason: collision with root package name */
                                Object f97412a;

                                /* renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f97413b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ C1390a<T> f97414c;

                                /* renamed from: d, reason: collision with root package name */
                                int f97415d;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                b(C1390a<? super T> c1390a, Continuation<? super b> continuation) {
                                    super(continuation);
                                    this.f97414c = c1390a;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.f97413b = obj;
                                    this.f97415d |= Integer.MIN_VALUE;
                                    return this.f97414c.emit(null, this);
                                }
                            }

                            C1390a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C) {
                                this.f97407a = couponListTabsActivity;
                                this.f97408b = localThemeScope;
                                this.f97409c = abstractC16037C;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
                            
                                if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L30;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
                            
                                if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L40;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
                            
                                if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L50;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                            @Override // pv.InterfaceC16562g
                            /* renamed from: h, reason: merged with bridge method [inline-methods] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(final com.meijer.mobile.coupon.list.M.e r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
                                /*
                                    Method dump skipped, instructions count: 408
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.e.C1388a.C1389a.C1390a.emit(com.meijer.mobile.coupon.list.M$e, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean i(CouponListTabsActivity couponListTabsActivity, M.e eVar) {
                                couponListTabsActivity.Q1().onAction(new a.Clip(((M.e.ShowClipCouponErrorSnackBar) eVar).getCoupon(), null, 2, null));
                                return true;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean j(CouponListTabsActivity couponListTabsActivity, M.e eVar) {
                                couponListTabsActivity.startActivity(couponListTabsActivity.v1().f(((M.e.ShowCouponClippedSnackBar) eVar).getCoupon(), true, true, false, null));
                                return true;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean k(CouponListTabsActivity couponListTabsActivity, AbstractC16037C abstractC16037C) {
                                C15809k.d(C6173t.a(couponListTabsActivity), null, null, new C1391a(abstractC16037C, null), 3, null);
                                return true;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1389a(this.f97404b, this.f97405c, this.f97406d, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1389a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, Continuation<? super C1389a> continuation) {
                            super(2, continuation);
                            this.f97404b = couponListTabsActivity;
                            this.f97405c = localThemeScope;
                            this.f97406d = abstractC16037C;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1389a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f97403a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                InterfaceC16553F<M.e> interfaceC16553FI = this.f97404b.Q1().I();
                                C1390a c1390a = new C1390a(this.f97404b, this.f97405c, this.f97406d);
                                this.f97403a = 1;
                                if (interfaceC16553FI.collect(c1390a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1388a(this.f97400b, this.f97401c, this.f97402d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1388a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, Continuation<? super C1388a> continuation) {
                        super(2, continuation);
                        this.f97400b = couponListTabsActivity;
                        this.f97401c = localThemeScope;
                        this.f97402d = abstractC16037C;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1388a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f97399a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            CouponListTabsActivity couponListTabsActivity = this.f97400b;
                            AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
                            C1389a c1389a = new C1389a(couponListTabsActivity, this.f97401c, this.f97402d, null);
                            this.f97399a = 1;
                            if (C6136J.b(couponListTabsActivity, bVar, c1389a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f97395b, this.f97396c, this.f97397d, this.f97398e, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(InterfaceC15783O interfaceC15783O, CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f97395b = interfaceC15783O;
                    this.f97396c = couponListTabsActivity;
                    this.f97397d = localThemeScope;
                    this.f97398e = abstractC16037C;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f97394a == 0) {
                        ResultKt.b(obj);
                        C15809k.d(this.f97395b, null, null, new C1388a(this.f97396c, this.f97397d, this.f97398e, null), 3, null);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/coupon/list/CouponListTabsActivity$c$a$f", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            public static final class f implements androidx.compose.runtime.E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f97416a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f97417b;

                public f(CouponListTabsActivity couponListTabsActivity, List list) {
                    this.f97416a = couponListTabsActivity;
                    this.f97417b = list;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    M mQ1 = this.f97416a.Q1();
                    C15429A c15429a = this.f97416a.listState;
                    C15429A c15429a2 = null;
                    if (c15429a == null) {
                        Intrinsics.x("listState");
                        c15429a = null;
                    }
                    int iS = c15429a.s();
                    C15429A c15429a3 = this.f97416a.listState;
                    if (c15429a3 == null) {
                        Intrinsics.x("listState");
                    } else {
                        c15429a2 = c15429a3;
                    }
                    mQ1.L(new M.c.SaveScrollPosition(iS, c15429a2.t()));
                    this.f97416a.Q1().L(new M.c.SavePreviousItemCount(this.f97417b.size()));
                }
            }

            a(CouponListTabsActivity couponListTabsActivity) {
                this.f97373a = couponListTabsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int g() {
                return 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.t.a(semantics, true);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.runtime.E k(CouponListTabsActivity couponListTabsActivity, List list, androidx.compose.runtime.F DisposableEffect) {
                Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
                return new f(couponListTabsActivity, list);
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x02a1  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x02a7  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02c4  */
            /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void d(Ki.LocalThemeScope r38, androidx.compose.runtime.Composer r39, int r40) {
                /*
                    Method dump skipped, instructions count: 712
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.d(Ki.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final C17993c1 f(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
                return interfaceC5872l0.getValue();
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1026893903, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous> (CouponListTabsActivity.kt:137)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1544971458, true, new a(CouponListTabsActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/meijer/mobile/coupon/list/CouponListTabsActivity$d", "LQj/g;", "", "onCreateAccount", "()V", "onSignIn", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Qj.g {
        d() {
        }

        @Override // Qj.g
        public void onCreateAccount() {
            CouponListTabsActivity couponListTabsActivity = CouponListTabsActivity.this;
            couponListTabsActivity.startActivity(Bl.f.f3124a.a(couponListTabsActivity, couponListTabsActivity.u1().e(AbstractC18503f.h0.f172881h)));
        }

        @Override // Qj.g
        public void onSignIn() {
            CouponListTabsActivity couponListTabsActivity = CouponListTabsActivity.this;
            couponListTabsActivity.startActivity(Bl.k.b(couponListTabsActivity, false, null, 536871032, null, null, null, 118, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97419f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f97419f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97419f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97420f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f97420f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f97420f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97421f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97422g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97421f = function0;
            this.f97422g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97421f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97422g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f97423f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97423f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97424f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f97424f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f97424f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97425f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97426g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97425f = function0;
            this.f97426g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97425f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97426g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(CouponListTabsActivity couponListTabsActivity, C14274a result) {
        Intrinsics.j(result, "result");
        couponListTabsActivity.T1(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P1() {
        return ((Number) this.couponListTabIndex.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M Q1() {
        return (M) this.couponListTabsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L R1() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g S1() {
        return (C16521g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(CouponAd couponAd) {
        Dl.e eVarV1 = v1();
        String bundleTag = couponAd.getBundleTag();
        if (bundleTag == null) {
            bundleTag = "";
        }
        startActivity(eVarV1.e(this, couponAd, new CouponOptions(null, null, null, false, false, 0L, bundleTag, null, false, null, null, false, false, 8127, null), u1().e(AbstractC18503f.M.f172852h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(AbstractC16037C abstractC16037C, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n(abstractC16037C.v() == 0 ? "Meijer: Coupons: available" : "mperks: clipped");
        track.v("mperks");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g Z1(CouponListTabsActivity couponListTabsActivity) {
        return new C16521g(couponListTabsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(Qk.a action) {
        if ((action instanceof a.Clip) || (action instanceof a.NotInterested) || (action instanceof a.Unclip)) {
            Q1().onAction(action);
        } else if (action instanceof a.ViewCouponDetails) {
            V1(((a.ViewCouponDetails) action).getCoupon());
        } else {
            if (!(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
            Y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(int messageResId) {
        new Qj.f(this, messageResId, new d()).g();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        Hi.i.INSTANCE.b();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O1(CouponListTabsActivity couponListTabsActivity) {
        return couponListTabsActivity.getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_COUPONS_LIST_TAB_INDEX", 0);
    }

    private final void T1(C14274a result) {
        Object obj;
        Object serializableExtra;
        Q1().X(true);
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            M mQ1 = Q1();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                obj = (Parcelable) data.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", CouponOptions.class);
            } else {
                Parcelable parcelableExtra = data.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS");
                if (!(parcelableExtra instanceof CouponOptions)) {
                    parcelableExtra = null;
                }
                obj = (CouponOptions) parcelableExtra;
            }
            Intrinsics.g(obj);
            CouponOptions couponOptions = (CouponOptions) obj;
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("com.meijer.intent.extra.EXTRA_COUPON_FILTER_CATEGORIES");
            Intrinsics.g(stringArrayListExtra);
            if (i10 >= 33) {
                serializableExtra = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Qk.c.class);
            } else {
                Serializable serializableExtra2 = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE");
                if (!(serializableExtra2 instanceof Qk.c)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Qk.c) serializableExtra2;
            }
            Intrinsics.g(serializableExtra);
            if (mQ1.P(couponOptions, stringArrayListExtra, (Qk.c) serializableExtra)) {
                C15809k.d(C6173t.a(this), null, null, new b(null), 3, null);
            }
        }
    }

    private final void V1(Pk.c couponIdentity) {
        startActivity(v1().f(couponIdentity, true, true, false, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(final AbstractC16037C pagerState, M.ViewState viewState) {
        Qk.c cVar;
        CouponOptions clippedTabCouponOptions;
        getAnalyticsEngine().b(C14756c.a("event: coupon refine"), new Function1() { // from class: com.meijer.mobile.coupon.list.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponListTabsActivity.X1(pagerState, (TrackingData) obj);
            }
        });
        AbstractC14276c<Intent> abstractC14276c = this.couponFilterResultLauncher;
        if (pagerState.v() == 0) {
            cVar = Qk.c.f31040d;
        } else {
            cVar = Qk.c.f31041e;
        }
        if (pagerState.v() == 0) {
            clippedTabCouponOptions = viewState.getAvailableTabCouponOptions();
        } else {
            clippedTabCouponOptions = viewState.getClippedTabCouponOptions();
        }
        abstractC14276c.a(Bl.c.a(this, cVar, clippedTabCouponOptions));
    }

    private final void Y1() {
        startActivity(Dl.e.l(v1(), this, null, null, u1().e(AbstractC18503f.M.f172852h), 6, null));
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(Q1());
        R1().w(536871032);
        if (u1().e(AbstractC18503f.C.f172844h)) {
            Q1().J();
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1026893903, true, new c()), 1, null);
    }
}
