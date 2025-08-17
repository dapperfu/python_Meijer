package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.q2;
import d3.C13466a;
import d3.P;
import f3.AbstractC13836a;
import f3.g;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends AbstractC13836a {

    /* renamed from: e, reason: collision with root package name */
    private final Context f55448e;

    /* renamed from: f, reason: collision with root package name */
    private g f55449f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f55450g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f55451h;

    /* renamed from: i, reason: collision with root package name */
    private long f55452i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55453j;

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
        this.f55448e = context.getApplicationContext();
    }

    @Override // f3.InterfaceC13839d
    public void close() throws RawResourceDataSourceException {
        this.f55449f = null;
        try {
            try {
                InputStream inputStream = this.f55451h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f55451h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f55450g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new RawResourceDataSourceException(null, e10, 2000);
                    }
                } finally {
                    this.f55450g = null;
                    if (this.f55453j) {
                        this.f55453j = false;
                        o();
                    }
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f55451h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f55450g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f55450g = null;
                    if (this.f55453j) {
                        this.f55453j = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(null, e12, 2000);
                }
            } finally {
                this.f55450g = null;
                if (this.f55453j) {
                    this.f55453j = false;
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
        Uri uriNormalizeScheme = gVar.f130638a.normalizeScheme();
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
            String strSubstring = (String) C13466a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith(q2.f92724c)) {
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

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        g gVar = this.f55449f;
        if (gVar != null) {
            return gVar.f130638a;
        }
        return null;
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.f55449f = gVar;
        p(gVar);
        AssetFileDescriptor assetFileDescriptorR = r(this.f55448e, gVar);
        this.f55450g = assetFileDescriptorR;
        long length = assetFileDescriptorR.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f55450g.getFileDescriptor());
        this.f55451h = fileInputStream;
        if (length != -1) {
            try {
                if (gVar.f130644g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        long startOffset = this.f55450g.getStartOffset();
        long jSkip = fileInputStream.skip(gVar.f130644g + startOffset) - startOffset;
        if (jSkip != gVar.f130644g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f55452i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f55452i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f55452i = j10;
            if (j10 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = gVar.f130645h;
        if (jMin != -1) {
            long j11 = this.f55452i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f55452i = jMin;
        }
        this.f55453j = true;
        q(gVar);
        long j12 = gVar.f130645h;
        return j12 != -1 ? j12 : this.f55452i;
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55452i;
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
        int i12 = ((InputStream) P.h(this.f55451h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f55452i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f55452i;
        if (j11 != -1) {
            this.f55452i = j11 - i12;
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
