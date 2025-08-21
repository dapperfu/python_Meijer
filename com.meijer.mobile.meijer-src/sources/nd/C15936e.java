package nd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import com.google.android.gms.common.internal.C6667y;
import id.C14720c;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;
import yd.f;

/* renamed from: nd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15936e extends AbstractC6651h {

    /* renamed from: a, reason: collision with root package name */
    private final C6667y f152241a;

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    public C15936e(Context context, Looper looper, C6648e c6648e, C6667y c6667y, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        super(context, looper, 270, c6648e, interfaceC14981d, interfaceC14990m);
        this.f152241a = c6667y;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C15932a ? (C15932a) iInterfaceQueryLocalInterface : new C15932a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return f.f171358b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f152241a.d();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }
}
