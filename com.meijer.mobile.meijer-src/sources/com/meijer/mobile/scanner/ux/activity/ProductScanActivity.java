package com.meijer.mobile.scanner.ux.activity;

import Ki.K;
import Ki.LocalThemeScope;
import Mp.ProductScanItem;
import Op.g;
import V2.CreationExtras;
import android.os.Bundle;
import android.os.Vibrator;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.scanner.ux.activity.ProductScanActivity;
import dk.C13698b;
import e.C13736d;
import e.C13737e;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import h.C14433g;
import j$.time.Instant;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C18033q;
import kotlin.C18036r;
import kotlin.EnumC18041t;
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
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import wg.C17872b;
import wg.C17873c;
import wg.InterfaceC17871a;
import xg.C18179a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\rR\u0014\u00106\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\r¨\u0006@²\u0006\u000e\u00109\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020<8\nX\u008a\u0084\u0002²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/scanner/ux/activity/ProductScanActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "z0", "", "", "", "permissions", "y1", "(Ljava/util/Map;)V", "z1", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "LOp/g;", "w", "Lkotlin/Lazy;", "x1", "()LOp/g;", "viewModel", "Lwg/a;", "x", "w1", "()Lwg/a;", "barcodeScanner", "Lg/c;", "", "y", "Lg/c;", "permissionsResultLauncher", "j$/time/Instant", "kotlin.jvm.PlatformType", "z", "Lj$/time/Instant;", "lastScanTimeStamp", "Ljava/util/concurrent/ExecutorService;", "A", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "A1", "isSingleScanMode", "v1", "allowCountIncrement", "B", "a", "barcodeScanned", "", "lensFacing", "LOp/g$d;", "viewState", "LOp/g$b;", "dialogBox", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ProductScanActivity extends Hilt_ProductScanActivity {

    /* renamed from: C, reason: collision with root package name */
    public static final int f117470C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private ExecutorService cameraExecutor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

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
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new c());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Instant lastScanTimeStamp = Instant.now().minusSeconds(4);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C18036r f117478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductScanActivity f117479b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<g.ViewState> f117480c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Mp.d f117481d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f117482e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$a, reason: collision with other inner class name */
            static final class C1879a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117483a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f117484b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<g.ViewState> f117485c;

                C1879a(LocalThemeScope localThemeScope, ProductScanActivity productScanActivity, z1<g.ViewState> z1Var) {
                    this.f117483a = localThemeScope;
                    this.f117484b = productScanActivity;
                    this.f117485c = z1Var;
                }

                public final void b(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(879232423, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:199)");
                    }
                    if (!b.l(this.f117485c).getIsSingleScanMode()) {
                        LocalThemeScope localThemeScope = this.f117483a;
                        List<ProductScanItem> listE = b.l(this.f117485c).e();
                        String strA = C13698b.a(b.l(this.f117485c).getHeaderLabel(), composer, AbstractC6392a.f60445b);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f117484b);
                        final ProductScanActivity productScanActivity = this.f117484b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProductScanActivity.b.a.C1879a.c(productScanActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Np.n.d(localThemeScope, listE, strA, null, (Function0) objB, composer, LocalThemeScope.f17314g, 4);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    b(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductScanActivity productScanActivity) {
                    productScanActivity.x1().y(g.a.b.f24824a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$b, reason: collision with other inner class name */
            static final class C1880b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117486a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f117487b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1881a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117488a;

                    C1881a(LocalThemeScope localThemeScope) {
                        this.f117488a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1954856410, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:195)");
                        }
                        Dr.g.g(this.f117488a, C16338g.c(Mp.j.f20401l, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(1617193242, i10, -1, "com.meijer.mobile.scanner.ux.activity.ProductScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductScanActivity.kt:186)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Aj.e.f1348a, new Object[0]);
                    LocalThemeScope localThemeScope = this.f117486a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1954856410, true, new C1881a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f117487b);
                    final ProductScanActivity productScanActivity = this.f117487b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductScanActivity.b.a.C1880b.c(productScanActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, null, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (AbstractC6392a.f60445b << 27), 231);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1880b(LocalThemeScope localThemeScope, ProductScanActivity productScanActivity) {
                    this.f117486a = localThemeScope;
                    this.f117487b = productScanActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductScanActivity productScanActivity) {
                    if (productScanActivity.A1()) {
                        if (!productScanActivity.onNavigateUp()) {
                            productScanActivity.finish();
                        }
                    } else {
                        productScanActivity.x1().y(g.a.c.f24825a);
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117489a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Mp.d f117490b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f117491c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f117492d;

                c(LocalThemeScope localThemeScope, Mp.d dVar, ProductScanActivity productScanActivity, InterfaceC5868j0 interfaceC5868j0) {
                    this.f117489a = localThemeScope;
                    this.f117490b = dVar;
                    this.f117491c = productScanActivity;
                    this.f117492d = interfaceC5868j0;
                }

                public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
                    Modifier modifierF = J.f(androidx.compose.foundation.b.d(D.h(companion, paddingValues), this.f117489a.getAdsColors().getAdsColorUIOverlay().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f117489a;
                    Mp.d dVar = this.f117490b;
                    ProductScanActivity productScanActivity = this.f117491c;
                    InterfaceC5868j0 interfaceC5868j0 = this.f117492d;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
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
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    int iG = b.g(interfaceC5868j0);
                    ExecutorService executorService = productScanActivity.cameraExecutor;
                    if (executorService == null) {
                        Intrinsics.x("cameraExecutor");
                        executorService = null;
                    }
                    Modifier modifierFsExclude = FullStoryAnnotationsKt.fsExclude(J.h(companion, 0.0f, 1, null));
                    int i12 = LocalThemeScope.f17314g;
                    Np.j.c(localThemeScope, dVar, iG, executorService, modifierFsExclude, composer, i12, 0);
                    composer.v();
                    Np.d.d(this.f117489a, null, composer, i12, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ProductScanActivity$onCreate$1$1$9$1", f = "ProductScanActivity.kt", l = {262}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117493a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductScanActivity f117494b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117495c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOp/g$c;", "effect", "", "<anonymous>", "(LOp/g$c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ProductScanActivity$onCreate$1$1$9$1$1", f = "ProductScanActivity.kt", l = {272, 272}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ProductScanActivity$b$a$d$a, reason: collision with other inner class name */
                static final class C1882a extends SuspendLambda implements Function2<g.c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117496a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f117497b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ProductScanActivity f117498c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117499d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1882a c1882a = new C1882a(this.f117498c, this.f117499d, continuation);
                        c1882a.f117497b = obj;
                        return c1882a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1882a(ProductScanActivity productScanActivity, LocalThemeScope localThemeScope, Continuation<? super C1882a> continuation) {
                        super(2, continuation);
                        this.f117498c = productScanActivity;
                        this.f117499d = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(g.c cVar, Continuation<? super Unit> continuation) {
                        return ((C1882a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
                    
                        if (Hi.i.i((Hi.i) r2, r3, null, null, false, r5, null, null, null, r13, 238, null) != r12) goto L28;
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
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.scanner.ux.activity.ProductScanActivity.b.a.d.C1882a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f117494b, this.f117495c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(ProductScanActivity productScanActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f117494b = productScanActivity;
                    this.f117495c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117493a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16553F<g.c> interfaceC16553FU = this.f117494b.x1().u();
                        C1882a c1882a = new C1882a(this.f117494b, this.f117495c, null);
                        this.f117493a = 1;
                        if (C16563h.k(interfaceC16553FU, c1882a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(C18036r c18036r, ProductScanActivity productScanActivity, z1<g.ViewState> z1Var, Mp.d dVar, InterfaceC5868j0 interfaceC5868j0) {
                this.f117478a = c18036r;
                this.f117479b = productScanActivity;
                this.f117480c = z1Var;
                this.f117481d = dVar;
                this.f117482e = interfaceC5868j0;
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
                C18033q.b(ComposableLambdaKt.c(879232423, true, new C1879a(AdsTheme, this.f117479b, this.f117480c), composer, 54), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f117478a, ComposableLambdaKt.c(1617193242, true, new C1880b(AdsTheme, this.f117479b), composer, 54), null, null, 0, false, null, 0.0f, 0L, 0L, H1.h.p(!b.l(this.f117480c).getIsSingleScanMode() ? 240 : 0), 0L, 0L, ComposableLambdaKt.c(-1473113328, true, new c(AdsTheme, this.f117481d, this.f117479b, this.f117482e), composer, 54), composer, 3078, 196608, 28656);
                InterfaceC16553F<g.b> interfaceC16553FT = this.f117479b.x1().t();
                g.b.C0409b c0409b = g.b.C0409b.f24829a;
                Composer composer2 = composer;
                g.b bVarK = k(o1.a(interfaceC16553FT, c0409b, null, composer2, 48, 2));
                if (Intrinsics.e(bVarK, g.b.a.f24828a)) {
                    composer2.startReplaceGroup(-237112051);
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(this.f117479b);
                    final ProductScanActivity productScanActivity = this.f117479b;
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
                    boolean zD2 = composer2.D(this.f117479b);
                    final ProductScanActivity productScanActivity2 = this.f117479b;
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
                    Np.g.b(AdsTheme, null, function0, (Function0) objB2, composer2, (i12 & 14) | LocalThemeScope.f17314g, 1);
                    composer2.P();
                    localThemeScope = AdsTheme;
                } else if (Intrinsics.e(bVarK, g.b.c.f24830a)) {
                    composer2.startReplaceGroup(-236634372);
                    composer2.startReplaceGroup(5004770);
                    boolean zD3 = composer2.D(this.f117479b);
                    final ProductScanActivity productScanActivity3 = this.f117479b;
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
                    boolean zD4 = composer2.D(this.f117479b);
                    final ProductScanActivity productScanActivity4 = this.f117479b;
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
                    boolean zD5 = composer2.D(this.f117479b);
                    final ProductScanActivity productScanActivity5 = this.f117479b;
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
                    Np.q.b(localThemeScope, null, function02, function03, (Function0) objB5, composer2, LocalThemeScope.f17314g | (i12 & 14), 1);
                    composer2 = composer2;
                    composer2.P();
                } else {
                    localThemeScope = AdsTheme;
                    if (!Intrinsics.e(bVarK, c0409b)) {
                        composer2.startReplaceGroup(962180108);
                        composer2.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-236247492);
                    composer2.P();
                }
                composer2.startReplaceGroup(-1633490746);
                boolean zD6 = composer2.D(this.f117479b) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer2.D(localThemeScope)));
                ProductScanActivity productScanActivity6 = this.f117479b;
                Object objB6 = composer2.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new d(productScanActivity6, localThemeScope, null);
                    composer2.t(objB6);
                }
                composer2.P();
                androidx.compose.runtime.J.g("ProductScannedActivity", (Function2) objB6, composer2, 6);
                boolean z10 = !this.f117479b.A1();
                composer2.startReplaceGroup(5004770);
                boolean zD7 = composer2.D(this.f117479b);
                final ProductScanActivity productScanActivity7 = this.f117479b;
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
                C13736d.a(z10, (Function0) objB7, composer2, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                g(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final g.b k(z1<? extends g.b> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.b.f24824a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.c.f24825a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(ProductScanActivity productScanActivity) {
                productScanActivity.finish();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(ProductScanActivity productScanActivity) {
                productScanActivity.startActivity(productScanActivity.getMeijerIntent().b(productScanActivity));
                productScanActivity.finish();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(ProductScanActivity productScanActivity) {
                productScanActivity.x1().y(g.a.C0408a.f24823a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(ProductScanActivity productScanActivity) {
                productScanActivity.finish();
                return Unit.f143329a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(ProductScanActivity productScanActivity, InterfaceC5872l0 interfaceC5872l0, List barcodes) {
            Intrinsics.j(barcodes, "barcodes");
            if (!productScanActivity.z1()) {
                if (!productScanActivity.A1()) {
                    Vibrator vibrator = (Vibrator) Z1.b.j(productScanActivity, Vibrator.class);
                    if (vibrator != null) {
                        Lk.c.b(vibrator, 0L, 0, 3, null);
                    }
                    Op.g gVarX1 = productScanActivity.x1();
                    List list = barcodes;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Mp.e.a((C18179a) it.next()));
                    }
                    gVarX1.y(new g.a.MultiScanModeProductScanned(arrayList));
                } else if (!e(interfaceC5872l0)) {
                    Vibrator vibrator2 = (Vibrator) Z1.b.j(productScanActivity, Vibrator.class);
                    if (vibrator2 != null) {
                        Lk.c.b(vibrator2, 0L, 0, 3, null);
                    }
                    Op.g gVarX12 = productScanActivity.x1();
                    List list2 = barcodes;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Mp.e.a((C18179a) it2.next()));
                    }
                    gVarX12.y(new g.a.SingleScanModeProductScanned(arrayList2));
                    f(interfaceC5872l0, true);
                }
                productScanActivity.lastScanTimeStamp = Instant.now();
            }
            return Unit.f143329a;
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = C5844c1.a(1);
                composer.t(objB2);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB2;
            composer.P();
            C18036r c18036rK = C18033q.k(C18033q.l(EnumC18041t.f169752a, null, null, composer, 6, 6), null, composer, 0, 2);
            composer.startReplaceGroup(1849434622);
            final ProductScanActivity productScanActivity = ProductScanActivity.this;
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Mp.d(productScanActivity.w1(), new Function1() { // from class: com.meijer.mobile.scanner.ux.activity.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductScanActivity.b.k(productScanActivity, interfaceC5872l0, (List) obj);
                    }
                });
                composer.t(objB3);
            }
            composer.P();
            z1 z1VarC = S2.a.c(ProductScanActivity.this.x1().v(), null, null, null, composer, 0, 7);
            K.b(null, ComposableLambdaKt.c(997648086, true, new a(c18036rK, ProductScanActivity.this, z1VarC, (Mp.d) objB3, interfaceC5868j0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int g(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.ViewState l(z1<g.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14275b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            ProductScanActivity.this.y1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f117501f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117501f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117502f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f117502f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f117502f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117503f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117504g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117503f = function0;
            this.f117504g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117503f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117504g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17871a u1() {
        return C17873c.a(new C17872b.a().c(32, 64, 512, 1024, 16).b().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC17871a w1() {
        return (InterfaceC17871a) this.barcodeScanner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Op.g x1() {
        return (Op.g) this.viewModel.getValue();
    }

    private final void z0() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.CAMERA"});
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
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
        z0();
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        x1().x(v1(), A1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-958768635, true, new b()), 1, null);
    }
}
