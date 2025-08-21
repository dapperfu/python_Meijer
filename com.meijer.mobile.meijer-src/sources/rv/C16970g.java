package rv;

import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import mv.C15781M;
import mv.InterfaceC15780L;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rv.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16970g {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        Iterator<InterfaceC15780L> it = C16969f.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().m0(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                C16969f.b(C15781M.b(th2, th3));
            }
        }
        try {
            ExceptionsKt.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        C16969f.b(th2);
    }
}
