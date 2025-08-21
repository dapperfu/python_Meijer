package G;

import C.P;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11072c = "f";

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f11073d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f11074e = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f11075f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f11076g = i();

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f11077h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f11078a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11079b = false;

    class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }

        a() {
        }
    }

    class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }

        b() {
        }
    }

    class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }

        c() {
        }
    }

    private static final class d {

        static final class a {

            /* renamed from: a, reason: collision with root package name */
            final double f11080a;

            double a() {
                return this.f11080a / 2.23694d;
            }

            a(double d10) {
                this.f11080a = d10;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private static Date a(String str) throws ParseException {
        return f11073d.get().parse(str);
    }

    private static Date b(String str) throws ParseException {
        return f11075f.get().parse(str);
    }

    private static Date c(String str) throws ParseException {
        return f11074e.get().parse(str);
    }

    public static f f(String str) throws IOException {
        return new f(new androidx.exifinterface.media.a(str));
    }

    public static f h(InputStream inputStream) throws IOException {
        return new f(new androidx.exifinterface.media.a(inputStream));
    }

    public static List<String> i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return s(str + " " + str2);
    }

    public void d(f fVar) throws NumberFormatException {
        ArrayList<String> arrayList = new ArrayList(f11076g);
        arrayList.removeAll(f11077h);
        for (String str : arrayList) {
            String strD = this.f11078a.d(str);
            String strD2 = fVar.f11078a.d(str);
            if (strD != null && !strD.equals(strD2)) {
                fVar.f11078a.R(str, strD);
            }
        }
    }

    public String j() {
        return this.f11078a.d("ImageDescription");
    }

    public int k() {
        return this.f11078a.f("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location l() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f11078a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.d(r2)
            androidx.exifinterface.media.a r2 = r0.f11078a
            double[] r2 = r2.j()
            androidx.exifinterface.media.a r3 = r0.f11078a
            r4 = 0
            double r6 = r3.c(r4)
            androidx.exifinterface.media.a r3 = r0.f11078a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.e(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f11078a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.d(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            androidx.exifinterface.media.a r11 = r0.f11078a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.d(r12)
            androidx.exifinterface.media.a r12 = r0.f11078a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.d(r13)
            long r11 = r0.t(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = G.f.f11072c
        L49:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            r13.setAltitude(r6)
        L61:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L8a
            r2 = 77
            if (r1 == r2) goto L80
            r2 = 78
            if (r1 == r2) goto L76
            goto L92
        L76:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = r14
            goto L93
        L80:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L93
        L8a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L92
            r1 = 2
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La9
            if (r1 == r14) goto La0
            G.f$d$a r1 = G.f.d.a(r8)
            double r1 = r1.a()
            goto Lb1
        La0:
            G.f$d$a r1 = G.f.d.b(r8)
            double r1 = r1.a()
            goto Lb1
        La9:
            G.f$d$a r1 = G.f.d.c(r8)
            double r1 = r1.a()
        Lb1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        Lb5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            r13.setTime(r11)
        Lbe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: G.f.l():android.location.Location");
    }

    public int m() {
        return this.f11078a.f("Orientation", 0);
    }

    public long o() throws NumberFormatException {
        long jS = s(this.f11078a.d("DateTimeOriginal"));
        if (jS == -1) {
            return -1L;
        }
        String strD = this.f11078a.d("SubSecTimeOriginal");
        if (strD == null) {
            return jS;
        }
        try {
            long j10 = Long.parseLong(strD);
            while (j10 > 1000) {
                j10 /= 10;
            }
            return jS + j10;
        } catch (NumberFormatException unused) {
            return jS;
        }
    }

    public int p() {
        return this.f11078a.f("ImageWidth", 0);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(p()), Integer.valueOf(k()), Integer.valueOf(n()), Boolean.valueOf(r()), Boolean.valueOf(q()), l(), Long.valueOf(o()), j());
    }

    public void u(int i10) throws NumberFormatException {
        if (i10 % 90 != 0) {
            P.l(f11072c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f11078a.R("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int iM = m();
        while (i11 < 0) {
            i11 += 90;
            switch (iM) {
                case 2:
                    iM = 5;
                    break;
                case 3:
                case 8:
                    iM = 6;
                    break;
                case 4:
                    iM = 7;
                    break;
                case 5:
                    iM = 4;
                    break;
                case 6:
                    iM = 1;
                    break;
                case 7:
                    iM = 2;
                    break;
                default:
                    iM = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iM) {
                case 2:
                    iM = 7;
                    break;
                case 3:
                    iM = 8;
                    break;
                case 4:
                    iM = 5;
                    break;
                case 5:
                    iM = 2;
                    break;
                case 6:
                    iM = 3;
                    break;
                case 7:
                    iM = 4;
                    break;
                case 8:
                    iM = 1;
                    break;
                default:
                    iM = 6;
                    break;
            }
        }
        this.f11078a.R("Orientation", String.valueOf(iM));
    }

    private f(androidx.exifinterface.media.a aVar) {
        this.f11078a = aVar;
    }

    public static f e(File file) throws IOException {
        return f(file.toString());
    }

    public static f g(androidx.camera.core.n nVar) throws IOException {
        ByteBuffer byteBufferE = nVar.getPlanes()[0].e();
        byteBufferE.rewind();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.get(bArr);
        return h(new ByteArrayInputStream(bArr));
    }

    public int n() {
        switch (m()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public boolean q() {
        if (m() != 2) {
            return false;
        }
        return true;
    }

    public boolean r() {
        int iM = m();
        if (iM == 4 || iM == 5 || iM == 7) {
            return true;
        }
        return false;
    }
}
