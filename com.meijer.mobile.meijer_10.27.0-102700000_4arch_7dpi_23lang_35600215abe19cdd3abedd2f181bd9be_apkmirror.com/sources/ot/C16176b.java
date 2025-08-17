package ot;

import Dt.a;
import android.app.Activity;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import tt.f;

/* renamed from: ot.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C16176b extends f<InterfaceC16175a> implements a.InterfaceC0122a {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f155247d = C6381b.a(C16176b.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final C6382c f155248e = C6383d.a(C16176b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f155249b;

    /* renamed from: c, reason: collision with root package name */
    private final Dt.a f155250c;

    @Override // Dt.a.InterfaceC0122a
    public final void a() {
        WeakReference<Activity> weakReference = this.f155249b;
        Activity activity = weakReference != null ? weakReference.get() : null;
        boolean z10 = this.f155250c.f7364e;
        Iterator<InterfaceC16175a> it = iterator();
        while (it.hasNext()) {
            try {
                it.next().b(activity);
            } catch (Exception e10) {
                f155248e.g("Activity listener failed", e10);
            }
        }
    }

    public C16176b(Dt.a aVar) {
        this.f155250c = aVar;
        aVar.f7365f.h(this);
    }
}
