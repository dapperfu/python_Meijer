package d0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ld0/q;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "b", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "e", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "", "d", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "LH1/d;", "density", "a", "(Landroid/widget/EdgeEffect;FFLH1/d;)F", "delta", "f", "(Landroid/widget/EdgeEffect;F)V", "c", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13583q {

    /* renamed from: a, reason: collision with root package name */
    public static final C13583q f127793a = new C13583q();

    public final EdgeEffect b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C13570d.f127749a.a(context, null) : new C13587v(context);
    }

    public final float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C13570d.f127749a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void d(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float e(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C13570d.f127749a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void f(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C13587v) {
            ((C13587v) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }

    private C13583q() {
    }

    public final float a(EdgeEffect edgeEffect, float f10, float f11, H1.d dVar) {
        if (r.b(dVar, f10) <= c(edgeEffect) * f11) {
            d(edgeEffect, MathKt.d(f10));
            return f10;
        }
        return 0.0f;
    }
}
