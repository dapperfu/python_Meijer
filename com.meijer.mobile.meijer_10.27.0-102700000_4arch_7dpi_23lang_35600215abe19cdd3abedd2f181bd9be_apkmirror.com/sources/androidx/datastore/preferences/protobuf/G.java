package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5958y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class G extends AbstractC5937c<Long> implements C5958y.h, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final G f54162d = new G(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f54163b;

    /* renamed from: c, reason: collision with root package name */
    private int f54164c;

    G() {
        this(new long[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f54164c != g10.f54164c) {
            return false;
        }
        long[] jArr = g10.f54163b;
        for (int i10 = 0; i10 < this.f54164c; i10++) {
            if (this.f54163b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f54164c; i10++) {
            iF = (iF * 31) + C5958y.f(this.f54163b[i10]);
        }
        return iF;
    }

    private G(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f54163b = jArr;
        this.f54164c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f54164c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f54164c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f54163b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5958y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5958y.h b(int i10) {
        if (i10 >= this.f54164c) {
            return new G(Arrays.copyOf(this.f54163b, i10), this.f54164c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f54164c;
    }

    private void h(int i10, long j10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f54164c)) {
            long[] jArr = this.f54163b;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f54163b, i10, jArr2, i10 + 1, this.f54164c - i10);
                this.f54163b = jArr2;
            }
            this.f54163b[i10] = j10;
            this.f54164c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        C5958y.a(collection);
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i10 = g10.f54164c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f54164c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f54163b;
            if (i12 > jArr.length) {
                this.f54163b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(g10.f54163b, 0, this.f54163b, this.f54164c, g10.f54164c);
            this.f54164c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        h(i10, l10.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    public void k(long j10) {
        a();
        int i10 = this.f54164c;
        long[] jArr = this.f54163b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f54163b = jArr2;
        }
        long[] jArr3 = this.f54163b;
        int i11 = this.f54164c;
        this.f54164c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(n(i10));
    }

    public long n(int i10) {
        l(i10);
        return this.f54163b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        l(i10);
        long[] jArr = this.f54163b;
        long j10 = jArr[i10];
        if (i10 < this.f54164c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f54164c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(s(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f54163b;
            System.arraycopy(jArr, i11, jArr, i10, this.f54164c - i11);
            this.f54164c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long s(int i10, long j10) {
        a();
        l(i10);
        long[] jArr = this.f54163b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }
}
