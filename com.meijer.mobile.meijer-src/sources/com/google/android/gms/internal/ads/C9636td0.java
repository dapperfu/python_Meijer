package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.td0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9636td0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f79443e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f79444f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f79445g;

    /* renamed from: h, reason: collision with root package name */
    private long f79446h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f79447i;

    public C9636td0(Context context) {
        super(false);
        this.f79443e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        try {
            Uri uri = c8155fk0.f74991a;
            this.f79444f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(com.medallia.digital.mobilesdk.q2.f93563c)) {
                path = path.substring(1);
            }
            i(c8155fk0);
            InputStream inputStreamOpen = this.f79443e.open(path, 1);
            this.f79445g = inputStreamOpen;
            if (inputStreamOpen.skip(c8155fk0.f74995e) < c8155fk0.f74995e) {
                throw new zzfp(null, 2008);
            }
            long j10 = c8155fk0.f74996f;
            if (j10 != -1) {
                this.f79446h = j10;
            } else {
                long jAvailable = this.f79445g.available();
                this.f79446h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f79446h = -1L;
                }
            }
            this.f79447i = true;
            j(c8155fk0);
            return this.f79446h;
        } catch (zzfp e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzfp(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f79444f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzfp {
        this.f79444f = null;
        try {
            try {
                InputStream inputStream = this.f79445g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f79445g = null;
                if (this.f79447i) {
                    this.f79447i = false;
                    h();
                }
            } catch (IOException e10) {
                throw new zzfp(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f79445g = null;
            if (this.f79447i) {
                this.f79447i = false;
                h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f79446h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfp(e10, 2000);
            }
        }
        InputStream inputStream = this.f79445g;
        int i12 = OV.f69931a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f79446h;
        if (j11 != -1) {
            this.f79446h = j11 - i13;
        }
        zzg(i13);
        return i13;
    }
}
