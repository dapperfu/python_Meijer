package N4;

import N4.z;
import androidx.view.AbstractC5985A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LN4/A;", "LN4/z;", "Landroidx/lifecycle/A;", "LN4/z$b;", "state", "Lcom/google/common/util/concurrent/q;", "LN4/z$b$c;", "future", "<init>", "(Landroidx/lifecycle/A;Lcom/google/common/util/concurrent/q;)V", "c", "Landroidx/lifecycle/A;", "d", "Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class A implements z {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5985A<z.b> state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.google.common.util.concurrent.q<z.b.c> future;

    public A(AbstractC5985A<z.b> state, com.google.common.util.concurrent.q<z.b.c> future) {
        Intrinsics.j(state, "state");
        Intrinsics.j(future, "future");
        this.state = state;
        this.future = future;
    }
}
