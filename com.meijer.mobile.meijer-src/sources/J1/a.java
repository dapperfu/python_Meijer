package J1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u001ag\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u000e*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u007f\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0013*\u00060\u0011j\u0002`\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0017\u001a\u00028\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"T", "", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "d", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "b", "(Ljava/util/List;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "c", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "element", "", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "message", "f", "(Ljava/lang/String;)V", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t10, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    public static final <T> List<T> b(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> String d(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) c(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String e(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return d(list, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    @PublishedApi
    public static final void f(String str) {
        throw new UnsupportedOperationException(str);
    }

    private static final <T, A extends Appendable> A c(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(a10, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }
}
