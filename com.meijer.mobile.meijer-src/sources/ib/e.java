package ib;

import Kc.a;
import android.content.Context;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import xb.C18150d;

/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static final C13786c f137486c = C13787d.a(e.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f137487d = C13785b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f137488a;

    /* renamed from: b, reason: collision with root package name */
    private Db.e f137489b;

    @Override // ib.d
    public final a.C0277a a() {
        a.C0277a c0277aA = null;
        try {
            c0277aA = Kc.a.a(this.f137488a);
            if (!f137487d.b()) {
                return c0277aA;
            }
            C18150d.e(c0277aA, 4);
            return c0277aA;
        } catch (Exception e10) {
            f137486c.g("Unable to access Advertising Id: {} - {}", e10.getClass().getSimpleName(), e10.getMessage());
            return c0277aA;
        }
    }

    @Override // ib.d
    public final Gb.a b() {
        return this.f137489b.F();
    }

    public e(Context context, Db.e eVar) {
        this.f137488a = context;
        this.f137489b = eVar;
    }
}
