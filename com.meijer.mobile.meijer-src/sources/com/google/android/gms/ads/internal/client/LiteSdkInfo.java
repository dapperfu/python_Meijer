package com.google.android.gms.ads.internal.client;

import Oc.AbstractBinderC4427r0;
import Oc.C4434t1;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC10186yl;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* loaded from: classes4.dex */
public class LiteSdkInfo extends AbstractBinderC4427r0 {
    @Override // Oc.InterfaceC4430s0
    public InterfaceC6756Cl getAdapterCreator() {
        return new BinderC10186yl();
    }

    @Override // Oc.InterfaceC4430s0
    public C4434t1 getLiteSdkVersion() {
        return new C4434t1(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    public LiteSdkInfo(Context context) {
    }
}
