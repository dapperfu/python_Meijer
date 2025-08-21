package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/M;", "", "", "slotIndex", "nodeIndex", "nodeCount", "<init>", "(III)V", "a", "I", "c", "()I", "f", "(I)V", "b", "e", "d", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int slotIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* renamed from: a, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    /* renamed from: b, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    /* renamed from: c, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void d(int i10) {
        this.nodeCount = i10;
    }

    public final void e(int i10) {
        this.nodeIndex = i10;
    }

    public final void f(int i10) {
        this.slotIndex = i10;
    }

    public M(int i10, int i11, int i12) {
        this.slotIndex = i10;
        this.nodeIndex = i11;
        this.nodeCount = i12;
    }
}
