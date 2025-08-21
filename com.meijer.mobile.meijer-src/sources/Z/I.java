package Z;

import a0.C5640d;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0005R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LZ/I;", "LZ/m;", "", "initialCapacity", "<init>", "(I)V", "", "o", "capacity", "n", "m", "()V", "key", "l", "(I)I", "hash1", "k", "value", "q", "(II)V", "i", "h", "j", "newCapacity", "p", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class I extends AbstractC5615m {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public I(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5640d.a("Capacity must be a positive value.");
        }
        o(i0.f(i10));
    }

    public final void i() {
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
        m();
    }

    private final int k(int hash1) {
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

    private final int l(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
            int i18 = 1;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i19 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                int i20 = i18;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i18 = i20;
            }
            int i21 = i18;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.growthLimit == 0 && ((this.metadata[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i11);
                }
                this._size++;
                int i22 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i23 = iK >> 3;
                long j14 = jArr2[i23];
                int i24 = (iK & 7) << 3;
                this.growthLimit = i22 - (((j14 >> i24) & 255) == 128 ? i21 : 0);
                int i25 = this._capacity;
                long j15 = ((~(255 << i24)) & j14) | (j11 << i24);
                jArr2[i23] = j15;
                jArr2[(((iK - 7) & i25) + (i25 & 7)) >> 3] = j15;
                return ~iK;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void n(int capacity) {
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
        m();
    }

    private final void o(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        n(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    public final void h() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            p(i0.d(this._capacity));
        } else {
            j();
        }
    }

    public final void j() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iK = k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iK - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = ((i18 & l3.f93324d) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iK >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iK & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = ((i18 & l3.f93324d) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i21;
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = ((i18 & l3.f93324d) << i23) | (j14 & (~(255 << i23)));
                        int i24 = iArr[iK];
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i24;
                        int i25 = iArr2[iK];
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i25;
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
        m();
    }

    public final void p(int newCapacity) {
        long[] jArr;
        I i10 = this;
        long[] jArr2 = i10.metadata;
        int[] iArr = i10.keys;
        int[] iArr2 = i10.values;
        int i11 = i10._capacity;
        o(newCapacity);
        long[] jArr3 = i10.metadata;
        int[] iArr3 = i10.keys;
        int[] iArr4 = i10.values;
        int i12 = i10._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = i10.k(i15 >>> 7);
                long j10 = i15 & l3.f93324d;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iK] = i14;
                iArr4[iK] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            i10 = this;
            jArr2 = jArr;
        }
    }

    private final void m() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final void q(int key, int value) {
        int iL = l(key);
        if (iL < 0) {
            iL = ~iL;
        }
        this.keys[iL] = key;
        this.values[iL] = value;
    }

    public /* synthetic */ I(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
