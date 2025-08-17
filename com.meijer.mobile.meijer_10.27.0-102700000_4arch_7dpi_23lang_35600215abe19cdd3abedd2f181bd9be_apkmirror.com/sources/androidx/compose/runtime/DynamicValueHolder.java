package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/I;", "T", "Landroidx/compose/runtime/E1;", "Landroidx/compose/runtime/l0;", "state", "<init>", "(Landroidx/compose/runtime/l0;)V", "Landroidx/compose/runtime/y0;", "map", "a", "(Landroidx/compose/runtime/y0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/l0;", "b", "()Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.I, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DynamicValueHolder<T> implements E1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5730l0<T> state;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DynamicValueHolder) && Intrinsics.e(this.state, ((DynamicValueHolder) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.state + ')';
    }

    @Override // androidx.compose.runtime.E1
    public T a(InterfaceC5755y0 map) {
        return this.state.getValue();
    }

    public final InterfaceC5730l0<T> b() {
        return this.state;
    }

    public DynamicValueHolder(InterfaceC5730l0<T> interfaceC5730l0) {
        this.state = interfaceC5730l0;
    }
}
