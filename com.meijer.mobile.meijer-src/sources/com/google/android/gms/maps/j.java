package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4116i;
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
final class j extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f85638e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85639f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f85640g;

    /* renamed from: h, reason: collision with root package name */
    private final List f85641h = new ArrayList();

    static /* synthetic */ void v(j jVar, Activity activity) {
        jVar.f85640g = activity;
        jVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85639f = eVar;
        x();
    }

    public final void x() {
        if (this.f85640g == null || this.f85639f == null || b() != null) {
            return;
        }
        try {
            C4113f.a(this.f85640g);
            this.f85639f.a(new i(this.f85638e, m0.a(this.f85640g, null).z0(com.google.android.gms.dynamic.d.I2(this.f85640g))));
            List list = this.f85641h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i) b()).c((InterfaceC4116i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    j(Fragment fragment) {
        this.f85638e = fragment;
    }

    public final void w(InterfaceC4116i interfaceC4116i) {
        if (b() != null) {
            ((i) b()).c(interfaceC4116i);
        } else {
            this.f85641h.add(interfaceC4116i);
        }
    }
}
