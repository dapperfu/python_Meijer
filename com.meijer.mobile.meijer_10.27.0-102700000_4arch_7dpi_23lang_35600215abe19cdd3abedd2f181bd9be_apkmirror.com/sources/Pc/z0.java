package Pc;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.C10195zy0;
import com.google.android.gms.internal.ads.C6961Mf;
import com.google.android.gms.internal.ads.InterfaceC6928Lf;

/* loaded from: classes4.dex */
final class z0 implements InterfaceC6928Lf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6961Mf f25255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f25256b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f25257c;

    z0(D0 d02, C6961Mf c6961Mf, Context context, Uri uri) {
        this.f25255a = c6961Mf;
        this.f25256b = context;
        this.f25257c = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6928Lf
    public final void zza() {
        androidx.browser.customtabs.d dVarA = new d.C0965d(this.f25255a.a()).a();
        dVarA.f47181a.setPackage(C10195zy0.a(this.f25256b));
        dVarA.a(this.f25256b, this.f25257c);
        this.f25255a.f((Activity) this.f25256b);
    }
}
