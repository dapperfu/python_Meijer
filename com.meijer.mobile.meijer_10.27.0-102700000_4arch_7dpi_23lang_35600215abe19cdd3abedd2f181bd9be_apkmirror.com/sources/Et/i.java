package Et;

import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import ut.C17315a;

/* loaded from: classes11.dex */
public class i implements Dt.f {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f9844e = C6381b.a(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Dt.e f9845a;

    /* renamed from: b, reason: collision with root package name */
    private final e f9846b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9847c;

    /* renamed from: d, reason: collision with root package name */
    long f9848d;

    @Override // Dt.f
    public final synchronized void a() {
        if (!this.f9847c) {
            d();
            this.f9847c = true;
        }
    }

    @Override // Dt.f
    public final void b(Dt.e eVar) {
        this.f9845a = eVar;
    }

    @Override // Dt.f
    public final synchronized void c() {
        if (this.f9847c) {
            this.f9846b.a();
        }
    }

    private void d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("passive");
        this.f9846b.a(1L, this, arrayList);
    }

    @Override // Dt.f
    public final synchronized void b() {
        if (this.f9847c) {
            this.f9846b.a();
            this.f9847c = false;
        }
    }

    public i(e eVar) {
        this.f9846b = eVar;
    }

    @Override // Dt.f
    public final synchronized void a(long j10) {
        if (this.f9847c) {
            d();
            this.f9848d = j10;
        }
    }

    @Override // Et.d
    public final boolean a(C17315a c17315a) {
        Dt.e eVar;
        if (c17315a.f163455e >= this.f9848d && c17315a.f163454d <= 450.0f && (eVar = this.f9845a) != null) {
            eVar.a(c17315a);
        }
        return false;
    }
}
