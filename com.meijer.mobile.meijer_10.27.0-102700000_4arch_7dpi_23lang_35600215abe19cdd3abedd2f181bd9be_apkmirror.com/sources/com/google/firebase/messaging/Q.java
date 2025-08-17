package com.google.firebase.messaging;

import Td.InterfaceC5229g;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
final class Q {
    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static void e(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    static void f(final Context context, D d10, final boolean z10) {
        if (com.google.android.gms.common.util.n.i() && !d(b(context), z10)) {
            d10.j(z10).h(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5229g() { // from class: com.google.firebase.messaging.P
                @Override // Td.InterfaceC5229g
                public final void onSuccess(Object obj) {
                    Q.g(context, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
