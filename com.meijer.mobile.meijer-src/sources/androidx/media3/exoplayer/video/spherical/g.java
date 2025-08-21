package androidx.media3.exoplayer.video.spherical;

import a3.t;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import d3.C13599a;
import d3.I;
import d3.r;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import w3.InterfaceC17822a;

/* loaded from: classes.dex */
final class g implements v3.h, InterfaceC17822a {

    /* renamed from: i, reason: collision with root package name */
    private int f57482i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f57483j;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f57486m;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f57474a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f57475b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final e f57476c = new e();

    /* renamed from: d, reason: collision with root package name */
    private final a f57477d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final I<Long> f57478e = new I<>();

    /* renamed from: f, reason: collision with root package name */
    private final I<c> f57479f = new I<>();

    /* renamed from: g, reason: collision with root package name */
    private final float[] f57480g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    private final float[] f57481h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    private volatile int f57484k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f57485l = -1;

    private void h(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f57486m;
        int i11 = this.f57485l;
        this.f57486m = bArr;
        if (i10 == -1) {
            i10 = this.f57484k;
        }
        this.f57485l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f57486m)) {
            return;
        }
        byte[] bArr3 = this.f57486m;
        c cVarA = bArr3 != null ? d.a(bArr3, this.f57485l) : null;
        if (cVarA == null || !e.c(cVarA)) {
            cVarA = c.b(this.f57485l);
        }
        this.f57479f.a(j10, cVarA);
    }

    @Override // v3.h
    public void a(long j10, long j11, t tVar, MediaFormat mediaFormat) {
        this.f57478e.a(j11, Long.valueOf(j10));
        h(tVar.f44738A, tVar.f44739B, j11);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            r.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f57474a.compareAndSet(true, false)) {
            ((SurfaceTexture) C13599a.e(this.f57483j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                r.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f57475b.compareAndSet(true, false)) {
                GlUtil.k(this.f57480g);
            }
            long timestamp = this.f57483j.getTimestamp();
            Long lG = this.f57478e.g(timestamp);
            if (lG != null) {
                this.f57477d.c(this.f57480g, lG.longValue());
            }
            c cVarJ = this.f57479f.j(timestamp);
            if (cVarJ != null) {
                this.f57476c.d(cVarJ);
            }
        }
        Matrix.multiplyMM(this.f57481h, 0, fArr, 0, this.f57480g, 0);
        this.f57476c.a(this.f57482i, this.f57481h, z10);
    }

    @Override // w3.InterfaceC17822a
    public void d(long j10, float[] fArr) {
        this.f57477d.e(j10, fArr);
    }

    public SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f57476c.b();
            GlUtil.b();
            this.f57482i = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            r.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f57482i);
        this.f57483j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f57473a.f57474a.set(true);
            }
        });
        return this.f57483j;
    }

    @Override // w3.InterfaceC17822a
    public void f() {
        this.f57478e.c();
        this.f57477d.d();
        this.f57475b.set(true);
    }

    public void g(int i10) {
        this.f57484k = i10;
    }
}
