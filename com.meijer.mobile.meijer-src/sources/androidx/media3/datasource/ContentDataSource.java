package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import d3.P;
import f3.AbstractC13946a;
import f3.g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class ContentDataSource extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f55654e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f55655f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f55656g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f55657h;

    /* renamed from: i, reason: collision with root package name */
    private long f55658i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55659j;

    public ContentDataSource(Context context) {
        super(false);
        this.f55654e = context.getContentResolver();
    }

    @Override // f3.InterfaceC13949d
    public void close() throws ContentDataSourceException {
        this.f55655f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f55657h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f55657h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f55656g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new ContentDataSourceException(e10, 2000);
                    }
                } finally {
                    this.f55656g = null;
                    if (this.f55659j) {
                        this.f55659j = false;
                        o();
                    }
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f55657h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f55656g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f55656g = null;
                    if (this.f55659j) {
                        this.f55659j = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12, 2000);
                }
            } finally {
                this.f55656g = null;
                if (this.f55659j) {
                    this.f55659j = false;
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

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f55655f;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = gVar.f131472a.normalizeScheme();
            this.f55655f = uriNormalizeScheme;
            p(gVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f55654e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f55654e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f55656g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f55657h = fileInputStream;
            if (length != -1 && gVar.f131478g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(gVar.f131478g + startOffset) - startOffset;
            if (jSkip != gVar.f131478g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f55658i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f55658i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f55658i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = gVar.f131479h;
            if (jMin != -1) {
                long j11 = this.f55658i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f55658i = jMin;
            }
            this.f55659j = true;
            q(gVar);
            long j12 = gVar.f131479h;
            return j12 != -1 ? j12 : this.f55658i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55658i;
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
        int i12 = ((FileInputStream) P.h(this.f55657h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f55658i;
        if (j11 != -1) {
            this.f55658i = j11 - i12;
        }
        n(i12);
        return i12;
    }
}
