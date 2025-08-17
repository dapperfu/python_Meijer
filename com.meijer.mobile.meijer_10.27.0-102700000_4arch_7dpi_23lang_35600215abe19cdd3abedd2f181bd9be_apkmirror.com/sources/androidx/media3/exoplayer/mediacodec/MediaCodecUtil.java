package androidx.media3.exoplayer.mediacodec;

import Be.C2957c;
import Ce.L;
import a3.t;
import a3.z;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import d3.C13474i;
import d3.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<b, List<j>> f56428a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static int f56429b = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f56430a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56431b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f56432c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f56430a, bVar.f56430a) && this.f56431b == bVar.f56431b && this.f56432c == bVar.f56432c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f56430a.hashCode() + 31) * 31) + (this.f56431b ? 1231 : 1237)) * 31) + (this.f56432c ? 1231 : 1237);
        }

        public b(String str, boolean z10, boolean z11) {
            this.f56430a = str;
            this.f56431b = z10;
            this.f56432c = z11;
        }
    }

    private interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }
    }

    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f56433a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f56434b;

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }

        private void f() {
            if (this.f56434b == null) {
                this.f56434b = new MediaCodecList(this.f56433a).getCodecInfos();
            }
        }

        public e(boolean z10, boolean z11, boolean z12) {
            int i10;
            if (!z10 && !z11 && !z12) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f56433a = i10;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            f();
            return this.f56434b[i10];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f56434b.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t10);
    }

    private static <T> void A(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.a(fVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int b(j jVar) {
        return (jVar.f56500i ? 2 : 0) + (!jVar.f56501j ? 1 : 0);
    }

    public static /* synthetic */ int d(j jVar) {
        String str = jVar.f56492a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (P.f127086a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List<j> list) {
        if ("audio/raw".equals(str)) {
            if (P.f127086a < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).f56492a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(j.D("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            A(list, new f() { // from class: androidx.media3.exoplayer.mediacodec.m
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.d((j) obj);
                }
            });
        }
        if (P.f127086a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f56492a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static String f(t tVar) {
        Pair<Integer, Integer> pairI;
        if ("audio/eac3-joc".equals(tVar.f43949o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(tVar.f43949o) && (pairI = i(tVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(tVar.f43949o)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List<j> k(String str, boolean z10, boolean z11) throws DecoderQueryException {
        try {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<j>> map = f56428a;
            List<j> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<j> arrayListL = l(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListL.isEmpty() && P.f127086a <= 23) {
                arrayListL = l(bVar, new d());
                if (!arrayListL.isEmpty()) {
                    d3.r.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListL.get(0).f56492a);
                }
            }
            e(str, arrayListL);
            L lS = L.s(arrayListL);
            map.put(bVar, lS);
            return lS;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.j> l(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b r19, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.l(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    public static List<j> m(l lVar, t tVar, boolean z10, boolean z11) throws DecoderQueryException {
        List<j> listB = lVar.b(tVar.f43949o, z10, z11);
        return L.p().j(listB).j(g(lVar, tVar, z10, z11)).k();
    }

    public static List<j> n(List<j> list, final t tVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: androidx.media3.exoplayer.mediacodec.n
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.c(tVar, (j) obj);
            }
        });
        return arrayList;
    }

    public static List<j> o(List<j> list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: androidx.media3.exoplayer.mediacodec.o
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.b((j) obj);
            }
        });
        return L.s(arrayList);
    }

    public static j p() throws DecoderQueryException {
        return j("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> q(t tVar) {
        String strH = e3.f.h(tVar.f43952r);
        if (strH == null) {
            return null;
        }
        return C13474i.q(strH, P.c1(strH.trim(), "\\."), tVar.f43922C);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return P.f127086a >= 29 && s(mediaCodecInfo);
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return P.f127086a >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (P.f127086a >= 29) {
            return x(mediaCodecInfo);
        }
        if (z.n(str)) {
            return true;
        }
        String strE = C2957c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (P.f127086a >= 29) {
            return z(mediaCodecInfo);
        }
        String strE = C2957c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int c(t tVar, j jVar) {
        return jVar.n(tVar) ? 1 : 0;
    }

    public static List<j> g(l lVar, t tVar, boolean z10, boolean z11) throws DecoderQueryException {
        String strF = f(tVar);
        if (strF == null) {
            return L.x();
        }
        return lVar.b(strF, z10, z11);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> i(t tVar) {
        return C13474i.n(tVar);
    }

    public static j j(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<j> listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return listK.get(0);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = P.f127086a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
