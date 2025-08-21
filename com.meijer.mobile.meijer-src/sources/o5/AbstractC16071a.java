package o5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import kotlin.Metadata;
import q5.InterfaceC16607d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"Lo5/a;", "Landroid/view/View;", "T", "Lo5/d;", "Lq5/d;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "b", "(Landroid/graphics/drawable/Drawable;)V", "error", "c", "result", "a", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "drawable", "g", "f", "", "Z", "isStarted", "d", "()Landroid/graphics/drawable/Drawable;", "e", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16071a<T extends View> implements InterfaceC16074d<T>, InterfaceC16607d, InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isStarted;

    @Override // q5.InterfaceC16607d
    public abstract Drawable d();

    public abstract void e(Drawable drawable);

    @Override // androidx.view.InterfaceC6157f
    public void onStart(InterfaceC6172s owner) {
        this.isStarted = true;
        f();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onStop(InterfaceC6172s owner) {
        this.isStarted = false;
        f();
    }

    @Override // o5.InterfaceC16073c
    public void a(Drawable result) {
        g(result);
    }

    @Override // o5.InterfaceC16073c
    public void b(Drawable placeholder) {
        g(placeholder);
    }

    @Override // o5.InterfaceC16073c
    public void c(Drawable error) {
        g(error);
    }

    protected final void f() {
        Animatable animatable;
        Object objD = d();
        if (objD instanceof Animatable) {
            animatable = (Animatable) objD;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void g(Drawable drawable) {
        Animatable animatable;
        Object objD = d();
        if (objD instanceof Animatable) {
            animatable = (Animatable) objD;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        e(drawable);
        f();
    }
}
