package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gd.C14244c;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;

/* loaded from: classes4.dex */
public final class zznn extends AbstractC6526h {
    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }

    public zznn(Context context, Looper looper, C6523e c6523e, e.a aVar, e.b bVar) {
        super(context, looper, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, c6523e, (InterfaceC14403d) aVar, (InterfaceC14412m) bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return zzpo.zzc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return zzmz.zzb(iBinder);
    }
}
