package androidx.compose.ui.graphics.layer;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/layer/j;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "target", "", "b", "(Landroid/view/View;I)V", "c", "a", "(Landroid/view/View;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f50932a = new j();

    private j() {
    }

    public final void a(View view) {
        view.resetPivot();
    }

    public final void b(View view, int target) {
        view.setOutlineAmbientShadowColor(target);
    }

    public final void c(View view, int target) {
        view.setOutlineSpotShadowColor(target);
    }
}
