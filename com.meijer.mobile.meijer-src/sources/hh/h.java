package hh;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.fullstory.FS;
import gh.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    private static final String f135482n = "h";

    /* renamed from: a, reason: collision with root package name */
    private Camera f135483a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.CameraInfo f135484b;

    /* renamed from: c, reason: collision with root package name */
    private C14522a f135485c;

    /* renamed from: d, reason: collision with root package name */
    private Gg.b f135486d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f135487e;

    /* renamed from: f, reason: collision with root package name */
    private String f135488f;

    /* renamed from: h, reason: collision with root package name */
    private m f135490h;

    /* renamed from: i, reason: collision with root package name */
    private gh.q f135491i;

    /* renamed from: j, reason: collision with root package name */
    private gh.q f135492j;

    /* renamed from: l, reason: collision with root package name */
    private Context f135494l;

    /* renamed from: g, reason: collision with root package name */
    private i f135489g = new i();

    /* renamed from: k, reason: collision with root package name */
    private int f135493k = -1;

    /* renamed from: m, reason: collision with root package name */
    private final a f135495m = new a();

    private final class a implements Camera.PreviewCallback {

        /* renamed from: a, reason: collision with root package name */
        private p f135496a;

        /* renamed from: b, reason: collision with root package name */
        private gh.q f135497b;

        public a() {
        }

        public void a(p pVar) {
            this.f135496a = pVar;
        }

        public void b(gh.q qVar) {
            this.f135497b = qVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            gh.q qVar = this.f135497b;
            p pVar = this.f135496a;
            if (qVar == null || pVar == null) {
                FS.log_d(h.f135482n, "Got preview callback, but no handler or resolution available");
                if (pVar != null) {
                    pVar.b(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                r rVar = new r(bArr, qVar.f134232a, qVar.f134233b, camera.getParameters().getPreviewFormat(), h.this.f());
                if (h.this.f135484b.facing == 1) {
                    rVar.e(true);
                }
                pVar.a(rVar);
            } catch (RuntimeException e10) {
                FS.log_e(h.f135482n, "Camera preview failed", e10);
                pVar.b(e10);
            }
        }
    }

    private int c() {
        int iC = this.f135490h.c();
        int i10 = 0;
        if (iC != 0) {
            if (iC == 1) {
                i10 = 90;
            } else if (iC == 2) {
                i10 = 180;
            } else if (iC == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f135484b;
        int i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
        FS.log_i(f135482n, "Camera Display Orientation: " + i11);
        return i11;
    }

    private Camera.Parameters g() {
        Camera.Parameters parameters = this.f135483a.getParameters();
        String str = this.f135488f;
        if (str == null) {
            this.f135488f = parameters.flatten();
            return parameters;
        }
        parameters.unflatten(str);
        return parameters;
    }

    private void n(int i10) {
        this.f135483a.setDisplayOrientation(i10);
    }

    public void d() {
        Camera camera = this.f135483a;
        if (camera != null) {
            camera.release();
            this.f135483a = null;
        }
    }

    public void e() {
        if (this.f135483a == null) {
            throw new RuntimeException("Camera not open");
        }
        r();
    }

    public int f() {
        return this.f135493k;
    }

    public gh.q h() {
        if (this.f135492j == null) {
            return null;
        }
        return j() ? this.f135492j.b() : this.f135492j;
    }

    public boolean j() {
        int i10 = this.f135493k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f135483a.getParameters();
        return (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true;
    }

    public void l() {
        Camera cameraB = Hg.a.b(this.f135489g.b());
        this.f135483a = cameraB;
        if (cameraB == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int iA = Hg.a.a(this.f135489g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f135484b = cameraInfo;
        Camera.getCameraInfo(iA, cameraInfo);
    }

    public void m(p pVar) {
        Camera camera = this.f135483a;
        if (camera == null || !this.f135487e) {
            return;
        }
        this.f135495m.a(pVar);
        camera.setOneShotPreviewCallback(this.f135495m);
    }

    public void o(i iVar) {
        this.f135489g = iVar;
    }

    public void q(m mVar) {
        this.f135490h = mVar;
    }

    public void s(j jVar) throws IOException {
        jVar.a(this.f135483a);
    }

    public void t(boolean z10) {
        if (this.f135483a != null) {
            try {
                if (z10 != k()) {
                    C14522a c14522a = this.f135485c;
                    if (c14522a != null) {
                        c14522a.j();
                    }
                    Camera.Parameters parameters = this.f135483a.getParameters();
                    c.k(parameters, z10);
                    if (this.f135489g.f()) {
                        c.d(parameters, z10);
                    }
                    this.f135483a.setParameters(parameters);
                    C14522a c14522a2 = this.f135485c;
                    if (c14522a2 != null) {
                        c14522a2.i();
                    }
                }
            } catch (RuntimeException e10) {
                FS.log_e(f135482n, "Failed to set torch", e10);
            }
        }
    }

    public void u() {
        Camera camera = this.f135483a;
        if (camera == null || this.f135487e) {
            return;
        }
        camera.startPreview();
        this.f135487e = true;
        this.f135485c = new C14522a(this.f135483a, this.f135489g);
        Gg.b bVar = new Gg.b(this.f135494l, this, this.f135489g);
        this.f135486d = bVar;
        bVar.c();
    }

    public void v() {
        C14522a c14522a = this.f135485c;
        if (c14522a != null) {
            c14522a.j();
            this.f135485c = null;
        }
        Gg.b bVar = this.f135486d;
        if (bVar != null) {
            bVar.d();
            this.f135486d = null;
        }
        Camera camera = this.f135483a;
        if (camera == null || !this.f135487e) {
            return;
        }
        camera.stopPreview();
        this.f135495m.a(null);
        this.f135487e = false;
    }

    public h(Context context) {
        this.f135494l = context;
    }

    private static List<gh.q> i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new gh.q(previewSize.width, previewSize.height);
                arrayList.add(new gh.q(previewSize.width, previewSize.height));
                return arrayList;
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new gh.q(size.width, size.height));
            }
        }
        return arrayList;
    }

    private void p(boolean z10) {
        Camera.Parameters parametersG = g();
        if (parametersG == null) {
            FS.log_w(f135482n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f135482n;
        FS.log_i(str, "Initial camera parameters: " + parametersG.flatten());
        if (z10) {
            FS.log_w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(parametersG, this.f135489g.a(), z10);
        if (!z10) {
            c.k(parametersG, false);
            if (this.f135489g.h()) {
                c.i(parametersG);
            }
            if (this.f135489g.e()) {
                c.c(parametersG);
            }
            if (this.f135489g.g()) {
                c.l(parametersG);
                c.h(parametersG);
                c.j(parametersG);
            }
        }
        List<gh.q> listI = i(parametersG);
        if (listI.size() == 0) {
            this.f135491i = null;
        } else {
            gh.q qVarA = this.f135490h.a(listI, j());
            this.f135491i = qVarA;
            parametersG.setPreviewSize(qVarA.f134232a, qVarA.f134233b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(parametersG);
        }
        FS.log_i(str, "Final camera parameters: " + parametersG.flatten());
        this.f135483a.setParameters(parametersG);
    }

    private void r() {
        try {
            int iC = c();
            this.f135493k = iC;
            n(iC);
        } catch (Exception unused) {
            FS.log_w(f135482n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                FS.log_w(f135482n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f135483a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f135492j = this.f135491i;
        } else {
            this.f135492j = new gh.q(previewSize.width, previewSize.height);
        }
        this.f135495m.b(this.f135492j);
    }
}
