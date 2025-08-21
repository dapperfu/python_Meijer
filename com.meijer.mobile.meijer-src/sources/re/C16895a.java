package re;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;
import te.C17234h;
import te.C17239m;
import te.InterfaceC17242p;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16895a extends Drawable implements InterfaceC17242p, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private b f159471a;

    /* renamed from: re.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C17234h f159472a;

        /* renamed from: b, reason: collision with root package name */
        boolean f159473b;

        public b(C17234h c17234h) {
            this.f159472a = c17234h;
            this.f159473b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C16895a newDrawable() {
            return new C16895a(new b(this));
        }

        public b(b bVar) {
            this.f159472a = (C17234h) bVar.f159472a.getConstantState().newDrawable();
            this.f159473b = bVar.f159473b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public C16895a(C17239m c17239m) {
        this(new b(new C17234h(c17239m)));
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C16895a mutate() {
        this.f159471a = new b(this.f159471a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f159471a;
        if (bVar.f159473b) {
            bVar.f159472a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f159471a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f159471a.f159472a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f159471a.f159472a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f159471a.f159472a.setColorFilter(colorFilter);
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        this.f159471a.f159472a.setShapeAppearanceModel(c17239m);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f159471a.f159472a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f159471a.f159472a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f159471a.f159472a.setTintMode(mode);
    }

    private C16895a(b bVar) {
        this.f159471a = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f159471a.f159472a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f159471a.f159472a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = C16896b.e(iArr);
        b bVar = this.f159471a;
        if (bVar.f159473b != zE) {
            bVar.f159473b = zE;
            return true;
        }
        return zOnStateChange;
    }
}
