package mv;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;
import rv.C16970g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.M, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15781M {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            InterfaceC15780L interfaceC15780L = (InterfaceC15780L) coroutineContext.g(InterfaceC15780L.INSTANCE);
            if (interfaceC15780L != null) {
                interfaceC15780L.m0(coroutineContext, th2);
            } else {
                C16970g.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C16970g.a(coroutineContext, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        ExceptionsKt.a(runtimeException, th2);
        return runtimeException;
    }
}
