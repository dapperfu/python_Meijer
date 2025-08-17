package ld;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.C6542y;
import gd.C14244c;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;
import wd.f;

/* renamed from: ld.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15402e extends AbstractC6526h {

    /* renamed from: a, reason: collision with root package name */
    private final C6542y f148844a;

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    public C15402e(Context context, Looper looper, C6523e c6523e, C6542y c6542y, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        super(context, looper, 270, c6523e, interfaceC14403d, interfaceC14412m);
        this.f148844a = c6542y;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C15398a ? (C15398a) iInterfaceQueryLocalInterface : new C15398a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return f.f166036b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f148844a.d();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }
}
