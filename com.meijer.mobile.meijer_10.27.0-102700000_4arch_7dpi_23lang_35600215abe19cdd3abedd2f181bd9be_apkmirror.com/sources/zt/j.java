package zt;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes12.dex */
public class j implements InterfaceC17325k {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f173286d = C6381b.a(j.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final C6382c f173287e = C6383d.a(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Lb.c f173288a;

    /* renamed from: b, reason: collision with root package name */
    private Lb.g f173289b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceRunnableC17328n f173290c;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (this.f173288a.b()) {
            return true;
        }
        if (this.f173289b.f17945b) {
            C6382c c6382c = f173287e;
            c6382c.g("android.permission.ACCESS_FINE_LOCATION permission not granted. Request for user to grant this permission from an Activity.", new Object[0]);
            c6382c.g("Go here for more information. {}", "http://developer.android.com/training/permissions/requesting.html");
        }
        return false;
    }

    public j(Lb.c cVar, Lb.g gVar) {
        this.f173288a = cVar;
        this.f173289b = gVar;
    }
}
