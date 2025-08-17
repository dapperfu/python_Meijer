package androidx.compose.runtime;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Y;", "T", "Landroidx/compose/runtime/E1;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/y0;", "map", "a", "(Landroidx/compose/runtime/y0;)Ljava/lang/Object;", "Lkotlin/Lazy;", "b", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y<T> implements E1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy current;

    private final T b() {
        return (T) this.current.getValue();
    }

    public Y(Function0<? extends T> function0) {
        this.current = LazyKt.b(function0);
    }

    @Override // androidx.compose.runtime.E1
    public T a(InterfaceC5755y0 map) {
        return b();
    }
}
