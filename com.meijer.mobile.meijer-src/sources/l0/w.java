package l0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0093\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042,\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ll0/w;", "", "key", "contentType", "Lkotlin/Function1;", "Ll0/c;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "i", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface w {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f149166f = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/c;", "", "a", "(Ll0/c;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> f149167f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function4<? super InterfaceC15433c, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
            super(3);
            this.f149167f = function4;
        }

        public final void a(InterfaceC15433c interfaceC15433c, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(interfaceC15433c) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(628101784, i10, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            this.f149167f.invoke(interfaceC15433c, 0, composer, Integer.valueOf((i10 & 14) | 48));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(w wVar, int i10, Function1 function1, Function1 function12, Function4 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function12 = a.f149166f;
        }
        wVar.i(i10, function1, function12, function4);
    }

    static /* synthetic */ void d(w wVar, Object obj, Object obj2, Function4 function4, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        wVar.e(obj, obj2, function4);
    }

    static /* synthetic */ void g(w wVar, Object obj, Object obj2, Function3 function3, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        wVar.a(obj, obj2, function3);
    }

    default void a(Object key, Object contentType, Function3<? super InterfaceC15433c, ? super Composer, ? super Integer, Unit> content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void e(Object key, Object contentType, Function4<? super InterfaceC15433c, ? super Integer, ? super Composer, ? super Integer, Unit> content) {
        a(key, contentType, ComposableLambdaKt.composableLambdaInstance(628101784, true, new b(content)));
    }

    default void i(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, Function4<? super InterfaceC15433c, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }
}
