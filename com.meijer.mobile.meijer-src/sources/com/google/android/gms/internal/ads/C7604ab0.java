package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ab0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7604ab0 implements InterfaceC7924db0 {

    /* renamed from: e, reason: collision with root package name */
    private static final C7604ab0 f73288e = new C7604ab0(new C8030eb0());

    /* renamed from: a, reason: collision with root package name */
    private Date f73289a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f73290b;

    /* renamed from: c, reason: collision with root package name */
    private final C8030eb0 f73291c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f73292d;

    private C7604ab0(C8030eb0 c8030eb0) {
        this.f73291c = c8030eb0;
    }

    public static C7604ab0 a() {
        return f73288e;
    }

    public final Date b() {
        Date date = this.f73289a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c(Context context) {
        if (this.f73290b) {
            return;
        }
        this.f73291c.d(context);
        this.f73291c.e(this);
        this.f73291c.f();
        this.f73292d = this.f73291c.f74748b;
        this.f73290b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7924db0
    public final void zzc(boolean z10) {
        if (!this.f73292d && z10) {
            Date date = new Date();
            Date date2 = this.f73289a;
            if (date2 == null || date.after(date2)) {
                this.f73289a = date;
                if (this.f73290b) {
                    Iterator it = C7817cb0.a().b().iterator();
                    while (it.hasNext()) {
                        ((C7010Ka0) it.next()).g().g(b());
                    }
                }
            }
        }
        this.f73292d = z10;
    }
}
