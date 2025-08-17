package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5782i;
import androidx.compose.ui.layout.InterfaceC5781h;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5804c0;
import androidx.compose.ui.node.C5810f0;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5812h;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusTargetElement;
import j1.C14832a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001KBe\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\"\u0010\u001aJ\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,RF\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00108\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u0010(R0\u0010\u0007\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u00020)2\u0006\u0010<\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010,R\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/focus/G;", "Landroidx/compose/ui/node/i0;", "Lk1/h;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/focus/M;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/E;", "Lkotlin/ParameterName;", "name", "previous", "current", "", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/focus/f;", "focusDirection", "", "W", "(I)Z", "B0", "()V", "t2", "u2", "Landroidx/compose/ui/focus/u;", "R2", "()Landroidx/compose/ui/focus/u;", "O2", "Z2", "P2", "previousState", "newState", "Q2", "(Landroidx/compose/ui/focus/E;Landroidx/compose/ui/focus/E;)V", "a3", "()Z", "Landroidx/compose/ui/focus/F;", "initialFocusState", "X2", "(Landroidx/compose/ui/focus/F;)V", "o", "Lkotlin/jvm/functions/Function2;", "p", "Lkotlin/jvm/functions/Function1;", "q", "Z", "isProcessingCustomExit", "r", "isProcessingCustomEnter", "s", "Landroidx/compose/ui/focus/F;", "committedFocusState", "t", "o2", "shouldAutoInvalidate", "value", "u", "I", "U2", "()I", "setFocusability-josRg5g", "(I)V", "T2", "()Landroidx/compose/ui/focus/F;", "b3", "focusState", "Landroidx/compose/ui/layout/h;", "S2", "()Landroidx/compose/ui/layout/h;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.c implements InterfaceC5812h, G, i0, k1.h {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Function2<E, E, Unit> onFocusChange;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Function1<FocusTargetNode, Unit> onDispatchEventsCompleted;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private F committedFocusState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int focusability;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "n", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "o", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FocusTargetElement extends Y<FocusTargetNode> implements FSComposeFocusTargetElement {

        /* renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f50611b = new FocusTargetElement();

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode b() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        private FocusTargetElement() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC5760c.values().length];
            try {
                iArr[EnumC5760c.f50641a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5760c.f50643c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5760c.f50642b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5760c.f50644d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[F.values().length];
            try {
                iArr2[F.f50576a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[F.f50578c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[F.f50577b.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[F.f50579d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<u> f50612f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50613g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<u> objectRef, FocusTargetNode focusTargetNode) {
            super(0);
            this.f50612f = objectRef;
            this.f50613g = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.u] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f50612f.f142835a = this.f50613g.R2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (FocusTargetNode.this.getNode().getIsAttached()) {
                FocusTargetNode.this.P2();
            }
        }
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function2, function1);
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? M.INSTANCE.a() : i10, (i11 & 2) != 0 ? null : function2, (i11 & 4) != 0 ? null : function1, null);
    }

    private static final boolean V2(FocusTargetNode focusTargetNode) {
        int iA = C5810f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14832a.b("visitSubtreeIf called on an unattached node");
        }
        D0.c cVar = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C5815k.c(cVar, focusTargetNode.getNode(), false);
        } else {
            cVar.c(child);
        }
        while (cVar.getSize() != 0) {
            Modifier.c cVar2 = (Modifier.c) cVar.u(cVar.getSize() - 1);
            if ((cVar2.getAggregateChildKindSet() & iA) != 0) {
                for (Modifier.c child2 = cVar2; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        Modifier.c cVarH = child2;
                        D0.c cVar3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.a3()) {
                                    int i10 = a.$EnumSwitchMapping$1[focusTargetNode2.d0().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5817m)) {
                                int i11 = 0;
                                for (Modifier.c delegate = ((AbstractC5817m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                            cVarH = C5815k.h(cVar3);
                        }
                    }
                }
            }
            C5815k.c(cVar, cVar2, false);
        }
        return false;
    }

    private static final boolean W2(FocusTargetNode focusTargetNode) {
        C5804c0 nodes;
        int iA = C5810f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeO = C5815k.o(focusTargetNode);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        Modifier.c cVarH = parent;
                        D0.c cVar = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.a3()) {
                                    int i10 = a.$EnumSwitchMapping$1[focusTargetNode2.d0().ordinal()];
                                    if (i10 != 1 && i10 != 2) {
                                        if (i10 == 3) {
                                            return true;
                                        }
                                        if (i10 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5817m)) {
                                int i11 = 0;
                                for (Modifier.c delegate = ((AbstractC5817m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            cVarH = C5815k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return false;
    }

    public static /* synthetic */ void Y2(FocusTargetNode focusTargetNode, F f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        focusTargetNode.X2(f10);
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        if (P0.h.isTrackFocusEnabled) {
            Z2();
            return;
        }
        F fD0 = d0();
        Z2();
        if (fD0 != d0()) {
            P2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$c] */
    public final void P2() {
        C5804c0 nodes;
        Function2<E, E, Unit> function2;
        F f10 = this.committedFocusState;
        if (f10 == null) {
            f10 = F.f50579d;
        }
        F fD0 = d0();
        if (f10 != fD0 && (function2 = this.onFocusChange) != null) {
            function2.invoke(f10, fD0);
        }
        int iA = C5810f0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        int iA2 = C5810f0.a(1024);
        Modifier.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c node2 = getNode();
        LayoutNode layoutNodeO = C5815k.o(this);
        loop0: while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            AbstractC5817m abstractC5817mH = node2;
                            D0.c cVar = null;
                            while (abstractC5817mH != 0) {
                                if (abstractC5817mH instanceof InterfaceC5766i) {
                                    InterfaceC5766i interfaceC5766i = (InterfaceC5766i) abstractC5817mH;
                                    interfaceC5766i.U(C5767j.a(interfaceC5766i));
                                } else if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                    Modifier.c delegate = abstractC5817mH.getDelegate();
                                    int i11 = 0;
                                    abstractC5817mH = abstractC5817mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC5817mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5817mH != 0) {
                                                    cVar.c(abstractC5817mH);
                                                    abstractC5817mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5817mH = abstractC5817mH;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC5817mH = C5815k.h(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            node2 = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        Function1<FocusTargetNode, Unit> function1 = this.onDispatchEventsCompleted;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$c] */
    public final void Q2(E previousState, E newState) {
        C5804c0 nodes;
        Function2<E, E, Unit> function2;
        s focusOwner = C5815k.p(this).getFocusOwner();
        FocusTargetNode focusTargetNodeH = focusOwner.h();
        if (!Intrinsics.e(previousState, newState) && (function2 = this.onFocusChange) != null) {
            function2.invoke(previousState, newState);
        }
        int iA = C5810f0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        int iA2 = C5810f0.a(1024);
        Modifier.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c node2 = getNode();
        LayoutNode layoutNodeO = C5815k.o(this);
        loop0: while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            AbstractC5817m abstractC5817mH = node2;
                            D0.c cVar = null;
                            while (abstractC5817mH != 0) {
                                if (abstractC5817mH instanceof InterfaceC5766i) {
                                    InterfaceC5766i interfaceC5766i = (InterfaceC5766i) abstractC5817mH;
                                    if (focusTargetNodeH == focusOwner.h()) {
                                        interfaceC5766i.U(newState);
                                    }
                                } else if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                    Modifier.c delegate = abstractC5817mH.getDelegate();
                                    int i11 = 0;
                                    abstractC5817mH = abstractC5817mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC5817mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5817mH != 0) {
                                                    cVar.c(abstractC5817mH);
                                                    abstractC5817mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5817mH = abstractC5817mH;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC5817mH = C5815k.h(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            node2 = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        Function1<FocusTargetNode, Unit> function1 = this.onDispatchEventsCompleted;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$c] */
    public final u R2() {
        C5804c0 nodes;
        v vVar = new v();
        vVar.g(M.d(getFocusability(), this));
        int iA = C5810f0.a(RecyclerView.m.FLAG_MOVED);
        int iA2 = C5810f0.a(1024);
        Modifier.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c node2 = getNode();
        LayoutNode layoutNodeO = C5815k.o(this);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return vVar;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            AbstractC5817m abstractC5817mH = node2;
                            D0.c cVar = null;
                            while (abstractC5817mH != 0) {
                                if (abstractC5817mH instanceof w) {
                                    ((w) abstractC5817mH).j1(vVar);
                                } else if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                    Modifier.c delegate = abstractC5817mH.getDelegate();
                                    int i11 = 0;
                                    abstractC5817mH = abstractC5817mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC5817mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5817mH != 0) {
                                                    cVar.c(abstractC5817mH);
                                                    abstractC5817mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5817mH = abstractC5817mH;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC5817mH = C5815k.h(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            node2 = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return vVar;
    }

    @Override // androidx.compose.ui.focus.G
    /* renamed from: T2, reason: merged with bridge method [inline-methods] */
    public F d0() {
        F fJ;
        C5804c0 nodes;
        if (!P0.h.isTrackFocusEnabled) {
            J jA = I.a(this);
            if (jA != null && (fJ = jA.j(this)) != null) {
                return fJ;
            }
            F f10 = this.committedFocusState;
            return f10 == null ? F.f50579d : f10;
        }
        if (!getIsAttached()) {
            return F.f50579d;
        }
        s focusOwner = C5815k.p(this).getFocusOwner();
        FocusTargetNode focusTargetNodeH = focusOwner.h();
        if (focusTargetNodeH == null) {
            return F.f50579d;
        }
        if (this == focusTargetNodeH) {
            return focusOwner.m() ? F.f50578c : F.f50576a;
        }
        if (focusTargetNodeH.getIsAttached()) {
            int iA = C5810f0.a(1024);
            if (!focusTargetNodeH.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c parent = focusTargetNodeH.getNode().getParent();
            LayoutNode layoutNodeO = C5815k.o(focusTargetNodeH);
            while (layoutNodeO != null) {
                if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            Modifier.c cVarH = parent;
                            D0.c cVar = null;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVarH)) {
                                        return F.f50577b;
                                    }
                                } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5817m)) {
                                    int i10 = 0;
                                    for (Modifier.c delegate = ((AbstractC5817m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                                cVarH = C5815k.h(cVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeO = layoutNodeO.getParent$ui_release();
                parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
            }
        }
        return F.f50579d;
    }

    /* renamed from: U2, reason: from getter */
    public int getFocusability() {
        return this.focusability;
    }

    @Override // androidx.compose.ui.focus.G
    public boolean W(int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zJ = false;
            if (!R2().getCanFocus()) {
                Trace.endSection();
                return false;
            }
            if (P0.h.isTrackFocusEnabled) {
                int i10 = a.$EnumSwitchMapping$0[K.i(this, focusDirection).ordinal()];
                if (i10 == 1) {
                    zJ = K.j(this);
                } else if (i10 == 2) {
                    zJ = true;
                } else if (i10 != 3 && i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                J jC = I.c(this);
                c cVar = new c();
                try {
                    if (jC.getOngoingTransaction()) {
                        jC.f();
                    }
                    jC.e();
                    jC.cancellationListener.c(cVar);
                    int i11 = a.$EnumSwitchMapping$0[K.i(this, focusDirection).ordinal()];
                    if (i11 == 1) {
                        zJ = K.j(this);
                    } else if (i11 == 2) {
                        zJ = true;
                    } else if (i11 != 3 && i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } finally {
                    jC.g();
                }
            }
            return zJ;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean a3() {
        return P0.h.isTrackFocusEnabled || this.committedFocusState != null;
    }

    public void b3(F f10) {
        if (P0.h.isTrackFocusEnabled) {
            return;
        }
        I.c(this).k(this, f10);
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        if (P0.h.isTrackFocusEnabled) {
            return;
        }
        I.b(this);
    }

    public final void O2() {
        F fJ = I.c(this).j(this);
        if (fJ != null) {
            this.committedFocusState = fJ;
        } else {
            C14832a.c("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    public final InterfaceC5781h S2() {
        return (InterfaceC5781h) q(C5782i.a());
    }

    public final void X2(F initialFocusState) {
        if (!a3()) {
            if (!P0.h.isTrackFocusEnabled) {
                J jC = I.c(this);
                try {
                    if (jC.getOngoingTransaction()) {
                        jC.f();
                    }
                    jC.e();
                    if (initialFocusState == null) {
                        if (W2(this) && V2(this)) {
                            initialFocusState = F.f50577b;
                        } else {
                            initialFocusState = F.f50579d;
                        }
                    }
                    b3(initialFocusState);
                    Unit unit = Unit.f142422a;
                    jC.g();
                    return;
                } catch (Throwable th2) {
                    jC.g();
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalStateException("Re-initializing focus target node.");
    }

    public final void Z2() {
        u uVar = null;
        if (!a3()) {
            Y2(this, null, 1, null);
        }
        int i10 = a.$EnumSwitchMapping$1[d0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            j0.a(this, new b(objectRef, this));
            T t10 = objectRef.f142835a;
            if (t10 == 0) {
                Intrinsics.y("focusProperties");
            } else {
                uVar = (u) t10;
            }
            if (!uVar.getCanFocus()) {
                C5815k.p(this).getFocusOwner().v(true);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        int i10 = a.$EnumSwitchMapping$1[d0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && !P0.h.isTrackFocusEnabled) {
                J jC = I.c(this);
                try {
                    if (jC.getOngoingTransaction()) {
                        jC.f();
                    }
                    jC.e();
                    b3(F.f50579d);
                    Unit unit = Unit.f142422a;
                    jC.g();
                } catch (Throwable th2) {
                    jC.g();
                    throw th2;
                }
            }
        } else {
            s focusOwner = C5815k.p(this).getFocusOwner();
            focusOwner.n(true, true, false, C5763f.INSTANCE.c());
            if (P0.h.isTrackFocusEnabled) {
                focusOwner.j();
            } else {
                I.b(this);
            }
        }
        this.committedFocusState = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i10, Function2<? super E, ? super E, Unit> function2, Function1<? super FocusTargetNode, Unit> function1) {
        this.onFocusChange = function2;
        this.onDispatchEventsCompleted = function1;
        this.focusability = i10;
    }
}
