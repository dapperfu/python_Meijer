package com.google.android.gms.internal.pal;

import Td.C5235m;
import android.content.Context;
import android.os.Handler;
import bd.C6222a;
import bd.C6224c;
import bd.InterfaceC6223b;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class B2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6223b f82486e;

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10870r6 a() {
        InterfaceC6223b interfaceC6223b = this.f82486e;
        if (interfaceC6223b == null) {
            return AbstractC10870r6.e();
        }
        try {
            return AbstractC10870r6.f((C6224c) C5235m.b(interfaceC6223b.g(), zzat.zzd.zzd(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException e10) {
            FS.log_e("NonceGenerator", "Failed to get the App Set ID.", e10);
            return AbstractC10870r6.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, C10658e2.b(2L));
        InterfaceC6223b interfaceC6223bG = g(context);
        this.f82486e = interfaceC6223bG;
    }

    private static InterfaceC6223b g(Context context) {
        try {
            return C6222a.a(context);
        } catch (NoClassDefFoundError | NoSuchMethodError e10) {
            FS.log_e("NonceGenerator", "Failed to contact the App Set SDK.", e10);
            return null;
        }
    }
}
