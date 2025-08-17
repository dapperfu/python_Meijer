package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/k0;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/i0;", "observerNode", "<init>", "(Landroidx/compose/ui/node/i0;)V", "a", "Landroidx/compose/ui/node/i0;", "b", "()Landroidx/compose/ui/node/i0;", "", "e1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 implements OwnerScope {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f51546c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final Function1<k0, Unit> f51547d = a.f51549f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 observerNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/k0;", "it", "", "a", "(Landroidx/compose/ui/node/k0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<k0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51549f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k0 k0Var) {
            a(k0Var);
            return Unit.f142422a;
        }

        public final void a(k0 k0Var) {
            if (k0Var.e1()) {
                k0Var.getObserverNode().B0();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/k0$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/k0;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.k0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1<k0, Unit> a() {
            return k0.f51547d;
        }
    }

    /* renamed from: b, reason: from getter */
    public final i0 getObserverNode() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return this.observerNode.getNode().getIsAttached();
    }

    public k0(i0 i0Var) {
        this.observerNode = i0Var;
    }
}
