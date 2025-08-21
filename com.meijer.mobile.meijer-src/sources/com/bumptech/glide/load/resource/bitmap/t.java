package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final a7.d f64936a = new a();

    class a extends a7.e {
        @Override // a7.e, a7.d
        public void c(Bitmap bitmap) {
        }

        a() {
        }
    }

    private static Bitmap b(a7.d dVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                FS.log_w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                FS.log_w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock lockI = F.i();
        lockI.lock();
        Bitmap bitmapD = dVar.d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapD);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapD;
        } finally {
            lockI.unlock();
        }
    }

    static Z6.c<Bitmap> a(a7.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmapB = b(dVar, current, i10, i11);
            z10 = true;
        } else {
            bitmapB = null;
        }
        if (!z10) {
            dVar = f64936a;
        }
        return C6639g.e(bitmapB, dVar);
    }
}
