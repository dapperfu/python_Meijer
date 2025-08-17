package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class V00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final C9570u60 f70754a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f70755b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.r0 f70756c;

    private final void a(Bundle bundle) {
        C6963Mg c6963Mg = this.f70754a.f78743i;
        if (c6963Mg == null || c6963Mg.f68690i == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", c6963Mg.f68691j);
        bundle.putInt("sccg_dir", this.f70754a.f78743i.f68690i);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.f70754a.f78741g;
        AB ab2 = (AB) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(ab2.f65089b);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    @Override // com.google.android.gms.internal.ads.S10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V00.zzb(java.lang.Object):void");
    }

    public V00(C9570u60 c9570u60, PackageInfo packageInfo, Pc.r0 r0Var) {
        this.f70754a = c9570u60;
        this.f70755b = packageInfo;
        this.f70756c = r0Var;
    }
}
