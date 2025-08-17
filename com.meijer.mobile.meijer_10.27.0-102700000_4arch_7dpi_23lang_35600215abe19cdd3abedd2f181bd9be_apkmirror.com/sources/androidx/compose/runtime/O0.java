package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/O0;", "", "Landroidx/compose/runtime/N0;", "wrapped", "Landroidx/compose/runtime/Anchor;", "after", "<init>", "(Landroidx/compose/runtime/N0;Landroidx/compose/runtime/Anchor;)V", "a", "Landroidx/compose/runtime/N0;", "b", "()Landroidx/compose/runtime/N0;", "setWrapped", "(Landroidx/compose/runtime/N0;)V", "Landroidx/compose/runtime/Anchor;", "()Landroidx/compose/runtime/Anchor;", "setAfter", "(Landroidx/compose/runtime/Anchor;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private N0 wrapped;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Anchor after;

    /* renamed from: a, reason: from getter */
    public final Anchor getAfter() {
        return this.after;
    }

    /* renamed from: b, reason: from getter */
    public final N0 getWrapped() {
        return this.wrapped;
    }

    public O0(N0 n02, Anchor anchor) {
        this.wrapped = n02;
        this.after = anchor;
    }
}
