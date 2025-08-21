package gt;

import Db.e;
import Db.k;
import ab.d;
import eb.C13784a;
import eb.C13785b;
import tb.C17218c;

/* renamed from: gt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14407b implements k {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f134463e = C13785b.a(C17218c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private C14406a f134464a;

    /* renamed from: b, reason: collision with root package name */
    public e f134465b;

    /* renamed from: c, reason: collision with root package name */
    private d f134466c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f134467d;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) && this.f134465b.v()) {
            b();
        }
    }

    public final void b() {
        if (this.f134467d) {
            return;
        }
        this.f134467d = true;
        this.f134466c.c(this.f134464a.f134462f);
    }

    public C14407b(C14406a c14406a, d dVar, e eVar) {
        this.f134464a = c14406a;
        this.f134466c = dVar;
        this.f134465b = eVar;
        eVar.h(this, "Registration_Properties");
    }
}
