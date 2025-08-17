package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/d;", "lazyLayoutPrefetchState", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/d;)Landroidx/compose/ui/Modifier;", "LH1/b;", "a", "J", "ZeroConstraints", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final long f48840a = H1.c.b(0, 0, 0, 0, 5, null);

    public static final Modifier b(Modifier modifier, d dVar) {
        Modifier modifierThen;
        return (dVar == null || (modifierThen = modifier.then(new TraversablePrefetchStateModifierElement(dVar))) == null) ? modifier : modifierThen;
    }
}
