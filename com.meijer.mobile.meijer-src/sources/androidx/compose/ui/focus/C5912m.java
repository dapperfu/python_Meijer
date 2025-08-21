package androidx.compose.ui.focus;

import Z.X;
import Z.k0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import j1.C14920a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0013J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0016\u00102\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/focus/m;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "Landroidx/compose/ui/focus/E;", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "activeFocusTargetNodeFetcher", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "T", "LZ/X;", "node", "f", "(LZ/X;Ljava/lang/Object;)V", "l", "()V", "", "k", "(Ljava/util/List;Ljava/lang/Object;)V", "c", "e", "d", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "g", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "h", "(Landroidx/compose/ui/focus/w;)V", "j", "", "b", "()Z", "a", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "LZ/X;", "focusTargetNodes", "focusEventNodes", "Ljava/util/List;", "focusTargetNodesLegacy", "focusEventNodesLegacy", "focusPropertiesNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "Z", "isInvalidationScheduled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.focus.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5912m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> invalidateOwnerFocusState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<E> rootFocusStateFetcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<FocusTargetNode> activeFocusTargetNodeFetcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final X<FocusTargetNode> focusTargetNodes = k0.a();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final X<InterfaceC5908i> focusEventNodes = k0.a();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC5908i> focusEventNodesLegacy = new ArrayList();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<w> focusPropertiesNodesLegacy = new ArrayList();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidationScheduled;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.m$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        a(Object obj) {
            super(0, obj, C5912m.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void a() {
            ((C5912m) this.receiver).c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.m$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, C5912m.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void a() {
            ((C5912m) this.receiver).c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (P0.h.isTrackFocusEnabled) {
            e();
        } else {
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void d() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        E eD0;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = 0;
        if (!this.rootFocusStateFetcher.invoke().b()) {
            List<InterfaceC5908i> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                list.get(i14).U(F.f50803d);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                FocusTargetNode focusTargetNode = list2.get(i15);
                if (focusTargetNode.getIsAttached() && !focusTargetNode.a3()) {
                    focusTargetNode.X2(F.f50803d);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List<w> list3 = this.focusPropertiesNodesLegacy;
        int size3 = list3.size();
        int i16 = 0;
        while (true) {
            i10 = 1024;
            i11 = 16;
            i12 = 1;
            if (i16 >= size3) {
                break;
            }
            w wVar = list3.get(i16);
            if (wVar.getNode().getIsAttached()) {
                int iA = C5952f0.a(1024);
                Modifier.c node = wVar.getNode();
                D0.c cVar = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet() & iA) != 0 && (node instanceof AbstractC5959m)) {
                        int i17 = 0;
                        for (Modifier.c delegate = ((AbstractC5959m) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & iA) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    node = delegate;
                                } else {
                                    if (cVar == null) {
                                        cVar = new D0.c(new Modifier.c[16], 0);
                                    }
                                    if (node != null) {
                                        cVar.c(node);
                                        node = null;
                                    }
                                    cVar.c(delegate);
                                }
                            }
                        }
                        if (i17 == 1) {
                        }
                    }
                    node = C5957k.h(cVar);
                }
                if (!wVar.getNode().getIsAttached()) {
                    C14920a.b("visitChildren called on an unattached node");
                }
                D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
                Modifier.c child = wVar.getNode().getChild();
                if (child == null) {
                    C5957k.c(cVar2, wVar.getNode(), false);
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
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) cVarH);
                                    } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                        int i18 = 0;
                                        for (Modifier.c delegate2 = ((AbstractC5959m) cVarH).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iA) != 0) {
                                                i18++;
                                                if (i18 == 1) {
                                                    cVarH = delegate2;
                                                } else {
                                                    if (cVar3 == null) {
                                                        cVar3 = new D0.c(new Modifier.c[16], 0);
                                                    }
                                                    if (cVarH != null) {
                                                        cVar3.c(cVarH);
                                                        cVarH = null;
                                                    }
                                                    cVar3.c(delegate2);
                                                }
                                            }
                                        }
                                        if (i18 == 1) {
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
            }
            i16++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<InterfaceC5908i> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i19 = 0;
        while (i19 < size4) {
            InterfaceC5908i interfaceC5908i = list4.get(i19);
            if (interfaceC5908i.getNode().getIsAttached()) {
                int iA2 = C5952f0.a(i10);
                Modifier.c node2 = interfaceC5908i.getNode();
                int i20 = z14;
                int i21 = i12;
                FocusTargetNode focusTargetNode2 = null;
                D0.c cVar4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        if (focusTargetNode2 != null) {
                            i20 = i12;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i21 = z14;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet() & iA2) != 0 && (node2 instanceof AbstractC5959m)) {
                        Modifier.c delegate3 = ((AbstractC5959m) node2).getDelegate();
                        int i22 = z14;
                        while (delegate3 != null) {
                            if ((delegate3.getKindSet() & iA2) != 0) {
                                i22++;
                                if (i22 == i12) {
                                    node2 = delegate3;
                                } else {
                                    if (cVar4 == null) {
                                        cVar4 = new D0.c(new Modifier.c[i11], z14);
                                    }
                                    if (node2 != null) {
                                        cVar4.c(node2);
                                        node2 = null;
                                    }
                                    cVar4.c(delegate3);
                                }
                            }
                            delegate3 = delegate3.getChild();
                            i12 = 1;
                        }
                        int i23 = i12;
                        if (i22 == i23) {
                            i12 = i23;
                        }
                    }
                    node2 = C5957k.h(cVar4);
                    i12 = 1;
                }
                if (!interfaceC5908i.getNode().getIsAttached()) {
                    C14920a.b("visitChildren called on an unattached node");
                }
                D0.c cVar5 = new D0.c(new Modifier.c[i11], z14);
                Modifier.c child2 = interfaceC5908i.getNode().getChild();
                if (child2 == null) {
                    C5957k.c(cVar5, interfaceC5908i.getNode(), z14);
                } else {
                    cVar5.c(child2);
                }
                while (cVar5.getSize() != 0) {
                    Modifier.c cVarH2 = (Modifier.c) cVar5.u(cVar5.getSize() - 1);
                    z14 = z14;
                    if ((cVarH2.getAggregateChildKindSet() & iA2) == 0) {
                        C5957k.c(cVar5, cVarH2, z14);
                    } else {
                        while (cVarH2 != null) {
                            if ((cVarH2.getKindSet() & iA2) != 0) {
                                D0.c cVar6 = null;
                                z14 = z14;
                                while (cVarH2 != null) {
                                    if (cVarH2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) cVarH2;
                                        if (focusTargetNode2 != null) {
                                            i20 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i21 = z14 == true ? 1 : 0;
                                        }
                                        z11 = z14 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((cVarH2.getKindSet() & iA2) == 0 || !(cVarH2 instanceof AbstractC5959m)) {
                                        z11 = z14 == true ? 1 : 0;
                                    } else {
                                        Modifier.c delegate4 = ((AbstractC5959m) cVarH2).getDelegate();
                                        int i24 = z14 == true ? 1 : 0;
                                        boolean z15 = z14;
                                        while (delegate4 != null) {
                                            if ((delegate4.getKindSet() & iA2) != 0) {
                                                i24++;
                                                if (i24 == 1) {
                                                    cVarH2 = delegate4;
                                                    z13 = false;
                                                } else {
                                                    if (cVar6 == null) {
                                                        Modifier.c[] cVarArr = new Modifier.c[i11];
                                                        z13 = false;
                                                        cVar6 = new D0.c(cVarArr, 0);
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (cVarH2 != null) {
                                                        cVar6.c(cVarH2);
                                                        cVarH2 = null;
                                                    }
                                                    cVar6.c(delegate4);
                                                }
                                            } else {
                                                z13 = z15;
                                            }
                                            delegate4 = delegate4.getChild();
                                            z15 = z13;
                                            i11 = 16;
                                        }
                                        z12 = z15;
                                        z12 = z12;
                                        if (i24 != 1) {
                                            cVarH2 = C5957k.h(cVar6);
                                        }
                                        z14 = z12;
                                        i11 = 16;
                                    }
                                    z12 = z11;
                                    cVarH2 = C5957k.h(cVar6);
                                    z14 = z12;
                                    i11 = 16;
                                }
                                boolean z16 = z14 == true ? 1 : 0;
                                i11 = 16;
                            } else {
                                boolean z17 = z14 == true ? 1 : 0;
                                cVarH2 = cVarH2.getChild();
                                z14 = z17 ? 1 : 0;
                                i11 = 16;
                            }
                        }
                    }
                    z14 = z14 ? 1 : 0;
                    i11 = 16;
                }
                z10 = z14 == true ? 1 : 0;
                i13 = 1;
                if (i21 != 0) {
                    if (i20 != 0) {
                        eD0 = C5909j.a(interfaceC5908i);
                    } else if (focusTargetNode2 == null || (eD0 = focusTargetNode2.d0()) == null) {
                        eD0 = F.f50803d;
                    }
                    interfaceC5908i.U(eD0);
                }
            } else {
                interfaceC5908i.U(F.f50803d);
                z10 = z14;
                i13 = i12;
            }
            i19++;
            i12 = i13;
            z14 = z10;
            i10 = 1024;
            i11 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i25 = z14; i25 < size5; i25++) {
            FocusTargetNode focusTargetNode5 = list5.get(i25);
            if (focusTargetNode5.getIsAttached()) {
                F fD0 = focusTargetNode5.d0();
                focusTargetNode5.Z2();
                if (fD0 != focusTargetNode5.d0() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode5)) {
                    focusTargetNode5.P2();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            C14920a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            C14920a.b("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        C14920a.b("Unprocessed FocusTarget nodes");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C5912m.e():void");
    }

    private final void l() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new b(this));
        this.isInvalidationScheduled = true;
    }

    public final boolean b() {
        return P0.h.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void g(InterfaceC5908i node) {
        if (P0.h.isTrackFocusEnabled) {
            f(this.focusEventNodes, node);
        } else {
            k(this.focusEventNodesLegacy, node);
        }
    }

    public final void h(w node) {
        k(this.focusPropertiesNodesLegacy, node);
    }

    public final void i(FocusTargetNode node) {
        if (P0.h.isTrackFocusEnabled) {
            f(this.focusTargetNodes, node);
        } else {
            k(this.focusTargetNodesLegacy, node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5912m(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0, Function0<? extends E> function02, Function0<FocusTargetNode> function03) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        this.rootFocusStateFetcher = function02;
        this.activeFocusTargetNodeFetcher = function03;
    }

    private final <T> void f(X<T> x10, T t10) {
        if (x10.h(t10)) {
            l();
        }
    }

    private final <T> void k(List<T> list, T t10) {
        if (list.add(t10) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new a(this));
        }
    }

    public final void j() {
        l();
    }
}
