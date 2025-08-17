package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.bG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7561bG extends WE implements InterfaceC9827wb {

    /* renamed from: b, reason: collision with root package name */
    private final Map f72776b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f72777c;

    /* renamed from: d, reason: collision with root package name */
    private final Z50 f72778d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final synchronized void D0(final C9720vb c9720vb) {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.aG
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9827wb) obj).D0(c9720vb);
            }
        });
    }

    public final synchronized void R0(View view) {
        try {
            ViewOnAttachStateChangeListenerC9934xb viewOnAttachStateChangeListenerC9934xb = (ViewOnAttachStateChangeListenerC9934xb) this.f72776b.get(view);
            if (viewOnAttachStateChangeListenerC9934xb == null) {
                ViewOnAttachStateChangeListenerC9934xb viewOnAttachStateChangeListenerC9934xb2 = new ViewOnAttachStateChangeListenerC9934xb(this.f72777c, view);
                viewOnAttachStateChangeListenerC9934xb2.c(this);
                this.f72776b.put(view, viewOnAttachStateChangeListenerC9934xb2);
                viewOnAttachStateChangeListenerC9934xb = viewOnAttachStateChangeListenerC9934xb2;
            }
            if (this.f72778d.f72018X) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76573x1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC9934xb.g(((Long) Mc.A.c().a(C8659lf.f76559w1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC9934xb.f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void S0(View view) {
        if (this.f72776b.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC9934xb) this.f72776b.get(view)).e(this);
            this.f72776b.remove(view);
        }
    }

    public C7561bG(Context context, Set set, Z50 z50) {
        super(set);
        this.f72776b = new WeakHashMap(1);
        this.f72777c = context;
        this.f72778d = z50;
    }
}
