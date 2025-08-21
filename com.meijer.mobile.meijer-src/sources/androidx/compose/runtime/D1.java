package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u00020\f\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0011\u001a\u00020\f\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u0011\u0010\u0010J&\u0010\u0013\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0002\b\r¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/D1;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "a", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "V", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "d", "Lkotlin/Function1;", "b", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class D1<T> {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(Ljava/lang/Object;Lkotlin/Unit;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<T, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f50197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Unit> function1) {
            super(2);
            this.f50197f = function1;
        }

        public final void a(T t10, Unit unit) {
            this.f50197f.invoke(t10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Unit unit) {
            a(obj, unit);
            return Unit.f143329a;
        }
    }

    public static <T> Composer a(Composer composer) {
        return composer;
    }

    public static final void b(Composer composer, Function1<? super T, Unit> function1) {
        if (composer.h()) {
            composer.n(Unit.f143329a, new a(function1));
        }
    }

    public static final <V> void c(Composer composer, V v10, Function2<? super T, ? super V, Unit> function2) {
        if (!composer.h() && Intrinsics.e(composer.B(), v10)) {
            return;
        }
        composer.t(v10);
        composer.n(v10, function2);
    }

    public static final <V> void d(Composer composer, V v10, Function2<? super T, ? super V, Unit> function2) {
        boolean zH = composer.h();
        if (zH || !Intrinsics.e(composer.B(), v10)) {
            composer.t(v10);
            if (!zH) {
                composer.n(v10, function2);
            }
        }
    }
}
