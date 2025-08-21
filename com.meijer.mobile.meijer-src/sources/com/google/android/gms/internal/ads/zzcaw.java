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
    private static final Map f81422s;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6932Hr f81423c;

    /* renamed from: d, reason: collision with root package name */
    private final C6966Ir f81424d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81425e;

    /* renamed from: f, reason: collision with root package name */
    private int f81426f;

    /* renamed from: g, reason: collision with root package name */
    private int f81427g;

    /* renamed from: h, reason: collision with root package name */
    private MediaPlayer f81428h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f81429i;

    /* renamed from: j, reason: collision with root package name */
    private int f81430j;

    /* renamed from: k, reason: collision with root package name */
    private int f81431k;

    /* renamed from: l, reason: collision with root package name */
    private int f81432l;

    /* renamed from: m, reason: collision with root package name */
    private C6864Fr f81433m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f81434n;

    /* renamed from: o, reason: collision with root package name */
    private int f81435o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC9022nr f81436p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f81437q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f81438r;

    private final boolean G() {
        int i10;
        return (this.f81428h == null || (i10 = this.f81426f) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    private final void z(int i10) {
        if (i10 == 3) {
            this.f81424d.c();
            this.f81440b.b();
        } else if (this.f81426f == 3) {
            this.f81424d.e();
            this.f81440b.c();
        }
        this.f81426f = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String l() {
        return "MediaPlayer".concat(true != this.f81434n ? "" : " spherical");
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f81432l = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void p(InterfaceC9022nr interfaceC9022nr) {
        this.f81436p = interfaceC9022nr;
    }

    static {
        HashMap map = new HashMap();
        f81422s = map;
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
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer == null) {
            Sc.p.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    static /* bridge */ /* synthetic */ void J(zzcaw zzcawVar, MediaPlayer mediaPlayer) throws IllegalStateException {
        MediaFormat format;
        if (!((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() || zzcawVar.f81423c == null || mediaPlayer == null) {
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
                                    zzcawVar.f81438r = numValueOf;
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
                zzcawVar.f81423c.L("onMetadataEvent", map);
            }
        } catch (RuntimeException e10) {
            Nc.v.s().x(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    private final void x() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Rc.p0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f81429i == null || surfaceTexture == null) {
            return;
        }
        y(false);
        try {
            Nc.v.o();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f81428h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f81428h.setOnCompletionListener(this);
            this.f81428h.setOnErrorListener(this);
            this.f81428h.setOnInfoListener(this);
            this.f81428h.setOnPreparedListener(this);
            this.f81428h.setOnVideoSizeChangedListener(this);
            this.f81432l = 0;
            if (this.f81434n) {
                C6864Fr c6864Fr = new C6864Fr(getContext());
                this.f81433m = c6864Fr;
                c6864Fr.c(surfaceTexture, getWidth(), getHeight());
                this.f81433m.start();
                SurfaceTexture surfaceTextureA = this.f81433m.a();
                if (surfaceTextureA != null) {
                    surfaceTexture = surfaceTextureA;
                } else {
                    this.f81433m.e();
                    this.f81433m = null;
                }
            }
            this.f81428h.setDataSource(getContext(), this.f81429i);
            Nc.v.p();
            this.f81428h.setSurface(new Surface(surfaceTexture));
            this.f81428h.setAudioStreamType(3);
            this.f81428h.setScreenOnWhilePlaying(true);
            this.f81428h.prepareAsync();
            z(1);
        } catch (IOException e10) {
            e = e10;
            Sc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f81429i)), e);
            onError(this.f81428h, 1, 0);
        } catch (IllegalArgumentException e11) {
            e = e11;
            Sc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f81429i)), e);
            onError(this.f81428h, 1, 0);
        } catch (IllegalStateException e12) {
            e = e12;
            Sc.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f81429i)), e);
            onError(this.f81428h, 1, 0);
        }
    }

    private final void y(boolean z10) {
        Rc.p0.k("AdMediaPlayerView release");
        C6864Fr c6864Fr = this.f81433m;
        if (c6864Fr != null) {
            c6864Fr.e();
            this.f81433m = null;
        }
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f81428h.release();
            this.f81428h = null;
            z(0);
            if (z10) {
                this.f81427g = 0;
            }
        }
    }

    final /* synthetic */ void C(int i10) {
        InterfaceC9022nr interfaceC9022nr = this.f81436p;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.onWindowVisibilityChanged(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int e() {
        if (Build.VERSION.SDK_INT < 26 || !G()) {
            return -1;
        }
        return this.f81428h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int g() {
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int h() {
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long j() {
        if (this.f81438r != null) {
            return (k() * this.f81432l) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long k() {
        if (this.f81438r != null) {
            return f() * this.f81438r.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView pause");
        if (G() && this.f81428h.isPlaying()) {
            this.f81428h.pause();
            z(4);
            Rc.D0.f32295l.post(new RunnableC8808lr(this));
        }
        this.f81427g = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView play");
        if (G()) {
            this.f81428h.start();
            z(3);
            this.f81439a.b();
            Rc.D0.f32295l.post(new RunnableC8701kr(this));
        }
        this.f81427g = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView seek " + i10);
        if (!G()) {
            this.f81435o = i10;
        } else {
            this.f81428h.seekTo(i10);
            this.f81435o = 0;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Rc.p0.k("AdMediaPlayerView completion");
        z(5);
        this.f81427g = 5;
        Rc.D0.f32295l.post(new RunnableC8168fr(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f81422s;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        Sc.p.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        z(-1);
        this.f81427g = -1;
        Rc.D0.f32295l.post(new RunnableC8275gr(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f81422s;
        Rc.p0.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + ":" + ((String) map.get(Integer.valueOf(i11))));
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
            int r0 = r5.f81430j
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f81431k
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f81430j
            if (r2 <= 0) goto L7a
            int r2 = r5.f81431k
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.Fr r2 = r5.f81433m
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f81430j
            int r1 = r0 * r7
            int r2 = r5.f81431k
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
            int r0 = r5.f81431k
            int r0 = r0 * r6
            int r2 = r5.f81430j
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f81430j
            int r1 = r1 * r7
            int r2 = r5.f81431k
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
            int r2 = r5.f81430j
            int r4 = r5.f81431k
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
            com.google.android.gms.internal.ads.Fr r6 = r5.f81433m
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaw.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView prepared");
        z(2);
        this.f81424d.b();
        Rc.D0.f32295l.post(new RunnableC8061er(this, mediaPlayer));
        this.f81430j = mediaPlayer.getVideoWidth();
        this.f81431k = mediaPlayer.getVideoHeight();
        int i10 = this.f81435o;
        if (i10 != 0) {
            o(i10);
        }
        if (this.f81425e && G() && this.f81428h.getCurrentPosition() > 0 && this.f81427g != 3) {
            Rc.p0.k("AdMediaPlayerView nudging MediaPlayer");
            A(0.0f);
            this.f81428h.start();
            int currentPosition = this.f81428h.getCurrentPosition();
            long jA = Nc.v.c().a();
            while (G() && this.f81428h.getCurrentPosition() == currentPosition && Nc.v.c().a() - jA <= 250) {
            }
            this.f81428h.pause();
            zzn();
        }
        Sc.p.f("AdMediaPlayerView stream dimensions: " + this.f81430j + " x " + this.f81431k);
        if (this.f81427g == 3) {
            n();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Rc.p0.k("AdMediaPlayerView surface created");
        x();
        Rc.D0.f32295l.post(new RunnableC8382hr(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Rc.p0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer != null && this.f81435o == 0) {
            this.f81435o = mediaPlayer.getCurrentPosition();
        }
        C6864Fr c6864Fr = this.f81433m;
        if (c6864Fr != null) {
            c6864Fr.e();
        }
        Rc.D0.f32295l.post(new RunnableC8594jr(this));
        y(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView surface changed");
        int i12 = this.f81427g;
        boolean z10 = false;
        if (this.f81430j == i10 && this.f81431k == i11) {
            z10 = true;
        }
        if (this.f81428h != null && i12 == 3 && z10) {
            int i13 = this.f81435o;
            if (i13 != 0) {
                o(i13);
            }
            n();
        }
        C6864Fr c6864Fr = this.f81433m;
        if (c6864Fr != null) {
            c6864Fr.b(i10, i11);
        }
        Rc.D0.f32295l.post(new RunnableC8488ir(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f81424d.f(this);
        this.f81439a.a(surfaceTexture, this.f81436p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        Rc.p0.k("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.f81430j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f81431k = videoHeight;
        if (this.f81430j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        Rc.p0.k("AdMediaPlayerView window visibility changed to " + i10);
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dr
            @Override // java.lang.Runnable
            public final void run() {
                this.f74330a.C(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() throws IllegalStateException {
        Rc.p0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f81428h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f81428h.release();
            this.f81428h = null;
            z(0);
            this.f81427g = 0;
        }
        this.f81424d.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void s(float f10, float f11) {
        C6864Fr c6864Fr = this.f81433m;
        if (c6864Fr != null) {
            c6864Fr.f(f10, f11);
        }
    }

    @Override // android.view.View
    public final String toString() {
        return zzcaw.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC7034Kr
    public final void zzn() {
        A(this.f81440b.a());
    }

    public zzcaw(Context context, InterfaceC6932Hr interfaceC6932Hr, boolean z10, boolean z11, C6898Gr c6898Gr, C6966Ir c6966Ir) {
        super(context);
        this.f81426f = 0;
        this.f81427g = 0;
        this.f81437q = false;
        this.f81438r = null;
        setSurfaceTextureListener(this);
        this.f81423c = interfaceC6932Hr;
        this.f81424d = c6966Ir;
        this.f81434n = z10;
        this.f81425e = z11;
        c6966Ir.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int d() {
        if (G()) {
            return this.f81428h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int f() {
        if (G()) {
            return this.f81428h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void q(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        C7013Kc c7013KcB = C7013Kc.B(uri);
        if (c7013KcB != null && c7013KcB.f68962a == null) {
            return;
        }
        if (c7013KcB != null) {
            uri = Uri.parse(c7013KcB.f68962a);
        }
        this.f81429i = uri;
        this.f81435o = 0;
        x();
        requestLayout();
        invalidate();
    }
}
