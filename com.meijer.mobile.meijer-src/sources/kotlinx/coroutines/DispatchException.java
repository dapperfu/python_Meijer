package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mv.AbstractC15779K;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lmv/K;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ljava/lang/Throwable;Lmv/K;Lkotlin/coroutines/CoroutineContext;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DispatchException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    public DispatchException(Throwable th2, AbstractC15779K abstractC15779K, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + abstractC15779K + " threw an exception, context = " + coroutineContext, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
