package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import n4.AbstractC15903a;

/* renamed from: com.google.android.gms.internal.ads.eT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8020eT {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC15903a f74709a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74710b;

    C8020eT(Context context) {
        this.f74710b = context;
    }

    public final com.google.common.util.concurrent.q a() {
        try {
            AbstractC15903a abstractC15903aA = AbstractC15903a.a(this.f74710b);
            this.f74709a = abstractC15903aA;
            return abstractC15903aA == null ? Mj0.g(new IllegalStateException("MeasurementManagerFutures is null")) : abstractC15903aA.b();
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }

    public final com.google.common.util.concurrent.q b(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC15903a abstractC15903a = this.f74709a;
            Objects.requireNonNull(abstractC15903a);
            return abstractC15903a.c(uri, inputEvent);
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }
}
