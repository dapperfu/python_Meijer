package com.google.android.gms.ads.internal.client;

import Mc.AbstractBinderC4149r0;
import Mc.C4156t1;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* loaded from: classes4.dex */
public class LiteSdkInfo extends AbstractBinderC4149r0 {
    @Override // Mc.InterfaceC4152s0
    public InterfaceC6631Cl getAdapterCreator() {
        return new BinderC10061yl();
    }

    @Override // Mc.InterfaceC4152s0
    public C4156t1 getLiteSdkVersion() {
        return new C4156t1(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    public LiteSdkInfo(Context context) {
    }
}
