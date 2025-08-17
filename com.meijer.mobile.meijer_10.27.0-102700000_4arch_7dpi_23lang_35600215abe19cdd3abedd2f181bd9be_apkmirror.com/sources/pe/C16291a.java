package pe;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;
import re.C16760h;
import re.C16765m;
import re.InterfaceC16768p;

/* renamed from: pe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16291a extends Drawable implements InterfaceC16768p, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private b f155714a;

    /* renamed from: pe.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C16760h f155715a;

        /* renamed from: b, reason: collision with root package name */
        boolean f155716b;

        public b(C16760h c16760h) {
            this.f155715a = c16760h;
            this.f155716b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C16291a newDrawable() {
            return new C16291a(new b(this));
        }

        public b(b bVar) {
            this.f155715a = (C16760h) bVar.f155715a.getConstantState().newDrawable();
            this.f155716b = bVar.f155716b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public C16291a(C16765m c16765m) {
        this(new b(new C16760h(c16765m)));
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C16291a mutate() {
        this.f155714a = new b(this.f155714a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f155714a;
        if (bVar.f155716b) {
            bVar.f155715a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f155714a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f155714a.f155715a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f155714a.f155715a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f155714a.f155715a.setColorFilter(colorFilter);
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        this.f155714a.f155715a.setShapeAppearanceModel(c16765m);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f155714a.f155715a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f155714a.f155715a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f155714a.f155715a.setTintMode(mode);
    }

    private C16291a(b bVar) {
        this.f155714a = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f155714a.f155715a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f155714a.f155715a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = C16292b.e(iArr);
        b bVar = this.f155714a;
        if (bVar.f155716b != zE) {
            bVar.f155716b = zE;
            return true;
        }
        return zOnStateChange;
    }
}
