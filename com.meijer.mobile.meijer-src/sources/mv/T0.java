package mv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmv/T0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lmv/K;", "dispatcher", "Lmv/n;", "", "continuation", "<init>", "(Lmv/K;Lmv/n;)V", "run", "()V", "a", "Lmv/K;", "b", "Lmv/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K dispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15815n<Unit> continuation;

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.B(this.dispatcher, Unit.f143329a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T0(AbstractC15779K abstractC15779K, InterfaceC15815n<? super Unit> interfaceC15815n) {
        this.dispatcher = abstractC15779K;
        this.continuation = interfaceC15815n;
    }
}
