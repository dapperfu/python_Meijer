package be;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: be.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6238i {

    /* renamed from: a, reason: collision with root package name */
    private long f60130a;

    /* renamed from: b, reason: collision with root package name */
    private long f60131b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f60132c;

    /* renamed from: d, reason: collision with root package name */
    private int f60133d;

    /* renamed from: e, reason: collision with root package name */
    private int f60134e;

    public C6238i(long j10, long j11) {
        this.f60132c = null;
        this.f60133d = 0;
        this.f60134e = 1;
        this.f60130a = j10;
        this.f60131b = j11;
    }

    static C6238i b(ValueAnimator valueAnimator) {
        C6238i c6238i = new C6238i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        c6238i.f60133d = valueAnimator.getRepeatCount();
        c6238i.f60134e = valueAnimator.getRepeatMode();
        return c6238i;
    }

    public long c() {
        return this.f60130a;
    }

    public long d() {
        return this.f60131b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f60132c;
        return timeInterpolator != null ? timeInterpolator : C6230a.f60116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6238i)) {
            return false;
        }
        C6238i c6238i = (C6238i) obj;
        if (c() == c6238i.c() && d() == c6238i.d() && g() == c6238i.g() && h() == c6238i.h()) {
            return e().getClass().equals(c6238i.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f60133d;
    }

    public int h() {
        return this.f60134e;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C6230a.f60117c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return C6230a.f60118d;
            }
            return interpolator;
        }
        return C6230a.f60116b;
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

    public C6238i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f60133d = 0;
        this.f60134e = 1;
        this.f60130a = j10;
        this.f60131b = j11;
        this.f60132c = timeInterpolator;
    }
}
