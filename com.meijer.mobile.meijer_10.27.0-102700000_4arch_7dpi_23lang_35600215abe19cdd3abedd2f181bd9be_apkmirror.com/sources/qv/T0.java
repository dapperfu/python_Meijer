package qv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqv/T0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lqv/K;", "dispatcher", "Lqv/n;", "", "continuation", "<init>", "(Lqv/K;Lqv/n;)V", "run", "()V", "a", "Lqv/K;", "b", "Lqv/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K dispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16654n<Unit> continuation;

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.R(this.dispatcher, Unit.f142422a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T0(AbstractC16618K abstractC16618K, InterfaceC16654n<? super Unit> interfaceC16654n) {
        this.dispatcher = abstractC16618K;
        this.continuation = interfaceC16654n;
    }
}
