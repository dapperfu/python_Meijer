package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6885Gg {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68105a;

    public C6885Gg(Context context) {
        this.f68105a = context;
    }

    public final void a(InterfaceC7500Yn interfaceC7500Yn) {
        try {
            ((C6919Hg) Sc.s.b(this.f68105a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new Sc.r() { // from class: com.google.android.gms.internal.ads.Fg
                @Override // Sc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof C6919Hg ? (C6919Hg) iInterfaceQueryLocalInterface : new C6919Hg(iBinder);
                }
            })).Z3(interfaceC7500Yn);
        } catch (RemoteException e10) {
            Sc.p.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (zzr e11) {
            Sc.p.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
