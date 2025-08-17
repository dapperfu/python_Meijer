package androidx.media3.exoplayer.video.spherical;

import a3.t;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import d3.C13466a;
import d3.I;
import d3.r;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import w3.InterfaceC17752a;

/* loaded from: classes.dex */
final class g implements v3.h, InterfaceC17752a {

    /* renamed from: i, reason: collision with root package name */
    private int f57258i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f57259j;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f57262m;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f57250a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f57251b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final e f57252c = new e();

    /* renamed from: d, reason: collision with root package name */
    private final a f57253d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final I<Long> f57254e = new I<>();

    /* renamed from: f, reason: collision with root package name */
    private final I<c> f57255f = new I<>();

    /* renamed from: g, reason: collision with root package name */
    private final float[] f57256g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    private final float[] f57257h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    private volatile int f57260k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f57261l = -1;

    private void h(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f57262m;
        int i11 = this.f57261l;
        this.f57262m = bArr;
        if (i10 == -1) {
            i10 = this.f57260k;
        }
        this.f57261l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f57262m)) {
            return;
        }
        byte[] bArr3 = this.f57262m;
        c cVarA = bArr3 != null ? d.a(bArr3, this.f57261l) : null;
        if (cVarA == null || !e.c(cVarA)) {
            cVarA = c.b(this.f57261l);
        }
        this.f57255f.a(j10, cVarA);
    }

    @Override // v3.h
    public void a(long j10, long j11, t tVar, MediaFormat mediaFormat) {
        this.f57254e.a(j11, Long.valueOf(j10));
        h(tVar.f43920A, tVar.f43921B, j11);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            r.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f57250a.compareAndSet(true, false)) {
            ((SurfaceTexture) C13466a.e(this.f57259j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                r.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f57251b.compareAndSet(true, false)) {
                GlUtil.k(this.f57256g);
            }
            long timestamp = this.f57259j.getTimestamp();
            Long lG = this.f57254e.g(timestamp);
            if (lG != null) {
                this.f57253d.c(this.f57256g, lG.longValue());
            }
            c cVarJ = this.f57255f.j(timestamp);
            if (cVarJ != null) {
                this.f57252c.d(cVarJ);
            }
        }
        Matrix.multiplyMM(this.f57257h, 0, fArr, 0, this.f57256g, 0);
        this.f57252c.a(this.f57258i, this.f57257h, z10);
    }

    @Override // w3.InterfaceC17752a
    public void d(long j10, float[] fArr) {
        this.f57253d.e(j10, fArr);
    }

    public SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f57252c.b();
            GlUtil.b();
            this.f57258i = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            r.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f57258i);
        this.f57259j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f57249a.f57250a.set(true);
            }
        });
        return this.f57259j;
    }

    @Override // w3.InterfaceC17752a
    public void f() {
        this.f57254e.c();
        this.f57253d.d();
        this.f57251b.set(true);
    }

    public void g(int i10) {
        this.f57260k = i10;
    }
}
