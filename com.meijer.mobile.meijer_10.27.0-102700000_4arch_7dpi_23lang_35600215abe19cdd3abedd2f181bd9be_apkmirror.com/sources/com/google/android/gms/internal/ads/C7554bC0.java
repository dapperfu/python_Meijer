package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7554bC0 implements SA0, InterfaceC7660cC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72740a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7767dC0 f72741b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f72742c;

    /* renamed from: i, reason: collision with root package name */
    private String f72748i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f72749j;

    /* renamed from: k, reason: collision with root package name */
    private int f72750k;

    /* renamed from: n, reason: collision with root package name */
    private zzbd f72753n;

    /* renamed from: o, reason: collision with root package name */
    private C7447aC0 f72754o;

    /* renamed from: p, reason: collision with root package name */
    private C7447aC0 f72755p;

    /* renamed from: q, reason: collision with root package name */
    private C7447aC0 f72756q;

    /* renamed from: r, reason: collision with root package name */
    private C f72757r;

    /* renamed from: s, reason: collision with root package name */
    private C f72758s;

    /* renamed from: t, reason: collision with root package name */
    private C f72759t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f72760u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f72761v;

    /* renamed from: w, reason: collision with root package name */
    private int f72762w;

    /* renamed from: x, reason: collision with root package name */
    private int f72763x;

    /* renamed from: y, reason: collision with root package name */
    private int f72764y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f72765z;

    /* renamed from: e, reason: collision with root package name */
    private final C9954xl f72744e = new C9954xl();

    /* renamed from: f, reason: collision with root package name */
    private final C7306Wk f72745f = new C7306Wk();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f72747h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f72746g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final long f72743d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f72751l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f72752m = 0;

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void e(QA0 qa0, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void f(QA0 qa0, QE0 qe0, WE0 we0, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void g(QA0 qa0, C c10, Ny0 ny0) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void i(QA0 qa0, C c10, Ny0 ny0) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void j(QA0 qa0, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void k(QA0 qa0, int i10, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void m(QA0 qa0, zzbd zzbdVar) {
        this.f72753n = zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void n(QA0 qa0, C7492ai c7492ai, C7492ai c7492ai2, int i10) {
        if (i10 == 1) {
            this.f72760u = true;
            i10 = 1;
        }
        this.f72750k = i10;
    }

    public static C7554bC0 q(Context context) {
        MediaMetricsManager mediaMetricsManagerA = i3.o1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new C7554bC0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private final void s() {
        PlaybackMetrics.Builder builder = this.f72749j;
        if (builder != null && this.f72765z) {
            builder.setAudioUnderrunCount(this.f72764y);
            this.f72749j.setVideoFramesDropped(this.f72762w);
            this.f72749j.setVideoFramesPlayed(this.f72763x);
            Long l10 = (Long) this.f72746g.get(this.f72748i);
            this.f72749j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f72747h.get(this.f72748i);
            this.f72749j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f72749j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f72742c.reportPlaybackMetrics(this.f72749j.build());
        }
        this.f72749j = null;
        this.f72748i = null;
        this.f72764y = 0;
        this.f72762w = 0;
        this.f72763x = 0;
        this.f72757r = null;
        this.f72758s = null;
        this.f72759t = null;
        this.f72765z = false;
    }

    private final void t(long j10, C c10, int i10) {
        if (Objects.equals(this.f72758s, c10)) {
            return;
        }
        int i11 = this.f72758s == null ? 1 : 0;
        this.f72758s = c10;
        x(0, j10, c10, i11);
    }

    private final void u(long j10, C c10, int i10) {
        if (Objects.equals(this.f72759t, c10)) {
            return;
        }
        int i11 = this.f72759t == null ? 1 : 0;
        this.f72759t = c10;
        x(2, j10, c10, i11);
    }

    private final void v(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0) {
        int iA;
        PlaybackMetrics.Builder builder = this.f72749j;
        if (c7453aF0 == null || (iA = abstractC7307Wl.a(c7453aF0.f72382a)) == -1) {
            return;
        }
        int i10 = 0;
        abstractC7307Wl.d(iA, this.f72745f, false);
        abstractC7307Wl.e(this.f72745f.f71150c, this.f72744e, 0L);
        C8498k5 c8498k5 = this.f72744e.f79848c.f67376b;
        if (c8498k5 != null) {
            int iG = OV.G(c8498k5.f75574a);
            i10 = iG != 0 ? iG != 1 ? iG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        C9954xl c9954xl = this.f72744e;
        long j10 = c9954xl.f79857l;
        if (j10 != -9223372036854775807L && !c9954xl.f79855j && !c9954xl.f79853h && !c9954xl.b()) {
            builder.setMediaDurationMillis(OV.N(j10));
        }
        builder.setPlaybackType(true != this.f72744e.b() ? 1 : 2);
        this.f72765z = true;
    }

    private final void w(long j10, C c10, int i10) {
        if (Objects.equals(this.f72757r, c10)) {
            return;
        }
        int i11 = this.f72757r == null ? 1 : 0;
        this.f72757r = c10;
        x(1, j10, c10, i11);
    }

    private final boolean y(C7447aC0 c7447aC0) {
        if (c7447aC0 != null) {
            return c7447aC0.f72376c.equals(this.f72741b.zze());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void a(QA0 qa0, WE0 we0) {
        C7453aF0 c7453aF0 = qa0.f69535d;
        if (c7453aF0 == null) {
            return;
        }
        C c10 = we0.f71041b;
        c10.getClass();
        C7447aC0 c7447aC0 = new C7447aC0(c10, 0, this.f72741b.a(qa0.f69533b, c7453aF0));
        int i10 = we0.f71040a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f72755p = c7447aC0;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f72756q = c7447aC0;
                return;
            }
        }
        this.f72754o = c7447aC0;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a0  */
    @Override // com.google.android.gms.internal.ads.SA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.internal.ads.InterfaceC7494aj r19, com.google.android.gms.internal.ads.RA0 r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7554bC0.b(com.google.android.gms.internal.ads.aj, com.google.android.gms.internal.ads.RA0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660cC0
    public final void c(QA0 qa0, String str) {
        C7453aF0 c7453aF0 = qa0.f69535d;
        if (c7453aF0 == null || !c7453aF0.b()) {
            s();
            this.f72748i = str;
            this.f72749j = i3.k1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            v(qa0.f69533b, qa0.f69535d);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void d(QA0 qa0, C9113ps c9113ps) {
        C7447aC0 c7447aC0 = this.f72754o;
        if (c7447aC0 != null) {
            C c10 = c7447aC0.f72374a;
            if (c10.f65672w == -1) {
                C9592uH0 c9592uH0B = c10.b();
                c9592uH0B.G(c9113ps.f77645a);
                c9592uH0B.k(c9113ps.f77646b);
                this.f72754o = new C7447aC0(c9592uH0B.H(), 0, c7447aC0.f72376c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void h(QA0 qa0, int i10, long j10, long j11) {
        C7453aF0 c7453aF0 = qa0.f69535d;
        if (c7453aF0 != null) {
            String strA = this.f72741b.a(qa0.f69533b, c7453aF0);
            Long l10 = (Long) this.f72747h.get(strA);
            Long l11 = (Long) this.f72746g.get(strA);
            this.f72747h.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f72746g.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660cC0
    public final void l(QA0 qa0, String str, boolean z10) {
        C7453aF0 c7453aF0 = qa0.f69535d;
        if ((c7453aF0 == null || !c7453aF0.b()) && str.equals(this.f72748i)) {
            s();
        }
        this.f72746g.remove(str);
        this.f72747h.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void o(QA0 qa0, My0 my0) {
        this.f72762w += my0.f68774g;
        this.f72763x += my0.f68772e;
    }

    public final LogSessionId p() {
        return this.f72742c.getSessionId();
    }

    private C7554bC0(Context context, PlaybackSession playbackSession) {
        this.f72740a = context.getApplicationContext();
        this.f72742c = playbackSession;
        ZB0 zb0 = new ZB0(ZB0.f72093h);
        this.f72741b = zb0;
        zb0.c(this);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int r(int i10) {
        switch (OV.D(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void x(int i10, long j10, C c10, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = i3.i1.a(i10).setTimeSinceCreatedMillis(j10 - this.f72743d);
        if (c10 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = c10.f65663n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = c10.f65664o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = c10.f65660k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = c10.f65659j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = c10.f65671v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = c10.f65672w;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = c10.f65641D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = c10.f65642E;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = c10.f65653d;
            if (str5 != null) {
                int i18 = OV.f69091a;
                String[] strArrSplit = str5.split("-", -1);
                String str6 = strArrSplit[0];
                if (strArrSplit.length >= 2) {
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
                Pair pairCreate = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c10.f65673x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f72765z = true;
        this.f72742c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
