package fsimpl;

import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class gb {

    /* renamed from: a, reason: collision with root package name */
    static final Field f133559a = fT.a(28, -1, AnimatedVectorDrawable.class, "mAnimatorSet");

    /* renamed from: b, reason: collision with root package name */
    static final Method f133560b = fT.a(28, 30, C14233fz.f133541a, "isInfinite", new Class[0]);

    /* renamed from: c, reason: collision with root package name */
    static final Field f133561c = fT.a(28, 30, C14233fz.f133542b, "mVectorDrawable");

    /* renamed from: d, reason: collision with root package name */
    static final Field f133562d = fT.a(-1, 31, VectorDrawable.class, "mTintFilter");

    /* renamed from: e, reason: collision with root package name */
    static final Field f133563e = fT.a(29, 30, VectorDrawable.class, "mBlendModeColorFilter");

    public static boolean a(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof AnimatedVectorDrawable);
    }

    public static boolean b(Drawable drawable) {
        Object obj;
        if (!(drawable instanceof AnimatedVectorDrawable)) {
            return false;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
        if (!animatedVectorDrawable.isRunning()) {
            return false;
        }
        try {
            obj = f133559a.get(animatedVectorDrawable);
        } catch (Throwable th2) {
            Log.e("Error grabbing animator set from animated vector drawable");
        }
        if (obj instanceof AnimatorSet) {
            return ((AnimatorSet) obj).getTotalDuration() != -1;
        }
        if (C14233fz.f133541a != null && C14233fz.f133541a.isInstance(obj)) {
            return !((Boolean) f133560b.invoke(obj, new Object[0])).booleanValue();
        }
        return false;
    }

    public static ColorFilter c(Drawable drawable) {
        Field field;
        if (drawable instanceof VectorDrawable) {
            Field field2 = f133563e;
            return field2 != null ? (ColorFilter) fT.a(field2, drawable) : (ColorFilter) fT.a(f133562d, drawable);
        }
        if (!(drawable instanceof AnimatedVectorDrawable) || (field = f133561c) == null) {
            return null;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (C14233fz.f133542b.isInstance(constantState)) {
            return c((VectorDrawable) fT.a(field, constantState));
        }
        return null;
    }
}
