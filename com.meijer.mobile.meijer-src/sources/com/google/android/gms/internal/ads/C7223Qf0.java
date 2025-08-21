package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.gms.internal.ads.Qf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7223Qf0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f70457e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f70458f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f70459g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f70460h;

    /* renamed from: i, reason: collision with root package name */
    private long f70461i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f70462j;

    public C7223Qf0(Context context) {
        super(false);
        this.f70457e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f70458f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzfu {
        this.f70458f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f70460h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f70460h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f70459g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f70459g = null;
                        if (this.f70462j) {
                            this.f70462j = false;
                            h();
                        }
                    } catch (IOException e10) {
                        throw new zzfu(e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new zzfu(e11, 2000);
                }
            } catch (Throwable th2) {
                this.f70460h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f70459g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f70459g = null;
                    if (this.f70462j) {
                        this.f70462j = false;
                        h();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new zzfu(e12, 2000);
                }
            }
        } catch (Throwable th3) {
            this.f70459g = null;
            if (this.f70462j) {
                this.f70462j = false;
                h();
            }
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = c8155fk0.f74991a.normalizeScheme();
                this.f70458f = uriNormalizeScheme;
                i(c8155fk0);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f70457e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f70457e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f70459g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new zzfu(new IOException("Could not open file descriptor for: " + String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new zzfu(e, true != (e instanceof FileNotFoundException) ? i10 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f70460h = fileInputStream;
                if (length != -1 && c8155fk0.f74995e > length) {
                    throw new zzfu(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c8155fk0.f74995e + startOffset) - startOffset;
                if (jSkip != c8155fk0.f74995e) {
                    throw new zzfu(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f70461i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f70461i = jPosition;
                        if (jPosition < 0) {
                            throw new zzfu(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f70461i = jPosition;
                    if (jPosition < 0) {
                        throw new zzfu(null, 2008);
                    }
                }
                long jMin = c8155fk0.f74996f;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f70461i = jMin;
                }
                this.f70462j = true;
                j(c8155fk0);
                long j10 = c8155fk0.f74996f;
                return j10 != -1 ? j10 : this.f70461i;
            } catch (IOException e11) {
                e = e11;
                i10 = 2000;
            }
        } catch (zzfu e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f70461i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfu(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f70460h;
        int i12 = OV.f69931a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f70461i;
        if (j11 != -1) {
            this.f70461i = j11 - i13;
        }
        zzg(i13);
        return i13;
    }
}
