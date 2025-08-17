package Lc;

import Mc.Y1;
import Pc.C4564e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C7332Xf;
import java.util.Map;
import java.util.TreeMap;
import qd.C16519f;

/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18017a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18018b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18019c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f18020d;

    /* renamed from: e, reason: collision with root package name */
    private String f18021e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18022f;

    public final String a() {
        return this.f18022f;
    }

    public final String b() {
        return this.f18021e;
    }

    public final String c() {
        return this.f18018b;
    }

    public final String d() {
        return this.f18020d;
    }

    public final Map e() {
        return this.f18019c;
    }

    public final void f(Y1 y12, Qc.a aVar) {
        this.f18020d = y12.f19176j.f19151a;
        Bundle bundle = y12.f19179m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) C7332Xf.f71372c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f18021e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f18019c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f18019c.put("SDKVersion", aVar.f29929a);
        if (((Boolean) C7332Xf.f71370a.e()).booleanValue()) {
            Bundle bundleB = C4564e.b(this.f18017a, (String) C7332Xf.f71371b.e());
            for (String str3 : bundleB.keySet()) {
                this.f18019c.put(str3, bundleB.get(str3).toString());
            }
        }
    }

    public s(Context context, String str) {
        String strConcat;
        this.f18017a = context.getApplicationContext();
        this.f18018b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + C16519f.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            Qc.p.e("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f18022f = strConcat;
    }
}
