package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.i;
import java.util.Iterator;
import java.util.List;
import u.C17169a;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18318A {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171369a;

    public androidx.camera.core.impl.i a(androidx.camera.core.impl.i iVar) {
        i.a aVar = new i.a();
        aVar.u(iVar.k());
        Iterator<DeferrableSurface> it = iVar.i().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(iVar.g());
        C17169a.C2558a c2558a = new C17169a.C2558a();
        c2558a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c2558a.c());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z10) {
        if (!this.f171369a || !z10) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public C18318A() {
        boolean z10;
        if (androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f171369a = z10;
    }
}
