package ye;

import Vd.C5517k;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes4.dex */
final class f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f171365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, Handler handler, C5517k c5517k) {
        super(handler);
        this.f171365a = c5517k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f171365a.e(null);
    }
}
