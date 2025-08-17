package v;

import F.AbstractC3611h;
import F.C3612i;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class U0 {
    static CameraCaptureSession.CaptureCallback a(AbstractC3611h abstractC3611h) {
        if (abstractC3611h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC3611h, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : U.a(arrayList);
    }

    static void b(AbstractC3611h abstractC3611h, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC3611h instanceof C3612i.a) {
            Iterator<AbstractC3611h> it = ((C3612i.a) abstractC3611h).e().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (abstractC3611h instanceof T0) {
            list.add(((T0) abstractC3611h).f());
        } else {
            list.add(new S0(abstractC3611h));
        }
    }
}
