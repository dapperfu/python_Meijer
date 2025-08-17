package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class K9 extends J9 {
    private K9(Context context, I9 i92) {
        super(context, i92);
    }

    public static K9 t(Context context, I9 i92) {
        J9.p(context, i92);
        return new K9(context, i92);
    }

    @Override // com.google.android.gms.internal.ads.J9
    protected final List n(C8863na c8863na, Context context, C8611l8 c8611l8, X7 x72) {
        if (c8863na.k() != null && this.f67814v.f67562a) {
            int iA = c8863na.a();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.n(c8863na, context, c8611l8, null));
            arrayList.add(new C6714Fa(c8863na, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c8611l8, iA, 24));
            return arrayList;
        }
        return super.n(c8863na, context, c8611l8, null);
    }
}
