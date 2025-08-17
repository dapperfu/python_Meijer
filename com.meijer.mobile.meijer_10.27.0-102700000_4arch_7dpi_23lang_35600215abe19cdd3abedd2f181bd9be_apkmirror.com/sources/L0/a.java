package L0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000122\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0002¢\u0006\u0002\b\b2)\u0010\f\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "LL0/m;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "list", "restore", "LL0/k;", "", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)LL0/k;", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "LL0/m;", "it", "", "a", "(LL0/m;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: L0.a$a, reason: collision with other inner class name */
    static final class C0297a<Original> extends Lambda implements Function2<m, Original, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<m, Original, List<Saveable>> f17577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0297a(Function2<? super m, ? super Original, ? extends List<? extends Saveable>> function2) {
            super(2);
            this.f17577f = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m mVar, Original original) {
            List list = (List) this.f17577f.invoke(mVar, original);
            List list2 = list;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj != null && !mVar.a(obj)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    public static final <Original, Saveable> k<Original, Object> a(Function2<? super m, ? super Original, ? extends List<? extends Saveable>> function2, Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        C0297a c0297a = new C0297a(function2);
        Intrinsics.h(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return l.a(c0297a, (Function1) TypeIntrinsics.f(function1, 1));
    }
}
