package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import n4.AbstractC15776a;

/* renamed from: com.google.android.gms.internal.ads.eT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7895eT {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC15776a f73869a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f73870b;

    C7895eT(Context context) {
        this.f73870b = context;
    }

    public final com.google.common.util.concurrent.q a() {
        try {
            AbstractC15776a abstractC15776aA = AbstractC15776a.a(this.f73870b);
            this.f73869a = abstractC15776aA;
            return abstractC15776aA == null ? Mj0.g(new IllegalStateException("MeasurementManagerFutures is null")) : abstractC15776aA.b();
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }

    public final com.google.common.util.concurrent.q b(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC15776a abstractC15776a = this.f73869a;
            Objects.requireNonNull(abstractC15776a);
            return abstractC15776a.c(uri, inputEvent);
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }
}
