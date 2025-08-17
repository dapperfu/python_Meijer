package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AsyncTaskC7158Sb0 extends AbstractAsyncTaskC7022Ob0 {
    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f69122d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7056Pb0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }

    public AsyncTaskC7158Sb0(C6785Hb0 c6785Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6785Hb0, hashSet, jSONObject, j10);
    }

    private final void c(String str) {
        C7692cb0 c7692cb0A = C7692cb0.a();
        if (c7692cb0A != null) {
            for (C6885Ka0 c6885Ka0 : c7692cb0A.c()) {
                if (this.f69121c.contains(c6885Ka0.h())) {
                    c6885Ka0.g().d(str, this.f69123e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC7056Pb0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }
}
