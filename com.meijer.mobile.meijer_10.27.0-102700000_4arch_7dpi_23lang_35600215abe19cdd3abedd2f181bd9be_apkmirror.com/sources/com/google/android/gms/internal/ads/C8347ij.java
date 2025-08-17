package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8347ij implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8241hj f74999a;

    public C8347ij(InterfaceC8241hj interfaceC8241hj) {
        this.f74999a = interfaceC8241hj;
    }

    public static void b(InterfaceC9008ot interfaceC9008ot, InterfaceC8241hj interfaceC8241hj) {
        interfaceC9008ot.h0("/reward", new C8347ij(interfaceC8241hj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f74999a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f74999a.zzb();
                    return;
                }
                return;
            }
        }
        C7277Vo c7277Vo = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c7277Vo = new C7277Vo(str2, i10);
            }
        } catch (NumberFormatException e10) {
            Qc.p.h("Unable to parse reward amount.", e10);
        }
        this.f74999a.z0(c7277Vo);
    }
}
