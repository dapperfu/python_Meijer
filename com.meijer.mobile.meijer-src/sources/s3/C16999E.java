package s3;

import a3.J;
import d3.C13599a;
import h3.K;
import java.util.Objects;

/* renamed from: s3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16999E {

    /* renamed from: a, reason: collision with root package name */
    public final int f159753a;

    /* renamed from: b, reason: collision with root package name */
    public final K[] f159754b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f159755c;

    /* renamed from: d, reason: collision with root package name */
    public final J f159756d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f159757e;

    public boolean a(C16999E c16999e) {
        if (c16999e == null || c16999e.f159755c.length != this.f159755c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f159755c.length; i10++) {
            if (!b(c16999e, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(C16999E c16999e, int i10) {
        return c16999e != null && Objects.equals(this.f159754b[i10], c16999e.f159754b[i10]) && Objects.equals(this.f159755c[i10], c16999e.f159755c[i10]);
    }

    public boolean c(int i10) {
        return this.f159754b[i10] != null;
    }

    public C16999E(K[] kArr, y[] yVarArr, J j10, Object obj) {
        boolean z10;
        if (kArr.length == yVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        this.f159754b = kArr;
        this.f159755c = (y[]) yVarArr.clone();
        this.f159756d = j10;
        this.f159757e = obj;
        this.f159753a = kArr.length;
    }
}
