package f7;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import h7.C14383c;

/* loaded from: classes4.dex */
public abstract class j<T extends Drawable> implements X6.c<T>, X6.b {

    /* renamed from: a, reason: collision with root package name */
    protected final T f130826a;

    @Override // X6.b
    public void b() {
        T t10 = this.f130826a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof C14383c) {
            ((C14383c) t10).e().prepareToDraw();
        }
    }

    @Override // X6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f130826a.getConstantState();
        return constantState == null ? this.f130826a : (T) constantState.newDrawable();
    }

    public j(T t10) {
        this.f130826a = (T) p7.k.d(t10);
    }
}
