package K8;

import J8.f;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f16462a;

    public a(float f10) {
        float f11 = 1.0f / f10;
        this.f16462a = f11;
        if (!Float.isNaN(f11) && !Float.isInfinite(f11)) {
        } else {
            throw new ArithmeticException("invalid value");
        }
    }

    public f a(MotionEvent motionEvent, long j10) {
        int actionIndex = motionEvent.getActionIndex();
        return new f(motionEvent.getX(actionIndex) * this.f16462a, this.f16462a * motionEvent.getY(actionIndex), j10, motionEvent.getEventTime());
    }
}
