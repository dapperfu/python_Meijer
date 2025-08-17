package androidx.view;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"X", "Y", "Landroidx/lifecycle/A;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "transform", "d", "(Landroidx/lifecycle/A;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/A;", "f", "lifecycle-livedata_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class b0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements InterfaceC5989E, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f55240a;

        a(Function1 function) {
            Intrinsics.j(function, "function");
            this.f55240a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC5989E) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f55240a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.view.InterfaceC5989E
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55240a.invoke(obj);
        }
    }

    @JvmName
    public static final <X, Y> AbstractC5985A<Y> d(AbstractC5985A<X> abstractC5985A, final Function1<X, Y> transform) {
        Intrinsics.j(abstractC5985A, "<this>");
        Intrinsics.j(transform, "transform");
        final C5986B c5986b = abstractC5985A.h() ? new C5986B(transform.invoke(abstractC5985A.e())) : new C5986B();
        c5986b.p(abstractC5985A, new a(new Function1() { // from class: androidx.lifecycle.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.e(c5986b, transform, obj);
            }
        }));
        return c5986b;
    }

    @JvmName
    public static final <X, Y> AbstractC5985A<Y> f(AbstractC5985A<X> abstractC5985A, final Function1<X, AbstractC5985A<Y>> transform) {
        AbstractC5985A<Y> abstractC5985AInvoke;
        Intrinsics.j(abstractC5985A, "<this>");
        Intrinsics.j(transform, "transform");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final C5986B c5986b = (abstractC5985A.h() && (abstractC5985AInvoke = transform.invoke(abstractC5985A.e())) != null && abstractC5985AInvoke.h()) ? new C5986B(abstractC5985AInvoke.e()) : new C5986B();
        c5986b.p(abstractC5985A, new a(new Function1() { // from class: androidx.lifecycle.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.g(transform, objectRef, c5986b, obj);
            }
        }));
        return c5986b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(C5986B c5986b, Function1 function1, Object obj) {
        c5986b.o(function1.invoke(obj));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.lifecycle.A, java.lang.Object] */
    public static final Unit g(Function1 function1, Ref.ObjectRef objectRef, final C5986B c5986b, Object obj) {
        ?? r02 = (AbstractC5985A) function1.invoke(obj);
        T t10 = objectRef.f142835a;
        if (t10 != r02) {
            if (t10 != 0) {
                Intrinsics.g(t10);
                c5986b.q((AbstractC5985A) t10);
            }
            objectRef.f142835a = r02;
            if (r02 != 0) {
                Intrinsics.g(r02);
                c5986b.p(r02, new a(new Function1() { // from class: androidx.lifecycle.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b0.h(c5986b, obj2);
                    }
                }));
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(C5986B c5986b, Object obj) {
        c5986b.o(obj);
        return Unit.f142422a;
    }
}
