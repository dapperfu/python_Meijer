package j7;

import X6.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.fullstory.instrumentation.FSDraw;
import j7.g;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14961c extends Drawable implements g.b, Animatable, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final a f140145a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f140146b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f140147c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f140148d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f140149e;

    /* renamed from: f, reason: collision with root package name */
    private int f140150f;

    /* renamed from: g, reason: collision with root package name */
    private int f140151g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f140152h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f140153i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f140154j;

    /* renamed from: k, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f140155k;

    /* renamed from: j7.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f140156a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C14961c(this);
        }

        a(g gVar) {
            this.f140156a = gVar;
        }
    }

    public C14961c(Context context, W6.a aVar, k<Bitmap> kVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, kVar, bitmap)));
    }

    private void l() {
        this.f140150f = 0;
    }

    private void o() {
        this.f140146b = false;
        this.f140145a.f140156a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void k() {
        this.f140148d = true;
        this.f140145a.f140156a.a();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f140147c = true;
        l();
        if (this.f140149e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f140147c = false;
        o();
    }

    private Rect d() {
        if (this.f140154j == null) {
            this.f140154j = new Rect();
        }
        return this.f140154j;
    }

    private Paint h() {
        if (this.f140153i == null) {
            this.f140153i = new Paint(2);
        }
        return this.f140153i;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f140155k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f140155k.get(i10).b(this);
            }
        }
    }

    private void n() {
        r7.k.a(!this.f140148d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f140145a.f140156a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f140146b) {
                return;
            }
            this.f140146b = true;
            this.f140145a.f140156a.r(this);
            invalidateSelf();
        }
    }

    public ByteBuffer c() {
        return this.f140145a.f140156a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f140148d) {
            return;
        }
        if (this.f140152h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f140152h = false;
        }
        canvas.drawBitmap(this.f140145a.f140156a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f140145a.f140156a.e();
    }

    public int f() {
        return this.f140145a.f140156a.f();
    }

    public int g() {
        return this.f140145a.f140156a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f140145a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f140145a.f140156a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f140145a.f140156a.k();
    }

    public int i() {
        return this.f140145a.f140156a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f140146b;
    }

    public void m(k<Bitmap> kVar, Bitmap bitmap) {
        this.f140145a.f140156a.o(kVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        r7.k.a(!this.f140148d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f140149e = z10;
        if (!z10) {
            o();
        } else if (this.f140147c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // j7.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f140150f++;
        }
        int i10 = this.f140151g;
        if (i10 != -1 && this.f140150f >= i10) {
            j();
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f140152h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    C14961c(a aVar) {
        this.f140149e = true;
        this.f140151g = -1;
        this.f140145a = (a) r7.k.d(aVar);
    }
}
