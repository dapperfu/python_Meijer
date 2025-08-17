package kc;

import Vb.a;
import cb.C6380a;
import cb.C6381b;
import ic.C14713a;
import ic.l;
import lc.C15397c;

/* renamed from: kc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15135c implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f141827b = C6381b.a(C15135c.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private l f141828a;

    @Override // kc.d
    public final boolean a(C14713a c14713a, String str) {
        if (!Sb.c.a(Vb.e.f37076c).equalsIgnoreCase(c14713a.j())) {
            return false;
        }
        c14713a.j();
        C15397c c15397c = new C15397c();
        c15397c.i(Integer.valueOf(c14713a.a()));
        c15397c.k(c14713a.g());
        c15397c.t(Integer.valueOf(c14713a.k()));
        c15397c.j(a.EnumC0807a.GIMBAL);
        this.f141828a.b(c14713a, c15397c);
        return true;
    }

    public C15135c(l lVar) {
        this.f141828a = lVar;
    }
}
