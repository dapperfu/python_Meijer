package kc;

import cb.C6380a;
import cb.C6381b;
import ic.C14713a;

/* loaded from: classes4.dex */
public class f implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f141842b = C6381b.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private cc.e f141843a;

    @Override // kc.d
    public final boolean a(C14713a c14713a, String str) {
        if (!this.f141843a.a(c14713a).booleanValue()) {
            return false;
        }
        c14713a.g();
        this.f141843a.b(c14713a);
        return true;
    }

    public f(cc.e eVar) {
        this.f141843a = eVar;
    }
}
