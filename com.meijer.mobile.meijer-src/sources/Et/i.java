package Et;

import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import ut.C17467a;

/* loaded from: classes12.dex */
public class i implements Dt.f {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f8556e = C13785b.a(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Dt.e f8557a;

    /* renamed from: b, reason: collision with root package name */
    private final e f8558b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8559c;

    /* renamed from: d, reason: collision with root package name */
    long f8560d;

    @Override // Dt.f
    public final synchronized void a() {
        if (!this.f8559c) {
            d();
            this.f8559c = true;
        }
    }

    @Override // Dt.f
    public final void b(Dt.e eVar) {
        this.f8557a = eVar;
    }

    @Override // Dt.f
    public final synchronized void c() {
        if (this.f8559c) {
            this.f8558b.a();
        }
    }

    private void d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("passive");
        this.f8558b.a(1L, this, arrayList);
    }

    @Override // Dt.f
    public final synchronized void b() {
        if (this.f8559c) {
            this.f8558b.a();
            this.f8559c = false;
        }
    }

    public i(e eVar) {
        this.f8558b = eVar;
    }

    @Override // Dt.f
    public final synchronized void a(long j10) {
        if (this.f8559c) {
            d();
            this.f8560d = j10;
        }
    }

    @Override // Et.d
    public final boolean a(C17467a c17467a) {
        Dt.e eVar;
        if (c17467a.f164533e >= this.f8560d && c17467a.f164532d <= 450.0f && (eVar = this.f8557a) != null) {
            eVar.a(c17467a);
        }
        return false;
    }
}
