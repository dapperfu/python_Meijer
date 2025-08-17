package com.google.android.gms.maps;

import Kd.C3948f;
import Kd.InterfaceC3951i;
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
final class n extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f84833e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f84834f;

    /* renamed from: g, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f84835g;

    /* renamed from: h, reason: collision with root package name */
    private final StreetViewPanoramaOptions f84836h;

    /* renamed from: i, reason: collision with root package name */
    private final List f84837i = new ArrayList();

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f84835g = eVar;
        w();
    }

    public final void w() {
        if (this.f84835g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f84834f;
            C3948f.a(context);
            this.f84835g.a(new m(this.f84833e, m0.a(context, null).B3(com.google.android.gms.dynamic.d.F2(context), this.f84836h)));
            List list = this.f84837i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((m) b()).c((InterfaceC3951i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    n(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f84833e = viewGroup;
        this.f84834f = context;
        this.f84836h = streetViewPanoramaOptions;
    }

    public final void v(InterfaceC3951i interfaceC3951i) {
        if (b() != null) {
            ((m) b()).c(interfaceC3951i);
        } else {
            this.f84837i.add(interfaceC3951i);
        }
    }
}
