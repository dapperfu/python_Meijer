package kotlin;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.E0;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lqv/t;", "T", "Lpv/g;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lpv/g;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/Continuation;", "", "uCont", "value", "", "l", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "g", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lqv/k;", "exception", "o", "(Lqv/k;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lpv/g;", "b", "Lkotlin/coroutines/CoroutineContext;", "", "c", "I", "collectContextSize", "d", "lastEmissionContext", "e", "Lkotlin/coroutines/Continuation;", "completion_", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16788t<T> extends ContinuationImpl implements InterfaceC16562g<T>, CoroutineStackFrame {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC16562g<T> collector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext collectContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int collectContextSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext lastEmissionContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Continuation<? super Unit> completion_;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16788t(InterfaceC16562g<? super T> interfaceC16562g, CoroutineContext coroutineContext) {
        super(C16784p.f159076a, EmptyCoroutineContext.f143553a);
        this.collector = interfaceC16562g;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.b(0, new Function2() { // from class: qv.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C16788t.k(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    private final void g(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof C16779k) {
            o((C16779k) previousContext, value);
        }
        C16790w.b(this, currentContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final void o(C16779k exception, Object value) {
        throw new IllegalStateException(StringsKt.n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.f143553a : coroutineContext;
    }

    private final Object l(Continuation<? super Unit> uCont, T value) {
        CoroutineContext f143551a = uCont.getContext();
        E0.i(f143551a);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != f143551a) {
            g(f143551a, coroutineContext, value);
            this.lastEmissionContext = f143551a;
        }
        this.completion_ = uCont;
        Function3 function3 = Function3.f159087a;
        InterfaceC16562g<T> interfaceC16562g = this.collector;
        Intrinsics.h(interfaceC16562g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(interfaceC16562g, value, this);
        if (!Intrinsics.e(objInvoke, IntrinsicsKt.f())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    @Override // pv.InterfaceC16562g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        try {
            Object objL = l(continuation, t10);
            if (objL == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objL == IntrinsicsKt.f()) {
                return objL;
            }
            return Unit.f143329a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new C16779k(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected Object invokeSuspend(Object result) {
        Throwable thE = Result.e(result);
        if (thE != null) {
            this.lastEmissionContext = new C16779k(thE, getContext());
        }
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return IntrinsicsKt.f();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
