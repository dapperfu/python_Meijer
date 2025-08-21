package v;

import C.InterfaceC3029n;
import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes.dex */
public class H0 implements InterfaceC3029n {

    /* renamed from: a, reason: collision with root package name */
    private final String f164715a;

    /* renamed from: b, reason: collision with root package name */
    private final w.B f164716b;

    /* renamed from: c, reason: collision with root package name */
    private final B.h f164717c;

    @Override // C.InterfaceC3029n
    public int a() {
        return h(0);
    }

    public String b() {
        return this.f164715a;
    }

    @Override // C.InterfaceC3029n
    public int getLensFacing() {
        Integer num = (Integer) this.f164716b.a(CameraCharacteristics.LENS_FACING);
        o2.i.b(num != null, "Unable to get the lens facing of the camera.");
        return C17562v1.a(num.intValue());
    }

    public B.h j() {
        return this.f164717c;
    }

    int k() {
        Integer num = (Integer) this.f164716b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        o2.i.g(num);
        return num.intValue();
    }

    @Override // C.InterfaceC3029n
    public int h(int i10) {
        int iK = k();
        int iB = G.c.b(i10);
        boolean z10 = true;
        if (1 != getLensFacing()) {
            z10 = false;
        }
        return G.c.a(iB, iK, z10);
    }
}
