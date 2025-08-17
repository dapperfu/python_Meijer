package v;

import F.AbstractC3611h;
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
    private final w.B f164038a;

    /* renamed from: b, reason: collision with root package name */
    final N.d f164039b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f164040c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f164041d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f164042e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f164043f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.q f164044g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC3611h f164045h;

    /* renamed from: i, reason: collision with root package name */
    private DeferrableSurface f164046i;

    /* renamed from: j, reason: collision with root package name */
    ImageWriter f164047j;

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
                g2.this.f164047j = K.a.c(inputSurface, 1);
            }
        }
    }

    private void j() {
        N.d dVar = this.f164039b;
        while (!dVar.c()) {
            dVar.a().close();
        }
        DeferrableSurface deferrableSurface = this.f164046i;
        if (deferrableSurface != null) {
            androidx.camera.core.q qVar = this.f164044g;
            if (qVar != null) {
                deferrableSurface.k().addListener(new f2(qVar), H.a.d());
                this.f164044g = null;
            }
            deferrableSurface.d();
            this.f164046i = null;
        }
        ImageWriter imageWriter = this.f164047j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f164047j = null;
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
        if (this.f164040c) {
            bVar.w(1);
            return;
        }
        if (this.f164043f) {
            bVar.w(1);
            return;
        }
        Map<Integer, Size> mapK = k(this.f164038a);
        if (!this.f164042e || mapK.isEmpty() || !mapK.containsKey(34) || !l(this.f164038a, 34)) {
            bVar.w(1);
            return;
        }
        Size size = mapK.get(34);
        androidx.camera.core.p pVar = new androidx.camera.core.p(size.getWidth(), size.getHeight(), 34, 9);
        this.f164045h = pVar.m();
        this.f164044g = new androidx.camera.core.q(pVar);
        pVar.f(new S.a() { // from class: v.e2
            @Override // F.S.a
            public final void a(F.S s10) {
                g2.h(this.f164024a, s10);
            }
        }, H.a.c());
        F.T t10 = new F.T(this.f164044g.getSurface(), new Size(this.f164044g.getWidth(), this.f164044g.getHeight()), 34);
        this.f164046i = t10;
        androidx.camera.core.q qVar = this.f164044g;
        com.google.common.util.concurrent.q<Void> qVarK = t10.k();
        Objects.requireNonNull(qVar);
        qVarK.addListener(new f2(qVar), H.a.d());
        bVar.l(this.f164046i);
        bVar.e(this.f164045h);
        bVar.k(new a());
        bVar.t(new InputConfiguration(this.f164044g.getWidth(), this.f164044g.getHeight(), this.f164044g.c()));
    }

    @Override // v.c2
    public boolean b() {
        return this.f164040c;
    }

    @Override // v.c2
    public void c(boolean z10) {
        this.f164041d = z10;
    }

    @Override // v.c2
    public void d(boolean z10) {
        this.f164040c = z10;
    }

    @Override // v.c2
    public androidx.camera.core.n e() {
        try {
            return this.f164039b.a();
        } catch (NoSuchElementException unused) {
            C.P.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // v.c2
    public boolean g() {
        return this.f164041d;
    }

    g2(w.B b10) {
        this.f164042e = false;
        this.f164043f = false;
        this.f164038a = b10;
        this.f164042e = h2.a(b10, 4);
        this.f164043f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f164039b = new N.d(3, new N.b() { // from class: v.d2
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
                g2Var.f164039b.d(nVarB);
            }
        } catch (IllegalStateException e10) {
            C.P.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // v.c2
    public boolean f(androidx.camera.core.n nVar) {
        Image imageM3 = nVar.m3();
        ImageWriter imageWriter = this.f164047j;
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
