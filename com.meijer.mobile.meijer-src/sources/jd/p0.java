package jd;

import Vd.C5517k;
import Z.C5603a;
import com.google.android.gms.common.api.AvailabilityException;
import id.C14719b;
import java.util.Set;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private final C5603a f140378a;

    /* renamed from: b, reason: collision with root package name */
    private final C5603a f140379b;

    /* renamed from: c, reason: collision with root package name */
    private final C5517k f140380c;

    /* renamed from: d, reason: collision with root package name */
    private int f140381d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f140382e;

    public final Set a() {
        return this.f140378a.keySet();
    }

    public final void b(C14979b c14979b, C14719b c14719b, String str) {
        this.f140378a.put(c14979b, c14719b);
        this.f140379b.put(c14979b, str);
        this.f140381d--;
        if (!c14719b.I0()) {
            this.f140382e = true;
        }
        if (this.f140381d == 0) {
            if (!this.f140382e) {
                this.f140380c.c(this.f140379b);
            } else {
                this.f140380c.b(new AvailabilityException(this.f140378a));
            }
        }
    }
}
