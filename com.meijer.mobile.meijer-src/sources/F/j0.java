package F;

import F.h0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import q.InterfaceC16578a;

/* loaded from: classes.dex */
public class j0 implements InterfaceC16578a<Context, h0> {

    public static class a extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }

        private a() {
        }
    }

    private static h0 b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        C.P.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        C.P.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        C.P.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        C.P.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new h0.b().d(z10).c(e(strArrC)).b(e(strArrC2)).a();
    }

    private static Class<? extends g0> d(String str) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(str);
            if (g0.class.isAssignableFrom(cls)) {
                return cls;
            }
            C.P.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            C.P.m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    private static Set<Class<? extends g0>> e(String[] strArr) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends g0> clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // q.InterfaceC16578a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public h0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            C.P.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C.P.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            C.P.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            C.P.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }
}
