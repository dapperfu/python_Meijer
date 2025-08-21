package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/y;", "T", "Landroidx/compose/runtime/E1;", "Lkotlin/Function1;", "Landroidx/compose/runtime/q;", "Lkotlin/ExtensionFunctionType;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/y0;", "map", "a", "(Landroidx/compose/runtime/y0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.y, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class ComputedValueHolder<T> implements E1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<InterfaceC5881q, T> compute;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComputedValueHolder) && Intrinsics.e(this.compute, ((ComputedValueHolder) other).compute);
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }

    @Override // androidx.compose.runtime.E1
    public T a(InterfaceC5897y0 map) {
        return this.compute.invoke(map);
    }

    public final Function1<InterfaceC5881q, T> b() {
        return this.compute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(Function1<? super InterfaceC5881q, ? extends T> function1) {
        this.compute = function1;
    }
}
