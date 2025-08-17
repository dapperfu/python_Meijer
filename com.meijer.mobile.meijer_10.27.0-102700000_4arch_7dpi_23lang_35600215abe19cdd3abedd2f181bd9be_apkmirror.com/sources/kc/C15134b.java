package kc;

import Vb.a;
import cb.C6380a;
import cb.C6381b;
import cc.C6384a;
import ic.C14713a;
import ic.l;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import jc.InterfaceC14881b;
import lc.C15397c;

/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15134b implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f141821f = C6381b.a(C15134b.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private C6384a f141822a;

    /* renamed from: b, reason: collision with root package name */
    private l f141823b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f141824c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC14881b f141825d = new jc.f();

    /* renamed from: e, reason: collision with root package name */
    private cc.d f141826e;

    public C15134b(l lVar, C6384a c6384a, Map<String, String> map, cc.d dVar) {
        this.f141822a = c6384a;
        this.f141823b = lVar;
        this.f141824c = map;
        this.f141826e = dVar;
    }

    @Override // kc.d
    public final boolean a(C14713a c14713a, String str) throws NoSuchAlgorithmException {
        String strB = Sb.c.b(c14713a.g());
        C6384a c6384a = this.f141822a;
        cc.b bVarA = cc.b.a();
        C15397c c15397cB = c6384a.f61682a.b(bVarA.f61684a.b(cc.b.b(strB), String.class), C15397c.class);
        if (c15397cB != null) {
            this.f141824c.put(c15397cB.c(), c14713a.g());
            byte[] bArrB = this.f141826e.b(strB);
            if (c14713a.b() != null && bArrB != null) {
                this.f141825d.a(c14713a, bArrB);
            }
            c15397cB.t(Integer.valueOf(c14713a.k()));
            c15397cB.i(Integer.valueOf(c14713a.a()));
            c15397cB.j(a.EnumC0807a.GIMBAL);
            this.f141823b.b(c14713a, c15397cB);
            return true;
        }
        return false;
    }
}
