package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c<C, T, A> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private List<C> f54091a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f54092b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long[] f54093c;

    /* renamed from: d, reason: collision with root package name */
    private int f54094d;

    /* renamed from: e, reason: collision with root package name */
    private final a<C, T, A> f54095e;

    public static abstract class a<C, T, A> {
        public abstract void a(C c10, T t10, int i10, A a10);
    }

    public synchronized void a(C c10) {
        try {
            if (c10 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f54091a.lastIndexOf(c10);
            if (iLastIndexOf < 0 || c(iLastIndexOf)) {
                this.f54091a.add(c10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized c<C, T, A> clone() {
        c<C, T, A> cVar;
        CloneNotSupportedException e10;
        try {
            cVar = (c) super.clone();
        } catch (CloneNotSupportedException e11) {
            cVar = null;
            e10 = e11;
        }
        try {
            cVar.f54092b = 0L;
            cVar.f54093c = null;
            cVar.f54094d = 0;
            cVar.f54091a = new ArrayList();
            int size = this.f54091a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!c(i10)) {
                    cVar.f54091a.add(this.f54091a.get(i10));
                }
            }
        } catch (CloneNotSupportedException e12) {
            e10 = e12;
            e10.printStackTrace();
            return cVar;
        }
        return cVar;
    }

    public synchronized void d(T t10, int i10, A a10) {
        try {
            this.f54094d++;
            g(t10, i10, a10);
            int i11 = this.f54094d - 1;
            this.f54094d = i11;
            if (i11 == 0) {
                long[] jArr = this.f54093c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f54093c[length];
                        if (j10 != 0) {
                            k((length + 1) * 64, j10);
                            this.f54093c[length] = 0;
                        }
                    }
                }
                long j11 = this.f54092b;
                if (j11 != 0) {
                    k(0, j11);
                    this.f54092b = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j(C c10) {
        try {
            if (this.f54094d == 0) {
                this.f54091a.remove(c10);
            } else {
                int iLastIndexOf = this.f54091a.lastIndexOf(c10);
                if (iLastIndexOf >= 0) {
                    l(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean c(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f54092b) != 0;
        }
        long[] jArr = this.f54093c;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    private void e(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f54095e.a(this.f54091a.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    private void f(T t10, int i10, A a10) {
        e(t10, i10, a10, 0, Math.min(64, this.f54091a.size()), this.f54092b);
    }

    private void g(T t10, int i10, A a10) {
        int size = this.f54091a.size();
        int length = this.f54093c == null ? -1 : r0.length - 1;
        i(t10, i10, a10, length);
        e(t10, i10, a10, (length + 2) * 64, size, 0L);
    }

    private void i(T t10, int i10, A a10, int i11) {
        if (i11 < 0) {
            f(t10, i10, a10);
            return;
        }
        long j10 = this.f54093c[i11];
        int i12 = (i11 + 1) * 64;
        int iMin = Math.min(this.f54091a.size(), i12 + 64);
        i(t10, i10, a10, i11 - 1);
        e(t10, i10, a10, i12, iMin, j10);
    }

    private void k(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = i10 + 63; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f54091a.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    private void l(int i10) {
        if (i10 < 64) {
            this.f54092b = (1 << i10) | this.f54092b;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f54093c;
        if (jArr == null) {
            this.f54093c = new long[this.f54091a.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.f54091a.size() / 64];
            long[] jArr3 = this.f54093c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f54093c = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f54093c;
        jArr4[i11] = j10 | jArr4[i11];
    }

    public c(a<C, T, A> aVar) {
        this.f54095e = aVar;
    }
}
