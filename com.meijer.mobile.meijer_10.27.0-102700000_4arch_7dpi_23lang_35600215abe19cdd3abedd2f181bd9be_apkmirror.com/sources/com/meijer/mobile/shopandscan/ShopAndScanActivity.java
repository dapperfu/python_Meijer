package com.meijer.mobile.shopandscan;

import Ji.K;
import Ji.LocalThemeScope;
import V0.C5349s0;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.core.view.k;
import androidx.view.L;
import androidx.view.r;
import com.fullstory.FS;
import e.C13589e;
import j4.j;
import kotlin.AbstractC14653B;
import kotlin.C14667k;
import kotlin.C14677u;
import kotlin.C14680x;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p2.C16218j0;
import qv.InterfaceC16622O;
import tv.C17154h;
import xq.C18084c;
import xq.C18085d;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u0003R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/meijer/mobile/shopandscan/ShopAndScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Li4/k;", "navController", "Lxq/d$a;", "screen", "", "u1", "(Li4/k;Lxq/d$a;)V", "LJi/M;", "w1", "(LJi/M;Lxq/d$a;)V", "", "statusBarColor", "navBarColor", "", "fitSystemWindows", "x1", "(IIZ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lxq/d;", "v", "Lxq/d;", "t1", "()Lxq/d;", "setNavigationManager$shopandscan_playstoreRelease", "(Lxq/d;)V", "navigationManager", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShopAndScanActivity extends Hilt_ShopAndScanActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public C18085d navigationManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a, reason: collision with other inner class name */
        static final class C1886a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ShopAndScanActivity f116740a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a, reason: collision with other inner class name */
            static final class C1887a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ShopAndScanActivity f116741a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14677u f116742b;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shopandscan.ShopAndScanActivity$onCreate$1$1$1$1$1$1", f = "ShopAndScanActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1888a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f116743a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f116744b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ShopAndScanActivity f116745c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C14677u f116746d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116747e;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq/d$a;", "screen", "", "<anonymous>", "(Lxq/d$a;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.shopandscan.ShopAndScanActivity$onCreate$1$1$1$1$1$1$1", f = "ShopAndScanActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C1889a extends SuspendLambda implements Function2<C18085d.a, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f116748a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f116749b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ ShopAndScanActivity f116750c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ C14677u f116751d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f116752e;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1889a c1889a = new C1889a(this.f116750c, this.f116751d, this.f116752e, continuation);
                            c1889a.f116749b = obj;
                            return c1889a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1889a(ShopAndScanActivity shopAndScanActivity, C14677u c14677u, LocalThemeScope localThemeScope, Continuation<? super C1889a> continuation) {
                            super(2, continuation);
                            this.f116750c = shopAndScanActivity;
                            this.f116751d = c14677u;
                            this.f116752e = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(C18085d.a aVar, Continuation<? super Unit> continuation) {
                            return ((C1889a) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                            IntrinsicsKt.f();
                            if (this.f116748a == 0) {
                                ResultKt.b(obj);
                                C18085d.a aVar = (C18085d.a) this.f116749b;
                                this.f116750c.u1(this.f116751d, aVar);
                                this.f116750c.w1(this.f116752e, aVar);
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1888a c1888a = new C1888a(this.f116745c, this.f116746d, this.f116747e, continuation);
                        c1888a.f116744b = obj;
                        return c1888a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1888a(ShopAndScanActivity shopAndScanActivity, C14677u c14677u, LocalThemeScope localThemeScope, Continuation<? super C1888a> continuation) {
                        super(2, continuation);
                        this.f116745c = shopAndScanActivity;
                        this.f116746d = c14677u;
                        this.f116747e = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1888a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f116743a == 0) {
                            ResultKt.b(obj);
                            C17154h.J(C17154h.O(this.f116745c.t1().a(), new C1889a(this.f116745c, this.f116746d, this.f116747e, null)), (InterfaceC16622O) this.f116744b);
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                C1887a(ShopAndScanActivity shopAndScanActivity, C14677u c14677u) {
                    this.f116741a = shopAndScanActivity;
                    this.f116742b = c14677u;
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
                        ComposerKt.U(-1977908273, i11, -1, "com.meijer.mobile.shopandscan.ShopAndScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ShopAndScanActivity.kt:64)");
                    }
                    Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                    ShopAndScanActivity shopAndScanActivity = this.f116741a;
                    C14677u c14677u = this.f116742b;
                    boolean z10 = false;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                    InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C5664j c5664j = C5664j.f48612a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(shopAndScanActivity) | composer.D(c14677u);
                    int i12 = i11 & 14;
                    if (i12 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme))) {
                        z10 = true;
                    }
                    boolean z11 = zD | z10;
                    Object objB = composer.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new C1888a(shopAndScanActivity, c14677u, AdsTheme, null);
                        composer.t(objB);
                    }
                    composer.P();
                    androidx.compose.runtime.J.g("navigation", (Function2) objB, composer, 6);
                    C18084c.c(AdsTheme, c14677u, composer, LocalThemeScope.f15770g | i12);
                    composer.v();
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

            C1886a(ShopAndScanActivity shopAndScanActivity) {
                this.f116740a = shopAndScanActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1742875774, i10, -1, "com.meijer.mobile.shopandscan.ShopAndScanActivity.onCreate.<anonymous>.<anonymous> (ShopAndScanActivity.kt:62)");
                }
                K.b(null, ComposableLambdaKt.c(-1977908273, true, new C1887a(this.f116740a, j.e(new AbstractC14653B[0], composer, 0)), composer, 54), composer, 48, 1);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1457102681, i10, -1, "com.meijer.mobile.shopandscan.ShopAndScanActivity.onCreate.<anonymous> (ShopAndScanActivity.kt:61)");
            }
            Ej.b.INSTANCE.b(false, ComposableLambdaKt.c(1742875774, true, new C1886a(ShopAndScanActivity.this), composer, 54), composer, 438, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(C14667k navController, final C18085d.a screen) throws Resources.NotFoundException {
        if (!Intrinsics.e(screen, C18085d.a.i.f169858b)) {
            navController.S(screen.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.shopandscan.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShopAndScanActivity.v1(screen, (C14680x) obj);
                }
            });
        } else {
            if (navController.X()) {
                return;
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(C18085d.a aVar, C14680x navigate) {
        Intrinsics.j(navigate, "$this$navigate");
        C14680x.e(navigate, aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, 2, null);
        navigate.f(true);
        return Unit.f142422a;
    }

    private final void x1(int statusBarColor, int navBarColor, boolean fitSystemWindows) {
        L.Companion companion = L.INSTANCE;
        r.a(this, companion.d(statusBarColor, statusBarColor), companion.d(navBarColor, navBarColor));
        k kVarA = C16218j0.a(getWindow(), getWindow().getDecorView());
        kVarA.b(false);
        kVarA.c(false);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        C16218j0.b(getWindow(), fitSystemWindows);
    }

    @Override // com.meijer.mobile.shopandscan.Hilt_ShopAndScanActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        x1(getColor(Bj.g.f2617d), getColor(Bj.g.f2614a), true);
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1457102681, true, new a()), 1, null);
    }

    public final C18085d t1() {
        C18085d c18085d = this.navigationManager;
        if (c18085d != null) {
            return c18085d;
        }
        Intrinsics.y("navigationManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(LocalThemeScope localThemeScope, C18085d.a aVar) {
        if (!Intrinsics.e(aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), C18085d.a.j.f169859b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String()) && !Intrinsics.e(aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), C18085d.a.c.f169852b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            x1(C5349s0.j(localThemeScope.getAdsColors().getAdsColorHover01().getColor()), getColor(Bj.g.f2614a), true);
        } else {
            x1(C5349s0.j(localThemeScope.getAdsColors().getAdsColorTransparent().getColor()), C5349s0.j(localThemeScope.getAdsColors().getAdsColorTransparent().getColor()), false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Shop and Scan").start();
    }
}
