package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7103Mt implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcfw f69588a;

    C7103Mt(zzcfw zzcfwVar) {
        this.f69588a = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                synchronized (this.f69588a) {
                    try {
                        zzcfw zzcfwVar = this.f69588a;
                        if (zzcfwVar.f81493H != i10) {
                            zzcfwVar.f81493H = i10;
                            this.f69588a.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                Sc.p.h("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
