package fsimpl;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes14.dex */
public class bS {

    /* renamed from: a, reason: collision with root package name */
    private final Set f131782a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f131783b = new HashSet();

    public synchronized void a(Bitmap bitmap) {
        if (C14103fu.f132287a) {
            C14103fu.a(this.f131782a.contains(bitmap), "Bitmap should not already exist in the locked list", new Object[0]);
        }
        this.f131782a.add(bitmap);
    }

    public synchronized void b(Bitmap bitmap) {
        if (C14103fu.f132287a) {
            C14103fu.b(this.f131782a.contains(bitmap), "Bitmap should already exist in the locked list", new Object[0]);
        }
        this.f131782a.remove(bitmap);
        if (this.f131783b.remove(bitmap)) {
            bitmap.recycle();
        }
    }

    public synchronized void c(Bitmap bitmap) {
        if (this.f131782a.contains(bitmap)) {
            this.f131783b.add(bitmap);
        } else {
            bitmap.recycle();
        }
    }

    public synchronized boolean d(Bitmap bitmap) {
        if (this.f131783b.contains(bitmap)) {
            return true;
        }
        return bitmap.isRecycled();
    }
}
