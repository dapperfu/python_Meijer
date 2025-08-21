package de;

import Z.n0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* renamed from: de.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13668h {

    /* renamed from: a, reason: collision with root package name */
    private final n0<String, C13669i> f128363a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    private final n0<String, PropertyValuesHolder[]> f128364b = new n0<>();

    public static C13668h c(Context context, int i10) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            FS.log_w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static void a(C13668h c13668h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c13668h.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c13668h.i(objectAnimator.getPropertyName(), C13669i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private static C13668h d(List<Animator> list) {
        C13668h c13668h = new C13668h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(c13668h, list.get(i10));
        }
        return c13668h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13668h) {
            return this.f128363a.equals(((C13668h) obj).f128363a);
        }
        return false;
    }

    public long f() {
        int size = this.f128363a.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C13669i c13669iK = this.f128363a.k(i10);
            jMax = Math.max(jMax, c13669iK.c() + c13669iK.d());
        }
        return jMax;
    }

    public boolean g(String str) {
        return this.f128363a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f128364b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f128363a.hashCode();
    }

    public void i(String str, C13669i c13669i) {
        this.f128363a.put(str, c13669i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f128363a + "}\n";
    }

    public static C13668h b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return c(context, resourceId);
        }
        return null;
    }

    public C13669i e(String str) {
        if (g(str)) {
            return this.f128363a.get(str);
        }
        throw new IllegalArgumentException();
    }
}
