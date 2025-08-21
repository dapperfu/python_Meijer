package com.google.android.gms.ads;

import Oc.C4447y;
import Sc.p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC9655tn;

/* loaded from: classes4.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9655tn f65384a;

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    private final void a() {
        InterfaceC9655tn interfaceC9655tn = this.f65384a;
        if (interfaceC9655tn != null) {
            try {
                interfaceC9655tn.zzx();
            } catch (RemoteException e10) {
                p.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.w6(i10, i11, intent);
            }
        } catch (Exception e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                if (!interfaceC9655tn.g()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            InterfaceC9655tn interfaceC9655tn2 = this.f65384a;
            if (interfaceC9655tn2 != null) {
                interfaceC9655tn2.zzi();
            }
        } catch (RemoteException e11) {
            p.i("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzm();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzo();
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.F2(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.I0(bundle);
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzu();
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.O(com.google.android.gms.dynamic.d.I2(configuration));
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC9655tn interfaceC9655tnL = C4447y.a().l(this);
        this.f65384a = interfaceC9655tnL;
        if (interfaceC9655tnL != null) {
            try {
                interfaceC9655tnL.G3(bundle);
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzq();
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzr();
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzt();
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
            InterfaceC9655tn interfaceC9655tn = this.f65384a;
            if (interfaceC9655tn != null) {
                interfaceC9655tn.zzv();
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
