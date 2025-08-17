package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class L extends E {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f46686b;

    public L(Context context, Resources resources) {
        super(resources);
        this.f46686b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f46686b.get();
        if (drawableA != null && context != null) {
            D.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
