package com.scandit.datacapture.core.ui.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;

    /* renamed from: a, reason: collision with root package name */
    float f125979a;

    /* renamed from: b, reason: collision with root package name */
    float f125980b;

    /* renamed from: c, reason: collision with root package name */
    boolean f125981c;

    /* renamed from: d, reason: collision with root package name */
    final Object f125982d;

    /* renamed from: e, reason: collision with root package name */
    final FloatPropertyCompat f125983e;

    /* renamed from: f, reason: collision with root package name */
    boolean f125984f;

    /* renamed from: g, reason: collision with root package name */
    float f125985g;

    /* renamed from: h, reason: collision with root package name */
    float f125986h;

    /* renamed from: i, reason: collision with root package name */
    private long f125987i;

    /* renamed from: j, reason: collision with root package name */
    private float f125988j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f125989k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f125990l;
    public static final ViewProperty TRANSLATION_X = new k();
    public static final ViewProperty TRANSLATION_Y = new l();
    public static final ViewProperty TRANSLATION_Z = new m();
    public static final ViewProperty SCALE_X = new n();
    public static final ViewProperty SCALE_Y = new o();
    public static final ViewProperty ROTATION = new p();
    public static final ViewProperty ROTATION_X = new q();
    public static final ViewProperty ROTATION_Y = new r();

    /* renamed from: X, reason: collision with root package name */
    public static final ViewProperty f125976X = new s();

    /* renamed from: Y, reason: collision with root package name */
    public static final ViewProperty f125977Y = new e();

    /* renamed from: Z, reason: collision with root package name */
    public static final ViewProperty f125978Z = new f();
    public static final ViewProperty ALPHA = new g();
    public static final ViewProperty SCROLL_X = new h();
    public static final ViewProperty SCROLL_Y = new i();

    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z10, float f10, float f11);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f10, float f11);
    }

    DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.f125979a = 0.0f;
        this.f125980b = Float.MAX_VALUE;
        this.f125981c = false;
        this.f125984f = false;
        this.f125985g = Float.MAX_VALUE;
        this.f125986h = -3.4028235E38f;
        this.f125987i = 0L;
        this.f125989k = new ArrayList();
        this.f125990l = new ArrayList();
        this.f125982d = null;
        this.f125983e = new j(floatValueHolder);
        this.f125988j = 1.0f;
    }

    private void a(boolean z10) {
        this.f125984f = false;
        ThreadLocal threadLocal = d.f126008g;
        if (threadLocal.get() == null) {
            threadLocal.set(new d());
        }
        d dVar = (d) threadLocal.get();
        dVar.f126009a.remove(this);
        int iIndexOf = dVar.f126010b.indexOf(this);
        if (iIndexOf >= 0) {
            dVar.f126010b.set(iIndexOf, null);
            dVar.f126014f = true;
        }
        this.f125987i = 0L;
        this.f125981c = false;
        for (int i10 = 0; i10 < this.f125989k.size(); i10++) {
            if (this.f125989k.get(i10) != null) {
                ((OnAnimationEndListener) this.f125989k.get(i10)).onAnimationEnd(this, z10, this.f125980b, this.f125979a);
            }
        }
        ArrayList arrayList = this.f125989k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    abstract boolean a(long j10);

    public T setMinimumVisibleChange(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f125988j = f10;
        return this;
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        ViewProperty(String str) {
            super(str);
        }
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.f125989k.contains(onAnimationEndListener)) {
            this.f125989k.add(onAnimationEndListener);
        }
        return this;
    }

    @Override // com.scandit.datacapture.core.ui.animation.b
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f125987i;
        if (j11 == 0) {
            this.f125987i = j10;
            this.f125983e.setValue(this.f125982d, this.f125980b);
            for (int i10 = 0; i10 < this.f125990l.size(); i10++) {
                if (this.f125990l.get(i10) != null) {
                    ((OnAnimationUpdateListener) this.f125990l.get(i10)).onAnimationUpdate(this, this.f125980b, this.f125979a);
                }
            }
            ArrayList arrayList = this.f125990l;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            return false;
        }
        this.f125987i = j10;
        boolean zA = a(j10 - j11);
        float fMin = Math.min(this.f125980b, this.f125985g);
        this.f125980b = fMin;
        float fMax = Math.max(fMin, this.f125986h);
        this.f125980b = fMax;
        this.f125983e.setValue(this.f125982d, fMax);
        for (int i11 = 0; i11 < this.f125990l.size(); i11++) {
            if (this.f125990l.get(i11) != null) {
                ((OnAnimationUpdateListener) this.f125990l.get(i11)).onAnimationUpdate(this, this.f125980b, this.f125979a);
            }
        }
        ArrayList arrayList2 = this.f125990l;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) == null) {
                arrayList2.remove(size2);
            }
        }
        if (zA) {
            a(false);
        }
        return zA;
    }

    public float getMinimumVisibleChange() {
        return this.f125988j;
    }

    public boolean isRunning() {
        return this.f125984f;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        ArrayList arrayList = this.f125989k;
        int iIndexOf = arrayList.indexOf(onAnimationEndListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        ArrayList arrayList = this.f125990l;
        int iIndexOf = arrayList.indexOf(onAnimationUpdateListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public T setMaxValue(float f10) {
        this.f125985g = f10;
        return this;
    }

    public T setMinValue(float f10) {
        this.f125986h = f10;
        return this;
    }

    public T setStartValue(float f10) {
        this.f125980b = f10;
        this.f125981c = true;
        return this;
    }

    public T setStartVelocity(float f10) {
        this.f125979a = f10;
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!isRunning()) {
            if (!this.f125990l.contains(onAnimationUpdateListener)) {
                this.f125990l.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void cancel() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f125984f) {
                a(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z10 = this.f125984f;
            if (!z10 && !z10) {
                this.f125984f = true;
                if (!this.f125981c) {
                    this.f125980b = this.f125983e.getValue(this.f125982d);
                }
                float f10 = this.f125980b;
                if (f10 <= this.f125985g && f10 >= this.f125986h) {
                    ThreadLocal threadLocal = d.f126008g;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new d());
                    }
                    d dVar = (d) threadLocal.get();
                    if (dVar.f126010b.size() == 0) {
                        if (dVar.f126012d == null) {
                            dVar.f126012d = new c(dVar.f126011c);
                        }
                        dVar.f126012d.a();
                    }
                    if (!dVar.f126010b.contains(this)) {
                        dVar.f126010b.add(this);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.f125979a = 0.0f;
        this.f125980b = Float.MAX_VALUE;
        this.f125981c = false;
        this.f125984f = false;
        this.f125985g = Float.MAX_VALUE;
        this.f125986h = -3.4028235E38f;
        this.f125987i = 0L;
        this.f125989k = new ArrayList();
        this.f125990l = new ArrayList();
        this.f125982d = obj;
        this.f125983e = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat == ALPHA) {
                this.f125988j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f125988j = 1.0f;
                return;
            } else {
                this.f125988j = 0.00390625f;
                return;
            }
        }
        this.f125988j = 0.1f;
    }

    final float a() {
        return this.f125988j * 0.75f;
    }
}
