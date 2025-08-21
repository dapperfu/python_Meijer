package com.google.android.gms.internal.pal;

import Vd.C5519m;
import android.content.Context;
import android.os.Handler;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzat;
import dd.C13653a;
import dd.C13655c;
import dd.InterfaceC13654b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class B2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC13654b f83326e;

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10995r6 a() {
        InterfaceC13654b interfaceC13654b = this.f83326e;
        if (interfaceC13654b == null) {
            return AbstractC10995r6.e();
        }
        try {
            return AbstractC10995r6.f((C13655c) C5519m.b(interfaceC13654b.h(), zzat.zzd.zzd(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException e10) {
            FS.log_e("NonceGenerator", "Failed to get the App Set ID.", e10);
            return AbstractC10995r6.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, C10783e2.b(2L));
        InterfaceC13654b interfaceC13654bG = g(context);
        this.f83326e = interfaceC13654bG;
    }

    private static InterfaceC13654b g(Context context) {
        try {
            return C13653a.a(context);
        } catch (NoClassDefFoundError | NoSuchMethodError e10) {
            FS.log_e("NonceGenerator", "Failed to contact the App Set SDK.", e10);
            return null;
        }
    }
}
