package we;

import Td.C5233k;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes4.dex */
final class f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f166043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, Handler handler, C5233k c5233k) {
        super(handler);
        this.f166043a = c5233k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f166043a.e(null);
    }
}
