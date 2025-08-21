package Np;

import C.C3030o;
import C.H;
import C.Y;
import C.q0;
import C.r0;
import Ki.LocalThemeScope;
import android.content.Context;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6172s;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LKi/M;", "Landroidx/camera/core/f$a;", "barcodeAnalyzer", "", "lensFacing", "Ljava/util/concurrent/Executor;", "cameraExecutor", "Landroidx/compose/ui/Modifier;", "modifier", "", "c", "(LKi/M;Landroidx/camera/core/f$a;ILjava/util/concurrent/Executor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "LT/g;", "g", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/util/Size;", "a", "Landroid/util/Size;", "IMAGE_SIZE", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Size f22541a = new Size(960, 720);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.compose.CameraPreviewKt$CameraPreview$1$1", f = "CameraPreview.kt", l = {90}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f22542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f22543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f22544c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3030o f22545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y f22546e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H f22547f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.f f22548g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PreviewView f22549h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InterfaceC6172s interfaceC6172s, C3030o c3030o, Y y10, H h10, androidx.camera.core.f fVar, PreviewView previewView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f22543b = context;
            this.f22544c = interfaceC6172s;
            this.f22545d = c3030o;
            this.f22546e = y10;
            this.f22547f = h10;
            this.f22548g = fVar;
            this.f22549h = previewView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f22543b, this.f22544c, this.f22545d, this.f22546e, this.f22547f, this.f22548g, this.f22549h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f22542a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Context context = this.f22543b;
                this.f22542a = 1;
                obj = j.g(context, this);
                if (obj == objF) {
                    return objF;
                }
            }
            T.g gVar = (T.g) obj;
            q0.a aVar = new q0.a();
            Y y10 = this.f22546e;
            H h10 = this.f22547f;
            androidx.camera.core.f fVar = this.f22548g;
            PreviewView previewView = this.f22549h;
            aVar.a(y10);
            aVar.a(h10);
            aVar.a(fVar);
            r0 viewPort = previewView.getViewPort();
            Intrinsics.g(viewPort);
            aVar.d(viewPort);
            q0 q0VarB = aVar.b();
            Intrinsics.i(q0VarB, "build(...)");
            gVar.y();
            gVar.n(this.f22544c, this.f22545d, q0VarB);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<T.g> f22550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q<T.g> f22551b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Continuation<? super T.g> continuation, com.google.common.util.concurrent.q<T.g> qVar) {
            this.f22550a = continuation;
            this.f22551b = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation<T.g> continuation = this.f22550a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.b(this.f22551b.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewView e(PreviewView previewView, Context it) {
        Intrinsics.j(it, "it");
        return previewView;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r24, final androidx.camera.core.f.a r25, final int r26, final java.util.concurrent.Executor r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Np.j.c(Ki.M, androidx.camera.core.f$a, int, java.util.concurrent.Executor, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, f.a aVar, int i10, Executor executor, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, aVar, i10, executor, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Context context, Continuation<? super T.g> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        com.google.common.util.concurrent.q<T.g> qVarB = T.g.INSTANCE.b(context);
        qVarB.addListener(new b(safeContinuation, qVarB), Z1.b.h(context));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }
}
