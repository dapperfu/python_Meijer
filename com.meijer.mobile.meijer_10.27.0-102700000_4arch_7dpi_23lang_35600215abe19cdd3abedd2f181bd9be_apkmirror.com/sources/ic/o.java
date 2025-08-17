package ic;

import cb.C6380a;
import cb.C6381b;
import com.medallia.digital.mobilesdk.l8;

/* loaded from: classes4.dex */
public class o extends Ya.c {

    /* renamed from: o, reason: collision with root package name */
    private static final C6380a f137733o = C6381b.a(o.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private Bb.b f137734m;

    /* renamed from: n, reason: collision with root package name */
    private m f137735n;

    public o(Za.c cVar, Za.e eVar, m mVar, Bb.b bVar) {
        super(cVar, eVar, "SightingsUploadJob");
        this.f137735n = mVar;
        this.f137734m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.c
    public final long p() {
        return Math.max(this.f137735n.a(), s()) + this.f137734m.o();
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Yb.a aVar = new Yb.a();
        this.f137735n.a(aVar);
        aVar.b();
    }

    public final void a() {
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.c
    public final long o() {
        return l8.b.f92525b;
    }
}
