package Be;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.content.Context;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.android.gms.internal.atv_ads_framework.B1;
import com.google.android.gms.internal.atv_ads_framework.B2;
import com.google.android.gms.internal.atv_ads_framework.C10327b;
import com.google.android.gms.internal.atv_ads_framework.C10337e;
import com.google.android.gms.internal.atv_ads_framework.z2;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class j implements PlatformSignalCollector {
    @Override // com.google.ads.interactivemedia.pal.PlatformSignalCollector
    public AbstractC5516j<Map<String, String>> collectSignals(final Context context, ExecutorService executorService) {
        final C5517k c5517k = new C5517k();
        context.getClass();
        executorService.getClass();
        executorService.execute(new Runnable() { // from class: Be.q
            @Override // java.lang.Runnable
            public final void run() {
                C5517k c5517k2 = c5517k;
                Context context2 = context;
                try {
                    c5517k2.c(C10337e.c(context2));
                } catch (RuntimeException e10) {
                    B1 b1A = B1.a(context2);
                    B2 b2Q = C10327b.q();
                    b2Q.i(z2.SIGNAL_COLLECTION_ERROR_RUNTIME_EXCEPTION);
                    b1A.c((C10327b) b2Q.c());
                    c5517k2.b(e10);
                }
            }
        });
        return c5517k.a();
    }
}
