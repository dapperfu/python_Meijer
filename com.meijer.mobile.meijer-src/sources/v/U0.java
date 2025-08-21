package v;

import F.AbstractC3273h;
import F.C3274i;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class U0 {
    static CameraCaptureSession.CaptureCallback a(AbstractC3273h abstractC3273h) {
        if (abstractC3273h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC3273h, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : U.a(arrayList);
    }

    static void b(AbstractC3273h abstractC3273h, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC3273h instanceof C3274i.a) {
            Iterator<AbstractC3273h> it = ((C3274i.a) abstractC3273h).e().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (abstractC3273h instanceof T0) {
            list.add(((T0) abstractC3273h).f());
        } else {
            list.add(new S0(abstractC3273h));
        }
    }
}
