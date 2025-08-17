package com.bumptech.glide.load.resource.bitmap;

import V6.f;
import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class I<T> implements V6.i<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final V6.f<Long> f64044d = V6.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final V6.f<Integer> f64045e = V6.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f64046f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f64047g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e<T> f64048a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.d f64049b;

    /* renamed from: c, reason: collision with root package name */
    private final f f64050c;

    class b implements f.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f64052a = ByteBuffer.allocate(4);

        @Override // V6.f.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f64052a) {
                this.f64052a.position(0);
                messageDigest.update(this.f64052a.putInt(num.intValue()).array());
            }
        }

        b() {
        }
    }

    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class d implements e<ByteBuffer> {

        class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f64053a;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            a(ByteBuffer byteBuffer) {
                this.f64053a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f64053a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f64053a.limit()) {
                    return -1;
                }
                this.f64053a.position((int) j10);
                int iMin = Math.min(i11, this.f64053a.remaining());
                this.f64053a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e<T> {
        void a(MediaExtractor mediaExtractor, T t10) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }

        f() {
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    I(Y6.d dVar, e<T> eVar) {
        this(dVar, eVar, f64046f);
    }

    @Override // V6.i
    public boolean a(T t10, V6.g gVar) {
        return true;
    }

    class a implements f.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f64051a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // V6.f.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f64051a) {
                this.f64051a.position(0);
                messageDigest.update(this.f64051a.putLong(l10.longValue()).array());
            }
        }
    }

    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    I(Y6.d dVar, e<T> eVar, f fVar) {
        this.f64049b = dVar;
        this.f64048a = eVar;
        this.f64050c = fVar;
    }

    public static V6.i<AssetFileDescriptor, Bitmap> c(Y6.d dVar) {
        return new I(dVar, new c(null));
    }

    public static V6.i<ByteBuffer, Bitmap> d(Y6.d dVar) {
        return new I(dVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        FS.log_d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                FS.log_d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, o oVar) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = oVar.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            FS.log_d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f64047g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(T t10, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f64048a.a(mediaExtractor2, t10);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th3) {
            th = th3;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    FS.log_d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static V6.i<ParcelFileDescriptor, Bitmap> m(Y6.d dVar) {
        return new I(dVar, new g());
    }

    @Override // V6.i
    public X6.c<Bitmap> b(T t10, int i10, int i11, V6.g gVar) throws Exception {
        long jLongValue = ((Long) gVar.a(f64044d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) gVar.a(f64045e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) gVar.a(o.f64077h);
        if (oVar == null) {
            oVar = o.f64076g;
        }
        o oVar2 = oVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f64050c.a();
        try {
            this.f64048a.b(mediaMetadataRetrieverA, t10);
            try {
                Bitmap bitmapF = f(t10, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, oVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    X2.f.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return C6514g.e(bitmapF, this.f64049b);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    X2.f.a(mediaMetadataRetrieverA);
                    throw th3;
                }
                mediaMetadataRetrieverA.release();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private Bitmap f(T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, o oVar) {
        Bitmap bitmapG;
        if (!l(t10, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && oVar != o.f64075f) {
                bitmapG = h(mediaMetadataRetriever, j10, i10, i11, i12, oVar);
            } else {
                bitmapG = null;
            }
            if (bitmapG == null) {
                bitmapG = g(mediaMetadataRetriever, j10, i10);
            }
            Bitmap bitmapE = e(mediaMetadataRetriever, bitmapG);
            if (bitmapE != null) {
                return bitmapE;
            }
            throw new h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }
}
