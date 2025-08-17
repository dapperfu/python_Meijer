package gh;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.fullstory.FS;
import fh.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    private static final String f133416n = "h";

    /* renamed from: a, reason: collision with root package name */
    private Camera f133417a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.CameraInfo f133418b;

    /* renamed from: c, reason: collision with root package name */
    private C14260a f133419c;

    /* renamed from: d, reason: collision with root package name */
    private Eg.b f133420d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f133421e;

    /* renamed from: f, reason: collision with root package name */
    private String f133422f;

    /* renamed from: h, reason: collision with root package name */
    private m f133424h;

    /* renamed from: i, reason: collision with root package name */
    private fh.q f133425i;

    /* renamed from: j, reason: collision with root package name */
    private fh.q f133426j;

    /* renamed from: l, reason: collision with root package name */
    private Context f133428l;

    /* renamed from: g, reason: collision with root package name */
    private i f133423g = new i();

    /* renamed from: k, reason: collision with root package name */
    private int f133427k = -1;

    /* renamed from: m, reason: collision with root package name */
    private final a f133429m = new a();

    private final class a implements Camera.PreviewCallback {

        /* renamed from: a, reason: collision with root package name */
        private p f133430a;

        /* renamed from: b, reason: collision with root package name */
        private fh.q f133431b;

        public a() {
        }

        public void a(p pVar) {
            this.f133430a = pVar;
        }

        public void b(fh.q qVar) {
            this.f133431b = qVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            fh.q qVar = this.f133431b;
            p pVar = this.f133430a;
            if (qVar == null || pVar == null) {
                FS.log_d(h.f133416n, "Got preview callback, but no handler or resolution available");
                if (pVar != null) {
                    pVar.a(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                r rVar = new r(bArr, qVar.f131133a, qVar.f131134b, camera.getParameters().getPreviewFormat(), h.this.f());
                if (h.this.f133418b.facing == 1) {
                    rVar.e(true);
                }
                pVar.b(rVar);
            } catch (RuntimeException e10) {
                FS.log_e(h.f133416n, "Camera preview failed", e10);
                pVar.a(e10);
            }
        }
    }

    private int c() {
        int iC = this.f133424h.c();
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
        Camera.CameraInfo cameraInfo = this.f133418b;
        int i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
        FS.log_i(f133416n, "Camera Display Orientation: " + i11);
        return i11;
    }

    private Camera.Parameters g() {
        Camera.Parameters parameters = this.f133417a.getParameters();
        String str = this.f133422f;
        if (str == null) {
            this.f133422f = parameters.flatten();
            return parameters;
        }
        parameters.unflatten(str);
        return parameters;
    }

    private void n(int i10) {
        this.f133417a.setDisplayOrientation(i10);
    }

    public void d() {
        Camera camera = this.f133417a;
        if (camera != null) {
            camera.release();
            this.f133417a = null;
        }
    }

    public void e() {
        if (this.f133417a == null) {
            throw new RuntimeException("Camera not open");
        }
        r();
    }

    public int f() {
        return this.f133427k;
    }

    public fh.q h() {
        if (this.f133426j == null) {
            return null;
        }
        return j() ? this.f133426j.b() : this.f133426j;
    }

    public boolean j() {
        int i10 = this.f133427k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f133417a.getParameters();
        return (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true;
    }

    public void l() {
        Camera cameraB = Fg.a.b(this.f133423g.b());
        this.f133417a = cameraB;
        if (cameraB == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int iA = Fg.a.a(this.f133423g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f133418b = cameraInfo;
        Camera.getCameraInfo(iA, cameraInfo);
    }

    public void m(p pVar) {
        Camera camera = this.f133417a;
        if (camera == null || !this.f133421e) {
            return;
        }
        this.f133429m.a(pVar);
        camera.setOneShotPreviewCallback(this.f133429m);
    }

    public void o(i iVar) {
        this.f133423g = iVar;
    }

    public void q(m mVar) {
        this.f133424h = mVar;
    }

    public void s(j jVar) throws IOException {
        jVar.a(this.f133417a);
    }

    public void t(boolean z10) {
        if (this.f133417a != null) {
            try {
                if (z10 != k()) {
                    C14260a c14260a = this.f133419c;
                    if (c14260a != null) {
                        c14260a.j();
                    }
                    Camera.Parameters parameters = this.f133417a.getParameters();
                    c.k(parameters, z10);
                    if (this.f133423g.f()) {
                        c.d(parameters, z10);
                    }
                    this.f133417a.setParameters(parameters);
                    C14260a c14260a2 = this.f133419c;
                    if (c14260a2 != null) {
                        c14260a2.i();
                    }
                }
            } catch (RuntimeException e10) {
                FS.log_e(f133416n, "Failed to set torch", e10);
            }
        }
    }

    public void u() {
        Camera camera = this.f133417a;
        if (camera == null || this.f133421e) {
            return;
        }
        camera.startPreview();
        this.f133421e = true;
        this.f133419c = new C14260a(this.f133417a, this.f133423g);
        Eg.b bVar = new Eg.b(this.f133428l, this, this.f133423g);
        this.f133420d = bVar;
        bVar.c();
    }

    public void v() {
        C14260a c14260a = this.f133419c;
        if (c14260a != null) {
            c14260a.j();
            this.f133419c = null;
        }
        Eg.b bVar = this.f133420d;
        if (bVar != null) {
            bVar.d();
            this.f133420d = null;
        }
        Camera camera = this.f133417a;
        if (camera == null || !this.f133421e) {
            return;
        }
        camera.stopPreview();
        this.f133429m.a(null);
        this.f133421e = false;
    }

    public h(Context context) {
        this.f133428l = context;
    }

    private static List<fh.q> i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new fh.q(previewSize.width, previewSize.height);
                arrayList.add(new fh.q(previewSize.width, previewSize.height));
                return arrayList;
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new fh.q(size.width, size.height));
            }
        }
        return arrayList;
    }

    private void p(boolean z10) {
        Camera.Parameters parametersG = g();
        if (parametersG == null) {
            FS.log_w(f133416n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f133416n;
        FS.log_i(str, "Initial camera parameters: " + parametersG.flatten());
        if (z10) {
            FS.log_w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(parametersG, this.f133423g.a(), z10);
        if (!z10) {
            c.k(parametersG, false);
            if (this.f133423g.h()) {
                c.i(parametersG);
            }
            if (this.f133423g.e()) {
                c.c(parametersG);
            }
            if (this.f133423g.g()) {
                c.l(parametersG);
                c.h(parametersG);
                c.j(parametersG);
            }
        }
        List<fh.q> listI = i(parametersG);
        if (listI.size() == 0) {
            this.f133425i = null;
        } else {
            fh.q qVarA = this.f133424h.a(listI, j());
            this.f133425i = qVarA;
            parametersG.setPreviewSize(qVarA.f131133a, qVarA.f131134b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(parametersG);
        }
        FS.log_i(str, "Final camera parameters: " + parametersG.flatten());
        this.f133417a.setParameters(parametersG);
    }

    private void r() {
        try {
            int iC = c();
            this.f133427k = iC;
            n(iC);
        } catch (Exception unused) {
            FS.log_w(f133416n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                FS.log_w(f133416n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f133417a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f133426j = this.f133425i;
        } else {
            this.f133426j = new fh.q(previewSize.width, previewSize.height);
        }
        this.f133429m.b(this.f133426j);
    }
}
