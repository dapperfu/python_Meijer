package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.bG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7686bG extends WE implements InterfaceC9952wb {

    /* renamed from: b, reason: collision with root package name */
    private final Map f73616b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f73617c;

    /* renamed from: d, reason: collision with root package name */
    private final Z50 f73618d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final synchronized void C0(final C9845vb c9845vb) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.aG
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9952wb) obj).C0(c9845vb);
            }
        });
    }

    public final synchronized void R0(View view) {
        try {
            ViewOnAttachStateChangeListenerC10059xb viewOnAttachStateChangeListenerC10059xb = (ViewOnAttachStateChangeListenerC10059xb) this.f73616b.get(view);
            if (viewOnAttachStateChangeListenerC10059xb == null) {
                ViewOnAttachStateChangeListenerC10059xb viewOnAttachStateChangeListenerC10059xb2 = new ViewOnAttachStateChangeListenerC10059xb(this.f73617c, view);
                viewOnAttachStateChangeListenerC10059xb2.c(this);
                this.f73616b.put(view, viewOnAttachStateChangeListenerC10059xb2);
                viewOnAttachStateChangeListenerC10059xb = viewOnAttachStateChangeListenerC10059xb2;
            }
            if (this.f73618d.f72858X) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77413x1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC10059xb.g(((Long) Oc.A.c().a(C8784lf.f77399w1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC10059xb.f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void S0(View view) {
        if (this.f73616b.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC10059xb) this.f73616b.get(view)).e(this);
            this.f73616b.remove(view);
        }
    }

    public C7686bG(Context context, Set set, Z50 z50) {
        super(set);
        this.f73616b = new WeakHashMap(1);
        this.f73617c = context;
        this.f73618d = z50;
    }
}
