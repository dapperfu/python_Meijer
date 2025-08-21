package v;

import C.C3030o;
import C.InterfaceC3029n;
import F.InterfaceC3289y;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class P0 {
    private static String a(w.O o10, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) o10.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) o10.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    static List<String> b(C17563w c17563w, C3030o c3030o) throws InitializationException {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(c17563w.c().d());
            if (c3030o == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = a(c17563w.c(), c3030o.d(), listAsList);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strA)) {
                        arrayList2.add(c17563w.f(str));
                    }
                }
                Iterator<InterfaceC3029n> it2 = c3030o.b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((InterfaceC3289y) it2.next()).b());
                }
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e10) {
            throw new InitializationException(R0.a(e10));
        } catch (CameraUnavailableException e11) {
            throw new InitializationException(e11);
        }
    }
}
