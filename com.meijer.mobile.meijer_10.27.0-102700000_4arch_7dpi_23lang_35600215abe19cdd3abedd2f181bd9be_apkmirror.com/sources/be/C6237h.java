package be;

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

/* renamed from: be.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6237h {

    /* renamed from: a, reason: collision with root package name */
    private final n0<String, C6238i> f60128a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    private final n0<String, PropertyValuesHolder[]> f60129b = new n0<>();

    public static C6237h c(Context context, int i10) throws Resources.NotFoundException {
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

    private static void a(C6237h c6237h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c6237h.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c6237h.i(objectAnimator.getPropertyName(), C6238i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private static C6237h d(List<Animator> list) {
        C6237h c6237h = new C6237h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(c6237h, list.get(i10));
        }
        return c6237h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6237h) {
            return this.f60128a.equals(((C6237h) obj).f60128a);
        }
        return false;
    }

    public long f() {
        int size = this.f60128a.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C6238i c6238iK = this.f60128a.k(i10);
            jMax = Math.max(jMax, c6238iK.c() + c6238iK.d());
        }
        return jMax;
    }

    public boolean g(String str) {
        return this.f60128a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f60129b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f60128a.hashCode();
    }

    public void i(String str, C6238i c6238i) {
        this.f60128a.put(str, c6238i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f60128a + "}\n";
    }

    public static C6237h b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return c(context, resourceId);
        }
        return null;
    }

    public C6238i e(String str) {
        if (g(str)) {
            return this.f60128a.get(str);
        }
        throw new IllegalArgumentException();
    }
}
