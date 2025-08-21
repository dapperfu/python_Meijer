package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AsyncTaskC7283Sb0 extends AbstractAsyncTaskC7147Ob0 {
    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f69962d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7181Pb0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }

    public AsyncTaskC7283Sb0(C6910Hb0 c6910Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6910Hb0, hashSet, jSONObject, j10);
    }

    private final void c(String str) {
        C7817cb0 c7817cb0A = C7817cb0.a();
        if (c7817cb0A != null) {
            for (C7010Ka0 c7010Ka0 : c7817cb0A.c()) {
                if (this.f69961c.contains(c7010Ka0.h())) {
                    c7010Ka0.g().d(str, this.f69963e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7181Pb0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }
}
