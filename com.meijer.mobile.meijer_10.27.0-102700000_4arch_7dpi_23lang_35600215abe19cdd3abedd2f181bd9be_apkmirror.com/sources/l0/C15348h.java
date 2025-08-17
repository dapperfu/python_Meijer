package l0;

import Z.AbstractC5517o;
import Z.C5518p;
import Z.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.AbstractC15753m;
import kotlin.C15730P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u008f\u0001\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00042#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u0017\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u0019\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll0/h;", "Ln0/m;", "Ll0/g;", "Ll0/w;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "", "key", "contentType", "Lkotlin/Function2;", "Ll0/c;", "itemContent", "i", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "Ln0/P;", "Ln0/P;", "o", "()Ln0/P;", "intervals", "LZ/J;", "b", "LZ/J;", "_headerIndexes", "LZ/o;", "n", "()LZ/o;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15348h extends AbstractC15753m<C15347g> implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15730P<C15347g> intervals = new C15730P<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private J _headerIndexes;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.h$a */
    static final class a extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f148263f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f148263f = obj;
        }

        public final Object a(int i10) {
            return this.f148263f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.h$b */
    static final class b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f148264f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f148264f = obj;
        }

        public final Object a(int i10) {
            return this.f148264f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.h$c */
    static final class c extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC15343c, Composer, Integer, Unit> f148265f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function3<? super InterfaceC15343c, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f148265f = function3;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= composer.V(interfaceC15343c) ? 4 : 2;
            }
            if (!composer.p((i11 & 131) != 130, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:59)");
            }
            this.f148265f.invoke(interfaceC15343c, composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/c;", "", "a", "(Ll0/c;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.h$d */
    static final class d extends Lambda implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> f148266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f148267g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function4<? super InterfaceC15343c, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i10) {
            super(3);
            this.f148266f = function4;
            this.f148267g = i10;
        }

        public final void a(InterfaceC15343c interfaceC15343c, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(interfaceC15343c) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1491981087, i10, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:73)");
            }
            this.f148266f.invoke(interfaceC15343c, Integer.valueOf(this.f148267g), composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Override // l0.w
    public void e(Object key, Object contentType, Function4<? super InterfaceC15343c, ? super Integer, ? super Composer, ? super Integer, Unit> content) {
        J j10 = this._headerIndexes;
        if (j10 == null) {
            j10 = new J(0, 1, null);
            this._headerIndexes = j10;
        }
        j10.k(k().getSize());
        a(key, contentType, ComposableLambdaKt.composableLambdaInstance(1491981087, true, new d(content, k().getSize())));
    }

    public final AbstractC5517o n() {
        J j10 = this._headerIndexes;
        return j10 != null ? j10 : C5518p.a();
    }

    @Override // kotlin.AbstractC15753m
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C15730P<C15347g> k() {
        return this.intervals;
    }

    public C15348h(Function1<? super w, Unit> function1) {
        function1.invoke(this);
    }

    @Override // l0.w
    public void a(Object key, Object contentType, Function3<? super InterfaceC15343c, ? super Composer, ? super Integer, Unit> content) {
        a aVar;
        C15730P<C15347g> c15730pK = k();
        if (key != null) {
            aVar = new a(key);
        } else {
            aVar = null;
        }
        c15730pK.b(1, new C15347g(aVar, new b(contentType), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new c(content))));
    }

    @Override // l0.w
    public void i(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, Function4<? super InterfaceC15343c, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        k().b(count, new C15347g(key, contentType, itemContent));
    }
}
