package gb;

import Ic.a;
import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import vb.C17538d;

/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static final C6382c f133270c = C6383d.a(e.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f133271d = C6381b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f133272a;

    /* renamed from: b, reason: collision with root package name */
    private Bb.e f133273b;

    @Override // gb.d
    public final a.C0217a a() {
        a.C0217a c0217aA = null;
        try {
            c0217aA = Ic.a.a(this.f133272a);
            if (!f133271d.b()) {
                return c0217aA;
            }
            C17538d.e(c0217aA, 4);
            return c0217aA;
        } catch (Exception e10) {
            f133270c.g("Unable to access Advertising Id: {} - {}", e10.getClass().getSimpleName(), e10.getMessage());
            return c0217aA;
        }
    }

    @Override // gb.d
    public final Eb.a b() {
        return this.f133273b.F();
    }

    public e(Context context, Bb.e eVar) {
        this.f133272a = context;
        this.f133273b = eVar;
    }
}
