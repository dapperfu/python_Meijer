package Z;

import a0.C5637a;
import a0.C5640d;
import com.medallia.digital.mobilesdk.l3;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u001b\u0010$\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b$\u0010\u001bJ\u001e\u0010%\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b%\u0010\u001fJ\u001b\u0010'\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u0010\u0006J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"LZ/X;", "E", "LZ/j0;", "", "initialCapacity", "<init>", "(I)V", "", "s", "capacity", "r", "q", "()V", "element", "o", "(Ljava/lang/Object;)I", "hash1", "p", "(I)I", "", "h", "(Ljava/lang/Object;)Z", "x", "(Ljava/lang/Object;)V", "", "elements", "j", "(Ljava/lang/Iterable;)Z", "i", "(LZ/j0;)Z", "w", "(Ljava/lang/Iterable;)V", "v", "(LZ/j0;)V", "y", "u", "z", "t", "", "C", "(Ljava/util/Collection;)Z", "index", "A", "m", "k", "n", "newCapacity", "B", "", "l", "()Ljava/util/Set;", "e", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X<E> extends j0<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public X() {
        this(0, 1, null);
    }

    public final void m() {
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
        ArraysKt.B(this.elements, null, 0, this._capacity);
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(E r14) {
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
            java.lang.Object[] r11 = r13.elements
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.A(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.X.u(java.lang.Object):void");
    }

    public X(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C5640d.a("Capacity must be a positive value.");
        }
        s(i0.f(i10));
    }

    private final int o(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.e(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iP = p(i11);
                if (this.growthLimit == 0 && ((this.metadata[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iP >> 3;
                long j14 = jArr2[i20];
                int i21 = (iP & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iP - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iP;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int p(int hash1) {
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

    private final void r(int capacity) {
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
        q();
    }

    private final void s(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, i0.e(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = iMax == 0 ? C5637a.f44161c : new Object[iMax];
    }

    @PublishedApi
    public final void A(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.elements[index] = null;
    }

    public final void B(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i10 = this._capacity;
        s(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i11 = this._capacity;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iP = p(i13 >>> 7);
                long j10 = i13 & l3.f93324d;
                int i14 = iP >> 3;
                int i15 = (iP & 7) << 3;
                long j11 = (jArr2[i14] & (~(255 << i15))) | (j10 << i15);
                jArr2[i14] = j11;
                jArr2[(((iP - 7) & i11) + (i11 & 7)) >> 3] = j11;
                objArr2[iP] = obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.j(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.CollectionsKt.h0(r14, r15)
            if (r14 != 0) goto L4c
            r0.A(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0._size
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.X.C(java.util.Collection):boolean");
    }

    public final boolean i(j0<E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = get_size();
        v(elements);
        return i10 != get_size();
    }

    public final boolean j(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = get_size();
        w(elements);
        return i10 != get_size();
    }

    public final void k() {
        if (this._capacity <= 8 || Long.compare(ULong.b(ULong.b(this._size) * 32) ^ Long.MIN_VALUE, ULong.b(ULong.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            B(i0.d(this._capacity));
        } else {
            n();
        }
    }

    public final Set<E> l() {
        return new Y(this);
    }

    public final void n() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        Object[] objArr = this.elements;
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
                int iP = p(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iP - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r7 & l3.f93324d) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iP >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iP & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r7 & l3.f93324d) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iP] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r7 & l3.f93324d) << i22) | (j14 & (~(255 << i22)));
                        Object obj2 = objArr[iP];
                        objArr[iP] = objArr[i15];
                        objArr[i15] = obj2;
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
        q();
    }

    public final void t(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(j0<E> elements) {
        Intrinsics.j(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        x(objArr[(i10 << 3) + i12]);
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

    public final void w(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.e(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.A(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.X.y(java.lang.Object):boolean");
    }

    public final boolean z(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = get_size();
        t(elements);
        return i10 != get_size();
    }

    private final void q() {
        this.growthLimit = i0.b(get_capacity()) - this._size;
    }

    public final boolean h(E element) {
        int i10 = get_size();
        this.elements[o(element)] = element;
        if (get_size() != i10) {
            return true;
        }
        return false;
    }

    public final void x(E element) {
        this.elements[o(element)] = element;
    }

    public /* synthetic */ X(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
