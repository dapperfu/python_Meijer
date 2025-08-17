package androidx.compose.ui.node;

import V0.InterfaceC5310d1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import j1.C14832a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.InterfaceC16702j;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u000b¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010\"\u001a\u00020!*\u00020\u000b¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u000b¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020'*\u00020\u000b¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010+\u001a\u0004\u0018\u00010**\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010-\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b-\u0010.\"\u0018\u00101\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "zOrder", "LD0/c;", "e", "(Landroidx/compose/ui/node/LayoutNode;Z)LD0/c;", "Landroidx/compose/ui/Modifier$c;", "node", "", "c", "(LD0/c;Landroidx/compose/ui/Modifier$c;Z)V", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/f0;", "type", "f", "(Landroidx/compose/ui/node/j;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "j", "(Landroidx/compose/ui/node/j;I)Landroidx/compose/ui/node/NodeCoordinator;", "o", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/LayoutNode;", "Lr1/j;", "q", "(Landroidx/compose/ui/node/j;)Lr1/j;", "Landroidx/compose/ui/node/Owner;", "p", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/Owner;", "i", "(Landroidx/compose/ui/node/j;)V", "LH1/d;", "k", "(Landroidx/compose/ui/node/j;)LH1/d;", "LV0/d1;", "l", "(Landroidx/compose/ui/node/j;)LV0/d1;", "LH1/t;", "n", "(Landroidx/compose/ui/node/j;)LH1/t;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "m", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/D;", "d", "(Landroidx/compose/ui/Modifier$c;)Landroidx/compose/ui/node/D;", "h", "(LD0/c;)Landroidx/compose/ui/Modifier$c;", "g", "(Landroidx/compose/ui/node/j;)Z", "isDelegationRoot", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5815k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final D d(Modifier.c cVar) {
        if ((C5810f0.a(2) & cVar.getKindSet()) != 0) {
            if (cVar instanceof D) {
                return (D) cVar;
            }
            if (cVar instanceof AbstractC5817m) {
                Modifier.c cVarL2 = ((AbstractC5817m) cVar).getDelegate();
                while (cVarL2 != 0) {
                    if (cVarL2 instanceof D) {
                        return (D) cVarL2;
                    }
                    cVarL2 = (!(cVarL2 instanceof AbstractC5817m) || (C5810f0.a(2) & cVarL2.getKindSet()) == 0) ? cVarL2.getChild() : ((AbstractC5817m) cVarL2).getDelegate();
                }
            }
        }
        return null;
    }

    private static final D0.c<LayoutNode> e(LayoutNode layoutNode, boolean z10) {
        return z10 ? layoutNode.s0() : layoutNode.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c h(D0.c<Modifier.c> cVar) {
        if (cVar == null || cVar.getSize() == 0) {
            return null;
        }
        return cVar.u(cVar.getSize() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(D0.c<Modifier.c> cVar, Modifier.c cVar2, boolean z10) {
        D0.c<LayoutNode> cVarE = e(o(cVar2), z10);
        int iO = cVarE.getSize() - 1;
        LayoutNode[] layoutNodeArr = cVarE.content;
        if (iO < layoutNodeArr.length) {
            while (iO >= 0) {
                cVar.c(layoutNodeArr[iO].getNodes().getHead());
                iO--;
            }
        }
    }

    public static final boolean f(InterfaceC5814j interfaceC5814j, int i10) {
        if ((interfaceC5814j.getNode().getAggregateChildKindSet() & i10) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean g(InterfaceC5814j interfaceC5814j) {
        if (interfaceC5814j.getNode() == interfaceC5814j) {
            return true;
        }
        return false;
    }

    public static final void i(InterfaceC5814j interfaceC5814j) {
        o(interfaceC5814j).k1();
    }

    public static final NodeCoordinator j(InterfaceC5814j interfaceC5814j, int i10) {
        NodeCoordinator coordinator = interfaceC5814j.getNode().getCoordinator();
        Intrinsics.g(coordinator);
        if (coordinator.N2() == interfaceC5814j && g0.i(i10)) {
            NodeCoordinator nodeCoordinatorO2 = coordinator.getWrapped();
            Intrinsics.g(nodeCoordinatorO2);
            return nodeCoordinatorO2;
        }
        return coordinator;
    }

    public static final H1.d k(InterfaceC5814j interfaceC5814j) {
        return o(interfaceC5814j).getDensity();
    }

    public static final InterfaceC5310d1 l(InterfaceC5814j interfaceC5814j) {
        return p(interfaceC5814j).getGraphicsContext();
    }

    public static final LayoutCoordinates m(InterfaceC5814j interfaceC5814j) {
        if (!interfaceC5814j.getNode().getIsAttached()) {
            C14832a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates layoutCoordinatesQ1 = j(interfaceC5814j, C5810f0.a(2)).q1();
        if (!layoutCoordinatesQ1.isAttached()) {
            C14832a.b("LayoutCoordinates is not attached.");
        }
        return layoutCoordinatesQ1;
    }

    public static final H1.t n(InterfaceC5814j interfaceC5814j) {
        return o(interfaceC5814j).getLayoutDirection();
    }

    public static final LayoutNode o(InterfaceC5814j interfaceC5814j) {
        NodeCoordinator coordinator = interfaceC5814j.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        C14832a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final Owner p(InterfaceC5814j interfaceC5814j) {
        Owner owner$ui_release = o(interfaceC5814j).getOwner();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        C14832a.c("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final InterfaceC16702j q(InterfaceC5814j interfaceC5814j) {
        return o(interfaceC5814j);
    }
}
