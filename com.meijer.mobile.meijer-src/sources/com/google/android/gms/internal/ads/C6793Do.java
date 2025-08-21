package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6793Do {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f67123a = new WeakHashMap();

    public final Future b(Context context) {
        return C7033Kq.f69014a.k0(new CallableC6725Bo(this, context));
    }
}
