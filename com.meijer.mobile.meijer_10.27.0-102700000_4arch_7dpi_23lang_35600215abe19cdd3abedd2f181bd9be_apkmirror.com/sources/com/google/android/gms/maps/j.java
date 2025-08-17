package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3951i;
import Ld.m0;
import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class j extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f84798e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84799f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f84800g;

    /* renamed from: h, reason: collision with root package name */
    private final List f84801h = new ArrayList();

    static /* synthetic */ void v(j jVar, Activity activity) {
        jVar.f84800g = activity;
        jVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84799f = eVar;
        x();
    }

    public final void x() {
        if (this.f84800g == null || this.f84799f == null || b() != null) {
            return;
        }
        try {
            C3948f.a(this.f84800g);
            this.f84799f.a(new i(this.f84798e, m0.a(this.f84800g, null).w0(com.google.android.gms.dynamic.d.F2(this.f84800g))));
            List list = this.f84801h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i) b()).c((InterfaceC3951i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    j(Fragment fragment) {
        this.f84798e = fragment;
    }

    public final void w(InterfaceC3951i interfaceC3951i) {
        if (b() != null) {
            ((i) b()).c(interfaceC3951i);
        } else {
            this.f84801h.add(interfaceC3951i);
        }
    }
}
