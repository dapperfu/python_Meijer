package gt;

import Bb.e;
import Bb.k;
import Ya.d;
import cb.C6380a;
import cb.C6381b;
import rb.C16744c;

/* renamed from: gt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14311b implements k {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f134090e = C6381b.a(C16744c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private C14310a f134091a;

    /* renamed from: b, reason: collision with root package name */
    public e f134092b;

    /* renamed from: c, reason: collision with root package name */
    private d f134093c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f134094d;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) && this.f134092b.v()) {
            b();
        }
    }

    public final void b() {
        if (this.f134094d) {
            return;
        }
        this.f134094d = true;
        this.f134093c.c(this.f134091a.f134089f);
    }

    public C14311b(C14310a c14310a, d dVar, e eVar) {
        this.f134091a = c14310a;
        this.f134093c = dVar;
        this.f134092b = eVar;
        eVar.h(this, "Registration_Properties");
    }
}
