package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/i0;", "Landroidx/compose/ui/platform/e0;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5860i0 implements InterfaceC5848e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C5860i0 f52101b = new C5860i0();

    @Override // androidx.compose.ui.platform.InterfaceC5848e0
    public Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }

    private C5860i0() {
    }
}
