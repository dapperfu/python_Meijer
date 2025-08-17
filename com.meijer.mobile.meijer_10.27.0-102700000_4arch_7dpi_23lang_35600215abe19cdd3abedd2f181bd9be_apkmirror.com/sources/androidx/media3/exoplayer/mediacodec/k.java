package androidx.media3.exoplayer.mediacodec;

import a3.t;
import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import d3.P;
import java.util.List;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f56504a;

    private static final class a {
        private static int b(boolean z10) {
            List supportedPerformancePoints;
            try {
                t tVarN = new t.b().u0("video/avc").N();
                if (tVarN.f43949o != null) {
                    List<j> listM = MediaCodecUtil.m(l.f56505a, tVarN, z10, false);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        if (listM.get(i10).f56495d != null && listM.get(i10).f56495d.getVideoCapabilities() != null && (supportedPerformancePoints = listM.get(i10).f56495d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            n3.k.a();
                            return c(supportedPerformancePoints, n3.j.a(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (n3.m.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (P.f127086a >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            return iB2 == 0 ? iB != 2 : (iB == 2 && iB2 == 2) ? false : true;
        }

        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            n3.k.a();
            int iC = c(supportedPerformancePoints, n3.j.a(i10, i11, (int) d10));
            if (iC == 1 && k.f56504a == null) {
                Boolean unused = k.f56504a = Boolean.valueOf(d());
                if (k.f56504a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (P.f127086a < 29) {
            return 0;
        }
        Boolean bool = f56504a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
