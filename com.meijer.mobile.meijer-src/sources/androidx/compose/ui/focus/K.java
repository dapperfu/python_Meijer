package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5946c0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.j0;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0003\u001a'\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001e\u0010\u0018\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "l", "k", "forced", "refreshFocusEvents", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "e", "a", "childNode", "m", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "n", "o", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "focusDirection", "Landroidx/compose/ui/focus/c;", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/c;", "f", "g", "h", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class K {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f50800a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f50802c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.f50801b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.f50803d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50843f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f50843f = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f50843f.R2();
        }
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static /* synthetic */ boolean d(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(focusTargetNode, z10, z11);
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        j0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        if (P0.h.isTrackFocusEnabled) {
            C5957k.p(focusTargetNode).getFocusOwner().r(focusTargetNode);
            return true;
        }
        focusTargetNode.b3(F.f50800a);
        return true;
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        return P0.h.isTrackFocusEnabled ? l(focusTargetNode) : k(focusTargetNode);
    }

    private static final boolean l(FocusTargetNode focusTargetNode) {
        D0.c cVar;
        int i10;
        C5946c0 nodes;
        C5946c0 nodes2;
        s focusOwner = C5957k.p(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeH = focusOwner.getActiveFocusTargetNode();
        F fD0 = focusTargetNode.d0();
        int i11 = 1;
        if (focusTargetNodeH == focusTargetNode) {
            focusTargetNode.Q2(fD0, fD0);
            return true;
        }
        int i12 = 0;
        if (focusTargetNodeH == null && !n(focusTargetNode)) {
            return false;
        }
        int i13 = 1024;
        int i14 = 16;
        if (focusTargetNodeH != null) {
            cVar = new D0.c(new FocusTargetNode[16], 0);
            int iA = C5952f0.a(1024);
            if (!focusTargetNodeH.getNode().getIsAttached()) {
                C14920a.b("visitAncestors called on an unattached node");
            }
            Modifier.c parent = focusTargetNodeH.getNode().getParent();
            LayoutNode layoutNodeO = C5957k.o(focusTargetNodeH);
            while (layoutNodeO != null) {
                if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            Modifier.c cVarH = parent;
                            D0.c cVar2 = null;
                            while (cVarH != null) {
                                int i15 = i13;
                                if (cVarH instanceof FocusTargetNode) {
                                    cVar.c((FocusTargetNode) cVarH);
                                } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                    Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate();
                                    int i16 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i16++;
                                            if (i16 == i11) {
                                                cVarH = delegate;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar2.c(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar2.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i11 = 1;
                                    }
                                    if (i16 == i11) {
                                        i13 = i15;
                                    }
                                }
                                cVarH = C5957k.h(cVar2);
                                i13 = i15;
                                i11 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i13 = i13;
                        i11 = 1;
                    }
                }
                int i17 = i13;
                layoutNodeO = layoutNodeO.getParent$ui_release();
                parent = (layoutNodeO == null || (nodes2 = layoutNodeO.getNodes()) == null) ? null : nodes2.getTail();
                i13 = i17;
                i11 = 1;
            }
        } else {
            cVar = null;
        }
        int i18 = i13;
        D0.c cVar3 = new D0.c(new FocusTargetNode[16], 0);
        int iA2 = C5952f0.a(i18);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeO2 = C5957k.o(focusTargetNode);
        int i19 = 1;
        while (layoutNodeO2 != null) {
            if ((layoutNodeO2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iA2) != 0) {
                        Modifier.c cVarH2 = parent2;
                        D0.c cVar4 = null;
                        while (cVarH2 != null) {
                            if (cVarH2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH2;
                                Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.s(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    cVar3.c(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeH) {
                                    i19 = i12;
                                }
                            } else {
                                if ((cVarH2.getKindSet() & iA2) != 0 && (cVarH2 instanceof AbstractC5959m)) {
                                    Modifier.c delegate2 = ((AbstractC5959m) cVarH2).getDelegate();
                                    int i20 = i12;
                                    while (delegate2 != null) {
                                        if ((delegate2.getKindSet() & iA2) != 0) {
                                            i20++;
                                            if (i20 == 1) {
                                                cVarH2 = delegate2;
                                            } else {
                                                if (cVar4 == null) {
                                                    cVar4 = new D0.c(new Modifier.c[i14], 0);
                                                }
                                                if (cVarH2 != null) {
                                                    cVar4.c(cVarH2);
                                                    cVarH2 = null;
                                                }
                                                cVar4.c(delegate2);
                                            }
                                        }
                                        delegate2 = delegate2.getChild();
                                        i14 = 16;
                                    }
                                    if (i20 == 1) {
                                    }
                                }
                                i12 = 0;
                                i14 = 16;
                            }
                            cVarH2 = C5957k.h(cVar4);
                            i12 = 0;
                            i14 = 16;
                        }
                    }
                    parent2 = parent2.getParent();
                    i12 = 0;
                    i14 = 16;
                }
            }
            layoutNodeO2 = layoutNodeO2.getParent$ui_release();
            parent2 = (layoutNodeO2 == null || (nodes = layoutNodeO2.getNodes()) == null) ? null : nodes.getTail();
            i12 = 0;
            i14 = 16;
        }
        if (i19 == 0 || focusTargetNodeH == null) {
            i10 = 1;
        } else {
            i10 = 1;
            if (!d(focusTargetNodeH, false, true, 1, null)) {
                return false;
            }
        }
        e(focusTargetNode);
        if (cVar != null) {
            int size = cVar.getSize() - i10;
            Object[] objArr = cVar.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.Q2(F.f50801b, F.f50803d);
                    size--;
                }
            }
        }
        int size2 = cVar3.getSize() - 1;
        Object[] objArr2 = cVar3.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.Q2(focusTargetNode4 == focusTargetNodeH ? F.f50800a : F.f50803d, F.f50801b);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.Q2(fD0, F.f50800a);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!P0.h.isViewFocusFixEnabled || C5957k.o(focusTargetNode).R() != null) {
            return true;
        }
        C5957k.p(focusTargetNode).getFocusOwner().u(C5905f.i(C5905f.INSTANCE.e()), null);
        return true;
    }

    private static final boolean m(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.c cVar;
        Modifier.c cVarH;
        C5946c0 nodes;
        C5946c0 nodes2;
        int iA = C5952f0.a(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (layoutNodeO == null) {
                cVarH = null;
                break;
            }
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarH = parent;
                        D0.c cVar2 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar2.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar2.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes2 = layoutNodeO.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.e(cVarH, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i11 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i11 == 1) {
            boolean zE = e(focusTargetNode2);
            if (zE) {
                focusTargetNode.b3(F.f50801b);
            }
            return zE;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iA2 = C5952f0.a(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    C14920a.b("visitAncestors called on an unattached node");
                }
                Modifier.c parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeO2 = C5957k.o(focusTargetNode);
                loop4: while (true) {
                    if (layoutNodeO2 == null) {
                        break;
                    }
                    if ((layoutNodeO2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iA2) != 0) {
                                Modifier.c cVarH2 = parent2;
                                D0.c cVar3 = null;
                                while (cVarH2 != null) {
                                    if (cVarH2 instanceof FocusTargetNode) {
                                        cVar = cVarH2;
                                        break loop4;
                                    }
                                    if ((cVarH2.getKindSet() & iA2) != 0 && (cVarH2 instanceof AbstractC5959m)) {
                                        int i12 = 0;
                                        for (Modifier.c delegate2 = ((AbstractC5959m) cVarH2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iA2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVarH2 = delegate2;
                                                } else {
                                                    if (cVar3 == null) {
                                                        cVar3 = new D0.c(new Modifier.c[16], 0);
                                                    }
                                                    if (cVarH2 != null) {
                                                        cVar3.c(cVarH2);
                                                        cVarH2 = null;
                                                    }
                                                    cVar3.c(delegate2);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarH2 = C5957k.h(cVar3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeO2 = layoutNodeO2.getParent$ui_release();
                    parent2 = (layoutNodeO2 == null || (nodes = layoutNodeO2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && n(focusTargetNode)) {
                    boolean zE2 = e(focusTargetNode2);
                    if (zE2) {
                        focusTargetNode.b3(F.f50801b);
                    }
                    return zE2;
                }
                if (focusTargetNode3 == null || !m(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zM = m(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.d0() != F.f50801b) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zM) {
                    focusTargetNode3.P2();
                }
                return zM;
            }
            o(focusTargetNode);
            if (b(focusTargetNode, false, false, 3, null) && e(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = L.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (a(focusTargetNode, z10, z11)) {
                    if (P0.h.isTrackFocusEnabled) {
                        if (z11) {
                            focusTargetNode.Q2(F.f50801b, F.f50803d);
                        }
                    } else {
                        focusTargetNode.b3(F.f50803d);
                        if (z11) {
                            focusTargetNode.P2();
                        }
                    }
                    return true;
                }
                return false;
            }
            if (z10) {
                if (P0.h.isTrackFocusEnabled) {
                    C5957k.p(focusTargetNode).getFocusOwner().r(null);
                    if (z11) {
                        focusTargetNode.Q2(F.f50802c, F.f50803d);
                        return z10;
                    }
                } else {
                    focusTargetNode.b3(F.f50803d);
                    if (z11) {
                        focusTargetNode.P2();
                    }
                }
            }
            return z10;
        }
        if (P0.h.isTrackFocusEnabled) {
            C5957k.p(focusTargetNode).getFocusOwner().r(null);
            if (z11) {
                focusTargetNode.Q2(F.f50800a, F.f50803d);
            }
        } else {
            focusTargetNode.b3(F.f50803d);
            if (z11) {
                focusTargetNode.P2();
            }
        }
        return true;
    }

    public static final EnumC5902c f(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    EnumC5902c enumC5902cF = f(o(focusTargetNode), i10);
                    if (enumC5902cF == EnumC5902c.f50865a) {
                        enumC5902cF = null;
                    }
                    if (enumC5902cF == null) {
                        return h(focusTargetNode, i10);
                    }
                    return enumC5902cF;
                }
            } else {
                return EnumC5902c.f50866b;
            }
        }
        return EnumC5902c.f50865a;
    }

    private static final EnumC5902c g(FocusTargetNode focusTargetNode, int i10) {
        int generation;
        int generation2;
        EnumC5902c enumC5902c;
        EnumC5902c enumC5902c2;
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                u uVarR2 = focusTargetNode.R2();
                C5901b c5901b = new C5901b(i10, null);
                J jA = I.a(focusTargetNode);
                if (jA != null) {
                    generation = jA.getGeneration();
                } else {
                    generation = 0;
                }
                s focusOwner = C5957k.p(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeH = focusOwner.getActiveFocusTargetNode();
                uVarR2.k().invoke(c5901b);
                if (jA != null) {
                    generation2 = jA.getGeneration();
                } else {
                    generation2 = 0;
                }
                FocusTargetNode focusTargetNodeH2 = focusOwner.getActiveFocusTargetNode();
                if (c5901b.getIsCanceled()) {
                    y.Companion companion = y.INSTANCE;
                    y yVarA = companion.a();
                    if (yVarA == companion.a()) {
                        EnumC5902c enumC5902c3 = EnumC5902c.f50866b;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return enumC5902c3;
                    }
                    if (yVarA == companion.c()) {
                        EnumC5902c enumC5902c4 = EnumC5902c.f50867c;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return enumC5902c4;
                    }
                    if (y.h(yVarA, 0, 1, null)) {
                        enumC5902c2 = EnumC5902c.f50867c;
                    } else {
                        enumC5902c2 = EnumC5902c.f50868d;
                    }
                    focusTargetNode.isProcessingCustomEnter = false;
                    return enumC5902c2;
                }
                if (generation == generation2 && (!P0.h.isTrackFocusEnabled || focusTargetNodeH == focusTargetNodeH2 || focusTargetNodeH2 == null)) {
                    focusTargetNode.isProcessingCustomEnter = false;
                } else {
                    y.Companion companion2 = y.INSTANCE;
                    y yVarC = companion2.c();
                    if (yVarC == companion2.a()) {
                        EnumC5902c enumC5902c5 = EnumC5902c.f50866b;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return enumC5902c5;
                    }
                    if (yVarC == companion2.c()) {
                        EnumC5902c enumC5902c6 = EnumC5902c.f50867c;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return enumC5902c6;
                    }
                    if (y.h(yVarC, 0, 1, null)) {
                        enumC5902c = EnumC5902c.f50867c;
                    } else {
                        enumC5902c = EnumC5902c.f50868d;
                    }
                    focusTargetNode.isProcessingCustomEnter = false;
                    return enumC5902c;
                }
            } catch (Throwable th2) {
                focusTargetNode.isProcessingCustomEnter = false;
                throw th2;
            }
        }
        return EnumC5902c.f50865a;
    }

    private static final EnumC5902c h(FocusTargetNode focusTargetNode, int i10) {
        int generation;
        int generation2;
        EnumC5902c enumC5902c;
        EnumC5902c enumC5902c2;
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                u uVarR2 = focusTargetNode.R2();
                C5901b c5901b = new C5901b(i10, null);
                J jA = I.a(focusTargetNode);
                if (jA != null) {
                    generation = jA.getGeneration();
                } else {
                    generation = 0;
                }
                s focusOwner = C5957k.p(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeH = focusOwner.getActiveFocusTargetNode();
                uVarR2.l().invoke(c5901b);
                if (jA != null) {
                    generation2 = jA.getGeneration();
                } else {
                    generation2 = 0;
                }
                FocusTargetNode focusTargetNodeH2 = focusOwner.getActiveFocusTargetNode();
                if (c5901b.getIsCanceled()) {
                    y.Companion companion = y.INSTANCE;
                    y yVarA = companion.a();
                    if (yVarA == companion.a()) {
                        EnumC5902c enumC5902c3 = EnumC5902c.f50866b;
                        focusTargetNode.isProcessingCustomExit = false;
                        return enumC5902c3;
                    }
                    if (yVarA == companion.c()) {
                        EnumC5902c enumC5902c4 = EnumC5902c.f50867c;
                        focusTargetNode.isProcessingCustomExit = false;
                        return enumC5902c4;
                    }
                    if (y.h(yVarA, 0, 1, null)) {
                        enumC5902c2 = EnumC5902c.f50867c;
                    } else {
                        enumC5902c2 = EnumC5902c.f50868d;
                    }
                    focusTargetNode.isProcessingCustomExit = false;
                    return enumC5902c2;
                }
                if (generation == generation2 && (!P0.h.isTrackFocusEnabled || focusTargetNodeH == focusTargetNodeH2 || focusTargetNodeH2 == null)) {
                    focusTargetNode.isProcessingCustomExit = false;
                } else {
                    y.Companion companion2 = y.INSTANCE;
                    y yVarC = companion2.c();
                    if (yVarC == companion2.a()) {
                        EnumC5902c enumC5902c5 = EnumC5902c.f50866b;
                        focusTargetNode.isProcessingCustomExit = false;
                        return enumC5902c5;
                    }
                    if (yVarC == companion2.c()) {
                        EnumC5902c enumC5902c6 = EnumC5902c.f50867c;
                        focusTargetNode.isProcessingCustomExit = false;
                        return enumC5902c6;
                    }
                    if (y.h(yVarC, 0, 1, null)) {
                        enumC5902c = EnumC5902c.f50867c;
                    } else {
                        enumC5902c = EnumC5902c.f50868d;
                    }
                    focusTargetNode.isProcessingCustomExit = false;
                    return enumC5902c;
                }
            } catch (Throwable th2) {
                focusTargetNode.isProcessingCustomExit = false;
                throw th2;
            }
        }
        return EnumC5902c.f50865a;
    }

    public static final EnumC5902c i(FocusTargetNode focusTargetNode, int i10) {
        EnumC5902c enumC5902c;
        Modifier.c cVarH;
        C5946c0 nodes;
        int i11 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    int iA = C5952f0.a(1024);
                    if (!focusTargetNode.getNode().getIsAttached()) {
                        C14920a.b("visitAncestors called on an unattached node");
                    }
                    Modifier.c parent = focusTargetNode.getNode().getParent();
                    LayoutNode layoutNodeO = C5957k.o(focusTargetNode);
                    loop0: while (true) {
                        enumC5902c = null;
                        if (layoutNodeO != null) {
                            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & iA) != 0) {
                                        cVarH = parent;
                                        D0.c cVar = null;
                                        while (cVarH != null) {
                                            if (cVarH instanceof FocusTargetNode) {
                                                break loop0;
                                            }
                                            if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                                int i12 = 0;
                                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                                    if ((delegate.getKindSet() & iA) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            cVarH = delegate;
                                                        } else {
                                                            if (cVar == null) {
                                                                cVar = new D0.c(new Modifier.c[16], 0);
                                                            }
                                                            if (cVarH != null) {
                                                                cVar.c(cVarH);
                                                                cVarH = null;
                                                            }
                                                            cVar.c(delegate);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            cVarH = C5957k.h(cVar);
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
                        } else {
                            cVarH = null;
                            break;
                        }
                    }
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                    if (focusTargetNode2 == null) {
                        return EnumC5902c.f50865a;
                    }
                    int i13 = a.$EnumSwitchMapping$0[focusTargetNode2.d0().ordinal()];
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    EnumC5902c enumC5902cI = i(focusTargetNode2, i10);
                                    if (enumC5902cI != EnumC5902c.f50865a) {
                                        enumC5902c = enumC5902cI;
                                    }
                                    if (enumC5902c == null) {
                                        return g(focusTargetNode2, i10);
                                    }
                                    return enumC5902c;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            return i(focusTargetNode2, i10);
                        }
                        return EnumC5902c.f50866b;
                    }
                    return g(focusTargetNode2, i10);
                }
                throw new NoWhenBranchMatchedException();
            }
            return f(o(focusTargetNode), i10);
        }
        return EnumC5902c.f50865a;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean k(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.K.k(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean n(FocusTargetNode focusTargetNode) {
        return C5957k.p(focusTargetNode).getFocusOwner().u(null, null);
    }

    private static final FocusTargetNode o(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = L.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
