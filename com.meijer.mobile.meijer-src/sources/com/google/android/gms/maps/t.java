package com.google.android.gms.maps;

import Md.C4113f;
import Md.InterfaceC4116i;
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
final class t extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final Fragment f85688e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f85689f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f85690g;

    /* renamed from: h, reason: collision with root package name */
    private final List f85691h = new ArrayList();

    static /* synthetic */ void v(t tVar, Activity activity) {
        tVar.f85690g = activity;
        tVar.x();
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f85689f = eVar;
        x();
    }

    public final void x() {
        if (this.f85690g == null || this.f85689f == null || b() != null) {
            return;
        }
        try {
            C4113f.a(this.f85690g);
            this.f85689f.a(new s(this.f85688e, m0.a(this.f85690g, null).z0(com.google.android.gms.dynamic.d.I2(this.f85690g))));
            List list = this.f85691h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((s) b()).c((InterfaceC4116i) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    t(Fragment fragment) {
        this.f85688e = fragment;
    }

    public final void w(InterfaceC4116i interfaceC4116i) {
        if (b() != null) {
            ((s) b()).c(interfaceC4116i);
        } else {
            this.f85691h.add(interfaceC4116i);
        }
    }
}
