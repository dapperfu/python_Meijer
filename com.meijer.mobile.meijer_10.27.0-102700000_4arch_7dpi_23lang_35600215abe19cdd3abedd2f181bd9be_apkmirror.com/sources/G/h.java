package G;

import C.P;
import F.EnumC3620q;
import android.os.Build;
import android.util.Pair;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    static final String[] f11164c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d, reason: collision with root package name */
    private static final j[] f11165d;

    /* renamed from: e, reason: collision with root package name */
    private static final j[] f11166e;

    /* renamed from: f, reason: collision with root package name */
    private static final j[] f11167f;

    /* renamed from: g, reason: collision with root package name */
    static final j[] f11168g;

    /* renamed from: h, reason: collision with root package name */
    private static final j[] f11169h;

    /* renamed from: i, reason: collision with root package name */
    static final j[][] f11170i;

    /* renamed from: j, reason: collision with root package name */
    static final HashSet<String> f11171j;

    /* renamed from: a, reason: collision with root package name */
    private final List<Map<String, g>> f11172a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteOrder f11173b;

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f11175c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f11176d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f11177e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        static final List<HashMap<String, j>> f11178f = Collections.list(new a());

        /* renamed from: a, reason: collision with root package name */
        final List<Map<String, g>> f11179a = Collections.list(new C0158b());

        /* renamed from: b, reason: collision with root package name */
        private final ByteOrder f11180b;

        class a implements Enumeration<HashMap<String, j>> {

            /* renamed from: a, reason: collision with root package name */
            int f11181a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, j> nextElement() {
                HashMap<String, j> map = new HashMap<>();
                for (j jVar : h.f11170i[this.f11181a]) {
                    map.put(jVar.f11197b, jVar);
                }
                this.f11181a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f11181a < h.f11170i.length;
            }

            a() {
            }
        }

        /* renamed from: G.h$b$b, reason: collision with other inner class name */
        class C0158b implements Enumeration<Map<String, g>> {

            /* renamed from: a, reason: collision with root package name */
            int f11182a = 0;

            C0158b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, g> nextElement() {
                this.f11182a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f11182a < h.f11170i.length;
            }
        }

        class c implements Enumeration<Map<String, g>> {

            /* renamed from: a, reason: collision with root package name */
            final Enumeration<Map<String, g>> f11184a;

            c() {
                this.f11184a = Collections.enumeration(b.this.f11179a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, g> nextElement() {
                return new HashMap(this.f11184a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f11184a.hasMoreElements();
            }
        }

        private static Pair<Integer, Integer> b(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i10]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains(q2.f92724c)) {
                try {
                    try {
                        long j10 = Long.parseLong(str);
                        return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split(q2.f92724c, -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j11 >= 0 && j12 >= 0) {
                        if (j11 <= 2147483647L && j12 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        private void e(java.lang.String r17, java.lang.String r18, java.util.List<java.util.Map<java.lang.String, G.g>> r19) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: G.h.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public h a() throws NumberFormatException {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f11180b, list);
        }

        public b c(String str, String str2) throws NumberFormatException {
            e(str, str2, this.f11179a);
            return this;
        }

        public b g(EnumC3620q enumC3620q) {
            int i10;
            if (enumC3620q == EnumC3620q.UNKNOWN) {
                return this;
            }
            int i11 = a.f11174a[enumC3620q.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    P.l("ExifData", "Unknown flash state: " + enumC3620q);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new k((long) (f10 * 1000.0f), 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                P.l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        b(ByteOrder byteOrder) {
            this.f11180b = byteOrder;
        }

        private void d(String str, String str2, List<Map<String, g>> list) throws NumberFormatException {
            Iterator<Map<String, g>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        public b n(c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    strValueOf = null;
                } else {
                    strValueOf = String.valueOf(1);
                }
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11174a;

        static {
            int[] iArr = new int[EnumC3620q.values().length];
            f11174a = iArr;
            try {
                iArr[EnumC3620q.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11174a[EnumC3620q.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11174a[EnumC3620q.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", HttpResponseStatus.REDIRECTION_USE_PROXY, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f11165d = jVarArr;
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j("DateTimeOriginal", 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j("FlashpixVersion", 40960, 7), new j("ColorSpace", 40961, 3), new j("PixelXDimension", 40962, 3, 4), new j("PixelYDimension", 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j("ExposureMode", 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        f11166e = jVarArr2;
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f11167f = jVarArr3;
        f11168g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j("InteroperabilityIndex", 1, 2)};
        f11169h = jVarArr4;
        f11170i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f11171j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    Map<String, g> c(int i10) {
        o2.i.c(i10, 0, f11170i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f11172a.get(i10);
    }

    public ByteOrder d() {
        return this.f11173b;
    }

    h(ByteOrder byteOrder, List<Map<String, g>> list) {
        boolean z10;
        if (list.size() == f11170i.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "Malformed attributes list. Number of IFDs mismatch.");
        this.f11173b = byteOrder;
        this.f11172a = list;
    }

    public static h b(androidx.camera.core.n nVar, int i10) {
        b bVarA = a();
        if (nVar.S2() != null) {
            nVar.S2().b(bVarA);
        }
        bVarA.m(i10);
        return bVarA.j(nVar.getWidth()).i(nVar.getHeight()).a();
    }
}
