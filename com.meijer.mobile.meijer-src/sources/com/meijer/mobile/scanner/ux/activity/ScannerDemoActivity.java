package com.meijer.mobile.scanner.ux.activity;

import Ki.K;
import Ki.LocalThemeScope;
import Mp.d;
import Op.ScannedItem;
import Op.a;
import Op.b;
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
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
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
import com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity;
import e.C13737e;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import h.C14433g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C18033q;
import kotlin.C18036r;
import kotlin.EnumC18041t;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import r0.C16806i;
import xg.C18179a;
import yk.C18326b;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0003R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006H²\u0006\u000e\u0010G\u001a\u00020F8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/scanner/ux/activity/ScannerDemoActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "Lxg/a;", "barcodes", "", "u1", "(Ljava/util/List;)V", "", "", "", "permissions", "t1", "(Ljava/util/Map;)V", "z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "LMp/d$a;", "v", "LMp/d$a;", "r1", "()LMp/d$a;", "setBarcodeAnalysisFactory", "(LMp/d$a;)V", "barcodeAnalysisFactory", "LDl/e;", "w", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "LBl/g;", "x", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "LMp/d;", "y", "LMp/d;", "barcodeAnalyzer", "Ljava/util/concurrent/ExecutorService;", "z", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "LOp/b;", "A", "Lkotlin/Lazy;", "s1", "()LOp/b;", "viewModel", "Lg/c;", "", "B", "Lg/c;", "permissionsResultLauncher", "e1", "()Z", "isCameraPermissionGranted", "C", "a", "", "lensFacing", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ScannerDemoActivity extends Hilt_ScannerDemoActivity {

    /* renamed from: D, reason: collision with root package name */
    public static final int f117534D = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Op.b.class), new e(this), new d(this), new f(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new c());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public d.a barcodeAnalysisFactory;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Mp.d barcodeAnalyzer;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private ExecutorService cameraExecutor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$onCreate$2$1$1", f = "ScannerDemoActivity.kt", l = {119, 121}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117543a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<b.ViewState> f117544b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18036r f117545c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f117544b, this.f117545c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<b.ViewState> z1Var, C18036r c18036r, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117544b = z1Var;
                this.f117545c = c18036r;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            
                if (r5.a(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
            
                if (r5.b(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f117543a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.b(r5)
                    goto L4e
                L1b:
                    kotlin.ResultKt.b(r5)
                    androidx.compose.runtime.z1<Op.b$a> r5 = r4.f117544b
                    java.lang.Object r5 = r5.getValue()
                    Op.b$a r5 = (Op.b.ViewState) r5
                    java.util.List r5 = r5.c()
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L3f
                    x0.r r5 = r4.f117545c
                    x0.s r5 = r5.getBottomSheetState()
                    r4.f117543a = r3
                    java.lang.Object r5 = r5.a(r4)
                    if (r5 != r0) goto L4e
                    goto L4d
                L3f:
                    x0.r r5 = r4.f117545c
                    x0.s r5 = r5.getBottomSheetState()
                    r4.f117543a = r2
                    java.lang.Object r5 = r5.b(r4)
                    if (r5 != r0) goto L4e
                L4d:
                    return r0
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b, reason: collision with other inner class name */
        static final class C1887b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C18036r f117546a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<b.ViewState> f117547b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ScannerDemoActivity f117548c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f117549d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b$a */
            static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117550a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<b.ViewState> f117551b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ScannerDemoActivity f117552c;

                a(LocalThemeScope localThemeScope, z1<b.ViewState> z1Var, ScannerDemoActivity scannerDemoActivity) {
                    this.f117550a = localThemeScope;
                    this.f117551b = z1Var;
                    this.f117552c = scannerDemoActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ScannerDemoActivity scannerDemoActivity, ScannedItem it) {
                    Intrinsics.j(it, "it");
                    scannerDemoActivity.startActivity(Bl.g.t(scannerDemoActivity.getFeatureEntryPoint(), Co.l.g(it.getBarcode().getNormalizedValue()), false, false, null, 12, null));
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-300691001, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:132)");
                    }
                    LocalThemeScope localThemeScope = this.f117550a;
                    z1<b.ViewState> z1Var = this.f117551b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f117552c);
                    final ScannerDemoActivity scannerDemoActivity = this.f117552c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.scanner.ux.activity.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScannerDemoActivity.b.C1887b.a.c(scannerDemoActivity, (ScannedItem) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    z.c(localThemeScope, z1Var, null, (Function1) objB, composer, LocalThemeScope.f17314g, 2);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    b(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b$b, reason: collision with other inner class name */
            static final class C1888b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117553a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ScannerDemoActivity f117554b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f117555c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b$b$a */
                static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117556a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5868j0 f117557b;

                    a(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                        this.f117556a = localThemeScope;
                        this.f117557b = interfaceC5868j0;
                    }

                    public final void b(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1970946924, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:149)");
                        }
                        LocalThemeScope localThemeScope = this.f117556a;
                        composer.startReplaceGroup(5004770);
                        final InterfaceC5868j0 interfaceC5868j0 = this.f117557b;
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ScannerDemoActivity.b.C1887b.C1888b.a.c(interfaceC5868j0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.i(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g | 384, 1);
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
                    public static final Unit c(InterfaceC5868j0 interfaceC5868j0) {
                        int i10 = 1;
                        if (b.d(interfaceC5868j0) == 1) {
                            i10 = 0;
                        }
                        b.e(interfaceC5868j0, i10);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b$b$b, reason: collision with other inner class name */
                static final class C1889b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f117558a;

                    C1889b(LocalThemeScope localThemeScope) {
                        this.f117558a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(774932986, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:146)");
                        }
                        Dr.g.g(this.f117558a, "Scanning Demo", null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g | 48, 126);
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
                        ComposerKt.U(437269818, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:142)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Aj.e.f1348a, new Object[0]);
                    LocalThemeScope localThemeScope = this.f117553a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1970946924, true, new a(localThemeScope, this.f117555c), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(774932986, true, new C1889b(this.f117553a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f117554b);
                    final ScannerDemoActivity scannerDemoActivity = this.f117554b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.scanner.ux.activity.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ScannerDemoActivity.b.C1887b.C1888b.c(scannerDemoActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, null, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24960 | (AbstractC6392a.f60445b << 27), 229);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1888b(LocalThemeScope localThemeScope, ScannerDemoActivity scannerDemoActivity, InterfaceC5868j0 interfaceC5868j0) {
                    this.f117553a = localThemeScope;
                    this.f117554b = scannerDemoActivity;
                    this.f117555c = interfaceC5868j0;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ScannerDemoActivity scannerDemoActivity) {
                    if (!scannerDemoActivity.onNavigateUp()) {
                        scannerDemoActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity$b$b$c */
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117559a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ScannerDemoActivity f117560b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f117561c;

                c(LocalThemeScope localThemeScope, ScannerDemoActivity scannerDemoActivity, InterfaceC5868j0 interfaceC5868j0) {
                    this.f117559a = localThemeScope;
                    this.f117560b = scannerDemoActivity;
                    this.f117561c = interfaceC5868j0;
                }

                public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    ExecutorService executorService;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1641930544, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:161)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(companion, paddingValues);
                    LocalThemeScope localThemeScope = this.f117559a;
                    ScannerDemoActivity scannerDemoActivity = this.f117560b;
                    InterfaceC5868j0 interfaceC5868j0 = this.f117561c;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                    Mp.d dVar = scannerDemoActivity.barcodeAnalyzer;
                    if (dVar == null) {
                        Intrinsics.x("barcodeAnalyzer");
                        dVar = null;
                    }
                    int iD = b.d(interfaceC5868j0);
                    ExecutorService executorService2 = scannerDemoActivity.cameraExecutor;
                    if (executorService2 == null) {
                        Intrinsics.x("cameraExecutor");
                        executorService = null;
                    } else {
                        executorService = executorService2;
                    }
                    Modifier modifierFsExclude = FullStoryAnnotationsKt.fsExclude(J.f(companion, 0.0f, 1, null));
                    int i11 = LocalThemeScope.f17314g;
                    Np.j.c(localThemeScope, dVar, iD, executorService, modifierFsExclude, composer, i11, 0);
                    Np.d.d(localThemeScope, null, composer, i11, 1);
                    composer.v();
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

            C1887b(C18036r c18036r, z1<b.ViewState> z1Var, ScannerDemoActivity scannerDemoActivity, InterfaceC5868j0 interfaceC5868j0) {
                this.f117546a = c18036r;
                this.f117547b = z1Var;
                this.f117548c = scannerDemoActivity;
                this.f117549d = interfaceC5868j0;
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
                    ComposerKt.U(-182275338, i11, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous>.<anonymous> (ScannerDemoActivity.kt:125)");
                }
                float f10 = 12;
                C18033q.b(ComposableLambdaKt.c(-300691001, true, new a(AdsTheme, this.f117547b, this.f117548c), composer, 54), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f117546a, ComposableLambdaKt.c(437269818, true, new C1888b(AdsTheme, this.f117548c, this.f117549d), composer, 54), null, null, 0, true, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, H1.h.p(0), 0L, 0L, ComposableLambdaKt.c(1641930544, true, new c(AdsTheme, this.f117548c, this.f117549d), composer, 54), composer, 12585990, 196992, 28272);
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

        b() {
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2138692059, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity.onCreate.<anonymous> (ScannerDemoActivity.kt:110)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5844c1.a(1);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            z1 z1VarB = o1.b(ScannerDemoActivity.this.s1().n(), null, composer, 0, 1);
            C18036r c18036rK = C18033q.k(C18033q.l(EnumC18041t.f169752a, null, null, composer, 6, 6), null, composer, 0, 2);
            List<ScannedItem> listC = ((b.ViewState) z1VarB.getValue()).c();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(z1VarB) | composer.V(c18036rK);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new a(z1VarB, c18036rK, null);
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.J.g(listC, (Function2) objB2, composer, 0);
            K.b(null, ComposableLambdaKt.c(-182275338, true, new C1887b(c18036rK, z1VarB, ScannerDemoActivity.this, interfaceC5868j0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
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
            return new FunctionReferenceImpl(1, ScannerDemoActivity.this, ScannerDemoActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            ScannerDemoActivity.this.t1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117563f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f117563f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117563f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117564f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f117564f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f117564f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117565f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117565f = function0;
            this.f117566g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117565f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117566g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final boolean e1() {
        return C18326b.a(this, "android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Op.b s1() {
        return (Op.b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(Map<String, Boolean> permissions) {
        if (Intrinsics.e(permissions.get("android.permission.CAMERA"), Boolean.TRUE)) {
            s1().p(true);
        } else {
            s1().p(false);
        }
    }

    private final void u1(List<? extends C18179a> barcodes) {
        Vibrator vibrator = (Vibrator) Z1.b.j(this, Vibrator.class);
        if (vibrator != null) {
            Lk.c.b(vibrator, 0L, 0, 3, null);
        }
        s1().o(new a.Scanned(barcodes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(ScannerDemoActivity scannerDemoActivity, List barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        scannerDemoActivity.u1(barcodes);
        return Unit.f143329a;
    }

    private final void z0() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.CAMERA"});
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final d.a r1() {
        d.a aVar = this.barcodeAnalysisFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("barcodeAnalysisFactory");
        return null;
    }

    @Override // com.meijer.mobile.scanner.ux.activity.Hilt_ScannerDemoActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        s1().p(e1());
        z0();
        this.barcodeAnalyzer = r1().a(new Function1() { // from class: com.meijer.mobile.scanner.ux.activity.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScannerDemoActivity.v1(this.f117582a, (List) obj);
            }
        });
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-2138692059, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.scanner.ux.activity.Hilt_ScannerDemoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.cameraExecutor;
        if (executorService == null) {
            Intrinsics.x("cameraExecutor");
            executorService = null;
        }
        executorService.shutdown();
    }
}
