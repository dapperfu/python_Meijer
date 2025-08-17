package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    Animatable2.AnimationCallback f58824a;

    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            b.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            b.this.c(drawable);
        }
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }

    Animatable2.AnimationCallback a() {
        if (this.f58824a == null) {
            this.f58824a = new a();
        }
        return this.f58824a;
    }
}
