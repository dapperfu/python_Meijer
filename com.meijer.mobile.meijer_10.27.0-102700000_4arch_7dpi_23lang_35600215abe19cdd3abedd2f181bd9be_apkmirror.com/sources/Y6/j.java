package Y6;

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
    private static final Bitmap.Config f40153k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final k f40154a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f40155b;

    /* renamed from: c, reason: collision with root package name */
    private final long f40156c;

    /* renamed from: d, reason: collision with root package name */
    private final a f40157d;

    /* renamed from: e, reason: collision with root package name */
    private long f40158e;

    /* renamed from: f, reason: collision with root package name */
    private long f40159f;

    /* renamed from: g, reason: collision with root package name */
    private int f40160g;

    /* renamed from: h, reason: collision with root package name */
    private int f40161h;

    /* renamed from: i, reason: collision with root package name */
    private int f40162i;

    /* renamed from: j, reason: collision with root package name */
    private int f40163j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j10, k kVar, Set<Bitmap.Config> set) {
        this.f40156c = j10;
        this.f40158e = j10;
        this.f40154a = kVar;
        this.f40155b = set;
        this.f40157d = new b();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f40154a.d(i10, i11, config != null ? config : f40153k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    FS.log_d("LruBitmapPool", "Missing bitmap=" + this.f40154a.b(i10, i11, config));
                }
                this.f40161h++;
            } else {
                this.f40160g++;
                this.f40159f -= this.f40154a.e(bitmapD);
                this.f40157d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                FS.log_v("LruBitmapPool", "Get bitmap=" + this.f40154a.b(i10, i11, config));
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
        while (this.f40159f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f40154a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        FS.log_w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f40159f = 0L;
                    return;
                }
                this.f40157d.a(bitmapRemoveLast);
                this.f40159f -= this.f40154a.e(bitmapRemoveLast);
                this.f40163j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    FS.log_d("LruBitmapPool", "Evicting bitmap=" + this.f40154a.a(bitmapRemoveLast));
                }
                h();
                FS.bitmap_recycle(bitmapRemoveLast);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Y6.d
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

    @Override // Y6.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            FS.log_d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // Y6.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (FS.bitmap_isRecycled(bitmap)) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f40154a.e(bitmap) <= this.f40158e && this.f40155b.contains(bitmap.getConfig())) {
                int iE = this.f40154a.e(bitmap);
                this.f40154a.c(bitmap);
                this.f40157d.b(bitmap);
                this.f40162i++;
                this.f40159f += iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    FS.log_v("LruBitmapPool", "Put bitmap in pool=" + this.f40154a.a(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                FS.log_v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f40154a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f40155b.contains(bitmap.getConfig()));
            }
            FS.bitmap_recycle(bitmap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static final class b implements a {
        @Override // Y6.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // Y6.j.a
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
            config = f40153k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        FS.log_v("LruBitmapPool", "Hits=" + this.f40160g + ", misses=" + this.f40161h + ", puts=" + this.f40162i + ", evictions=" + this.f40163j + ", currentSize=" + this.f40159f + ", maxSize=" + this.f40158e + "\nStrategy=" + this.f40154a);
    }

    private void j() {
        q(this.f40158e);
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
        return this.f40158e;
    }

    @Override // Y6.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM != null) {
            bitmapM.eraseColor(0);
            return bitmapM;
        }
        return g(i10, i11, config);
    }

    @Override // Y6.d
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
