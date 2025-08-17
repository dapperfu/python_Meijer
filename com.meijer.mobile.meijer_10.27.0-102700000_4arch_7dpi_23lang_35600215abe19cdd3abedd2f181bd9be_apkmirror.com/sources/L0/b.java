package L0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r\"\u0004\b\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0001¢\u0006\u0002\b\t2\"\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function2;", "LL0/m;", "Lkotlin/ParameterName;", "name", "value", "", "", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "LL0/k;", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)LL0/k;", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LL0/m;", "it", "", "", "a", "(LL0/m;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a<T> extends Lambda implements Function2<m, T, List<? extends Object>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<m, T, Map<String, Object>> f17578f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super m, ? super T, ? extends Map<String, ? extends Object>> function2) {
            super(2);
            this.f17578f = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(m mVar, T t10) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : this.f17578f.invoke(mVar, t10).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "", "list", "a", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: L0.b$b, reason: collision with other inner class name */
    static final class C0298b<T> extends Lambda implements Function1<List<? extends Object>, T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, ? extends Object>, T> f17579f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0298b(Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
            super(1);
            this.f17579f = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(List<? extends Object> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list.size() % 2 != 0) {
                throw new IllegalStateException("non-zero remainder");
            }
            for (int i10 = 0; i10 < list.size(); i10 += 2) {
                Object obj = list.get(i10);
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i10 + 1));
            }
            return this.f17579f.invoke(linkedHashMap);
        }
    }

    public static final <T> k<T, Object> a(Function2<? super m, ? super T, ? extends Map<String, ? extends Object>> function2, Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        return L0.a.a(new a(function2), new C0298b(function1));
    }
}
