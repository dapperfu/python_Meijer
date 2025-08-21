package Z;

import a0.C5637a;
import a0.C5640d;
import com.medallia.digital.mobilesdk.l3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010\rJ\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u0007R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"LZ/W;", "K", "V", "LZ/h0;", "", "initialCapacity", "<init>", "(I)V", "", "q", "capacity", "p", "o", "()V", "hash1", "m", "(I)I", "key", "value", "x", "(Ljava/lang/Object;Ljava/lang/Object;)V", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "t", "(Ljava/util/Map;)V", "s", "(LZ/h0;)V", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "v", "(I)Ljava/lang/Object;", "k", "n", "(Ljava/lang/Object;)I", "j", "l", "newCapacity", "w", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class W<K, V> extends h0<K, V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public W() {
        this(0, 1, null);
    }

    public final void k() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != i0.f43472a) {
            ArraysKt.E(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.B(this.values, null, 0, this._capacity);
        ArraysKt.B(this.keys, null, 0, this._capacity);
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V u(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.e(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.v(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.W.u(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ W(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int m(int hash1) {
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

    private final void p(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = i0.f43472a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.E(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i10 = capacity >> 3;
            long j10 = 255 << ((capacity & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.metadata = jArr;
        o();
    }

    private final void q(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        p(iMax);
        this.keys = iMax == 0 ? C5637a.f44161c : new Object[iMax];
        this.values = iMax == 0 ? C5637a.f44161c : new Object[iMax];
    }

    public final void j() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            w(i0.d(this._capacity));
        } else {
            l();
        }
    }

    public final void l() {
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iL0 = ArraysKt.l0(jArr);
        int i14 = iL0 - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iL0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iM = m(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iM - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & l3.f93324d) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.l0(jArr)] = jArr[i20];
                } else {
                    int i21 = iM >> 3;
                    long j12 = jArr[i21];
                    int i22 = (iM & 7) << 3;
                    if (((j12 >> i22) & 255) == 128) {
                        jArr[i21] = ((r8 & l3.f93324d) << i22) | (j12 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iM] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i21] = ((r8 & l3.f93324d) << i22) | (j12 & (~(255 << i22)));
                        Object obj2 = objArr[iM];
                        objArr[iM] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iM];
                        objArr2[iM] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[ArraysKt.l0(jArr)] = jArr[i20];
                }
                i15++;
                i12 = i20;
            } else {
                i15++;
            }
        }
        o();
    }

    @PublishedApi
    public final int n(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & l3.f93324d;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.e(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = m(i11);
                if (this.growthLimit == 0 && ((this.metadata[iM >> 3] >> ((iM & 7) << 3)) & 255) != 254) {
                    j();
                    iM = m(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iM >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iM;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(h0<K, V> from) {
        Intrinsics.j(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        x(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void t(Map<K, ? extends V> from) {
        Intrinsics.j(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            x(entry.getKey(), entry.getValue());
        }
    }

    @PublishedApi
    public final V v(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v10 = (V) objArr[index];
        objArr[index] = null;
        return v10;
    }

    public final void w(int newCapacity) {
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = this._capacity;
        q(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i12 = this._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM = m(i14 >>> 7);
                i10 = i13;
                long j10 = i14 & l3.f93324d;
                int i15 = iM >> 3;
                int i16 = (iM & 7) << 3;
                long j11 = (j10 << i16) | (jArr2[i15] & (~(255 << i16)));
                jArr2[i15] = j11;
                jArr2[(((iM - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr3[iM] = obj;
                objArr4[iM] = objArr2[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public W(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5640d.a("Capacity must be a positive value.");
        }
        q(i0.f(i10));
    }

    private final void o() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final V r(K key, V value) {
        int iN = n(key);
        if (iN < 0) {
            iN = ~iN;
        }
        Object[] objArr = this.values;
        V v10 = (V) objArr[iN];
        this.keys[iN] = key;
        objArr[iN] = value;
        return v10;
    }

    public final void x(K key, V value) {
        int iN = n(key);
        if (iN < 0) {
            iN = ~iN;
        }
        this.keys[iN] = key;
        this.values[iN] = value;
    }
}
