package l3;

import Ce.H;
import Ce.InterfaceC3016h;
import a3.B;
import a3.C5561a;
import a3.C5562b;
import a3.F;
import a3.InterfaceC5563c;
import a3.v;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.maps.android.BuildConfig;
import d3.C13466a;
import d3.P;
import d3.r;
import f3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import l3.C15362f;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15360d implements B.d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f148412A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f148413B;

    /* renamed from: C, reason: collision with root package name */
    private int f148414C;

    /* renamed from: D, reason: collision with root package name */
    private AdMediaInfo f148415D;

    /* renamed from: E, reason: collision with root package name */
    private b f148416E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f148417F;

    /* renamed from: G, reason: collision with root package name */
    private String f148418G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f148419H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f148420I;

    /* renamed from: J, reason: collision with root package name */
    private int f148421J;

    /* renamed from: K, reason: collision with root package name */
    private b f148422K;

    /* renamed from: L, reason: collision with root package name */
    private long f148423L;

    /* renamed from: M, reason: collision with root package name */
    private long f148424M;

    /* renamed from: N, reason: collision with root package name */
    private long f148425N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f148426O;

    /* renamed from: P, reason: collision with root package name */
    private long f148427P;

    /* renamed from: a, reason: collision with root package name */
    private final C15362f.a f148428a;

    /* renamed from: b, reason: collision with root package name */
    private final C15362f.b f148429b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f148430c;

    /* renamed from: d, reason: collision with root package name */
    private final g f148431d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f148432e;

    /* renamed from: f, reason: collision with root package name */
    private final F.b f148433f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f148434g;

    /* renamed from: h, reason: collision with root package name */
    private final c f148435h;

    /* renamed from: i, reason: collision with root package name */
    private final List<a.InterfaceC1127a> f148436i;

    /* renamed from: j, reason: collision with root package name */
    private final List<VideoAdPlayer.VideoAdPlayerCallback> f148437j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f148438k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3016h<AdMediaInfo, b> f148439l;

    /* renamed from: m, reason: collision with root package name */
    private final AdDisplayContainer f148440m;

    /* renamed from: n, reason: collision with root package name */
    private final AdsLoader f148441n;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f148442o;

    /* renamed from: p, reason: collision with root package name */
    private Object f148443p;

    /* renamed from: q, reason: collision with root package name */
    private B f148444q;

    /* renamed from: r, reason: collision with root package name */
    private VideoProgressUpdate f148445r;

    /* renamed from: s, reason: collision with root package name */
    private VideoProgressUpdate f148446s;

    /* renamed from: t, reason: collision with root package name */
    private int f148447t;

    /* renamed from: u, reason: collision with root package name */
    private AdsManager f148448u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f148449v;

    /* renamed from: w, reason: collision with root package name */
    private AdsMediaSource.AdLoadException f148450w;

    /* renamed from: x, reason: collision with root package name */
    private F f148451x;

    /* renamed from: y, reason: collision with root package name */
    private long f148452y;

    /* renamed from: z, reason: collision with root package name */
    private C5562b f148453z;

    /* renamed from: l3.d$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f148455a;

        /* renamed from: b, reason: collision with root package name */
        public final int f148456b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f148455a == bVar.f148455a && this.f148456b == bVar.f148456b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f148455a * 31) + this.f148456b;
        }

        public String toString() {
            return "(" + this.f148455a + ", " + this.f148456b + ')';
        }

        public b(int i10, int i11) {
            this.f148455a = i10;
            this.f148456b = i11;
        }
    }

    /* renamed from: l3.d$c */
    private final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        private c() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void release() {
        }

        /* synthetic */ c(C15360d c15360d, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            C15360d.this.f148437j.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate videoProgressUpdateS0 = C15360d.this.s0();
            if (C15360d.this.f148428a.f148503o) {
                r.b("AdTagLoader", "Content progress: " + C15362f.e(videoProgressUpdateS0));
            }
            if (C15360d.this.f148427P != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - C15360d.this.f148427P >= 4000) {
                    C15360d.this.f148427P = -9223372036854775807L;
                    C15360d.this.w0(new IOException("Ad preloading timed out"));
                    C15360d.this.k1();
                    return videoProgressUpdateS0;
                }
            } else if (C15360d.this.f148425N != -9223372036854775807L && C15360d.this.f148444q != null && C15360d.this.f148444q.U() == 2 && C15360d.this.f1()) {
                C15360d.this.f148427P = SystemClock.elapsedRealtime();
            }
            return videoProgressUpdateS0;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return C15360d.this.u0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                C15360d.this.g1(adMediaInfo, adPodInfo);
            } catch (RuntimeException e10) {
                C15360d.this.j1("loadAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                C15360d.this.m1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15360d.this.j1("pauseAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                C15360d.this.o1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15360d.this.j1("playAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            C15360d.this.f148437j.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                C15360d.this.u1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15360d.this.j1("stopAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (C15360d.this.f148428a.f148503o) {
                r.c("AdTagLoader", "onAdError", error);
            }
            if (C15360d.this.f148448u == null) {
                C15360d.this.f148443p = null;
                C15360d.this.f148453z = new C5562b(C15360d.this.f148432e, new long[0]);
                C15360d.this.w1();
            } else if (C15362f.f(error)) {
                try {
                    C15360d.this.w0(error);
                } catch (RuntimeException e10) {
                    C15360d.this.j1("onAdError", e10);
                }
            }
            if (C15360d.this.f148450w == null) {
                C15360d.this.f148450w = AdsMediaSource.AdLoadException.c(error);
            }
            C15360d.this.k1();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (C15360d.this.f148428a.f148503o && type != AdEvent.AdEventType.AD_PROGRESS) {
                r.b("AdTagLoader", "onAdEvent: " + type);
            }
            try {
                C15360d.this.v0(adEvent);
            } catch (RuntimeException e10) {
                C15360d.this.j1("onAdEvent", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (Objects.equals(C15360d.this.f148443p, adsManagerLoadedEvent.getUserRequestContext())) {
                C15360d.this.f148443p = null;
                C15360d.this.f148448u = adsManager;
                adsManager.addAdErrorListener(this);
                if (C15360d.this.f148428a.f148499k != null) {
                    adsManager.addAdErrorListener(C15360d.this.f148428a.f148499k);
                }
                adsManager.addAdEventListener(this);
                if (C15360d.this.f148428a.f148500l != null) {
                    adsManager.addAdEventListener(C15360d.this.f148428a.f148500l);
                }
                try {
                    C15360d.this.f148453z = new C5562b(C15360d.this.f148432e, C15362f.a(adsManager.getAdCuePoints()));
                    C15360d.this.w1();
                    return;
                } catch (RuntimeException e10) {
                    C15360d.this.j1("onAdsManagerLoaded", e10);
                    return;
                }
            }
            adsManager.destroy();
        }
    }

    private void n1() {
        this.f148414C = 0;
        if (this.f148426O) {
            this.f148425N = -9223372036854775807L;
            this.f148426O = false;
        }
    }

    private int o0(double d10) {
        long jRound = Math.round(((float) d10) * 1000000.0d);
        int i10 = 0;
        while (true) {
            C5562b c5562b = this.f148453z;
            if (i10 >= c5562b.f43784b) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j10 = c5562b.c(i10).f43800a;
            if (j10 != Long.MIN_VALUE && Math.abs(j10 - jRound) < 1000) {
                return i10;
            }
            i10++;
        }
    }

    private void s1() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f148437j.size(); i11++) {
            this.f148437j.get(i11).onContentComplete();
        }
        this.f148417F = true;
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "adsLoader.contentComplete");
        }
        while (true) {
            C5562b c5562b = this.f148453z;
            if (i10 >= c5562b.f43784b) {
                w1();
                return;
            } else {
                if (c5562b.c(i10).f43800a != Long.MIN_VALUE) {
                    this.f148453z = this.f148453z.q(i10);
                }
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        for (int i10 = 0; i10 < this.f148436i.size(); i10++) {
            this.f148436i.get(i10).a(this.f148453z);
        }
    }

    /* renamed from: l3.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f148454a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f148454a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f148454a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f148454a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f148454a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f148454a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f148454a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f148454a[AdEvent.AdEventType.LOADED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void C0() {
        B b10 = this.f148444q;
        if (this.f148448u == null || b10 == null) {
            return;
        }
        if (!this.f148419H && !b10.j()) {
            m0();
            if (!this.f148417F && !this.f148451x.q()) {
                long jR0 = r0(b10, this.f148451x, this.f148433f);
                this.f148451x.f(b10.J(), this.f148433f);
                if (this.f148433f.e(P.M0(jR0)) != -1) {
                    this.f148426O = false;
                    this.f148425N = jR0;
                }
            }
        }
        boolean z10 = this.f148419H;
        int i10 = this.f148421J;
        boolean zJ = b10.j();
        this.f148419H = zJ;
        int iO = zJ ? b10.O() : -1;
        this.f148421J = iO;
        if (z10 && iO != i10) {
            AdMediaInfo adMediaInfo = this.f148415D;
            if (adMediaInfo == null) {
                r.i("AdTagLoader", "onEnded without ad media info");
            } else {
                b bVar = this.f148439l.get(adMediaInfo);
                int i11 = this.f148421J;
                if (i11 == -1 || (bVar != null && bVar.f148456b < i11)) {
                    for (int i12 = 0; i12 < this.f148437j.size(); i12++) {
                        this.f148437j.get(i12).onEnded(adMediaInfo);
                    }
                    if (this.f148428a.f148503o) {
                        r.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                    }
                }
            }
        }
        if (!this.f148417F && !z10 && this.f148419H && this.f148414C == 0) {
            C5562b.a aVarC = this.f148453z.c(b10.u());
            if (aVarC.f43800a == Long.MIN_VALUE) {
                s1();
            } else {
                this.f148423L = SystemClock.elapsedRealtime();
                long jJ1 = P.j1(aVarC.f43800a);
                this.f148424M = jJ1;
                if (jJ1 == Long.MIN_VALUE) {
                    this.f148424M = this.f148452y;
                }
            }
        }
        if (e1()) {
            this.f148434g.removeCallbacks(this.f148442o);
            this.f148434g.postDelayed(this.f148442o, this.f148428a.f148489a);
        }
    }

    private static boolean d1(C5562b c5562b) {
        int i10 = c5562b.f43784b;
        if (i10 != 1) {
            return (i10 == 2 && c5562b.c(0).f43800a == 0 && c5562b.c(1).f43800a == Long.MIN_VALUE) ? false : true;
        }
        long j10 = c5562b.c(0).f43800a;
        return (j10 == 0 || j10 == Long.MIN_VALUE) ? false : true;
    }

    private boolean e1() {
        int iU;
        B b10 = this.f148444q;
        if (b10 == null || (iU = b10.u()) == -1) {
            return false;
        }
        C5562b.a aVarC = this.f148453z.c(iU);
        int iO = b10.O();
        int i10 = aVarC.f43801b;
        return i10 == -1 || i10 <= iO || aVarC.f43805f[iO] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f1() {
        int iT0;
        B b10 = this.f148444q;
        if (b10 == null || (iT0 = t0()) == -1) {
            return false;
        }
        C5562b.a aVarC = this.f148453z.c(iT0);
        int i10 = aVarC.f43801b;
        return (i10 == -1 || i10 == 0 || aVarC.f43805f[0] == 0) && P.j1(aVarC.f43800a) - r0(b10, this.f148451x, this.f148433f) < this.f148428a.f148489a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f148448u == null) {
            if (this.f148428a.f148503o) {
                r.b("AdTagLoader", "loadAd after release " + p0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int iN0 = n0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(iN0, adPosition);
        this.f148439l.t(adMediaInfo, bVar);
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "loadAd " + p0(adMediaInfo));
        }
        if (this.f148453z.f(iN0, adPosition)) {
            return;
        }
        B b10 = this.f148444q;
        if (b10 != null && b10.u() == iN0 && this.f148444q.O() == adPosition) {
            this.f148434g.removeCallbacks(this.f148442o);
        }
        C5562b c5562bI = this.f148453z.i(bVar.f148455a, Math.max(adPodInfo.getTotalAds(), this.f148453z.c(bVar.f148455a).f43805f.length));
        this.f148453z = c5562bI;
        C5562b.a aVarC = c5562bI.c(bVar.f148455a);
        for (int i10 = 0; i10 < adPosition; i10++) {
            if (aVarC.f43805f[i10] == 0) {
                this.f148453z = this.f148453z.k(iN0, i10);
            }
        }
        v.c cVarJ = new v.c().j(adMediaInfo.getUrl());
        String str = this.f148418G;
        if (str != null) {
            cVarJ.f(str);
            this.f148418G = null;
        }
        this.f148453z = this.f148453z.m(bVar.f148455a, bVar.f148456b, cVarJ.a());
        w1();
    }

    private void h1(int i10) {
        C5562b.a aVarC = this.f148453z.c(i10);
        if (aVarC.f43801b == -1) {
            C5562b c5562bI = this.f148453z.i(i10, Math.max(1, aVarC.f43805f.length));
            this.f148453z = c5562bI;
            aVarC = c5562bI.c(i10);
        }
        for (int i11 = 0; i11 < aVarC.f43801b; i11++) {
            if (aVarC.f43805f[i11] == 0) {
                if (this.f148428a.f148503o) {
                    r.b("AdTagLoader", "Removing ad " + i11 + " in ad group " + i10);
                }
                this.f148453z = this.f148453z.k(i10, i11);
            }
        }
        w1();
        this.f148425N = -9223372036854775807L;
        this.f148423L = -9223372036854775807L;
    }

    private void i1(long j10, long j11) {
        AdsManager adsManager = this.f148448u;
        if (this.f148449v || adsManager == null) {
            return;
        }
        this.f148449v = true;
        AdsRenderingSettings adsRenderingSettingsT1 = t1(j10, j11);
        if (adsRenderingSettingsT1 == null) {
            l0();
        } else {
            adsManager.init(adsRenderingSettingsT1);
            adsManager.start();
            if (this.f148428a.f148503o) {
                r.b("AdTagLoader", "Initialized with ads rendering settings: " + adsRenderingSettingsT1);
            }
        }
        w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(String str, Exception exc) {
        String str2 = "Internal error in " + str;
        r.e("AdTagLoader", str2, exc);
        int i10 = 0;
        while (true) {
            C5562b c5562b = this.f148453z;
            if (i10 >= c5562b.f43784b) {
                break;
            }
            this.f148453z = c5562b.q(i10);
            i10++;
        }
        w1();
        for (int i11 = 0; i11 < this.f148436i.size(); i11++) {
            this.f148436i.get(i11).c(AdsMediaSource.AdLoadException.d(new RuntimeException(str2, exc)), this.f148431d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        if (this.f148450w != null) {
            for (int i10 = 0; i10 < this.f148436i.size(); i10++) {
                this.f148436i.get(i10).c(this.f148450w, this.f148431d);
            }
            this.f148450w = null;
        }
    }

    private void l0() {
        AdsManager adsManager = this.f148448u;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.f148435h);
            AdErrorEvent.AdErrorListener adErrorListener = this.f148428a.f148499k;
            if (adErrorListener != null) {
                this.f148448u.removeAdErrorListener(adErrorListener);
            }
            this.f148448u.removeAdEventListener(this.f148435h);
            AdEvent.AdEventListener adEventListener = this.f148428a.f148500l;
            if (adEventListener != null) {
                this.f148448u.removeAdEventListener(adEventListener);
            }
            this.f148448u.destroy();
            this.f148448u = null;
        }
    }

    private void m0() {
        if (this.f148417F || this.f148452y == -9223372036854775807L || this.f148425N != -9223372036854775807L) {
            return;
        }
        long jR0 = r0((B) C13466a.e(this.f148444q), this.f148451x, this.f148433f);
        if (5000 + jR0 < this.f148452y) {
            return;
        }
        int iE = this.f148453z.e(P.M0(jR0), P.M0(this.f148452y));
        if (iE == -1 || this.f148453z.c(iE).f43800a == Long.MIN_VALUE || !this.f148453z.c(iE).g()) {
            s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(AdMediaInfo adMediaInfo) {
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "pauseAd " + p0(adMediaInfo));
        }
        if (this.f148448u == null || this.f148414C == 0) {
            return;
        }
        if (this.f148428a.f148503o && !adMediaInfo.equals(this.f148415D)) {
            r.i("AdTagLoader", "Unexpected pauseAd for " + p0(adMediaInfo) + ", expected " + p0(this.f148415D));
        }
        this.f148414C = 2;
        for (int i10 = 0; i10 < this.f148437j.size(); i10++) {
            this.f148437j.get(i10).onPause(adMediaInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(AdMediaInfo adMediaInfo) {
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "playAd " + p0(adMediaInfo));
        }
        if (this.f148448u == null) {
            return;
        }
        if (this.f148414C == 1) {
            r.i("AdTagLoader", "Unexpected playAd without stopAd");
        }
        int i10 = 0;
        if (this.f148414C == 0) {
            this.f148423L = -9223372036854775807L;
            this.f148424M = -9223372036854775807L;
            this.f148414C = 1;
            this.f148415D = adMediaInfo;
            this.f148416E = (b) C13466a.e(this.f148439l.get(adMediaInfo));
            for (int i11 = 0; i11 < this.f148437j.size(); i11++) {
                this.f148437j.get(i11).onPlay(adMediaInfo);
            }
            b bVar = this.f148422K;
            if (bVar != null && bVar.equals(this.f148416E)) {
                this.f148422K = null;
                while (i10 < this.f148437j.size()) {
                    this.f148437j.get(i10).onError(adMediaInfo);
                    i10++;
                }
            }
            x1();
        } else {
            this.f148414C = 1;
            C13466a.g(adMediaInfo.equals(this.f148415D));
            while (i10 < this.f148437j.size()) {
                this.f148437j.get(i10).onResume(adMediaInfo);
                i10++;
            }
        }
        B b10 = this.f148444q;
        if (b10 == null || !b10.F()) {
            ((AdsManager) C13466a.e(this.f148448u)).pause();
        }
    }

    private String p0(AdMediaInfo adMediaInfo) {
        b bVar = this.f148439l.get(adMediaInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdMediaInfo[");
        sb2.append(adMediaInfo == null ? BuildConfig.TRAVIS : adMediaInfo.getUrl());
        sb2.append(", ");
        sb2.append(bVar);
        sb2.append("]");
        return sb2.toString();
    }

    private VideoProgressUpdate q0() {
        B b10 = this.f148444q;
        if (b10 == null) {
            return this.f148446s;
        }
        if (this.f148414C == 0 || !this.f148419H) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = b10.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.f148444q.g0(), duration);
    }

    private AdsLoader q1(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader adsLoaderA = this.f148429b.a(context, imaSdkSettings, adDisplayContainer);
        adsLoaderA.addAdErrorListener(this.f148435h);
        AdErrorEvent.AdErrorListener adErrorListener = this.f148428a.f148499k;
        if (adErrorListener != null) {
            adsLoaderA.addAdErrorListener(adErrorListener);
        }
        adsLoaderA.addAdsLoadedListener(this.f148435h);
        try {
            AdsRequest adsRequestB = C15362f.b(this.f148429b, this.f148431d);
            Object obj = new Object();
            this.f148443p = obj;
            adsRequestB.setUserRequestContext(obj);
            Boolean bool = this.f148428a.f148495g;
            if (bool != null) {
                adsRequestB.setContinuousPlayback(bool.booleanValue());
            }
            int i10 = this.f148428a.f148490b;
            if (i10 != -1) {
                adsRequestB.setVastLoadTimeout(i10);
            }
            adsRequestB.setContentProgressProvider(this.f148435h);
            adsLoaderA.requestAds(adsRequestB);
            return adsLoaderA;
        } catch (IOException e10) {
            this.f148453z = new C5562b(this.f148432e, new long[0]);
            w1();
            this.f148450w = AdsMediaSource.AdLoadException.c(e10);
            k1();
            return adsLoaderA;
        }
    }

    private void r1() {
        if (this.f148416E != null) {
            this.f148434g.removeCallbacks(this.f148442o);
            this.f148453z = this.f148453z.q(((b) C13466a.e(this.f148416E)).f148455a);
            w1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoProgressUpdate s0() {
        boolean z10 = this.f148452y != -9223372036854775807L;
        long jR0 = this.f148425N;
        if (jR0 != -9223372036854775807L) {
            this.f148426O = true;
        } else {
            B b10 = this.f148444q;
            if (b10 == null) {
                return this.f148445r;
            }
            if (this.f148423L != -9223372036854775807L) {
                jR0 = this.f148424M + (SystemClock.elapsedRealtime() - this.f148423L);
            } else {
                if (this.f148414C != 0 || this.f148419H || !z10) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                jR0 = r0(b10, this.f148451x, this.f148433f);
            }
        }
        return new VideoProgressUpdate(jR0, z10 ? this.f148452y : -1L);
    }

    private int t0() {
        B b10 = this.f148444q;
        if (b10 == null) {
            return -1;
        }
        long jM0 = P.M0(r0(b10, this.f148451x, this.f148433f));
        int iE = this.f148453z.e(jM0, P.M0(this.f148452y));
        return iE == -1 ? this.f148453z.d(jM0, P.M0(this.f148452y)) : iE;
    }

    private AdsRenderingSettings t1(long j10, long j11) {
        AdsRenderingSettings adsRenderingSettingsE = this.f148429b.e();
        adsRenderingSettingsE.setEnablePreloading(true);
        List<String> list = this.f148428a.f148496h;
        if (list == null) {
            list = this.f148430c;
        }
        adsRenderingSettingsE.setMimeTypes(list);
        int i10 = this.f148428a.f148491c;
        if (i10 != -1) {
            adsRenderingSettingsE.setLoadVideoTimeout(i10);
        }
        int i11 = this.f148428a.f148494f;
        if (i11 != -1) {
            adsRenderingSettingsE.setBitrateKbps(i11 / 1000);
        }
        adsRenderingSettingsE.setFocusSkipButtonWhenAvailable(this.f148428a.f148492d);
        Set<UiElement> set = this.f148428a.f148497i;
        if (set != null) {
            adsRenderingSettingsE.setUiElements(set);
        }
        int iE = this.f148453z.e(P.M0(j10), P.M0(j11));
        if (iE != -1) {
            if (this.f148453z.c(iE).f43800a != P.M0(j10) && !this.f148428a.f148493e) {
                iE++;
            } else if (d1(this.f148453z)) {
                this.f148425N = j10;
            }
            if (iE > 0) {
                for (int i12 = 0; i12 < iE; i12++) {
                    this.f148453z = this.f148453z.q(i12);
                }
                C5562b c5562b = this.f148453z;
                if (iE == c5562b.f43784b) {
                    return null;
                }
                long j12 = c5562b.c(iE).f43800a;
                long j13 = this.f148453z.c(iE - 1).f43800a;
                if (j12 == Long.MIN_VALUE) {
                    adsRenderingSettingsE.setPlayAdsAfterTime((j13 / 1000000.0d) + 1.0d);
                    return adsRenderingSettingsE;
                }
                adsRenderingSettingsE.setPlayAdsAfterTime(((j12 + j13) / 2.0d) / 1000000.0d);
            }
        }
        return adsRenderingSettingsE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0() {
        B b10 = this.f148444q;
        return b10 == null ? this.f148447t : b10.v(22) ? (int) (b10.getVolume() * 100.0f) : b10.r().c(1) ? 100 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1(AdMediaInfo adMediaInfo) {
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "stopAd " + p0(adMediaInfo));
        }
        if (this.f148448u == null) {
            return;
        }
        if (this.f148414C == 0) {
            b bVar = this.f148439l.get(adMediaInfo);
            if (bVar != null) {
                this.f148453z = this.f148453z.p(bVar.f148455a, bVar.f148456b);
                w1();
                return;
            }
            return;
        }
        this.f148414C = 0;
        v1();
        C13466a.e(this.f148416E);
        b bVar2 = this.f148416E;
        int i10 = bVar2.f148455a;
        int i11 = bVar2.f148456b;
        if (this.f148453z.f(i10, i11)) {
            return;
        }
        this.f148453z = this.f148453z.o(i10, i11).l(0L);
        w1();
        if (this.f148419H) {
            return;
        }
        this.f148415D = null;
        this.f148416E = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void v0(AdEvent adEvent) throws NumberFormatException {
        if (this.f148448u == null) {
            return;
        }
        int i10 = 0;
        switch (a.f148454a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) C13466a.e(adEvent.getAdData().get("adBreakTime"));
                if (this.f148428a.f148503o) {
                    r.b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double d10 = Double.parseDouble(str);
                h1(d10 == -1.0d ? this.f148453z.f43784b - 1 : o0(d10));
                break;
            case 2:
                this.f148413B = true;
                n1();
                break;
            case 3:
                while (i10 < this.f148436i.size()) {
                    this.f148436i.get(i10).b();
                    i10++;
                }
                break;
            case 4:
                while (i10 < this.f148436i.size()) {
                    this.f148436i.get(i10).v();
                    i10++;
                }
                break;
            case 5:
                this.f148413B = false;
                r1();
                break;
            case 6:
                r.g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
            case 7:
                this.f148418G = adEvent.getAd().getContentType();
                break;
        }
    }

    private void v1() {
        this.f148434g.removeCallbacks(this.f148438k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        w0(new IOException("Ad loading timed out"));
        k1();
    }

    private void y0(int i10, int i11, Exception exc) {
        if (this.f148428a.f148503o) {
            r.c("AdTagLoader", "Prepare error for ad " + i11 + " in group " + i10, exc);
        }
        if (this.f148448u == null) {
            r.i("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.f148414C == 0) {
            this.f148423L = SystemClock.elapsedRealtime();
            long jJ1 = P.j1(this.f148453z.c(i10).f43800a);
            this.f148424M = jJ1;
            if (jJ1 == Long.MIN_VALUE) {
                this.f148424M = this.f148452y;
            }
            this.f148422K = new b(i10, i11);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C13466a.e(this.f148415D);
            if (i11 > this.f148421J) {
                for (int i12 = 0; i12 < this.f148437j.size(); i12++) {
                    this.f148437j.get(i12).onEnded(adMediaInfo);
                }
            }
            this.f148421J = this.f148453z.c(i10).c();
            for (int i13 = 0; i13 < this.f148437j.size(); i13++) {
                this.f148437j.get(i13).onError((AdMediaInfo) C13466a.e(adMediaInfo));
            }
        }
        this.f148453z = this.f148453z.k(i10, i11);
        w1();
    }

    private void z0(boolean z10, int i10) {
        if (this.f148419H && this.f148414C == 1) {
            boolean z11 = this.f148420I;
            if (!z11 && i10 == 2) {
                this.f148420I = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) C13466a.e(this.f148415D);
                for (int i11 = 0; i11 < this.f148437j.size(); i11++) {
                    this.f148437j.get(i11).onBuffering(adMediaInfo);
                }
                v1();
            } else if (z11 && i10 == 3) {
                this.f148420I = false;
                x1();
            }
        }
        int i12 = this.f148414C;
        if (i12 == 0 && i10 == 2 && z10) {
            m0();
            return;
        }
        if (i12 == 0 || i10 != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.f148415D;
        if (adMediaInfo2 == null) {
            r.i("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i13 = 0; i13 < this.f148437j.size(); i13++) {
                this.f148437j.get(i13).onEnded(adMediaInfo2);
            }
        }
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    public void A0(int i10, int i11) {
        b bVar = new b(i10, i11);
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "Prepared ad " + bVar);
        }
        AdMediaInfo adMediaInfo = this.f148439l.z().get(bVar);
        if (adMediaInfo != null) {
            for (int i12 = 0; i12 < this.f148437j.size(); i12++) {
                this.f148437j.get(i12).onLoaded(adMediaInfo);
            }
            return;
        }
        r.i("AdTagLoader", "Unexpected prepared ad " + bVar);
    }

    public void B0(int i10, int i11, IOException iOException) {
        if (this.f148444q == null) {
            return;
        }
        try {
            y0(i10, i11, iOException);
        } catch (RuntimeException e10) {
            j1("handlePrepareError", e10);
        }
    }

    @Override // a3.B.d
    public void H0(int i10) {
        B b10 = this.f148444q;
        if (this.f148448u == null || b10 == null) {
            return;
        }
        if (i10 == 2 && !b10.j() && f1()) {
            this.f148427P = SystemClock.elapsedRealtime();
        } else if (i10 == 3) {
            this.f148427P = -9223372036854775807L;
        }
        z0(b10.F(), i10);
    }

    @Override // a3.B.d
    public void O0(PlaybackException playbackException) {
        if (this.f148414C != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C13466a.e(this.f148415D);
            for (int i10 = 0; i10 < this.f148437j.size(); i10++) {
                this.f148437j.get(i10).onError(adMediaInfo);
            }
        }
    }

    @Override // a3.B.d
    public void a1(boolean z10, int i10) {
        B b10;
        AdsManager adsManager = this.f148448u;
        if (adsManager == null || (b10 = this.f148444q) == null) {
            return;
        }
        int i11 = this.f148414C;
        if (i11 == 1 && !z10) {
            adsManager.pause();
        } else if (i11 == 2 && z10) {
            adsManager.resume();
        } else {
            z0(z10, b10.U());
        }
    }

    public void i0(B b10) {
        b bVar;
        this.f148444q = b10;
        b10.l(this);
        boolean zF = b10.F();
        N0(b10.y(), 1);
        AdsManager adsManager = this.f148448u;
        if (C5562b.f43777g.equals(this.f148453z) || adsManager == null || !this.f148413B) {
            return;
        }
        int iE = this.f148453z.e(P.M0(r0(b10, this.f148451x, this.f148433f)), P.M0(this.f148452y));
        if (iE != -1 && (bVar = this.f148416E) != null && bVar.f148455a != iE) {
            if (this.f148428a.f148503o) {
                r.b("AdTagLoader", "Discarding preloaded ad " + this.f148416E);
            }
            adsManager.discardAdBreak();
        }
        if (zF) {
            adsManager.resume();
        }
    }

    public void j0(a.InterfaceC1127a interfaceC1127a, InterfaceC5563c interfaceC5563c) {
        boolean zIsEmpty = this.f148436i.isEmpty();
        this.f148436i.add(interfaceC1127a);
        if (!zIsEmpty) {
            if (C5562b.f43777g.equals(this.f148453z)) {
                return;
            }
            interfaceC1127a.a(this.f148453z);
            return;
        }
        this.f148447t = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f148446s = videoProgressUpdate;
        this.f148445r = videoProgressUpdate;
        k1();
        if (!C5562b.f43777g.equals(this.f148453z)) {
            interfaceC1127a.a(this.f148453z);
        } else if (this.f148448u != null) {
            this.f148453z = new C5562b(this.f148432e, C15362f.a(this.f148448u.getAdCuePoints()));
            w1();
        }
        for (C5561a c5561a : interfaceC5563c.getAdOverlayInfos()) {
            this.f148440m.registerFriendlyObstruction(this.f148429b.d(c5561a.f43771a, C15362f.c(c5561a.f43772b), c5561a.f43773c));
        }
    }

    public void k0() {
        final B b10 = (B) C13466a.e(this.f148444q);
        if (!C5562b.f43777g.equals(this.f148453z) && this.f148413B) {
            AdsManager adsManager = this.f148448u;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.f148453z = this.f148453z.l(this.f148419H ? P.M0(b10.g0()) : 0L);
        }
        this.f148447t = u0();
        this.f148446s = q0();
        this.f148445r = s0();
        this.f148434g.post(new Runnable() { // from class: l3.c
            @Override // java.lang.Runnable
            public final void run() {
                C15360d.E(this.f148410a, b10);
            }
        });
        this.f148444q = null;
    }

    public void p1(a.InterfaceC1127a interfaceC1127a) {
        this.f148436i.remove(interfaceC1127a);
        if (this.f148436i.isEmpty()) {
            this.f148440m.unregisterAllFriendlyObstructions();
        }
    }

    public void release() {
        if (this.f148412A) {
            return;
        }
        this.f148412A = true;
        this.f148443p = null;
        l0();
        this.f148441n.removeAdsLoadedListener(this.f148435h);
        this.f148441n.removeAdErrorListener(this.f148435h);
        AdErrorEvent.AdErrorListener adErrorListener = this.f148428a.f148499k;
        if (adErrorListener != null) {
            this.f148441n.removeAdErrorListener(adErrorListener);
        }
        this.f148441n.release();
        int i10 = 0;
        this.f148413B = false;
        this.f148414C = 0;
        this.f148415D = null;
        v1();
        this.f148416E = null;
        this.f148450w = null;
        while (true) {
            C5562b c5562b = this.f148453z;
            if (i10 >= c5562b.f43784b) {
                w1();
                return;
            } else {
                this.f148453z = c5562b.q(i10);
                i10++;
            }
        }
    }

    public C15360d(Context context, C15362f.a aVar, C15362f.b bVar, List<String> list, g gVar, Object obj, ViewGroup viewGroup) {
        this.f148428a = aVar;
        this.f148429b = bVar;
        ImaSdkSettings imaSdkSettingsC = aVar.f148502n;
        if (imaSdkSettingsC == null) {
            imaSdkSettingsC = bVar.c();
            if (aVar.f148503o) {
                imaSdkSettingsC.setDebugMode(true);
            }
        }
        imaSdkSettingsC.setPlayerType("google/exo.ext.ima");
        imaSdkSettingsC.setPlayerVersion("1.6.0");
        this.f148430c = list;
        this.f148431d = gVar;
        this.f148432e = obj;
        this.f148433f = new F.b();
        this.f148434g = P.y(C15362f.d(), null);
        c cVar = new c(this, null);
        this.f148435h = cVar;
        this.f148436i = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.f148437j = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.f148501m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.f148438k = new Runnable() { // from class: l3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f148408a.x1();
            }
        };
        this.f148439l = H.g();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f148445r = videoProgressUpdate;
        this.f148446s = videoProgressUpdate;
        this.f148423L = -9223372036854775807L;
        this.f148424M = -9223372036854775807L;
        this.f148425N = -9223372036854775807L;
        this.f148427P = -9223372036854775807L;
        this.f148452y = -9223372036854775807L;
        this.f148451x = F.f43583a;
        this.f148453z = C5562b.f43777g;
        this.f148442o = new Runnable() { // from class: l3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f148409a.x0();
            }
        };
        if (viewGroup != null) {
            this.f148440m = bVar.b(viewGroup, cVar);
        } else {
            this.f148440m = bVar.g(context, cVar);
        }
        Collection<CompanionAdSlot> collection = aVar.f148498j;
        if (collection != null) {
            this.f148440m.setCompanionSlots(collection);
        }
        this.f148441n = q1(context, imaSdkSettingsC, this.f148440m);
    }

    public static /* synthetic */ void E(C15360d c15360d, B b10) {
        c15360d.getClass();
        b10.Z(c15360d);
    }

    private int n0(AdPodInfo adPodInfo) {
        if (adPodInfo.getPodIndex() == -1) {
            return this.f148453z.f43784b - 1;
        }
        return o0(adPodInfo.getTimeOffset());
    }

    private static long r0(B b10, F f10, F.b bVar) {
        long jS = b10.S();
        if (f10.q()) {
            return jS;
        }
        return jS - f10.f(b10.J(), bVar).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Exception exc) {
        int iT0 = t0();
        if (iT0 == -1) {
            r.j("AdTagLoader", "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        h1(iT0);
        if (this.f148450w == null) {
            this.f148450w = AdsMediaSource.AdLoadException.b(exc, iT0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1() {
        VideoProgressUpdate videoProgressUpdateQ0 = q0();
        if (this.f148428a.f148503o) {
            r.b("AdTagLoader", "Ad progress: " + C15362f.e(videoProgressUpdateQ0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) C13466a.e(this.f148415D);
        for (int i10 = 0; i10 < this.f148437j.size(); i10++) {
            this.f148437j.get(i10).onAdProgress(adMediaInfo, videoProgressUpdateQ0);
        }
        this.f148434g.removeCallbacks(this.f148438k);
        this.f148434g.postDelayed(this.f148438k, 200L);
    }

    @Override // a3.B.d
    public void N0(F f10, int i10) {
        B b10;
        if (!f10.q() && (b10 = this.f148444q) != null) {
            this.f148451x = f10;
            long j10 = f10.f(b10.J(), this.f148433f).f43595d;
            this.f148452y = P.j1(j10);
            C5562b c5562b = this.f148453z;
            if (j10 != c5562b.f43786d) {
                this.f148453z = c5562b.n(j10);
                w1();
            }
            i1(r0(b10, f10, this.f148433f), this.f148452y);
            C0();
        }
    }

    @Override // a3.B.d
    public void W0(B.e eVar, B.e eVar2, int i10) {
        C0();
    }

    public void l1(long j10, long j11) {
        i1(j10, j11);
    }
}
