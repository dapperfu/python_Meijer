package pd;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import id.C14720c;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* loaded from: classes4.dex */
public final class w extends AbstractC6651h {
    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final boolean usesClientTelemetry() {
        return true;
    }

    protected w(Context context, Looper looper, C6648e c6648e, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        super(context, looper, 308, c6648e, interfaceC14981d, interfaceC14990m);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return yd.k.f171362b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }
}
