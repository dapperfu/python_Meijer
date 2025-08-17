package v;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.Map;
import v.J1;

/* renamed from: v.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
interface InterfaceC17370d1 {
    void a(List<androidx.camera.core.impl.i> list);

    boolean b();

    void c();

    void close();

    com.google.common.util.concurrent.q<Void> d(boolean z10);

    List<androidx.camera.core.impl.i> e();

    androidx.camera.core.impl.w f();

    com.google.common.util.concurrent.q<Void> g(androidx.camera.core.impl.w wVar, CameraDevice cameraDevice, J1.a aVar);

    void h(androidx.camera.core.impl.w wVar);

    void i(Map<DeferrableSurface, Long> map);
}
