package xd;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dd.C13660h;
import id.C14720c;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* renamed from: xd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18160d extends AbstractC6651h<C18163g> {
    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final boolean usesClientTelemetry() {
        return true;
    }

    protected C18160d(Context context, Looper looper, C6648e c6648e, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        super(context, looper, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, c6648e, interfaceC14981d, interfaceC14990m);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof C18163g ? (C18163g) iInterfaceQueryLocalInterface : new C18163g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return C13660h.f128349b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 212800000;
    }
}
