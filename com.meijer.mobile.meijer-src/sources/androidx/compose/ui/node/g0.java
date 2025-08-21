package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5909j;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC5907h;
import androidx.compose.ui.focus.InterfaceC5908i;
import androidx.compose.ui.layout.InterfaceC5920e;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.recyclerview.widget.RecyclerView;
import e1.InterfaceC13753e;
import i1.InterfaceC14593a;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o1.InterfaceC16066a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/Modifier$b;", "element", "", "f", "(Landroidx/compose/ui/Modifier$b;)I", "Landroidx/compose/ui/Modifier$c;", "node", "g", "(Landroidx/compose/ui/Modifier$c;)I", "", "d", "(Landroidx/compose/ui/Modifier$c;)V", "a", "e", "remainingSet", "phase", "b", "(Landroidx/compose/ui/Modifier$c;II)V", "selfKindSet", "c", "Landroidx/compose/ui/focus/w;", "j", "(Landroidx/compose/ui/focus/w;)V", "", "k", "(Landroidx/compose/ui/focus/w;)Z", "h", "LZ/S;", "", "LZ/S;", "classToKindSetMap", "Landroidx/compose/ui/node/f0;", "i", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z.S<Object> f51756a = Z.b0.b();

    public static final int f(Modifier.b bVar) {
        int iA = C5952f0.a(1);
        if (bVar instanceof androidx.compose.ui.layout.B) {
            iA |= C5952f0.a(2);
        }
        if (bVar instanceof T0.h) {
            iA |= C5952f0.a(4);
        }
        if (bVar instanceof SemanticsModifier) {
            iA |= C5952f0.a(8);
        }
        if (bVar instanceof g1.I) {
            iA |= C5952f0.a(16);
        }
        if ((bVar instanceof k1.d) || (bVar instanceof k1.j)) {
            iA |= C5952f0.a(32);
        }
        if (bVar instanceof InterfaceC5907h) {
            iA |= C5952f0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (bVar instanceof androidx.compose.ui.focus.r) {
            iA |= C5952f0.a(RecyclerView.m.FLAG_MOVED);
        }
        if (bVar instanceof androidx.compose.ui.layout.S) {
            iA |= C5952f0.a(256);
        }
        if (bVar instanceof androidx.compose.ui.layout.c0) {
            iA |= C5952f0.a(64);
        }
        if ((bVar instanceof androidx.compose.ui.layout.V) || (bVar instanceof androidx.compose.ui.layout.Y)) {
            iA |= C5952f0.a(128);
        }
        return bVar instanceof InterfaceC16066a ? C5952f0.a(524288) | iA : iA;
    }

    public static final void b(Modifier.c cVar, int i10, int i11) {
        if (!(cVar instanceof AbstractC5959m)) {
            c(cVar, i10 & cVar.getKindSet(), i11);
            return;
        }
        AbstractC5959m abstractC5959m = (AbstractC5959m) cVar;
        c(cVar, abstractC5959m.getSelfKindSet() & i10, i11);
        int i12 = (~abstractC5959m.getSelfKindSet()) & i10;
        for (Modifier.c cVarL2 = abstractC5959m.getDelegate(); cVarL2 != null; cVarL2 = cVarL2.getChild()) {
            b(cVarL2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(Modifier.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((C5952f0.a(2) & i10) != 0 && (cVar instanceof D)) {
                G.b((D) cVar);
                if (i11 == 2) {
                    C5957k.j(cVar, C5952f0.a(2)).k3();
                }
            }
            if ((C5952f0.a(128) & i10) != 0 && (cVar instanceof C) && i11 != 2) {
                C5957k.o(cVar).B0();
            }
            if ((C5952f0.a(256) & i10) != 0 && (cVar instanceof InterfaceC5967v) && i11 != 2) {
                C5957k.o(cVar).C0();
            }
            if ((C5952f0.a(4) & i10) != 0 && (cVar instanceof InterfaceC5965t)) {
                C5966u.a((InterfaceC5965t) cVar);
            }
            if ((C5952f0.a(8) & i10) != 0 && (cVar instanceof u0)) {
                C5957k.o(cVar).K1(true);
            }
            if ((C5952f0.a(64) & i10) != 0 && (cVar instanceof n0)) {
                o0.a((n0) cVar);
            }
            if ((C5952f0.a(RecyclerView.m.FLAG_MOVED) & i10) != 0 && (cVar instanceof androidx.compose.ui.focus.w)) {
                androidx.compose.ui.focus.w wVar = (androidx.compose.ui.focus.w) cVar;
                if (k(wVar)) {
                    if (P0.h.isTrackFocusEnabled || i11 == 2) {
                        j(wVar);
                    } else {
                        androidx.compose.ui.focus.x.a(wVar);
                    }
                }
            }
            if ((i10 & C5952f0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT)) == 0 || !(cVar instanceof InterfaceC5908i)) {
                return;
            }
            C5909j.b((InterfaceC5908i) cVar);
        }
    }

    public static final int h(Modifier.c cVar) {
        if (!(cVar instanceof AbstractC5959m)) {
            return g(cVar);
        }
        AbstractC5959m abstractC5959m = (AbstractC5959m) cVar;
        int iM2 = abstractC5959m.getSelfKindSet();
        for (Modifier.c cVarL2 = abstractC5959m.getDelegate(); cVarL2 != null; cVarL2 = cVarL2.getChild()) {
            iM2 |= h(cVarL2);
        }
        return iM2;
    }

    public static final boolean i(int i10) {
        return (i10 & C5952f0.a(128)) != 0;
    }

    private static final void j(androidx.compose.ui.focus.w wVar) {
        int iA = C5952f0.a(1024);
        if (!wVar.getNode().getIsAttached()) {
            C14920a.b("visitChildren called on an unattached node");
        }
        D0.c cVar = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = wVar.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar, wVar.getNode(), false);
        } else {
            cVar.c(child);
        }
        while (cVar.getSize() != 0) {
            Modifier.c cVarH = (Modifier.c) cVar.u(cVar.getSize() - 1);
            if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                C5957k.c(cVar, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet() & iA) != 0) {
                        D0.c cVar2 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                androidx.compose.ui.focus.I.b((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c cVarL2 = ((AbstractC5959m) cVarH).getDelegate(); cVarL2 != null; cVarL2 = cVarL2.getChild()) {
                                    if ((cVarL2.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = cVarL2;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar2.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar2.c(cVarL2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar2);
                        }
                    } else {
                        cVarH = cVarH.getChild();
                    }
                }
            }
        }
    }

    private static final boolean k(androidx.compose.ui.focus.w wVar) {
        C5949e c5949e = C5949e.f51735a;
        c5949e.o();
        wVar.j1(c5949e);
        return c5949e.n();
    }

    public static final void a(Modifier.c cVar) {
        if (!cVar.getIsAttached()) {
            C14920a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void d(Modifier.c cVar) {
        if (!cVar.getIsAttached()) {
            C14920a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(Modifier.c cVar) {
        if (!cVar.getIsAttached()) {
            C14920a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int g(Modifier.c cVar) {
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        Z.S<Object> s10 = f51756a;
        Object objB = P0.d.b(cVar);
        int iB = s10.b(objB);
        if (iB >= 0) {
            return s10.values[iB];
        }
        int iA = C5952f0.a(1);
        if (cVar instanceof D) {
            iA |= C5952f0.a(2);
        }
        if (cVar instanceof InterfaceC5965t) {
            iA |= C5952f0.a(4);
        }
        if (cVar instanceof u0) {
            iA |= C5952f0.a(8);
        }
        if (cVar instanceof q0) {
            iA |= C5952f0.a(16);
        }
        if (cVar instanceof k1.h) {
            iA |= C5952f0.a(32);
        }
        if (cVar instanceof n0) {
            iA |= C5952f0.a(64);
        }
        if (cVar instanceof C) {
            iA |= C5952f0.a(128);
        }
        if (cVar instanceof InterfaceC5967v) {
            iA |= C5952f0.a(256);
        }
        if (cVar instanceof InterfaceC5920e) {
            iA |= C5952f0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= C5952f0.a(1024);
        }
        if (cVar instanceof androidx.compose.ui.focus.w) {
            iA |= C5952f0.a(RecyclerView.m.FLAG_MOVED);
        }
        if (cVar instanceof InterfaceC5908i) {
            iA |= C5952f0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (cVar instanceof InterfaceC13753e) {
            iA |= C5952f0.a(8192);
        }
        if (cVar instanceof InterfaceC14593a) {
            iA |= C5952f0.a(16384);
        }
        if (cVar instanceof InterfaceC5954h) {
            iA |= C5952f0.a(32768);
        }
        if (cVar instanceof e1.g) {
            iA |= C5952f0.a(131072);
        }
        if (cVar instanceof B0) {
            iA |= C5952f0.a(262144);
        }
        if (cVar instanceof InterfaceC16066a) {
            iA |= C5952f0.a(524288);
        }
        if (cVar instanceof m0) {
            iA |= C5952f0.a(1048576);
        }
        s10.u(objB, iA);
        return iA;
    }
}
