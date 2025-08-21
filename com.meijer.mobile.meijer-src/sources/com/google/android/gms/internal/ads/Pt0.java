package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes6.dex */
public final class Pt0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70278e;

    /* renamed from: f, reason: collision with root package name */
    private C8155fk0 f70279f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f70280g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f70281h;

    /* renamed from: i, reason: collision with root package name */
    private long f70282i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f70283j;

    public Pt0(Context context) {
        super(false);
        this.f70278e = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        C8155fk0 c8155fk0 = this.f70279f;
        if (c8155fk0 != null) {
            return c8155fk0.f74991a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzgv {
        this.f70279f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f70281h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f70281h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f70280g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f70280g = null;
                        if (this.f70283j) {
                            this.f70283j = false;
                            h();
                        }
                    } catch (IOException e10) {
                        throw new zzgv(null, e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new zzgv(null, e11, 2000);
                }
            } catch (Throwable th2) {
                this.f70281h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f70280g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f70280g = null;
                    if (this.f70283j) {
                        this.f70283j = false;
                        h();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new zzgv(null, e12, 2000);
                }
            }
        } catch (Throwable th3) {
            this.f70280g = null;
            if (this.f70283j) {
                this.f70283j = false;
                h();
            }
            throw th3;
        }
    }

    private static AssetFileDescriptor l(Context context, C8155fk0 c8155fk0) throws zzgv, Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = c8155fk0.f74991a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzgv("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = k(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new zzgv("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(com.medallia.digital.mobilesdk.q2.f93563c)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzgv("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzgv("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new zzgv(null, e11, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws Resources.NotFoundException, PackageManager.NameNotFoundException, zzfz {
        long size;
        this.f70279f = c8155fk0;
        i(c8155fk0);
        AssetFileDescriptor assetFileDescriptorL = l(this.f70278e, c8155fk0);
        this.f70280g = assetFileDescriptorL;
        long length = assetFileDescriptorL.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f70280g.getFileDescriptor());
        this.f70281h = fileInputStream;
        if (length != -1) {
            try {
                if (c8155fk0.f74995e > length) {
                    throw new zzgv(null, null, 2008);
                }
            } catch (zzgv e10) {
                throw e10;
            } catch (IOException e11) {
                throw new zzgv(null, e11, 2000);
            }
        }
        long startOffset = this.f70280g.getStartOffset();
        long jSkip = fileInputStream.skip(c8155fk0.f74995e + startOffset) - startOffset;
        if (jSkip != c8155fk0.f74995e) {
            throw new zzgv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f70282i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f70282i = size;
                if (size < 0) {
                    throw new zzgv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f70282i = size;
            if (size < 0) {
                throw new zzfz(2008);
            }
        }
        long jMin = c8155fk0.f74996f;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.f70282i = jMin;
        }
        this.f70283j = true;
        j(c8155fk0);
        long j10 = c8155fk0.f74996f;
        return j10 != -1 ? j10 : this.f70282i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f70282i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzgv(null, e10, 2000);
            }
        }
        InputStream inputStream = this.f70281h;
        int i12 = OV.f69931a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f70282i == -1) {
                return -1;
            }
            throw new zzgv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f70282i;
        if (j11 != -1) {
            this.f70282i = j11 - i13;
        }
        zzg(i13);
        return i13;
    }

    private static int k(String str) throws zzgv {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgv("Resource identifier must be an integer.", null, 1004);
        }
    }
}
