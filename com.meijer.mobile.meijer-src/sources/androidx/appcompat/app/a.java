package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import i.C14587j;

/* loaded from: classes.dex */
public abstract class a {

    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(boolean z10);

    public abstract void B(CharSequence charSequence);

    public abstract void C(CharSequence charSequence);

    public androidx.appcompat.view.b D(b.a aVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(int i10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(int i10);

    public abstract void y(Drawable drawable);

    public abstract void z(boolean z10);

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0968a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f46161a;

        public C0968a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f46161a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136651t);
            this.f46161a = typedArrayObtainStyledAttributes.getInt(C14587j.f136656u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0968a(int i10, int i11) {
            super(i10, i11);
            this.f46161a = 8388627;
        }

        public C0968a(int i10, int i11, int i12) {
            super(i10, i11);
            this.f46161a = i12;
        }

        public C0968a(int i10) {
            this(-2, -1, i10);
        }

        public C0968a(C0968a c0968a) {
            super((ViewGroup.MarginLayoutParams) c0968a);
            this.f46161a = 0;
            this.f46161a = c0968a.f46161a;
        }

        public C0968a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f46161a = 0;
        }
    }
}
