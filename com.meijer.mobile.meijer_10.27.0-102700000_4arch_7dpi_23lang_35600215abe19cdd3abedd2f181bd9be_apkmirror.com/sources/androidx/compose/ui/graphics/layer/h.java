package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/h;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "", "a", "(Landroid/view/RenderNode;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f50930a = new h();

    private h() {
    }

    public final void a(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
