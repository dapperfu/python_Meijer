package y6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y6.w;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ly6/o;", "Ly6/w;", "left", "Ly6/w$b;", "element", "<init>", "(Ly6/w;Ly6/w$b;)V", "E", "Ly6/w$c;", "key", "c", "(Ly6/w$c;)Ly6/w$b;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "a", "(Ly6/w$c;)Ly6/w;", "Ly6/w;", "d", "Ly6/w$b;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class o implements w {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w left;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w.b element;

    public o(w left, w.b element) {
        Intrinsics.j(left, "left");
        Intrinsics.j(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // y6.w
    public w a(w.c<?> key) {
        Intrinsics.j(key, "key");
        if (this.element.c(key) != null) {
            return this.left;
        }
        w wVarA = this.left.a(key);
        return wVarA == this.left ? this : wVarA == r.f170313c ? this.element : new o(wVarA, this.element);
    }

    @Override // y6.w
    public <R> R b(R initial, Function2<? super R, ? super w.b, ? extends R> operation) {
        Intrinsics.j(operation, "operation");
        return operation.invoke((Object) this.left.b(initial, operation), this.element);
    }

    @Override // y6.w
    public <E extends w.b> E c(w.c<E> key) {
        Intrinsics.j(key, "key");
        o oVar = this;
        while (true) {
            E e10 = (E) oVar.element.c(key);
            if (e10 != null) {
                return e10;
            }
            w wVar = oVar.left;
            if (!(wVar instanceof o)) {
                return (E) wVar.c(key);
            }
            oVar = (o) wVar;
        }
    }
}
