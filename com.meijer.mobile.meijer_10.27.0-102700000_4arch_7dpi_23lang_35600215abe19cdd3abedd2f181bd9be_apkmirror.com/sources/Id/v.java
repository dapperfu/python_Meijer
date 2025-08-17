package Id;

import Td.C5233k;
import Xd.B;
import Xd.C5420d;
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
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import gd.C14244c;

/* loaded from: classes6.dex */
public final class v extends AbstractC6526h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13826a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13827b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13828c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13829d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13830e;

    public v(Context context, Looper looper, C6523e c6523e, e.a aVar, e.b bVar, int i10, int i11, boolean z10) {
        super(context, looper, 4, c6523e, aVar, bVar);
        this.f13826a = context;
        this.f13827b = i10;
        Account accountA = c6523e.a();
        this.f13828c = accountA != null ? accountA.name : null;
        this.f13829d = i11;
        this.f13830e = z10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final boolean usesClientTelemetry() {
        return true;
    }

    private final Bundle d() {
        String packageName = this.f13826a.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f13827b);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f13830e);
        bundle.putString("androidPackageName", packageName);
        String str = this.f13828c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f13829d);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return B.f39206i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(C5420d c5420d, C5233k c5233k) {
        Bundle bundleD = d();
        bundleD.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        u uVar = new u(c5233k);
        try {
            ((p) getService()).b2(c5420d, bundleD, uVar);
        } catch (RemoteException e10) {
            FS.log_e("WalletClientImpl", "RemoteException creating wallet objects", e10);
            uVar.X3(8, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }
}
