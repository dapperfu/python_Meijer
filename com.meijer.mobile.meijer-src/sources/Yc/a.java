package Yc;

import Nc.v;
import Oc.A;
import Rc.D0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC7718bf;
import com.google.android.gms.internal.ads.C7392Vf0;
import com.google.android.gms.internal.ads.C8784lf;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43038c;

    public void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        v.t();
        map.put("device", D0.X());
        map.put("app", this.f43037b);
        v.t();
        map.put("is_lite_sdk", true != D0.f(this.f43036a) ? "0" : "1");
        AbstractC7718bf abstractC7718bf = C8784lf.f77089a;
        List listB = A.a().b();
        if (((Boolean) A.c().a(C8784lf.f76845I6)).booleanValue()) {
            listB.addAll(v.s().j().zzg().d());
        }
        map.put("e", TextUtils.join(",", listB));
        map.put("sdkVersion", this.f43038c);
        if (((Boolean) A.c().a(C8784lf.f77227jb)).booleanValue()) {
            v.t();
            map.put("is_bstar", true != D0.c(this.f43036a) ? "0" : "1");
        }
        if (((Boolean) A.c().a(C8784lf.f77295o9)).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77358t2)).booleanValue()) {
                map.put("plugin", C7392Vf0.c(v.s().o()));
            }
        }
    }

    public a(Context context, Sc.a aVar) {
        this.f43036a = context;
        this.f43037b = context.getPackageName();
        this.f43038c = aVar.f34479a;
    }
}
