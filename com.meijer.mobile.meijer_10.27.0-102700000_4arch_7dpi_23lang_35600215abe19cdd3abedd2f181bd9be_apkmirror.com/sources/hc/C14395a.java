package hc;

import gc.f;
import gc.g;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14395a implements InterfaceC14396b {
    @Override // hc.InterfaceC14396b
    public f parse(String str) {
        g gVar;
        try {
            gVar = (g) Sb.b.a(str, g.class);
        } catch (com.gimbal.proximity.core.b.b e10) {
            if (!e10.f64395a.equals(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSON_PARSE_ERROR)) {
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
