package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class V00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final C9695u60 f71594a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f71595b;

    /* renamed from: c, reason: collision with root package name */
    private final Rc.r0 f71596c;

    private final void a(Bundle bundle) {
        C7088Mg c7088Mg = this.f71594a.f79583i;
        if (c7088Mg == null || c7088Mg.f69530i == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", c7088Mg.f69531j);
        bundle.putInt("sccg_dir", this.f71594a.f79583i.f69530i);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.f71594a.f79581g;
        AB ab2 = (AB) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(ab2.f65929b);
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

    public V00(C9695u60 c9695u60, PackageInfo packageInfo, Rc.r0 r0Var) {
        this.f71594a = c9695u60;
        this.f71595b = packageInfo;
        this.f71596c = r0Var;
    }
}
