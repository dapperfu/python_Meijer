package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.media3.common.util.GlUtil;
import com.fullstory.FS;
import d3.C13466a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements v3.g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f56996b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f56997a;

    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k, reason: collision with root package name */
        private static final float[] f56998k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: l, reason: collision with root package name */
        private static final float[] f56999l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: m, reason: collision with root package name */
        private static final float[] f57000m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: n, reason: collision with root package name */
        private static final String[] f57001n = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: o, reason: collision with root package name */
        private static final FloatBuffer f57002o = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f57003a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f57004b = new int[3];

        /* renamed from: c, reason: collision with root package name */
        private final int[] f57005c = new int[3];

        /* renamed from: d, reason: collision with root package name */
        private final int[] f57006d = new int[3];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f57007e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        private final AtomicReference<g3.g> f57008f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f57009g = new FloatBuffer[3];

        /* renamed from: h, reason: collision with root package name */
        private androidx.media3.common.util.b f57010h;

        /* renamed from: i, reason: collision with root package name */
        private int f57011i;

        /* renamed from: j, reason: collision with root package name */
        private g3.g f57012j;

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f57004b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f57010h.j(f57001n[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    GlUtil.a(3553, this.f57004b[i10], 9729);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                FS.log_e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(g3.g gVar) {
            g3.g andSet = this.f57008f.getAndSet(gVar);
            if (andSet != null) {
                andSet.E();
            }
            this.f57003a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            g3.g andSet = this.f57008f.getAndSet(null);
            if (andSet == null && this.f57012j == null) {
                return;
            }
            if (andSet != null) {
                g3.g gVar = this.f57012j;
                if (gVar != null) {
                    gVar.E();
                }
                this.f57012j = andSet;
            }
            g3.g gVar2 = (g3.g) C13466a.e(this.f57012j);
            float[] fArr = f56999l;
            int i10 = gVar2.f132738i;
            if (i10 == 1) {
                fArr = f56998k;
            } else if (i10 == 3) {
                fArr = f57000m;
            }
            GLES20.glUniformMatrix3fv(this.f57011i, 1, false, fArr, 0);
            int[] iArr = (int[]) C13466a.e(gVar2.f132737h);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C13466a.e(gVar2.f132736g);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? gVar2.f132735f : (gVar2.f132735f + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f57004b[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = gVar2.f132734e;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f57006d[i15] != iArr2[i15] || this.f57007e[i15] != iArr[i15]) {
                    C13466a.g(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f57009g[i15] = GlUtil.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f57005c[i15], 2, 5126, false, 0, (Buffer) this.f57009g[i15]);
                    this.f57006d[i15] = iArr2[i15];
                    this.f57007e[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                FS.log_e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f57010h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f57002o);
                this.f57005c[0] = this.f57010h.e("in_tc_y");
                this.f57005c[1] = this.f57010h.e("in_tc_u");
                this.f57005c[2] = this.f57010h.e("in_tc_v");
                this.f57011i = this.f57010h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                FS.log_e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }

        public a(GLSurfaceView gLSurfaceView) {
            this.f57003a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f57006d;
                this.f57007e[i10] = -1;
                iArr[i10] = -1;
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public v3.g getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f56997a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(g3.g gVar) {
        this.f56997a.a(gVar);
    }
}
