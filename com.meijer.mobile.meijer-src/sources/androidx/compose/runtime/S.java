package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/S;", "", "Landroidx/compose/runtime/I0;", "scope", "", "location", "instances", "<init>", "(Landroidx/compose/runtime/I0;ILjava/lang/Object;)V", "", "d", "()Z", "a", "Landroidx/compose/runtime/I0;", "c", "()Landroidx/compose/runtime/I0;", "b", "I", "()I", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object instances;

    /* renamed from: a, reason: from getter */
    public final Object getInstances() {
        return this.instances;
    }

    /* renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* renamed from: c, reason: from getter */
    public final I0 getScope() {
        return this.scope;
    }

    public final boolean d() {
        return this.scope.x(this.instances);
    }

    public final void e(Object obj) {
        this.instances = obj;
    }

    public S(I0 i02, int i10, Object obj) {
        this.scope = i02;
        this.location = i10;
        this.instances = obj;
    }
}
