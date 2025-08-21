package yf;

import org.json.JSONObject;
import qf.E;
import yf.C18311d;

/* renamed from: yf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C18309b implements i {
    static C18311d b(E e10) {
        return new C18311d(e10.a() + 3600000, new C18311d.b(8, 4), new C18311d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    C18309b() {
    }

    @Override // yf.i
    public C18311d a(E e10, JSONObject jSONObject) {
        return b(e10);
    }
}
