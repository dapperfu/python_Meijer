package qv;

import kotlin.Metadata;
import vv.C17656l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqv/L0;", "Lqv/K;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "U0", "(ILjava/lang/String;)Lqv/K;", "X0", "W0", "()Lqv/L0;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class L0 extends AbstractC16618K {
    public abstract L0 W0();

    @Override // qv.AbstractC16618K
    public AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        return C17656l.b(this, name);
    }

    protected final String X0() {
        L0 l0W0;
        L0 l0C = C16639f0.c();
        if (this == l0C) {
            return "Dispatchers.Main";
        }
        try {
            l0W0 = l0C.W0();
        } catch (UnsupportedOperationException unused) {
            l0W0 = null;
        }
        if (this != l0W0) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // qv.AbstractC16618K
    public String toString() {
        String strX0 = X0();
        if (strX0 == null) {
            return C16626T.a(this) + '@' + C16626T.b(this);
        }
        return strX0;
    }
}
