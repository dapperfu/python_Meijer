package nd;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import gd.C14244c;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;

/* loaded from: classes4.dex */
public final class w extends AbstractC6526h {
    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final boolean usesClientTelemetry() {
        return true;
    }

    protected w(Context context, Looper looper, C6523e c6523e, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        super(context, looper, 308, c6523e, interfaceC14403d, interfaceC14412m);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return wd.k.f166040b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }
}
