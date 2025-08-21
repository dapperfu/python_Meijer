package mv;

import kotlin.Metadata;
import rv.C16975l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmv/L0;", "Lmv/K;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "S0", "(ILjava/lang/String;)Lmv/K;", "W0", "U0", "()Lmv/L0;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class L0 extends AbstractC15779K {
    public abstract L0 U0();

    @Override // mv.AbstractC15779K
    public AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        return C16975l.b(this, name);
    }

    protected final String W0() {
        L0 l0U0;
        L0 l0C = C15800f0.c();
        if (this == l0C) {
            return "Dispatchers.Main";
        }
        try {
            l0U0 = l0C.U0();
        } catch (UnsupportedOperationException unused) {
            l0U0 = null;
        }
        if (this != l0U0) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // mv.AbstractC15779K
    public String toString() {
        String strW0 = W0();
        if (strW0 == null) {
            return C15787T.a(this) + '@' + C15787T.b(this);
        }
        return strW0;
    }
}
