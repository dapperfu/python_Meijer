package fv;

import Pu.g;
import Yu.H0;
import Yu.I0;
import Yu.P0;
import gv.C14313a;
import io.reactivex.l;

/* renamed from: fv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC14143a<T> extends l<T> {
    public abstract void c(g<? super Nu.b> gVar);

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC14143a<T> d() {
        return this instanceof I0 ? C14313a.k(new H0(((I0) this).a())) : this;
    }

    public l<T> e() {
        return C14313a.o(new P0(d()));
    }
}
