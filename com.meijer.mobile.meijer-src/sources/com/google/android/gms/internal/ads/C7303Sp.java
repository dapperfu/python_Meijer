package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Sp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7303Sp implements InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71004a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f71005b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71006c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f71007d;

    public final String a() {
        return this.f71006c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        i(c9845vb.f79930j);
    }

    public C7303Sp(Context context, String str) {
        this.f71004a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f71006c = str;
        this.f71007d = false;
        this.f71005b = new Object();
    }

    public final void i(boolean z10) {
        if (!Nc.v.r().p(this.f71004a)) {
            return;
        }
        synchronized (this.f71005b) {
            try {
                if (this.f71007d == z10) {
                    return;
                }
                this.f71007d = z10;
                if (TextUtils.isEmpty(this.f71006c)) {
                    return;
                }
                if (this.f71007d) {
                    Nc.v.r().f(this.f71004a, this.f71006c);
                } else {
                    Nc.v.r().g(this.f71004a, this.f71006c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
