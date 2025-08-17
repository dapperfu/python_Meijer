package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3951i;
import Ld.m0;
import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class t extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f84848e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84849f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f84850g;

    /* renamed from: h, reason: collision with root package name */
    private final List f84851h = new ArrayList();

    static /* synthetic */ void v(t tVar, Activity activity) {
        tVar.f84850g = activity;
        tVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84849f = eVar;
        x();
    }

    public final void x() {
        if (this.f84850g == null || this.f84849f == null || b() != null) {
            return;
        }
        try {
            C3948f.a(this.f84850g);
            this.f84849f.a(new s(this.f84848e, m0.a(this.f84850g, null).w0(com.google.android.gms.dynamic.d.F2(this.f84850g))));
            List list = this.f84851h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((s) b()).c((InterfaceC3951i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    t(Fragment fragment) {
        this.f84848e = fragment;
    }

    public final void w(InterfaceC3951i interfaceC3951i) {
        if (b() != null) {
            ((s) b()).c(interfaceC3951i);
        } else {
            this.f84851h.add(interfaceC3951i);
        }
    }
}
