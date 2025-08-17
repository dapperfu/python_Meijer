package Z;

import a0.C5557d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00028\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0017JY\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,R$\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010.\u0012\u0004\b/\u00100R\u001c\u00104\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u00102\u0012\u0004\b3\u00100R\u0011\u00106\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b5\u0010(\u0082\u0001\u00017¨\u00068"}, d2 = {"LZ/c0;", "E", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "a", "(Ljava/lang/Object;)Z", "", "elements", "b", "(Ljava/lang/Iterable;)Z", "c", "()Ljava/lang/Object;", "index", "d", "(I)Ljava/lang/Object;", "", "l", "f", "(Ljava/lang/Object;)I", "g", "()Z", "h", "k", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "i", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "e", "size", "LZ/T;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class c0<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Object[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int _size;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<E, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c0<E> f42107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<E> c0Var) {
            super(1);
            this.f42107f = c0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            return e10 == this.f42107f ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ c0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int f(E element) {
        int i10 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i11 = this._size;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        while (i10 < i12) {
            if (element.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int k(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i10 = this._size - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i11 = this._size - 1; -1 < i11; i11--) {
                if (element.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    private c0(int i10) {
        this.content = i10 == 0 ? d0.f42108a : new Object[i10];
    }

    public static /* synthetic */ String j(c0 c0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return c0Var.i(charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public final boolean b(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E d(int index) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        return (E) this.content[index];
    }

    /* renamed from: e, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public boolean equals(Object other) {
        if (other instanceof c0) {
            c0 c0Var = (c0) other;
            int i10 = c0Var._size;
            int i11 = this._size;
            if (i10 == i11) {
                Object[] objArr = this.content;
                Object[] objArr2 = c0Var.content;
                IntRange intRangeX = RangesKt.x(0, i11);
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.e(objArr[first], objArr2[first])) {
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

    public final boolean g() {
        return this._size == 0;
    }

    public final boolean h() {
        return this._size != 0;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    @JvmOverloads
    public final String i(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append(postfix);
                break;
            }
            Object obj = objArr[i11];
            if (i11 == limit) {
                sb2.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            if (transform == null) {
                sb2.append(obj);
            } else {
                sb2.append(transform.invoke(obj));
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final void l(int index) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(index);
        sb2.append(" must be in 0..");
        sb2.append(this._size - 1);
        C5557d.c(sb2.toString());
    }

    public String toString() {
        return j(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    public final boolean a(E element) {
        if (f(element) >= 0) {
            return true;
        }
        return false;
    }

    public final E c() {
        if (g()) {
            C5557d.d("ObjectList is empty.");
        }
        return (E) this.content[0];
    }
}
