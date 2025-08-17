package k7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.fullstory.FS;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: k7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15114d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f141610a;

    private ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f141610a.getPackageManager().getApplicationInfo(this.f141610a.getPackageName(), 128);
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<InterfaceC15112b> b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            FS.log_d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    FS.log_v("ManifestParser", "Got app info metadata: " + applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            FS.log_d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    FS.log_d("ManifestParser", "Finished loading Glide modules");
                    return arrayList;
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                FS.log_d("ManifestParser", "Got null app info metadata");
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable("ManifestParser", 6)) {
                FS.log_e("ManifestParser", "Failed to parse glide modules", e10);
            }
        }
        return arrayList;
    }

    public C15114d(Context context) {
        this.f141610a = context;
    }

    private static InterfaceC15112b c(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                d(cls, e10);
            } catch (InstantiationException e11) {
                d(cls, e11);
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
            } catch (InvocationTargetException e13) {
                d(cls, e13);
            }
            if (objNewInstance instanceof InterfaceC15112b) {
                return (InterfaceC15112b) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }
}
