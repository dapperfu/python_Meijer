package Rc;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.C10320zy0;
import com.google.android.gms.internal.ads.C7086Mf;
import com.google.android.gms.internal.ads.InterfaceC7053Lf;

/* loaded from: classes4.dex */
final class z0 implements InterfaceC7053Lf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7086Mf f32469a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f32470b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f32471c;

    z0(D0 d02, C7086Mf c7086Mf, Context context, Uri uri) {
        this.f32469a = c7086Mf;
        this.f32470b = context;
        this.f32471c = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7053Lf
    public final void zza() {
        androidx.browser.customtabs.d dVarA = new d.C0978d(this.f32469a.a()).a();
        dVarA.f47405a.setPackage(C10320zy0.a(this.f32470b));
        dVarA.a(this.f32470b, this.f32471c);
        this.f32469a.f((Activity) this.f32470b);
    }
}
