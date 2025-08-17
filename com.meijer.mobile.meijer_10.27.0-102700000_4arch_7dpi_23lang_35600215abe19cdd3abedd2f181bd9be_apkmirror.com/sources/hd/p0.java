package hd;

import Td.C5233k;
import Z.C5503a;
import com.google.android.gms.common.api.AvailabilityException;
import gd.C14243b;
import java.util.Set;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private final C5503a f134689a;

    /* renamed from: b, reason: collision with root package name */
    private final C5503a f134690b;

    /* renamed from: c, reason: collision with root package name */
    private final C5233k f134691c;

    /* renamed from: d, reason: collision with root package name */
    private int f134692d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f134693e;

    public final Set a() {
        return this.f134689a.keySet();
    }

    public final void b(C14401b c14401b, C14243b c14243b, String str) {
        this.f134689a.put(c14401b, c14243b);
        this.f134690b.put(c14401b, str);
        this.f134692d--;
        if (!c14243b.K0()) {
            this.f134693e = true;
        }
        if (this.f134692d == 0) {
            if (!this.f134693e) {
                this.f134691c.c(this.f134690b);
            } else {
                this.f134691c.b(new AvailabilityException(this.f134689a));
            }
        }
    }
}
