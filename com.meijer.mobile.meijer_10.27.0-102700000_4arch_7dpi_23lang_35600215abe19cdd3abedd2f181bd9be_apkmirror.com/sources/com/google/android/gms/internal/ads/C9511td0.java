package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.td0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9511td0 extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f78603e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f78604f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f78605g;

    /* renamed from: h, reason: collision with root package name */
    private long f78606h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f78607i;

    public C9511td0(Context context) {
        super(false);
        this.f78603e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        try {
            Uri uri = c8030fk0.f74151a;
            this.f78604f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(com.medallia.digital.mobilesdk.q2.f92724c)) {
                path = path.substring(1);
            }
            i(c8030fk0);
            InputStream inputStreamOpen = this.f78603e.open(path, 1);
            this.f78605g = inputStreamOpen;
            if (inputStreamOpen.skip(c8030fk0.f74155e) < c8030fk0.f74155e) {
                throw new zzfp(null, 2008);
            }
            long j10 = c8030fk0.f74156f;
            if (j10 != -1) {
                this.f78606h = j10;
            } else {
                long jAvailable = this.f78605g.available();
                this.f78606h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f78606h = -1L;
                }
            }
            this.f78607i = true;
            j(c8030fk0);
            return this.f78606h;
        } catch (zzfp e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzfp(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f78604f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws zzfp {
        this.f78604f = null;
        try {
            try {
                InputStream inputStream = this.f78605g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f78605g = null;
                if (this.f78607i) {
                    this.f78607i = false;
                    h();
                }
            } catch (IOException e10) {
                throw new zzfp(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f78605g = null;
            if (this.f78607i) {
                this.f78607i = false;
                h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f78606h;
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
        InputStream inputStream = this.f78605g;
        int i12 = OV.f69091a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f78606h;
        if (j11 != -1) {
            this.f78606h = j11 - i13;
        }
        zzg(i13);
        return i13;
    }
}
