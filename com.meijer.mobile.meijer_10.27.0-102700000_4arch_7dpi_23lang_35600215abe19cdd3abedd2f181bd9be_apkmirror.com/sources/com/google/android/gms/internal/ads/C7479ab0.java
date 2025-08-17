package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ab0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7479ab0 implements InterfaceC7799db0 {

    /* renamed from: e, reason: collision with root package name */
    private static final C7479ab0 f72448e = new C7479ab0(new C7905eb0());

    /* renamed from: a, reason: collision with root package name */
    private Date f72449a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f72450b;

    /* renamed from: c, reason: collision with root package name */
    private final C7905eb0 f72451c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f72452d;

    private C7479ab0(C7905eb0 c7905eb0) {
        this.f72451c = c7905eb0;
    }

    public static C7479ab0 a() {
        return f72448e;
    }

    public final Date b() {
        Date date = this.f72449a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c(Context context) {
        if (this.f72450b) {
            return;
        }
        this.f72451c.d(context);
        this.f72451c.e(this);
        this.f72451c.f();
        this.f72452d = this.f72451c.f73908b;
        this.f72450b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7799db0
    public final void zzc(boolean z10) {
        if (!this.f72452d && z10) {
            Date date = new Date();
            Date date2 = this.f72449a;
            if (date2 == null || date.after(date2)) {
                this.f72449a = date;
                if (this.f72450b) {
                    Iterator it = C7692cb0.a().b().iterator();
                    while (it.hasNext()) {
                        ((C6885Ka0) it.next()).g().g(b());
                    }
                }
            }
        }
        this.f72452d = z10;
    }
}
