package Wc;

import Lc.v;
import Mc.A;
import Pc.D0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC7593bf;
import com.google.android.gms.internal.ads.C7267Vf0;
import com.google.android.gms.internal.ads.C8659lf;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38637a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38638b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38639c;

    public void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        v.t();
        map.put("device", D0.X());
        map.put("app", this.f38638b);
        v.t();
        map.put("is_lite_sdk", true != D0.f(this.f38637a) ? "0" : "1");
        AbstractC7593bf abstractC7593bf = C8659lf.f76249a;
        List listB = A.a().b();
        if (((Boolean) A.c().a(C8659lf.f76005I6)).booleanValue()) {
            listB.addAll(v.s().j().zzg().d());
        }
        map.put("e", TextUtils.join(",", listB));
        map.put("sdkVersion", this.f38639c);
        if (((Boolean) A.c().a(C8659lf.f76387jb)).booleanValue()) {
            v.t();
            map.put("is_bstar", true != D0.c(this.f38637a) ? "0" : "1");
        }
        if (((Boolean) A.c().a(C8659lf.f76455o9)).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76518t2)).booleanValue()) {
                map.put("plugin", C7267Vf0.c(v.s().o()));
            }
        }
    }

    public a(Context context, Qc.a aVar) {
        this.f38637a = context;
        this.f38638b = context.getPackageName();
        this.f38639c = aVar.f29929a;
    }
}
