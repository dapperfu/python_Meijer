package Rd;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import cd.C6385a;
import com.fullstory.FS;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.M;
import com.google.android.gms.common.internal.r;
import gd.C14243b;

/* loaded from: classes6.dex */
public class a extends AbstractC6526h<g> implements Qd.f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32117e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32118a;

    /* renamed from: b, reason: collision with root package name */
    private final C6523e f32119b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f32120c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f32121d;

    public a(Context context, Looper looper, boolean z10, C6523e c6523e, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, c6523e, aVar, bVar);
        this.f32118a = true;
        this.f32119b = c6523e;
        this.f32120c = bundle;
        this.f32121d = c6523e.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qd.f
    public final void a(f fVar) {
        r.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f32119b.b();
            ((g) getService()).F2(new j(1, new M(accountB, ((Integer) r.l(this.f32121d)).intValue(), AbstractC6521c.DEFAULT_ACCOUNT.equals(accountB.name) ? C6385a.a(getContext()).b() : null)), fVar);
        } catch (RemoteException e10) {
            FS.log_w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.A5(new l(1, new C14243b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // Qd.f
    public final void b() {
        connect(new AbstractC6521c.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f32119b.d())) {
            this.f32120c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f32119b.d());
        }
        return this.f32120c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f32118a;
    }

    public static Bundle c(C6523e c6523e) {
        c6523e.f();
        Integer numG = c6523e.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c6523e.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }
}
