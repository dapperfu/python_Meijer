package f7;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
final class k extends j<Drawable> {
    @Override // X6.c
    public void a() {
    }

    static X6.c<Drawable> e(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // X6.c
    public Class<Drawable> c() {
        return this.f130826a.getClass();
    }

    @Override // X6.c
    public int getSize() {
        return Math.max(1, this.f130826a.getIntrinsicWidth() * this.f130826a.getIntrinsicHeight() * 4);
    }

    private k(Drawable drawable) {
        super(drawable);
    }
}
