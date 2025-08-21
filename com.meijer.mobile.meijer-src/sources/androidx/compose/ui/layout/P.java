package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/N;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "a", "(Landroidx/compose/ui/layout/N;)Landroidx/compose/ui/layout/MeasurePolicy;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {
    @PublishedApi
    public static final MeasurePolicy a(N n10) {
        return new MultiContentMeasurePolicyImpl(n10);
    }
}
