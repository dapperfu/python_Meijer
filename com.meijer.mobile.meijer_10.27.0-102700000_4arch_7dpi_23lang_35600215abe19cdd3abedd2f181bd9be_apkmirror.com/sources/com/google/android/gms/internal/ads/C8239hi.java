package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8239hi implements InterfaceC7069Pi {
    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                Qc.p.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                Qc.p.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jC = Lc.v.c().c() + (Long.parseLong(str4) - Lc.v.c().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC9008ot.zzm().c(str2, str3, jC);
                return;
            } catch (NumberFormatException e10) {
                Qc.p.h("Malformed timestamp for CSI tick.", e10);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                Qc.p.g("No value given for CSI experiment.");
                return;
            } else {
                interfaceC9008ot.zzm().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                Qc.p.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                Qc.p.g("No name given for CSI extra.");
            } else {
                interfaceC9008ot.zzm().a().d(str6, str7);
            }
        }
    }
}
