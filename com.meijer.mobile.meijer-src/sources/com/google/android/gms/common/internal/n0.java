package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;

/* loaded from: classes4.dex */
final class n0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p0 f65746a;

    /* synthetic */ n0(p0 p0Var, o0 o0Var) {
        this.f65746a = p0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f65746a.f65759g) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) this.f65746a.f65759g.get(l0Var);
                    if (m0Var != null && m0Var.i()) {
                        if (m0Var.j()) {
                            m0Var.g("GmsClientSupervisor");
                        }
                        this.f65746a.f65759g.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f65746a.f65759g) {
            try {
                l0 l0Var2 = (l0) message.obj;
                m0 m0Var2 = (m0) this.f65746a.f65759g.get(l0Var2);
                if (m0Var2 != null && m0Var2.a() == 3) {
                    FS.log_e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(l0Var2), new Exception());
                    ComponentName componentNameB = m0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = l0Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = l0Var2.c();
                        r.l(strC);
                        componentNameB = new ComponentName(strC, zzbz.UNKNOWN_CONTENT_TYPE);
                    }
                    m0Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
