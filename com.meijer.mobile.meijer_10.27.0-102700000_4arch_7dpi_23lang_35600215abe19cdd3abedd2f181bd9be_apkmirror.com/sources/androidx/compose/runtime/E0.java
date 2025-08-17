package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/E0;", "T", "Landroidx/compose/runtime/D0;", "Landroidx/compose/runtime/l0;", "state", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/compose/runtime/l0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class E0<T> implements D0<T>, InterfaceC5730l0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5730l0<T> f49975b;

    @Override // androidx.compose.runtime.InterfaceC5730l0, androidx.compose.runtime.z1
    public T getValue() {
        return this.f49975b.getValue();
    }

    @Override // androidx.compose.runtime.InterfaceC5730l0
    public void setValue(T t10) {
        this.f49975b.setValue(t10);
    }

    @Override // qv.InterfaceC16622O
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public E0(InterfaceC5730l0<T> interfaceC5730l0, CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        this.f49975b = interfaceC5730l0;
    }
}
