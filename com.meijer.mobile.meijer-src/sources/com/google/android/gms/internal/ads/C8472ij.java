package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8472ij implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8366hj f75839a;

    public C8472ij(InterfaceC8366hj interfaceC8366hj) {
        this.f75839a = interfaceC8366hj;
    }

    public static void b(InterfaceC9133ot interfaceC9133ot, InterfaceC8366hj interfaceC8366hj) {
        interfaceC9133ot.h0("/reward", new C8472ij(interfaceC8366hj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f75839a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f75839a.zzb();
                    return;
                }
                return;
            }
        }
        C7402Vo c7402Vo = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c7402Vo = new C7402Vo(str2, i10);
            }
        } catch (NumberFormatException e10) {
            Sc.p.h("Unable to parse reward amount.", e10);
        }
        this.f75839a.y0(c7402Vo);
    }
}
