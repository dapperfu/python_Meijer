package d0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ld0/u;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/B0;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onPositioned", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusedBounds", "K2", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "o", "Lkotlin/jvm/functions/Function1;", "getOnPositioned", "()Lkotlin/jvm/functions/Function1;", "setOnPositioned", "", "p", "Ljava/lang/Object;", "Y", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13453u extends Modifier.c implements B0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f127028r = 8;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super LayoutCoordinates, Unit> onPositioned;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld0/u$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void K2(LayoutCoordinates focusedBounds) {
        this.onPositioned.invoke(focusedBounds);
        C13453u c13453u = (C13453u) C0.b(this);
        if (c13453u != null) {
            c13453u.K2(focusedBounds);
        }
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: Y, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public C13453u(Function1<? super LayoutCoordinates, Unit> function1) {
        this.onPositioned = function1;
    }
}
