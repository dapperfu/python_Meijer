package tb;

import cb.C6380a;
import cb.C6381b;
import com.medallia.digital.mobilesdk.l8;
import java.util.List;
import tb.k.b;

/* loaded from: classes4.dex */
public class j extends Ya.c {

    /* renamed from: o, reason: collision with root package name */
    private static final C6380a f161559o = C6381b.a(j.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private Bb.b f161560m;

    /* renamed from: n, reason: collision with root package name */
    private k f161561n;

    public j(Za.c cVar, Za.e eVar, k kVar, Bb.b bVar) {
        super(cVar, eVar, "iBeaconSightingUploadJob");
        this.f161561n = kVar;
        this.f161560m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.c
    public final long p() {
        return Math.max(this.f161561n.f161567d.c(), s()) + this.f161560m.o();
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Yb.a aVar = new Yb.a();
        k kVar = this.f161561n;
        if (kVar.f161567d.a() > 0) {
            List<b> listD = kVar.f161567d.d();
            listD.size();
            kVar.f161570g.e(kVar.c(listD), kVar.new b(listD, aVar));
        }
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
