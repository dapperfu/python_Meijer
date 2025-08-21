package Xc;

import Rc.D0;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.InterfaceC9607tG;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class P implements InterfaceC9607tG {

    /* renamed from: a, reason: collision with root package name */
    private final C f41889a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41890b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41891c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void a(final N n10) {
        if (n10 == null || this.f41890b != 2 || TextUtils.isEmpty(this.f41891c)) {
            return;
        }
        D0.M(new Runnable() { // from class: Xc.O
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.f41887a.b(n10);
            }
        });
    }

    final /* synthetic */ void b(N n10) throws JSONException {
        this.f41889a.d(this.f41891c, n10);
    }

    public P(C c10, int i10, String str) {
        this.f41889a = c10;
        this.f41890b = i10;
        this.f41891c = str;
    }
}
