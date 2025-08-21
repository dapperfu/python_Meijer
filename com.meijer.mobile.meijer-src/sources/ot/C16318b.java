package ot;

import Dt.a;
import android.app.Activity;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import tt.f;

/* renamed from: ot.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C16318b extends f<InterfaceC16317a> implements a.InterfaceC0136a {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f155820d = C13785b.a(C16318b.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final C13786c f155821e = C13787d.a(C16318b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f155822b;

    /* renamed from: c, reason: collision with root package name */
    private final Dt.a f155823c;

    @Override // Dt.a.InterfaceC0136a
    public final void a() {
        WeakReference<Activity> weakReference = this.f155822b;
        Activity activity = weakReference != null ? weakReference.get() : null;
        boolean z10 = this.f155823c.f6671e;
        Iterator<InterfaceC16317a> it = iterator();
        while (it.hasNext()) {
            try {
                it.next().b(activity);
            } catch (Exception e10) {
                f155821e.g("Activity listener failed", e10);
            }
        }
    }

    public C16318b(Dt.a aVar) {
        this.f155823c = aVar;
        aVar.f6672f.h(this);
    }
}
