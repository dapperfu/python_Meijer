package Z1;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.g;

/* loaded from: classes.dex */
public final class e {
    public static int a(Context context, String str) {
        String packageName;
        if (Binder.getCallingPid() == Process.myPid()) {
            packageName = context.getPackageName();
        } else {
            packageName = null;
        }
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), packageName);
    }

    public static int b(Context context, String str, int i10, int i11, String str2) {
        int iB;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strC = g.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i11 && o2.c.a(packageName, str2)) {
            iB = g.a(context, i11, strC, str2);
        } else {
            iB = g.b(context, strC, str2);
        }
        if (iB == 0) {
            return 0;
        }
        return -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
