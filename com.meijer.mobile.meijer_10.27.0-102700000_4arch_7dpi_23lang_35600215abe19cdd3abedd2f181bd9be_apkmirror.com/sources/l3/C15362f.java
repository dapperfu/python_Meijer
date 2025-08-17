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
import f3.C13838c;
import f3.C13841f;
import f3.g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15362f {

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
        public final long f148489a;

        /* renamed from: b, reason: collision with root package name */
        public final int f148490b;

        /* renamed from: c, reason: collision with root package name */
        public final int f148491c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f148492d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f148493e;

        /* renamed from: f, reason: collision with root package name */
        public final int f148494f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f148495g;

        /* renamed from: h, reason: collision with root package name */
        public final List<String> f148496h;

        /* renamed from: i, reason: collision with root package name */
        public final Set<UiElement> f148497i;

        /* renamed from: j, reason: collision with root package name */
        public final Collection<CompanionAdSlot> f148498j;

        /* renamed from: k, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f148499k;

        /* renamed from: l, reason: collision with root package name */
        public final AdEvent.AdEventListener f148500l;

        /* renamed from: m, reason: collision with root package name */
        public final VideoAdPlayer.VideoAdPlayerCallback f148501m;

        /* renamed from: n, reason: collision with root package name */
        public final ImaSdkSettings f148502n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f148503o;

        public a(long j10, int i10, int i11, boolean z10, boolean z11, int i12, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z12) {
            this.f148489a = j10;
            this.f148490b = i10;
            this.f148491c = i11;
            this.f148492d = z10;
            this.f148493e = z11;
            this.f148494f = i12;
            this.f148495g = bool;
            this.f148496h = list;
            this.f148497i = set;
            this.f148498j = collection;
            this.f148499k = adErrorListener;
            this.f148500l = adEventListener;
            this.f148501m = videoAdPlayerCallback;
            this.f148502n = imaSdkSettings;
            this.f148503o = z12;
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
        if ("data".equals(gVar.f130638a.getScheme())) {
            C13838c c13838c = new C13838c();
            try {
                c13838c.h(gVar);
                adsRequestF.setAdsResponse(P.G(C13841f.b(c13838c)));
                return adsRequestF;
            } finally {
                c13838c.close();
            }
        }
        adsRequestF.setAdTagUrl(gVar.f130638a.toString());
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
