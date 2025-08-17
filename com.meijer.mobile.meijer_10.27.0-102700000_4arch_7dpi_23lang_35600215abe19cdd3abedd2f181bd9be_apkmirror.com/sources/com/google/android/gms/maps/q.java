package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3949g;
import Ld.InterfaceC4046d;
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
final class q extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f84841e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84842f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f84843g;

    /* renamed from: h, reason: collision with root package name */
    private final List f84844h = new ArrayList();

    static /* synthetic */ void v(q qVar, Activity activity) {
        qVar.f84843g = activity;
        qVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84842f = eVar;
        x();
    }

    public final void x() {
        if (this.f84843g == null || this.f84842f == null || b() != null) {
            return;
        }
        try {
            C3948f.a(this.f84843g);
            InterfaceC4046d interfaceC4046dZzf = m0.a(this.f84843g, null).zzf(com.google.android.gms.dynamic.d.F2(this.f84843g));
            if (interfaceC4046dZzf == null) {
                return;
            }
            this.f84842f.a(new p(this.f84841e, interfaceC4046dZzf));
            List list = this.f84844h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) b()).c((InterfaceC3949g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    q(Fragment fragment) {
        this.f84841e = fragment;
    }

    public final void w(InterfaceC3949g interfaceC3949g) {
        if (b() != null) {
            ((p) b()).c(interfaceC3949g);
        } else {
            this.f84844h.add(interfaceC3949g);
        }
    }
}
