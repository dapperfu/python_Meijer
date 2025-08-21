package h7;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j7.C14961c;

/* loaded from: classes4.dex */
public abstract class j<T extends Drawable> implements Z6.c<T>, Z6.b {

    /* renamed from: a, reason: collision with root package name */
    protected final T f135172a;

    @Override // Z6.b
    public void b() {
        T t10 = this.f135172a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof C14961c) {
            ((C14961c) t10).e().prepareToDraw();
        }
    }

    @Override // Z6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f135172a.getConstantState();
        return constantState == null ? this.f135172a : (T) constantState.newDrawable();
    }

    public j(T t10) {
        this.f135172a = (T) r7.k.d(t10);
    }
}
