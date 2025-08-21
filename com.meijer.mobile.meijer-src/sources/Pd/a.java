package Pd;

import Qd.A;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C10669v1;
import com.google.android.gms.internal.measurement.J0;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C10669v1 f25761a;

    /* renamed from: Pd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0428a extends A {
    }

    @Deprecated
    public void s(Bundle bundle) {
    }

    public void a(String str) {
        this.f25761a.D(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f25761a.z(str, str2, bundle);
    }

    public void c(String str) {
        this.f25761a.E(str);
    }

    public long d() {
        return this.f25761a.I();
    }

    public String e() {
        return this.f25761a.g();
    }

    public String f() {
        return this.f25761a.H();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f25761a.A(str, str2);
    }

    public String h() {
        return this.f25761a.b();
    }

    public String i() {
        return this.f25761a.a();
    }

    public String j() {
        return this.f25761a.G();
    }

    public int l(String str) {
        return this.f25761a.f(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z10) {
        return this.f25761a.c(str, str2, z10);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f25761a.w(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f25761a.e(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f25761a.e(bundle, true);
    }

    public void q(InterfaceC0428a interfaceC0428a) {
        this.f25761a.u(interfaceC0428a);
    }

    public void r(Bundle bundle) {
        this.f25761a.y(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.f25761a.C(J0.B(activity), str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.f25761a.x(str, str2, obj, true);
    }

    public final void v(boolean z10) {
        this.f25761a.h(z10);
    }

    public a(C10669v1 c10669v1) {
        this.f25761a = c10669v1;
    }

    @Deprecated
    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return C10669v1.r(context, bundle).s();
    }
}
