package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* renamed from: com.google.android.gms.internal.ads.Pb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC7181Pb0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private C7215Qb0 f70216a;

    /* renamed from: b, reason: collision with root package name */
    protected final C6910Hb0 f70217b;

    public final void b(C7215Qb0 c7215Qb0) {
        this.f70216a = c7215Qb0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C7215Qb0 c7215Qb0 = this.f70216a;
        if (c7215Qb0 != null) {
            c7215Qb0.a(this);
        }
    }

    public AbstractAsyncTaskC7181Pb0(C6910Hb0 c6910Hb0) {
        this.f70217b = c6910Hb0;
    }
}
