package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\n\u0010\b\"\u001e\u0010\u0011\u001a\u00020\f*\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "frameTimeMillis", "b", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/b0;", "a", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/b0;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5854d0 {
    public static final InterfaceC5840b0 a(CoroutineContext coroutineContext) {
        InterfaceC5840b0 interfaceC5840b0 = (InterfaceC5840b0) coroutineContext.g(InterfaceC5840b0.INSTANCE);
        if (interfaceC5840b0 != null) {
            return interfaceC5840b0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return a(continuation.getF143551a()).O(new C5843c0(function1), continuation);
    }

    public static final <R> Object c(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return a(continuation.getF143551a()).O(function1, continuation);
    }
}
