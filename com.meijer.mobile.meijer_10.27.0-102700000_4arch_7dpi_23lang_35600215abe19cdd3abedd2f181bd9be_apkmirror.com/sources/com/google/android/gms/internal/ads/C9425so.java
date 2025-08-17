package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9425so extends AbstractC9212qo {

    /* renamed from: a, reason: collision with root package name */
    private final Object f78298a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f78299b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f78300c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7173Sk f78301d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.a f78302e;

    public static JSONObject c(Context context, Qc.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) C8768mg.f76846b.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f29929a);
            jSONObject.put("mf", C8768mg.f76847c.e());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9212qo
    public final com.google.common.util.concurrent.q a() {
        synchronized (this.f78298a) {
            try {
                if (this.f78300c == null) {
                    this.f78300c = this.f78299b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f78300c;
        if (Lc.v.c().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) C8768mg.f76848d.e()).longValue()) {
            return Mj0.h(null);
        }
        return Mj0.m(this.f78301d.zzb(c(this.f78299b, this.f78302e)), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.ro
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                this.f78064a.b((JSONObject) obj);
                return null;
            }
        }, C6908Kq.f68180g);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        AbstractC7593bf abstractC7593bf = C8659lf.f76249a;
        Mc.A.b();
        SharedPreferences sharedPreferencesA = C7806df.a(this.f78299b);
        if (sharedPreferencesA == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        Mc.A.a();
        int i10 = C7701cg.f73221a;
        Mc.A.a().e(editorEdit, 1, jSONObject);
        Mc.A.b();
        editorEdit.commit();
        SharedPreferences sharedPreferences = this.f78300c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", Lc.v.c().a()).apply();
        return null;
    }

    public C9425so(Context context, InterfaceC7173Sk interfaceC7173Sk, Qc.a aVar) {
        this.f78299b = context.getApplicationContext();
        this.f78302e = aVar;
        this.f78301d = interfaceC7173Sk;
    }
}
