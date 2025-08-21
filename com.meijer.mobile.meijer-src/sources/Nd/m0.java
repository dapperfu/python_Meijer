package Nd;

import Md.C4113f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import id.C14725h;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20882a = "m0";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f20883b;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f20884c;

    private static Context b(Exception exc, Context context) {
        FS.log_e(f20882a, "Failed to load maps module, use pre-Chimera", exc);
        return C14725h.c(context);
    }

    private static Context c(Context context, C4113f.a aVar) {
        Context contextB;
        Context context2 = f20883b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == C4113f.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextB = DynamiteModule.e(context, DynamiteModule.f65836b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextB = b(e10, context);
            } else {
                try {
                    FS.log_d(f20882a, "Attempting to load maps_dynamite again.");
                    contextB = DynamiteModule.e(context, DynamiteModule.f65836b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    contextB = b(e11, context);
                }
            }
        }
        f20883b = contextB;
        if (contextB != null) {
            return contextB;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static p0 d(Context context, C4113f.a aVar) {
        FS.log_i(f20882a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) com.google.android.gms.common.internal.r.l(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new o0(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    public static p0 a(Context context, C4113f.a aVar) throws GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.internal.r.l(context);
        String str = f20882a;
        FS.log_d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        p0 p0Var = f20884c;
        if (p0Var == null) {
            int iG = C14725h.g(context, 13400000);
            if (iG == 0) {
                p0 p0VarD = d(context, aVar);
                f20884c = p0VarD;
                try {
                    int iZzd = p0VarD.zzd();
                    String packageName = context.getPackageName();
                    if (iZzd == 2 && !packageName.equals("com.google.android.apps.photos")) {
                        FS.log_d(str, "early loading native code");
                        try {
                            f20884c.y(com.google.android.gms.dynamic.d.I2(c(context, aVar)));
                        } catch (RemoteException e10) {
                            throw new RuntimeRemoteException(e10);
                        } catch (UnsatisfiedLinkError unused) {
                            FS.log_w(f20882a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            f20883b = null;
                            f20884c = d(context, C4113f.a.LEGACY);
                        }
                    } else {
                        FS.log_d(str, "not early loading native code");
                    }
                    try {
                        p0 p0Var2 = f20884c;
                        Context contextC = c(context, aVar);
                        Objects.requireNonNull(contextC);
                        p0Var2.i6(com.google.android.gms.dynamic.d.I2(contextC.getResources()), 19020000);
                        return f20884c;
                    } catch (RemoteException e11) {
                        throw new RuntimeRemoteException(e11);
                    }
                } catch (RemoteException e12) {
                    throw new RuntimeRemoteException(e12);
                }
            }
            throw new GooglePlayServicesNotAvailableException(iG);
        }
        return p0Var;
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
