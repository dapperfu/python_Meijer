package Lc;

import Mc.C4106c1;
import Mc.C4135m0;
import Mc.C4169y;
import Mc.E;
import Mc.H;
import Mc.InterfaceC4099a0;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import Mc.K;
import Mc.N0;
import Mc.R1;
import Mc.U;
import Mc.U0;
import Mc.Y0;
import Mc.Y1;
import Mc.d2;
import Mc.j2;
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
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C7332Xf;
import com.google.android.gms.internal.ads.InterfaceC6633Cn;
import com.google.android.gms.internal.ads.InterfaceC6735Fn;
import com.google.android.gms.internal.ads.InterfaceC6758Gf;
import com.google.android.gms.internal.ads.InterfaceC7075Po;
import com.google.android.gms.internal.ads.InterfaceC9722vc;
import com.google.android.gms.internal.ads.M9;
import com.google.android.gms.internal.ads.zzavb;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class u extends U {

    /* renamed from: a, reason: collision with root package name */
    private final Qc.a f18023a;

    /* renamed from: b, reason: collision with root package name */
    private final d2 f18024b;

    /* renamed from: c, reason: collision with root package name */
    private final Future f18025c = C6908Kq.f68174a.i0(new q(this));

    /* renamed from: d, reason: collision with root package name */
    private final Context f18026d;

    /* renamed from: e, reason: collision with root package name */
    private final s f18027e;

    /* renamed from: f, reason: collision with root package name */
    private WebView f18028f;

    /* renamed from: g, reason: collision with root package name */
    private H f18029g;

    /* renamed from: h, reason: collision with root package name */
    private M9 f18030h;

    /* renamed from: i, reason: collision with root package name */
    private AsyncTask f18031i;

    @Override // Mc.V
    public final void B4(N0 n02) {
    }

    @Override // Mc.V
    public final boolean G() throws RemoteException {
        return false;
    }

    @Override // Mc.V
    public final boolean R() throws RemoteException {
        return false;
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) {
    }

    @Override // Mc.V
    public final void Y8(Y1 y12, K k10) {
    }

    @Override // Mc.V
    public final boolean q0() throws RemoteException {
        return false;
    }

    @Override // Mc.V
    public final void u6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Mc.V
    public final void w9(boolean z10) throws RemoteException {
    }

    @Override // Mc.V
    public final U0 zzk() {
        return null;
    }

    @Override // Mc.V
    public final Y0 zzl() {
        return null;
    }

    @Override // Mc.V
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // Mc.V
    public final String zzt() throws RemoteException {
        return null;
    }

    static /* bridge */ /* synthetic */ String H9(u uVar, String str) {
        if (uVar.f18030h == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = uVar.f18030h.a(uriA, uVar.f18026d, null, null);
        } catch (zzavb e10) {
            Qc.p.h("Unable to process ad data", e10);
        }
        return uriA.toString();
    }

    static /* bridge */ /* synthetic */ void K9(u uVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        uVar.f18026d.startActivity(intent);
    }

    final void B9(int i10) {
        if (this.f18028f == null) {
            return;
        }
        this.f18028f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // Mc.V
    public final void E8(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void G6(InterfaceC6758Gf interfaceC6758Gf) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final boolean H4(Y1 y12) throws RemoteException {
        com.google.android.gms.common.internal.r.m(this.f18028f, "This Search Ad has already been torn down");
        this.f18027e.f(y12, this.f18023a);
        this.f18031i = new r(this, null).execute(new Void[0]);
        return true;
    }

    @Override // Mc.V
    public final void I2(InterfaceC6633Cn interfaceC6633Cn) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void L6(R1 r12) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void N1(E e10) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void O7(d2 d2Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // Mc.V
    public final void R1(C4135m0 c4135m0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void R6(j2 j2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void V1(InterfaceC6735Fn interfaceC6735Fn, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void X1(InterfaceC7075Po interfaceC7075Po) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void a4(C4106c1 c4106c1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void c7(InterfaceC4099a0 interfaceC4099a0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void j() throws RemoteException {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final void o() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void r() throws RemoteException {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final void s8(H h10) throws RemoteException {
        this.f18029g = h10;
    }

    @Override // Mc.V
    public final void u5(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void v() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final void w6(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Mc.V
    public final d2 zzg() throws RemoteException {
        return this.f18024b;
    }

    @Override // Mc.V
    public final H zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // Mc.V
    public final InterfaceC4123i0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        com.google.android.gms.common.internal.r.e("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.d.F2(this.f18028f);
    }

    final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) C7332Xf.f71373d.e());
        builder.appendQueryParameter("query", this.f18027e.d());
        builder.appendQueryParameter("pubId", this.f18027e.c());
        builder.appendQueryParameter("mappver", this.f18027e.a());
        Map mapE = this.f18027e.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        M9 m92 = this.f18030h;
        if (m92 != null) {
            try {
                uriBuild = m92.b(uriBuild, this.f18026d);
            } catch (zzavb e10) {
                Qc.p.h("Unable to process ad data", e10);
            }
        }
        return zzq() + "#" + uriBuild.getEncodedQuery();
    }

    final String zzq() {
        String strB = this.f18027e.b();
        if (true == TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((String) C7332Xf.f71373d.e());
    }

    @Override // Mc.V
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // Mc.V
    public final void zzx() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f18031i.cancel(true);
        this.f18025c.cancel(false);
        this.f18028f.destroy();
        this.f18028f = null;
    }

    public u(Context context, d2 d2Var, String str, Qc.a aVar) {
        this.f18026d = context;
        this.f18023a = aVar;
        this.f18024b = d2Var;
        this.f18028f = new WebView(context);
        this.f18027e = new s(context, str);
        B9(0);
        this.f18028f.setVerticalScrollBarEnabled(false);
        this.f18028f.getSettings().setJavaScriptEnabled(true);
        FS.setWebViewClient(this.f18028f, new o(this));
        this.f18028f.setOnTouchListener(new p(this));
    }

    final int d(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C4169y.b();
            return Qc.g.z(this.f18026d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
