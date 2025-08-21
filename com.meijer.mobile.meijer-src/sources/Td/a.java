package Td;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import com.google.android.gms.common.internal.M;
import com.google.android.gms.common.internal.r;
import ed.C13789a;
import id.C14719b;

/* loaded from: classes6.dex */
public class a extends AbstractC6651h<g> implements Sd.f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f36117e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36118a;

    /* renamed from: b, reason: collision with root package name */
    private final C6648e f36119b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f36120c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f36121d;

    public a(Context context, Looper looper, boolean z10, C6648e c6648e, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, c6648e, aVar, bVar);
        this.f36118a = true;
        this.f36119b = c6648e;
        this.f36120c = bundle;
        this.f36121d = c6648e.g();
    }

    @Override // Sd.f
    public final void a() {
        connect(new AbstractC6646c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Sd.f
    public final void b(f fVar) {
        r.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f36119b.b();
            ((g) getService()).I2(new j(1, new M(accountB, ((Integer) r.l(this.f36121d)).intValue(), AbstractC6646c.DEFAULT_ACCOUNT.equals(accountB.name) ? C13789a.a(getContext()).b() : null)), fVar);
        } catch (RemoteException e10) {
            FS.log_w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.Q4(new l(1, new C14719b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f36119b.d())) {
            this.f36120c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f36119b.d());
        }
        return this.f36120c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f36118a;
    }

    public static Bundle c(C6648e c6648e) {
        c6648e.f();
        Integer numG = c6648e.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c6648e.a());
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

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }
}
