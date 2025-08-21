package mc;

import Xb.a;
import eb.C13784a;
import eb.C13785b;
import ec.C13788a;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import kc.C15116a;
import kc.l;
import lc.InterfaceC15480b;
import nc.C15931c;

/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15705b implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f150967f = C13785b.a(C15705b.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private C13788a f150968a;

    /* renamed from: b, reason: collision with root package name */
    private l f150969b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f150970c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC15480b f150971d = new lc.f();

    /* renamed from: e, reason: collision with root package name */
    private ec.d f150972e;

    public C15705b(l lVar, C13788a c13788a, Map<String, String> map, ec.d dVar) {
        this.f150968a = c13788a;
        this.f150969b = lVar;
        this.f150970c = map;
        this.f150972e = dVar;
    }

    @Override // mc.d
    public final boolean a(C15116a c15116a, String str) throws NoSuchAlgorithmException {
        String strB = Ub.c.b(c15116a.g());
        C13788a c13788a = this.f150968a;
        ec.b bVarA = ec.b.a();
        C15931c c15931cB = c13788a.f130064a.b(bVarA.f130066a.b(ec.b.b(strB), String.class), C15931c.class);
        if (c15931cB != null) {
            this.f150970c.put(c15931cB.c(), c15116a.g());
            byte[] bArrB = this.f150972e.b(strB);
            if (c15116a.b() != null && bArrB != null) {
                this.f150971d.a(c15116a, bArrB);
            }
            c15931cB.t(Integer.valueOf(c15116a.k()));
            c15931cB.i(Integer.valueOf(c15116a.a()));
            c15931cB.j(a.EnumC0897a.GIMBAL);
            this.f150969b.b(c15116a, c15931cB);
            return true;
        }
        return false;
    }
}
