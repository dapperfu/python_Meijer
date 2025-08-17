package J0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"LJ0/l;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "a", "(J)I", "b", "(J)Ljava/lang/Object;", "value", "", "d", "(JLjava/lang/Object;)Z", "c", "(JLjava/lang/Object;)LJ0/l;", "I", "[J", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    private final int a(long key) {
        int i10 = this.size - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j10 = this.keys[i12] - key;
                    if (j10 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j10 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j11 = this.keys[0];
            if (j11 == key) {
                return 0;
            }
            if (j11 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final l c(long key, Object value) {
        int i10 = this.size;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j10 = this.keys[i14];
                Object obj2 = this.values[i14];
                if (j10 > key) {
                    jArr[i11] = key;
                    objArr[i11] = value;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i11] = j10;
                    objArr[i11] = obj2;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = key;
                objArr[i12] = value;
            } else {
                while (i11 < i13) {
                    long j11 = this.keys[i14];
                    Object obj3 = this.values[i14];
                    if (obj3 != null) {
                        jArr[i11] = j11;
                        objArr[i11] = obj3;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new l(i13, jArr, objArr);
    }

    public l(int i10, long[] jArr, Object[] objArr) {
        this.size = i10;
        this.keys = jArr;
        this.values = objArr;
    }

    public final Object b(long key) {
        int iA = a(key);
        if (iA >= 0) {
            return this.values[iA];
        }
        return null;
    }

    public final boolean d(long key, Object value) {
        int iA = a(key);
        if (iA < 0) {
            return false;
        }
        this.values[iA] = value;
        return true;
    }
}
