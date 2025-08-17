package qd;

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

/* renamed from: qd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16518e {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f157193a;

    public int a(String str) {
        return this.f157193a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f157193a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f157193a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        Context context = this.f157193a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public o2.d<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f157193a.getPackageManager().getApplicationInfo(str, 0);
        return o2.d.a(this.f157193a.getPackageManager().getApplicationLabel(applicationInfo), this.f157193a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f157193a.getPackageManager().getPackageInfo(str, i10);
    }

    @TargetApi(19)
    public final boolean h(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f157193a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public C16518e(Context context) {
        this.f157193a = context;
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C16516c.a(this.f157193a);
        }
        if (n.g() && (nameForUid = this.f157193a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.f157193a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
