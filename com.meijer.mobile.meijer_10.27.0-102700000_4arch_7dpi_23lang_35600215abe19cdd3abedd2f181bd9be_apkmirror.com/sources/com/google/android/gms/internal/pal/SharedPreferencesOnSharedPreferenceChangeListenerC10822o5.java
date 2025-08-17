package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.util.VisibleForTesting;
import gd.C14250i;
import org.json.JSONException;
import org.json.JSONObject;
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.pal.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC10822o5 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f83264g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f83258a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f83259b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f83260c = false;

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    volatile boolean f83261d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f83262e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f83263f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f83265h = new JSONObject();

    private final void f() {
        if (this.f83262e == null) {
            return;
        }
        try {
            this.f83265h = new JSONObject((String) C10869r5.a(new InterfaceC10982y6() { // from class: com.google.android.gms.internal.pal.m5
                @Override // com.google.android.gms.internal.pal.InterfaceC10982y6
                public final Object zza() {
                    return this.f83236a.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final AbstractC10726i5 abstractC10726i5) {
        if (!this.f83259b.block(5000L)) {
            synchronized (this.f83258a) {
                try {
                    if (!this.f83261d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f83260c || this.f83262e == null) {
            synchronized (this.f83258a) {
                if (this.f83260c && this.f83262e != null) {
                }
                return abstractC10726i5.k();
            }
        }
        if (abstractC10726i5.d() != 2) {
            return (abstractC10726i5.d() == 1 && this.f83265h.has(abstractC10726i5.l())) ? abstractC10726i5.a(this.f83265h) : C10869r5.a(new InterfaceC10982y6() { // from class: com.google.android.gms.internal.pal.l5
                @Override // com.google.android.gms.internal.pal.InterfaceC10982y6
                public final Object zza() {
                    return this.f83223a.c(abstractC10726i5);
                }
            });
        }
        Bundle bundle = this.f83263f;
        return bundle == null ? abstractC10726i5.k() : abstractC10726i5.b(bundle);
    }

    final /* synthetic */ Object c(AbstractC10726i5 abstractC10726i5) {
        return abstractC10726i5.c(this.f83262e);
    }

    final /* synthetic */ String d() {
        return this.f83262e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f83260c) {
            return;
        }
        synchronized (this.f83258a) {
            try {
                if (this.f83260c) {
                    return;
                }
                if (!this.f83261d) {
                    this.f83261d = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.f83264g = applicationContext;
                try {
                    this.f83263f = C16519f.a(applicationContext).c(this.f83264g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context contextC = C14250i.c(context);
                    if (contextC != null || (contextC = context.getApplicationContext()) != null) {
                        context = contextC;
                    }
                    if (context == null) {
                        return;
                    }
                    C10593a5.b();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.f83262e = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    C10965x5.c(new C10806n5(this));
                    f();
                    this.f83260c = true;
                } finally {
                    this.f83261d = false;
                    this.f83259b.open();
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
