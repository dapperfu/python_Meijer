package q1;

import H1.p;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import r1.C16706n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lq1/l;", "", "Lr1/n;", "node", "", "depth", "LH1/p;", "viewportBoundsInWindow", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "<init>", "(Lr1/n;ILH1/p;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "toString", "()Ljava/lang/String;", "a", "Lr1/n;", "c", "()Lr1/n;", "b", "I", "()I", "LH1/p;", "d", "()LH1/p;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q1.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final class ScrollCaptureCandidate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C16706n node;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int depth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p viewportBoundsInWindow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LayoutCoordinates coordinates;

    /* renamed from: a, reason: from getter */
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: b, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: c, reason: from getter */
    public final C16706n getNode() {
        return this.node;
    }

    /* renamed from: d, reason: from getter */
    public final p getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }

    public ScrollCaptureCandidate(C16706n c16706n, int i10, p pVar, LayoutCoordinates layoutCoordinates) {
        this.node = c16706n;
        this.depth = i10;
        this.viewportBoundsInWindow = pVar;
        this.coordinates = layoutCoordinates;
    }
}
