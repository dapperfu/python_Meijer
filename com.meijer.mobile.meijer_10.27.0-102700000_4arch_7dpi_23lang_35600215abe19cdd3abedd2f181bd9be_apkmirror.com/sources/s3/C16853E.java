package s3;

import a3.J;
import d3.C13466a;
import h3.K;
import java.util.Objects;

/* renamed from: s3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16853E {

    /* renamed from: a, reason: collision with root package name */
    public final int f159890a;

    /* renamed from: b, reason: collision with root package name */
    public final K[] f159891b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f159892c;

    /* renamed from: d, reason: collision with root package name */
    public final J f159893d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f159894e;

    public boolean a(C16853E c16853e) {
        if (c16853e == null || c16853e.f159892c.length != this.f159892c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f159892c.length; i10++) {
            if (!b(c16853e, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(C16853E c16853e, int i10) {
        return c16853e != null && Objects.equals(this.f159891b[i10], c16853e.f159891b[i10]) && Objects.equals(this.f159892c[i10], c16853e.f159892c[i10]);
    }

    public boolean c(int i10) {
        return this.f159891b[i10] != null;
    }

    public C16853E(K[] kArr, y[] yVarArr, J j10, Object obj) {
        boolean z10;
        if (kArr.length == yVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        this.f159891b = kArr;
        this.f159892c = (y[]) yVarArr.clone();
        this.f159893d = j10;
        this.f159894e = obj;
        this.f159890a = kArr.length;
    }
}
