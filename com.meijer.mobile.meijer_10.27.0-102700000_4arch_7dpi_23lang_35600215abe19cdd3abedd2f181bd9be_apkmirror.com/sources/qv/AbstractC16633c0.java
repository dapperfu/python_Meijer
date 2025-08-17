package qv;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DispatchException;
import vv.C17638L;
import vv.C17652h;
import yv.AbstractRunnableC18313h;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lqv/c0;", "T", "Lyv/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "i", "(Ljava/lang/Throwable;)V", "c", "I", "Lkotlin/coroutines/Continuation;", "e", "()Lkotlin/coroutines/Continuation;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.c0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC16633c0<T> extends AbstractRunnableC18313h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int resumeMode;

    public void b(Object takenState, Throwable cause) {
    }

    public abstract Continuation<T> e();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object state) {
        return state;
    }

    public abstract Object j();

    public Throwable g(Object state) {
        C16610C c16610c = state instanceof C16610C ? (C16610C) state : null;
        if (c16610c != null) {
            return c16610c.cause;
        }
        return null;
    }

    public final void i(Throwable exception) {
        C16620M.a(e().getContext(), new C16625S("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    public AbstractC16633c0(int i10) {
        this.resumeMode = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1<?> f1VarM;
        try {
            Continuation<T> continuationE = e();
            Intrinsics.h(continuationE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C17652h c17652h = (C17652h) continuationE;
            Continuation<T> continuation = c17652h.continuation;
            Object obj = c17652h.countOrElement;
            CoroutineContext context = continuation.getContext();
            Object objI = C17638L.i(context, obj);
            C0 c02 = null;
            if (objI != C17638L.f165089a) {
                f1VarM = C16616I.m(continuation, context, objI);
            } else {
                f1VarM = null;
            }
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null && C16635d0.b(this.resumeMode)) {
                    c02 = (C0) context2.g(C0.INSTANCE);
                }
                if (c02 != null && !c02.a()) {
                    CancellationException cancellationExceptionZ = c02.z();
                    b(objJ, cancellationExceptionZ);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.b(ResultKt.a(cancellationExceptionZ)));
                } else if (thG != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.b(ResultKt.a(thG)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.b(h(objJ)));
                }
                Unit unit = Unit.f142422a;
                if (f1VarM == null || f1VarM.k1()) {
                    C17638L.f(context, objI);
                }
            } catch (Throwable th2) {
                if (f1VarM == null || f1VarM.k1()) {
                    C17638L.f(context, objI);
                }
                throw th2;
            }
        } catch (DispatchException e10) {
            C16620M.a(e().getContext(), e10.getCause());
        } catch (Throwable th3) {
            i(th3);
        }
    }
}
