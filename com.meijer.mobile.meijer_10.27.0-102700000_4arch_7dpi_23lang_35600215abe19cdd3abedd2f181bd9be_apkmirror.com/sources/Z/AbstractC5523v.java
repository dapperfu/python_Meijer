package Z;

import a0.C5557d;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0018\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0003R\u001c\u0010#\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0003R\u001c\u0010%\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010\u0003R\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\r\u0082\u0001\u0001(¨\u0006)"}, d2 = {"LZ/v;", "", "<init>", "()V", "", "e", "()Z", "", "key", "", "b", "(J)I", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "", "[J", "getMetadata$annotations", "metadata", "getKeys$annotations", "keys", "", "c", "[I", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "size", "LZ/M;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5523v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long[] metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int[] values;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int _capacity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int _size;

    public /* synthetic */ AbstractC5523v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5523v() {
        this.metadata = i0.f42151a;
        this.keys = B.a();
        this.values = C5521t.a();
    }

    /* renamed from: c, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: d, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean e() {
        return this._size == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof Z.AbstractC5523v
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            Z.v r1 = (Z.AbstractC5523v) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            long[] r3 = r0.keys
            int[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L73
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L63
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            int r2 = r1.a(r2)
            if (r2 < 0) goto L62
            int[] r3 = r1.values
            r2 = r3[r2]
            if (r14 == r2) goto L66
        L62:
            return r4
        L63:
            r15 = r2
            r16 = r3
        L66:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L41
        L6d:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L7f
            goto L76
        L73:
            r15 = r2
            r16 = r3
        L76:
            if (r8 == r7) goto L7f
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L27
        L7e:
            r15 = r2
        L7f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.AbstractC5523v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        long j11 = jArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ Long.hashCode(j11);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public String toString() {
        int i10;
        int i11;
        if (e()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            int i17 = iArr[i16];
                            sb2.append(j11);
                            sb2.append("=");
                            sb2.append(i17);
                            i13++;
                            if (i13 < this._size) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i18 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @PublishedApi
    public final int a(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & l3.f92485d;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int b(long key) {
        int iA = a(key);
        if (iA < 0) {
            C5557d.d("Cannot find value for key " + key);
        }
        return this.values[iA];
    }
}
