package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ub0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AsyncTaskC7226Ub0 extends AbstractAsyncTaskC7022Ob0 {
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C10149zb0.g(this.f69122d, this.f69377b.a())) {
            return null;
        }
        this.f69377b.e(this.f69122d);
        return this.f69122d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7056Pb0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public AsyncTaskC7226Ub0(C6785Hb0 c6785Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6785Hb0, hashSet, jSONObject, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7056Pb0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C7692cb0 c7692cb0A;
        if (!TextUtils.isEmpty(str) && (c7692cb0A = C7692cb0.a()) != null) {
            for (C6885Ka0 c6885Ka0 : c7692cb0A.c()) {
                if (this.f69121c.contains(c6885Ka0.h())) {
                    c6885Ka0.g().h(str, this.f69123e);
                }
            }
        }
        super.onPostExecute(str);
    }
}
