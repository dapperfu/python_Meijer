package tv;

import cv.C13558a;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mv.C15781M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "a", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    public static final void a(Throwable th2, CoroutineContext coroutineContext) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            C13558a.s(th2);
        } catch (Throwable th3) {
            ExceptionsKt.a(th2, th3);
            C15781M.a(coroutineContext, th2);
        }
    }
}
