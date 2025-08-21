package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4114g;
import Nd.InterfaceC4178d;
import Nd.m0;
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
    private final Fragment f85622e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85623f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f85624g;

    /* renamed from: h, reason: collision with root package name */
    private final List f85625h = new ArrayList();

    static /* synthetic */ void v(d dVar, Activity activity) {
        dVar.f85624g = activity;
        dVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85623f = eVar;
        x();
    }

    public final void x() {
        if (this.f85624g == null || this.f85623f == null || b() != null) {
            return;
        }
        try {
            C4113f.a(this.f85624g);
            InterfaceC4178d interfaceC4178dZzf = m0.a(this.f85624g, null).zzf(com.google.android.gms.dynamic.d.I2(this.f85624g));
            if (interfaceC4178dZzf == null) {
                return;
            }
            this.f85623f.a(new c(this.f85622e, interfaceC4178dZzf));
            List list = this.f85625h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) b()).c((InterfaceC4114g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    d(Fragment fragment) {
        this.f85622e = fragment;
    }

    public final void w(InterfaceC4114g interfaceC4114g) {
        if (b() != null) {
            ((c) b()).c(interfaceC4114g);
        } else {
            this.f85625h.add(interfaceC4114g);
        }
    }
}
