package com.google.firebase.iid;

import Td.C5235m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.firebase.messaging.C11343n;
import com.google.firebase.messaging.H;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fd.AbstractC13875b;
import fd.C13874a;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC13875b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // fd.AbstractC13875b
    protected int b(Context context, C13874a c13874a) {
        try {
            return ((Integer) C5235m.a(new C11343n(context).g(c13874a.B()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            FS.log_e("FirebaseMessaging", "Failed to send message to service.", e10);
            return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        }
    }

    @Override // fd.AbstractC13875b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (H.D(intentF)) {
            H.v(intentF);
        }
    }
}
