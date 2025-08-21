package a7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.fullstory.FS;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class j implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f45285k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final k f45286a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f45287b;

    /* renamed from: c, reason: collision with root package name */
    private final long f45288c;

    /* renamed from: d, reason: collision with root package name */
    private final a f45289d;

    /* renamed from: e, reason: collision with root package name */
    private long f45290e;

    /* renamed from: f, reason: collision with root package name */
    private long f45291f;

    /* renamed from: g, reason: collision with root package name */
    private int f45292g;

    /* renamed from: h, reason: collision with root package name */
    private int f45293h;

    /* renamed from: i, reason: collision with root package name */
    private int f45294i;

    /* renamed from: j, reason: collision with root package name */
    private int f45295j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j10, k kVar, Set<Bitmap.Config> set) {
        this.f45288c = j10;
        this.f45290e = j10;
        this.f45286a = kVar;
        this.f45287b = set;
        this.f45289d = new b();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f45286a.d(i10, i11, config != null ? config : f45285k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    FS.log_d("LruBitmapPool", "Missing bitmap=" + this.f45286a.b(i10, i11, config));
                }
                this.f45293h++;
            } else {
                this.f45292g++;
                this.f45291f -= this.f45286a.e(bitmapD);
                this.f45289d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                FS.log_v("LruBitmapPool", "Get bitmap=" + this.f45286a.b(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapD;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f45291f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f45286a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        FS.log_w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f45291f = 0L;
                    return;
                }
                this.f45289d.a(bitmapRemoveLast);
                this.f45291f -= this.f45286a.e(bitmapRemoveLast);
                this.f45295j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    FS.log_d("LruBitmapPool", "Evicting bitmap=" + this.f45286a.a(bitmapRemoveLast));
                }
                h();
                FS.bitmap_recycle(bitmapRemoveLast);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a7.d
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            FS.log_d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // a7.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            FS.log_d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // a7.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (FS.bitmap_isRecycled(bitmap)) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f45286a.e(bitmap) <= this.f45290e && this.f45287b.contains(bitmap.getConfig())) {
                int iE = this.f45286a.e(bitmap);
                this.f45286a.c(bitmap);
                this.f45289d.b(bitmap);
                this.f45294i++;
                this.f45291f += iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    FS.log_v("LruBitmapPool", "Put bitmap in pool=" + this.f45286a.a(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                FS.log_v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f45286a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f45287b.contains(bitmap.getConfig()));
            }
            FS.bitmap_recycle(bitmap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static final class b implements a {
        @Override // a7.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // a7.j.a
        public void b(Bitmap bitmap) {
        }

        b() {
        }
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f45285k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        FS.log_v("LruBitmapPool", "Hits=" + this.f45292g + ", misses=" + this.f45293h + ", puts=" + this.f45294i + ", evictions=" + this.f45295j + ", currentSize=" + this.f45291f + ", maxSize=" + this.f45290e + "\nStrategy=" + this.f45286a);
    }

    private void j() {
        q(this.f45290e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    public long n() {
        return this.f45290e;
    }

    @Override // a7.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM != null) {
            bitmapM.eraseColor(0);
            return bitmapM;
        }
        return g(i10, i11, config);
    }

    @Override // a7.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        return bitmapM;
    }

    public j(long j10) {
        this(j10, l(), k());
    }
}
