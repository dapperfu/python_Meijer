package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes4.dex */
public final class x {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (n.k()) {
            StrictMode.setVmPolicy(w.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
