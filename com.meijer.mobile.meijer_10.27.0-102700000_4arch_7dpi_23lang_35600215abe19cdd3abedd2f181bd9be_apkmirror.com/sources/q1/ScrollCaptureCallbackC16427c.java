package q1;

import H1.p;
import V0.w1;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsProperties;
import j1.C14832a;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.N0;
import r1.C16706n;
import r1.ScrollAxisRange;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lq1/c;", "Landroid/view/ScrollCaptureCallback;", "Lr1/n;", "node", "LH1/p;", "viewportBoundsInWindow", "Lqv/O;", "coroutineScope", "Lq1/c$a;", "listener", "Landroid/view/View;", "composeView", "<init>", "(Lr1/n;LH1/p;Lqv/O;Lq1/c$a;Landroid/view/View;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;LH1/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "Lr1/n;", "b", "LH1/p;", "c", "Lq1/c$a;", "d", "Landroid/view/View;", "Lqv/O;", "Lq1/g;", "f", "Lq1/g;", "scrollTracker", "", "g", "I", "requestCount", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC16427c implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16706n node;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p viewportBoundsInWindow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C16431g scrollTracker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lq1/c$a;", "", "", "a", "()V", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: q1.c$a */
    public interface a {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    /* renamed from: q1.c$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156655a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f156657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f156657c = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScrollCaptureCallbackC16427c.this.new b(this.f156657c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156655a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C16431g c16431g = ScrollCaptureCallbackC16427c.this.scrollTracker;
                this.f156655a = 1;
                if (c16431g.g(0.0f, this) == objF) {
                    return objF;
                }
            }
            ScrollCaptureCallbackC16427c.this.listener.b();
            this.f156657c.run();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: q1.c$c, reason: collision with other inner class name */
    static final class C2430c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156658a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f156660c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f156661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f156662e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2430c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, Continuation<? super C2430c> continuation) {
            super(2, continuation);
            this.f156660c = scrollCaptureSession;
            this.f156661d = rect;
            this.f156662e = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScrollCaptureCallbackC16427c.this.new C2430c(this.f156660c, this.f156661d, this.f156662e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C2430c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156658a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ScrollCaptureCallbackC16427c scrollCaptureCallbackC16427c = ScrollCaptureCallbackC16427c.this;
                ScrollCaptureSession scrollCaptureSession = this.f156660c;
                p pVarD = w1.d(this.f156661d);
                this.f156658a = 1;
                obj = scrollCaptureCallbackC16427c.e(scrollCaptureSession, pVarD, this);
                if (obj == objF) {
                    return objF;
                }
            }
            this.f156662e.accept(w1.a((p) obj));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
    /* renamed from: q1.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f156663a;

        /* renamed from: b, reason: collision with root package name */
        Object f156664b;

        /* renamed from: c, reason: collision with root package name */
        Object f156665c;

        /* renamed from: d, reason: collision with root package name */
        int f156666d;

        /* renamed from: e, reason: collision with root package name */
        int f156667e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f156668f;

        /* renamed from: h, reason: collision with root package name */
        int f156670h;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f156668f = obj;
            this.f156670h |= Integer.MIN_VALUE;
            return ScrollCaptureCallbackC16427c.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: q1.c$e */
    static final class e extends Lambda implements Function1<Long, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f156671f = new e();

        e() {
            super(1);
        }

        public final void a(long j10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: q1.c$f */
    static final class f extends SuspendLambda implements Function2<Float, Continuation<? super Float>, Object> {

        /* renamed from: a, reason: collision with root package name */
        boolean f156672a;

        /* renamed from: b, reason: collision with root package name */
        int f156673b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f156674c;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = ScrollCaptureCallbackC16427c.this.new f(continuation);
            fVar.f156674c = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation<? super Float> continuation) {
            return d(f10.floatValue(), continuation);
        }

        public final Object d(float f10, Continuation<? super Float> continuation) {
            return ((f) create(Float.valueOf(f10), continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            float fIntBitsToFloat;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156673b;
            if (i10 != 0) {
                if (i10 == 1) {
                    z10 = this.f156672a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                float f10 = this.f156674c;
                Function2<U0.f, Continuation<? super U0.f>, Object> function2C = m.c(ScrollCaptureCallbackC16427c.this.node);
                if (function2C != null) {
                    boolean reverseScrolling = ((ScrollAxisRange) ScrollCaptureCallbackC16427c.this.node.getUnmergedConfig().n(SemanticsProperties.INSTANCE.E())).getReverseScrolling();
                    if (reverseScrolling) {
                        f10 = -f10;
                    }
                    U0.f fVarD = U0.f.d(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
                    this.f156672a = reverseScrolling;
                    this.f156673b = 1;
                    obj = function2C.invoke(fVarD, this);
                    if (obj == objF) {
                        return objF;
                    }
                    z10 = reverseScrolling;
                } else {
                    C14832a.c("Required value was null.");
                    throw new KotlinNothingValueException();
                }
            }
            long packedValue = ((U0.f) obj).getPackedValue();
            if (z10) {
                fIntBitsToFloat = -Float.intBitsToFloat((int) (packedValue & 4294967295L));
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue & 4294967295L));
            }
            return Boxing.c(fIntBitsToFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, H1.p r10, kotlin.coroutines.Continuation<? super H1.p> r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.ScrollCaptureCallbackC16427c.e(android.view.ScrollCaptureSession, H1.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        C16648k.d(this.coroutineScope, N0.f157609b, null, new b(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        C16429e.c(this.coroutineScope, signal, new C2430c(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(w1.a(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.d();
        this.requestCount = 0;
        this.listener.a();
        onReady.run();
    }

    public ScrollCaptureCallbackC16427c(C16706n c16706n, p pVar, InterfaceC16622O interfaceC16622O, a aVar, View view) {
        this.node = c16706n;
        this.viewportBoundsInWindow = pVar;
        this.listener = aVar;
        this.composeView = view;
        this.coroutineScope = C16623P.j(interfaceC16622O, C16430f.f156678a);
        this.scrollTracker = new C16431g(pVar.e(), new f(null));
    }
}
