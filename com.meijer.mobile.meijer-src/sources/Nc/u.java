package Nc;

import Oc.C4384c1;
import Oc.C4413m0;
import Oc.C4447y;
import Oc.E;
import Oc.H;
import Oc.InterfaceC4377a0;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import Oc.K;
import Oc.N0;
import Oc.R1;
import Oc.U;
import Oc.U0;
import Oc.Y0;
import Oc.Y1;
import Oc.d2;
import Oc.j2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7457Xf;
import com.google.android.gms.internal.ads.InterfaceC6758Cn;
import com.google.android.gms.internal.ads.InterfaceC6860Fn;
import com.google.android.gms.internal.ads.InterfaceC6883Gf;
import com.google.android.gms.internal.ads.InterfaceC7200Po;
import com.google.android.gms.internal.ads.InterfaceC9847vc;
import com.google.android.gms.internal.ads.M9;
import com.google.android.gms.internal.ads.zzavb;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class u extends U {

    /* renamed from: a, reason: collision with root package name */
    private final Sc.a f20843a;

    /* renamed from: b, reason: collision with root package name */
    private final d2 f20844b;

    /* renamed from: c, reason: collision with root package name */
    private final Future f20845c = C7033Kq.f69014a.k0(new q(this));

    /* renamed from: d, reason: collision with root package name */
    private final Context f20846d;

    /* renamed from: e, reason: collision with root package name */
    private final s f20847e;

    /* renamed from: f, reason: collision with root package name */
    private WebView f20848f;

    /* renamed from: g, reason: collision with root package name */
    private H f20849g;

    /* renamed from: h, reason: collision with root package name */
    private M9 f20850h;

    /* renamed from: i, reason: collision with root package name */
    private AsyncTask f20851i;

    @Override // Oc.V
    public final void A6(Y1 y12, K k10) {
    }

    @Override // Oc.V
    public final void D3(N0 n02) {
    }

    @Override // Oc.V
    public final boolean G() throws RemoteException {
        return false;
    }

    @Override // Oc.V
    public final void J6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Oc.V
    public final boolean R() throws RemoteException {
        return false;
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) {
    }

    @Override // Oc.V
    public final boolean r0() throws RemoteException {
        return false;
    }

    @Override // Oc.V
    public final void v9(boolean z10) throws RemoteException {
    }

    @Override // Oc.V
    public final U0 zzk() {
        return null;
    }

    @Override // Oc.V
    public final Y0 zzl() {
        return null;
    }

    @Override // Oc.V
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // Oc.V
    public final String zzt() throws RemoteException {
        return null;
    }

    static /* bridge */ /* synthetic */ String H9(u uVar, String str) {
        if (uVar.f20850h == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = uVar.f20850h.a(uriA, uVar.f20846d, null, null);
        } catch (zzavb e10) {
            Sc.p.h("Unable to process ad data", e10);
        }
        return uriA.toString();
    }

    static /* bridge */ /* synthetic */ void K9(u uVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        uVar.f20846d.startActivity(intent);
    }

    @Override // Oc.V
    public final void A5(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void B5(R1 r12) {
        throw new IllegalStateException("Unused method");
    }

    final void B9(int i10) {
        if (this.f20848f == null) {
            return;
        }
        this.f20848f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // Oc.V
    public final void G5(j2 j2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void J2(E e10) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void K6(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void O2(InterfaceC6758Cn interfaceC6758Cn) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void S6(InterfaceC4377a0 interfaceC4377a0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void T6(InterfaceC6883Gf interfaceC6883Gf) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void W4(C4384c1 c4384c1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final boolean W7(Y1 y12) throws RemoteException {
        com.google.android.gms.common.internal.r.m(this.f20848f, "This Search Ad has already been torn down");
        this.f20847e.f(y12, this.f20843a);
        this.f20851i = new r(this, null).execute(new Void[0]);
        return true;
    }

    @Override // Oc.V
    public final void X1(InterfaceC6860Fn interfaceC6860Fn, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void Y1(InterfaceC7200Po interfaceC7200Po) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void a9(C4413m0 c4413m0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void j() throws RemoteException {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final void n9(H h10) throws RemoteException {
        this.f20849g = h10;
    }

    @Override // Oc.V
    public final void o() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void r() throws RemoteException {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final void u1(d2 d2Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // Oc.V
    public final void v() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final void y8(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Oc.V
    public final d2 zzg() throws RemoteException {
        return this.f20844b;
    }

    @Override // Oc.V
    public final H zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // Oc.V
    public final InterfaceC4401i0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        com.google.android.gms.common.internal.r.e("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.d.I2(this.f20848f);
    }

    final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) C7457Xf.f72213d.e());
        builder.appendQueryParameter("query", this.f20847e.d());
        builder.appendQueryParameter("pubId", this.f20847e.c());
        builder.appendQueryParameter("mappver", this.f20847e.a());
        Map mapE = this.f20847e.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        M9 m92 = this.f20850h;
        if (m92 != null) {
            try {
                uriBuild = m92.b(uriBuild, this.f20846d);
            } catch (zzavb e10) {
                Sc.p.h("Unable to process ad data", e10);
            }
        }
        return zzq() + "#" + uriBuild.getEncodedQuery();
    }

    final String zzq() {
        String strB = this.f20847e.b();
        if (true == TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((String) C7457Xf.f72213d.e());
    }

    @Override // Oc.V
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // Oc.V
    public final void zzx() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f20851i.cancel(true);
        this.f20845c.cancel(false);
        this.f20848f.destroy();
        this.f20848f = null;
    }

    public u(Context context, d2 d2Var, String str, Sc.a aVar) {
        this.f20846d = context;
        this.f20843a = aVar;
        this.f20844b = d2Var;
        this.f20848f = new WebView(context);
        this.f20847e = new s(context, str);
        B9(0);
        this.f20848f.setVerticalScrollBarEnabled(false);
        this.f20848f.getSettings().setJavaScriptEnabled(true);
        FS.setWebViewClient(this.f20848f, new o(this));
        this.f20848f.setOnTouchListener(new p(this));
    }

    final int d(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C4447y.b();
            return Sc.g.z(this.f20846d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
