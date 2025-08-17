package androidx.view;

import android.window.BackEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0010B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/activity/b;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "", "toString", "()Ljava/lang/String;", "a", "F", "getTouchX", "()F", "b", "getTouchY", "c", "d", "I", "()I", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5614b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float touchX;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float touchY;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float progress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int swipeEdge;

    public C5614b(float f10, float f11, float f12, int i10) {
        this.touchX = f10;
        this.touchY = f11;
        this.progress = f12;
        this.swipeEdge = i10;
    }

    /* renamed from: a, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: b, reason: from getter */
    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5614b(BackEvent backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        C5613a c5613a = C5613a.f45702a;
        this(c5613a.c(backEvent), c5613a.d(backEvent), c5613a.a(backEvent), c5613a.b(backEvent));
    }
}
