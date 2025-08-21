package Z;

import a0.C5640d;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a¨\u0006\u001c"}, d2 = {"LZ/M;", "LZ/v;", "", "initialCapacity", "<init>", "(I)V", "", "l", "capacity", "k", "j", "()V", "", "key", "i", "(J)I", "hash1", "h", "(I)I", "value", "n", "(JI)V", "f", "g", "newCapacity", "m", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class M extends AbstractC5623v {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public M(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5640d.a("Capacity must be a positive value.");
        }
        l(i0.f(i10));
    }

    private final int h(int hash1) {
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

    private final int i(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
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
            int i18 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iH = h(i11);
                if (this.growthLimit == 0 && ((this.metadata[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    f();
                    iH = h(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iH >> 3;
                long j14 = jArr2[i20];
                int i21 = (iH & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iH - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iH;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void k(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = i0.f43472a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.E(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        j();
    }

    private final void l(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        k(iMax);
        this.keys = new long[iMax];
        this.values = new int[iMax];
    }

    public final void f() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            m(i0.d(this._capacity));
        } else {
            g();
        }
    }

    public final void g() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        long[] jArr2 = this.keys;
        int[] iArr = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iL0 = ArraysKt.l0(jArr);
        int i14 = iL0 - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iL0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iH = h(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iH - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = ((i18 & l3.f93324d) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iH >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iH & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = ((i18 & l3.f93324d) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        jArr2[iH] = jArr2[i15];
                        jArr2[i15] = 0;
                        iArr[iH] = iArr[i15];
                        iArr[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = ((i18 & l3.f93324d) << i23) | (j14 & (~(255 << i23)));
                        long j15 = jArr2[iH];
                        jArr2[iH] = jArr2[i15];
                        jArr2[i15] = j15;
                        int i24 = iArr[iH];
                        iArr[iH] = iArr[i15];
                        iArr[i15] = i24;
                        i15--;
                    }
                    jArr[ArraysKt.l0(jArr)] = (jArr[i21] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        j();
    }

    public final void m(int newCapacity) {
        long[] jArr;
        M m10 = this;
        long[] jArr2 = m10.metadata;
        long[] jArr3 = m10.keys;
        int[] iArr = m10.values;
        int i10 = m10._capacity;
        l(newCapacity);
        long[] jArr4 = m10.metadata;
        long[] jArr5 = m10.keys;
        int[] iArr2 = m10.values;
        int i11 = m10._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i12];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iH = m10.h(i13 >>> 7);
                long j11 = i13 & l3.f93324d;
                int i14 = iH >> 3;
                int i15 = (iH & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i14] & (~(255 << i15))) | (j11 << i15);
                jArr4[i14] = j12;
                jArr4[(((iH - 7) & i11) + (i11 & 7)) >> 3] = j12;
                jArr5[iH] = j10;
                iArr2[iH] = iArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            m10 = this;
            jArr2 = jArr;
        }
    }

    private final void j() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final void n(long key, int value) {
        int i10 = i(key);
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.keys[i10] = key;
        this.values[i10] = value;
    }

    public /* synthetic */ M(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
