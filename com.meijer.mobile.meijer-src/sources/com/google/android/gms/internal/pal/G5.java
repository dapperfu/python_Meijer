package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6648e;

/* loaded from: classes6.dex */
final class G5 extends a.AbstractC1266a {
    @Override // com.google.android.gms.common.api.a.AbstractC1266a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C6648e c6648e, Object obj, e.a aVar, e.b bVar) {
        return new J5(context, looper, c6648e, aVar, bVar);
    }

    G5() {
    }
}
