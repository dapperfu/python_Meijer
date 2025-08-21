package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.layout.InterfaceC5923h;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5946c0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", "b", "focusedItem", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "i", "h", "g", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f50801b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f50800a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.f50802c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.f50803d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/h$a;", "", "a", "(Landroidx/compose/ui/layout/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<InterfaceC5923h.a, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50849f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ J f50850g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50851h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50852i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50853j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f50854k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f50855l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, J j10, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i11, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f50849f = i10;
            this.f50850g = j10;
            this.f50851h = focusTargetNode;
            this.f50852i = focusTargetNode2;
            this.f50853j = focusTargetNode3;
            this.f50854k = i11;
            this.f50855l = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC5923h.a aVar) {
            if (this.f50849f != this.f50850g.getGeneration() || (P0.h.isTrackFocusEnabled && this.f50851h != C5957k.p(this.f50852i).getFocusOwner().getActiveFocusTargetNode())) {
                return Boolean.TRUE;
            }
            boolean zI = O.i(this.f50852i, this.f50853j, this.f50854k, this.f50855l);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        Modifier.c cVar;
        C5946c0 nodes;
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (layoutNodeO == null) {
                break;
            }
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        Modifier.c cVarH = parent;
                        D0.c cVar2 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                cVar = cVarH;
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
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.e())) {
            return c(focusTargetNode, function1);
        }
        if (C5905f.l(i10, companion.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        D0.c cVar = new D0.c(new FocusTargetNode[16], 0);
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitChildren called on an unattached node");
        }
        D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.c(child);
        }
        while (cVar2.getSize() != 0) {
            Modifier.c cVarH = (Modifier.c) cVar2.u(cVar2.getSize() - 1);
            if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                C5957k.c(cVar2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet() & iA) != 0) {
                        D0.c cVar3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                cVar.c((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar3.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar3);
                        }
                    } else {
                        cVarH = cVarH.getChild();
                    }
                }
            }
        }
        cVar.A(N.f50848a);
        int size = cVar.getSize() - 1;
        Object[] objArr = cVar.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (L.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        D0.c cVar = new D0.c(new FocusTargetNode[16], 0);
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitChildren called on an unattached node");
        }
        D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.c(child);
        }
        while (cVar2.getSize() != 0) {
            Modifier.c cVarH = (Modifier.c) cVar2.u(cVar2.getSize() - 1);
            if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                C5957k.c(cVar2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet() & iA) != 0) {
                        D0.c cVar3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                cVar.c((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar3.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar3);
                        }
                    } else {
                        cVarH = cVarH.getChild();
                    }
                }
            }
        }
        cVar.A(N.f50848a);
        Object[] objArr = cVar.content;
        int size = cVar.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i11];
            if (L.g(focusTargetNode2) && c(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        boolean zBooleanValue;
        F fD0 = focusTargetNode.d0();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i10 = iArr[fD0.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    if (!g(focusTargetNode, function1)) {
                        if (focusTargetNode.R2().getCanFocus()) {
                            zBooleanValue = function1.invoke(focusTargetNode).booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (!zBooleanValue) {
                            return false;
                        }
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            return g(focusTargetNode, function1);
        }
        FocusTargetNode focusTargetNodeF = L.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            int i11 = iArr[focusTargetNodeF.d0().ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                return d(focusTargetNode, focusTargetNodeF, C5905f.INSTANCE.f(), function1);
            }
            if (!b(focusTargetNodeF, function1) && !d(focusTargetNode, focusTargetNodeF, C5905f.INSTANCE.f(), function1) && (!focusTargetNodeF.R2().getCanFocus() || !function1.invoke(focusTargetNodeF).booleanValue())) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i10 = a.$EnumSwitchMapping$0[focusTargetNode.d0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    if (focusTargetNode.R2().getCanFocus()) {
                        return function1.invoke(focusTargetNode).booleanValue();
                    }
                    return h(focusTargetNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
            return h(focusTargetNode, function1);
        }
        FocusTargetNode focusTargetNodeF = L.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            if (c(focusTargetNodeF, function1) || d(focusTargetNode, focusTargetNodeF, C5905f.INSTANCE.e(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (i(focusTargetNode, focusTargetNode2, i10, function1)) {
            return true;
        }
        J jC = I.c(focusTargetNode);
        Boolean bool = (Boolean) C5900a.a(focusTargetNode, i10, new b(jC.getGeneration(), jC, C5957k.p(focusTargetNode).getFocusOwner().getActiveFocusTargetNode(), focusTargetNode, focusTargetNode2, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (focusTargetNode.d0() == F.f50801b) {
            D0.c cVar = new D0.c(new FocusTargetNode[16], 0);
            int iA = C5952f0.a(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                C14920a.b("visitChildren called on an unattached node");
            }
            D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
            Modifier.c child = focusTargetNode.getNode().getChild();
            if (child == null) {
                C5957k.c(cVar2, focusTargetNode.getNode(), false);
            } else {
                cVar2.c(child);
            }
            while (cVar2.getSize() != 0) {
                Modifier.c cVarH = (Modifier.c) cVar2.u(cVar2.getSize() - 1);
                if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                    C5957k.c(cVar2, cVarH, false);
                } else {
                    while (true) {
                        if (cVarH == null) {
                            break;
                        }
                        if ((cVarH.getKindSet() & iA) != 0) {
                            D0.c cVar3 = null;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    cVar.c((FocusTargetNode) cVarH);
                                } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                    int i11 = 0;
                                    for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarH = delegate;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar3.c(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar3.c(delegate);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarH = C5957k.h(cVar3);
                            }
                        } else {
                            cVarH = cVarH.getChild();
                        }
                    }
                }
            }
            cVar.A(N.f50848a);
            C5905f.Companion companion = C5905f.INSTANCE;
            if (C5905f.l(i10, companion.e())) {
                IntRange intRangeX = RangesKt.x(0, cVar.getSize());
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                if (first <= last) {
                    boolean z10 = false;
                    while (true) {
                        if (z10) {
                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar.content[first];
                            if (L.g(focusTargetNode3) && c(focusTargetNode3, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.e(cVar.content[first], focusTargetNode2)) {
                            z10 = true;
                        }
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
            } else if (C5905f.l(i10, companion.f())) {
                IntRange intRangeX2 = RangesKt.x(0, cVar.getSize());
                int first2 = intRangeX2.getFirst();
                int last2 = intRangeX2.getLast();
                if (first2 <= last2) {
                    boolean z11 = false;
                    while (true) {
                        if (z11) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) cVar.content[last2];
                            if (L.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.e(cVar.content[last2], focusTargetNode2)) {
                            z11 = true;
                        }
                        if (last2 == first2) {
                            break;
                        }
                        last2--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            if (C5905f.l(i10, C5905f.INSTANCE.e()) || !focusTargetNode.R2().getCanFocus() || e(focusTargetNode)) {
                return false;
            }
            return function1.invoke(focusTargetNode).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
