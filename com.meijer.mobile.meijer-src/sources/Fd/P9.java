package Fd;

import Vd.InterfaceC5512f;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6659p;
import com.google.android.gms.common.internal.C6664v;
import com.google.android.gms.common.internal.C6665w;
import com.google.android.gms.common.internal.C6667y;
import com.google.android.gms.common.internal.InterfaceC6666x;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6666x f9516a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f9517b = new AtomicLong(-1);

    public static P9 a(Context context) {
        return new P9(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j10, Exception exc) {
        this.f9517b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.f9517b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f9517b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f9516a.c(new C6664v(0, Arrays.asList(new C6659p(i10, i11, 0, j10, j11, null, null, 0, -1)))).e(new InterfaceC5512f() { // from class: Fd.O9
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                this.f9500a.b(jElapsedRealtime, exc);
            }
        });
    }

    P9(Context context, String str) {
        this.f9516a = C6665w.b(context, C6667y.c().b("mlkit:vision").a());
    }
}
