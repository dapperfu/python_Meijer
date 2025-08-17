package fsimpl;

import android.graphics.Bitmap;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes14.dex */
public class bT {

    /* renamed from: a, reason: collision with root package name */
    private final Object f131784a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private List f131785b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Set f131786c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private int f131787d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f131788e;

    bT(int i10) {
        this.f131788e = i10;
    }

    private void b(Bitmap bitmap) {
        if (this.f131786c.contains(bitmap)) {
            this.f131786c.remove(bitmap);
            if (this.f131785b.size() < 2) {
                this.f131785b.add(bitmap);
            } else {
                bitmap.recycle();
            }
        }
    }

    public int a() {
        return this.f131788e;
    }

    public Bitmap a(String str, boolean z10) {
        Bitmap bitmapCreateBitmap;
        synchronized (this.f131784a) {
            if (this.f131785b.size() == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(a(), a(), Bitmap.Config.ARGB_8888);
                int size = this.f131785b.size() + this.f131786c.size();
                int i10 = this.f131787d;
                if (size > i10) {
                    if (size / 10 != i10 / 10) {
                        Log.d("New high-water mark for pool: " + size);
                    }
                    this.f131787d = size;
                }
            } else {
                Bitmap bitmap = (Bitmap) this.f131785b.remove(r0.size() - 1);
                if (z10) {
                    bitmap.eraseColor(0);
                }
                bitmapCreateBitmap = bitmap;
            }
            this.f131786c.add(bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    public void a(Bitmap bitmap) {
        synchronized (this.f131784a) {
            b(bitmap);
        }
    }

    public void a(Collection collection) {
        synchronized (this.f131784a) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b((Bitmap) it.next());
            }
        }
    }
}
