package com.google.firebase.iid;

import Vd.C5519m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.firebase.messaging.C11468n;
import com.google.firebase.messaging.J;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hd.AbstractC14505b;
import hd.C14504a;
import java.util.concurrent.ExecutionException;

/* loaded from: classes8.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC14505b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // hd.AbstractC14505b
    protected int b(Context context, C14504a c14504a) {
        try {
            return ((Integer) C5519m.a(new C11468n(context).g(c14504a.B()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            FS.log_e("FirebaseMessaging", "Failed to send message to service.", e10);
            return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        }
    }

    @Override // hd.AbstractC14505b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (J.D(intentF)) {
            J.v(intentF);
        }
    }
}
