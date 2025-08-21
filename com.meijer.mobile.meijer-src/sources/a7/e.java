package a7;

import android.graphics.Bitmap;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class e implements d {
    @Override // a7.d
    public void a(int i10) {
    }

    @Override // a7.d
    public void b() {
    }

    @Override // a7.d
    public void c(Bitmap bitmap) {
        FS.bitmap_recycle(bitmap);
    }

    @Override // a7.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // a7.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
