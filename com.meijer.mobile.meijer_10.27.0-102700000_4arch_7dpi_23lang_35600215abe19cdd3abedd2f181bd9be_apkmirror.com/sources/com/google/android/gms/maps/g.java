package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3949g;
import Ld.InterfaceC4048e;
import Ld.m0;
import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class g extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f84790e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f84791f;

    /* renamed from: g, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84792g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleMapOptions f84793h;

    /* renamed from: i, reason: collision with root package name */
    private final List f84794i = new ArrayList();

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84792g = eVar;
        w();
    }

    public final void w() {
        if (this.f84792g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f84791f;
            C3948f.a(context);
            InterfaceC4048e interfaceC4048eC8 = m0.a(context, null).c8(com.google.android.gms.dynamic.d.F2(context), this.f84793h);
            if (interfaceC4048eC8 == null) {
                return;
            }
            this.f84792g.a(new f(this.f84790e, interfaceC4048eC8));
            List list = this.f84794i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f) b()).c((InterfaceC3949g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    g(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f84790e = viewGroup;
        this.f84791f = context;
        this.f84793h = googleMapOptions;
    }

    public final void v(InterfaceC3949g interfaceC3949g) {
        if (b() != null) {
            ((f) b()).c(interfaceC3949g);
        } else {
            this.f84794i.add(interfaceC3949g);
        }
    }
}
