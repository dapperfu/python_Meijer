package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4116i;
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
final class n extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f85673e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f85674f;

    /* renamed from: g, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85675g;

    /* renamed from: h, reason: collision with root package name */
    private final StreetViewPanoramaOptions f85676h;

    /* renamed from: i, reason: collision with root package name */
    private final List f85677i = new ArrayList();

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85675g = eVar;
        w();
    }

    public final void w() {
        if (this.f85675g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f85674f;
            C4113f.a(context);
            this.f85675g.a(new m(this.f85673e, m0.a(context, null).M3(com.google.android.gms.dynamic.d.I2(context), this.f85676h)));
            List list = this.f85677i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((m) b()).c((InterfaceC4116i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    n(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f85673e = viewGroup;
        this.f85674f = context;
        this.f85676h = streetViewPanoramaOptions;
    }

    public final void v(InterfaceC4116i interfaceC4116i) {
        if (b() != null) {
            ((m) b()).c(interfaceC4116i);
        } else {
            this.f85677i.add(interfaceC4116i);
        }
    }
}
