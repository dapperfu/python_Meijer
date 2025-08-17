package w1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lw1/b;", "Lw1/f;", "<init>", "()V", "", "offset", "f", "(I)I", "e", "b", "d", "a", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17742b implements InterfaceC17746f {
    public abstract int e(int offset);

    public abstract int f(int offset);

    @Override // w1.InterfaceC17746f
    public int a(int offset) {
        int iE = e(offset);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // w1.InterfaceC17746f
    public int b(int offset) {
        return f(offset);
    }

    @Override // w1.InterfaceC17746f
    public int c(int offset) {
        return e(offset);
    }

    @Override // w1.InterfaceC17746f
    public int d(int offset) {
        int iF = f(offset);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }
}
