package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.spherical.c;
import com.fullstory.FS;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class e {

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f57231j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f57232k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f57233l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f57234m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f57235n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f57236a;

    /* renamed from: b, reason: collision with root package name */
    private a f57237b;

    /* renamed from: c, reason: collision with root package name */
    private a f57238c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.media3.common.util.b f57239d;

    /* renamed from: e, reason: collision with root package name */
    private int f57240e;

    /* renamed from: f, reason: collision with root package name */
    private int f57241f;

    /* renamed from: g, reason: collision with root package name */
    private int f57242g;

    /* renamed from: h, reason: collision with root package name */
    private int f57243h;

    /* renamed from: i, reason: collision with root package name */
    private int f57244i;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f57245a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f57246b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f57247c;

        /* renamed from: d, reason: collision with root package name */
        private final int f57248d;

        public a(c.b bVar) {
            this.f57245a = bVar.a();
            this.f57246b = GlUtil.e(bVar.f57229c);
            this.f57247c = GlUtil.e(bVar.f57230d);
            int i10 = bVar.f57228b;
            if (i10 != 1) {
                if (i10 != 2) {
                    this.f57248d = 4;
                    return;
                } else {
                    this.f57248d = 6;
                    return;
                }
            }
            this.f57248d = 5;
        }
    }

    public static boolean c(c cVar) {
        c.a aVar = cVar.f57222a;
        c.a aVar2 = cVar.f57223b;
        return aVar.b() == 1 && aVar.a(0).f57227a == 0 && aVar2.b() == 1 && aVar2.a(0).f57227a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f57238c : this.f57237b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f57236a;
        GLES20.glUniformMatrix3fv(this.f57241f, 1, false, i11 == 1 ? z10 ? f57233l : f57232k : i11 == 2 ? z10 ? f57235n : f57234m : f57231j, 0);
        GLES20.glUniformMatrix4fv(this.f57240e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f57244i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            FS.log_e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f57242g, 3, 5126, false, 12, (Buffer) aVar.f57246b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            FS.log_e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f57243h, 2, 5126, false, 8, (Buffer) aVar.f57247c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            FS.log_e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f57248d, 0, aVar.f57245a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            FS.log_e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f57239d = bVar;
            this.f57240e = bVar.j("uMvpMatrix");
            this.f57241f = this.f57239d.j("uTexMatrix");
            this.f57242g = this.f57239d.e("aPosition");
            this.f57243h = this.f57239d.e("aTexCoords");
            this.f57244i = this.f57239d.j("uTexture");
        } catch (GlUtil.GlException e10) {
            FS.log_e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    e() {
    }

    public void d(c cVar) {
        if (!c(cVar)) {
            return;
        }
        this.f57236a = cVar.f57224c;
        a aVar = new a(cVar.f57222a.a(0));
        this.f57237b = aVar;
        if (!cVar.f57225d) {
            aVar = new a(cVar.f57223b.a(0));
        }
        this.f57238c = aVar;
    }
}
