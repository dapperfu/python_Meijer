package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.fullstory.FS;

/* loaded from: classes.dex */
public final class f {

    private static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return FS.maybeWrapEdgeEffect(new EdgeEffect(context, attributeSet), context, attributeSet);
            } catch (Throwable unused) {
                return FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    static class a {
        static void a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f10, f11);
        }
        c(edgeEffect, f10, f11);
        return f10;
    }

    public static void c(EdgeEffect edgeEffect, float f10, float f11) {
        a.a(edgeEffect, f10, f11);
    }
}
