package M0;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"LM0/q;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", "e", "()I", "g", "(I)V", "size", "", "[I", "d", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "LJ0/r;", "[LJ0/r;", "f", "()[LJ0/r;", "setValues$runtime_release", "([LJ0/r;)V", "values", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] hashes = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private J0.r<T>[] values = new J0.r[16];

    private final int b(T value, int hash) {
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = this.hashes[i12];
            if (i13 < hash) {
                i11 = i12 + 1;
            } else {
                if (i13 <= hash) {
                    J0.r<T> rVar = this.values[i12];
                    return value == (rVar != null ? rVar.get() : null) ? i12 : c(i12, value, hash);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.hashes[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.values[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.size;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            J0.r<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            J0.r<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.q.c(int, java.lang.Object, int):int");
    }

    public final boolean a(T value) {
        int iB;
        int i10 = this.size;
        int iA = J0.q.a(value);
        if (i10 > 0) {
            iB = b(value, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        J0.r<T>[] rVarArr = this.values;
        int length = rVarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            J0.r<T>[] rVarArr2 = new J0.r[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(rVarArr, i11, rVarArr2, i13, i10 - i11);
            System.arraycopy(this.values, 0, rVarArr2, 0, i11);
            ArraysKt.m(this.hashes, iArr, i13, i11, i10);
            ArraysKt.r(this.hashes, iArr, 0, 0, i11, 6, null);
            this.values = rVarArr2;
            this.hashes = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(rVarArr, i11, rVarArr, i14, i10 - i11);
            int[] iArr2 = this.hashes;
            ArraysKt.m(iArr2, iArr2, i14, i11, i10);
        }
        this.values[i11] = new J0.r<>(value);
        this.hashes[i11] = iA;
        this.size++;
        return true;
    }

    /* renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final J0.r<T>[] f() {
        return this.values;
    }

    public final void g(int i10) {
        this.size = i10;
    }
}
