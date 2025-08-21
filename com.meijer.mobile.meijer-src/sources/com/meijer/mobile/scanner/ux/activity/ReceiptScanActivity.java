package com.meijer.mobile.scanner.ux.activity;

import Ki.K;
import Ki.LocalThemeScope;
import Op.k;
import V2.CreationExtras;
import android.content.Intent;
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
import com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity;
import e.C13737e;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import h.C14433g;
import j0.InterfaceC14882C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C17987a1;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u00063²\u0006\u000e\u0010.\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/scanner/ux/activity/ReceiptScanActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "", "", "permissions", "", "u1", "(Ljava/util/Map;)V", "z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "LOp/k;", "w", "Lkotlin/Lazy;", "t1", "()LOp/k;", "viewModel", "Lwg/a;", "x", "s1", "()Lwg/a;", "barcodeScanner", "Lg/c;", "", "y", "Lg/c;", "permissionsResultLauncher", "Ljava/util/concurrent/ExecutorService;", "z", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "A", "a", "barcodeScanned", "", "lensFacing", "LOp/k$b;", "dialogBox", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ReceiptScanActivity extends Hilt_ReceiptScanActivity {

    /* renamed from: B, reason: collision with root package name */
    public static final int f117506B = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Op.k.class), new e(this), new d(this), new f(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy barcodeScanner = LazyKt.b(new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReceiptScanActivity.r1();
        }
    });

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new c());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private ExecutorService cameraExecutor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReceiptScanActivity f117513a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Mp.d f117514b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f117515c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$b$a$a, reason: collision with other inner class name */
            static final class C1883a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117516a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptScanActivity f117517b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1884a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117518a;

                    C1884a(LocalThemeScope localThemeScope) {
                        this.f117518a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-135307759, i10, -1, "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptScanActivity.kt:123)");
                        }
                        Dr.g.g(this.f117518a, C16338g.c(Mp.j.f20401l, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(321534673, i10, -1, "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptScanActivity.kt:120)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Aj.e.f1348a, new Object[0]);
                    LocalThemeScope localThemeScope = this.f117516a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-135307759, true, new C1884a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f117517b);
                    final ReceiptScanActivity receiptScanActivity = this.f117517b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiptScanActivity.b.a.C1883a.c(receiptScanActivity);
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

                C1883a(LocalThemeScope localThemeScope, ReceiptScanActivity receiptScanActivity) {
                    this.f117516a = localThemeScope;
                    this.f117517b = receiptScanActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ReceiptScanActivity receiptScanActivity) {
                    if (!receiptScanActivity.onNavigateUp()) {
                        receiptScanActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$b$a$b, reason: collision with other inner class name */
            static final class C1885b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117519a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Mp.d f117520b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ReceiptScanActivity f117521c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f117522d;

                C1885b(LocalThemeScope localThemeScope, Mp.d dVar, ReceiptScanActivity receiptScanActivity, InterfaceC5868j0 interfaceC5868j0) {
                    this.f117519a = localThemeScope;
                    this.f117520b = dVar;
                    this.f117521c = receiptScanActivity;
                    this.f117522d = interfaceC5868j0;
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
                        ComposerKt.U(2143919992, i11, -1, "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptScanActivity.kt:127)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = J.f(androidx.compose.foundation.b.d(D.h(companion, paddingValues), this.f117519a.getAdsColors().getAdsColorUIOverlay().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f117519a;
                    Mp.d dVar = this.f117520b;
                    ReceiptScanActivity receiptScanActivity = this.f117521c;
                    InterfaceC5868j0 interfaceC5868j0 = this.f117522d;
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
                    int iF = b.f(interfaceC5868j0);
                    ExecutorService executorService = receiptScanActivity.cameraExecutor;
                    if (executorService == null) {
                        Intrinsics.x("cameraExecutor");
                        executorService = null;
                    }
                    Modifier modifierFsExclude = FullStoryAnnotationsKt.fsExclude(J.h(companion, 0.0f, 1, null));
                    int i12 = LocalThemeScope.f17314g;
                    Np.j.c(localThemeScope, dVar, iF, executorService, modifierFsExclude, composer, i12, 0);
                    composer.v();
                    Np.d.d(this.f117519a, null, composer, i12, 1);
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
            @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$onCreate$1$1$5$1", f = "ReceiptScanActivity.kt", l = {168}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117523a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptScanActivity f117524b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(ReceiptScanActivity receiptScanActivity, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f117524b = receiptScanActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f117524b, continuation);
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOp/k$c;", "effect", "", "<anonymous>", "(LOp/k$c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$onCreate$1$1$5$1$1", f = "ReceiptScanActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1886a extends SuspendLambda implements Function2<k.c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117525a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f117526b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ReceiptScanActivity f117527c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1886a(ReceiptScanActivity receiptScanActivity, Continuation<? super C1886a> continuation) {
                        super(2, continuation);
                        this.f117527c = receiptScanActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1886a c1886a = new C1886a(this.f117527c, continuation);
                        c1886a.f117526b = obj;
                        return c1886a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(k.c cVar, Continuation<? super Unit> continuation) {
                        return ((C1886a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117525a == 0) {
                            ResultKt.b(obj);
                            k.c cVar = (k.c) this.f117526b;
                            if (cVar instanceof k.c.ReceiptScanned) {
                                Intent intentPutExtra = this.f117527c.getIntent().putExtra("barcode", ((k.c.ReceiptScanned) cVar).getBarcode());
                                ReceiptScanActivity receiptScanActivity = this.f117527c;
                                receiptScanActivity.setResult(-1, intentPutExtra);
                                receiptScanActivity.finish();
                                return Unit.f143329a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117523a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16553F<k.c> interfaceC16553FP = this.f117524b.t1().p();
                        C1886a c1886a = new C1886a(this.f117524b, null);
                        this.f117523a = 1;
                        if (C16563h.k(interfaceC16553FP, c1886a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(ReceiptScanActivity receiptScanActivity, Mp.d dVar, InterfaceC5868j0 interfaceC5868j0) {
                this.f117513a = receiptScanActivity;
                this.f117514b = dVar;
                this.f117515c = interfaceC5868j0;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(1815765878, i11, -1, "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity.onCreate.<anonymous>.<anonymous> (ReceiptScanActivity.kt:117)");
                }
                int i12 = i11;
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(321534673, true, new C1883a(AdsTheme, this.f117513a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(2143919992, true, new C1885b(AdsTheme, this.f117514b, this.f117513a, this.f117515c), composer, 54), composer, 384, 12582912, 131066);
                InterfaceC16553F<k.b> interfaceC16553FO = this.f117513a.t1().o();
                k.b.C0413b c0413b = k.b.C0413b.f24870a;
                k.b bVarD = d(o1.a(interfaceC16553FO, c0413b, null, composer, 48, 2));
                composer.startReplaceGroup(1194331766);
                if (Intrinsics.e(bVarD, k.b.a.f24869a)) {
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f117513a);
                    final ReceiptScanActivity receiptScanActivity = this.f117513a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiptScanActivity.b.a.e(receiptScanActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f117513a);
                    final ReceiptScanActivity receiptScanActivity2 = this.f117513a;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiptScanActivity.b.a.f(receiptScanActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Np.g.b(AdsTheme, null, function0, (Function0) objB2, composer, (i12 & 14) | LocalThemeScope.f17314g, 1);
                } else if (!Intrinsics.e(bVarD, c0413b)) {
                    throw new NoWhenBranchMatchedException();
                }
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f117513a);
                ReceiptScanActivity receiptScanActivity3 = this.f117513a;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new c(receiptScanActivity3, null);
                    composer.t(objB3);
                }
                composer.P();
                androidx.compose.runtime.J.g("ReceiptScanActivity", (Function2) objB3, composer, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final k.b d(z1<? extends k.b> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ReceiptScanActivity receiptScanActivity) {
                receiptScanActivity.finish();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ReceiptScanActivity receiptScanActivity) {
                receiptScanActivity.startActivity(receiptScanActivity.getMeijerIntent().b(receiptScanActivity));
                receiptScanActivity.finish();
                return Unit.f143329a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(ReceiptScanActivity receiptScanActivity, InterfaceC5872l0 interfaceC5872l0, List barcodes) {
            Intrinsics.j(barcodes, "barcodes");
            if (!d(interfaceC5872l0)) {
                Vibrator vibrator = (Vibrator) Z1.b.j(receiptScanActivity, Vibrator.class);
                if (vibrator != null) {
                    Lk.c.b(vibrator, 0L, 0, 3, null);
                }
                Op.k kVarT1 = receiptScanActivity.t1();
                List list = barcodes;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Mp.e.a((C18179a) it.next()));
                }
                kVarT1.r(new k.a.ReceiptScanned(arrayList));
                e(interfaceC5872l0, true);
            }
            return Unit.f143329a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-140650843, i10, -1, "com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity.onCreate.<anonymous> (ReceiptScanActivity.kt:96)");
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
            composer.startReplaceGroup(1849434622);
            final ReceiptScanActivity receiptScanActivity = ReceiptScanActivity.this;
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Mp.d(receiptScanActivity.s1(), new Function1() { // from class: com.meijer.mobile.scanner.ux.activity.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReceiptScanActivity.b.g(receiptScanActivity, interfaceC5872l0, (List) obj);
                    }
                });
                composer.t(objB3);
            }
            composer.P();
            K.b(null, ComposableLambdaKt.c(1815765878, true, new a(ReceiptScanActivity.this, (Mp.d) objB3, interfaceC5868j0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
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
            return new FunctionReferenceImpl(1, ReceiptScanActivity.this, ReceiptScanActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            ReceiptScanActivity.this.u1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117529f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f117529f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117529f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117530f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f117530f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f117530f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117531f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117532g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117531f = function0;
            this.f117532g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117531f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117532g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17871a r1() {
        return C17873c.a(new C17872b.a().c(2, 16).b().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC17871a s1() {
        return (InterfaceC17871a) this.barcodeScanner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Op.k t1() {
        return (Op.k) this.viewModel.getValue();
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
    public final void u1(Map<String, Boolean> permissions) {
        t1().q(Intrinsics.e(permissions.get("android.permission.CAMERA"), Boolean.TRUE));
    }

    @Override // com.meijer.mobile.scanner.ux.activity.Hilt_ReceiptScanActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        z0();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-140650843, true, new b()), 1, null);
    }
}
