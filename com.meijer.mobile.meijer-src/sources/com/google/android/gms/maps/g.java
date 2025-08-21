package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4114g;
import Nd.InterfaceC4180e;
import Nd.m0;
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
    private final ViewGroup f85630e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f85631f;

    /* renamed from: g, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85632g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleMapOptions f85633h;

    /* renamed from: i, reason: collision with root package name */
    private final List f85634i = new ArrayList();

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85632g = eVar;
        w();
    }

    public final void w() {
        if (this.f85632g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f85631f;
            C4113f.a(context);
            InterfaceC4180e interfaceC4180eY7 = m0.a(context, null).Y7(com.google.android.gms.dynamic.d.I2(context), this.f85633h);
            if (interfaceC4180eY7 == null) {
                return;
            }
            this.f85632g.a(new f(this.f85630e, interfaceC4180eY7));
            List list = this.f85634i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f) b()).c((InterfaceC4114g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    g(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f85630e = viewGroup;
        this.f85631f = context;
        this.f85633h = googleMapOptions;
    }

    public final void v(InterfaceC4114g interfaceC4114g) {
        if (b() != null) {
            ((f) b()).c(interfaceC4114g);
        } else {
            this.f85634i.add(interfaceC4114g);
        }
    }
}
