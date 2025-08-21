package com.meijer.mobile.shopandscan;

import Ki.K;
import Ki.LocalThemeScope;
import V0.C5492s0;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.core.view.k;
import androidx.view.L;
import androidx.view.r;
import com.fullstory.FS;
import e.C13737e;
import j4.j;
import kotlin.AbstractC14656B;
import kotlin.C14670k;
import kotlin.C14680u;
import kotlin.C14683x;
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
import mv.InterfaceC15783O;
import p2.C16363j0;
import pv.C16563h;
import xq.C18212c;
import xq.C18213d;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u0003R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/meijer/mobile/shopandscan/ShopAndScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Li4/k;", "navController", "Lxq/d$a;", "screen", "", "u1", "(Li4/k;Lxq/d$a;)V", "LKi/M;", "w1", "(LKi/M;Lxq/d$a;)V", "", "statusBarColor", "navBarColor", "", "fitSystemWindows", "x1", "(IIZ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lxq/d;", "v", "Lxq/d;", "t1", "()Lxq/d;", "setNavigationManager$shopandscan_playstoreRelease", "(Lxq/d;)V", "navigationManager", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShopAndScanActivity extends Hilt_ShopAndScanActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public C18213d navigationManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a, reason: collision with other inner class name */
        static final class C1893a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ShopAndScanActivity f117685a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a, reason: collision with other inner class name */
            static final class C1894a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ShopAndScanActivity f117686a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14680u f117687b;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shopandscan.ShopAndScanActivity$onCreate$1$1$1$1$1$1", f = "ShopAndScanActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1895a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117688a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f117689b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ShopAndScanActivity f117690c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C14680u f117691d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117692e;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq/d$a;", "screen", "", "<anonymous>", "(Lxq/d$a;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.shopandscan.ShopAndScanActivity$onCreate$1$1$1$1$1$1$1", f = "ShopAndScanActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.shopandscan.ShopAndScanActivity$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C1896a extends SuspendLambda implements Function2<C18213d.a, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f117693a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f117694b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ ShopAndScanActivity f117695c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ C14680u f117696d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f117697e;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1896a c1896a = new C1896a(this.f117695c, this.f117696d, this.f117697e, continuation);
                            c1896a.f117694b = obj;
                            return c1896a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1896a(ShopAndScanActivity shopAndScanActivity, C14680u c14680u, LocalThemeScope localThemeScope, Continuation<? super C1896a> continuation) {
                            super(2, continuation);
                            this.f117695c = shopAndScanActivity;
                            this.f117696d = c14680u;
                            this.f117697e = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(C18213d.a aVar, Continuation<? super Unit> continuation) {
                            return ((C1896a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                            IntrinsicsKt.f();
                            if (this.f117693a == 0) {
                                ResultKt.b(obj);
                                C18213d.a aVar = (C18213d.a) this.f117694b;
                                this.f117695c.u1(this.f117696d, aVar);
                                this.f117695c.w1(this.f117697e, aVar);
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1895a c1895a = new C1895a(this.f117690c, this.f117691d, this.f117692e, continuation);
                        c1895a.f117689b = obj;
                        return c1895a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1895a(ShopAndScanActivity shopAndScanActivity, C14680u c14680u, LocalThemeScope localThemeScope, Continuation<? super C1895a> continuation) {
                        super(2, continuation);
                        this.f117690c = shopAndScanActivity;
                        this.f117691d = c14680u;
                        this.f117692e = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1895a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117688a == 0) {
                            ResultKt.b(obj);
                            C16563h.J(C16563h.O(this.f117690c.t1().a(), new C1896a(this.f117690c, this.f117691d, this.f117692e, null)), (InterfaceC15783O) this.f117689b);
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                C1894a(ShopAndScanActivity shopAndScanActivity, C14680u c14680u) {
                    this.f117686a = shopAndScanActivity;
                    this.f117687b = c14680u;
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
                    ShopAndScanActivity shopAndScanActivity = this.f117686a;
                    C14680u c14680u = this.f117687b;
                    boolean z10 = false;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C5806j c5806j = C5806j.f48836a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(shopAndScanActivity) | composer.D(c14680u);
                    int i12 = i11 & 14;
                    if (i12 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme))) {
                        z10 = true;
                    }
                    boolean z11 = zD | z10;
                    Object objB = composer.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new C1895a(shopAndScanActivity, c14680u, AdsTheme, null);
                        composer.t(objB);
                    }
                    composer.P();
                    androidx.compose.runtime.J.g("navigation", (Function2) objB, composer, 6);
                    C18212c.c(AdsTheme, c14680u, composer, LocalThemeScope.f17314g | i12);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    a(localThemeScope, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C1893a(ShopAndScanActivity shopAndScanActivity) {
                this.f117685a = shopAndScanActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1742875774, i10, -1, "com.meijer.mobile.shopandscan.ShopAndScanActivity.onCreate.<anonymous>.<anonymous> (ShopAndScanActivity.kt:62)");
                }
                K.b(null, ComposableLambdaKt.c(-1977908273, true, new C1894a(this.f117685a, j.e(new AbstractC14656B[0], composer, 0)), composer, 54), composer, 48, 1);
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
            Fj.b.INSTANCE.b(false, ComposableLambdaKt.c(1742875774, true, new C1893a(ShopAndScanActivity.this), composer, 54), composer, 438, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(C14670k navController, final C18213d.a screen) throws Resources.NotFoundException {
        if (!Intrinsics.e(screen, C18213d.a.i.f170950b)) {
            navController.S(screen.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.shopandscan.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShopAndScanActivity.v1(screen, (C14683x) obj);
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
    public static final Unit v1(C18213d.a aVar, C14683x navigate) {
        Intrinsics.j(navigate, "$this$navigate");
        C14683x.e(navigate, aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, 2, null);
        navigate.f(true);
        return Unit.f143329a;
    }

    private final void x1(int statusBarColor, int navBarColor, boolean fitSystemWindows) {
        L.Companion companion = L.INSTANCE;
        r.a(this, companion.d(statusBarColor, statusBarColor), companion.d(navBarColor, navBarColor));
        k kVarA = C16363j0.a(getWindow(), getWindow().getDecorView());
        kVarA.b(false);
        kVarA.c(false);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        C16363j0.b(getWindow(), fitSystemWindows);
    }

    @Override // com.meijer.mobile.shopandscan.Hilt_ShopAndScanActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        x1(getColor(Cj.g.f4662d), getColor(Cj.g.f4659a), true);
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1457102681, true, new a()), 1, null);
    }

    public final C18213d t1() {
        C18213d c18213d = this.navigationManager;
        if (c18213d != null) {
            return c18213d;
        }
        Intrinsics.x("navigationManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(LocalThemeScope localThemeScope, C18213d.a aVar) {
        if (!Intrinsics.e(aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), C18213d.a.j.f170951b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String()) && !Intrinsics.e(aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), C18213d.a.c.f170944b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            x1(C5492s0.j(localThemeScope.getAdsColors().getAdsColorHover01().getColor()), getColor(Cj.g.f4659a), true);
        } else {
            x1(C5492s0.j(localThemeScope.getAdsColors().getAdsColorTransparent().getColor()), C5492s0.j(localThemeScope.getAdsColors().getAdsColorTransparent().getColor()), false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Shop and Scan").start();
    }
}
