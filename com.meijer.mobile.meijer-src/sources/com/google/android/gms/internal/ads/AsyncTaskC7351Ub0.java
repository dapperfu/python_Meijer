package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ub0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AsyncTaskC7351Ub0 extends AbstractAsyncTaskC7147Ob0 {
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C10274zb0.g(this.f69962d, this.f70217b.a())) {
            return null;
        }
        this.f70217b.e(this.f69962d);
        return this.f69962d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7181Pb0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public AsyncTaskC7351Ub0(C6910Hb0 c6910Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6910Hb0, hashSet, jSONObject, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7181Pb0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C7817cb0 c7817cb0A;
        if (!TextUtils.isEmpty(str) && (c7817cb0A = C7817cb0.a()) != null) {
            for (C7010Ka0 c7010Ka0 : c7817cb0A.c()) {
                if (this.f69961c.contains(c7010Ka0.h())) {
                    c7010Ka0.g().h(str, this.f69963e);
                }
            }
        }
        super.onPostExecute(str);
    }
}
