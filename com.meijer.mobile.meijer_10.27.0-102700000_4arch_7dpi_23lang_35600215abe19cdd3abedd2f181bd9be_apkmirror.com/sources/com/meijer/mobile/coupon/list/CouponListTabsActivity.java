package com.meijer.mobile.coupon.list;

import Ji.C;
import Ji.LocalThemeScope;
import Jk.AppVersion;
import Pk.a;
import Rk.CouponOptions;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.coupon.list.CouponListTabsActivity;
import com.meijer.mobile.coupon.list.M;
import e.C13589e;
import fi.GoogleAdAnalytics;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.C14476c;
import hi.TrackingData;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC15962C;
import kotlin.C17927c1;
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
import l0.C15339A;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import ps.j0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\u0003R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010@¨\u0006F²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/coupon/list/CouponListTabsActivity;", "Lcom/meijer/mobile/coupon/di/CouponFeatureActivity;", "<init>", "()V", "LPk/a;", "action", "", "a2", "(LPk/a;)V", "LOk/c;", "couponIdentity", "V1", "(LOk/c;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "U1", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", "Y1", "Lo0/C;", "pagerState", "Lcom/meijer/mobile/coupon/list/M$f;", "viewState", "W1", "(Lo0/C;Lcom/meijer/mobile/coupon/list/M$f;)V", "", "messageResId", "b2", "(I)V", "Lg/a;", "result", "T1", "(Lg/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "Lcom/meijer/mobile/coupon/list/M;", "C", "Lkotlin/Lazy;", "Q1", "()Lcom/meijer/mobile/coupon/list/M;", "couponListTabsViewModel", "D", "P1", "()I", "couponListTabIndex", "Lg/c;", "Landroid/content/Intent;", "E", "Lg/c;", "couponFilterResultLauncher", "Ll0/A;", "F", "Ll0/A;", "listState", "Lps/g;", "G", "S1", "()Lps/g;", "navigationHelper", "Lps/L;", "H", "R1", "()Lps/L;", "navigationDrawerViewModel", "I", "a", "Lx0/c1;", "scaffoldState", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CouponListTabsActivity extends Hilt_CouponListTabsActivity {

    /* renamed from: J, reason: collision with root package name */
    public static final int f96505J = 8;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private C15339A listState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponListTabsViewModel = new e0(Reflection.b(M.class), new f(this), new e(this), new g(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponListTabIndex = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CouponListTabsActivity.O1(this.f96861a));
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> couponFilterResultLauncher = registerForActivityResult(new h.i(), new InterfaceC14146b() { // from class: com.meijer.mobile.coupon.list.q
        @Override // g.InterfaceC14146b
        public final void a(Object obj) {
            CouponListTabsActivity.N1(this.f96862a, (C14145a) obj);
        }
    });

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListTabsActivity.Z1(this.f96863a);
        }
    });

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16382L.class), new i(this), new h(this), new j(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$handleCouponFilterResult$1", f = "CouponListTabsActivity.kt", l = {514}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96512a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CouponListTabsActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96512a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15339A c15339a = CouponListTabsActivity.this.listState;
                if (c15339a == null) {
                    Intrinsics.y("listState");
                    c15339a = null;
                }
                this.f96512a = 1;
                if (C15339A.J(c15339a, 0, 0, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CouponListTabsActivity f96515a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$1$1", f = "CouponListTabsActivity.kt", l = {181}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$a, reason: collision with other inner class name */
            static final class C1373a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96516a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M.ViewState f96517b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<Xr.a> f96518c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96519d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1373a(M.ViewState viewState, List<? extends Xr.a> list, CouponListTabsActivity couponListTabsActivity, Continuation<? super C1373a> continuation) {
                    super(2, continuation);
                    this.f96517b = viewState;
                    this.f96518c = list;
                    this.f96519d = couponListTabsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1373a(this.f96517b, this.f96518c, this.f96519d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1373a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f96516a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        if (this.f96517b.getPreviousItemCount() < this.f96518c.size()) {
                            C15339A c15339a = this.f96519d.listState;
                            if (c15339a == null) {
                                Intrinsics.y("listState");
                                c15339a = null;
                            }
                            this.f96516a = 1;
                            if (c15339a.I(0, 0, this) == objF) {
                                return objF;
                            }
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96520a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96521b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ M.ViewState f96522c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$b$a, reason: collision with other inner class name */
                static final class C1374a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f96523a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ M.ViewState f96524b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CouponListTabsActivity f96525c;

                    C1374a(LocalThemeScope localThemeScope, M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                        this.f96523a = localThemeScope;
                        this.f96524b = viewState;
                        this.f96525c = couponListTabsActivity;
                    }

                    public final void b(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(978969923, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:215)");
                        }
                        LocalThemeScope localThemeScope = this.f96523a;
                        Integer numValueOf = Integer.valueOf(this.f96524b.getCouponListTabsDecorator().getCartItemCount());
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f96525c);
                        final CouponListTabsActivity couponListTabsActivity = this.f96525c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.coupon.list.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CouponListTabsActivity.c.a.b.C1374a.c(couponListTabsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.k(localThemeScope, numValueOf, null, (Function0) objB, composer, LocalThemeScope.f15770g, 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        b(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CouponListTabsActivity couponListTabsActivity) {
                        couponListTabsActivity.startActivity(couponListTabsActivity.t1().d());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$b$b, reason: collision with other inner class name */
                static final class C1375b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f96526a;

                    C1375b(LocalThemeScope localThemeScope) {
                        this.f96526a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(443501085, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:207)");
                        }
                        Dr.g.g(this.f96526a, C16193g.c(Mk.a.f19675c, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2084198109, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:205)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(j0.f156554d, new Object[0]);
                    C.a.s sVar = C.a.s.f15358e;
                    LocalThemeScope localThemeScope = this.f96520a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(978969923, true, new C1374a(localThemeScope, this.f96522c, this.f96521b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(443501085, true, new C1375b(this.f96520a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f96521b);
                    final CouponListTabsActivity couponListTabsActivity = this.f96521b;
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
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, sVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24960 | (C.a.s.f15359f << 18) | (AbstractC5607a.f45514b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                b(LocalThemeScope localThemeScope, CouponListTabsActivity couponListTabsActivity, M.ViewState viewState) {
                    this.f96520a = localThemeScope;
                    this.f96521b = couponListTabsActivity;
                    this.f96522c = viewState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.S1().j();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$c, reason: collision with other inner class name */
            static final class C1376c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f96527a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f96528b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96529c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96530d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1377a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                    C1377a(Object obj) {
                        super(1, obj, C16395g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16373C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16395g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16373C abstractC16373C) {
                        a(abstractC16373C);
                        return Unit.f142422a;
                    }
                }

                C1376c(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope) {
                    this.f96527a = z1Var;
                    this.f96528b = z1Var2;
                    this.f96529c = couponListTabsActivity;
                    this.f96530d = localThemeScope;
                }

                public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(43476359, i10, -1, "com.meijer.mobile.coupon.list.CouponListTabsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponListTabsActivity.kt:225)");
                    }
                    HeaderDecorator value = this.f96527a.getValue();
                    DrawerLayoutDecorator value2 = this.f96528b.getValue();
                    C16395g c16395gS1 = this.f96529c.S1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16395gS1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1377a(c16395gS1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionS1 = this.f96529c.s1();
                    C16372B.h(this.f96530d, value, value2, appVersionS1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class d implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96531a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M.ViewState f96532b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96533c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<Xr.a> f96534d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ AbstractC15962C f96535e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$d$a, reason: collision with other inner class name */
                /* synthetic */ class C1378a extends FunctionReferenceImpl implements Function1<Pk.a, Unit> {
                    C1378a(Object obj) {
                        super(1, obj, CouponListTabsActivity.class, "onAction", "onAction(Lcom/meijer/mobile/coupon/model/common/action/CouponAction;)V", 0);
                    }

                    public final void a(Pk.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((CouponListTabsActivity) this.receiver).a2(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Pk.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
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
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                d(LocalThemeScope localThemeScope, M.ViewState viewState, CouponListTabsActivity couponListTabsActivity, List<? extends Xr.a> list, AbstractC15962C abstractC15962C) {
                    this.f96531a = localThemeScope;
                    this.f96532b = viewState;
                    this.f96533c = couponListTabsActivity;
                    this.f96534d = list;
                    this.f96535e = abstractC15962C;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(CouponListTabsActivity couponListTabsActivity, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    couponListTabsActivity.Q1().L(new M.c.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f142422a;
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
                public final void g(j0.InterfaceC14794C r24, androidx.compose.runtime.Composer r25, int r26) {
                    /*
                        Method dump skipped, instructions count: 677
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.d.g(j0.C, androidx.compose.runtime.Composer, int):void");
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    g(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                    if (!viewState.getCouponListTabsDecorator().getIsStoreSet()) {
                        new Bl.a(couponListTabsActivity).g();
                    } else if (couponListTabsActivity.u1().e(AbstractC18227f.t0.f170605h)) {
                        couponListTabsActivity.startActivity(Al.h.c(couponListTabsActivity, Pp.b.f28357b, null, null, false, null, 60, null));
                    } else {
                        couponListTabsActivity.startActivity(Al.h.g(couponListTabsActivity, Pp.b.f28357b, null, null, false, null, 60, null));
                    }
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.Q1().L(new M.c.RefreshCoupons(true));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(M.ViewState viewState, CouponListTabsActivity couponListTabsActivity) {
                    if (!viewState.getCouponListTabsDecorator().getIsStoreSet()) {
                        new Bl.a(couponListTabsActivity).g();
                    } else if (couponListTabsActivity.u1().e(AbstractC18227f.t0.f170605h)) {
                        couponListTabsActivity.startActivity(Al.h.e(couponListTabsActivity, false, 2, null));
                    } else {
                        couponListTabsActivity.startActivity(Al.h.i(couponListTabsActivity, false, 2, null));
                    }
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(CouponListTabsActivity couponListTabsActivity, AbstractC15962C abstractC15962C, M.ViewState viewState) {
                    couponListTabsActivity.W1(abstractC15962C, viewState);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(CouponListTabsActivity couponListTabsActivity) {
                    couponListTabsActivity.Q1().L(new M.c.RefreshCoupons(false));
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1", f = "CouponListTabsActivity.kt", l = {}, m = "invokeSuspend")
            static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96536a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f96537b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96538c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96539d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ AbstractC15962C f96540e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1", f = "CouponListTabsActivity.kt", l = {330}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a, reason: collision with other inner class name */
                static final class C1379a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f96541a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CouponListTabsActivity f96542b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f96543c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ AbstractC15962C f96544d;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1", f = "CouponListTabsActivity.kt", l = {331}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a, reason: collision with other inner class name */
                    static final class C1380a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f96545a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ CouponListTabsActivity f96546b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f96547c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ AbstractC15962C f96548d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a, reason: collision with other inner class name */
                        static final class C1381a<T> implements InterfaceC17153g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ CouponListTabsActivity f96549a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f96550b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ AbstractC15962C f96551c;

                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1$1$3$1", f = "CouponListTabsActivity.kt", l = {385}, m = "invokeSuspend")
                            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a$a, reason: collision with other inner class name */
                            static final class C1382a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                                /* renamed from: a, reason: collision with root package name */
                                int f96552a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ AbstractC15962C f96553b;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C1382a(this.f96553b, continuation);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C1382a(AbstractC15962C abstractC15962C, Continuation<? super C1382a> continuation) {
                                    super(2, continuation);
                                    this.f96553b = abstractC15962C;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                                    return ((C1382a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object objF = IntrinsicsKt.f();
                                    int i10 = this.f96552a;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            ResultKt.b(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.b(obj);
                                        AbstractC15962C abstractC15962C = this.f96553b;
                                        this.f96552a = 1;
                                        if (AbstractC15962C.d0(abstractC15962C, 1, 0.0f, this, 2, null) == objF) {
                                            return objF;
                                        }
                                    }
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsActivity$onCreate$1$1$7$1$1$1$1", f = "CouponListTabsActivity.kt", l = {343, 343, 359, 359, 379, 379}, m = "emit")
                            /* renamed from: com.meijer.mobile.coupon.list.CouponListTabsActivity$c$a$e$a$a$a$b */
                            static final class b extends ContinuationImpl {

                                /* renamed from: a, reason: collision with root package name */
                                Object f96554a;

                                /* renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f96555b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ C1381a<T> f96556c;

                                /* renamed from: d, reason: collision with root package name */
                                int f96557d;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                b(C1381a<? super T> c1381a, Continuation<? super b> continuation) {
                                    super(continuation);
                                    this.f96556c = c1381a;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.f96555b = obj;
                                    this.f96557d |= Integer.MIN_VALUE;
                                    return this.f96556c.emit(null, this);
                                }
                            }

                            C1381a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C) {
                                this.f96549a = couponListTabsActivity;
                                this.f96550b = localThemeScope;
                                this.f96551c = abstractC15962C;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
                            
                                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L30;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
                            
                                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L40;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
                            
                                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L50;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                            @Override // tv.InterfaceC17153g
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
                                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.e.C1379a.C1380a.C1381a.emit(com.meijer.mobile.coupon.list.M$e, kotlin.coroutines.Continuation):java.lang.Object");
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
                            public static final boolean k(CouponListTabsActivity couponListTabsActivity, AbstractC15962C abstractC15962C) {
                                C16648k.d(C6031t.a(couponListTabsActivity), null, null, new C1382a(abstractC15962C, null), 3, null);
                                return true;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1380a(this.f96546b, this.f96547c, this.f96548d, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1380a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Continuation<? super C1380a> continuation) {
                            super(2, continuation);
                            this.f96546b = couponListTabsActivity;
                            this.f96547c = localThemeScope;
                            this.f96548d = abstractC15962C;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1380a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f96545a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                InterfaceC17144F<M.e> interfaceC17144FI = this.f96546b.Q1().I();
                                C1381a c1381a = new C1381a(this.f96546b, this.f96547c, this.f96548d);
                                this.f96545a = 1;
                                if (interfaceC17144FI.collect(c1381a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1379a(this.f96542b, this.f96543c, this.f96544d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1379a(CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Continuation<? super C1379a> continuation) {
                        super(2, continuation);
                        this.f96542b = couponListTabsActivity;
                        this.f96543c = localThemeScope;
                        this.f96544d = abstractC15962C;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1379a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f96541a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            CouponListTabsActivity couponListTabsActivity = this.f96542b;
                            AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
                            C1380a c1380a = new C1380a(couponListTabsActivity, this.f96543c, this.f96544d, null);
                            this.f96541a = 1;
                            if (C5994J.b(couponListTabsActivity, bVar, c1380a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f96537b, this.f96538c, this.f96539d, this.f96540e, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(InterfaceC16622O interfaceC16622O, CouponListTabsActivity couponListTabsActivity, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f96537b = interfaceC16622O;
                    this.f96538c = couponListTabsActivity;
                    this.f96539d = localThemeScope;
                    this.f96540e = abstractC15962C;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96536a == 0) {
                        ResultKt.b(obj);
                        C16648k.d(this.f96537b, null, null, new C1379a(this.f96538c, this.f96539d, this.f96540e, null), 3, null);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/coupon/list/CouponListTabsActivity$c$a$f", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            public static final class f implements androidx.compose.runtime.E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CouponListTabsActivity f96558a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f96559b;

                public f(CouponListTabsActivity couponListTabsActivity, List list) {
                    this.f96558a = couponListTabsActivity;
                    this.f96559b = list;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    M mQ1 = this.f96558a.Q1();
                    C15339A c15339a = this.f96558a.listState;
                    C15339A c15339a2 = null;
                    if (c15339a == null) {
                        Intrinsics.y("listState");
                        c15339a = null;
                    }
                    int iS = c15339a.s();
                    C15339A c15339a3 = this.f96558a.listState;
                    if (c15339a3 == null) {
                        Intrinsics.y("listState");
                    } else {
                        c15339a2 = c15339a3;
                    }
                    mQ1.L(new M.c.SaveScrollPosition(iS, c15339a2.t()));
                    this.f96558a.Q1().L(new M.c.SavePreviousItemCount(this.f96559b.size()));
                }
            }

            a(CouponListTabsActivity couponListTabsActivity) {
                this.f96515a = couponListTabsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int g() {
                return 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.t.a(semantics, true);
                return Unit.f142422a;
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
            public final void d(Ji.LocalThemeScope r38, androidx.compose.runtime.Composer r39, int r40) {
                /*
                    Method dump skipped, instructions count: 712
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListTabsActivity.c.a.d(Ji.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final C17927c1 f(InterfaceC5730l0<C17927c1> interfaceC5730l0) {
                return interfaceC5730l0.getValue();
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
            Ji.K.b(null, ComposableLambdaKt.c(1544971458, true, new a(CouponListTabsActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/meijer/mobile/coupon/list/CouponListTabsActivity$d", "LPj/g;", "", "onCreateAccount", "()V", "onSignIn", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Pj.g {
        d() {
        }

        @Override // Pj.g
        public void onCreateAccount() {
            CouponListTabsActivity couponListTabsActivity = CouponListTabsActivity.this;
            couponListTabsActivity.startActivity(Al.f.f666a.a(couponListTabsActivity, couponListTabsActivity.u1().e(AbstractC18227f.h0.f170581h)));
        }

        @Override // Pj.g
        public void onSignIn() {
            CouponListTabsActivity couponListTabsActivity = CouponListTabsActivity.this;
            couponListTabsActivity.startActivity(Al.k.b(couponListTabsActivity, false, null, 536871032, null, null, null, 118, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f96561f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f96561f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f96562f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f96562f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f96563f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f96563f = function0;
            this.f96564g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f96563f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f96564g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96565f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f96565f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f96565f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96566f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f96566f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f96566f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f96567f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96568g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f96567f = function0;
            this.f96568g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f96567f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f96568g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(CouponListTabsActivity couponListTabsActivity, C14145a result) {
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
    public final C16382L R1() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g S1() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(CouponAd couponAd) {
        Cl.e eVarV1 = v1();
        String bundleTag = couponAd.getBundleTag();
        if (bundleTag == null) {
            bundleTag = "";
        }
        startActivity(eVarV1.e(this, couponAd, new CouponOptions(null, null, null, false, false, 0L, bundleTag, null, false, null, null, false, false, 8127, null), u1().e(AbstractC18227f.M.f170552h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(AbstractC15962C abstractC15962C, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n(abstractC15962C.v() == 0 ? "Meijer: Coupons: available" : "mperks: clipped");
        track.v("mperks");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g Z1(CouponListTabsActivity couponListTabsActivity) {
        return new C16395g(couponListTabsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(Pk.a action) {
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
        new Pj.f(this, messageResId, new d()).g();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        Gi.i.INSTANCE.b();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O1(CouponListTabsActivity couponListTabsActivity) {
        return couponListTabsActivity.getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_COUPONS_LIST_TAB_INDEX", 0);
    }

    private final void T1(C14145a result) {
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
                serializableExtra = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.class);
            } else {
                Serializable serializableExtra2 = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE");
                if (!(serializableExtra2 instanceof Pk.c)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Pk.c) serializableExtra2;
            }
            Intrinsics.g(serializableExtra);
            if (mQ1.P(couponOptions, stringArrayListExtra, (Pk.c) serializableExtra)) {
                C16648k.d(C6031t.a(this), null, null, new b(null), 3, null);
            }
        }
    }

    private final void V1(Ok.c couponIdentity) {
        startActivity(v1().f(couponIdentity, true, true, false, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(final AbstractC15962C pagerState, M.ViewState viewState) {
        Pk.c cVar;
        CouponOptions clippedTabCouponOptions;
        getAnalyticsEngine().h(C14476c.a("event: coupon refine"), new Function1() { // from class: com.meijer.mobile.coupon.list.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponListTabsActivity.X1(pagerState, (TrackingData) obj);
            }
        });
        AbstractC14147c<Intent> abstractC14147c = this.couponFilterResultLauncher;
        if (pagerState.v() == 0) {
            cVar = Pk.c.f28328d;
        } else {
            cVar = Pk.c.f28329e;
        }
        if (pagerState.v() == 0) {
            clippedTabCouponOptions = viewState.getAvailableTabCouponOptions();
        } else {
            clippedTabCouponOptions = viewState.getClippedTabCouponOptions();
        }
        abstractC14147c.a(Al.c.a(this, cVar, clippedTabCouponOptions));
    }

    private final void Y1() {
        startActivity(Cl.e.l(v1(), this, null, null, u1().e(AbstractC18227f.M.f170552h), 6, null));
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(Q1());
        R1().w(536871032);
        if (u1().e(AbstractC18227f.C.f170544h)) {
            Q1().J();
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1026893903, true, new c()), 1, null);
    }
}
