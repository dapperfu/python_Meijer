package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import i.C14578a;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private final C5768b f46725a;

    /* renamed from: b, reason: collision with root package name */
    private final C5775i f46726b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46727c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136266F);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.f46727c = false;
        H.a(this, getContext());
        C5768b c5768b = new C5768b(this);
        this.f46725a = c5768b;
        c5768b.e(attributeSet, i10);
        C5775i c5775i = new C5775i(this);
        this.f46726b = c5775i;
        c5775i.g(attributeSet, i10);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            return c5775i.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            return c5775i.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f46726b.f() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5775i c5775i = this.f46726b;
        if (c5775i != null && drawable != null && !this.f46727c) {
            c5775i.h(drawable);
        }
        super.setImageDrawable(drawable);
        C5775i c5775i2 = this.f46726b;
        if (c5775i2 != null) {
            c5775i2.c();
            if (this.f46727c) {
                return;
            }
            this.f46726b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f46726b.i(i10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            c5775i.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            c5775i.k(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            c5768b.b();
        }
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            c5775i.c();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.f46725a;
        if (c5768b != null) {
            c5768b.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            c5775i.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f46727c = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5775i c5775i = this.f46726b;
        if (c5775i != null) {
            c5775i.c();
        }
    }
}
