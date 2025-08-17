package a6;

import Q5.t;
import a6.f;
import androidx.compose.animation.j;
import b6.C6202b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"La6/b;", "", "Landroidx/compose/animation/j;", "defaultExitTransition", "", "La6/f$d;", "acceptedGestures", "Lkotlin/Function1;", "", "onGestureDetected", "<init>", "(Landroidx/compose/animation/j;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "", "x", "y", "velocity", "b", "(FFF)V", "gesture", "c", "(La6/f$d;)V", "a", "()Landroidx/compose/animation/j;", "Ljava/util/Set;", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/animation/j;", "currentExitTransition", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<f.d> acceptedGestures;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<f.d, Unit> onGestureDetected;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j currentExitTransition;

    /* JADX WARN: Multi-variable type inference failed */
    public b(j defaultExitTransition, Set<? extends f.d> acceptedGestures, Function1<? super f.d, Unit> onGestureDetected) {
        Intrinsics.j(defaultExitTransition, "defaultExitTransition");
        Intrinsics.j(acceptedGestures, "acceptedGestures");
        Intrinsics.j(onGestureDetected, "onGestureDetected");
        this.acceptedGestures = acceptedGestures;
        this.onGestureDetected = onGestureDetected;
        this.currentExitTransition = defaultExitTransition;
    }

    /* renamed from: a, reason: from getter */
    public final j getCurrentExitTransition() {
        return this.currentExitTransition;
    }

    public final void c(f.d gesture) {
        Intrinsics.j(gesture, "gesture");
        t.e("Services", "GestureTracker", "Gesture detected: " + gesture, new Object[0]);
        if (this.acceptedGestures.contains(gesture)) {
            this.currentExitTransition = C6202b.f59928a.c(gesture);
            this.onGestureDetected.invoke(gesture);
        }
    }

    public final void b(float x10, float y10, float velocity) {
        f.d dVar = null;
        if (Math.abs(x10) > Math.abs(y10)) {
            if (x10 > 0.0f && Math.abs(velocity) > 300.0f && Math.abs(x10) > 400.0f) {
                dVar = f.d.SWIPE_RIGHT;
            } else if (x10 < 0.0f && Math.abs(velocity) > 300.0f && Math.abs(x10) > 400.0f) {
                dVar = f.d.SWIPE_LEFT;
            }
        } else if (y10 > 0.0f && Math.abs(velocity) > 300.0f && Math.abs(y10) > 400.0f) {
            dVar = f.d.SWIPE_DOWN;
        } else if (y10 < 0.0f && Math.abs(velocity) > 300.0f && Math.abs(y10) > 400.0f) {
            dVar = f.d.SWIPE_UP;
        }
        if (dVar != null) {
            t.e("Services", "GestureTracker", "Gesture detected: " + dVar + " with " + x10 + ", " + y10 + ", " + velocity, new Object[0]);
            c(dVar);
        }
    }
}
