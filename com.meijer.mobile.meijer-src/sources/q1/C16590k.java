package q1;

import H1.n;
import H1.q;
import V0.w1;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import q1.ScrollCaptureCallbackC16582c;
import r1.C16822p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lq1/k;", "Lq1/c$a;", "<init>", "()V", "Landroid/view/View;", "view", "Lr1/p;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "", "d", "(Landroid/view/View;Lr1/p;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "a", "b", "", "<set-?>", "Landroidx/compose/runtime/l0;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16590k implements ScrollCaptureCallbackC16582c.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 scrollCaptureInProgress = t1.e(Boolean.FALSE, null, 2, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: q1.k$a */
    /* synthetic */ class a extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
        a(Object obj) {
            super(1, obj, D0.c.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((D0.c) this.f143708a).c(scrollCaptureCandidate);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            a(scrollCaptureCandidate);
            return Unit.f143329a;
        }
    }

    @Override // q1.ScrollCaptureCallbackC16582c.a
    public void a() {
        e(true);
    }

    @Override // q1.ScrollCaptureCallbackC16582c.a
    public void b() {
        e(false);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq1/l;", "it", "", "a", "(Lq1/l;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: q1.k$b */
    static final class b extends Lambda implements Function1<ScrollCaptureCandidate, Comparable<?>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f157800f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getDepth());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq1/l;", "it", "", "a", "(Lq1/l;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: q1.k$c */
    static final class c extends Lambda implements Function1<ScrollCaptureCandidate, Comparable<?>> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f157801f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().e());
        }
    }

    private final void e(boolean z10) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void d(View view, C16822p semanticsOwner, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        D0.c cVar = new D0.c(new ScrollCaptureCandidate[16], 0);
        m.e(semanticsOwner.d(), 0, new a(cVar), 2, null);
        cVar.A(ComparisonsKt.b(b.f157800f, c.f157801f));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (cVar.getSize() != 0 ? cVar.content[cVar.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ScrollCaptureCallbackC16582c scrollCaptureCallbackC16582c = new ScrollCaptureCallbackC16582c(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), C15784P.a(coroutineContext), this, view);
        Rect rectA = LayoutCoordinatesKt.a(scrollCaptureCandidate.getCoordinates());
        long jI = scrollCaptureCandidate.getViewportBoundsInWindow().i();
        ScrollCaptureTarget scrollCaptureTargetA = C16589j.a(view, w1.a(q.b(rectA)), new Point(n.k(jI), n.l(jI)), C16587h.a(scrollCaptureCallbackC16582c));
        scrollCaptureTargetA.setScrollBounds(w1.a(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetA);
    }
}
