package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/R1;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "target", "", "a", "(Landroid/view/View;I)V", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public static final R1 f51906a = new R1();

    private R1() {
    }

    public final void a(View view, int target) {
        view.setOutlineAmbientShadowColor(target);
    }

    public final void b(View view, int target) {
        view.setOutlineSpotShadowColor(target);
    }
}
