package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC10186yl extends AbstractBinderC6722Bl {
    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final boolean L(String str) throws RemoteException {
        try {
            return Uc.a.class.isAssignableFrom(Class.forName(str, false, BinderC10186yl.class.getClassLoader()));
        } catch (Throwable unused) {
            Sc.p.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final boolean a(String str) throws RemoteException {
        try {
            return Vc.a.class.isAssignableFrom(Class.forName(str, false, BinderC10186yl.class.getClassLoader()));
        } catch (Throwable unused) {
            Sc.p.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final InterfaceC6858Fl d(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC10186yl.class.getClassLoader());
                if (Uc.f.class.isAssignableFrom(cls)) {
                    return new BinderC7838cm((Uc.f) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Uc.a.class.isAssignableFrom(cls)) {
                    return new BinderC7838cm((Uc.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                Sc.p.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th2) {
                Sc.p.h("Could not instantiate mediation adapter: " + str + ". ", th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            Sc.p.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC7838cm(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC7838cm(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final InterfaceC10295zm p(String str) throws RemoteException {
        return new BinderC7096Mm((RtbAdapter) Class.forName(str, false, C6791Dm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
