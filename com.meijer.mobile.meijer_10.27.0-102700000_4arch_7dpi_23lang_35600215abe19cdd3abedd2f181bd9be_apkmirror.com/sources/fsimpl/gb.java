package fsimpl;

import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class gb {

    /* renamed from: a, reason: collision with root package name */
    static final Field f132309a = fT.a(28, -1, AnimatedVectorDrawable.class, "mAnimatorSet");

    /* renamed from: b, reason: collision with root package name */
    static final Method f132310b = fT.a(28, 30, C14108fz.f132291a, "isInfinite", new Class[0]);

    /* renamed from: c, reason: collision with root package name */
    static final Field f132311c = fT.a(28, 30, C14108fz.f132292b, "mVectorDrawable");

    /* renamed from: d, reason: collision with root package name */
    static final Field f132312d = fT.a(-1, 31, VectorDrawable.class, "mTintFilter");

    /* renamed from: e, reason: collision with root package name */
    static final Field f132313e = fT.a(29, 30, VectorDrawable.class, "mBlendModeColorFilter");

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
            obj = f132309a.get(animatedVectorDrawable);
        } catch (Throwable th2) {
            Log.e("Error grabbing animator set from animated vector drawable");
        }
        if (obj instanceof AnimatorSet) {
            return ((AnimatorSet) obj).getTotalDuration() != -1;
        }
        if (C14108fz.f132291a != null && C14108fz.f132291a.isInstance(obj)) {
            return !((Boolean) f132310b.invoke(obj, new Object[0])).booleanValue();
        }
        return false;
    }

    public static ColorFilter c(Drawable drawable) {
        Field field;
        if (drawable instanceof VectorDrawable) {
            Field field2 = f132313e;
            return field2 != null ? (ColorFilter) fT.a(field2, drawable) : (ColorFilter) fT.a(f132312d, drawable);
        }
        if (!(drawable instanceof AnimatedVectorDrawable) || (field = f132311c) == null) {
            return null;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (C14108fz.f132292b.isInstance(constantState)) {
            return c((VectorDrawable) fT.a(field, constantState));
        }
        return null;
    }
}
