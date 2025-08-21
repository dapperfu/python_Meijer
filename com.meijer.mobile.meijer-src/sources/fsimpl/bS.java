package fsimpl;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes15.dex */
public class bS {

    /* renamed from: a, reason: collision with root package name */
    private final Set f133032a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f133033b = new HashSet();

    public synchronized void a(Bitmap bitmap) {
        if (C14228fu.f133537a) {
            C14228fu.a(this.f133032a.contains(bitmap), "Bitmap should not already exist in the locked list", new Object[0]);
        }
        this.f133032a.add(bitmap);
    }

    public synchronized void b(Bitmap bitmap) {
        if (C14228fu.f133537a) {
            C14228fu.b(this.f133032a.contains(bitmap), "Bitmap should already exist in the locked list", new Object[0]);
        }
        this.f133032a.remove(bitmap);
        if (this.f133033b.remove(bitmap)) {
            bitmap.recycle();
        }
    }

    public synchronized void c(Bitmap bitmap) {
        if (this.f133032a.contains(bitmap)) {
            this.f133033b.add(bitmap);
        } else {
            bitmap.recycle();
        }
    }

    public synchronized boolean d(Bitmap bitmap) {
        if (this.f133033b.contains(bitmap)) {
            return true;
        }
        return bitmap.isRecycled();
    }
}
