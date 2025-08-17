package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC8445jf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f75479g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f75473a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f75474b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f75475c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f75476d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f75477e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f75478f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f75480h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    private boolean f75481i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f75482j = false;

    public final boolean e() {
        return this.f75482j;
    }

    final boolean f() {
        return this.f75481i;
    }

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f75480h = new JSONObject((String) C8873nf.a(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.ff
                @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object a(final AbstractC7593bf abstractC7593bf) {
        if (!this.f75474b.block(5000L)) {
            synchronized (this.f75473a) {
                try {
                    if (!this.f75476d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f75475c || this.f75477e == null || this.f75482j) {
            synchronized (this.f75473a) {
                if (this.f75475c && this.f75477e != null && !this.f75482j) {
                }
                return abstractC7593bf.k();
            }
        }
        if (abstractC7593bf.e() != 2) {
            return (abstractC7593bf.e() == 1 && this.f75480h.has(abstractC7593bf.l())) ? abstractC7593bf.a(this.f75480h) : C8873nf.a(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.gf
                @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
                public final Object zza() {
                    return this.f74364a.c(abstractC7593bf);
                }
            });
        }
        Bundle bundle = this.f75478f;
        return bundle == null ? abstractC7593bf.k() : abstractC7593bf.b(bundle);
    }

    public final Object b(AbstractC7593bf abstractC7593bf) {
        return (this.f75475c || this.f75476d) ? a(abstractC7593bf) : abstractC7593bf.k();
    }

    final /* synthetic */ Object c(AbstractC7593bf abstractC7593bf) {
        return abstractC7593bf.c(this.f75477e);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC8445jf.d(android.content.Context):void");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
