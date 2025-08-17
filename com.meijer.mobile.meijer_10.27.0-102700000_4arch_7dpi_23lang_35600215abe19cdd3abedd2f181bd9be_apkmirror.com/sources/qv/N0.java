package qv;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b'\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0004\u001a\u0004\b*\u0010\u0007¨\u0006,"}, d2 = {"Lqv/N0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lqv/C0;", "<init>", "()V", "", "start", "()Z", "", "n0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "z", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lqv/h0;", "K", "(Lkotlin/jvm/functions/Function1;)Lqv/h0;", "onCancelling", "invokeImmediately", "u", "(ZZLkotlin/jvm/functions/Function1;)Lqv/h0;", "d", "(Ljava/util/concurrent/CancellationException;)V", "Lqv/w;", "child", "Lqv/u;", "q0", "(Lqv/w;)Lqv/u;", "", "toString", "()Ljava/lang/String;", "a", "isActive$annotations", "isActive", "isCancelled", "isCancelled$annotations", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class N0 extends AbstractCoroutineContextElement implements C0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N0 f157609b = new N0();

    @Override // qv.C0
    public boolean a() {
        return true;
    }

    @Override // qv.C0
    @Deprecated
    public void d(CancellationException cause) {
    }

    @Override // qv.C0
    public boolean isCancelled() {
        return false;
    }

    @Override // qv.C0
    @Deprecated
    public boolean start() {
        return false;
    }

    private N0() {
        super(C0.INSTANCE);
    }

    @Override // qv.C0
    @Deprecated
    public InterfaceC16643h0 K(Function1<? super Throwable, Unit> handler) {
        return O0.f157610a;
    }

    @Override // qv.C0
    @Deprecated
    public Object n0(Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // qv.C0
    @Deprecated
    public InterfaceC16668u q0(InterfaceC16672w child) {
        return O0.f157610a;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // qv.C0
    @Deprecated
    public InterfaceC16643h0 u(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler) {
        return O0.f157610a;
    }

    @Override // qv.C0
    @Deprecated
    public CancellationException z() {
        throw new IllegalStateException("This job is always active");
    }
}
