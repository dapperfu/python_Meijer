package ve;

import ae.C5597b;
import ae.d;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import be.C6230a;
import c2.c;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import ie.C14718a;
import oe.C16026c;
import oe.C16027d;
import re.C16758f;
import re.C16759g;
import re.C16760h;
import re.C16762j;

/* renamed from: ve.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17561a extends C16760h implements q.b, FSDraw {

    /* renamed from: R, reason: collision with root package name */
    private static final int f164665R = k.f44784L;

    /* renamed from: S, reason: collision with root package name */
    private static final int f164666S = C5597b.f44542s0;

    /* renamed from: A, reason: collision with root package name */
    private final Context f164667A;

    /* renamed from: B, reason: collision with root package name */
    private final Paint.FontMetrics f164668B;

    /* renamed from: C, reason: collision with root package name */
    private final q f164669C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f164670D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f164671E;

    /* renamed from: F, reason: collision with root package name */
    private int f164672F;

    /* renamed from: G, reason: collision with root package name */
    private int f164673G;

    /* renamed from: H, reason: collision with root package name */
    private int f164674H;

    /* renamed from: I, reason: collision with root package name */
    private int f164675I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f164676J;

    /* renamed from: K, reason: collision with root package name */
    private int f164677K;

    /* renamed from: L, reason: collision with root package name */
    private int f164678L;

    /* renamed from: M, reason: collision with root package name */
    private float f164679M;

    /* renamed from: N, reason: collision with root package name */
    private float f164680N;

    /* renamed from: O, reason: collision with root package name */
    private final float f164681O;

    /* renamed from: P, reason: collision with root package name */
    private float f164682P;

    /* renamed from: Q, reason: collision with root package name */
    private float f164683Q;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f164684z;

    /* renamed from: ve.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC2597a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC2597a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C17561a.this.D0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f164678L = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f164671E);
    }

    private float q0() {
        int i10;
        if (((this.f164671E.right - getBounds().right) - this.f164678L) - this.f164675I < 0) {
            i10 = ((this.f164671E.right - getBounds().right) - this.f164678L) - this.f164675I;
        } else {
            if (((this.f164671E.left - getBounds().left) - this.f164678L) + this.f164675I <= 0) {
                return 0.0f;
            }
            i10 = ((this.f164671E.left - getBounds().left) - this.f164678L) + this.f164675I;
        }
        return i10;
    }

    private float r0() {
        this.f164669C.g().getFontMetrics(this.f164668B);
        Paint.FontMetrics fontMetrics = this.f164668B;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public static C17561a t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        C17561a c17561a = new C17561a(context, attributeSet, i10, i11);
        c17561a.y0(attributeSet, i10, i11);
        return c17561a;
    }

    private void w0(Canvas canvas) {
        if (this.f164684z == null) {
            return;
        }
        int iS0 = (int) s0(getBounds());
        if (this.f164669C.e() != null) {
            this.f164669C.g().drawableState = getState();
            this.f164669C.n(this.f164667A);
            this.f164669C.g().setAlpha((int) (this.f164683Q * 255.0f));
        }
        CharSequence charSequence = this.f164684z;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iS0, this.f164669C.g());
    }

    private float x0() {
        CharSequence charSequence = this.f164684z;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f164669C.h(charSequence.toString());
    }

    private void y0(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = s.i(this.f164667A, attributeSet, l.f45398xa, i10, i11, new int[0]);
        this.f164677K = this.f164667A.getResources().getDimensionPixelSize(d.f44568D0);
        boolean z10 = typedArrayI.getBoolean(l.f44894Ga, true);
        this.f164676J = z10;
        if (z10) {
            setShapeAppearanceModel(E().v().s(u0()).m());
        } else {
            this.f164677K = 0;
        }
        B0(typedArrayI.getText(l.f44870Ea));
        C16027d c16027dG = C16026c.g(this.f164667A, typedArrayI, l.f45410ya);
        if (c16027dG != null && typedArrayI.hasValue(l.f45422za)) {
            c16027dG.k(C16026c.a(this.f164667A, typedArrayI, l.f45422za));
        }
        C0(c16027dG);
        b0(ColorStateList.valueOf(typedArrayI.getColor(l.f44882Fa, C14718a.i(c.k(C14718a.c(this.f164667A, R.attr.colorBackground, C17561a.class.getCanonicalName()), 229), c.k(C14718a.c(this.f164667A, C5597b.f44531n, C17561a.class.getCanonicalName()), 153)))));
        k0(ColorStateList.valueOf(C14718a.c(this.f164667A, C5597b.f44541s, C17561a.class.getCanonicalName())));
        this.f164672F = typedArrayI.getDimensionPixelSize(l.f44822Aa, 0);
        this.f164673G = typedArrayI.getDimensionPixelSize(l.f44846Ca, 0);
        this.f164674H = typedArrayI.getDimensionPixelSize(l.f44858Da, 0);
        this.f164675I = typedArrayI.getDimensionPixelSize(l.f44834Ba, 0);
        typedArrayI.recycle();
    }

    public void B0(CharSequence charSequence) {
        if (TextUtils.equals(this.f164684z, charSequence)) {
            return;
        }
        this.f164684z = charSequence;
        this.f164669C.m(true);
        invalidateSelf();
    }

    public void C0(C16027d c16027d) {
        this.f164669C.k(c16027d, this.f164667A);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f164669C.g().getTextSize(), this.f164674H);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f164672F * 2) + x0(), this.f164673G);
    }

    public void v0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f164670D);
    }

    public void z0(View view) {
        if (view == null) {
            return;
        }
        D0(view);
        view.addOnLayoutChangeListener(this.f164670D);
    }

    private C17561a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f164668B = new Paint.FontMetrics();
        q qVar = new q(this);
        this.f164669C = qVar;
        this.f164670D = new ViewOnLayoutChangeListenerC2597a();
        this.f164671E = new Rect();
        this.f164679M = 1.0f;
        this.f164680N = 1.0f;
        this.f164681O = 0.5f;
        this.f164682P = 0.5f;
        this.f164683Q = 1.0f;
        this.f164667A = context;
        qVar.g().density = context.getResources().getDisplayMetrics().density;
        qVar.g().setTextAlign(Paint.Align.CENTER);
    }

    private float s0(Rect rect) {
        return rect.centerY() - r0();
    }

    private C16758f u0() {
        float f10 = -q0();
        float fWidth = ((float) (getBounds().width() - (this.f164677K * Math.sqrt(2.0d)))) / 2.0f;
        return new C16762j(new C16759g(this.f164677K), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    public void A0(float f10) {
        this.f164682P = 1.2f;
        this.f164679M = f10;
        this.f164680N = f10;
        this.f164683Q = C6230a.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        invalidateSelf();
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fQ0 = q0();
        float f10 = (float) (-((this.f164677K * Math.sqrt(2.0d)) - this.f164677K));
        canvas.scale(this.f164679M, this.f164680N, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f164682P));
        canvas.translate(fQ0, f10);
        super.draw(canvas);
        w0(canvas);
        canvas.restore();
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f164676J) {
            setShapeAppearanceModel(E().v().s(u0()).m());
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
