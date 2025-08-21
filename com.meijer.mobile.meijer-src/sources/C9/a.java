package C9;

import I9.b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public class a {
    public int a(Context context, String str) throws PackageManager.NameNotFoundException {
        b.c(context, "Context must not be null!");
        b.c(str, "Key must not be null!");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData.containsKey(str)) {
                return applicationInfo.metaData.getInt(str);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public int b(Context context, String str, int i10) throws PackageManager.NameNotFoundException {
        b.c(context, "Context must not be null!");
        b.c(str, "Key must not be null!");
        int iA = a(context, str);
        return iA == 0 ? i10 : iA;
    }
}
