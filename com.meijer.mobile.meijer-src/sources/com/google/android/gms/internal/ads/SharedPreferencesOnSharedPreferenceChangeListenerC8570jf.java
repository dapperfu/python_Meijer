package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC8570jf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f76319g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f76313a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f76314b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f76315c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f76316d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f76317e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f76318f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f76320h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    private boolean f76321i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f76322j = false;

    public final boolean e() {
        return this.f76322j;
    }

    final boolean f() {
        return this.f76321i;
    }

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f76320h = new JSONObject((String) C8998nf.a(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.ff
                @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object a(final AbstractC7718bf abstractC7718bf) {
        if (!this.f76314b.block(5000L)) {
            synchronized (this.f76313a) {
                try {
                    if (!this.f76316d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f76315c || this.f76317e == null || this.f76322j) {
            synchronized (this.f76313a) {
                if (this.f76315c && this.f76317e != null && !this.f76322j) {
                }
                return abstractC7718bf.k();
            }
        }
        if (abstractC7718bf.e() != 2) {
            return (abstractC7718bf.e() == 1 && this.f76320h.has(abstractC7718bf.l())) ? abstractC7718bf.a(this.f76320h) : C8998nf.a(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.gf
                @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
                public final Object zza() {
                    return this.f75204a.c(abstractC7718bf);
                }
            });
        }
        Bundle bundle = this.f76318f;
        return bundle == null ? abstractC7718bf.k() : abstractC7718bf.b(bundle);
    }

    public final Object b(AbstractC7718bf abstractC7718bf) {
        return (this.f76315c || this.f76316d) ? a(abstractC7718bf) : abstractC7718bf.k();
    }

    final /* synthetic */ Object c(AbstractC7718bf abstractC7718bf) {
        return abstractC7718bf.c(this.f76317e);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:74:0x014f, B:75:0x0156, B:77:0x0158, B:78:0x015f, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC8570jf.d(android.content.Context):void");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
