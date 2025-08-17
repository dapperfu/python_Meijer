package Vc;

import Pc.D0;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.InterfaceC9482tG;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class P implements InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private final C f37177a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37178b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37179c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(final N n10) {
        if (n10 == null || this.f37178b != 2 || TextUtils.isEmpty(this.f37179c)) {
            return;
        }
        D0.M(new Runnable() { // from class: Vc.O
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.f37175a.b(n10);
            }
        });
    }

    final /* synthetic */ void b(N n10) throws JSONException {
        this.f37177a.d(this.f37179c, n10);
    }

    public P(C c10, int i10, String str) {
        this.f37177a = c10;
        this.f37178b = i10;
        this.f37179c = str;
    }
}
