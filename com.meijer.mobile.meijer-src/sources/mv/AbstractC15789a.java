package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JL\u0010+\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0002\b)¢\u0006\u0004\b+\u0010,R\u001d\u00103\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00108\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lmv/a;", "T", "Lmv/H0;", "Lmv/C0;", "Lkotlin/coroutines/Continuation;", "Lmv/O;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "h1", "(Ljava/lang/Object;)V", "", "cause", "handled", "g1", "(Ljava/lang/Throwable;Z)V", "", "V", "()Ljava/lang/String;", "", "state", "P0", "Lkotlin/Result;", "result", "resumeWith", "f1", "exception", "A0", "(Ljava/lang/Throwable;)V", "K0", "R", "Lmv/Q;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "i1", "(Lmv/Q;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "a", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC15789a<T> extends H0 implements C0, Continuation<T>, InterfaceC15783O {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    protected void g1(Throwable cause, boolean handled) {
    }

    protected void h1(T value) {
    }

    @Override // mv.H0
    public final void A0(Throwable exception) {
        C15781M.a(this.context, exception);
    }

    @Override // mv.H0
    public String K0() {
        String strG = C15777I.g(this.context);
        if (strG == null) {
            return super.K0();
        }
        return '\"' + strG + "\":" + super.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mv.H0
    protected final void P0(Object state) {
        if (!(state instanceof C15771C)) {
            h1(state);
        } else {
            C15771C c15771c = (C15771C) state;
            g1(c15771c.cause, c15771c.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mv.H0
    public String V() {
        return C15787T.a(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getF143551a() {
        return this.context;
    }

    @Override // mv.InterfaceC15783O
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    public AbstractC15789a(CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            B0((C0) coroutineContext.g(C0.INSTANCE));
        }
        this.context = coroutineContext.n0(this);
    }

    @Override // mv.H0, mv.C0
    public boolean a() {
        return super.a();
    }

    protected void f1(Object state) {
        y(state);
    }

    public final <R> void i1(EnumC15785Q start, R receiver, Function2<? super R, ? super Continuation<? super T>, ? extends Object> block) {
        start.b(block, receiver, this);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object result) {
        Object objJ0 = J0(C15772D.b(result));
        if (objJ0 == I0.f151670b) {
            return;
        }
        f1(objJ0);
    }
}
