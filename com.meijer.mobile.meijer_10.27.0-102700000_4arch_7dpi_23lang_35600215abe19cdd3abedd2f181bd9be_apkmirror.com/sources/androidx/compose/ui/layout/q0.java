package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R1\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR1\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bRH\u0010$\u001a0\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0014\u0010'\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/layout/q0;", "", "Landroidx/compose/ui/layout/s0;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/s0;)V", "()V", "slotId", "Lkotlin/Function0;", "", "content", "Landroidx/compose/ui/layout/q0$a;", "i", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/q0$a;", "d", "a", "Landroidx/compose/ui/layout/s0;", "Landroidx/compose/ui/layout/E;", "b", "Landroidx/compose/ui/layout/E;", "_state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "g", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Landroidx/compose/runtime/k;", "e", "setCompositionContext", "Landroidx/compose/ui/layout/r0;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "f", "setMeasurePolicy", "h", "()Landroidx/compose/ui/layout/E;", "state", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f51133f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 slotReusePolicy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private E _state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<LayoutNode, q0, Unit> setRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<LayoutNode, AbstractC5727k, Unit> setCompositionContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<LayoutNode, Function2<? super r0, ? super H1.b, ? extends J>, Unit> setMeasurePolicy;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/q0$a;", "", "", "dispose", "()V", "", "index", "LH1/b;", "constraints", "c", "(IJ)V", "key", "Lkotlin/Function1;", "Landroidx/compose/ui/node/B0;", "Landroidx/compose/ui/node/A0;", "block", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "a", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        default int a() {
            return 0;
        }

        default void b(Object key, Function1<? super B0, ? extends A0> block) {
        }

        default void c(int index, long constraints) {
        }

        void dispose();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/k;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/k;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function2<LayoutNode, AbstractC5727k, Unit> {
        b() {
            super(2);
        }

        public final void a(LayoutNode layoutNode, AbstractC5727k abstractC5727k) {
            q0.this.h().H(abstractC5727k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, AbstractC5727k abstractC5727k) {
            a(layoutNode, abstractC5727k);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/r0;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "Lkotlin/ExtensionFunctionType;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function2;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function2<LayoutNode, Function2<? super r0, ? super H1.b, ? extends J>, Unit> {
        c() {
            super(2);
        }

        public final void a(LayoutNode layoutNode, Function2<? super r0, ? super H1.b, ? extends J> function2) {
            layoutNode.k(q0.this.h().u(function2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function2<? super r0, ? super H1.b, ? extends J> function2) {
            a(layoutNode, function2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/q0;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/q0;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function2<LayoutNode, q0, Unit> {
        d() {
            super(2);
        }

        public final void a(LayoutNode layoutNode, q0 q0Var) {
            q0 q0Var2 = q0.this;
            E subcompositionsState = layoutNode.getSubcompositionsState();
            if (subcompositionsState == null) {
                subcompositionsState = new E(layoutNode, q0.this.slotReusePolicy);
                layoutNode.L1(subcompositionsState);
            }
            q0Var2._state = subcompositionsState;
            q0.this.h().B();
            q0.this.h().I(q0.this.slotReusePolicy);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, q0 q0Var) {
            a(layoutNode, q0Var);
            return Unit.f142422a;
        }
    }

    public q0(s0 s0Var) {
        this.slotReusePolicy = s0Var;
        this.setRoot = new d();
        this.setCompositionContext = new b();
        this.setMeasurePolicy = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E h() {
        E e10 = this._state;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final Function2<LayoutNode, AbstractC5727k, Unit> e() {
        return this.setCompositionContext;
    }

    public final Function2<LayoutNode, Function2<? super r0, ? super H1.b, ? extends J>, Unit> f() {
        return this.setMeasurePolicy;
    }

    public final Function2<LayoutNode, q0, Unit> g() {
        return this.setRoot;
    }

    public final void d() {
        h().z();
    }

    public final a i(Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        return h().F(slotId, content);
    }

    public q0() {
        this(Q.f51044a);
    }
}
