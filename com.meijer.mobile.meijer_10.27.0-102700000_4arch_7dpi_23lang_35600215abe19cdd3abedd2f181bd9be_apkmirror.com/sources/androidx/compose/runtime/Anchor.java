package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "slots", "d", "(Landroidx/compose/runtime/SlotTable;)I", "Landroidx/compose/runtime/SlotWriter;", "writer", "e", "(Landroidx/compose/runtime/SlotWriter;)I", "", "toString", "()Ljava/lang/String;", "location", "I", "a", "()I", "c", "", "b", "()Z", "valid", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Anchor {
    private int location;

    /* renamed from: a, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean b() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.location = i10;
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }

    public Anchor(int i10) {
        this.location = i10;
    }

    public final int d(SlotTable slots) {
        return slots.f(this);
    }

    public final int e(SlotWriter writer) {
        return writer.E(this);
    }
}
