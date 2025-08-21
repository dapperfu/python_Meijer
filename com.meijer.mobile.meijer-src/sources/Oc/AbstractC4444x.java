package Oc;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C8360hg;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9855vg;

/* renamed from: Oc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4444x {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4410l0 f23547a;

    static {
        InterfaceC4410l0 c4404j0 = null;
        try {
            Object objNewInstance = C4441w.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c4404j0 = iInterfaceQueryLocalInterface instanceof InterfaceC4410l0 ? (InterfaceC4410l0) iInterfaceQueryLocalInterface : new C4404j0(iBinder);
                }
            } else {
                Sc.p.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            Sc.p.g("Failed to instantiate ClientApi class.");
        }
        f23547a = c4404j0;
    }

    protected abstract Object a();

    protected abstract Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException;

    protected abstract Object c() throws RemoteException;

    public final Object d(Context context, boolean z10) {
        boolean z11;
        Object objE;
        if (!z10) {
            C4447y.b();
            if (!Sc.g.u(context, 12451000)) {
                Sc.p.b("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        C8784lf.a(context);
        if (((Boolean) C8360hg.f75603a.e()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) C8360hg.f75604b.e()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            objE = e();
            if (objE == null && !z11) {
                objE = f();
            }
        } else {
            Object objF = f();
            if (objF == null) {
                if (C4447y.e().nextInt(((Long) C9855vg.f79943a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C4447y.b().p(context, C4447y.c().f34479a, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }

    private final Object e() {
        InterfaceC4410l0 interfaceC4410l0 = f23547a;
        if (interfaceC4410l0 == null) {
            Sc.p.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(interfaceC4410l0);
        } catch (RemoteException e10) {
            Sc.p.h("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    AbstractC4444x() {
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e10) {
            Sc.p.h("Cannot invoke remote loader.", e10);
            return null;
        }
    }
}
