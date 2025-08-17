package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import d3.P;
import f3.AbstractC13836a;
import f3.g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class ContentDataSource extends AbstractC13836a {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f55430e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f55431f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f55432g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f55433h;

    /* renamed from: i, reason: collision with root package name */
    private long f55434i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55435j;

    public ContentDataSource(Context context) {
        super(false);
        this.f55430e = context.getContentResolver();
    }

    @Override // f3.InterfaceC13839d
    public void close() throws ContentDataSourceException {
        this.f55431f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f55433h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f55433h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f55432g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new ContentDataSourceException(e10, 2000);
                    }
                } finally {
                    this.f55432g = null;
                    if (this.f55435j) {
                        this.f55435j = false;
                        o();
                    }
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f55433h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f55432g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f55432g = null;
                    if (this.f55435j) {
                        this.f55435j = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12, 2000);
                }
            } finally {
                this.f55432g = null;
                if (this.f55435j) {
                    this.f55435j = false;
                    o();
                }
            }
        }
    }

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        return this.f55431f;
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = gVar.f130638a.normalizeScheme();
            this.f55431f = uriNormalizeScheme;
            p(gVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f55430e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f55430e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f55432g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f55433h = fileInputStream;
            if (length != -1 && gVar.f130644g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(gVar.f130644g + startOffset) - startOffset;
            if (jSkip != gVar.f130644g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f55434i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f55434i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f55434i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = gVar.f130645h;
            if (jMin != -1) {
                long j11 = this.f55434i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f55434i = jMin;
            }
            this.f55435j = true;
            q(gVar);
            long j12 = gVar.f130645h;
            return j12 != -1 ? j12 : this.f55434i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55434i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) P.h(this.f55433h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f55434i;
        if (j11 != -1) {
            this.f55434i = j11 - i12;
        }
        n(i12);
        return i12;
    }
}
