package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.B0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/B0;", "Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "o", "Landroidx/compose/foundation/lazy/layout/d;", "K2", "()Landroidx/compose/foundation/lazy/layout/d;", "M2", "", "p", "Ljava/lang/String;", "L2", "()Ljava/lang/String;", "traverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends Modifier.c implements B0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private d prefetchState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    /* renamed from: K2, reason: from getter */
    public final d getPrefetchState() {
        return this.prefetchState;
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: L2, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public final void M2(d dVar) {
        this.prefetchState = dVar;
    }

    public i(d dVar) {
        this.prefetchState = dVar;
    }
}
