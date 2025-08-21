package zt;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes13.dex */
public class j implements InterfaceC17477k {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f173247d = C13785b.a(j.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final C13786c f173248e = C13787d.a(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Nb.c f173249a;

    /* renamed from: b, reason: collision with root package name */
    private Nb.g f173250b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceRunnableC17480n f173251c;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (this.f173249a.b()) {
            return true;
        }
        if (this.f173250b.f20765b) {
            C13786c c13786c = f173248e;
            c13786c.g("android.permission.ACCESS_FINE_LOCATION permission not granted. Request for user to grant this permission from an Activity.", new Object[0]);
            c13786c.g("Go here for more information. {}", "http://developer.android.com/training/permissions/requesting.html");
        }
        return false;
    }

    public j(Nb.c cVar, Nb.g gVar) {
        this.f173249a = cVar;
        this.f173250b = gVar;
    }
}
