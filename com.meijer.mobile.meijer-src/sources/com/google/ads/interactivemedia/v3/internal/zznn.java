package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import id.C14720c;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* loaded from: classes4.dex */
public final class zznn extends AbstractC6651h {
    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }

    public zznn(Context context, Looper looper, C6648e c6648e, e.a aVar, e.b bVar) {
        super(context, looper, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, c6648e, (InterfaceC14981d) aVar, (InterfaceC14990m) bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return zzpo.zzc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return zzmz.zzb(iBinder);
    }
}
