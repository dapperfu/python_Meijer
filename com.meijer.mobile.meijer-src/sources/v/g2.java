package v;

import F.AbstractC3273h;
import F.S;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class g2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f165072a;

    /* renamed from: b, reason: collision with root package name */
    final N.d f165073b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f165074c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f165075d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f165076e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f165077f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.q f165078g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC3273h f165079h;

    /* renamed from: i, reason: collision with root package name */
    private DeferrableSurface f165080i;

    /* renamed from: j, reason: collision with root package name */
    ImageWriter f165081j;

    class a extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                g2.this.f165081j = K.a.c(inputSurface, 1);
            }
        }
    }

    private void j() {
        N.d dVar = this.f165073b;
        while (!dVar.c()) {
            dVar.a().close();
        }
        DeferrableSurface deferrableSurface = this.f165080i;
        if (deferrableSurface != null) {
            androidx.camera.core.q qVar = this.f165078g;
            if (qVar != null) {
                deferrableSurface.k().addListener(new f2(qVar), H.a.d());
                this.f165078g = null;
            }
            deferrableSurface.d();
            this.f165080i = null;
        }
        ImageWriter imageWriter = this.f165081j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f165081j = null;
        }
    }

    private Map<Integer, Size> k(w.B b10) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            C.P.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new G.d(true));
                map.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return map;
    }

    private boolean l(w.B b10, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    @Override // v.c2
    public void a(w.b bVar) {
        j();
        if (this.f165074c) {
            bVar.w(1);
            return;
        }
        if (this.f165077f) {
            bVar.w(1);
            return;
        }
        Map<Integer, Size> mapK = k(this.f165072a);
        if (!this.f165076e || mapK.isEmpty() || !mapK.containsKey(34) || !l(this.f165072a, 34)) {
            bVar.w(1);
            return;
        }
        Size size = mapK.get(34);
        androidx.camera.core.p pVar = new androidx.camera.core.p(size.getWidth(), size.getHeight(), 34, 9);
        this.f165079h = pVar.m();
        this.f165078g = new androidx.camera.core.q(pVar);
        pVar.f(new S.a() { // from class: v.e2
            @Override // F.S.a
            public final void a(F.S s10) {
                g2.h(this.f165058a, s10);
            }
        }, H.a.c());
        F.T t10 = new F.T(this.f165078g.getSurface(), new Size(this.f165078g.getWidth(), this.f165078g.getHeight()), 34);
        this.f165080i = t10;
        androidx.camera.core.q qVar = this.f165078g;
        com.google.common.util.concurrent.q<Void> qVarK = t10.k();
        Objects.requireNonNull(qVar);
        qVarK.addListener(new f2(qVar), H.a.d());
        bVar.l(this.f165080i);
        bVar.e(this.f165079h);
        bVar.k(new a());
        bVar.t(new InputConfiguration(this.f165078g.getWidth(), this.f165078g.getHeight(), this.f165078g.c()));
    }

    @Override // v.c2
    public boolean b() {
        return this.f165074c;
    }

    @Override // v.c2
    public void c(boolean z10) {
        this.f165075d = z10;
    }

    @Override // v.c2
    public void d(boolean z10) {
        this.f165074c = z10;
    }

    @Override // v.c2
    public androidx.camera.core.n e() {
        try {
            return this.f165073b.a();
        } catch (NoSuchElementException unused) {
            C.P.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // v.c2
    public boolean g() {
        return this.f165075d;
    }

    g2(w.B b10) {
        this.f165076e = false;
        this.f165077f = false;
        this.f165072a = b10;
        this.f165076e = h2.a(b10, 4);
        this.f165077f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f165073b = new N.d(3, new N.b() { // from class: v.d2
            @Override // N.b
            public final void a(Object obj) {
                ((androidx.camera.core.n) obj).close();
            }
        });
    }

    public static /* synthetic */ void h(g2 g2Var, F.S s10) {
        g2Var.getClass();
        try {
            androidx.camera.core.n nVarB = s10.b();
            if (nVarB != null) {
                g2Var.f165073b.d(nVarB);
            }
        } catch (IllegalStateException e10) {
            C.P.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // v.c2
    public boolean f(androidx.camera.core.n nVar) {
        Image imageM3 = nVar.m3();
        ImageWriter imageWriter = this.f165081j;
        if (imageWriter != null && imageM3 != null) {
            try {
                K.a.d(imageWriter, imageM3);
                return true;
            } catch (IllegalStateException e10) {
                C.P.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }
}
