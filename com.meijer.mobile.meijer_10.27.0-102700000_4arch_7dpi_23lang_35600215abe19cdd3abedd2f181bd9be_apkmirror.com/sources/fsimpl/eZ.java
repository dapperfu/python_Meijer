package fsimpl;

import android.graphics.Bitmap;
import android.util.LongSparseArray;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class eZ {

    /* renamed from: a, reason: collision with root package name */
    private LongSparseArray f132118a = new LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    private WeakHashMap f132119b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private WeakHashMap f132120c = new WeakHashMap();

    synchronized String a(long j10) {
        return (String) this.f132118a.get(j10);
    }

    synchronized String a(Bitmap bitmap) {
        return (String) this.f132119b.get(bitmap);
    }

    synchronized void a(long j10, String str) {
        this.f132118a.put(j10, str);
    }

    synchronized void a(Bitmap bitmap, String str) {
        this.f132119b.put(bitmap, str);
    }

    synchronized void b(long j10) {
        this.f132118a.remove(j10);
    }

    public synchronized void putImageDecoder(Object obj, Long l10) {
        if (l10 != null) {
            this.f132120c.put(obj, l10);
        }
    }

    public synchronized Long removeImageDecoder(Object obj) {
        return (Long) this.f132120c.remove(obj);
    }
}
