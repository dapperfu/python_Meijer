package mv;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lmv/s;", "Lmv/C;", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "e", "()Z", "", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15825s extends C15771C {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151768c = AtomicIntegerFieldUpdater.newUpdater(C15825s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C15825s(Continuation<?> continuation, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f151768c.compareAndSet(this, 0, 1);
    }
}
