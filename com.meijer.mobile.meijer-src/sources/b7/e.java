package b7;

import V6.b;
import android.util.Log;
import b7.InterfaceC6336a;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class e implements InterfaceC6336a {

    /* renamed from: b, reason: collision with root package name */
    private final File f60073b;

    /* renamed from: c, reason: collision with root package name */
    private final long f60074c;

    /* renamed from: e, reason: collision with root package name */
    private V6.b f60076e;

    /* renamed from: d, reason: collision with root package name */
    private final c f60075d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f60072a = new j();

    private synchronized V6.b d() throws IOException {
        try {
            if (this.f60076e == null) {
                this.f60076e = V6.b.J(this.f60073b, 1, 1, this.f60074c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60076e;
    }

    public static InterfaceC6336a c(File file, long j10) {
        return new e(file, j10);
    }

    @Override // b7.InterfaceC6336a
    public void a(X6.e eVar, InterfaceC6336a.b bVar) {
        String strB = this.f60072a.b(eVar);
        this.f60075d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                FS.log_v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + eVar);
            }
            try {
                V6.b bVarD = d();
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
            this.f60075d.b(strB);
        }
    }

    @Override // b7.InterfaceC6336a
    public File b(X6.e eVar) {
        String strB = this.f60072a.b(eVar);
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
        this.f60073b = file;
        this.f60074c = j10;
    }
}
