package Z;

import a0.C5557d;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0004\b \u0010\fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010\u0006R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#¨\u0006%"}, d2 = {"LZ/O;", "V", "LZ/y;", "", "initialCapacity", "<init>", "(I)V", "", "m", "capacity", "l", "k", "()V", "", "key", "i", "(J)I", "hash1", "j", "(I)I", "value", "r", "(JLjava/lang/Object;)V", "n", "(JLjava/lang/Object;)Ljava/lang/Object;", "o", "(J)Ljava/lang/Object;", "index", "p", "(I)Ljava/lang/Object;", "g", "f", "h", "newCapacity", "q", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O<V> extends AbstractC5526y<V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ O(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void g() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != i0.f42151a) {
            ArraysKt.E(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.B(this.values, null, 0, this._capacity);
        k();
    }

    public O(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5557d.a("Capacity must be a positive value.");
        }
        m(i0.f(i10));
    }

    private final int i(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & l3.f92485d;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.growthLimit == 0 && ((this.metadata[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iJ >> 3;
                long j14 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iJ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int j(int hash1) {
        int i10 = this._capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void l(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = i0.f42151a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.E(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        k();
    }

    private final void m(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        l(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    public final void f() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            q(i0.d(this._capacity));
        } else {
            h();
        }
    }

    public final void h() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        int i11 = (i10 + 7) >> 3;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iL0 = ArraysKt.l0(jArr);
        int i13 = iL0 - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[iL0] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j13 = (jArr[i15] >> i16) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i14]) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iJ = j(i18);
                int i19 = i18 & i10;
                boolean z11 = z10;
                if (((iJ - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = ((i17 & l3.f92485d) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[z11 ? 1 : 0] & j12) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
                } else {
                    int i20 = iJ >> 3;
                    long j14 = jArr[i20];
                    int i21 = (iJ & 7) << 3;
                    if (((j14 >> i21) & 255) == 128) {
                        j10 = j12;
                        jArr[i20] = ((i17 & l3.f92485d) << i21) | (j14 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iJ] = jArr2[i14];
                        jArr2[i14] = 0;
                        objArr[iJ] = objArr[i14];
                        objArr[i14] = null;
                    } else {
                        j10 = j12;
                        jArr[i20] = ((i17 & l3.f92485d) << i21) | (j14 & (~(255 << i21)));
                        long j15 = jArr2[iJ];
                        jArr2[iJ] = jArr2[i14];
                        jArr2[i14] = j15;
                        Object obj = objArr[iJ];
                        objArr[iJ] = objArr[i14];
                        objArr[i14] = obj;
                        i14--;
                    }
                    jArr[ArraysKt.l0(jArr)] = (jArr[z11 ? 1 : 0] & j10) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        k();
    }

    @PublishedApi
    public final V p(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        Object[] objArr = this.values;
        V v10 = (V) objArr[index];
        objArr[index] = null;
        return v10;
    }

    public final void q(int newCapacity) {
        long[] jArr;
        O<V> o10 = this;
        long[] jArr2 = o10.metadata;
        long[] jArr3 = o10.keys;
        Object[] objArr = o10.values;
        int i10 = o10._capacity;
        m(newCapacity);
        long[] jArr4 = o10.metadata;
        long[] jArr5 = o10.keys;
        Object[] objArr2 = o10.values;
        int i11 = o10._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i12];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iJ = o10.j(i13 >>> 7);
                long j11 = i13 & l3.f92485d;
                int i14 = iJ >> 3;
                int i15 = (iJ & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i14] & (~(255 << i15))) | (j11 << i15);
                jArr4[i14] = j12;
                jArr4[(((iJ - 7) & i11) + (i11 & 7)) >> 3] = j12;
                jArr5[iJ] = j10;
                objArr2[iJ] = objArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            o10 = this;
            jArr2 = jArr;
        }
    }

    private final void k() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final V n(long key, V value) {
        int i10 = i(key);
        Object[] objArr = this.values;
        V v10 = (V) objArr[i10];
        this.keys[i10] = key;
        objArr[i10] = value;
        return v10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V o(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.keys
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object r0 = r14.p(r10)
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.O.o(long):java.lang.Object");
    }

    public final void r(long key, V value) {
        int i10 = i(key);
        this.keys[i10] = key;
        this.values[i10] = value;
    }
}
