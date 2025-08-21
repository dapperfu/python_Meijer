package uk;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uk.c;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"T", "Luk/c;", "Luk/c$c;", "e", "(Luk/c;)Luk/c$c;", "", "error", "Luk/c$b;", "g", "(Luk/c;Ljava/lang/Throwable;)Luk/c$b;", "R", "Lkotlin/Function1;", "transform", "f", "(Luk/c;Lkotlin/jvm/functions/Function1;)Luk/c;", "shouldFailWith", "b", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable d(Throwable th2) {
        return th2;
    }

    public static final <T> c<T> b(c<T> cVar, Function1<? super Throwable, ? extends Throwable> shouldFailWith) throws Throwable {
        Intrinsics.j(cVar, "<this>");
        Intrinsics.j(shouldFailWith, "shouldFailWith");
        if (cVar instanceof c.Failure) {
            Throwable thInvoke = shouldFailWith.invoke(((c.Failure) cVar).getError());
            if (thInvoke != null) {
                throw thInvoke;
            }
        } else {
            Throwable thInvoke2 = shouldFailWith.invoke(null);
            if (thInvoke2 != null) {
                throw thInvoke2;
            }
        }
        return cVar;
    }

    public static /* synthetic */ c c(c cVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: uk.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return e.d((Throwable) obj2);
                }
            };
        }
        return b(cVar, function1);
    }

    public static final <T> c.Loading<T> e(c<T> cVar) {
        return new c.Loading<>(cVar != null ? cVar.a() : null);
    }

    public static final <T, R> c<R> f(c<T> cVar, Function1<? super T, ? extends R> transform) {
        Intrinsics.j(cVar, "<this>");
        Intrinsics.j(transform, "transform");
        if (cVar instanceof c.Success) {
            return new c.Success(transform.invoke((Object) ((c.Success) cVar).a()));
        }
        if (cVar instanceof c.Loading) {
            return new c.Loading(transform.invoke((Object) ((c.Loading) cVar).a()));
        }
        if (!(cVar instanceof c.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        c.Failure bVar = (c.Failure) cVar;
        return new c.Failure(transform.invoke((Object) bVar.a()), bVar.getError());
    }

    public static final <T> c.Failure<T> g(c<T> cVar, Throwable error) {
        Intrinsics.j(error, "error");
        return new c.Failure<>(cVar != null ? cVar.a() : null, error);
    }
}
