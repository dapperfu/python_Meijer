package L8;

import i8.q;
import i8.w;

/* loaded from: classes4.dex */
public class f extends q {

    /* renamed from: A, reason: collision with root package name */
    private B8.c f18062A;

    /* renamed from: B, reason: collision with root package name */
    private C8.a<I8.a> f18063B;

    public f(String str, e eVar) {
        super(str, w.f137386c, eVar.b(), eVar.e(), eVar.d(), false, eVar.g());
    }

    public void O(C8.a<I8.a> aVar, B8.c cVar) {
        this.f18062A = cVar;
        this.f18063B = aVar;
    }

    @Override // i8.q, i8.p
    public StringBuilder b() {
        return new StringBuilder();
    }

    @Override // i8.q
    protected void K(boolean z10) {
        if (s()) {
            return;
        }
        super.K(false);
        this.f18062A.c(this.f18063B);
    }
}
