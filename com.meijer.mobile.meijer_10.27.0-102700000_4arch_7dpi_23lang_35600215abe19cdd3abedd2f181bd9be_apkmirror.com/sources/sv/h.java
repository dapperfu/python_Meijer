package sv;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobCancellationException;
import qv.AbstractC16628a;
import qv.H0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010!\u001a\u00020\u00032#\u0010 \u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00102\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lsv/h;", "E", "Lqv/a;", "", "Lsv/g;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lsv/g;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "(Ljava/util/concurrent/CancellationException;)V", "", "P", "(Ljava/lang/Throwable;)V", "element", "r", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsv/k;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "f", "(Lkotlin/jvm/functions/Function1;)V", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "n", "()Ljava/lang/Object;", "Lsv/i;", "iterator", "()Lsv/i;", "Lsv/g;", "k1", "()Lsv/g;", "j1", "channel", "s", "()Z", "isClosedForSend", "Lzv/g;", "l", "()Lzv/g;", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class h<E> extends AbstractC16628a<Unit> implements g<E> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g<E> _channel;

    @Override // qv.H0
    public void P(Throwable cause) {
        CancellationException cancellationExceptionY0 = H0.Y0(this, cause, null, 1, null);
        this._channel.d(cancellationExceptionY0);
        G(cancellationExceptionY0);
    }

    public final g<E> j1() {
        return this;
    }

    @Override // sv.v
    public Object e(Continuation<? super E> continuation) {
        return this._channel.e(continuation);
    }

    @Override // sv.w
    public void f(Function1<? super Throwable, Unit> handler) {
        this._channel.f(handler);
    }

    @Override // sv.v
    public i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // sv.w
    public Object k(E element) {
        return this._channel.k(element);
    }

    protected final g<E> k1() {
        return this._channel;
    }

    @Override // sv.v
    public zv.g<k<E>> l() {
        return this._channel.l();
    }

    @Override // sv.v
    public Object n() {
        return this._channel.n();
    }

    @Override // sv.v
    public Object o(Continuation<? super k<? extends E>> continuation) {
        Object objO = this._channel.o(continuation);
        IntrinsicsKt.f();
        return objO;
    }

    @Override // sv.w
    public boolean q(Throwable cause) {
        return this._channel.q(cause);
    }

    @Override // sv.w
    public Object r(E e10, Continuation<? super Unit> continuation) {
        return this._channel.r(e10, continuation);
    }

    @Override // sv.w
    public boolean s() {
        return this._channel.s();
    }

    public h(CoroutineContext coroutineContext, g<E> gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = gVar;
    }

    @Override // qv.H0, qv.C0
    public final void d(CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new JobCancellationException(V(), null, this);
        }
        P(cause);
    }
}
