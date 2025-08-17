package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class UO {

    /* renamed from: a, reason: collision with root package name */
    private final EO f70606a;

    /* renamed from: b, reason: collision with root package name */
    private final C8209hM f70607b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f70608c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f70609d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f70610e;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        C8102gM c8102gMA;
        C8102gM c8102gMA2;
        C7005Nm c7005Nm;
        synchronized (this.f70608c) {
            try {
                if (this.f70610e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6833Ij c6833Ij = (C6833Ij) it.next();
                    String string = (!((Boolean) Mc.A.c().a(C8659lf.f76399k9)).booleanValue() || (c8102gMA2 = this.f70607b.a(c6833Ij.f67672a)) == null || (c7005Nm = c8102gMA2.f74303c) == null) ? "" : c7005Nm.toString();
                    String str = string;
                    boolean z10 = ((Boolean) Mc.A.c().a(C8659lf.f76413l9)).booleanValue() && (c8102gMA = this.f70607b.a(c6833Ij.f67672a)) != null && c8102gMA.f74304d;
                    List list2 = this.f70609d;
                    String str2 = c6833Ij.f67672a;
                    list2.add(new TO(str2, str, this.f70607b.b(str2), c6833Ij.f67673b ? 1 : 0, c6833Ij.f67675d, c6833Ij.f67674c, z10));
                }
                this.f70610e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f70608c) {
            try {
                if (!this.f70610e) {
                    if (!this.f70606a.t()) {
                        c();
                        return jSONArray;
                    }
                    d(this.f70606a.g());
                }
                Iterator it = this.f70609d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((TO) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        this.f70606a.s(new SO(this));
    }

    UO(EO eo2, C8209hM c8209hM) {
        this.f70606a = eo2;
        this.f70607b = c8209hM;
    }
}
