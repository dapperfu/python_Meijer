package Z;

import a0.C5637a;
import a0.C5640d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u0010.\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u00101R\u0016\u00104\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u00103¨\u00065"}, d2 = {"LZ/C;", "E", "", "", "initialCapacity", "<init>", "(I)V", "b", "()LZ/C;", "", "key", "d", "(J)Ljava/lang/Object;", "", "k", "(J)V", "index", "l", "value", "i", "(JLjava/lang/Object;)V", "other", "j", "(LZ/C;)V", "m", "()I", "", "f", "()Z", "g", "(I)J", "n", "(I)Ljava/lang/Object;", "e", "(J)I", "c", "(J)Z", "a", "()V", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class C<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public /* synthetic */ boolean garbage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public /* synthetic */ long[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public /* synthetic */ Object[] values;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public /* synthetic */ int size;

    @JvmOverloads
    public C() {
        this(0, 1, null);
    }

    public long g(int index) {
        if (!(index >= 0 && index < this.size)) {
            C5640d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != D.f43345a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.keys[index];
    }

    public E n(int index) {
        if (!(index >= 0 && index < this.size)) {
            C5640d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != D.f43345a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return (E) this.values[index];
    }

    @JvmOverloads
    public C(int i10) {
        if (i10 == 0) {
            this.keys = C5637a.f44160b;
            this.values = C5637a.f44161c;
        } else {
            int iF = C5637a.f(i10);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public void a() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public E d(long key) {
        int iB = C5637a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == D.f43345a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int e(long key) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != D.f43345a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return C5637a.b(this.keys, this.size, key);
    }

    public void i(long key, E value) {
        int iB = C5637a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.size && this.values[i10] == D.f43345a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != D.f43345a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.garbage = false;
                this.size = i12;
                i10 = ~C5637a.b(this.keys, i12, key);
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int iF = C5637a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iF);
            Intrinsics.i(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iF);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i15 = this.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            ArraysKt.n(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            ArraysKt.o(objArr2, objArr2, i16, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    public void j(C<? extends E> other) {
        Intrinsics.j(other, "other");
        int iM = other.m();
        for (int i10 = 0; i10 < iM; i10++) {
            i(other.g(i10), other.n(i10));
        }
    }

    public void k(long key) {
        int iB = C5637a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == D.f43345a) {
            return;
        }
        this.values[iB] = D.f43345a;
        this.garbage = true;
    }

    public void l(int index) {
        if (this.values[index] != D.f43345a) {
            this.values[index] = D.f43345a;
            this.garbage = true;
        }
    }

    public int m() {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != D.f43345a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.size;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.h(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C<E> c10 = (C) objClone;
        c10.keys = (long[]) this.keys.clone();
        c10.values = (Object[]) this.values.clone();
        return c10;
    }

    public boolean c(long key) {
        if (e(key) >= 0) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (m() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i11));
            sb2.append('=');
            E eN = n(i11);
            if (eN != sb2) {
                sb2.append(eN);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
