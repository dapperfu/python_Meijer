package h7;

import V6.k;
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
import h7.g;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: h7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14383c extends Drawable implements g.b, Animatable, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final a f134458a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f134459b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f134460c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f134461d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f134462e;

    /* renamed from: f, reason: collision with root package name */
    private int f134463f;

    /* renamed from: g, reason: collision with root package name */
    private int f134464g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f134465h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f134466i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f134467j;

    /* renamed from: k, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f134468k;

    /* renamed from: h7.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f134469a;

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
            return new C14383c(this);
        }

        a(g gVar) {
            this.f134469a = gVar;
        }
    }

    public C14383c(Context context, U6.a aVar, k<Bitmap> kVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, kVar, bitmap)));
    }

    private void l() {
        this.f134463f = 0;
    }

    private void o() {
        this.f134459b = false;
        this.f134458a.f134469a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void k() {
        this.f134461d = true;
        this.f134458a.f134469a.a();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f134460c = true;
        l();
        if (this.f134462e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f134460c = false;
        o();
    }

    private Rect d() {
        if (this.f134467j == null) {
            this.f134467j = new Rect();
        }
        return this.f134467j;
    }

    private Paint h() {
        if (this.f134466i == null) {
            this.f134466i = new Paint(2);
        }
        return this.f134466i;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f134468k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f134468k.get(i10).b(this);
            }
        }
    }

    private void n() {
        p7.k.a(!this.f134461d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f134458a.f134469a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f134459b) {
                return;
            }
            this.f134459b = true;
            this.f134458a.f134469a.r(this);
            invalidateSelf();
        }
    }

    public ByteBuffer c() {
        return this.f134458a.f134469a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f134461d) {
            return;
        }
        if (this.f134465h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f134465h = false;
        }
        canvas.drawBitmap(this.f134458a.f134469a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f134458a.f134469a.e();
    }

    public int f() {
        return this.f134458a.f134469a.f();
    }

    public int g() {
        return this.f134458a.f134469a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f134458a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f134458a.f134469a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f134458a.f134469a.k();
    }

    public int i() {
        return this.f134458a.f134469a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f134459b;
    }

    public void m(k<Bitmap> kVar, Bitmap bitmap) {
        this.f134458a.f134469a.o(kVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        p7.k.a(!this.f134461d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f134462e = z10;
        if (!z10) {
            o();
        } else if (this.f134460c) {
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

    @Override // h7.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f134463f++;
        }
        int i10 = this.f134464g;
        if (i10 != -1 && this.f134463f >= i10) {
            j();
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f134465h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    C14383c(a aVar) {
        this.f134462e = true;
        this.f134464g = -1;
        this.f134458a = (a) p7.k.d(aVar);
    }
}
