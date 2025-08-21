package sd;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.n;

/* renamed from: sd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17066e {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f160308a;

    public int a(String str) {
        return this.f160308a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f160308a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f160308a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        Context context = this.f160308a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public o2.d<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f160308a.getPackageManager().getApplicationInfo(str, 0);
        return o2.d.a(this.f160308a.getPackageManager().getApplicationLabel(applicationInfo), this.f160308a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f160308a.getPackageManager().getPackageInfo(str, i10);
    }

    @TargetApi(19)
    public final boolean h(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f160308a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public C17066e(Context context) {
        this.f160308a = context;
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C17064c.a(this.f160308a);
        }
        if (n.g() && (nameForUid = this.f160308a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.f160308a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
