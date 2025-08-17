package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/U;", "Landroidx/compose/ui/platform/Q1;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "a", "Landroid/view/ViewConfiguration;", "", "c", "()J", "longPressTimeoutMillis", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "g", "()F", "touchSlop", "d", "handwritingSlop", "f", "maximumFlingVelocity", "h", "handwritingGestureLineMargin", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U implements Q1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    @Override // androidx.compose.ui.platform.Q1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.Q1
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? X.f51973a.b(this.viewConfiguration) : super.d();
    }

    @Override // androidx.compose.ui.platform.Q1
    public float f() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.Q1
    public float g() {
        return this.viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.Q1
    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? X.f51973a.a(this.viewConfiguration) : super.h();
    }

    public U(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.Q1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.Q1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
