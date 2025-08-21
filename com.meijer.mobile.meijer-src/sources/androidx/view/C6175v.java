package androidx.view;

import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$b;", "current", "next", "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)V", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6175v {
    public static final void a(InterfaceC6172s interfaceC6172s, AbstractC6165l.b current, AbstractC6165l.b next) {
        Intrinsics.j(current, "current");
        Intrinsics.j(next, "next");
        if (current == AbstractC6165l.b.f55500b && next == AbstractC6165l.b.f55499a) {
            throw new IllegalStateException(("State must be at least '" + AbstractC6165l.b.f55501c + "' to be moved to '" + next + "' in component " + interfaceC6172s).toString());
        }
        AbstractC6165l.b bVar = AbstractC6165l.b.f55499a;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC6172s).toString());
    }
}
