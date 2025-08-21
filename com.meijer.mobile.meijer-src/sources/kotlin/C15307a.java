package kotlin;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BJ\u00129\u0010\b\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014RM\u0010\u0018\u001a9\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0015¢\u0006\u0002\b\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlin/a;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "block", "value", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "Lkotlin/DeepRecursiveFunctionBlock;", "a", "Lkotlin/jvm/functions/Function3;", "function", "Ljava/lang/Object;", "c", "Lkotlin/coroutines/Continuation;", "cont", "d", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kotlin.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C15307a<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Continuation<Object> cont;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object result;

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        this.cont = null;
        this.result = result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15307a(Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t10) {
        super(null);
        Intrinsics.j(block, "block");
        this.function = block;
        this.value = t10;
        Intrinsics.h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        this.result = DeepRecursiveKt.f143269a;
    }

    @Override // kotlin.DeepRecursiveScope
    public Object b(T t10, Continuation<? super R> continuation) {
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = continuation;
        this.value = t10;
        Object objF = IntrinsicsKt.f();
        if (objF == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objF;
    }

    public final R f() {
        while (true) {
            R r10 = (R) this.result;
            Continuation<Object> continuation = this.cont;
            if (continuation == null) {
                ResultKt.b(r10);
                return r10;
            }
            if (Result.d(DeepRecursiveKt.f143269a, r10)) {
                try {
                    Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.function;
                    Object obj = this.value;
                    Object objE = !(function3 instanceof BaseContinuationImpl) ? IntrinsicsKt.e(function3, this, obj, continuation) : ((Function3) TypeIntrinsics.f(function3, 3)).invoke(this, obj, continuation);
                    if (objE != IntrinsicsKt.f()) {
                        continuation.resumeWith(Result.b(objE));
                    }
                } catch (Throwable th2) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.b(ResultKt.a(th2)));
                }
            } else {
                this.result = DeepRecursiveKt.f143269a;
                continuation.resumeWith(r10);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f143553a;
    }
}
