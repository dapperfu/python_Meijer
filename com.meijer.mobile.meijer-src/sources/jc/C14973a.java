package jc;

import ic.f;
import ic.g;

/* renamed from: jc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14973a implements InterfaceC14974b {
    @Override // jc.InterfaceC14974b
    public f parse(String str) {
        g gVar;
        try {
            gVar = (g) Ub.b.a(str, g.class);
        } catch (com.gimbal.proximity.core.b.b e10) {
            if (!e10.f65235a.equals(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSON_PARSE_ERROR)) {
                throw e10;
            }
            gVar = null;
        }
        if (gVar != null) {
            return gVar.a();
        }
        return null;
    }
}
