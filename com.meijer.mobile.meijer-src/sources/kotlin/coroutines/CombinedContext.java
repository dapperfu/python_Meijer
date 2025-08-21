package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)¨\u0006*"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "", "l", "()I", "", "f", "(Lkotlin/coroutines/CoroutineContext$Element;)Z", "context", "k", "(Lkotlin/coroutines/CombinedContext;)Z", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "g", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "x0", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext.Element element;

    private final int l() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public CombinedContext(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.j(left, "left");
        Intrinsics.j(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean k(CombinedContext context) {
        while (f(context.element)) {
            CoroutineContext coroutineContext = context.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                Intrinsics.h(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return f((CoroutineContext.Element) coroutineContext);
            }
            context = (CombinedContext) coroutineContext;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(String acc, CoroutineContext.Element element) {
        Intrinsics.j(acc, "acc");
        Intrinsics.j(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.j(operation, "operation");
        return operation.invoke((Object) this.left.b(initial, operation), this.element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) other;
        return combinedContext.l() == l() && combinedContext.k(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        Intrinsics.j(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.element.g(key);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.g(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public String toString() {
        return '[' + ((String) b("", new Function2() { // from class: hv.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.n((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        Intrinsics.j(key, "key");
        if (this.element.g(key) != null) {
            return this.left;
        }
        CoroutineContext coroutineContextX0 = this.left.x0(key);
        return coroutineContextX0 == this.left ? this : coroutineContextX0 == EmptyCoroutineContext.f143553a ? this.element : new CombinedContext(coroutineContextX0, this.element);
    }

    private final boolean f(CoroutineContext.Element element) {
        return Intrinsics.e(g(element.getKey()), element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.b(this, coroutineContext);
    }
}
