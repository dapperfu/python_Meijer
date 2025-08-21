package fsimpl;

import android.graphics.Bitmap;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes15.dex */
public class bT {

    /* renamed from: a, reason: collision with root package name */
    private final Object f133034a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private List f133035b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Set f133036c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private int f133037d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f133038e;

    bT(int i10) {
        this.f133038e = i10;
    }

    private void b(Bitmap bitmap) {
        if (this.f133036c.contains(bitmap)) {
            this.f133036c.remove(bitmap);
            if (this.f133035b.size() < 2) {
                this.f133035b.add(bitmap);
            } else {
                bitmap.recycle();
            }
        }
    }

    public int a() {
        return this.f133038e;
    }

    public Bitmap a(String str, boolean z10) {
        Bitmap bitmapCreateBitmap;
        synchronized (this.f133034a) {
            if (this.f133035b.size() == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(a(), a(), Bitmap.Config.ARGB_8888);
                int size = this.f133035b.size() + this.f133036c.size();
                int i10 = this.f133037d;
                if (size > i10) {
                    if (size / 10 != i10 / 10) {
                        Log.d("New high-water mark for pool: " + size);
                    }
                    this.f133037d = size;
                }
            } else {
                Bitmap bitmap = (Bitmap) this.f133035b.remove(r0.size() - 1);
                if (z10) {
                    bitmap.eraseColor(0);
                }
                bitmapCreateBitmap = bitmap;
            }
            this.f133036c.add(bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    public void a(Bitmap bitmap) {
        synchronized (this.f133034a) {
            b(bitmap);
        }
    }

    public void a(Collection collection) {
        synchronized (this.f133034a) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b((Bitmap) it.next());
            }
        }
    }
}
