package vd;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import bd.C6229h;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gd.C14244c;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;

/* renamed from: vd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17548d extends AbstractC6526h<C17551g> {
    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final boolean usesClientTelemetry() {
        return true;
    }

    protected C17548d(Context context, Looper looper, C6523e c6523e, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        super(context, looper, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, c6523e, interfaceC14403d, interfaceC14412m);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof C17551g ? (C17551g) iInterfaceQueryLocalInterface : new C17551g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return C6229h.f60114b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 212800000;
    }
}
