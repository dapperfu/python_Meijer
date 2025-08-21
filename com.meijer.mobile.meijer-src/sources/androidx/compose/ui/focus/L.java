package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5946c0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "focusDirection", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/focus/y;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILH1/t;)Landroidx/compose/ui/focus/y;", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILH1/t;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class L {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[H1.t.values().length];
            try {
                iArr[H1.t.f13338a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H1.t.f13339b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[F.values().length];
            try {
                iArr2[F.f50800a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[F.f50801b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[F.f50802c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[F.f50803d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.L.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        C5946c0 nodes;
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(focusTargetNode);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        Modifier.c cVarH = parent;
                        D0.c cVar = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.R2().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, H1.t tVar, Rect rect, Function1<? super FocusTargetNode, Boolean> function1) {
        int iG;
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.e()) ? true : C5905f.l(i10, companion.f())) {
            return Boolean.valueOf(O.f(focusTargetNode, i10, function1));
        }
        if (C5905f.l(i10, companion.d()) ? true : C5905f.l(i10, companion.g()) ? true : C5905f.l(i10, companion.h()) ? true : C5905f.l(i10, companion.a())) {
            return P.t(focusTargetNode, i10, rect, function1);
        }
        if (!C5905f.l(i10, companion.b())) {
            if (C5905f.l(i10, companion.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || Intrinsics.e(focusTargetNodeC, focusTargetNode)) ? false : function1.invoke(focusTargetNodeC).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C5905f.n(i10))).toString());
        }
        int i11 = a.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i11 == 1) {
            iG = companion.g();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = companion.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return P.t(focusTargetNodeB2, iG, rect, function1);
        }
        return null;
    }

    public static final y a(FocusTargetNode focusTargetNode, int i10, H1.t tVar) {
        int generation;
        y end;
        y start;
        u uVarR2 = focusTargetNode.R2();
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.e())) {
            return uVarR2.getNext();
        }
        if (C5905f.l(i10, companion.f())) {
            return uVarR2.getPrevious();
        }
        if (C5905f.l(i10, companion.h())) {
            return uVarR2.getUp();
        }
        if (C5905f.l(i10, companion.a())) {
            return uVarR2.getDown();
        }
        y yVar = null;
        boolean zL = true;
        if (C5905f.l(i10, companion.d())) {
            int i11 = a.$EnumSwitchMapping$0[tVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    start = uVarR2.getEnd();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                start = uVarR2.getStart();
            }
            if (start != y.INSTANCE.b()) {
                yVar = start;
            }
            if (yVar == null) {
                return uVarR2.getLeft();
            }
            return yVar;
        }
        if (C5905f.l(i10, companion.g())) {
            int i12 = a.$EnumSwitchMapping$0[tVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    end = uVarR2.getStart();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                end = uVarR2.getEnd();
            }
            if (end != y.INSTANCE.b()) {
                yVar = end;
            }
            if (yVar == null) {
                return uVarR2.getRight();
            }
            return yVar;
        }
        if (!C5905f.l(i10, companion.b())) {
            zL = C5905f.l(i10, companion.c());
        }
        if (zL) {
            C5901b c5901b = new C5901b(i10, null);
            J jA = I.a(focusTargetNode);
            int generation2 = 0;
            if (jA != null) {
                generation = jA.getGeneration();
            } else {
                generation = 0;
            }
            s focusOwner = C5957k.p(focusTargetNode).getFocusOwner();
            FocusTargetNode focusTargetNodeH = focusOwner.h();
            if (C5905f.l(i10, companion.b())) {
                uVarR2.k().invoke(c5901b);
            } else {
                uVarR2.l().invoke(c5901b);
            }
            if (jA != null) {
                generation2 = jA.getGeneration();
            }
            if (c5901b.getIsCanceled()) {
                return y.INSTANCE.a();
            }
            if (generation == generation2 && (!P0.h.isTrackFocusEnabled || focusTargetNodeH == focusOwner.h())) {
                return y.INSTANCE.b();
            }
            return y.INSTANCE.c();
        }
        throw new IllegalStateException("invalid FocusDirection");
    }

    public static final Rect d(FocusTargetNode focusTargetNode) {
        Rect rectB0;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator != null && (rectB0 = LayoutCoordinatesKt.c(coordinator).b0(coordinator, false)) != null) {
            return rectB0;
        }
        return Rect.INSTANCE.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$c r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.C5952f0.a(r0)
            androidx.compose.ui.Modifier$c r2 = r10.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 != 0) goto L21
            java.lang.String r2 = "visitChildren called on an unattached node"
            j1.C14920a.b(r2)
        L21:
            D0.c r2 = new D0.c
            r3 = 16
            androidx.compose.ui.Modifier$c[] r4 = new androidx.compose.ui.Modifier.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$c r4 = r10.getNode()
            androidx.compose.ui.Modifier$c r4 = r4.getChild()
            if (r4 != 0) goto L3d
            androidx.compose.ui.Modifier$c r10 = r10.getNode()
            androidx.compose.ui.node.C5957k.a(r2, r10, r5)
            goto L40
        L3d:
            r2.c(r4)
        L40:
            int r10 = r2.getSize()
            if (r10 == 0) goto Ld5
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.u(r10)
            androidx.compose.ui.Modifier$c r10 = (androidx.compose.ui.Modifier.c) r10
            int r6 = r10.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            androidx.compose.ui.node.C5957k.a(r2, r10, r5)
            goto L40
        L5d:
            if (r10 == 0) goto L40
            int r6 = r10.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Ld0
            r6 = r1
        L67:
            if (r10 == 0) goto L40
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8f
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.Modifier$c r7 = r10.getNode()
            boolean r7 = r7.getIsAttached()
            if (r7 == 0) goto Lcb
            androidx.compose.ui.focus.F r7 = r10.d0()
            int[] r8 = androidx.compose.ui.focus.L.a.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L8e
            r8 = 2
            if (r7 == r8) goto L8e
            r8 = 3
            if (r7 == r8) goto L8e
            goto Lcb
        L8e:
            return r10
        L8f:
            int r7 = r10.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto Lcb
            boolean r7 = r10 instanceof androidx.compose.ui.node.AbstractC5959m
            if (r7 == 0) goto Lcb
            r7 = r10
            androidx.compose.ui.node.m r7 = (androidx.compose.ui.node.AbstractC5959m) r7
            androidx.compose.ui.Modifier$c r7 = r7.getDelegate()
            r8 = r5
        La2:
            if (r7 == 0) goto Lc8
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto Lc3
            int r8 = r8 + 1
            if (r8 != r4) goto Lb1
            r10 = r7
            goto Lc3
        Lb1:
            if (r6 != 0) goto Lba
            D0.c r6 = new D0.c
            androidx.compose.ui.Modifier$c[] r9 = new androidx.compose.ui.Modifier.c[r3]
            r6.<init>(r9, r5)
        Lba:
            if (r10 == 0) goto Lc0
            r6.c(r10)
            r10 = r1
        Lc0:
            r6.c(r7)
        Lc3:
            androidx.compose.ui.Modifier$c r7 = r7.getChild()
            goto La2
        Lc8:
            if (r8 != r4) goto Lcb
            goto L67
        Lcb:
            androidx.compose.ui.Modifier$c r10 = androidx.compose.ui.node.C5957k.b(r6)
            goto L67
        Ld0:
            androidx.compose.ui.Modifier$c r10 = r10.getChild()
            goto L5d
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.L.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        if (coordinator2 != null && (layoutNode = coordinator2.getLayoutNode()) != null && layoutNode.f() && (coordinator = focusTargetNode.getCoordinator()) != null && (layoutNode2 = coordinator.getLayoutNode()) != null && layoutNode2.isAttached()) {
            return true;
        }
        return false;
    }
}
