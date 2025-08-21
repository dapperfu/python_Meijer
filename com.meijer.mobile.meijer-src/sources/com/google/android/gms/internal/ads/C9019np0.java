package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.gms.internal.ads.np0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9019np0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f77986e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f77987f;

    /* renamed from: g, reason: collision with root package name */
    private long f77988g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f77989h;

    public C9019np0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f77987f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzgm {
        this.f77987f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f77986e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f77986e = null;
                if (this.f77989h) {
                    this.f77989h = false;
                    h();
                }
            } catch (IOException e10) {
                throw new zzgm(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f77986e = null;
            if (this.f77989h) {
                this.f77989h = false;
                h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        Uri uri = c8155fk0.f74991a;
        this.f77987f = uri;
        i(c8155fk0);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f77986e = randomAccessFile;
            try {
                randomAccessFile.seek(c8155fk0.f74995e);
                long length = c8155fk0.f74996f;
                if (length == -1) {
                    length = this.f77986e.length() - c8155fk0.f74995e;
                }
                this.f77988g = length;
                if (length < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.f77989h = true;
                j(c8155fk0);
                return this.f77988g;
            } catch (IOException e10) {
                throw new zzgm(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzgm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new zzgm(e12, 2006);
        } catch (RuntimeException e13) {
            throw new zzgm(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f77988g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f77986e;
            int i12 = OV.f69931a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f77988g -= i13;
                zzg(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new zzgm(e10, 2000);
        }
    }
}
