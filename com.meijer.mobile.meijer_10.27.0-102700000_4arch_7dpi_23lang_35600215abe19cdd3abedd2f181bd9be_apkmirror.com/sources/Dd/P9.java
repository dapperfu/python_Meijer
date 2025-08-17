package Dd;

import Td.InterfaceC5228f;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6534p;
import com.google.android.gms.common.internal.C6539v;
import com.google.android.gms.common.internal.C6540w;
import com.google.android.gms.common.internal.C6542y;
import com.google.android.gms.common.internal.InterfaceC6541x;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6541x f5483a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f5484b = new AtomicLong(-1);

    public static P9 a(Context context) {
        return new P9(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j10, Exception exc) {
        this.f5484b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.f5484b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f5484b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f5483a.b(new C6539v(0, Arrays.asList(new C6534p(i10, i11, 0, j10, j11, null, null, 0, -1)))).e(new InterfaceC5228f() { // from class: Dd.O9
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                this.f5467a.b(jElapsedRealtime, exc);
            }
        });
    }

    P9(Context context, String str) {
        this.f5483a = C6540w.b(context, C6542y.c().b("mlkit:vision").a());
    }
}
