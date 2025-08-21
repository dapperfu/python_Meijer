package h7;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
final class k extends j<Drawable> {
    @Override // Z6.c
    public void a() {
    }

    static Z6.c<Drawable> e(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // Z6.c
    public Class<Drawable> c() {
        return this.f135172a.getClass();
    }

    @Override // Z6.c
    public int getSize() {
        return Math.max(1, this.f135172a.getIntrinsicWidth() * this.f135172a.getIntrinsicHeight() * 4);
    }

    private k(Drawable drawable) {
        super(drawable);
    }
}
