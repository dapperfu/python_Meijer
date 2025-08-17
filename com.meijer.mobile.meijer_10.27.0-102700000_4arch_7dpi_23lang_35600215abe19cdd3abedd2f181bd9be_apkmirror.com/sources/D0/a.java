package D0;

import Z.T;
import Z.c0;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "LZ/c0;", "LZ/T;", "e", "(LZ/c0;)LZ/T;", "", "K", "Lkotlin/Function1;", "selector", "d", "(LZ/c0;Lkotlin/jvm/functions/Function1;)LZ/c0;", "", "a", "(LZ/c0;Lkotlin/jvm/functions/Function1;)Z", "", "c", "(LZ/T;Lkotlin/jvm/functions/Function1;)V", "b", "(LZ/T;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D0.a$a, reason: collision with other inner class name */
    public static final class C0090a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4988a;

        public C0090a(Function1 function1) {
            this.f4988a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Function1 function1 = this.f4988a;
            return ComparisonsKt.d((Comparable) function1.invoke(t10), (Comparable) function1.invoke(t11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T<T> e(c0<T> c0Var) {
        T<T> t10 = (T<T>) new T(c0Var.get_size());
        Object[] objArr = c0Var.content;
        int i10 = c0Var._size;
        for (int i11 = 0; i11 < i10; i11++) {
            t10.n(objArr[i11]);
        }
        return t10;
    }

    public static final <T, K extends Comparable<? super K>> boolean a(c0<T> c0Var, Function1<? super T, ? extends K> function1) {
        if (c0Var.get_size() <= 1) {
            return true;
        }
        K kInvoke = function1.invoke(c0Var.d(0));
        if (kInvoke == null) {
            return false;
        }
        int i10 = c0Var.get_size();
        int i11 = 1;
        while (i11 < i10) {
            K kInvoke2 = function1.invoke(c0Var.d(i11));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i11++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T> T b(T<T> t10) {
        if (!t10.g()) {
            int i10 = t10.get_size() - 1;
            T tD = t10.d(i10);
            t10.A(i10);
            return tD;
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T, K extends Comparable<? super K>> void c(T<T> t10, Function1<? super T, ? extends K> function1) {
        List<T> listS = t10.s();
        if (listS.size() > 1) {
            CollectionsKt.B(listS, new C0090a(function1));
        }
    }

    public static final <T, K extends Comparable<? super K>> c0<T> d(c0<T> c0Var, Function1<? super T, ? extends K> function1) {
        if (a(c0Var, function1)) {
            return c0Var;
        }
        T tE = e(c0Var);
        c(tE, function1);
        return tE;
    }
}
