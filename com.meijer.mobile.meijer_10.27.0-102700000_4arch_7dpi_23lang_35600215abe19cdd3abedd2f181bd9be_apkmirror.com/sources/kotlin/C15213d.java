package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "value", "Lkotlin/Lazy;", "c", "(Ljava/lang/Object;)Lkotlin/Lazy;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/LazyKt")
/* renamed from: kotlin.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15213d extends LazyKt__LazyJVMKt {
    public static <T> Lazy<T> c(T t10) {
        return new InitializedLazyImpl(t10);
    }
}
