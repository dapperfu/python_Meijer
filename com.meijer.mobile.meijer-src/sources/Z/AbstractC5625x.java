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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0011\u0010 \u0012\u0004\b!\u0010\u001e\u0082\u0001\u0001#¨\u0006$"}, d2 = {"LZ/x;", "", "", "initialCapacity", "<init>", "(I)V", "index", "", "a", "(I)J", "", "separator", "prefix", "postfix", "limit", "truncated", "", "b", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[J", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "LZ/N;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5625x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int _size;

    public /* synthetic */ AbstractC5625x(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    private AbstractC5625x(int i10) {
        this.content = i10 == 0 ? B.a() : new long[i10];
    }

    public static /* synthetic */ String c(AbstractC5625x abstractC5625x, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC5625x.b(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final long a(int index) {
        if (index < 0 || index >= this._size) {
            C5640d.c("Index must be between 0 and size");
        }
        return this.content[index];
    }

    @JvmOverloads
    public final String b(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append(postfix);
                break;
            }
            long j10 = jArr[i11];
            if (i11 == limit) {
                sb2.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(j10);
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public boolean equals(Object other) {
        if (other instanceof AbstractC5625x) {
            AbstractC5625x abstractC5625x = (AbstractC5625x) other;
            int i10 = abstractC5625x._size;
            int i11 = this._size;
            if (i10 == i11) {
                long[] jArr = this.content;
                long[] jArr2 = abstractC5625x.content;
                IntRange intRangeX = RangesKt.x(0, i11);
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                if (first > last) {
                    return true;
                }
                while (jArr[first] == jArr2[first]) {
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

    public int hashCode() {
        long[] jArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return c(this, null, "[", "]", 0, null, 25, null);
    }
}
