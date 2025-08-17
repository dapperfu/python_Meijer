package ze;

import Td.AbstractC5232j;
import Td.C5233k;
import android.content.Context;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.android.gms.internal.atv_ads_framework.B1;
import com.google.android.gms.internal.atv_ads_framework.B2;
import com.google.android.gms.internal.atv_ads_framework.C10202b;
import com.google.android.gms.internal.atv_ads_framework.C10212e;
import com.google.android.gms.internal.atv_ads_framework.z2;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class j implements PlatformSignalCollector {
    @Override // com.google.ads.interactivemedia.pal.PlatformSignalCollector
    public AbstractC5232j<Map<String, String>> collectSignals(final Context context, ExecutorService executorService) {
        final C5233k c5233k = new C5233k();
        context.getClass();
        executorService.getClass();
        executorService.execute(new Runnable() { // from class: ze.q
            @Override // java.lang.Runnable
            public final void run() {
                C5233k c5233k2 = c5233k;
                Context context2 = context;
                try {
                    c5233k2.c(C10212e.c(context2));
                } catch (RuntimeException e10) {
                    B1 b1A = B1.a(context2);
                    B2 b2Q = C10202b.q();
                    b2Q.i(z2.SIGNAL_COLLECTION_ERROR_RUNTIME_EXCEPTION);
                    b1A.c((C10202b) b2Q.c());
                    c5233k2.b(e10);
                }
            }
        });
        return c5233k.a();
    }
}
