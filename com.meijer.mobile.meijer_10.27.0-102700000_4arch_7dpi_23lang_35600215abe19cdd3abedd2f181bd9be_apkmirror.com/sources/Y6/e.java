package Y6;

import android.graphics.Bitmap;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class e implements d {
    @Override // Y6.d
    public void a(int i10) {
    }

    @Override // Y6.d
    public void b() {
    }

    @Override // Y6.d
    public void c(Bitmap bitmap) {
        FS.bitmap_recycle(bitmap);
    }

    @Override // Y6.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // Y6.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
