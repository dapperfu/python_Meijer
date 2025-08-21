package qf;

import android.content.Context;

/* loaded from: classes8.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private String f158318a;

    synchronized String a(Context context) {
        try {
            if (this.f158318a == null) {
                this.f158318a = b(context);
            }
        } finally {
        }
        return "".equals(this.f158318a) ? null : this.f158318a;
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
