package xe;

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
import c2.c;
import ce.C6503b;
import ce.d;
import ce.k;
import ce.l;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import de.C13661a;
import ke.C15121a;
import qe.C16634c;
import qe.C16635d;
import te.C17232f;
import te.C17233g;
import te.C17234h;
import te.C17236j;

/* renamed from: xe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18173a extends C17234h implements q.b, FSDraw {

    /* renamed from: R, reason: collision with root package name */
    private static final int f170701R = k.f61799L;

    /* renamed from: S, reason: collision with root package name */
    private static final int f170702S = C6503b.f61557s0;

    /* renamed from: A, reason: collision with root package name */
    private final Context f170703A;

    /* renamed from: B, reason: collision with root package name */
    private final Paint.FontMetrics f170704B;

    /* renamed from: C, reason: collision with root package name */
    private final q f170705C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f170706D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f170707E;

    /* renamed from: F, reason: collision with root package name */
    private int f170708F;

    /* renamed from: G, reason: collision with root package name */
    private int f170709G;

    /* renamed from: H, reason: collision with root package name */
    private int f170710H;

    /* renamed from: I, reason: collision with root package name */
    private int f170711I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f170712J;

    /* renamed from: K, reason: collision with root package name */
    private int f170713K;

    /* renamed from: L, reason: collision with root package name */
    private int f170714L;

    /* renamed from: M, reason: collision with root package name */
    private float f170715M;

    /* renamed from: N, reason: collision with root package name */
    private float f170716N;

    /* renamed from: O, reason: collision with root package name */
    private final float f170717O;

    /* renamed from: P, reason: collision with root package name */
    private float f170718P;

    /* renamed from: Q, reason: collision with root package name */
    private float f170719Q;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f170720z;

    /* renamed from: xe.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC2740a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC2740a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C18173a.this.D0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f170714L = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f170707E);
    }

    private float q0() {
        int i10;
        if (((this.f170707E.right - getBounds().right) - this.f170714L) - this.f170711I < 0) {
            i10 = ((this.f170707E.right - getBounds().right) - this.f170714L) - this.f170711I;
        } else {
            if (((this.f170707E.left - getBounds().left) - this.f170714L) + this.f170711I <= 0) {
                return 0.0f;
            }
            i10 = ((this.f170707E.left - getBounds().left) - this.f170714L) + this.f170711I;
        }
        return i10;
    }

    private float r0() {
        this.f170705C.g().getFontMetrics(this.f170704B);
        Paint.FontMetrics fontMetrics = this.f170704B;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public static C18173a t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        C18173a c18173a = new C18173a(context, attributeSet, i10, i11);
        c18173a.y0(attributeSet, i10, i11);
        return c18173a;
    }

    private void w0(Canvas canvas) {
        if (this.f170720z == null) {
            return;
        }
        int iS0 = (int) s0(getBounds());
        if (this.f170705C.e() != null) {
            this.f170705C.g().drawableState = getState();
            this.f170705C.n(this.f170703A);
            this.f170705C.g().setAlpha((int) (this.f170719Q * 255.0f));
        }
        CharSequence charSequence = this.f170720z;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iS0, this.f170705C.g());
    }

    private float x0() {
        CharSequence charSequence = this.f170720z;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f170705C.h(charSequence.toString());
    }

    private void y0(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = s.i(this.f170703A, attributeSet, l.f62413xa, i10, i11, new int[0]);
        this.f170713K = this.f170703A.getResources().getDimensionPixelSize(d.f61583D0);
        boolean z10 = typedArrayI.getBoolean(l.f61909Ga, true);
        this.f170712J = z10;
        if (z10) {
            setShapeAppearanceModel(E().v().s(u0()).m());
        } else {
            this.f170713K = 0;
        }
        B0(typedArrayI.getText(l.f61885Ea));
        C16635d c16635dG = C16634c.g(this.f170703A, typedArrayI, l.f62425ya);
        if (c16635dG != null && typedArrayI.hasValue(l.f62437za)) {
            c16635dG.k(C16634c.a(this.f170703A, typedArrayI, l.f62437za));
        }
        C0(c16635dG);
        b0(ColorStateList.valueOf(typedArrayI.getColor(l.f61897Fa, C15121a.i(c.k(C15121a.c(this.f170703A, R.attr.colorBackground, C18173a.class.getCanonicalName()), 229), c.k(C15121a.c(this.f170703A, C6503b.f61546n, C18173a.class.getCanonicalName()), 153)))));
        k0(ColorStateList.valueOf(C15121a.c(this.f170703A, C6503b.f61556s, C18173a.class.getCanonicalName())));
        this.f170708F = typedArrayI.getDimensionPixelSize(l.f61837Aa, 0);
        this.f170709G = typedArrayI.getDimensionPixelSize(l.f61861Ca, 0);
        this.f170710H = typedArrayI.getDimensionPixelSize(l.f61873Da, 0);
        this.f170711I = typedArrayI.getDimensionPixelSize(l.f61849Ba, 0);
        typedArrayI.recycle();
    }

    public void B0(CharSequence charSequence) {
        if (TextUtils.equals(this.f170720z, charSequence)) {
            return;
        }
        this.f170720z = charSequence;
        this.f170705C.m(true);
        invalidateSelf();
    }

    public void C0(C16635d c16635d) {
        this.f170705C.k(c16635d, this.f170703A);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f170705C.g().getTextSize(), this.f170710H);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f170708F * 2) + x0(), this.f170709G);
    }

    public void v0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f170706D);
    }

    public void z0(View view) {
        if (view == null) {
            return;
        }
        D0(view);
        view.addOnLayoutChangeListener(this.f170706D);
    }

    private C18173a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f170704B = new Paint.FontMetrics();
        q qVar = new q(this);
        this.f170705C = qVar;
        this.f170706D = new ViewOnLayoutChangeListenerC2740a();
        this.f170707E = new Rect();
        this.f170715M = 1.0f;
        this.f170716N = 1.0f;
        this.f170717O = 0.5f;
        this.f170718P = 0.5f;
        this.f170719Q = 1.0f;
        this.f170703A = context;
        qVar.g().density = context.getResources().getDisplayMetrics().density;
        qVar.g().setTextAlign(Paint.Align.CENTER);
    }

    private float s0(Rect rect) {
        return rect.centerY() - r0();
    }

    private C17232f u0() {
        float f10 = -q0();
        float fWidth = ((float) (getBounds().width() - (this.f170713K * Math.sqrt(2.0d)))) / 2.0f;
        return new C17236j(new C17233g(this.f170713K), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    public void A0(float f10) {
        this.f170718P = 1.2f;
        this.f170715M = f10;
        this.f170716N = f10;
        this.f170719Q = C13661a.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        invalidateSelf();
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fQ0 = q0();
        float f10 = (float) (-((this.f170713K * Math.sqrt(2.0d)) - this.f170713K));
        canvas.scale(this.f170715M, this.f170716N, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f170718P));
        canvas.translate(fQ0, f10);
        super.draw(canvas);
        w0(canvas);
        canvas.restore();
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f170712J) {
            setShapeAppearanceModel(E().v().s(u0()).m());
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
