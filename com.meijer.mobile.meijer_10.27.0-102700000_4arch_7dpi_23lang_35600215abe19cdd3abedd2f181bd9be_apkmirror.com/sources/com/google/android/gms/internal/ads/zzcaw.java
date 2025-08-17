package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzcaw extends zzcay implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: s, reason: collision with root package name */
    private static final Map f80582s;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6807Hr f80583c;

    /* renamed from: d, reason: collision with root package name */
    private final C6841Ir f80584d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f80585e;

    /* renamed from: f, reason: collision with root package name */
    private int f80586f;

    /* renamed from: g, reason: collision with root package name */
    private int f80587g;

    /* renamed from: h, reason: collision with root package name */
    private MediaPlayer f80588h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f80589i;

    /* renamed from: j, reason: collision with root package name */
    private int f80590j;

    /* renamed from: k, reason: collision with root package name */
    private int f80591k;

    /* renamed from: l, reason: collision with root package name */
    private int f80592l;

    /* renamed from: m, reason: collision with root package name */
    private C6739Fr f80593m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f80594n;

    /* renamed from: o, reason: collision with root package name */
    private int f80595o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC8897nr f80596p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f80597q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f80598r;

    private final boolean G() {
        int i10;
        return (this.f80588h == null || (i10 = this.f80586f) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    private final void z(int i10) {
        if (i10 == 3) {
            this.f80584d.c();
            this.f80600b.b();
        } else if (this.f80586f == 3) {
            this.f80584d.e();
            this.f80600b.c();
        }
        this.f80586f = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String l() {
        return "MediaPlayer".concat(true != this.f80594n ? "" : " spherical");
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f80592l = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void p(InterfaceC8897nr interfaceC8897nr) {
        this.f80596p = interfaceC8897nr;
    }

    static {
        HashMap map = new HashMap();
        f80582s = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    private final void A(float f10) {
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer == null) {
            Qc.p.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    static /* bridge */ /* synthetic */ void J(zzcaw zzcawVar, MediaPlayer mediaPlayer) throws IllegalStateException {
        MediaFormat format;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() || zzcawVar.f80583c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcawVar.f80598r = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcawVar.f80583c.L("onMetadataEvent", map);
            }
        } catch (RuntimeException e10) {
            Lc.v.s().x(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    private final void x() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Pc.p0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f80589i == null || surfaceTexture == null) {
            return;
        }
        y(false);
        try {
            Lc.v.o();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f80588h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f80588h.setOnCompletionListener(this);
            this.f80588h.setOnErrorListener(this);
            this.f80588h.setOnInfoListener(this);
            this.f80588h.setOnPreparedListener(this);
            this.f80588h.setOnVideoSizeChangedListener(this);
            this.f80592l = 0;
            if (this.f80594n) {
                C6739Fr c6739Fr = new C6739Fr(getContext());
                this.f80593m = c6739Fr;
                c6739Fr.c(surfaceTexture, getWidth(), getHeight());
                this.f80593m.start();
                SurfaceTexture surfaceTextureA = this.f80593m.a();
                if (surfaceTextureA != null) {
                    surfaceTexture = surfaceTextureA;
                } else {
                    this.f80593m.e();
                    this.f80593m = null;
                }
            }
            this.f80588h.setDataSource(getContext(), this.f80589i);
            Lc.v.p();
            this.f80588h.setSurface(new Surface(surfaceTexture));
            this.f80588h.setAudioStreamType(3);
            this.f80588h.setScreenOnWhilePlaying(true);
            this.f80588h.prepareAsync();
            z(1);
        } catch (IOException e10) {
            e = e10;
            Qc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f80589i)), e);
            onError(this.f80588h, 1, 0);
        } catch (IllegalArgumentException e11) {
            e = e11;
            Qc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f80589i)), e);
            onError(this.f80588h, 1, 0);
        } catch (IllegalStateException e12) {
            e = e12;
            Qc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f80589i)), e);
            onError(this.f80588h, 1, 0);
        }
    }

    private final void y(boolean z10) {
        Pc.p0.k("AdMediaPlayerView release");
        C6739Fr c6739Fr = this.f80593m;
        if (c6739Fr != null) {
            c6739Fr.e();
            this.f80593m = null;
        }
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f80588h.release();
            this.f80588h = null;
            z(0);
            if (z10) {
                this.f80587g = 0;
            }
        }
    }

    final /* synthetic */ void C(int i10) {
        InterfaceC8897nr interfaceC8897nr = this.f80596p;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.onWindowVisibilityChanged(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int e() {
        if (Build.VERSION.SDK_INT < 26 || !G()) {
            return -1;
        }
        return this.f80588h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int g() {
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int h() {
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long j() {
        if (this.f80598r != null) {
            return (k() * this.f80592l) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long k() {
        if (this.f80598r != null) {
            return f() * this.f80598r.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView pause");
        if (G() && this.f80588h.isPlaying()) {
            this.f80588h.pause();
            z(4);
            Pc.D0.f25081l.post(new RunnableC8683lr(this));
        }
        this.f80587g = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView play");
        if (G()) {
            this.f80588h.start();
            z(3);
            this.f80599a.b();
            Pc.D0.f25081l.post(new RunnableC8576kr(this));
        }
        this.f80587g = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView seek " + i10);
        if (!G()) {
            this.f80595o = i10;
        } else {
            this.f80588h.seekTo(i10);
            this.f80595o = 0;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Pc.p0.k("AdMediaPlayerView completion");
        z(5);
        this.f80587g = 5;
        Pc.D0.f25081l.post(new RunnableC8043fr(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f80582s;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        Qc.p.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        z(-1);
        this.f80587g = -1;
        Pc.D0.f25081l.post(new RunnableC8150gr(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f80582s;
        Pc.p0.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + ":" + ((String) map.get(Integer.valueOf(i11))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f80590j
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f80591k
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f80590j
            if (r2 <= 0) goto L7a
            int r2 = r5.f80591k
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.Fr r2 = r5.f80593m
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f80590j
            int r1 = r0 * r7
            int r2 = r5.f80591k
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f80591k
            int r0 = r0 * r6
            int r2 = r5.f80590j
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f80590j
            int r1 = r1 * r7
            int r2 = r5.f80591k
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f80590j
            int r4 = r5.f80591k
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.Fr r6 = r5.f80593m
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaw.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView prepared");
        z(2);
        this.f80584d.b();
        Pc.D0.f25081l.post(new RunnableC7936er(this, mediaPlayer));
        this.f80590j = mediaPlayer.getVideoWidth();
        this.f80591k = mediaPlayer.getVideoHeight();
        int i10 = this.f80595o;
        if (i10 != 0) {
            o(i10);
        }
        if (this.f80585e && G() && this.f80588h.getCurrentPosition() > 0 && this.f80587g != 3) {
            Pc.p0.k("AdMediaPlayerView nudging MediaPlayer");
            A(0.0f);
            this.f80588h.start();
            int currentPosition = this.f80588h.getCurrentPosition();
            long jA = Lc.v.c().a();
            while (G() && this.f80588h.getCurrentPosition() == currentPosition && Lc.v.c().a() - jA <= 250) {
            }
            this.f80588h.pause();
            zzn();
        }
        Qc.p.f("AdMediaPlayerView stream dimensions: " + this.f80590j + " x " + this.f80591k);
        if (this.f80587g == 3) {
            n();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Pc.p0.k("AdMediaPlayerView surface created");
        x();
        Pc.D0.f25081l.post(new RunnableC8257hr(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Pc.p0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer != null && this.f80595o == 0) {
            this.f80595o = mediaPlayer.getCurrentPosition();
        }
        C6739Fr c6739Fr = this.f80593m;
        if (c6739Fr != null) {
            c6739Fr.e();
        }
        Pc.D0.f25081l.post(new RunnableC8469jr(this));
        y(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView surface changed");
        int i12 = this.f80587g;
        boolean z10 = false;
        if (this.f80590j == i10 && this.f80591k == i11) {
            z10 = true;
        }
        if (this.f80588h != null && i12 == 3 && z10) {
            int i13 = this.f80595o;
            if (i13 != 0) {
                o(i13);
            }
            n();
        }
        C6739Fr c6739Fr = this.f80593m;
        if (c6739Fr != null) {
            c6739Fr.b(i10, i11);
        }
        Pc.D0.f25081l.post(new RunnableC8363ir(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f80584d.f(this);
        this.f80599a.a(surfaceTexture, this.f80596p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        Pc.p0.k("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.f80590j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f80591k = videoHeight;
        if (this.f80590j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        Pc.p0.k("AdMediaPlayerView window visibility changed to " + i10);
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dr
            @Override // java.lang.Runnable
            public final void run() {
                this.f73490a.C(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() throws IllegalStateException {
        Pc.p0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f80588h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f80588h.release();
            this.f80588h = null;
            z(0);
            this.f80587g = 0;
        }
        this.f80584d.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void s(float f10, float f11) {
        C6739Fr c6739Fr = this.f80593m;
        if (c6739Fr != null) {
            c6739Fr.f(f10, f11);
        }
    }

    @Override // android.view.View
    public final String toString() {
        return zzcaw.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC6909Kr
    public final void zzn() {
        A(this.f80600b.a());
    }

    public zzcaw(Context context, InterfaceC6807Hr interfaceC6807Hr, boolean z10, boolean z11, C6773Gr c6773Gr, C6841Ir c6841Ir) {
        super(context);
        this.f80586f = 0;
        this.f80587g = 0;
        this.f80597q = false;
        this.f80598r = null;
        setSurfaceTextureListener(this);
        this.f80583c = interfaceC6807Hr;
        this.f80584d = c6841Ir;
        this.f80594n = z10;
        this.f80585e = z11;
        c6841Ir.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int d() {
        if (G()) {
            return this.f80588h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int f() {
        if (G()) {
            return this.f80588h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void q(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        C6888Kc c6888KcB = C6888Kc.B(uri);
        if (c6888KcB != null && c6888KcB.f68122a == null) {
            return;
        }
        if (c6888KcB != null) {
            uri = Uri.parse(c6888KcB.f68122a);
        }
        this.f80589i = uri;
        this.f80595o = 0;
        x();
        requestLayout();
        invalidate();
    }
}
