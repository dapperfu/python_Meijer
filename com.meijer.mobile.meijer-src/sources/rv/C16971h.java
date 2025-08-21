package rv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.AbstractC15794c0;
import mv.AbstractC15812l0;
import mv.C15772D;
import mv.C15787T;
import mv.C15819p;
import mv.InterfaceC15815n;
import mv.a1;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001a\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0014R\u001c\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b-\u0010:R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¨\u0006?"}, d2 = {"Lrv/h;", "T", "Lmv/c0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lmv/K;", "dispatcher", "continuation", "<init>", "(Lmv/K;Lkotlin/coroutines/Continuation;)V", "", "o", "()Z", "", "j", "()V", "q", "Lmv/p;", "k", "()Lmv/p;", "Lmv/n;", "", "r", "(Lmv/n;)Ljava/lang/Throwable;", "cause", "p", "(Ljava/lang/Throwable;)Z", "", "i", "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "l", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "Lmv/K;", "e", "Lkotlin/coroutines/Continuation;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "m", "reusableCancellableContinuation", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "()Lkotlin/coroutines/Continuation;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16971h<T> extends AbstractC15794c0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159643h = AtomicReferenceFieldUpdater.newUpdater(C16971h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final AbstractC15779K dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Continuation<T> continuation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Object _state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public C16971h(AbstractC15779K abstractC15779K, Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = abstractC15779K;
        this.continuation = continuation;
        this._state = C16972i.f159648a;
        this.countOrElement = C16957L.g(getContext());
    }

    @Override // mv.AbstractC15794c0
    public Continuation<T> e() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // mv.AbstractC15794c0
    public Object i() {
        Object obj = this._state;
        this._state = C16972i.f159648a;
        return obj;
    }

    public final void l(CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.K0(context, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + C15787T.c(this.continuation) + ']';
    }

    private final C15819p<?> m() {
        Object obj = f159643h.get(this);
        if (obj instanceof C15819p) {
            return (C15819p) obj;
        }
        return null;
    }

    public final void j() {
        while (f159643h.get(this) == C16972i.f159649b) {
        }
    }

    public final C15819p<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159643h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f159643h.set(this, C16972i.f159649b);
                return null;
            }
            if (obj instanceof C15819p) {
                if (androidx.concurrent.futures.b.a(f159643h, this, obj, C16972i.f159649b)) {
                    return (C15819p) obj;
                }
            } else if (obj != C16972i.f159649b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean o() {
        if (f159643h.get(this) != null) {
            return true;
        }
        return false;
    }

    public final boolean p(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159643h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C16950E c16950e = C16972i.f159649b;
            if (Intrinsics.e(obj, c16950e)) {
                if (androidx.concurrent.futures.b.a(f159643h, this, c16950e, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f159643h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void q() {
        j();
        C15819p<?> c15819pM = m();
        if (c15819pM != null) {
            c15819pM.p();
        }
    }

    public final Throwable r(InterfaceC15815n<?> continuation) {
        C16950E c16950e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159643h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c16950e = C16972i.f159649b;
            if (obj != c16950e) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f159643h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f159643h, this, c16950e, continuation));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        Object objB = C15772D.b(result);
        if (C16972i.d(this.dispatcher, getContext())) {
            this._state = objB;
            this.resumeMode = 0;
            C16972i.c(this.dispatcher, getContext(), this);
            return;
        }
        AbstractC15812l0 abstractC15812l0B = a1.f151702a.b();
        if (abstractC15812l0B.d1()) {
            this._state = objB;
            this.resumeMode = 0;
            abstractC15812l0B.Y0(this);
            return;
        }
        abstractC15812l0B.a1(true);
        try {
            CoroutineContext context = getContext();
            Object objI = C16957L.i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f143329a;
                while (abstractC15812l0B.h1()) {
                }
            } finally {
                C16957L.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
