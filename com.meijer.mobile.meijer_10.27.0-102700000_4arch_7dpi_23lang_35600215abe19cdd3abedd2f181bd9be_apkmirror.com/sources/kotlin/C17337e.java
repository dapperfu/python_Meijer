package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import tv.InterfaceC17153g;
import vv.C17638L;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aZ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Ltv/g;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "d", "(Ltv/g;Lkotlin/coroutines/CoroutineContext;)Ltv/g;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17337e {
    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = C17638L.g(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC17153g<T> d(InterfaceC17153g<? super T> interfaceC17153g, CoroutineContext coroutineContext) {
        return ((interfaceC17153g instanceof C17355x) || (interfaceC17153g instanceof C17349q)) ? interfaceC17153g : new C17332A(interfaceC17153g, coroutineContext);
    }

    public static final <T, V> Object b(CoroutineContext coroutineContext, V v10, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object objInvoke;
        Object objI = C17638L.i(coroutineContext, obj);
        try {
            C17356y c17356y = new C17356y(continuation, coroutineContext);
            if (!(function2 instanceof BaseContinuationImpl)) {
                objInvoke = IntrinsicsKt.d(function2, v10, c17356y);
            } else {
                objInvoke = ((Function2) TypeIntrinsics.f(function2, 2)).invoke(v10, c17356y);
            }
            C17638L.f(coroutineContext, objI);
            if (objInvoke == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objInvoke;
        } catch (Throwable th2) {
            C17638L.f(coroutineContext, objI);
            throw th2;
        }
    }
}
