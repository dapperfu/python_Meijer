package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9242pu {

    /* renamed from: a, reason: collision with root package name */
    private Sc.a f78492a;

    /* renamed from: b, reason: collision with root package name */
    private Context f78493b;

    /* renamed from: c, reason: collision with root package name */
    private long f78494c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f78495d;

    public final C9242pu d(long j10) {
        this.f78494c = j10;
        return this;
    }

    public final C9242pu e(Context context) {
        this.f78495d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f78493b = context;
        return this;
    }

    public final C9242pu f(Sc.a aVar) {
        this.f78492a = aVar;
        return this;
    }
}
