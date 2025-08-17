package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Sp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7178Sp implements InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70164a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f70165b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70166c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f70167d;

    public final String a() {
        return this.f70166c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        i(c9720vb.f79090j);
    }

    public C7178Sp(Context context, String str) {
        this.f70164a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f70166c = str;
        this.f70167d = false;
        this.f70165b = new Object();
    }

    public final void i(boolean z10) {
        if (!Lc.v.r().p(this.f70164a)) {
            return;
        }
        synchronized (this.f70165b) {
            try {
                if (this.f70167d == z10) {
                    return;
                }
                this.f70167d = z10;
                if (TextUtils.isEmpty(this.f70166c)) {
                    return;
                }
                if (this.f70167d) {
                    Lc.v.r().f(this.f70164a, this.f70166c);
                } else {
                    Lc.v.r().g(this.f70164a, this.f70166c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
