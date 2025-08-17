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
public final class C7098Qf0 extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f69617e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f69618f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f69619g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f69620h;

    /* renamed from: i, reason: collision with root package name */
    private long f69621i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f69622j;

    public C7098Qf0(Context context) {
        super(false);
        this.f69617e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f69618f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws zzfu {
        this.f69618f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f69620h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f69620h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f69619g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f69619g = null;
                        if (this.f69622j) {
                            this.f69622j = false;
                            h();
                        }
                    } catch (IOException e10) {
                        throw new zzfu(e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new zzfu(e11, 2000);
                }
            } catch (Throwable th2) {
                this.f69620h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f69619g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f69619g = null;
                    if (this.f69622j) {
                        this.f69622j = false;
                        h();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new zzfu(e12, 2000);
                }
            }
        } catch (Throwable th3) {
            this.f69619g = null;
            if (this.f69622j) {
                this.f69622j = false;
                h();
            }
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = c8030fk0.f74151a.normalizeScheme();
                this.f69618f = uriNormalizeScheme;
                i(c8030fk0);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f69617e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f69617e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f69619g = assetFileDescriptorOpenAssetFileDescriptor;
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
                this.f69620h = fileInputStream;
                if (length != -1 && c8030fk0.f74155e > length) {
                    throw new zzfu(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c8030fk0.f74155e + startOffset) - startOffset;
                if (jSkip != c8030fk0.f74155e) {
                    throw new zzfu(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f69621i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f69621i = jPosition;
                        if (jPosition < 0) {
                            throw new zzfu(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f69621i = jPosition;
                    if (jPosition < 0) {
                        throw new zzfu(null, 2008);
                    }
                }
                long jMin = c8030fk0.f74156f;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f69621i = jMin;
                }
                this.f69622j = true;
                j(c8030fk0);
                long j10 = c8030fk0.f74156f;
                return j10 != -1 ? j10 : this.f69621i;
            } catch (IOException e11) {
                e = e11;
                i10 = 2000;
            }
        } catch (zzfu e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f69621i;
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
        FileInputStream fileInputStream = this.f69620h;
        int i12 = OV.f69091a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f69621i;
        if (j11 != -1) {
            this.f69621i = j11 - i13;
        }
        zzg(i13);
        return i13;
    }
}
