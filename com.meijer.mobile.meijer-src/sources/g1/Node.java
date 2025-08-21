package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.q0;
import h1.C14438b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109¨\u0006>"}, d2 = {"Lg1/m;", "Lg1/n;", "Landroidx/compose/ui/Modifier$c;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$c;)V", "Lg1/q;", "oldEvent", "newEvent", "", "m", "(Lg1/q;Lg1/q;)Z", "", "j", "()V", "", "pointerIdValue", "LZ/T;", "hitNodes", "h", "(JLZ/T;)V", "LZ/C;", "Lg1/B;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Lg1/g;", "internalPointerEvent", "isInBounds", "f", "(LZ/C;Landroidx/compose/ui/layout/LayoutCoordinates;Lg1/g;Z)Z", "e", "(Lg1/g;)Z", "a", "d", "n", "b", "(Lg1/g;)V", "", "toString", "()Ljava/lang/String;", "c", "Landroidx/compose/ui/Modifier$c;", "k", "()Landroidx/compose/ui/Modifier$c;", "Lh1/b;", "Lh1/b;", "l", "()Lh1/b;", "pointerIds", "LZ/C;", "relevantChanges", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "g", "Lg1/q;", "pointerEvent", "Z", "wasIn", "i", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.m, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class Node extends C14311n {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Modifier.c modifierNode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates coordinates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C14314q pointerEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C14438b pointerIds = new C14438b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Z.C<PointerInputChange> relevantChanges = new Z.C<>(2);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isIn = true;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited = true;

    private final boolean m(C14314q oldEvent, C14314q newEvent) {
        if (oldEvent == null || oldEvent.c().size() != newEvent.c().size()) {
            return true;
        }
        int size = newEvent.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!U0.f.j(oldEvent.c().get(i10).getPosition(), newEvent.c().get(i10).getPosition())) {
                return true;
            }
        }
        return false;
    }

    public final void n() {
        this.isIn = true;
    }

    private final void j() {
        this.relevantChanges.a();
        this.coordinates = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0260  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // g1.C14311n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(Z.C<g1.PointerInputChange> r46, androidx.compose.ui.layout.LayoutCoordinates r47, g1.C14304g r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.Node.a(Z.C, androidx.compose.ui.layout.LayoutCoordinates, g1.g, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // g1.C14311n
    public boolean e(C14304g internalPointerEvent) {
        boolean z10 = false;
        z10 = false;
        if (!this.relevantChanges.f() && this.modifierNode.getIsAttached()) {
            C14314q c14314q = this.pointerEvent;
            Intrinsics.g(c14314q);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.g(layoutCoordinates);
            long jC = layoutCoordinates.c();
            AbstractC5959m abstractC5959mH = this.modifierNode;
            int iA = C5952f0.a(16);
            D0.c cVar = null;
            while (abstractC5959mH != 0) {
                if (abstractC5959mH instanceof q0) {
                    ((q0) abstractC5959mH).s1(c14314q, EnumC14315s.f133970c, jC);
                } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                    Modifier.c delegate = abstractC5959mH.getDelegate();
                    int i10 = 0;
                    abstractC5959mH = abstractC5959mH;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                abstractC5959mH = delegate;
                            } else {
                                if (cVar == null) {
                                    cVar = new D0.c(new Modifier.c[16], 0);
                                }
                                if (abstractC5959mH != 0) {
                                    cVar.c(abstractC5959mH);
                                    abstractC5959mH = 0;
                                }
                                cVar.c(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        abstractC5959mH = abstractC5959mH;
                    }
                    if (i10 == 1) {
                    }
                }
                abstractC5959mH = C5957k.h(cVar);
            }
            if (this.modifierNode.getIsAttached()) {
                D0.c<Node> cVarG = g();
                Node[] nodeArr = cVarG.content;
                int size = cVarG.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    nodeArr[i11].e(internalPointerEvent);
                }
            }
            z10 = true;
        }
        b(internalPointerEvent);
        j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // g1.C14311n
    public boolean f(Z.C<PointerInputChange> changes, LayoutCoordinates parentCoordinates, C14304g internalPointerEvent, boolean isInBounds) {
        if (this.relevantChanges.f() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        C14314q c14314q = this.pointerEvent;
        Intrinsics.g(c14314q);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.g(layoutCoordinates);
        long jC = layoutCoordinates.c();
        AbstractC5959m abstractC5959mH = this.modifierNode;
        int iA = C5952f0.a(16);
        D0.c cVar = null;
        while (abstractC5959mH != 0) {
            if (abstractC5959mH instanceof q0) {
                ((q0) abstractC5959mH).s1(c14314q, EnumC14315s.f133968a, jC);
            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                Modifier.c delegate = abstractC5959mH.getDelegate();
                int i10 = 0;
                abstractC5959mH = abstractC5959mH;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC5959mH = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new D0.c(new Modifier.c[16], 0);
                            }
                            if (abstractC5959mH != 0) {
                                cVar.c(abstractC5959mH);
                                abstractC5959mH = 0;
                            }
                            cVar.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    abstractC5959mH = abstractC5959mH;
                }
                if (i10 == 1) {
                }
            }
            abstractC5959mH = C5957k.h(cVar);
        }
        if (this.modifierNode.getIsAttached()) {
            D0.c<Node> cVarG = g();
            Node[] nodeArr = cVarG.content;
            int size = cVarG.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                Node node = nodeArr[i11];
                Z.C<PointerInputChange> c10 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.g(layoutCoordinates2);
                node.f(c10, layoutCoordinates2, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            AbstractC5959m abstractC5959mH2 = this.modifierNode;
            int iA2 = C5952f0.a(16);
            D0.c cVar2 = null;
            while (abstractC5959mH2 != 0) {
                if (abstractC5959mH2 instanceof q0) {
                    ((q0) abstractC5959mH2).s1(c14314q, EnumC14315s.f133969b, jC);
                } else if ((abstractC5959mH2.getKindSet() & iA2) != 0 && (abstractC5959mH2 instanceof AbstractC5959m)) {
                    Modifier.c delegate2 = abstractC5959mH2.getDelegate();
                    int i12 = 0;
                    abstractC5959mH2 = abstractC5959mH2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iA2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                abstractC5959mH2 = delegate2;
                            } else {
                                if (cVar2 == null) {
                                    cVar2 = new D0.c(new Modifier.c[16], 0);
                                }
                                if (abstractC5959mH2 != 0) {
                                    cVar2.c(abstractC5959mH2);
                                    abstractC5959mH2 = 0;
                                }
                                cVar2.c(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        abstractC5959mH2 = abstractC5959mH2;
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC5959mH2 = C5957k.h(cVar2);
            }
        }
        return true;
    }

    @Override // g1.C14311n
    public void h(long pointerIdValue, Z.T<Node> hitNodes) {
        if (this.pointerIds.c(pointerIdValue) && !hitNodes.a(this)) {
            this.pointerIds.g(pointerIdValue);
            this.relevantChanges.k(pointerIdValue);
        }
        D0.c<Node> cVarG = g();
        Node[] nodeArr = cVarG.content;
        int size = cVarG.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].h(pointerIdValue, hitNodes);
        }
    }

    /* renamed from: k, reason: from getter */
    public final Modifier.c getModifierNode() {
        return this.modifierNode;
    }

    /* renamed from: l, reason: from getter */
    public final C14438b getPointerIds() {
        return this.pointerIds;
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }

    public Node(Modifier.c cVar) {
        this.modifierNode = cVar;
    }

    @Override // g1.C14311n
    public void b(C14304g internalPointerEvent) {
        super.b(internalPointerEvent);
        C14314q c14314q = this.pointerEvent;
        if (c14314q == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listC = c14314q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = listC.get(i10);
            boolean pressed = pointerInputChange.getPressed();
            boolean zA = internalPointerEvent.a(pointerInputChange.getId());
            boolean z10 = this.isIn;
            if ((!pressed && !zA) || (!pressed && !z10)) {
                this.pointerIds.g(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = C14316t.i(c14314q.getType(), C14316t.INSTANCE.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // g1.C14311n
    public void d() {
        D0.c<Node> cVarG = g();
        Node[] nodeArr = cVarG.content;
        int size = cVarG.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].d();
        }
        AbstractC5959m abstractC5959mH = this.modifierNode;
        int iA = C5952f0.a(16);
        D0.c cVar = null;
        while (abstractC5959mH != 0) {
            if (abstractC5959mH instanceof q0) {
                ((q0) abstractC5959mH).v1();
            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                Modifier.c delegate = abstractC5959mH.getDelegate();
                int i11 = 0;
                abstractC5959mH = abstractC5959mH;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i11++;
                        if (i11 == 1) {
                            abstractC5959mH = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new D0.c(new Modifier.c[16], 0);
                            }
                            if (abstractC5959mH != 0) {
                                cVar.c(abstractC5959mH);
                                abstractC5959mH = 0;
                            }
                            cVar.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    abstractC5959mH = abstractC5959mH;
                }
                if (i11 == 1) {
                }
            }
            abstractC5959mH = C5957k.h(cVar);
        }
    }
}
