package com.scandit.datacapture.core.ui.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes12.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: m, reason: collision with root package name */
    private SpringForce f126944m;

    /* renamed from: n, reason: collision with root package name */
    private float f126945n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f126946o;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f126944m = null;
        this.f126945n = Float.MAX_VALUE;
        this.f126946o = false;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation
    final boolean a(long j10) {
        if (this.f126946o) {
            float f10 = this.f126945n;
            if (f10 != Float.MAX_VALUE) {
                this.f126944m.setFinalPosition(f10);
                this.f126945n = Float.MAX_VALUE;
            }
            this.f126932b = this.f126944m.getFinalPosition();
            this.f126931a = 0.0f;
            this.f126946o = false;
            return true;
        }
        if (this.f126945n != Float.MAX_VALUE) {
            this.f126944m.getFinalPosition();
            long j11 = j10 / 2;
            t tVarA = this.f126944m.a(this.f126932b, this.f126931a, j11);
            this.f126944m.setFinalPosition(this.f126945n);
            this.f126945n = Float.MAX_VALUE;
            t tVarA2 = this.f126944m.a(tVarA.f126968a, tVarA.f126969b, j11);
            this.f126932b = tVarA2.f126968a;
            this.f126931a = tVarA2.f126969b;
        } else {
            t tVarA3 = this.f126944m.a(this.f126932b, this.f126931a, j10);
            this.f126932b = tVarA3.f126968a;
            this.f126931a = tVarA3.f126969b;
        }
        float fMax = Math.max(this.f126932b, this.f126938h);
        this.f126932b = fMax;
        float fMin = Math.min(fMax, this.f126937g);
        this.f126932b = fMin;
        if (!this.f126944m.isAtEquilibrium(fMin, this.f126931a)) {
            return false;
        }
        this.f126932b = this.f126944m.getFinalPosition();
        this.f126931a = 0.0f;
        return true;
    }

    public boolean canSkipToEnd() {
        return this.f126944m.f126948b > 0.0d;
    }

    public SpringForce getSpring() {
        return this.f126944m;
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.f126944m = springForce;
        return this;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation
    public void start() {
        SpringForce springForce = this.f126944m;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.f126937g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.f126938h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        this.f126944m.a(a());
        super.start();
    }

    public void animateToFinalPosition(float f10) {
        if (isRunning()) {
            this.f126945n = f10;
            return;
        }
        if (this.f126944m == null) {
            this.f126944m = new SpringForce(f10);
        }
        this.f126944m.setFinalPosition(f10);
        start();
    }

    public void skipToEnd() {
        if (canSkipToEnd()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f126936f) {
                    this.f126946o = true;
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
        this.f126944m = null;
        this.f126945n = Float.MAX_VALUE;
        this.f126946o = false;
    }

    public <K> SpringAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat, float f10) {
        super(k10, floatPropertyCompat);
        this.f126944m = null;
        this.f126945n = Float.MAX_VALUE;
        this.f126946o = false;
        this.f126944m = new SpringForce(f10);
    }
}
