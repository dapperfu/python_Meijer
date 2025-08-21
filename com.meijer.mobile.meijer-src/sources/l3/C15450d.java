package l3;

import Ee.H;
import Ee.InterfaceC3219h;
import a3.B;
import a3.C5644a;
import a3.C5645b;
import a3.F;
import a3.InterfaceC5646c;
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
import d3.C13599a;
import d3.P;
import d3.r;
import f3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import l3.C15452f;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15450d implements B.d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f149199A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f149200B;

    /* renamed from: C, reason: collision with root package name */
    private int f149201C;

    /* renamed from: D, reason: collision with root package name */
    private AdMediaInfo f149202D;

    /* renamed from: E, reason: collision with root package name */
    private b f149203E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f149204F;

    /* renamed from: G, reason: collision with root package name */
    private String f149205G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f149206H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f149207I;

    /* renamed from: J, reason: collision with root package name */
    private int f149208J;

    /* renamed from: K, reason: collision with root package name */
    private b f149209K;

    /* renamed from: L, reason: collision with root package name */
    private long f149210L;

    /* renamed from: M, reason: collision with root package name */
    private long f149211M;

    /* renamed from: N, reason: collision with root package name */
    private long f149212N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f149213O;

    /* renamed from: P, reason: collision with root package name */
    private long f149214P;

    /* renamed from: a, reason: collision with root package name */
    private final C15452f.a f149215a;

    /* renamed from: b, reason: collision with root package name */
    private final C15452f.b f149216b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f149217c;

    /* renamed from: d, reason: collision with root package name */
    private final g f149218d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f149219e;

    /* renamed from: f, reason: collision with root package name */
    private final F.b f149220f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f149221g;

    /* renamed from: h, reason: collision with root package name */
    private final c f149222h;

    /* renamed from: i, reason: collision with root package name */
    private final List<a.InterfaceC1140a> f149223i;

    /* renamed from: j, reason: collision with root package name */
    private final List<VideoAdPlayer.VideoAdPlayerCallback> f149224j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f149225k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3219h<AdMediaInfo, b> f149226l;

    /* renamed from: m, reason: collision with root package name */
    private final AdDisplayContainer f149227m;

    /* renamed from: n, reason: collision with root package name */
    private final AdsLoader f149228n;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f149229o;

    /* renamed from: p, reason: collision with root package name */
    private Object f149230p;

    /* renamed from: q, reason: collision with root package name */
    private B f149231q;

    /* renamed from: r, reason: collision with root package name */
    private VideoProgressUpdate f149232r;

    /* renamed from: s, reason: collision with root package name */
    private VideoProgressUpdate f149233s;

    /* renamed from: t, reason: collision with root package name */
    private int f149234t;

    /* renamed from: u, reason: collision with root package name */
    private AdsManager f149235u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f149236v;

    /* renamed from: w, reason: collision with root package name */
    private AdsMediaSource.AdLoadException f149237w;

    /* renamed from: x, reason: collision with root package name */
    private F f149238x;

    /* renamed from: y, reason: collision with root package name */
    private long f149239y;

    /* renamed from: z, reason: collision with root package name */
    private C5645b f149240z;

    /* renamed from: l3.d$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f149242a;

        /* renamed from: b, reason: collision with root package name */
        public final int f149243b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f149242a == bVar.f149242a && this.f149243b == bVar.f149243b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f149242a * 31) + this.f149243b;
        }

        public String toString() {
            return "(" + this.f149242a + ", " + this.f149243b + ')';
        }

        public b(int i10, int i11) {
            this.f149242a = i10;
            this.f149243b = i11;
        }
    }

    /* renamed from: l3.d$c */
    private final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        private c() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void release() {
        }

        /* synthetic */ c(C15450d c15450d, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            C15450d.this.f149224j.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate videoProgressUpdateS0 = C15450d.this.s0();
            if (C15450d.this.f149215a.f149290o) {
                r.b("AdTagLoader", "Content progress: " + C15452f.e(videoProgressUpdateS0));
            }
            if (C15450d.this.f149214P != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - C15450d.this.f149214P >= 4000) {
                    C15450d.this.f149214P = -9223372036854775807L;
                    C15450d.this.w0(new IOException("Ad preloading timed out"));
                    C15450d.this.k1();
                    return videoProgressUpdateS0;
                }
            } else if (C15450d.this.f149212N != -9223372036854775807L && C15450d.this.f149231q != null && C15450d.this.f149231q.U() == 2 && C15450d.this.F0()) {
                C15450d.this.f149214P = SystemClock.elapsedRealtime();
            }
            return videoProgressUpdateS0;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return C15450d.this.u0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                C15450d.this.g1(adMediaInfo, adPodInfo);
            } catch (RuntimeException e10) {
                C15450d.this.j1("loadAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                C15450d.this.m1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15450d.this.j1("pauseAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                C15450d.this.o1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15450d.this.j1("playAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            C15450d.this.f149224j.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                C15450d.this.u1(adMediaInfo);
            } catch (RuntimeException e10) {
                C15450d.this.j1("stopAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (C15450d.this.f149215a.f149290o) {
                r.c("AdTagLoader", "onAdError", error);
            }
            if (C15450d.this.f149235u == null) {
                C15450d.this.f149230p = null;
                C15450d.this.f149240z = new C5645b(C15450d.this.f149219e, new long[0]);
                C15450d.this.w1();
            } else if (C15452f.f(error)) {
                try {
                    C15450d.this.w0(error);
                } catch (RuntimeException e10) {
                    C15450d.this.j1("onAdError", e10);
                }
            }
            if (C15450d.this.f149237w == null) {
                C15450d.this.f149237w = AdsMediaSource.AdLoadException.c(error);
            }
            C15450d.this.k1();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (C15450d.this.f149215a.f149290o && type != AdEvent.AdEventType.AD_PROGRESS) {
                r.b("AdTagLoader", "onAdEvent: " + type);
            }
            try {
                C15450d.this.v0(adEvent);
            } catch (RuntimeException e10) {
                C15450d.this.j1("onAdEvent", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (Objects.equals(C15450d.this.f149230p, adsManagerLoadedEvent.getUserRequestContext())) {
                C15450d.this.f149230p = null;
                C15450d.this.f149235u = adsManager;
                adsManager.addAdErrorListener(this);
                if (C15450d.this.f149215a.f149286k != null) {
                    adsManager.addAdErrorListener(C15450d.this.f149215a.f149286k);
                }
                adsManager.addAdEventListener(this);
                if (C15450d.this.f149215a.f149287l != null) {
                    adsManager.addAdEventListener(C15450d.this.f149215a.f149287l);
                }
                try {
                    C15450d.this.f149240z = new C5645b(C15450d.this.f149219e, C15452f.a(adsManager.getAdCuePoints()));
                    C15450d.this.w1();
                    return;
                } catch (RuntimeException e10) {
                    C15450d.this.j1("onAdsManagerLoaded", e10);
                    return;
                }
            }
            adsManager.destroy();
        }
    }

    private void n1() {
        this.f149201C = 0;
        if (this.f149213O) {
            this.f149212N = -9223372036854775807L;
            this.f149213O = false;
        }
    }

    private int o0(double d10) {
        long jRound = Math.round(((float) d10) * 1000000.0d);
        int i10 = 0;
        while (true) {
            C5645b c5645b = this.f149240z;
            if (i10 >= c5645b.f44602b) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j10 = c5645b.c(i10).f44618a;
            if (j10 != Long.MIN_VALUE && Math.abs(j10 - jRound) < 1000) {
                return i10;
            }
            i10++;
        }
    }

    private void s1() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f149224j.size(); i11++) {
            this.f149224j.get(i11).onContentComplete();
        }
        this.f149204F = true;
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "adsLoader.contentComplete");
        }
        while (true) {
            C5645b c5645b = this.f149240z;
            if (i10 >= c5645b.f44602b) {
                w1();
                return;
            } else {
                if (c5645b.c(i10).f44618a != Long.MIN_VALUE) {
                    this.f149240z = this.f149240z.q(i10);
                }
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        for (int i10 = 0; i10 < this.f149223i.size(); i10++) {
            this.f149223i.get(i10).a(this.f149240z);
        }
    }

    /* renamed from: l3.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f149241a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f149241a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f149241a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f149241a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f149241a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f149241a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f149241a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f149241a[AdEvent.AdEventType.LOADED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void C0() {
        B b10 = this.f149231q;
        if (this.f149235u == null || b10 == null) {
            return;
        }
        if (!this.f149206H && !b10.j()) {
            m0();
            if (!this.f149204F && !this.f149238x.q()) {
                long jR0 = r0(b10, this.f149238x, this.f149220f);
                this.f149238x.f(b10.J(), this.f149220f);
                if (this.f149220f.e(P.M0(jR0)) != -1) {
                    this.f149213O = false;
                    this.f149212N = jR0;
                }
            }
        }
        boolean z10 = this.f149206H;
        int i10 = this.f149208J;
        boolean zJ = b10.j();
        this.f149206H = zJ;
        int iO = zJ ? b10.O() : -1;
        this.f149208J = iO;
        if (z10 && iO != i10) {
            AdMediaInfo adMediaInfo = this.f149202D;
            if (adMediaInfo == null) {
                r.i("AdTagLoader", "onEnded without ad media info");
            } else {
                b bVar = this.f149226l.get(adMediaInfo);
                int i11 = this.f149208J;
                if (i11 == -1 || (bVar != null && bVar.f149243b < i11)) {
                    for (int i12 = 0; i12 < this.f149224j.size(); i12++) {
                        this.f149224j.get(i12).onEnded(adMediaInfo);
                    }
                    if (this.f149215a.f149290o) {
                        r.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                    }
                }
            }
        }
        if (!this.f149204F && !z10 && this.f149206H && this.f149201C == 0) {
            C5645b.a aVarC = this.f149240z.c(b10.u());
            if (aVarC.f44618a == Long.MIN_VALUE) {
                s1();
            } else {
                this.f149210L = SystemClock.elapsedRealtime();
                long jJ1 = P.j1(aVarC.f44618a);
                this.f149211M = jJ1;
                if (jJ1 == Long.MIN_VALUE) {
                    this.f149211M = this.f149239y;
                }
            }
        }
        if (E0()) {
            this.f149221g.removeCallbacks(this.f149229o);
            this.f149221g.postDelayed(this.f149229o, this.f149215a.f149276a);
        }
    }

    private static boolean D0(C5645b c5645b) {
        int i10 = c5645b.f44602b;
        if (i10 != 1) {
            return (i10 == 2 && c5645b.c(0).f44618a == 0 && c5645b.c(1).f44618a == Long.MIN_VALUE) ? false : true;
        }
        long j10 = c5645b.c(0).f44618a;
        return (j10 == 0 || j10 == Long.MIN_VALUE) ? false : true;
    }

    private boolean E0() {
        int iU;
        B b10 = this.f149231q;
        if (b10 == null || (iU = b10.u()) == -1) {
            return false;
        }
        C5645b.a aVarC = this.f149240z.c(iU);
        int iO = b10.O();
        int i10 = aVarC.f44619b;
        return i10 == -1 || i10 <= iO || aVarC.f44623f[iO] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F0() {
        int iT0;
        B b10 = this.f149231q;
        if (b10 == null || (iT0 = t0()) == -1) {
            return false;
        }
        C5645b.a aVarC = this.f149240z.c(iT0);
        int i10 = aVarC.f44619b;
        return (i10 == -1 || i10 == 0 || aVarC.f44623f[0] == 0) && P.j1(aVarC.f44618a) - r0(b10, this.f149238x, this.f149220f) < this.f149215a.f149276a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f149235u == null) {
            if (this.f149215a.f149290o) {
                r.b("AdTagLoader", "loadAd after release " + p0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int iN0 = n0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(iN0, adPosition);
        this.f149226l.u(adMediaInfo, bVar);
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "loadAd " + p0(adMediaInfo));
        }
        if (this.f149240z.f(iN0, adPosition)) {
            return;
        }
        B b10 = this.f149231q;
        if (b10 != null && b10.u() == iN0 && this.f149231q.O() == adPosition) {
            this.f149221g.removeCallbacks(this.f149229o);
        }
        C5645b c5645bI = this.f149240z.i(bVar.f149242a, Math.max(adPodInfo.getTotalAds(), this.f149240z.c(bVar.f149242a).f44623f.length));
        this.f149240z = c5645bI;
        C5645b.a aVarC = c5645bI.c(bVar.f149242a);
        for (int i10 = 0; i10 < adPosition; i10++) {
            if (aVarC.f44623f[i10] == 0) {
                this.f149240z = this.f149240z.k(iN0, i10);
            }
        }
        v.c cVarJ = new v.c().j(adMediaInfo.getUrl());
        String str = this.f149205G;
        if (str != null) {
            cVarJ.f(str);
            this.f149205G = null;
        }
        this.f149240z = this.f149240z.m(bVar.f149242a, bVar.f149243b, cVarJ.a());
        w1();
    }

    private void h1(int i10) {
        C5645b.a aVarC = this.f149240z.c(i10);
        if (aVarC.f44619b == -1) {
            C5645b c5645bI = this.f149240z.i(i10, Math.max(1, aVarC.f44623f.length));
            this.f149240z = c5645bI;
            aVarC = c5645bI.c(i10);
        }
        for (int i11 = 0; i11 < aVarC.f44619b; i11++) {
            if (aVarC.f44623f[i11] == 0) {
                if (this.f149215a.f149290o) {
                    r.b("AdTagLoader", "Removing ad " + i11 + " in ad group " + i10);
                }
                this.f149240z = this.f149240z.k(i10, i11);
            }
        }
        w1();
        this.f149212N = -9223372036854775807L;
        this.f149210L = -9223372036854775807L;
    }

    private void i1(long j10, long j11) {
        AdsManager adsManager = this.f149235u;
        if (this.f149236v || adsManager == null) {
            return;
        }
        this.f149236v = true;
        AdsRenderingSettings adsRenderingSettingsT1 = t1(j10, j11);
        if (adsRenderingSettingsT1 == null) {
            l0();
        } else {
            adsManager.init(adsRenderingSettingsT1);
            adsManager.start();
            if (this.f149215a.f149290o) {
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
            C5645b c5645b = this.f149240z;
            if (i10 >= c5645b.f44602b) {
                break;
            }
            this.f149240z = c5645b.q(i10);
            i10++;
        }
        w1();
        for (int i11 = 0; i11 < this.f149223i.size(); i11++) {
            this.f149223i.get(i11).c(AdsMediaSource.AdLoadException.d(new RuntimeException(str2, exc)), this.f149218d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        if (this.f149237w != null) {
            for (int i10 = 0; i10 < this.f149223i.size(); i10++) {
                this.f149223i.get(i10).c(this.f149237w, this.f149218d);
            }
            this.f149237w = null;
        }
    }

    private void l0() {
        AdsManager adsManager = this.f149235u;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.f149222h);
            AdErrorEvent.AdErrorListener adErrorListener = this.f149215a.f149286k;
            if (adErrorListener != null) {
                this.f149235u.removeAdErrorListener(adErrorListener);
            }
            this.f149235u.removeAdEventListener(this.f149222h);
            AdEvent.AdEventListener adEventListener = this.f149215a.f149287l;
            if (adEventListener != null) {
                this.f149235u.removeAdEventListener(adEventListener);
            }
            this.f149235u.destroy();
            this.f149235u = null;
        }
    }

    private void m0() {
        if (this.f149204F || this.f149239y == -9223372036854775807L || this.f149212N != -9223372036854775807L) {
            return;
        }
        long jR0 = r0((B) C13599a.e(this.f149231q), this.f149238x, this.f149220f);
        if (5000 + jR0 < this.f149239y) {
            return;
        }
        int iE = this.f149240z.e(P.M0(jR0), P.M0(this.f149239y));
        if (iE == -1 || this.f149240z.c(iE).f44618a == Long.MIN_VALUE || !this.f149240z.c(iE).g()) {
            s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(AdMediaInfo adMediaInfo) {
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "pauseAd " + p0(adMediaInfo));
        }
        if (this.f149235u == null || this.f149201C == 0) {
            return;
        }
        if (this.f149215a.f149290o && !adMediaInfo.equals(this.f149202D)) {
            r.i("AdTagLoader", "Unexpected pauseAd for " + p0(adMediaInfo) + ", expected " + p0(this.f149202D));
        }
        this.f149201C = 2;
        for (int i10 = 0; i10 < this.f149224j.size(); i10++) {
            this.f149224j.get(i10).onPause(adMediaInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(AdMediaInfo adMediaInfo) {
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "playAd " + p0(adMediaInfo));
        }
        if (this.f149235u == null) {
            return;
        }
        if (this.f149201C == 1) {
            r.i("AdTagLoader", "Unexpected playAd without stopAd");
        }
        int i10 = 0;
        if (this.f149201C == 0) {
            this.f149210L = -9223372036854775807L;
            this.f149211M = -9223372036854775807L;
            this.f149201C = 1;
            this.f149202D = adMediaInfo;
            this.f149203E = (b) C13599a.e(this.f149226l.get(adMediaInfo));
            for (int i11 = 0; i11 < this.f149224j.size(); i11++) {
                this.f149224j.get(i11).onPlay(adMediaInfo);
            }
            b bVar = this.f149209K;
            if (bVar != null && bVar.equals(this.f149203E)) {
                this.f149209K = null;
                while (i10 < this.f149224j.size()) {
                    this.f149224j.get(i10).onError(adMediaInfo);
                    i10++;
                }
            }
            x1();
        } else {
            this.f149201C = 1;
            C13599a.g(adMediaInfo.equals(this.f149202D));
            while (i10 < this.f149224j.size()) {
                this.f149224j.get(i10).onResume(adMediaInfo);
                i10++;
            }
        }
        B b10 = this.f149231q;
        if (b10 == null || !b10.F()) {
            ((AdsManager) C13599a.e(this.f149235u)).pause();
        }
    }

    private String p0(AdMediaInfo adMediaInfo) {
        b bVar = this.f149226l.get(adMediaInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdMediaInfo[");
        sb2.append(adMediaInfo == null ? BuildConfig.TRAVIS : adMediaInfo.getUrl());
        sb2.append(", ");
        sb2.append(bVar);
        sb2.append("]");
        return sb2.toString();
    }

    private VideoProgressUpdate q0() {
        B b10 = this.f149231q;
        if (b10 == null) {
            return this.f149233s;
        }
        if (this.f149201C == 0 || !this.f149206H) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = b10.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.f149231q.g0(), duration);
    }

    private AdsLoader q1(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader adsLoaderA = this.f149216b.a(context, imaSdkSettings, adDisplayContainer);
        adsLoaderA.addAdErrorListener(this.f149222h);
        AdErrorEvent.AdErrorListener adErrorListener = this.f149215a.f149286k;
        if (adErrorListener != null) {
            adsLoaderA.addAdErrorListener(adErrorListener);
        }
        adsLoaderA.addAdsLoadedListener(this.f149222h);
        try {
            AdsRequest adsRequestB = C15452f.b(this.f149216b, this.f149218d);
            Object obj = new Object();
            this.f149230p = obj;
            adsRequestB.setUserRequestContext(obj);
            Boolean bool = this.f149215a.f149282g;
            if (bool != null) {
                adsRequestB.setContinuousPlayback(bool.booleanValue());
            }
            int i10 = this.f149215a.f149277b;
            if (i10 != -1) {
                adsRequestB.setVastLoadTimeout(i10);
            }
            adsRequestB.setContentProgressProvider(this.f149222h);
            adsLoaderA.requestAds(adsRequestB);
            return adsLoaderA;
        } catch (IOException e10) {
            this.f149240z = new C5645b(this.f149219e, new long[0]);
            w1();
            this.f149237w = AdsMediaSource.AdLoadException.c(e10);
            k1();
            return adsLoaderA;
        }
    }

    private void r1() {
        if (this.f149203E != null) {
            this.f149221g.removeCallbacks(this.f149229o);
            this.f149240z = this.f149240z.q(((b) C13599a.e(this.f149203E)).f149242a);
            w1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoProgressUpdate s0() {
        boolean z10 = this.f149239y != -9223372036854775807L;
        long jR0 = this.f149212N;
        if (jR0 != -9223372036854775807L) {
            this.f149213O = true;
        } else {
            B b10 = this.f149231q;
            if (b10 == null) {
                return this.f149232r;
            }
            if (this.f149210L != -9223372036854775807L) {
                jR0 = this.f149211M + (SystemClock.elapsedRealtime() - this.f149210L);
            } else {
                if (this.f149201C != 0 || this.f149206H || !z10) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                jR0 = r0(b10, this.f149238x, this.f149220f);
            }
        }
        return new VideoProgressUpdate(jR0, z10 ? this.f149239y : -1L);
    }

    private int t0() {
        B b10 = this.f149231q;
        if (b10 == null) {
            return -1;
        }
        long jM0 = P.M0(r0(b10, this.f149238x, this.f149220f));
        int iE = this.f149240z.e(jM0, P.M0(this.f149239y));
        return iE == -1 ? this.f149240z.d(jM0, P.M0(this.f149239y)) : iE;
    }

    private AdsRenderingSettings t1(long j10, long j11) {
        AdsRenderingSettings adsRenderingSettingsE = this.f149216b.e();
        adsRenderingSettingsE.setEnablePreloading(true);
        List<String> list = this.f149215a.f149283h;
        if (list == null) {
            list = this.f149217c;
        }
        adsRenderingSettingsE.setMimeTypes(list);
        int i10 = this.f149215a.f149278c;
        if (i10 != -1) {
            adsRenderingSettingsE.setLoadVideoTimeout(i10);
        }
        int i11 = this.f149215a.f149281f;
        if (i11 != -1) {
            adsRenderingSettingsE.setBitrateKbps(i11 / 1000);
        }
        adsRenderingSettingsE.setFocusSkipButtonWhenAvailable(this.f149215a.f149279d);
        Set<UiElement> set = this.f149215a.f149284i;
        if (set != null) {
            adsRenderingSettingsE.setUiElements(set);
        }
        int iE = this.f149240z.e(P.M0(j10), P.M0(j11));
        if (iE != -1) {
            if (this.f149240z.c(iE).f44618a != P.M0(j10) && !this.f149215a.f149280e) {
                iE++;
            } else if (D0(this.f149240z)) {
                this.f149212N = j10;
            }
            if (iE > 0) {
                for (int i12 = 0; i12 < iE; i12++) {
                    this.f149240z = this.f149240z.q(i12);
                }
                C5645b c5645b = this.f149240z;
                if (iE == c5645b.f44602b) {
                    return null;
                }
                long j12 = c5645b.c(iE).f44618a;
                long j13 = this.f149240z.c(iE - 1).f44618a;
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
        B b10 = this.f149231q;
        return b10 == null ? this.f149234t : b10.v(22) ? (int) (b10.getVolume() * 100.0f) : b10.r().c(1) ? 100 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1(AdMediaInfo adMediaInfo) {
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "stopAd " + p0(adMediaInfo));
        }
        if (this.f149235u == null) {
            return;
        }
        if (this.f149201C == 0) {
            b bVar = this.f149226l.get(adMediaInfo);
            if (bVar != null) {
                this.f149240z = this.f149240z.p(bVar.f149242a, bVar.f149243b);
                w1();
                return;
            }
            return;
        }
        this.f149201C = 0;
        v1();
        C13599a.e(this.f149203E);
        b bVar2 = this.f149203E;
        int i10 = bVar2.f149242a;
        int i11 = bVar2.f149243b;
        if (this.f149240z.f(i10, i11)) {
            return;
        }
        this.f149240z = this.f149240z.o(i10, i11).l(0L);
        w1();
        if (this.f149206H) {
            return;
        }
        this.f149202D = null;
        this.f149203E = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void v0(AdEvent adEvent) throws NumberFormatException {
        if (this.f149235u == null) {
            return;
        }
        int i10 = 0;
        switch (a.f149241a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) C13599a.e(adEvent.getAdData().get("adBreakTime"));
                if (this.f149215a.f149290o) {
                    r.b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double d10 = Double.parseDouble(str);
                h1(d10 == -1.0d ? this.f149240z.f44602b - 1 : o0(d10));
                break;
            case 2:
                this.f149200B = true;
                n1();
                break;
            case 3:
                while (i10 < this.f149223i.size()) {
                    this.f149223i.get(i10).b();
                    i10++;
                }
                break;
            case 4:
                while (i10 < this.f149223i.size()) {
                    this.f149223i.get(i10).v();
                    i10++;
                }
                break;
            case 5:
                this.f149200B = false;
                r1();
                break;
            case 6:
                r.g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
            case 7:
                this.f149205G = adEvent.getAd().getContentType();
                break;
        }
    }

    private void v1() {
        this.f149221g.removeCallbacks(this.f149225k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        w0(new IOException("Ad loading timed out"));
        k1();
    }

    private void y0(int i10, int i11, Exception exc) {
        if (this.f149215a.f149290o) {
            r.c("AdTagLoader", "Prepare error for ad " + i11 + " in group " + i10, exc);
        }
        if (this.f149235u == null) {
            r.i("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.f149201C == 0) {
            this.f149210L = SystemClock.elapsedRealtime();
            long jJ1 = P.j1(this.f149240z.c(i10).f44618a);
            this.f149211M = jJ1;
            if (jJ1 == Long.MIN_VALUE) {
                this.f149211M = this.f149239y;
            }
            this.f149209K = new b(i10, i11);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C13599a.e(this.f149202D);
            if (i11 > this.f149208J) {
                for (int i12 = 0; i12 < this.f149224j.size(); i12++) {
                    this.f149224j.get(i12).onEnded(adMediaInfo);
                }
            }
            this.f149208J = this.f149240z.c(i10).c();
            for (int i13 = 0; i13 < this.f149224j.size(); i13++) {
                this.f149224j.get(i13).onError((AdMediaInfo) C13599a.e(adMediaInfo));
            }
        }
        this.f149240z = this.f149240z.k(i10, i11);
        w1();
    }

    private void z0(boolean z10, int i10) {
        if (this.f149206H && this.f149201C == 1) {
            boolean z11 = this.f149207I;
            if (!z11 && i10 == 2) {
                this.f149207I = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) C13599a.e(this.f149202D);
                for (int i11 = 0; i11 < this.f149224j.size(); i11++) {
                    this.f149224j.get(i11).onBuffering(adMediaInfo);
                }
                v1();
            } else if (z11 && i10 == 3) {
                this.f149207I = false;
                x1();
            }
        }
        int i12 = this.f149201C;
        if (i12 == 0 && i10 == 2 && z10) {
            m0();
            return;
        }
        if (i12 == 0 || i10 != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.f149202D;
        if (adMediaInfo2 == null) {
            r.i("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i13 = 0; i13 < this.f149224j.size(); i13++) {
                this.f149224j.get(i13).onEnded(adMediaInfo2);
            }
        }
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    public void A0(int i10, int i11) {
        b bVar = new b(i10, i11);
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "Prepared ad " + bVar);
        }
        AdMediaInfo adMediaInfo = this.f149226l.C().get(bVar);
        if (adMediaInfo != null) {
            for (int i12 = 0; i12 < this.f149224j.size(); i12++) {
                this.f149224j.get(i12).onLoaded(adMediaInfo);
            }
            return;
        }
        r.i("AdTagLoader", "Unexpected prepared ad " + bVar);
    }

    public void B0(int i10, int i11, IOException iOException) {
        if (this.f149231q == null) {
            return;
        }
        try {
            y0(i10, i11, iOException);
        } catch (RuntimeException e10) {
            j1("handlePrepareError", e10);
        }
    }

    @Override // a3.B.d
    public void K0(int i10) {
        B b10 = this.f149231q;
        if (this.f149235u == null || b10 == null) {
            return;
        }
        if (i10 == 2 && !b10.j() && F0()) {
            this.f149214P = SystemClock.elapsedRealtime();
        } else if (i10 == 3) {
            this.f149214P = -9223372036854775807L;
        }
        z0(b10.F(), i10);
    }

    @Override // a3.B.d
    public void R0(PlaybackException playbackException) {
        if (this.f149201C != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C13599a.e(this.f149202D);
            for (int i10 = 0; i10 < this.f149224j.size(); i10++) {
                this.f149224j.get(i10).onError(adMediaInfo);
            }
        }
    }

    @Override // a3.B.d
    public void d1(boolean z10, int i10) {
        B b10;
        AdsManager adsManager = this.f149235u;
        if (adsManager == null || (b10 = this.f149231q) == null) {
            return;
        }
        int i11 = this.f149201C;
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
        this.f149231q = b10;
        b10.l(this);
        boolean zF = b10.F();
        Q0(b10.y(), 1);
        AdsManager adsManager = this.f149235u;
        if (C5645b.f44595g.equals(this.f149240z) || adsManager == null || !this.f149200B) {
            return;
        }
        int iE = this.f149240z.e(P.M0(r0(b10, this.f149238x, this.f149220f)), P.M0(this.f149239y));
        if (iE != -1 && (bVar = this.f149203E) != null && bVar.f149242a != iE) {
            if (this.f149215a.f149290o) {
                r.b("AdTagLoader", "Discarding preloaded ad " + this.f149203E);
            }
            adsManager.discardAdBreak();
        }
        if (zF) {
            adsManager.resume();
        }
    }

    public void j0(a.InterfaceC1140a interfaceC1140a, InterfaceC5646c interfaceC5646c) {
        boolean zIsEmpty = this.f149223i.isEmpty();
        this.f149223i.add(interfaceC1140a);
        if (!zIsEmpty) {
            if (C5645b.f44595g.equals(this.f149240z)) {
                return;
            }
            interfaceC1140a.a(this.f149240z);
            return;
        }
        this.f149234t = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f149233s = videoProgressUpdate;
        this.f149232r = videoProgressUpdate;
        k1();
        if (!C5645b.f44595g.equals(this.f149240z)) {
            interfaceC1140a.a(this.f149240z);
        } else if (this.f149235u != null) {
            this.f149240z = new C5645b(this.f149219e, C15452f.a(this.f149235u.getAdCuePoints()));
            w1();
        }
        for (C5644a c5644a : interfaceC5646c.getAdOverlayInfos()) {
            this.f149227m.registerFriendlyObstruction(this.f149216b.d(c5644a.f44589a, C15452f.c(c5644a.f44590b), c5644a.f44591c));
        }
    }

    public void k0() {
        final B b10 = (B) C13599a.e(this.f149231q);
        if (!C5645b.f44595g.equals(this.f149240z) && this.f149200B) {
            AdsManager adsManager = this.f149235u;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.f149240z = this.f149240z.l(this.f149206H ? P.M0(b10.g0()) : 0L);
        }
        this.f149234t = u0();
        this.f149233s = q0();
        this.f149232r = s0();
        this.f149221g.post(new Runnable() { // from class: l3.c
            @Override // java.lang.Runnable
            public final void run() {
                C15450d.E(this.f149197a, b10);
            }
        });
        this.f149231q = null;
    }

    public void p1(a.InterfaceC1140a interfaceC1140a) {
        this.f149223i.remove(interfaceC1140a);
        if (this.f149223i.isEmpty()) {
            this.f149227m.unregisterAllFriendlyObstructions();
        }
    }

    public void release() {
        if (this.f149199A) {
            return;
        }
        this.f149199A = true;
        this.f149230p = null;
        l0();
        this.f149228n.removeAdsLoadedListener(this.f149222h);
        this.f149228n.removeAdErrorListener(this.f149222h);
        AdErrorEvent.AdErrorListener adErrorListener = this.f149215a.f149286k;
        if (adErrorListener != null) {
            this.f149228n.removeAdErrorListener(adErrorListener);
        }
        this.f149228n.release();
        int i10 = 0;
        this.f149200B = false;
        this.f149201C = 0;
        this.f149202D = null;
        v1();
        this.f149203E = null;
        this.f149237w = null;
        while (true) {
            C5645b c5645b = this.f149240z;
            if (i10 >= c5645b.f44602b) {
                w1();
                return;
            } else {
                this.f149240z = c5645b.q(i10);
                i10++;
            }
        }
    }

    public C15450d(Context context, C15452f.a aVar, C15452f.b bVar, List<String> list, g gVar, Object obj, ViewGroup viewGroup) {
        this.f149215a = aVar;
        this.f149216b = bVar;
        ImaSdkSettings imaSdkSettingsC = aVar.f149289n;
        if (imaSdkSettingsC == null) {
            imaSdkSettingsC = bVar.c();
            if (aVar.f149290o) {
                imaSdkSettingsC.setDebugMode(true);
            }
        }
        imaSdkSettingsC.setPlayerType("google/exo.ext.ima");
        imaSdkSettingsC.setPlayerVersion("1.6.0");
        this.f149217c = list;
        this.f149218d = gVar;
        this.f149219e = obj;
        this.f149220f = new F.b();
        this.f149221g = P.y(C15452f.d(), null);
        c cVar = new c(this, null);
        this.f149222h = cVar;
        this.f149223i = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.f149224j = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.f149288m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.f149225k = new Runnable() { // from class: l3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f149195a.x1();
            }
        };
        this.f149226l = H.g();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f149232r = videoProgressUpdate;
        this.f149233s = videoProgressUpdate;
        this.f149210L = -9223372036854775807L;
        this.f149211M = -9223372036854775807L;
        this.f149212N = -9223372036854775807L;
        this.f149214P = -9223372036854775807L;
        this.f149239y = -9223372036854775807L;
        this.f149238x = F.f44401a;
        this.f149240z = C5645b.f44595g;
        this.f149229o = new Runnable() { // from class: l3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f149196a.x0();
            }
        };
        if (viewGroup != null) {
            this.f149227m = bVar.b(viewGroup, cVar);
        } else {
            this.f149227m = bVar.g(context, cVar);
        }
        Collection<CompanionAdSlot> collection = aVar.f149285j;
        if (collection != null) {
            this.f149227m.setCompanionSlots(collection);
        }
        this.f149228n = q1(context, imaSdkSettingsC, this.f149227m);
    }

    public static /* synthetic */ void E(C15450d c15450d, B b10) {
        c15450d.getClass();
        b10.Z(c15450d);
    }

    private int n0(AdPodInfo adPodInfo) {
        if (adPodInfo.getPodIndex() == -1) {
            return this.f149240z.f44602b - 1;
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
        if (this.f149237w == null) {
            this.f149237w = AdsMediaSource.AdLoadException.b(exc, iT0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1() {
        VideoProgressUpdate videoProgressUpdateQ0 = q0();
        if (this.f149215a.f149290o) {
            r.b("AdTagLoader", "Ad progress: " + C15452f.e(videoProgressUpdateQ0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) C13599a.e(this.f149202D);
        for (int i10 = 0; i10 < this.f149224j.size(); i10++) {
            this.f149224j.get(i10).onAdProgress(adMediaInfo, videoProgressUpdateQ0);
        }
        this.f149221g.removeCallbacks(this.f149225k);
        this.f149221g.postDelayed(this.f149225k, 200L);
    }

    @Override // a3.B.d
    public void Q0(F f10, int i10) {
        B b10;
        if (!f10.q() && (b10 = this.f149231q) != null) {
            this.f149238x = f10;
            long j10 = f10.f(b10.J(), this.f149220f).f44413d;
            this.f149239y = P.j1(j10);
            C5645b c5645b = this.f149240z;
            if (j10 != c5645b.f44604d) {
                this.f149240z = c5645b.n(j10);
                w1();
            }
            i1(r0(b10, f10, this.f149220f), this.f149239y);
            C0();
        }
    }

    @Override // a3.B.d
    public void Z0(B.e eVar, B.e eVar2, int i10) {
        C0();
    }

    public void l1(long j10, long j11) {
        i1(j10, j11);
    }
}
