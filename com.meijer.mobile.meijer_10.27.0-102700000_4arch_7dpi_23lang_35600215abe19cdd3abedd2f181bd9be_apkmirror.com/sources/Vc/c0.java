package Vc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.ads.C7197Te;
import com.google.android.gms.internal.ads.C8659lf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import qd.C16519f;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37223a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f37224b;

    /* renamed from: c, reason: collision with root package name */
    private final List f37225c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f37226d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f37227e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f37228f = new AtomicBoolean(false);

    public final JSONObject a() {
        if (!this.f37228f.get()) {
            b();
        }
        return this.f37227e;
    }

    public final void b() {
        if (this.f37228f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoF = null;
        try {
            if (this.f37224b != null) {
                packageInfoF = C16519f.a(this.f37223a).f(this.f37224b.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfoF != null) {
            try {
                this.f37227e.put("vc", packageInfoF.versionCode);
                this.f37227e.put("vnm", packageInfoF.versionName);
            } catch (JSONException e10) {
                Lc.v.s().x(e10, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        ApplicationInfo applicationInfo = this.f37224b;
        if (applicationInfo != null) {
            this.f37227e.put("pn", applicationInfo.packageName);
        }
        JSONObject jSONObject = this.f37227e;
        List list = this.f37225c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) Mc.A.c().a(C8659lf.f75994H9)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.f37227e.put("js", this.f37226d.f29929a);
        Iterator<String> itKeys = this.f37227e.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = this.f37227e.get(next);
            if (obj != null) {
                this.f37227e.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }

    c0(Context context, C7197Te c7197Te, List list, Qc.a aVar) {
        this.f37223a = context;
        this.f37224b = context.getApplicationInfo();
        this.f37225c = list;
        this.f37226d = aVar;
    }
}
