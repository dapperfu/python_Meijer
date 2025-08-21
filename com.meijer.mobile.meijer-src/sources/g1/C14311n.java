package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'¨\u0006)"}, d2 = {"Lg1/n;", "", "<init>", "()V", "LZ/C;", "Lg1/B;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Lg1/g;", "internalPointerEvent", "", "isInBounds", "a", "(LZ/C;Landroidx/compose/ui/layout/LayoutCoordinates;Lg1/g;Z)Z", "f", "e", "(Lg1/g;)Z", "", "d", "Landroidx/compose/ui/Modifier$c;", "pointerInputModifierNode", "i", "(Landroidx/compose/ui/Modifier$c;)V", "c", "", "pointerIdValue", "LZ/T;", "Lg1/m;", "hitNodes", "h", "(JLZ/T;)V", "b", "(Lg1/g;)V", "LD0/c;", "LD0/c;", "g", "()LD0/c;", "children", "LZ/T;", "removeMatchingPointerInputModifierNodeList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C14311n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Node> children = new D0.c<>(new Node[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z.T<C14311n> removeMatchingPointerInputModifierNodeList = new Z.T<>(10);

    public boolean a(Z.C<PointerInputChange> changes, LayoutCoordinates parentCoordinates, C14304g internalPointerEvent, boolean isInBounds) {
        D0.c<Node> cVar = this.children;
        Node[] c14310mArr = cVar.content;
        int size = cVar.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 = c14310mArr[i10].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
        }
        return z10;
    }

    public void b(C14304g internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().f()) {
                this.children.u(size);
            }
        }
    }

    public final void c() {
        this.children.k();
    }

    public void d() {
        D0.c<Node> cVar = this.children;
        Node[] c14310mArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            c14310mArr[i10].d();
        }
    }

    public boolean e(C14304g internalPointerEvent) {
        D0.c<Node> cVar = this.children;
        Node[] c14310mArr = cVar.content;
        int size = cVar.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 = c14310mArr[i10].e(internalPointerEvent) || z10;
        }
        b(internalPointerEvent);
        return z10;
    }

    public boolean f(Z.C<PointerInputChange> changes, LayoutCoordinates parentCoordinates, C14304g internalPointerEvent, boolean isInBounds) {
        D0.c<Node> cVar = this.children;
        Node[] c14310mArr = cVar.content;
        int size = cVar.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 = c14310mArr[i10].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
        }
        return z10;
    }

    public final D0.c<Node> g() {
        return this.children;
    }

    public void h(long pointerIdValue, Z.T<Node> hitNodes) {
        D0.c<Node> cVar = this.children;
        Node[] c14310mArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            c14310mArr[i10].h(pointerIdValue, hitNodes);
        }
    }

    public void i(Modifier.c pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.t();
        this.removeMatchingPointerInputModifierNodeList.n(this);
        while (this.removeMatchingPointerInputModifierNodeList.h()) {
            C14311n c14311nA = this.removeMatchingPointerInputModifierNodeList.A(r0.get_size() - 1);
            int i10 = 0;
            while (i10 < c14311nA.children.getSize()) {
                Node c14310m = c14311nA.children.content[i10];
                if (Intrinsics.e(c14310m.getModifierNode(), pointerInputModifierNode)) {
                    c14311nA.children.s(c14310m);
                    c14310m.d();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.n(c14310m);
                    i10++;
                }
            }
        }
    }
}
