package Z;

import a0.C5640d;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u0012\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010'\u0082\u0001\u0001-¨\u0006."}, d2 = {"LZ/o;", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "c", "(I)Z", "d", "()I", "index", "e", "(I)I", "f", "i", "fromIndex", "toIndex", "a", "(III)I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "g", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "LZ/J;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5617o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int _size;

    public /* synthetic */ AbstractC5617o(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    private AbstractC5617o(int i10) {
        this.content = i10 == 0 ? C5621t.a() : new int[i10];
    }

    public static /* synthetic */ int b(AbstractC5617o abstractC5617o, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = abstractC5617o._size;
        }
        return abstractC5617o.a(i10, i11, i12);
    }

    public static /* synthetic */ String h(AbstractC5617o abstractC5617o, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC5617o.g(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    @JvmOverloads
    public final int a(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            C5640d.c("");
        }
        int i10 = toIndex - 1;
        while (fromIndex <= i10) {
            int i11 = (fromIndex + i10) >>> 1;
            int i12 = this.content[i11];
            if (i12 < element) {
                fromIndex = i11 + 1;
            } else {
                if (i12 <= element) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    public final boolean c(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] == element) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        if (this._size == 0) {
            C5640d.d("IntList is empty.");
        }
        return this.content[0];
    }

    public final int e(int index) {
        if (index < 0 || index >= this._size) {
            C5640d.c("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public boolean equals(Object other) {
        if (other instanceof AbstractC5617o) {
            AbstractC5617o abstractC5617o = (AbstractC5617o) other;
            int i10 = abstractC5617o._size;
            int i11 = this._size;
            if (i10 == i11) {
                int[] iArr = this.content;
                int[] iArr2 = abstractC5617o.content;
                IntRange intRangeX = RangesKt.x(0, i11);
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (element == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @JvmOverloads
    public final String g(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append(postfix);
                break;
            }
            int i12 = iArr[i11];
            if (i11 == limit) {
                sb2.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(i12);
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        if (this._size == 0) {
            C5640d.d("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public String toString() {
        return h(this, null, "[", "]", 0, null, 25, null);
    }
}
