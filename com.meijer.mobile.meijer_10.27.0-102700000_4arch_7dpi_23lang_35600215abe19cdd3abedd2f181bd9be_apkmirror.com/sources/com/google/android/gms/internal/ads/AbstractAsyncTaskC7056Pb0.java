package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* renamed from: com.google.android.gms.internal.ads.Pb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC7056Pb0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private C7090Qb0 f69376a;

    /* renamed from: b, reason: collision with root package name */
    protected final C6785Hb0 f69377b;

    public final void b(C7090Qb0 c7090Qb0) {
        this.f69376a = c7090Qb0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C7090Qb0 c7090Qb0 = this.f69376a;
        if (c7090Qb0 != null) {
            c7090Qb0.a(this);
        }
    }

    public AbstractAsyncTaskC7056Pb0(C6785Hb0 c6785Hb0) {
        this.f69377b = c6785Hb0;
    }
}
