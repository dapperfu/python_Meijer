package com.scandit.datacapture.core.ui.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes11.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: m, reason: collision with root package name */
    private SpringForce f125992m;

    /* renamed from: n, reason: collision with root package name */
    private float f125993n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f125994o;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f125992m = null;
        this.f125993n = Float.MAX_VALUE;
        this.f125994o = false;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation
    final boolean a(long j10) {
        if (this.f125994o) {
            float f10 = this.f125993n;
            if (f10 != Float.MAX_VALUE) {
                this.f125992m.setFinalPosition(f10);
                this.f125993n = Float.MAX_VALUE;
            }
            this.f125980b = this.f125992m.getFinalPosition();
            this.f125979a = 0.0f;
            this.f125994o = false;
            return true;
        }
        if (this.f125993n != Float.MAX_VALUE) {
            this.f125992m.getFinalPosition();
            long j11 = j10 / 2;
            t tVarA = this.f125992m.a(this.f125980b, this.f125979a, j11);
            this.f125992m.setFinalPosition(this.f125993n);
            this.f125993n = Float.MAX_VALUE;
            t tVarA2 = this.f125992m.a(tVarA.f126016a, tVarA.f126017b, j11);
            this.f125980b = tVarA2.f126016a;
            this.f125979a = tVarA2.f126017b;
        } else {
            t tVarA3 = this.f125992m.a(this.f125980b, this.f125979a, j10);
            this.f125980b = tVarA3.f126016a;
            this.f125979a = tVarA3.f126017b;
        }
        float fMax = Math.max(this.f125980b, this.f125986h);
        this.f125980b = fMax;
        float fMin = Math.min(fMax, this.f125985g);
        this.f125980b = fMin;
        if (!this.f125992m.isAtEquilibrium(fMin, this.f125979a)) {
            return false;
        }
        this.f125980b = this.f125992m.getFinalPosition();
        this.f125979a = 0.0f;
        return true;
    }

    public boolean canSkipToEnd() {
        return this.f125992m.f125996b > 0.0d;
    }

    public SpringForce getSpring() {
        return this.f125992m;
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.f125992m = springForce;
        return this;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation
    public void start() {
        SpringForce springForce = this.f125992m;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.f125985g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.f125986h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        this.f125992m.a(a());
        super.start();
    }

    public void animateToFinalPosition(float f10) {
        if (isRunning()) {
            this.f125993n = f10;
            return;
        }
        if (this.f125992m == null) {
            this.f125992m = new SpringForce(f10);
        }
        this.f125992m.setFinalPosition(f10);
        start();
    }

    public void skipToEnd() {
        if (canSkipToEnd()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f125984f) {
                    this.f125994o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public <K> SpringAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k10, floatPropertyCompat);
        this.f125992m = null;
        this.f125993n = Float.MAX_VALUE;
        this.f125994o = false;
    }

    public <K> SpringAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat, float f10) {
        super(k10, floatPropertyCompat);
        this.f125992m = null;
        this.f125993n = Float.MAX_VALUE;
        this.f125994o = false;
        this.f125992m = new SpringForce(f10);
    }
}
