package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/m;", "LO0/a;", "", "Landroidx/compose/runtime/j;", "composition", "<init>", "(Landroidx/compose/runtime/j;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/j;", "getComposition", "()Landroidx/compose/runtime/j;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5873m implements O0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5867j composition;

    public boolean equals(Object other) {
        return (other instanceof C5873m) && Intrinsics.e(this.composition, ((C5873m) other).composition);
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    public C5873m(InterfaceC5867j interfaceC5867j) {
        this.composition = interfaceC5867j;
    }
}
