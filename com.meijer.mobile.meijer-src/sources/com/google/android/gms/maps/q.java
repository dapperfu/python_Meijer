package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4114g;
import Nd.InterfaceC4178d;
import Nd.m0;
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
    private final Fragment f85681e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85682f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f85683g;

    /* renamed from: h, reason: collision with root package name */
    private final List f85684h = new ArrayList();

    static /* synthetic */ void v(q qVar, Activity activity) {
        qVar.f85683g = activity;
        qVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85682f = eVar;
        x();
    }

    public final void x() {
        if (this.f85683g == null || this.f85682f == null || b() != null) {
            return;
        }
        try {
            C4113f.a(this.f85683g);
            InterfaceC4178d interfaceC4178dZzf = m0.a(this.f85683g, null).zzf(com.google.android.gms.dynamic.d.I2(this.f85683g));
            if (interfaceC4178dZzf == null) {
                return;
            }
            this.f85682f.a(new p(this.f85681e, interfaceC4178dZzf));
            List list = this.f85684h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) b()).c((InterfaceC4114g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    q(Fragment fragment) {
        this.f85681e = fragment;
    }

    public final void w(InterfaceC4114g interfaceC4114g) {
        if (b() != null) {
            ((p) b()).c(interfaceC4114g);
        } else {
            this.f85684h.add(interfaceC4114g);
        }
    }
}
