package com.meijer.mobile.scanner.ux.activity;

import Ji.K;
import Ji.LocalThemeScope;
import Mp.ProductScanItem;
import Op.g;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.os.Bundle;
import android.os.Vibrator;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.scanner.ux.activity.ProductScanActivity;
import e.C13588d;
import e.C13589e;
import g.AbstractC14147c;
import g.InterfaceC14146b;
import h.C14320g;
import j$.time.Instant;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C17967q;
import kotlin.C17970r;
import kotlin.EnumC17975t;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import ug.C17255b;
import ug.C17256c;
import ug.InterfaceC17254a;
import vg.C17567a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\rR\u0014\u00106\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\r¨\u0006@²\u0006\u000e\u00109\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020<8\nX\u008a\u0084\u0002²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/scanner/ux/activity/ProductScanActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "v0", "", "", "", "permissions", "y1", "(Ljava/util/Map;)V", "z1", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LCl/e;", "v", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "LOp/g;", "w", "Lkotlin/Lazy;", "x1", "()LOp/g;", "viewModel", "Lug/a;", "x", "w1", "()Lug/a;", "barcodeScanner", "Lg/c;", "", "y", "Lg/c;", "permissionsResultLauncher", "j$/time/Instant", "kotlin.jvm.PlatformType", "z", "Lj$/time/Instant;", "lastScanTimeStamp", "Ljava/util/concurrent/ExecutorService;", "A", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "A1", "isSingleScanMode", "v1", "allowCountIncrement", "B", "a", "barcodeScanned", "", "lensFacing", "LOp/g$d;", "viewState", "LOp/g$b;", "dialogBox", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProductScanActivity extends Hilt_ProductScanActivity {

    /* renamed from: C, reason: collision with root package name */
    public static final int f116525C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private ExecutorService cameraExecutor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Op.g.class), new e(this), new d(this), new f(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy barcodeScanner = LazyKt.b(new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductScanActivity.u1();
        }
    });

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> permissionsResultLauncher = registerForActivityResult(new C14320g(), new c());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Instant lastScanTimeStamp = Instant.now().minusSeconds(4);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17970r f116533a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductScanActivity f116534b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<g.ViewState> f116535c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Mp.d f116536d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f116537e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$a, reason: collision with other inner class name */
            static final class C1872a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116538a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f116539b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<g.ViewState> f116540c;

                C1872a(LocalThemeScope localThemeScope, ProductScanActivity productScanActivity, z1<g.ViewState> z1Var) {
                    this.f116538a = localThemeScope;
                    this.f116539b = productScanActivity;
                    this.f116540c = z1Var;
                }

                public final void b(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(879232423, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:199)");
                    }
                    if (!b.l(this.f116540c).getIsSingleScanMode()) {
                        LocalThemeScope localThemeScope = this.f116538a;
                        List<ProductScanItem> listE = b.l(this.f116540c).e();
                        String strA = C6408b.a(b.l(this.f116540c).getHeaderLabel(), composer, AbstractC5607a.f45514b);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f116539b);
                        final ProductScanActivity productScanActivity = this.f116539b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProductScanActivity.b.a.C1872a.c(productScanActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Np.n.d(localThemeScope, listE, strA, null, (Function0) objB, composer, LocalThemeScope.f15770g, 4);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    b(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductScanActivity productScanActivity) {
                    productScanActivity.x1().y(g.a.b.f24126a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$b, reason: collision with other inner class name */
            static final class C1873b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116541a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f116542b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1874a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116543a;

                    C1874a(LocalThemeScope localThemeScope) {
                        this.f116543a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1954856410, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:195)");
                        }
                        Dr.g.g(this.f116543a, C16193g.c(Mp.j.f21202l, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(1617193242, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:186)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(zj.e.f172832a, new Object[0]);
                    LocalThemeScope localThemeScope = this.f116541a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1954856410, true, new C1874a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f116542b);
                    final ProductScanActivity productScanActivity = this.f116542b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.C1873b.c(productScanActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, null, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (AbstractC5607a.f45514b << 27), 231);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1873b(LocalThemeScope localThemeScope, ProductScanActivity productScanActivity) {
                    this.f116541a = localThemeScope;
                    this.f116542b = productScanActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductScanActivity productScanActivity) {
                    if (productScanActivity.A1()) {
                        if (!productScanActivity.onNavigateUp()) {
                            productScanActivity.finish();
                        }
                    } else {
                        productScanActivity.x1().y(g.a.c.f24127a);
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116544a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Mp.d f116545b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f116546c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f116547d;

                c(LocalThemeScope localThemeScope, Mp.d dVar, ProductScanActivity productScanActivity, InterfaceC5726j0 interfaceC5726j0) {
                    this.f116544a = localThemeScope;
                    this.f116545b = dVar;
                    this.f116546c = productScanActivity;
                    this.f116547d = interfaceC5726j0;
                }

                public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1473113328, i11, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:212)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = J.f(androidx.compose.foundation.b.d(D.h(companion, paddingValues), this.f116544a.getAdsColors().getAdsColorUIOverlay().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f116544a;
                    Mp.d dVar = this.f116545b;
                    ProductScanActivity productScanActivity = this.f116546c;
                    InterfaceC5726j0 interfaceC5726j0 = this.f116547d;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
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
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5664j c5664j = C5664j.f48612a;
                    int iG = b.g(interfaceC5726j0);
                    ExecutorService executorService = productScanActivity.cameraExecutor;
                    if (executorService == null) {
                        Intrinsics.y("cameraExecutor");
                        executorService = null;
                    }
                    Modifier modifierFsExclude = FullStoryAnnotationsKt.fsExclude(J.h(companion, 0.0f, 1, null));
                    int i12 = LocalThemeScope.f15770g;
                    Np.j.c(localThemeScope, dVar, iG, executorService, modifierFsExclude, composer, i12, 0);
                    composer.v();
                    Np.d.d(this.f116544a, null, composer, i12, 1);
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ProductScanActivity$onCreate$1$1$9$1", f = "ProductScanActivity.kt", l = {262}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116548a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f116549b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116550c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOp/g$c;", "effect", "", "<anonymous>", "(LOp/g$c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ProductScanActivity$onCreate$1$1$9$1$1", f = "ProductScanActivity.kt", l = {272, 272}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$d$a, reason: collision with other inner class name */
                static final class C1875a extends SuspendLambda implements Function2<g.c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f116551a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f116552b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ProductScanActivity f116553c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116554d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1875a c1875a = new C1875a(this.f116553c, this.f116554d, continuation);
                        c1875a.f116552b = obj;
                        return c1875a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1875a(ProductScanActivity productScanActivity, LocalThemeScope localThemeScope, Continuation<? super C1875a> continuation) {
                        super(2, continuation);
                        this.f116553c = productScanActivity;
                        this.f116554d = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(g.c cVar, Continuation<? super Unit> continuation) {
                        return ((C1875a) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
                    
                        if (Gi.i.i((Gi.i) r2, r3, null, null, false, r5, null, null, null, r13, 238, null) != r12) goto L28;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            Method dump skipped, instructions count: 218
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.scanner.ux.activity.ProductScanActivity.b.a.d.C1875a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f116549b, this.f116550c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(ProductScanActivity productScanActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f116549b = productScanActivity;
                    this.f116550c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116548a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17144F<g.c> interfaceC17144FU = this.f116549b.x1().u();
                        C1875a c1875a = new C1875a(this.f116549b, this.f116550c, null);
                        this.f116548a = 1;
                        if (C17154h.k(interfaceC17144FU, c1875a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(C17970r c17970r, ProductScanActivity productScanActivity, z1<g.ViewState> z1Var, Mp.d dVar, InterfaceC5726j0 interfaceC5726j0) {
                this.f116533a = c17970r;
                this.f116534b = productScanActivity;
                this.f116535c = z1Var;
                this.f116536d = dVar;
                this.f116537e = interfaceC5726j0;
            }

            public final void g(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                LocalThemeScope localThemeScope;
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
                    ComposerKt.U(997648086, i11, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous> (ProductScanActivity.kt:183)");
                }
                int i12 = i11;
                C17967q.b(ComposableLambdaKt.c(879232423, true, new C1872a(AdsTheme, this.f116534b, this.f116535c), composer, 54), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f116533a, ComposableLambdaKt.c(1617193242, true, new C1873b(AdsTheme, this.f116534b), composer, 54), null, null, 0, false, null, 0.0f, 0L, 0L, H1.h.p(!b.l(this.f116535c).getIsSingleScanMode() ? 240 : 0), 0L, 0L, ComposableLambdaKt.c(-1473113328, true, new c(AdsTheme, this.f116536d, this.f116534b, this.f116537e), composer, 54), composer, 3078, 196608, 28656);
                InterfaceC17144F<g.b> interfaceC17144FT = this.f116534b.x1().t();
                g.b.C0430b c0430b = g.b.C0430b.f24131a;
                Composer composer2 = composer;
                g.b bVarK = k(o1.a(interfaceC17144FT, c0430b, null, composer2, 48, 2));
                if (Intrinsics.e(bVarK, g.b.a.f24130a)) {
                    composer2.startReplaceGroup(-237112051);
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(this.f116534b);
                    final ProductScanActivity productScanActivity = this.f116534b;
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.p(productScanActivity);
                            }
                        };
                        composer2.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zD2 = composer2.D(this.f116534b);
                    final ProductScanActivity productScanActivity2 = this.f116534b;
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.q(productScanActivity2);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    Np.g.b(AdsTheme, null, function0, (Function0) objB2, composer2, (i12 & 14) | LocalThemeScope.f15770g, 1);
                    composer2.P();
                    localThemeScope = AdsTheme;
                } else if (Intrinsics.e(bVarK, g.b.c.f24132a)) {
                    composer2.startReplaceGroup(-236634372);
                    composer2.startReplaceGroup(5004770);
                    boolean zD3 = composer2.D(this.f116534b);
                    final ProductScanActivity productScanActivity3 = this.f116534b;
                    Object objB3 = composer2.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.r(productScanActivity3);
                            }
                        };
                        composer2.t(objB3);
                    }
                    Function0 function02 = (Function0) objB3;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zD4 = composer2.D(this.f116534b);
                    final ProductScanActivity productScanActivity4 = this.f116534b;
                    Object objB4 = composer2.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.s(productScanActivity4);
                            }
                        };
                        composer2.t(objB4);
                    }
                    Function0 function03 = (Function0) objB4;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zD5 = composer2.D(this.f116534b);
                    final ProductScanActivity productScanActivity5 = this.f116534b;
                    Object objB5 = composer2.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.l(productScanActivity5);
                            }
                        };
                        composer2.t(objB5);
                    }
                    composer2.P();
                    localThemeScope = AdsTheme;
                    Np.q.b(localThemeScope, null, function02, function03, (Function0) objB5, composer2, LocalThemeScope.f15770g | (i12 & 14), 1);
                    composer2 = composer2;
                    composer2.P();
                } else {
                    localThemeScope = AdsTheme;
                    if (!Intrinsics.e(bVarK, c0430b)) {
                        composer2.startReplaceGroup(962180108);
                        composer2.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-236247492);
                    composer2.P();
                }
                composer2.startReplaceGroup(-1633490746);
                boolean zD6 = composer2.D(this.f116534b) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer2.D(localThemeScope)));
                ProductScanActivity productScanActivity6 = this.f116534b;
                Object objB6 = composer2.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new d(productScanActivity6, localThemeScope, null);
                    composer2.t(objB6);
                }
                composer2.P();
                androidx.compose.runtime.J.g("ProductScannedActivity", (Function2) objB6, composer2, 6);
                boolean z10 = !this.f116534b.A1();
                composer2.startReplaceGroup(5004770);
                boolean zD7 = composer2.D(this.f116534b);
                final ProductScanActivity productScanActivity7 = this.f116534b;
                Object objB7 = composer2.B();
                if (zD7 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductScanActivity.b.a.o(productScanActivity7);
                        }
                    };
                    composer2.t(objB7);
                }
                composer2.P();
                C13588d.a(z10, (Function0) objB7, composer2, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                g(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final g.b k(z1<? extends g.b> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.b.f24126a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.c.f24127a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(ProductScanActivity productScanActivity) {
                productScanActivity.finish();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(ProductScanActivity productScanActivity) {
                productScanActivity.startActivity(productScanActivity.getMeijerIntent().b(productScanActivity));
                productScanActivity.finish();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.C0429a.f24125a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(ProductScanActivity productScanActivity) {
                productScanActivity.finish();
                return Unit.f142422a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(ProductScanActivity productScanActivity, InterfaceC5730l0 interfaceC5730l0, List barcodes) {
            Intrinsics.j(barcodes, "barcodes");
            if (!productScanActivity.z1()) {
                if (!productScanActivity.A1()) {
                    Vibrator vibrator = (Vibrator) Z1.b.j(productScanActivity, Vibrator.class);
                    if (vibrator != null) {
                        Kk.c.b(vibrator, 0L, 0, 3, null);
                    }
                    Op.g gVarX1 = productScanActivity.x1();
                    List list = barcodes;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Mp.e.a((C17567a) it.next()));
                    }
                    gVarX1.y(new g.a.MultiScanModeProductScanned(arrayList));
                } else if (!e(interfaceC5730l0)) {
                    Vibrator vibrator2 = (Vibrator) Z1.b.j(productScanActivity, Vibrator.class);
                    if (vibrator2 != null) {
                        Kk.c.b(vibrator2, 0L, 0, 3, null);
                    }
                    Op.g gVarX12 = productScanActivity.x1();
                    List list2 = barcodes;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Mp.e.a((C17567a) it2.next()));
                    }
                    gVarX12.y(new g.a.SingleScanModeProductScanned(arrayList2));
                    f(interfaceC5730l0, true);
                }
                productScanActivity.lastScanTimeStamp = Instant.now();
            }
            return Unit.f142422a;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-958768635, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous> (ProductScanActivity.kt:145)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = C5702c1.a(1);
                composer.t(objB2);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB2;
            composer.P();
            C17970r c17970rK = C17967q.k(C17967q.l(EnumC17975t.f168664a, null, null, composer, 6, 6), null, composer, 0, 2);
            composer.startReplaceGroup(1849434622);
            final ProductScanActivity productScanActivity = ProductScanActivity.this;
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Mp.d(productScanActivity.w1(), new Function1() { // from class: com.meijer.mobile.scanner.ux.activity.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductScanActivity.b.k(productScanActivity, interfaceC5730l0, (List) obj);
                    }
                });
                composer.t(objB3);
            }
            composer.P();
            z1 z1VarC = S2.a.c(ProductScanActivity.this.x1().v(), null, null, null, composer, 0, 7);
            K.b(null, ComposableLambdaKt.c(997648086, true, new a(c17970rK, ProductScanActivity.this, z1VarC, (Mp.d) objB3, interfaceC5726j0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f142422a;
        }

        private static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        private static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int g(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.ViewState l(z1<g.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductScanActivity.this, ProductScanActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            ProductScanActivity.this.y1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116556f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f116556f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f116556f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f116557f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f116557f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f116558f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116559g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f116558f = function0;
            this.f116559g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f116558f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f116559g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17254a u1() {
        return C17256c.a(new C17255b.a().c(32, 64, 512, 1024, 16).b().a());
    }

    private final void v0() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.CAMERA"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC17254a w1() {
        return (InterfaceC17254a) this.barcodeScanner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Op.g x1() {
        return (Op.g) this.viewModel.getValue();
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A1() {
        return getIntent().getBooleanExtra("single_scan_mode", false);
    }

    private final boolean v1() {
        return getIntent().getBooleanExtra("allow_count_increment_mode", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(Map<String, Boolean> permissions) {
        x1().w(Intrinsics.e(permissions.get("android.permission.CAMERA"), Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z1() {
        if (Math.abs((Instant.now().toEpochMilli() - this.lastScanTimeStamp.toEpochMilli()) / 1000) < 2) {
            return true;
        }
        return false;
    }

    @Override // com.meijer.mobile.scanner.ux.activity.Hilt_ProductScanActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v0();
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        x1().x(v1(), A1());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-958768635, true, new b()), 1, null);
    }
}
