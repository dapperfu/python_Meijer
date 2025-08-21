package d0;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Ld0/v;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deltaDistance", "displacement", "", "onPull", "(FF)V", "(F)V", "onRelease", "()V", "", "velocity", "onAbsorb", "(I)V", "delta", "a", "F", "oppositeReleaseDeltaThreshold", "b", "oppositeReleaseDelta", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13587v extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float oppositeReleaseDeltaThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float oppositeReleaseDelta;

    @Override // android.widget.EdgeEffect
    public boolean draw(Canvas canvas) {
        if (FS.isFullStoryCanvas(canvas)) {
            return false;
        }
        return super.draw(canvas);
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int velocity) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(velocity);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance, float displacement) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(deltaDistance, displacement);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void a(float delta) {
        float f10 = this.oppositeReleaseDelta + delta;
        this.oppositeReleaseDelta = f10;
        if (Math.abs(f10) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    public C13587v(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = H1.a.a(context).I1(H1.h.p(1));
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(deltaDistance);
    }
}
