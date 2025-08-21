package m5;

import android.view.View;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15800f0;
import mv.C15809k;
import mv.C15832v0;
import mv.InterfaceC15783O;
import mv.W;
import r5.C16846j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lm5/t;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lm5/r;", "disposable", "", "c", "(Lm5/r;)Z", "Lmv/W;", "Lm5/i;", "job", "b", "(Lmv/W;)Lm5/r;", "", "a", "()V", "Lm5/s;", "request", "d", "(Lm5/s;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Lm5/r;", "currentDisposable", "Lmv/C0;", "Lmv/C0;", "pendingClear", "Lm5/s;", "currentRequest", "e", "Z", "isRestart", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class t implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C15679r currentDisposable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C0 pendingClear;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private s currentRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isRestart;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f150751a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return t.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f150751a == 0) {
                ResultKt.b(obj);
                t.this.d(null);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final synchronized void a() {
        try {
            C0 c02 = this.pendingClear;
            if (c02 != null) {
                C0.a.a(c02, null, 1, null);
            }
            this.pendingClear = C15809k.d(C15832v0.f151773a, C15800f0.c().X0(), null, new a(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized C15679r b(W<? extends AbstractC15670i> job) {
        C15679r c15679r = this.currentDisposable;
        if (c15679r != null && C16846j.s() && this.isRestart) {
            this.isRestart = false;
            c15679r.a(job);
            return c15679r;
        }
        C0 c02 = this.pendingClear;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.pendingClear = null;
        C15679r c15679r2 = new C15679r(this.view, job);
        this.currentDisposable = c15679r2;
        return c15679r2;
    }

    public final synchronized boolean c(C15679r disposable) {
        return disposable != this.currentDisposable;
    }

    public final void d(s request) {
        s sVar = this.currentRequest;
        if (sVar != null) {
            sVar.a();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        s sVar = this.currentRequest;
        if (sVar == null) {
            return;
        }
        this.isRestart = true;
        sVar.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        s sVar = this.currentRequest;
        if (sVar != null) {
            sVar.a();
        }
    }

    public t(View view) {
        this.view = view;
    }
}
