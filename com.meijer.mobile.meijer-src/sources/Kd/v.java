package Kd;

import Vd.C5517k;
import Zd.B;
import Zd.C5631d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import id.C14720c;

/* loaded from: classes6.dex */
public final class v extends AbstractC6651h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16572a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16573b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16574c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16575d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16576e;

    public v(Context context, Looper looper, C6648e c6648e, e.a aVar, e.b bVar, int i10, int i11, boolean z10) {
        super(context, looper, 4, c6648e, aVar, bVar);
        this.f16572a = context;
        this.f16573b = i10;
        Account accountA = c6648e.a();
        this.f16574c = accountA != null ? accountA.name : null;
        this.f16575d = i11;
        this.f16576e = z10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final boolean usesClientTelemetry() {
        return true;
    }

    private final Bundle d() {
        String packageName = this.f16572a.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f16573b);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f16576e);
        bundle.putString("androidPackageName", packageName);
        String str = this.f16574c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f16575d);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return B.f43684i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(C5631d c5631d, C5517k c5517k) {
        Bundle bundleD = d();
        bundleD.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        u uVar = new u(c5517k);
        try {
            ((p) getService()).c2(c5631d, bundleD, uVar);
        } catch (RemoteException e10) {
            FS.log_e("WalletClientImpl", "RemoteException creating wallet objects", e10);
            uVar.o4(8, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }
}
