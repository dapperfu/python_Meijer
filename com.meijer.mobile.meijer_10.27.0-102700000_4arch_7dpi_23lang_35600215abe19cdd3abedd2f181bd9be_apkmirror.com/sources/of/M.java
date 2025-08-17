package of;

import android.content.Context;

/* loaded from: classes7.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private String f153466a;

    synchronized String a(Context context) {
        try {
            if (this.f153466a == null) {
                this.f153466a = b(context);
            }
        } finally {
        }
        return "".equals(this.f153466a) ? null : this.f153466a;
    }

    M() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }
}
