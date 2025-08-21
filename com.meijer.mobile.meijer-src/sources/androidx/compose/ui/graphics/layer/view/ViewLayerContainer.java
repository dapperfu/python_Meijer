package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import com.fullstory.instrumentation.FSDispatchDraw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/ViewLayerContainer;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewLayerContainer extends DrawChildContainer implements FSDispatchDraw {
    @Override // androidx.compose.ui.graphics.layer.view.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    public ViewLayerContainer(Context context) {
        super(context);
    }
}
