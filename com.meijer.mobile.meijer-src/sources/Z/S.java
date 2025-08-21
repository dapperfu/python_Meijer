package Z;

import a0.C5640d;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001c\u0010\u0006J\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\u0006R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LZ/S;", "K", "LZ/a0;", "", "initialCapacity", "<init>", "(I)V", "", "p", "capacity", "o", "n", "()V", "key", "m", "(Ljava/lang/Object;)I", "hash1", "l", "(I)I", "value", "u", "(Ljava/lang/Object;I)V", "default", "q", "(Ljava/lang/Object;II)I", "r", "(Ljava/lang/Object;)V", "index", "s", "j", "i", "k", "newCapacity", "t", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class S<K> extends a0<K> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public S() {
        this(0, 1, null);
    }

    public final void j() {
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
        ArraysKt.B(this.keys, null, 0, this._capacity);
        n();
    }

    public /* synthetic */ S(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int l(int hash1) {
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

    private final int m(K key) {
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
                int iL = l(i11);
                if (this.growthLimit == 0 && ((this.metadata[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    i();
                    iL = l(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iL >> 3;
                long j14 = jArr2[i20];
                int i21 = (iL & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iL - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iL;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void o(int capacity) {
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
        n();
    }

    private final void p(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        o(iMax);
        this.keys = new Object[iMax];
        this.values = new int[iMax];
    }

    public final void i() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            t(i0.d(this._capacity));
        } else {
            k();
        }
    }

    public final void k() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        Object[] objArr = this.keys;
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
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iL = l(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iL - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & l3.f93324d) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iL >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iL & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r8 & l3.f93324d) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iL] = objArr[i15];
                        objArr[i15] = null;
                        iArr[iL] = iArr[i15];
                        iArr[i15] = i20;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & l3.f93324d) << i22) | (j14 & (~(255 << i22)));
                        Object obj2 = objArr[iL];
                        objArr[iL] = objArr[i15];
                        objArr[i15] = obj2;
                        int i23 = iArr[iL];
                        iArr[iL] = iArr[i15];
                        iArr[i15] = i23;
                        i15--;
                    }
                    jArr[ArraysKt.l0(jArr)] = (jArr[i20] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        n();
    }

    @PublishedApi
    public final void s(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.keys[index] = null;
    }

    public final void t(int newCapacity) {
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i11 = this._capacity;
        p(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i12 = this._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iL = l(i14 >>> 7);
                i10 = i13;
                long j10 = i14 & l3.f93324d;
                int i15 = iL >> 3;
                int i16 = (iL & 7) << 3;
                long j11 = (j10 << i16) | (jArr2[i15] & (~(255 << i16)));
                jArr2[i15] = j11;
                jArr2[(((iL - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iL] = obj;
                iArr2[iL] = iArr[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public S(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5640d.a("Capacity must be a positive value.");
        }
        p(i0.f(i10));
    }

    private final void n() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final int q(K key, int value, int i10) {
        int iM = m(key);
        if (iM < 0) {
            iM = ~iM;
        } else {
            i10 = this.values[iM];
        }
        this.keys[iM] = key;
        this.values[iM] = value;
        return i10;
    }

    public final void r(K key) {
        int iB = b(key);
        if (iB >= 0) {
            s(iB);
        }
    }

    public final void u(K key, int value) {
        int iM = m(key);
        if (iM < 0) {
            iM = ~iM;
        }
        this.keys[iM] = key;
        this.values[iM] = value;
    }
}
