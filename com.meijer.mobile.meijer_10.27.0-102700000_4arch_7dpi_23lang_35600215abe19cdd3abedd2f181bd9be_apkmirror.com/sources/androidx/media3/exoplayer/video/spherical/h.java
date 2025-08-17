package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.b;

/* loaded from: classes.dex */
final class h extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, b.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f57265c;

    /* renamed from: d, reason: collision with root package name */
    private final float f57266d;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f57267e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f57263a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f57264b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    private volatile float f57268f = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.video.spherical.b.a
    public void a(float[] fArr, float f10) {
        this.f57268f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f57263a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f57265c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f57267e.onTouchEvent(motionEvent);
    }

    public h(Context context, a aVar, float f10) {
        this.f57265c = aVar;
        this.f57266d = f10;
        this.f57267e = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f57263a.x) / this.f57266d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f57263a;
        float f12 = (y10 - pointF.y) / this.f57266d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f57268f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f57264b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f57265c.b(this.f57264b);
        return true;
    }
}
