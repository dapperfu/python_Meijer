package Nb;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import eb.C13784a;
import eb.C13785b;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f20751c = C13785b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f20752a;

    /* renamed from: b, reason: collision with root package name */
    private s f20753b;

    private Boolean b() {
        try {
            return (Boolean) NotificationManager.class.getMethod("areNotificationsEnabled", null).invoke((NotificationManager) this.f20752a.getSystemService("notification"), null);
        } catch (Exception unused) {
            return null;
        }
    }

    private Boolean c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f20752a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f20752a.getApplicationInfo();
            String packageName = this.f20752a.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return Boolean.valueOf(((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Boolean a() {
        int i10 = this.f20753b.f20788a;
        return i10 >= 24 ? b() : i10 >= 19 ? c() : Boolean.TRUE;
    }

    public b(Context context, s sVar) {
        this.f20752a = context;
        this.f20753b = sVar;
    }
}
