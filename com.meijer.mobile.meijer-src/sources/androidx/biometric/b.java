package androidx.biometric;

import android.os.Build;
import androidx.biometric.e;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes.dex */
class b {
    static boolean b(int i10) {
        return (i10 & 32768) != 0;
    }

    static boolean c(int i10) {
        return (i10 & 32767) != 0;
    }

    static boolean e(int i10) {
        return (i10 & l3.f93323c) == 255;
    }

    static boolean d(int i10) {
        if (i10 != 15 && i10 != 255) {
            if (i10 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i10 != 32783) {
                return i10 == 33023 || i10 == 0;
            }
            int i11 = Build.VERSION.SDK_INT;
            return i11 < 28 || i11 > 29;
        }
        return true;
    }

    static int a(e.d dVar, e.c cVar) {
        int i10;
        if (dVar.a() != 0) {
            return dVar.a();
        }
        if (cVar != null) {
            i10 = 15;
        } else {
            i10 = l3.f93323c;
        }
        if (dVar.g()) {
            return 32768 | i10;
        }
        return i10;
    }
}
