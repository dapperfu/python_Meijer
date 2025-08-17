package wf;

import of.E;
import org.json.JSONObject;
import wf.C17818d;

/* renamed from: wf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C17816b implements i {
    static C17818d b(E e10) {
        return new C17818d(e10.a() + 3600000, new C17818d.b(8, 4), new C17818d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    C17816b() {
    }

    @Override // wf.i
    public C17818d a(E e10, JSONObject jSONObject) {
        return b(e10);
    }
}
