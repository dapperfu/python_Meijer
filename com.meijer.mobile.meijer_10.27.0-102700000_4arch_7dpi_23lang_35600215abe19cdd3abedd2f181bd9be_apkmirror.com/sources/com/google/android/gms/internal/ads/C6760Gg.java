package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6760Gg {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67265a;

    public C6760Gg(Context context) {
        this.f67265a = context;
    }

    public final void a(InterfaceC7375Yn interfaceC7375Yn) {
        try {
            ((C6794Hg) Qc.s.b(this.f67265a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new Qc.r() { // from class: com.google.android.gms.internal.ads.Fg
                @Override // Qc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof C6794Hg ? (C6794Hg) iInterfaceQueryLocalInterface : new C6794Hg(iBinder);
                }
            })).N3(interfaceC7375Yn);
        } catch (RemoteException e10) {
            Qc.p.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (zzr e11) {
            Qc.p.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
