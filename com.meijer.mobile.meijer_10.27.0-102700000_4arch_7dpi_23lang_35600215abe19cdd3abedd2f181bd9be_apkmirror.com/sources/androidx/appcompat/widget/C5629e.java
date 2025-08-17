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
import i.C14575a;
import i.C14577c;
import i.C14578d;
import i.C14579e;
import j.C14791a;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5629e {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f46968b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C5629e f46969c;

    /* renamed from: a, reason: collision with root package name */
    private D f46970a;

    /* renamed from: androidx.appcompat.widget.e$a */
    class a implements D.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f46971a = {C14579e.f136587R, C14579e.f136585P, C14579e.f136589a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f46972b = {C14579e.f136603o, C14579e.f136571B, C14579e.f136608t, C14579e.f136604p, C14579e.f136605q, C14579e.f136607s, C14579e.f136606r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f46973c = {C14579e.f136584O, C14579e.f136586Q, C14579e.f136599k, C14579e.f136580K, C14579e.f136581L, C14579e.f136582M, C14579e.f136583N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f46974d = {C14579e.f136611w, C14579e.f136597i, C14579e.f136610v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f46975e = {C14579e.f136579J, C14579e.f136588S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f46976f = {C14579e.f136591c, C14579e.f136595g, C14579e.f136592d, C14579e.f136596h};

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
            int iC = H.c(context, C14575a.f136544w);
            return new ColorStateList(new int[][]{H.f46669b, H.f46672e, H.f46670c, H.f46676i}, new int[]{H.b(context, C14575a.f136542u), c2.c.g(iC, i10), c2.c.g(iC, i10), i10});
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = H.e(context, C14575a.f136547z);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = H.f46669b;
                iArr2[0] = H.b(context, C14575a.f136547z);
                iArr[1] = H.f46673f;
                iArr2[1] = H.c(context, C14575a.f136543v);
                iArr[2] = H.f46676i;
                iArr2[2] = H.c(context, C14575a.f136547z);
            } else {
                int[] iArr3 = H.f46669b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = H.f46673f;
                iArr2[1] = H.c(context, C14575a.f136543v);
                iArr[2] = H.f46676i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private ColorStateList i(Context context) {
            return h(context, H.c(context, C14575a.f136541t));
        }

        private ColorStateList j(Context context) {
            return h(context, H.c(context, C14575a.f136542u));
        }

        @Override // androidx.appcompat.widget.D.c
        public Drawable a(D d10, Context context, int i10) {
            if (i10 == C14579e.f136598j) {
                return new LayerDrawable(new Drawable[]{d10.i(context, C14579e.f136597i), d10.i(context, C14579e.f136599k)});
            }
            if (i10 == C14579e.f136613y) {
                return l(d10, context, C14578d.f136563g);
            }
            if (i10 == C14579e.f136612x) {
                return l(d10, context, C14578d.f136564h);
            }
            if (i10 == C14579e.f136614z) {
                return l(d10, context, C14578d.f136565i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == C14579e.f136601m) {
                return C14791a.a(context, C14577c.f136553e);
            }
            if (i10 == C14579e.f136578I) {
                return C14791a.a(context, C14577c.f136556h);
            }
            if (i10 == C14579e.f136577H) {
                return k(context);
            }
            if (i10 == C14579e.f136594f) {
                return j(context);
            }
            if (i10 == C14579e.f136590b) {
                return g(context);
            }
            if (i10 == C14579e.f136593e) {
                return i(context);
            }
            if (i10 == C14579e.f136573D || i10 == C14579e.f136574E) {
                return C14791a.a(context, C14577c.f136555g);
            }
            if (f(this.f46972b, i10)) {
                return H.e(context, C14575a.f136545x);
            }
            if (f(this.f46975e, i10)) {
                return C14791a.a(context, C14577c.f136552d);
            }
            if (f(this.f46976f, i10)) {
                return C14791a.a(context, C14577c.f136551c);
            }
            if (i10 == C14579e.f136570A) {
                return C14791a.a(context, C14577c.f136554f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == C14579e.f136577H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.D.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == C14579e.f136572C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), H.c(context, C14575a.f136545x), C5629e.f46968b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), H.c(context, C14575a.f136545x), C5629e.f46968b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), H.c(context, C14575a.f136543v), C5629e.f46968b);
                return true;
            }
            if (i10 != C14579e.f136613y && i10 != C14579e.f136612x && i10 != C14579e.f136614z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), H.b(context, C14575a.f136545x), C5629e.f46968b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), H.c(context, C14575a.f136543v), C5629e.f46968b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), H.c(context, C14575a.f136543v), C5629e.f46968b);
            return true;
        }

        a() {
        }

        private LayerDrawable l(D d10, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = d10.i(context, C14579e.f136575F);
            Drawable drawableI2 = d10.i(context, C14579e.f136576G);
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
                mode = C5629e.f46968b;
            }
            drawableMutate.setColorFilter(C5629e.e(i10, mode));
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
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C5629e.a()
                int[] r1 = r6.f46971a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = i.C14575a.f136545x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f46973c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = i.C14575a.f136543v
                goto L11
            L20:
                int[] r1 = r6.f46974d
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
                int r1 = i.C14579e.f136609u
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
                int r1 = i.C14579e.f136600l
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
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C5629e.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C5629e.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f46970a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f46970a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f46970a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f46970a.r(context);
    }

    public static synchronized C5629e b() {
        try {
            if (f46969c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46969c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return D.k(i10, mode);
    }

    public static synchronized void h() {
        if (f46969c == null) {
            C5629e c5629e = new C5629e();
            f46969c = c5629e;
            c5629e.f46970a = D.g();
            f46969c.f46970a.t(new a());
        }
    }

    static void i(Drawable drawable, K k10, int[] iArr) {
        D.v(drawable, k10, iArr);
    }
}
