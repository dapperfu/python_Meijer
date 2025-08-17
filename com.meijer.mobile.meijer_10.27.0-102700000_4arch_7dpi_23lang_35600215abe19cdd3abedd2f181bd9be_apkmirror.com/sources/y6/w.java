package y6;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y6.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \u00112\u00020\u0001:\u0003\u0006\f\u0011J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Ly6/w;", "", "Ly6/w$b;", "E", "Ly6/w$c;", "key", "c", "(Ly6/w$c;)Ly6/w$b;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "f", "(Ly6/w;)Ly6/w;", "a", "(Ly6/w$c;)Ly6/w;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f170324a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final w f170323b = r.f170313c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ly6/w$b;", "Ly6/w;", "E", "Ly6/w$c;", "key", "c", "(Ly6/w$c;)Ly6/w$b;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "a", "(Ly6/w$c;)Ly6/w;", "getKey", "()Ly6/w$c;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b extends w {
        c<?> getKey();

        @Override // y6.w
        default w a(c<?> key) {
            Intrinsics.j(key, "key");
            return Intrinsics.e(getKey(), key) ? r.f170313c : this;
        }

        @Override // y6.w
        default <R> R b(R initial, Function2<? super R, ? super b, ? extends R> operation) {
            Intrinsics.j(operation, "operation");
            return operation.invoke(initial, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // y6.w
        default <E extends b> E c(c<E> key) {
            Intrinsics.j(key, "key");
            if (!Intrinsics.e(getKey(), key)) {
                return null;
            }
            Intrinsics.h(this, "null cannot be cast to non-null type E of com.apollographql.apollo.api.ExecutionContext.Element.get");
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Ly6/w$c;", "Ly6/w$b;", "E", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c<E extends b> {
    }

    w a(c<?> key);

    <R> R b(R initial, Function2<? super R, ? super b, ? extends R> operation);

    <E extends b> E c(c<E> key);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Ly6/w$a;", "", "<init>", "()V", "Ly6/w;", "Empty", "Ly6/w;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.w$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f170324a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static w e(w acc, b element) {
        Intrinsics.j(acc, "acc");
        Intrinsics.j(element, "element");
        w wVarA = acc.a(element.getKey());
        return wVarA == r.f170313c ? element : new o(wVarA, element);
    }

    default w f(w context) {
        Intrinsics.j(context, "context");
        return context == r.f170313c ? this : (w) context.b(this, new Function2() { // from class: y6.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w.e((w) obj, (w.b) obj2);
            }
        });
    }
}
