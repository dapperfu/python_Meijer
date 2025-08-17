package k1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5804c0;
import androidx.compose.ui.node.C5810f0;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.LayoutNode;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lk1/h;", "Lk1/k;", "Landroidx/compose/ui/node/j;", "Lk1/g;", "t0", "()Lk1/g;", "providedValues", "T", "Lk1/c;", "q", "(Lk1/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface h extends k, InterfaceC5814j {
    default g t0() {
        return b.f141145a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [D0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [D0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // k1.k
    default <T> T q(c<T> cVar) {
        C5804c0 nodes;
        if (!getNode().getIsAttached()) {
            C14832a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = C5810f0.a(32);
        if (!getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = getNode().getParent();
        LayoutNode layoutNodeO = C5815k.o(this);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5817m abstractC5817mH = parent;
                        ?? cVar2 = 0;
                        while (abstractC5817mH != 0) {
                            if (abstractC5817mH instanceof h) {
                                h hVar = (h) abstractC5817mH;
                                if (hVar.t0().a(cVar)) {
                                    return (T) hVar.t0().b(cVar);
                                }
                            } else if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                Modifier.c delegate = abstractC5817mH.getDelegate();
                                int i10 = 0;
                                abstractC5817mH = abstractC5817mH;
                                cVar2 = cVar2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        cVar2 = cVar2;
                                        if (i10 == 1) {
                                            abstractC5817mH = delegate;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5817mH != 0) {
                                                cVar2.c(abstractC5817mH);
                                                abstractC5817mH = 0;
                                            }
                                            cVar2.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC5817mH = abstractC5817mH;
                                    cVar2 = cVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5817mH = C5815k.h(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            if (layoutNodeO != null && (nodes = layoutNodeO.getNodes()) != null) {
                parent = nodes.getTail();
            } else {
                parent = null;
            }
        }
        return cVar.a().invoke();
    }
}
