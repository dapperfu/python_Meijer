package Nc;

import Oc.Y1;
import Rc.C5185e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C7457Xf;
import java.util.Map;
import java.util.TreeMap;
import sd.C17067f;

/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20838b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20839c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f20840d;

    /* renamed from: e, reason: collision with root package name */
    private String f20841e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20842f;

    public final String a() {
        return this.f20842f;
    }

    public final String b() {
        return this.f20841e;
    }

    public final String c() {
        return this.f20838b;
    }

    public final String d() {
        return this.f20840d;
    }

    public final Map e() {
        return this.f20839c;
    }

    public final void f(Y1 y12, Sc.a aVar) {
        this.f20840d = y12.f23363j.f23338a;
        Bundle bundle = y12.f23366m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) C7457Xf.f72212c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f20841e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f20839c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f20839c.put("SDKVersion", aVar.f34479a);
        if (((Boolean) C7457Xf.f72210a.e()).booleanValue()) {
            Bundle bundleB = C5185e.b(this.f20837a, (String) C7457Xf.f72211b.e());
            for (String str3 : bundleB.keySet()) {
                this.f20839c.put(str3, bundleB.get(str3).toString());
            }
        }
    }

    public s(Context context, String str) {
        String strConcat;
        this.f20837a = context.getApplicationContext();
        this.f20838b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + C17067f.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            Sc.p.e("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f20842f = strConcat;
    }
}
