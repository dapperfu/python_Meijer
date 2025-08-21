package androidx.media3.exoplayer.mediacodec;

import a3.C5653j;
import a3.t;
import a3.z;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;
import d3.P;
import h3.C14447c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f56716a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56717b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56718c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f56719d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56720e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56721f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56722g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56723h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56724i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56725j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f56726k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f56727l;

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((P.f127888a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        d3.r.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static boolean A(String str) {
        if (P.f127888a > 22) {
            return false;
        }
        String str2 = Build.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean B(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean C(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static j D(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new j(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || A(str)) ? false : true, codecCapabilities != null && t(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)), m(codecCapabilities));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i10 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(t tVar) {
        return (Objects.equals(tVar.f44767o, "audio/flac") && tVar.f44744G == 22 && P.f127888a < 34 && this.f56716a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return P.f127888a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !z();
    }

    private boolean q(t tVar) {
        return this.f56717b.equals(tVar.f44767o) || this.f56717b.equals(MediaCodecUtil.f(tVar));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        d3.r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f56716a + ", " + this.f56717b + "] [" + P.f127892e + "]");
    }

    private void w(String str) {
        d3.r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f56716a + ", " + this.f56717b + "] [" + P.f127892e + "]");
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56719d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C14447c e(t tVar, t tVar2) {
        t tVar3;
        t tVar4;
        int i10 = !Objects.equals(tVar.f44767o, tVar2.f44767o) ? 8 : 0;
        if (this.f56727l) {
            if (tVar.f44777y != tVar2.f44777y) {
                i10 |= 1024;
            }
            if (!this.f56720e && (tVar.f44774v != tVar2.f44774v || tVar.f44775w != tVar2.f44775w)) {
                i10 |= 512;
            }
            if ((!C5653j.h(tVar.f44740C) || !C5653j.h(tVar2.f44740C)) && !Objects.equals(tVar.f44740C, tVar2.f44740C)) {
                i10 |= RecyclerView.m.FLAG_MOVED;
            }
            if (y(this.f56716a) && !tVar.f(tVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C14447c(this.f56716a, tVar, tVar2, tVar.f(tVar2) ? 3 : 2, 0);
            }
            tVar3 = tVar;
            tVar4 = tVar2;
        } else {
            tVar3 = tVar;
            tVar4 = tVar2;
            if (tVar3.f44742E != tVar4.f44742E) {
                i10 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (tVar3.f44743F != tVar4.f44743F) {
                i10 |= 8192;
            }
            if (tVar3.f44744G != tVar4.f44744G) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f56717b)) {
                Pair<Integer, Integer> pairI = MediaCodecUtil.i(tVar3);
                Pair<Integer, Integer> pairI2 = MediaCodecUtil.i(tVar4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C14447c(this.f56716a, tVar3, tVar4, 3, 0);
                    }
                }
            }
            if (!tVar3.f(tVar4)) {
                i10 |= 32;
            }
            if (x(this.f56717b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C14447c(this.f56716a, tVar3, tVar4, 1, 0);
            }
        }
        return new C14447c(this.f56716a, tVar3, tVar4, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56719d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56719d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f56716a, this.f56717b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        w("channelCount.support, " + i10);
        return false;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56719d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        w("sampleRate.support, " + i10);
        return false;
    }

    public boolean p() {
        if (P.f127888a >= 29 && "video/x-vnd.on2.vp9".equals(this.f56717b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(t tVar) {
        if (this.f56727l) {
            return this.f56720e;
        }
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(tVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f56716a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56719d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (P.f127888a >= 29) {
            int iC = k.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                w("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !C(this.f56716a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }

    j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f56716a = (String) C13599a.e(str);
        this.f56717b = str2;
        this.f56718c = str3;
        this.f56719d = codecCapabilities;
        this.f56723h = z10;
        this.f56724i = z11;
        this.f56725j = z12;
        this.f56720e = z13;
        this.f56721f = z14;
        this.f56722g = z15;
        this.f56726k = z16;
        this.f56727l = z.q(str2);
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(P.j(i10, widthAlignment) * widthAlignment, P.j(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private boolean k(t tVar, boolean z10) {
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(tVar);
        String str = tVar.f44767o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strR = z.r(this.f56718c);
            if (strR.equals("video/mv-hevc")) {
                return true;
            }
            if (strR.equals("video/hevc")) {
                pairI = MediaCodecUtil.q(tVar);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(tVar.f44767o)) {
            String str2 = this.f56717b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f56727l && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (P.f127888a <= 23 && "video/x-vnd.on2.vp9".equals(this.f56717b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.f56719d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !B(this.f56717b, iIntValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + tVar.f44763k + ", " + this.f56718c);
        return false;
    }

    public boolean n(t tVar) {
        if (!q(tVar) || !k(tVar, false) || !l(tVar)) {
            return false;
        }
        return true;
    }

    public boolean o(t tVar) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        int i11;
        if (!q(tVar) || !k(tVar, true) || !l(tVar)) {
            return false;
        }
        if (this.f56727l) {
            int i12 = tVar.f44774v;
            if (i12 <= 0 || (i11 = tVar.f44775w) <= 0) {
                return true;
            }
            return u(i12, i11, tVar.f44776x);
        }
        int i13 = tVar.f44743F;
        if ((i13 != -1 && !j(i13)) || ((i10 = tVar.f44742E) != -1 && !i(i10))) {
            return false;
        }
        return true;
    }
}
