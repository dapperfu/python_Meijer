package Z6;

import T6.b;
import Z6.a;
import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f42406b;

    /* renamed from: c, reason: collision with root package name */
    private final long f42407c;

    /* renamed from: e, reason: collision with root package name */
    private T6.b f42409e;

    /* renamed from: d, reason: collision with root package name */
    private final c f42408d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f42405a = new j();

    private synchronized T6.b d() throws IOException {
        try {
            if (this.f42409e == null) {
                this.f42409e = T6.b.J(this.f42406b, 1, 1, this.f42407c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f42409e;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    @Override // Z6.a
    public void a(V6.e eVar, a.b bVar) {
        String strB = this.f42405a.b(eVar);
        this.f42408d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                FS.log_v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + eVar);
            }
            try {
                T6.b bVarD = d();
                if (bVarD.D(strB) == null) {
                    b.c cVarZ = bVarD.z(strB);
                    if (cVarZ == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarZ.f(0))) {
                            cVarZ.e();
                        }
                        cVarZ.b();
                    } catch (Throwable th2) {
                        cVarZ.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    FS.log_w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f42408d.b(strB);
        }
    }

    @Override // Z6.a
    public File b(V6.e eVar) {
        String strB = this.f42405a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            FS.log_v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + eVar);
        }
        try {
            b.e eVarD = d().D(strB);
            if (eVarD != null) {
                return eVarD.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            FS.log_w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Deprecated
    protected e(File file, long j10) {
        this.f42406b = file;
        this.f42407c = j10;
    }
}
