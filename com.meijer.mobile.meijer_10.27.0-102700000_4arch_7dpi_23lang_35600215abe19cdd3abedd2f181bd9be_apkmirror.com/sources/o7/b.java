package o7;

import V6.e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.fullstory.FS;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, e> f153197a = new ConcurrentHashMap();

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    public static e c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, e> concurrentMap = f153197a;
        e eVar = concurrentMap.get(packageName);
        if (eVar == null) {
            e eVarD = d(context);
            e eVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, eVarD);
            if (eVarPutIfAbsent == null) {
                return eVarD;
            }
            return eVarPutIfAbsent;
        }
        return eVar;
    }

    private static e d(Context context) {
        return new d(b(a(context)));
    }
}
