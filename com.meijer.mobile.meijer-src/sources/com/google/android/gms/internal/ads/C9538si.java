package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.si, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9538si implements InterfaceC7194Pi {
    C9538si() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        WindowManager windowManager = (WindowManager) interfaceC9133ot.getContext().getSystemService("window");
        Nc.v.t();
        DisplayMetrics displayMetricsZ = Rc.D0.Z(windowManager);
        int i10 = displayMetricsZ.widthPixels;
        int i11 = displayMetricsZ.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) interfaceC9133ot).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i10));
        map2.put("windowHeightInPixels", Integer.valueOf(i11));
        interfaceC9133ot.L("locationReady", map2);
        Sc.p.g("GET LOCATION COMPILED");
    }
}
