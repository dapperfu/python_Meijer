package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/layer/i;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "", "a", "(Landroid/view/RenderNode;)I", "target", "", "c", "(Landroid/view/RenderNode;I)V", "b", "d", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f50931a = new i();

    private i() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int target) {
        renderNode.setAmbientShadowColor(target);
    }

    public final void d(RenderNode renderNode, int target) {
        renderNode.setSpotShadowColor(target);
    }
}
