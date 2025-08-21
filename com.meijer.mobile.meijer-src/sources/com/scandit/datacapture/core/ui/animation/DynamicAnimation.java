package com.scandit.datacapture.core.ui.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;

    /* renamed from: a, reason: collision with root package name */
    float f126931a;

    /* renamed from: b, reason: collision with root package name */
    float f126932b;

    /* renamed from: c, reason: collision with root package name */
    boolean f126933c;

    /* renamed from: d, reason: collision with root package name */
    final Object f126934d;

    /* renamed from: e, reason: collision with root package name */
    final FloatPropertyCompat f126935e;

    /* renamed from: f, reason: collision with root package name */
    boolean f126936f;

    /* renamed from: g, reason: collision with root package name */
    float f126937g;

    /* renamed from: h, reason: collision with root package name */
    float f126938h;

    /* renamed from: i, reason: collision with root package name */
    private long f126939i;

    /* renamed from: j, reason: collision with root package name */
    private float f126940j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f126941k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f126942l;
    public static final ViewProperty TRANSLATION_X = new k();
    public static final ViewProperty TRANSLATION_Y = new l();
    public static final ViewProperty TRANSLATION_Z = new m();
    public static final ViewProperty SCALE_X = new n();
    public static final ViewProperty SCALE_Y = new o();
    public static final ViewProperty ROTATION = new p();
    public static final ViewProperty ROTATION_X = new q();
    public static final ViewProperty ROTATION_Y = new r();

    /* renamed from: X, reason: collision with root package name */
    public static final ViewProperty f126928X = new s();

    /* renamed from: Y, reason: collision with root package name */
    public static final ViewProperty f126929Y = new e();

    /* renamed from: Z, reason: collision with root package name */
    public static final ViewProperty f126930Z = new f();
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
        this.f126931a = 0.0f;
        this.f126932b = Float.MAX_VALUE;
        this.f126933c = false;
        this.f126936f = false;
        this.f126937g = Float.MAX_VALUE;
        this.f126938h = -3.4028235E38f;
        this.f126939i = 0L;
        this.f126941k = new ArrayList();
        this.f126942l = new ArrayList();
        this.f126934d = null;
        this.f126935e = new j(floatValueHolder);
        this.f126940j = 1.0f;
    }

    private void a(boolean z10) {
        this.f126936f = false;
        ThreadLocal threadLocal = d.f126960g;
        if (threadLocal.get() == null) {
            threadLocal.set(new d());
        }
        d dVar = (d) threadLocal.get();
        dVar.f126961a.remove(this);
        int iIndexOf = dVar.f126962b.indexOf(this);
        if (iIndexOf >= 0) {
            dVar.f126962b.set(iIndexOf, null);
            dVar.f126966f = true;
        }
        this.f126939i = 0L;
        this.f126933c = false;
        for (int i10 = 0; i10 < this.f126941k.size(); i10++) {
            if (this.f126941k.get(i10) != null) {
                ((OnAnimationEndListener) this.f126941k.get(i10)).onAnimationEnd(this, z10, this.f126932b, this.f126931a);
            }
        }
        ArrayList arrayList = this.f126941k;
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
        this.f126940j = f10;
        return this;
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        ViewProperty(String str) {
            super(str);
        }
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.f126941k.contains(onAnimationEndListener)) {
            this.f126941k.add(onAnimationEndListener);
        }
        return this;
    }

    @Override // com.scandit.datacapture.core.ui.animation.b
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f126939i;
        if (j11 == 0) {
            this.f126939i = j10;
            this.f126935e.setValue(this.f126934d, this.f126932b);
            for (int i10 = 0; i10 < this.f126942l.size(); i10++) {
                if (this.f126942l.get(i10) != null) {
                    ((OnAnimationUpdateListener) this.f126942l.get(i10)).onAnimationUpdate(this, this.f126932b, this.f126931a);
                }
            }
            ArrayList arrayList = this.f126942l;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            return false;
        }
        this.f126939i = j10;
        boolean zA = a(j10 - j11);
        float fMin = Math.min(this.f126932b, this.f126937g);
        this.f126932b = fMin;
        float fMax = Math.max(fMin, this.f126938h);
        this.f126932b = fMax;
        this.f126935e.setValue(this.f126934d, fMax);
        for (int i11 = 0; i11 < this.f126942l.size(); i11++) {
            if (this.f126942l.get(i11) != null) {
                ((OnAnimationUpdateListener) this.f126942l.get(i11)).onAnimationUpdate(this, this.f126932b, this.f126931a);
            }
        }
        ArrayList arrayList2 = this.f126942l;
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
        return this.f126940j;
    }

    public boolean isRunning() {
        return this.f126936f;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        ArrayList arrayList = this.f126941k;
        int iIndexOf = arrayList.indexOf(onAnimationEndListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        ArrayList arrayList = this.f126942l;
        int iIndexOf = arrayList.indexOf(onAnimationUpdateListener);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public T setMaxValue(float f10) {
        this.f126937g = f10;
        return this;
    }

    public T setMinValue(float f10) {
        this.f126938h = f10;
        return this;
    }

    public T setStartValue(float f10) {
        this.f126932b = f10;
        this.f126933c = true;
        return this;
    }

    public T setStartVelocity(float f10) {
        this.f126931a = f10;
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!isRunning()) {
            if (!this.f126942l.contains(onAnimationUpdateListener)) {
                this.f126942l.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void cancel() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f126936f) {
                a(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z10 = this.f126936f;
            if (!z10 && !z10) {
                this.f126936f = true;
                if (!this.f126933c) {
                    this.f126932b = this.f126935e.getValue(this.f126934d);
                }
                float f10 = this.f126932b;
                if (f10 <= this.f126937g && f10 >= this.f126938h) {
                    ThreadLocal threadLocal = d.f126960g;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new d());
                    }
                    d dVar = (d) threadLocal.get();
                    if (dVar.f126962b.size() == 0) {
                        if (dVar.f126964d == null) {
                            dVar.f126964d = new c(dVar.f126963c);
                        }
                        dVar.f126964d.a();
                    }
                    if (!dVar.f126962b.contains(this)) {
                        dVar.f126962b.add(this);
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
        this.f126931a = 0.0f;
        this.f126932b = Float.MAX_VALUE;
        this.f126933c = false;
        this.f126936f = false;
        this.f126937g = Float.MAX_VALUE;
        this.f126938h = -3.4028235E38f;
        this.f126939i = 0L;
        this.f126941k = new ArrayList();
        this.f126942l = new ArrayList();
        this.f126934d = obj;
        this.f126935e = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat == ALPHA) {
                this.f126940j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f126940j = 1.0f;
                return;
            } else {
                this.f126940j = 0.00390625f;
                return;
            }
        }
        this.f126940j = 0.1f;
    }

    final float a() {
        return this.f126940j * 0.75f;
    }
}
