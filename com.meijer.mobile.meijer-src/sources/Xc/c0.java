package Xc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.ads.C7322Te;
import com.google.android.gms.internal.ads.C8784lf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41935a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f41936b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41937c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f41938d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f41939e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f41940f = new AtomicBoolean(false);

    public final JSONObject a() {
        if (!this.f41940f.get()) {
            b();
        }
        return this.f41939e;
    }

    public final void b() {
        if (this.f41940f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoF = null;
        try {
            if (this.f41936b != null) {
                packageInfoF = C17067f.a(this.f41935a).f(this.f41936b.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfoF != null) {
            try {
                this.f41939e.put("vc", packageInfoF.versionCode);
                this.f41939e.put("vnm", packageInfoF.versionName);
            } catch (JSONException e10) {
                Nc.v.s().x(e10, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        ApplicationInfo applicationInfo = this.f41936b;
        if (applicationInfo != null) {
            this.f41939e.put("pn", applicationInfo.packageName);
        }
        JSONObject jSONObject = this.f41939e;
        List list = this.f41937c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) Oc.A.c().a(C8784lf.f76834H9)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.f41939e.put("js", this.f41938d.f34479a);
        Iterator<String> itKeys = this.f41939e.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = this.f41939e.get(next);
            if (obj != null) {
                this.f41939e.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }

    c0(Context context, C7322Te c7322Te, List list, Sc.a aVar) {
        this.f41935a = context;
        this.f41936b = context.getApplicationInfo();
        this.f41937c = list;
        this.f41938d = aVar;
    }
}
