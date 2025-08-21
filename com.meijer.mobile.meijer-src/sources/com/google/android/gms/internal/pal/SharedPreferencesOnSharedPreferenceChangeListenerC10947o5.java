package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.util.VisibleForTesting;
import id.C14726i;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* renamed from: com.google.android.gms.internal.pal.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC10947o5 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f84104g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f84098a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f84099b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f84100c = false;

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    volatile boolean f84101d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f84102e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f84103f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f84105h = new JSONObject();

    private final void f() {
        if (this.f84102e == null) {
            return;
        }
        try {
            this.f84105h = new JSONObject((String) C10994r5.a(new InterfaceC11107y6() { // from class: com.google.android.gms.internal.pal.m5
                @Override // com.google.android.gms.internal.pal.InterfaceC11107y6
                public final Object zza() {
                    return this.f84076a.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final AbstractC10851i5 abstractC10851i5) {
        if (!this.f84099b.block(5000L)) {
            synchronized (this.f84098a) {
                try {
                    if (!this.f84101d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f84100c || this.f84102e == null) {
            synchronized (this.f84098a) {
                if (this.f84100c && this.f84102e != null) {
                }
                return abstractC10851i5.k();
            }
        }
        if (abstractC10851i5.d() != 2) {
            return (abstractC10851i5.d() == 1 && this.f84105h.has(abstractC10851i5.l())) ? abstractC10851i5.a(this.f84105h) : C10994r5.a(new InterfaceC11107y6() { // from class: com.google.android.gms.internal.pal.l5
                @Override // com.google.android.gms.internal.pal.InterfaceC11107y6
                public final Object zza() {
                    return this.f84063a.c(abstractC10851i5);
                }
            });
        }
        Bundle bundle = this.f84103f;
        return bundle == null ? abstractC10851i5.k() : abstractC10851i5.b(bundle);
    }

    final /* synthetic */ Object c(AbstractC10851i5 abstractC10851i5) {
        return abstractC10851i5.c(this.f84102e);
    }

    final /* synthetic */ String d() {
        return this.f84102e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f84100c) {
            return;
        }
        synchronized (this.f84098a) {
            try {
                if (this.f84100c) {
                    return;
                }
                if (!this.f84101d) {
                    this.f84101d = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.f84104g = applicationContext;
                try {
                    this.f84103f = C17067f.a(applicationContext).c(this.f84104g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context contextC = C14726i.c(context);
                    if (contextC != null || (contextC = context.getApplicationContext()) != null) {
                        context = contextC;
                    }
                    if (context == null) {
                        return;
                    }
                    C10718a5.b();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.f84102e = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    C11090x5.c(new C10931n5(this));
                    f();
                    this.f84100c = true;
                } finally {
                    this.f84101d = false;
                    this.f84099b.open();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
