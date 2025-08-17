package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C5626b mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C5633i mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            return c5633i.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            return c5633i.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null && drawable != null && !this.mHasLevel) {
            c5633i.h(drawable);
        }
        super.setImageDrawable(drawable);
        C5633i c5633i2 = this.mImageHelper;
        if (c5633i2 != null) {
            c5633i2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.i(i10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.mHasLevel = false;
        H.a(this, getContext());
        C5626b c5626b = new C5626b(this);
        this.mBackgroundTintHelper = c5626b;
        c5626b.e(attributeSet, i10);
        C5633i c5633i = new C5633i(this);
        this.mImageHelper = c5633i;
        c5633i.g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            c5626b.b();
        }
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.c();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.mBackgroundTintHelper;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5633i c5633i = this.mImageHelper;
        if (c5633i != null) {
            c5633i.c();
        }
    }
}
