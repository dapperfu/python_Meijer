package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3949g;
import Ld.InterfaceC4046d;
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
final class d extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f84782e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84783f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f84784g;

    /* renamed from: h, reason: collision with root package name */
    private final List f84785h = new ArrayList();

    static /* synthetic */ void v(d dVar, Activity activity) {
        dVar.f84784g = activity;
        dVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84783f = eVar;
        x();
    }

    public final void x() {
        if (this.f84784g == null || this.f84783f == null || b() != null) {
            return;
        }
        try {
            C3948f.a(this.f84784g);
            InterfaceC4046d interfaceC4046dZzf = m0.a(this.f84784g, null).zzf(com.google.android.gms.dynamic.d.F2(this.f84784g));
            if (interfaceC4046dZzf == null) {
                return;
            }
            this.f84783f.a(new c(this.f84782e, interfaceC4046dZzf));
            List list = this.f84785h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) b()).c((InterfaceC3949g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    d(Fragment fragment) {
        this.f84782e = fragment;
    }

    public final void w(InterfaceC3949g interfaceC3949g) {
        if (b() != null) {
            ((c) b()).c(interfaceC3949g);
        } else {
            this.f84785h.add(interfaceC3949g);
        }
    }
}
