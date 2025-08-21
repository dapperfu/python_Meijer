package l3;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import d3.P;
import f3.C13948c;
import f3.C13951f;
import f3.g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15452f {

    /* renamed from: l3.f$b */
    public interface b {
        AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        ImaSdkSettings c();

        FriendlyObstruction d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

        AdsRenderingSettings e();

        AdsRequest f();

        AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer);
    }

    public static FriendlyObstructionPurpose c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? FriendlyObstructionPurpose.OTHER : FriendlyObstructionPurpose.NOT_VISIBLE : FriendlyObstructionPurpose.CLOSE_AD : FriendlyObstructionPurpose.VIDEO_CONTROLS;
    }

    /* renamed from: l3.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f149276a;

        /* renamed from: b, reason: collision with root package name */
        public final int f149277b;

        /* renamed from: c, reason: collision with root package name */
        public final int f149278c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f149279d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f149280e;

        /* renamed from: f, reason: collision with root package name */
        public final int f149281f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f149282g;

        /* renamed from: h, reason: collision with root package name */
        public final List<String> f149283h;

        /* renamed from: i, reason: collision with root package name */
        public final Set<UiElement> f149284i;

        /* renamed from: j, reason: collision with root package name */
        public final Collection<CompanionAdSlot> f149285j;

        /* renamed from: k, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f149286k;

        /* renamed from: l, reason: collision with root package name */
        public final AdEvent.AdEventListener f149287l;

        /* renamed from: m, reason: collision with root package name */
        public final VideoAdPlayer.VideoAdPlayerCallback f149288m;

        /* renamed from: n, reason: collision with root package name */
        public final ImaSdkSettings f149289n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f149290o;

        public a(long j10, int i10, int i11, boolean z10, boolean z11, int i12, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z12) {
            this.f149276a = j10;
            this.f149277b = i10;
            this.f149278c = i11;
            this.f149279d = z10;
            this.f149280e = z11;
            this.f149281f = i12;
            this.f149282g = bool;
            this.f149283h = list;
            this.f149284i = set;
            this.f149285j = collection;
            this.f149286k = adErrorListener;
            this.f149287l = adEventListener;
            this.f149288m = videoAdPlayerCallback;
            this.f149289n = imaSdkSettings;
            this.f149290o = z12;
        }
    }

    public static String e(VideoProgressUpdate videoProgressUpdate) {
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate) ? "not ready" : P.F("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    public static long[] a(List<Float> list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            double dFloatValue = list.get(i11).floatValue();
            if (dFloatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i10] = Math.round(dFloatValue * 1000000.0d);
                i10++;
            }
        }
        Arrays.sort(jArr, 0, i10);
        return jArr;
    }

    public static AdsRequest b(b bVar, g gVar) throws IOException {
        AdsRequest adsRequestF = bVar.f();
        if ("data".equals(gVar.f131472a.getScheme())) {
            C13948c c13948c = new C13948c();
            try {
                c13948c.h(gVar);
                adsRequestF.setAdsResponse(P.G(C13951f.b(c13948c)));
                return adsRequestF;
            } finally {
                c13948c.close();
            }
        }
        adsRequestF.setAdTagUrl(gVar.f131472a.toString());
        return adsRequestF;
    }

    public static Looper d() {
        return Looper.getMainLooper();
    }

    public static boolean f(AdError adError) {
        if (adError.getErrorCode() != AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH && adError.getErrorCode() != AdError.AdErrorCode.UNKNOWN_ERROR) {
            return false;
        }
        return true;
    }
}
