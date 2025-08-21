package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9550so extends AbstractC9337qo {

    /* renamed from: a, reason: collision with root package name */
    private final Object f79138a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f79139b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f79140c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7298Sk f79141d;

    /* renamed from: e, reason: collision with root package name */
    private final Sc.a f79142e;

    public static JSONObject c(Context context, Sc.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) C8893mg.f77686b.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f34479a);
            jSONObject.put("mf", C8893mg.f77687c.e());
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

    @Override // com.google.android.gms.internal.ads.AbstractC9337qo
    public final com.google.common.util.concurrent.q a() {
        synchronized (this.f79138a) {
            try {
                if (this.f79140c == null) {
                    this.f79140c = this.f79139b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f79140c;
        if (Nc.v.c().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) C8893mg.f77688d.e()).longValue()) {
            return Mj0.h(null);
        }
        return Mj0.m(this.f79141d.zzb(c(this.f79139b, this.f79142e)), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.ro
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                this.f78904a.b((JSONObject) obj);
                return null;
            }
        }, C7033Kq.f69020g);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        AbstractC7718bf abstractC7718bf = C8784lf.f77089a;
        Oc.A.b();
        SharedPreferences sharedPreferencesA = C7931df.a(this.f79139b);
        if (sharedPreferencesA == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        Oc.A.a();
        int i10 = C7826cg.f74061a;
        Oc.A.a().e(editorEdit, 1, jSONObject);
        Oc.A.b();
        editorEdit.commit();
        SharedPreferences sharedPreferences = this.f79140c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", Nc.v.c().a()).apply();
        return null;
    }

    public C9550so(Context context, InterfaceC7298Sk interfaceC7298Sk, Sc.a aVar) {
        this.f79139b = context.getApplicationContext();
        this.f79142e = aVar;
        this.f79141d = interfaceC7298Sk;
    }
}
