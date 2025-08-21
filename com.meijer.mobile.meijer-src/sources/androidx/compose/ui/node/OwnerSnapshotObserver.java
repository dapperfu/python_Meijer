package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001c\u001a\u00020\u0004\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&¨\u00061"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "e", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "c", "g", "i", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/node/OwnerScope;", "T", "target", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "b", "()V", "a", "(Ljava/lang/Object;)V", "j", "k", "Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/k;", "observer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: i, reason: collision with root package name */
    public static final int f51557i = androidx.compose.runtime.snapshots.k.f50660l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.k observer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure = f.f51571f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure = g.f51572f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingSemantics = h.f51573f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout = b.f51567f;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier = c.f51568f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead = d.f51569f;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLookahead = e.f51570f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51566f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((OwnerScope) obj).e1());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f51567f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.q1(layoutNode, false, 1, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f51568f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.q1(layoutNode, false, 1, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f51569f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.m1(layoutNode, false, 1, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f51570f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.m1(layoutNode, false, 1, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f51571f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.o1(layoutNode, false, false, false, 7, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f51572f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                LayoutNode.s1(layoutNode, false, false, false, 7, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<LayoutNode, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f51573f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            a(layoutNode);
            return Unit.f143329a;
        }

        public final void a(LayoutNode layoutNode) {
            if (layoutNode.e1()) {
                layoutNode.E0();
            }
        }
    }

    public static /* synthetic */ void d(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.c(layoutNode, z10, function0);
    }

    public static /* synthetic */ void f(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.e(layoutNode, z10, function0);
    }

    public static /* synthetic */ void h(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.g(layoutNode, z10, function0);
    }

    public final void a(Object target) {
        this.observer.l(target);
    }

    public final void b() {
        this.observer.m(a.f51566f);
    }

    public final void c(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void e(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayout, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void g(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final void i(LayoutNode node, Function0<Unit> block) {
        observeReads$ui_release(node, this.onCommitAffectingSemantics, block);
    }

    public final void j() {
        this.observer.t();
    }

    public final void k() {
        this.observer.u();
        this.observer.k();
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T target, Function1<? super T, Unit> onChanged, Function0<Unit> block) {
        this.observer.p(target, onChanged, block);
    }

    public OwnerSnapshotObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.observer = new androidx.compose.runtime.snapshots.k(function1);
    }
}
