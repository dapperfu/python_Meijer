package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6978Mt implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcfw f68748a;

    C6978Mt(zzcfw zzcfwVar) {
        this.f68748a = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                synchronized (this.f68748a) {
                    try {
                        zzcfw zzcfwVar = this.f68748a;
                        if (zzcfwVar.f80653H != i10) {
                            zzcfwVar.f80653H = i10;
                            this.f68748a.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                Qc.p.h("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
