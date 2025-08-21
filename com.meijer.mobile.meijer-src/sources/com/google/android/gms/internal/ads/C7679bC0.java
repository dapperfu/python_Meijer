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
public final class C7679bC0 implements SA0, InterfaceC7785cC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f73580a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7892dC0 f73581b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f73582c;

    /* renamed from: i, reason: collision with root package name */
    private String f73588i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f73589j;

    /* renamed from: k, reason: collision with root package name */
    private int f73590k;

    /* renamed from: n, reason: collision with root package name */
    private zzbd f73593n;

    /* renamed from: o, reason: collision with root package name */
    private C7572aC0 f73594o;

    /* renamed from: p, reason: collision with root package name */
    private C7572aC0 f73595p;

    /* renamed from: q, reason: collision with root package name */
    private C7572aC0 f73596q;

    /* renamed from: r, reason: collision with root package name */
    private C f73597r;

    /* renamed from: s, reason: collision with root package name */
    private C f73598s;

    /* renamed from: t, reason: collision with root package name */
    private C f73599t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f73600u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f73601v;

    /* renamed from: w, reason: collision with root package name */
    private int f73602w;

    /* renamed from: x, reason: collision with root package name */
    private int f73603x;

    /* renamed from: y, reason: collision with root package name */
    private int f73604y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f73605z;

    /* renamed from: e, reason: collision with root package name */
    private final C10079xl f73584e = new C10079xl();

    /* renamed from: f, reason: collision with root package name */
    private final C7431Wk f73585f = new C7431Wk();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f73587h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f73586g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final long f73583d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f73591l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f73592m = 0;

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
        this.f73593n = zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void n(QA0 qa0, C7617ai c7617ai, C7617ai c7617ai2, int i10) {
        if (i10 == 1) {
            this.f73600u = true;
            i10 = 1;
        }
        this.f73590k = i10;
    }

    public static C7679bC0 q(Context context) {
        MediaMetricsManager mediaMetricsManagerA = i3.o1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new C7679bC0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private final void s() {
        PlaybackMetrics.Builder builder = this.f73589j;
        if (builder != null && this.f73605z) {
            builder.setAudioUnderrunCount(this.f73604y);
            this.f73589j.setVideoFramesDropped(this.f73602w);
            this.f73589j.setVideoFramesPlayed(this.f73603x);
            Long l10 = (Long) this.f73586g.get(this.f73588i);
            this.f73589j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f73587h.get(this.f73588i);
            this.f73589j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f73589j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f73582c.reportPlaybackMetrics(this.f73589j.build());
        }
        this.f73589j = null;
        this.f73588i = null;
        this.f73604y = 0;
        this.f73602w = 0;
        this.f73603x = 0;
        this.f73597r = null;
        this.f73598s = null;
        this.f73599t = null;
        this.f73605z = false;
    }

    private final void t(long j10, C c10, int i10) {
        if (Objects.equals(this.f73598s, c10)) {
            return;
        }
        int i11 = this.f73598s == null ? 1 : 0;
        this.f73598s = c10;
        x(0, j10, c10, i11);
    }

    private final void u(long j10, C c10, int i10) {
        if (Objects.equals(this.f73599t, c10)) {
            return;
        }
        int i11 = this.f73599t == null ? 1 : 0;
        this.f73599t = c10;
        x(2, j10, c10, i11);
    }

    private final void v(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0) {
        int iA;
        PlaybackMetrics.Builder builder = this.f73589j;
        if (c7578aF0 == null || (iA = abstractC7432Wl.a(c7578aF0.f73222a)) == -1) {
            return;
        }
        int i10 = 0;
        abstractC7432Wl.d(iA, this.f73585f, false);
        abstractC7432Wl.e(this.f73585f.f71990c, this.f73584e, 0L);
        C8623k5 c8623k5 = this.f73584e.f80688c.f68216b;
        if (c8623k5 != null) {
            int iG = OV.G(c8623k5.f76414a);
            i10 = iG != 0 ? iG != 1 ? iG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        C10079xl c10079xl = this.f73584e;
        long j10 = c10079xl.f80697l;
        if (j10 != -9223372036854775807L && !c10079xl.f80695j && !c10079xl.f80693h && !c10079xl.b()) {
            builder.setMediaDurationMillis(OV.N(j10));
        }
        builder.setPlaybackType(true != this.f73584e.b() ? 1 : 2);
        this.f73605z = true;
    }

    private final void w(long j10, C c10, int i10) {
        if (Objects.equals(this.f73597r, c10)) {
            return;
        }
        int i11 = this.f73597r == null ? 1 : 0;
        this.f73597r = c10;
        x(1, j10, c10, i11);
    }

    private final boolean y(C7572aC0 c7572aC0) {
        if (c7572aC0 != null) {
            return c7572aC0.f73216c.equals(this.f73581b.zze());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void a(QA0 qa0, WE0 we0) {
        C7578aF0 c7578aF0 = qa0.f70375d;
        if (c7578aF0 == null) {
            return;
        }
        C c10 = we0.f71881b;
        c10.getClass();
        C7572aC0 c7572aC0 = new C7572aC0(c10, 0, this.f73581b.a(qa0.f70373b, c7578aF0));
        int i10 = we0.f71880a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f73595p = c7572aC0;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f73596q = c7572aC0;
                return;
            }
        }
        this.f73594o = c7572aC0;
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
    public final void b(com.google.android.gms.internal.ads.InterfaceC7619aj r19, com.google.android.gms.internal.ads.RA0 r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7679bC0.b(com.google.android.gms.internal.ads.aj, com.google.android.gms.internal.ads.RA0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7785cC0
    public final void c(QA0 qa0, String str) {
        C7578aF0 c7578aF0 = qa0.f70375d;
        if (c7578aF0 == null || !c7578aF0.b()) {
            s();
            this.f73588i = str;
            this.f73589j = i3.k1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            v(qa0.f70373b, qa0.f70375d);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void d(QA0 qa0, C9238ps c9238ps) {
        C7572aC0 c7572aC0 = this.f73594o;
        if (c7572aC0 != null) {
            C c10 = c7572aC0.f73214a;
            if (c10.f66512w == -1) {
                C9717uH0 c9717uH0B = c10.b();
                c9717uH0B.G(c9238ps.f78485a);
                c9717uH0B.k(c9238ps.f78486b);
                this.f73594o = new C7572aC0(c9717uH0B.H(), 0, c7572aC0.f73216c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void h(QA0 qa0, int i10, long j10, long j11) {
        C7578aF0 c7578aF0 = qa0.f70375d;
        if (c7578aF0 != null) {
            String strA = this.f73581b.a(qa0.f70373b, c7578aF0);
            Long l10 = (Long) this.f73587h.get(strA);
            Long l11 = (Long) this.f73586g.get(strA);
            this.f73587h.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f73586g.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7785cC0
    public final void l(QA0 qa0, String str, boolean z10) {
        C7578aF0 c7578aF0 = qa0.f70375d;
        if ((c7578aF0 == null || !c7578aF0.b()) && str.equals(this.f73588i)) {
            s();
        }
        this.f73586g.remove(str);
        this.f73587h.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void o(QA0 qa0, My0 my0) {
        this.f73602w += my0.f69614g;
        this.f73603x += my0.f69612e;
    }

    public final LogSessionId p() {
        return this.f73582c.getSessionId();
    }

    private C7679bC0(Context context, PlaybackSession playbackSession) {
        this.f73580a = context.getApplicationContext();
        this.f73582c = playbackSession;
        ZB0 zb0 = new ZB0(ZB0.f72933h);
        this.f73581b = zb0;
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
        TrackChangeEvent.Builder timeSinceCreatedMillis = i3.i1.a(i10).setTimeSinceCreatedMillis(j10 - this.f73583d);
        if (c10 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = c10.f66503n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = c10.f66504o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = c10.f66500k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = c10.f66499j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = c10.f66511v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = c10.f66512w;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = c10.f66481D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = c10.f66482E;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = c10.f66493d;
            if (str5 != null) {
                int i18 = OV.f69931a;
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
            float f10 = c10.f66513x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f73605z = true;
        this.f73582c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
