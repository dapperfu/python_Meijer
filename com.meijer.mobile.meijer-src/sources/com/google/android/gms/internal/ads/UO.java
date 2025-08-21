package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class UO {

    /* renamed from: a, reason: collision with root package name */
    private final EO f71446a;

    /* renamed from: b, reason: collision with root package name */
    private final C8334hM f71447b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71448c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f71449d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f71450e;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        C8227gM c8227gMA;
        C8227gM c8227gMA2;
        C7130Nm c7130Nm;
        synchronized (this.f71448c) {
            try {
                if (this.f71450e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6958Ij c6958Ij = (C6958Ij) it.next();
                    String string = (!((Boolean) Oc.A.c().a(C8784lf.f77239k9)).booleanValue() || (c8227gMA2 = this.f71447b.a(c6958Ij.f68512a)) == null || (c7130Nm = c8227gMA2.f75143c) == null) ? "" : c7130Nm.toString();
                    String str = string;
                    boolean z10 = ((Boolean) Oc.A.c().a(C8784lf.f77253l9)).booleanValue() && (c8227gMA = this.f71447b.a(c6958Ij.f68512a)) != null && c8227gMA.f75144d;
                    List list2 = this.f71449d;
                    String str2 = c6958Ij.f68512a;
                    list2.add(new TO(str2, str, this.f71447b.b(str2), c6958Ij.f68513b ? 1 : 0, c6958Ij.f68515d, c6958Ij.f68514c, z10));
                }
                this.f71450e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f71448c) {
            try {
                if (!this.f71450e) {
                    if (!this.f71446a.t()) {
                        c();
                        return jSONArray;
                    }
                    d(this.f71446a.g());
                }
                Iterator it = this.f71449d.iterator();
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
        this.f71446a.s(new SO(this));
    }

    UO(EO eo2, C8334hM c8334hM) {
        this.f71446a = eo2;
        this.f71447b = c8334hM;
    }
}
