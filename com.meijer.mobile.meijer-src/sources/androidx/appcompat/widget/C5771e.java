package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.D;
import i.C14578a;
import i.C14580c;
import i.C14581d;
import i.C14582e;
import j.C14879a;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5771e {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f47192b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C5771e f47193c;

    /* renamed from: a, reason: collision with root package name */
    private D f47194a;

    /* renamed from: androidx.appcompat.widget.e$a */
    class a implements D.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f47195a = {C14582e.f136344R, C14582e.f136342P, C14582e.f136346a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f47196b = {C14582e.f136360o, C14582e.f136328B, C14582e.f136365t, C14582e.f136361p, C14582e.f136362q, C14582e.f136364s, C14582e.f136363r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f47197c = {C14582e.f136341O, C14582e.f136343Q, C14582e.f136356k, C14582e.f136337K, C14582e.f136338L, C14582e.f136339M, C14582e.f136340N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f47198d = {C14582e.f136368w, C14582e.f136354i, C14582e.f136367v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f47199e = {C14582e.f136336J, C14582e.f136345S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f47200f = {C14582e.f136348c, C14582e.f136352g, C14582e.f136349d, C14582e.f136353h};

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = H.c(context, C14578a.f136301w);
            return new ColorStateList(new int[][]{H.f46893b, H.f46896e, H.f46894c, H.f46900i}, new int[]{H.b(context, C14578a.f136299u), c2.c.g(iC, i10), c2.c.g(iC, i10), i10});
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = H.e(context, C14578a.f136304z);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = H.f46893b;
                iArr2[0] = H.b(context, C14578a.f136304z);
                iArr[1] = H.f46897f;
                iArr2[1] = H.c(context, C14578a.f136300v);
                iArr[2] = H.f46900i;
                iArr2[2] = H.c(context, C14578a.f136304z);
            } else {
                int[] iArr3 = H.f46893b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = H.f46897f;
                iArr2[1] = H.c(context, C14578a.f136300v);
                iArr[2] = H.f46900i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private ColorStateList i(Context context) {
            return h(context, H.c(context, C14578a.f136298t));
        }

        private ColorStateList j(Context context) {
            return h(context, H.c(context, C14578a.f136299u));
        }

        @Override // androidx.appcompat.widget.D.c
        public Drawable a(D d10, Context context, int i10) {
            if (i10 == C14582e.f136355j) {
                return new LayerDrawable(new Drawable[]{d10.i(context, C14582e.f136354i), d10.i(context, C14582e.f136356k)});
            }
            if (i10 == C14582e.f136370y) {
                return l(d10, context, C14581d.f136320g);
            }
            if (i10 == C14582e.f136369x) {
                return l(d10, context, C14581d.f136321h);
            }
            if (i10 == C14582e.f136371z) {
                return l(d10, context, C14581d.f136322i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == C14582e.f136358m) {
                return C14879a.a(context, C14580c.f136310e);
            }
            if (i10 == C14582e.f136335I) {
                return C14879a.a(context, C14580c.f136313h);
            }
            if (i10 == C14582e.f136334H) {
                return k(context);
            }
            if (i10 == C14582e.f136351f) {
                return j(context);
            }
            if (i10 == C14582e.f136347b) {
                return g(context);
            }
            if (i10 == C14582e.f136350e) {
                return i(context);
            }
            if (i10 == C14582e.f136330D || i10 == C14582e.f136331E) {
                return C14879a.a(context, C14580c.f136312g);
            }
            if (f(this.f47196b, i10)) {
                return H.e(context, C14578a.f136302x);
            }
            if (f(this.f47199e, i10)) {
                return C14879a.a(context, C14580c.f136309d);
            }
            if (f(this.f47200f, i10)) {
                return C14879a.a(context, C14580c.f136308c);
            }
            if (i10 == C14582e.f136327A) {
                return C14879a.a(context, C14580c.f136311f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == C14582e.f136334H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == C14582e.f136329C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), H.c(context, C14578a.f136302x), C5771e.f47192b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), H.c(context, C14578a.f136302x), C5771e.f47192b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), H.c(context, C14578a.f136300v), C5771e.f47192b);
                return true;
            }
            if (i10 != C14582e.f136370y && i10 != C14582e.f136369x && i10 != C14582e.f136371z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), H.b(context, C14578a.f136302x), C5771e.f47192b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), H.c(context, C14578a.f136300v), C5771e.f47192b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), H.c(context, C14578a.f136300v), C5771e.f47192b);
            return true;
        }

        a() {
        }

        private LayerDrawable l(D d10, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = d10.i(context, C14582e.f136332F);
            Drawable drawableI2 = d10.i(context, C14582e.f136333G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C5771e.f47192b;
            }
            drawableMutate.setColorFilter(C5771e.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.D.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C5771e.a()
                int[] r1 = r6.f47195a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = i.C14578a.f136302x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f47197c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = i.C14578a.f136300v
                goto L11
            L20:
                int[] r1 = r6.f47198d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = i.C14582e.f136366u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = i.C14582e.f136357l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L65
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.H.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C5771e.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C5771e.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f47194a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f47194a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f47194a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f47194a.r(context);
    }

    public static synchronized C5771e b() {
        try {
            if (f47193c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f47193c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return D.k(i10, mode);
    }

    public static synchronized void h() {
        if (f47193c == null) {
            C5771e c5771e = new C5771e();
            f47193c = c5771e;
            c5771e.f47194a = D.g();
            f47193c.f47194a.t(new a());
        }
    }

    static void i(Drawable drawable, K k10, int[] iArr) {
        D.v(drawable, k10, iArr);
    }
}
