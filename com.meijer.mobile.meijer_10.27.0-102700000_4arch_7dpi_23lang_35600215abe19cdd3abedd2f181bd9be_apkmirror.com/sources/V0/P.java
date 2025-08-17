package V0;

import V0.F1;
import V0.G1;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u0017*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\r\u001a\u0017\u0010\u001e\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a\u001f\u0010\u001f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a\u0017\u0010!\u001a\u00020 *\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\r\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b%\u0010\"\u001a\"\u0010&\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\r\u001a\u0017\u0010'\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b'\u0010\u0014\u001a\u001f\u0010(\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b(\u0010\u0016\u001a\u0017\u0010*\u001a\u00020)*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b*\u0010\"\u001a\"\u0010+\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\r\u001a'\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u000f\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102*\n\u00103\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"LV0/o1;", "a", "()LV0/o1;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)LV0/o1;", "j", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "LV0/c0;", "mode", "", "l", "(Landroid/graphics/Paint;I)V", "LV0/r0;", "value", "n", "(Landroid/graphics/Paint;LV0/r0;)V", "", "c", "(Landroid/graphics/Paint;)F", "k", "(Landroid/graphics/Paint;F)V", "LV0/q0;", "d", "(Landroid/graphics/Paint;)J", "m", "(Landroid/graphics/Paint;J)V", "LV0/p1;", "v", "i", "u", "LV0/F1;", "f", "(Landroid/graphics/Paint;)I", "r", "LV0/G1;", "g", "s", "h", "t", "LV0/b1;", "e", "o", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "q", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "LV0/r1;", "p", "(Landroid/graphics/Paint;LV0/r1;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final o1 a() {
        return new O();
    }

    public static final o1 b(Paint paint) {
        return new O(paint);
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            N1.f36422a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(D.b(i10)));
        }
    }

    public static final void n(Paint paint, C5347r0 c5347r0) {
        paint.setColorFilter(c5347r0 != null ? E.d(c5347r0) : null);
    }

    public static final void o(Paint paint, int i10) {
        paint.setFilterBitmap(!C5304b1.d(i10, C5304b1.INSTANCE.b()));
    }

    public static final void p(Paint paint, r1 r1Var) {
        S s10 = (S) r1Var;
        paint.setPathEffect(s10 != null ? s10.getNativePathEffect() : null);
    }

    public static final void r(Paint paint, int i10) {
        F1.Companion companion = F1.INSTANCE;
        paint.setStrokeCap(F1.e(i10, companion.c()) ? Paint.Cap.SQUARE : F1.e(i10, companion.b()) ? Paint.Cap.ROUND : F1.e(i10, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void s(Paint paint, int i10) {
        G1.Companion companion = G1.INSTANCE;
        paint.setStrokeJoin(G1.e(i10, companion.b()) ? Paint.Join.MITER : G1.e(i10, companion.a()) ? Paint.Join.BEVEL : G1.e(i10, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void v(Paint paint, int i10) {
        paint.setStyle(p1.d(i10, p1.INSTANCE.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return C5349s0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        if (!paint.isFilterBitmap()) {
            return C5304b1.INSTANCE.b();
        }
        return C5304b1.INSTANCE.a();
    }

    public static final int f(Paint paint) {
        int i10;
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i10 = -1;
        } else {
            i10 = a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return F1.INSTANCE.a();
                }
                return F1.INSTANCE.c();
            }
            return F1.INSTANCE.b();
        }
        return F1.INSTANCE.a();
    }

    public static final int g(Paint paint) {
        int i10;
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i10 = -1;
        } else {
            i10 = a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return G1.INSTANCE.b();
                }
                return G1.INSTANCE.c();
            }
            return G1.INSTANCE.a();
        }
        return G1.INSTANCE.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void m(Paint paint, long j10) {
        paint.setColor(C5349s0.j(j10));
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }
}
