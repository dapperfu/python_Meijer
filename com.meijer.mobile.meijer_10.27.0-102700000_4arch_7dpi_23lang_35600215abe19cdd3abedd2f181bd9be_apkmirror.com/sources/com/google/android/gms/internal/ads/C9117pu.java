package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9117pu {

    /* renamed from: a, reason: collision with root package name */
    private Qc.a f77652a;

    /* renamed from: b, reason: collision with root package name */
    private Context f77653b;

    /* renamed from: c, reason: collision with root package name */
    private long f77654c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f77655d;

    public final C9117pu d(long j10) {
        this.f77654c = j10;
        return this;
    }

    public final C9117pu e(Context context) {
        this.f77655d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f77653b = context;
        return this;
    }

    public final C9117pu f(Qc.a aVar) {
        this.f77652a = aVar;
        return this;
    }
}
