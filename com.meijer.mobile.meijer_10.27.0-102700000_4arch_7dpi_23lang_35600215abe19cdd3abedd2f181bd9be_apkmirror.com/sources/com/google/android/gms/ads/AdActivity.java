package com.google.android.gms.ads;

import Mc.C4169y;
import Qc.p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC9530tn;

/* loaded from: classes4.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9530tn f64544a;

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    private final void a() {
        InterfaceC9530tn interfaceC9530tn = this.f64544a;
        if (interfaceC9530tn != null) {
            try {
                interfaceC9530tn.zzx();
            } catch (RemoteException e10) {
                p.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.j6(i10, i11, intent);
            }
        } catch (Exception e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                if (!interfaceC9530tn.f()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            InterfaceC9530tn interfaceC9530tn2 = this.f64544a;
            if (interfaceC9530tn2 != null) {
                interfaceC9530tn2.zzi();
            }
        } catch (RemoteException e11) {
            p.i("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzm();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzo();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.C2(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.F0(bundle);
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzu();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.O(com.google.android.gms.dynamic.d.F2(configuration));
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC9530tn interfaceC9530tnL = C4169y.a().l(this);
        this.f64544a = interfaceC9530tnL;
        if (interfaceC9530tnL != null) {
            try {
                interfaceC9530tnL.v3(bundle);
                return;
            } catch (RemoteException e10) {
                p.i("#007 Could not call remote method.", e10);
                finish();
                return;
            }
        }
        p.i("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzq();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzr();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzt();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC9530tn interfaceC9530tn = this.f64544a;
            if (interfaceC9530tn != null) {
                interfaceC9530tn.zzv();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
