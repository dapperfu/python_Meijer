package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.q2;
import d3.C13599a;
import d3.P;
import f3.AbstractC13946a;
import f3.g;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private final Context f55672e;

    /* renamed from: f, reason: collision with root package name */
    private g f55673f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f55674g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f55675h;

    /* renamed from: i, reason: collision with root package name */
    private long f55676i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55677j;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f55672e = context.getApplicationContext();
    }

    @Override // f3.InterfaceC13949d
    public void close() throws RawResourceDataSourceException {
        this.f55673f = null;
        try {
            try {
                InputStream inputStream = this.f55675h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f55675h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f55674g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new RawResourceDataSourceException(null, e10, 2000);
                    }
                } finally {
                    this.f55674g = null;
                    if (this.f55677j) {
                        this.f55677j = false;
                        o();
                    }
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f55675h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f55674g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f55674g = null;
                    if (this.f55677j) {
                        this.f55677j = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(null, e12, 2000);
                }
            } finally {
                this.f55674g = null;
                if (this.f55677j) {
                    this.f55677j = false;
                    o();
                }
            }
        }
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor r(Context context, g gVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = gVar.f131472a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = s(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) C13599a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith(q2.f93563c)) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = s(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new RawResourceDataSourceException(null, e11, 2005);
        }
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        g gVar = this.f55673f;
        if (gVar != null) {
            return gVar.f131472a;
        }
        return null;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.f55673f = gVar;
        p(gVar);
        AssetFileDescriptor assetFileDescriptorR = r(this.f55672e, gVar);
        this.f55674g = assetFileDescriptorR;
        long length = assetFileDescriptorR.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f55674g.getFileDescriptor());
        this.f55675h = fileInputStream;
        if (length != -1) {
            try {
                if (gVar.f131478g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        long startOffset = this.f55674g.getStartOffset();
        long jSkip = fileInputStream.skip(gVar.f131478g + startOffset) - startOffset;
        if (jSkip != gVar.f131478g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f55676i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f55676i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f55676i = j10;
            if (j10 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = gVar.f131479h;
        if (jMin != -1) {
            long j11 = this.f55676i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f55676i = jMin;
        }
        this.f55677j = true;
        q(gVar);
        long j12 = gVar.f131479h;
        return j12 != -1 ? j12 : this.f55676i;
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55676i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) P.h(this.f55675h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f55676i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f55676i;
        if (j11 != -1) {
            this.f55676i = j11 - i12;
        }
        n(i12);
        return i12;
    }

    private static int s(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }
}
