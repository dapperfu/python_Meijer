package zt;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.List;
import kt.C15319h;
import pt.InterfaceC16416b;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes12.dex */
public class m implements InterfaceC16416b, InterfaceC17325k {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f173296f = C6381b.a(m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final C6382c f173297g = C6383d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final C18572b f173298a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17328n f173299b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f173300c;

    /* renamed from: d, reason: collision with root package name */
    private final Bb.e f173301d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f173302e = false;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    @Override // pt.InterfaceC16416b
    public final void a(List<C15319h> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        if (this.f173300c && this.f173301d.e()) {
            f173297g.d("Place definitions were updated", new Object[0]);
        }
        this.f173302e = true;
        this.f173299b.c();
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (!this.f173302e) {
            return true;
        }
        if (this.f173300c && this.f173301d.e()) {
            f173297g.d("Place definitions were updated", new Object[0]);
        }
        this.f173302e = false;
        return this.f173298a.b(aVar, list);
    }

    public m(C18572b c18572b, Lb.g gVar, Bb.e eVar) {
        this.f173298a = c18572b;
        this.f173300c = gVar.f17945b;
        this.f173301d = eVar;
    }
}
