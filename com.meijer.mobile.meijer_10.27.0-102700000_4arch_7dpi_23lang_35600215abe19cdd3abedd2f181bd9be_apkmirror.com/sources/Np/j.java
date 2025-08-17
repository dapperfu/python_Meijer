package Np;

import C.C2972o;
import C.H;
import C.Y;
import C.q0;
import C.r0;
import Ji.LocalThemeScope;
import android.content.Context;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6030s;
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
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJi/M;", "Landroidx/camera/core/f$a;", "barcodeAnalyzer", "", "lensFacing", "Ljava/util/concurrent/Executor;", "cameraExecutor", "Landroidx/compose/ui/Modifier;", "modifier", "", "c", "(LJi/M;Landroidx/camera/core/f$a;ILjava/util/concurrent/Executor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "LT/g;", "g", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/util/Size;", "a", "Landroid/util/Size;", "IMAGE_SIZE", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Size f22585a = new Size(960, 720);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.compose.CameraPreviewKt$CameraPreview$1$1", f = "CameraPreview.kt", l = {90}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f22586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f22587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6030s f22588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2972o f22589d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y f22590e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H f22591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.f f22592g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PreviewView f22593h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InterfaceC6030s interfaceC6030s, C2972o c2972o, Y y10, H h10, androidx.camera.core.f fVar, PreviewView previewView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f22587b = context;
            this.f22588c = interfaceC6030s;
            this.f22589d = c2972o;
            this.f22590e = y10;
            this.f22591f = h10;
            this.f22592g = fVar;
            this.f22593h = previewView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f22587b, this.f22588c, this.f22589d, this.f22590e, this.f22591f, this.f22592g, this.f22593h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f22586a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Context context = this.f22587b;
                this.f22586a = 1;
                obj = j.g(context, this);
                if (obj == objF) {
                    return objF;
                }
            }
            T.g gVar = (T.g) obj;
            q0.a aVar = new q0.a();
            Y y10 = this.f22590e;
            H h10 = this.f22591f;
            androidx.camera.core.f fVar = this.f22592g;
            PreviewView previewView = this.f22593h;
            aVar.a(y10);
            aVar.a(h10);
            aVar.a(fVar);
            r0 viewPort = previewView.getViewPort();
            Intrinsics.g(viewPort);
            aVar.d(viewPort);
            q0 q0VarB = aVar.b();
            Intrinsics.i(q0VarB, "build(...)");
            gVar.y();
            gVar.n(this.f22588c, this.f22589d, q0VarB);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<T.g> f22594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q<T.g> f22595b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Continuation<? super T.g> continuation, com.google.common.util.concurrent.q<T.g> qVar) {
            this.f22594a = continuation;
            this.f22595b = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation<T.g> continuation = this.f22594a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.b(this.f22595b.get()));
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
    public static final void c(final Ji.LocalThemeScope r24, final androidx.camera.core.f.a r25, final int r26, final java.util.concurrent.Executor r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Np.j.c(Ji.M, androidx.camera.core.f$a, int, java.util.concurrent.Executor, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, f.a aVar, int i10, Executor executor, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, aVar, i10, executor, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
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
