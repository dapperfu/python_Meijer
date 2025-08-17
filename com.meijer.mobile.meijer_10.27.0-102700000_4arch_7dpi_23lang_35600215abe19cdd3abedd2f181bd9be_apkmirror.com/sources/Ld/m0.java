package Ld;

import Kd.C3948f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import gd.C14249h;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18062a = "m0";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f18063b;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f18064c;

    private static Context b(Exception exc, Context context) {
        FS.log_e(f18062a, "Failed to load maps module, use pre-Chimera", exc);
        return C14249h.c(context);
    }

    private static Context c(Context context, C3948f.a aVar) {
        Context contextB;
        Context context2 = f18063b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == C3948f.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextB = DynamiteModule.e(context, DynamiteModule.f64996b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextB = b(e10, context);
            } else {
                try {
                    FS.log_d(f18062a, "Attempting to load maps_dynamite again.");
                    contextB = DynamiteModule.e(context, DynamiteModule.f64996b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    contextB = b(e11, context);
                }
            }
        }
        f18063b = contextB;
        if (contextB != null) {
            return contextB;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static p0 d(Context context, C3948f.a aVar) {
        FS.log_i(f18062a, "Making Creator dynamically");
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

    public static p0 a(Context context, C3948f.a aVar) throws GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.internal.r.l(context);
        String str = f18062a;
        FS.log_d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        p0 p0Var = f18064c;
        if (p0Var == null) {
            int iG = C14249h.g(context, 13400000);
            if (iG == 0) {
                p0 p0VarD = d(context, aVar);
                f18064c = p0VarD;
                try {
                    int iZzd = p0VarD.zzd();
                    String packageName = context.getPackageName();
                    if (iZzd == 2 && !packageName.equals("com.google.android.apps.photos")) {
                        FS.log_d(str, "early loading native code");
                        try {
                            f18064c.y(com.google.android.gms.dynamic.d.F2(c(context, aVar)));
                        } catch (RemoteException e10) {
                            throw new RuntimeRemoteException(e10);
                        } catch (UnsatisfiedLinkError unused) {
                            FS.log_w(f18062a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            f18063b = null;
                            f18064c = d(context, C3948f.a.LEGACY);
                        }
                    } else {
                        FS.log_d(str, "not early loading native code");
                    }
                    try {
                        p0 p0Var2 = f18064c;
                        Context contextC = c(context, aVar);
                        Objects.requireNonNull(contextC);
                        p0Var2.V5(com.google.android.gms.dynamic.d.F2(contextC.getResources()), 19020000);
                        return f18064c;
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
