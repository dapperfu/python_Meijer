package com.bumptech.glide.load.resource.bitmap;

import a7.InterfaceC5665b;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.y;
import com.fullstory.FS;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final X6.f<X6.b> f64922f = X6.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", X6.b.f41640c);

    /* renamed from: g, reason: collision with root package name */
    public static final X6.f<X6.h> f64923g = X6.f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final X6.f<o> f64924h = o.f64917h;

    /* renamed from: i, reason: collision with root package name */
    public static final X6.f<Boolean> f64925i;

    /* renamed from: j, reason: collision with root package name */
    public static final X6.f<Boolean> f64926j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<String> f64927k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f64928l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f64929m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f64930n;

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f64931a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f64932b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5665b f64933c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f64934d;

    /* renamed from: e, reason: collision with root package name */
    private final x f64935e = x.b();

    public interface b {
        void a();

        void b(a7.d dVar, Bitmap bitmap) throws IOException;
    }

    private static int[] m(y yVar, BitmapFactory.Options options, b bVar, a7.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(yVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void b(a7.d dVar, Bitmap bitmap) {
        }

        a() {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f64925i = X6.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f64926j = X6.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f64927k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f64928l = new a();
        f64929m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f64930n = r7.l.f(0);
    }

    private void b(y yVar, X6.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f64935e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == X6.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = yVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                FS.log_d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, y yVar, b bVar, a7.d dVar, o oVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int i17;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                FS.log_d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = oVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + oVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        o.g gVarA = oVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int i18 = i15;
        int i19 = i16;
        int iX = i18 / x(fB * f10);
        int iX2 = i19 / x(fB * f11);
        o.g gVar = o.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i17 = 0;
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i20 = iMax / 8;
            if (i20 > 0) {
                iFloor /= i20;
                iFloor2 /= i20;
            }
        } else {
            i17 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = iMax;
                iFloor = (int) Math.floor(f10 / f12);
                iFloor2 = (int) Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                float f13 = iMax;
                iFloor = Math.round(f10 / f13);
                iFloor2 = Math.round(f11 / f13);
            } else if (i18 % iMax == 0 && i19 % iMax == 0) {
                iFloor = i18 / iMax;
                iFloor2 = i19 / iMax;
            } else {
                int[] iArrM = m(yVar, options, bVar, dVar);
                iFloor = iArrM[0];
                iFloor2 = iArrM[1];
            }
        }
        double dB = oVar.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            int i21 = i17;
            options.inTargetDensity = i21;
            options.inDensity = i21;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            FS.log_v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private Z6.c<Bitmap> e(y yVar, int i10, int i11, X6.g gVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f64933c.c(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        X6.b bVar2 = (X6.b) gVar.a(f64922f);
        X6.h hVar = (X6.h) gVar.a(f64923g);
        o oVar = (o) gVar.a(o.f64917h);
        boolean zBooleanValue = ((Boolean) gVar.a(f64925i)).booleanValue();
        X6.f<Boolean> fVar = f64926j;
        try {
            return C6639g.e(h(yVar, optionsK, oVar, bVar2, hVar, gVar.a(fVar) != null && ((Boolean) gVar.a(fVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f64931a);
        } finally {
            v(optionsK);
            this.f64933c.put(bArr);
        }
    }

    private Bitmap h(y yVar, BitmapFactory.Options options, o oVar, X6.b bVar, X6.h hVar, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        int i12;
        String str;
        int i13;
        long jB = r7.g.b();
        int[] iArrM = m(yVar, options, bVar2, this.f64931a);
        int i14 = iArrM[0];
        int i15 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i14 == -1 || i15 == -1) ? false : z10;
        int iC = yVar.c();
        int iJ = F.j(iC);
        boolean zM = F.m(iC);
        int i16 = i10;
        if (i16 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (r(iJ)) {
            i12 = i11;
            i16 = i15;
        } else {
            i12 = i11;
            i16 = i14;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = r(iJ) ? i14 : i15;
        }
        ImageHeaderParser.ImageType imageTypeD = yVar.d();
        c(imageTypeD, yVar, bVar2, this.f64931a, oVar, iJ, i14, i15, i16, i12, options);
        int i17 = i16;
        int i18 = i12;
        b(yVar, bVar, z12, zM, options, i17, i18);
        int i19 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i14 < 0 || i15 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i20 = options.inSampleSize;
                float f11 = i20;
                int iCeil = (int) Math.ceil(i14 / f11);
                int iCeil2 = (int) Math.ceil(i15 / f11);
                int iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(iRound);
                    sb2.append("x");
                    sb2.append(iRound2);
                    i13 = iRound;
                    sb2.append("] for source [");
                    sb2.append(i14);
                    sb2.append("x");
                    sb2.append(i15);
                    sb2.append("], sampleSize: ");
                    sb2.append(i20);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    FS.log_v(str, sb2.toString());
                } else {
                    i13 = iRound;
                }
                i17 = i13;
                i18 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i17 > 0 && i18 > 0) {
                y(options, this.f64931a, i17, i18);
            }
        } else {
            str = "Downsampler";
        }
        if (hVar != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((hVar == X6.h.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(yVar, options, bVar2, this.f64931a);
        bVar2.b(this.f64931a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i14, i15, str2, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f64932b.densityDpi);
        Bitmap bitmapN = F.n(this.f64931a, bitmapI, iC);
        if (!bitmapI.equals(bitmapN)) {
            this.f64931a.c(bitmapI);
        }
        return bitmapN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.y r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.s.b r7, a7.d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.F.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.F.i()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            com.fullstory.FS.log_d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.c(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.F.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.s.i(com.bumptech.glide.load.resource.bitmap.y, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.s$b, a7.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f64930n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        FS.log_v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + r7.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, a7.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    public Z6.c<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, X6.g gVar) throws IOException {
        return e(new y.c(parcelFileDescriptor, this.f64934d, this.f64933c), i10, i11, gVar, f64928l);
    }

    public Z6.c<Bitmap> f(InputStream inputStream, int i10, int i11, X6.g gVar, b bVar) throws IOException {
        return e(new y.b(inputStream, this.f64934d, this.f64933c), i10, i11, gVar, bVar);
    }

    public Z6.c<Bitmap> g(ByteBuffer byteBuffer, int i10, int i11, X6.g gVar) throws IOException {
        return e(new y.a(byteBuffer, this.f64934d, this.f64933c), i10, i11, gVar, f64928l);
    }

    public s(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, a7.d dVar, InterfaceC5665b interfaceC5665b) {
        this.f64934d = list;
        this.f64932b = (DisplayMetrics) r7.k.d(displayMetrics);
        this.f64931a = (a7.d) r7.k.d(dVar);
        this.f64933c = (InterfaceC5665b) r7.k.d(interfaceC5665b);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f64930n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }
}
