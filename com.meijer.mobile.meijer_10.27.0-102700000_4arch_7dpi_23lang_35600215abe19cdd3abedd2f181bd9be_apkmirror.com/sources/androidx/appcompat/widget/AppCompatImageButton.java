package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import i.C14575a;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46501a;

    /* renamed from: b, reason: collision with root package name */
    private final C5633i f46502b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46503c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136509F);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.f46503c = false;
        H.a(this, getContext());
        C5626b c5626b = new C5626b(this);
        this.f46501a = c5626b;
        c5626b.e(attributeSet, i10);
        C5633i c5633i = new C5633i(this);
        this.f46502b = c5633i;
        c5633i.g(attributeSet, i10);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            return c5633i.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            return c5633i.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f46502b.f() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5633i c5633i = this.f46502b;
        if (c5633i != null && drawable != null && !this.f46503c) {
            c5633i.h(drawable);
        }
        super.setImageDrawable(drawable);
        C5633i c5633i2 = this.f46502b;
        if (c5633i2 != null) {
            c5633i2.c();
            if (this.f46503c) {
                return;
            }
            this.f46502b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f46502b.i(i10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            c5633i.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            c5633i.k(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            c5626b.b();
        }
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            c5633i.c();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46501a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            c5633i.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f46503c = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5633i c5633i = this.f46502b;
        if (c5633i != null) {
            c5633i.c();
        }
    }
}
