package N0;

import androidx.compose.runtime.snapshots.g;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"LN0/b;", "", "Landroidx/compose/runtime/snapshots/g;", "parent", "", "readonly", "LN0/a;", "e", "(Landroidx/compose/runtime/snapshots/g;Z)LN0/a;", "a", "snapshot", "observers", "", "c", "(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;LN0/a;)V", "b", "(Landroidx/compose/runtime/snapshots/g;)V", "f", "", "changed", "d", "(Landroidx/compose/runtime/snapshots/g;Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b {
    @Deprecated
    default void b(g snapshot) {
    }

    default void c(g snapshot, g parent, a observers) {
    }

    default void d(g snapshot, Set<? extends Object> changed) {
    }

    @Deprecated
    default a e(g parent, boolean readonly) {
        return null;
    }

    default a a(g parent, boolean readonly) {
        return e(parent, readonly);
    }

    default void f(g snapshot) {
        b(snapshot);
    }
}
