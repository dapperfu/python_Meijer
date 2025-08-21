package de;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: de.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13669i {

    /* renamed from: a, reason: collision with root package name */
    private long f128365a;

    /* renamed from: b, reason: collision with root package name */
    private long f128366b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f128367c;

    /* renamed from: d, reason: collision with root package name */
    private int f128368d;

    /* renamed from: e, reason: collision with root package name */
    private int f128369e;

    public C13669i(long j10, long j11) {
        this.f128367c = null;
        this.f128368d = 0;
        this.f128369e = 1;
        this.f128365a = j10;
        this.f128366b = j11;
    }

    static C13669i b(ValueAnimator valueAnimator) {
        C13669i c13669i = new C13669i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        c13669i.f128368d = valueAnimator.getRepeatCount();
        c13669i.f128369e = valueAnimator.getRepeatMode();
        return c13669i;
    }

    public long c() {
        return this.f128365a;
    }

    public long d() {
        return this.f128366b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f128367c;
        return timeInterpolator != null ? timeInterpolator : C13661a.f128351b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13669i)) {
            return false;
        }
        C13669i c13669i = (C13669i) obj;
        if (c() == c13669i.c() && d() == c13669i.d() && g() == c13669i.g() && h() == c13669i.h()) {
            return e().getClass().equals(c13669i.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f128368d;
    }

    public int h() {
        return this.f128369e;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C13661a.f128352c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return C13661a.f128353d;
            }
            return interpolator;
        }
        return C13661a.f128351b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public C13669i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f128368d = 0;
        this.f128369e = 1;
        this.f128365a = j10;
        this.f128366b = j11;
        this.f128367c = timeInterpolator;
    }
}
