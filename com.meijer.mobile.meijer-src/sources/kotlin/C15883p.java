package kotlin;

import Z.W;
import Z.i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Ln0/p;", "", "LL0/e;", "saveableStateHolder", "Lkotlin/Function0;", "Ln0/r;", "itemProvider", "<init>", "(LL0/e;Lkotlin/jvm/functions/Function0;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "", "b", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "a", "LL0/e;", "Lkotlin/jvm/functions/Function0;", "d", "()Lkotlin/jvm/functions/Function0;", "LZ/W;", "Ln0/p$a;", "LZ/W;", "lambdasCache", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15883p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final L0.e saveableStateHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<InterfaceC15885r> itemProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final W<Object, a> lambdasCache = i0.c();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"Ln0/p$a;", "", "", "index", "key", "contentType", "<init>", "(Ln0/p;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "c", "()Lkotlin/jvm/functions/Function2;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "e", "<set-?>", "I", "f", "()I", "d", "Lkotlin/jvm/functions/Function2;", "_content", "content", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: n0.p$a */
    private final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object contentType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Function2<? super Composer, ? super Integer, Unit> _content;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: n0.p$a$a, reason: collision with other inner class name */
        static final class C2343a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15883p f151962f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f151963g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: n0.p$a$a$a, reason: collision with other inner class name */
            static final class C2344a extends Lambda implements Function1<F, E> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ a f151964f;

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n0/p$a$a$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: n0.p$a$a$a$a, reason: collision with other inner class name */
                public static final class C2345a implements E {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f151965a;

                    public C2345a(a aVar) {
                        this.f151965a = aVar;
                    }

                    @Override // androidx.compose.runtime.E
                    public void dispose() {
                        this.f151965a._content = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2344a(a aVar) {
                    super(1);
                    this.f151964f = aVar;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(F f10) {
                    return new C2345a(this.f151964f);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2343a(C15883p c15883p, a aVar) {
                super(2);
                this.f151962f = c15883p;
                this.f151963g = aVar;
            }

            public final void a(Composer composer, int i10) {
                Composer composer2;
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:87)");
                }
                InterfaceC15885r interfaceC15885rInvoke = this.f151962f.d().invoke();
                int index = this.f151963g.getIndex();
                if ((index >= interfaceC15885rInvoke.a() || !Intrinsics.e(interfaceC15885rInvoke.d(index), this.f151963g.getKey())) && (index = interfaceC15885rInvoke.c(this.f151963g.getKey())) != -1) {
                    this.f151963g.index = index;
                }
                int i11 = index;
                if (i11 != -1) {
                    composer.startReplaceGroup(-660404355);
                    composer2 = composer;
                    C15884q.a(interfaceC15885rInvoke, C15866Z.a(this.f151962f.saveableStateHolder), i11, C15866Z.a(this.f151963g.getKey()), composer2, 0);
                    composer2.P();
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(-660169871);
                    composer2.P();
                }
                Object key = this.f151963g.getKey();
                boolean zD = composer2.D(this.f151963g);
                a aVar = this.f151963g;
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C2344a(aVar);
                    composer2.t(objB);
                }
                J.c(key, (Function1) objB, composer2, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i10;
        }

        private final Function2<Composer, Integer, Unit> c() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new C2343a(C15883p.this, this));
        }

        public final Function2<Composer, Integer, Unit> d() {
            Function2 function2 = this._content;
            if (function2 != null) {
                return function2;
            }
            Function2<Composer, Integer, Unit> function2C = c();
            this._content = function2C;
            return function2C;
        }

        /* renamed from: e, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* renamed from: f, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: g, reason: from getter */
        public final Object getKey() {
            return this.key;
        }
    }

    public final Object c(Object key) {
        if (key == null) {
            return null;
        }
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null) {
            return aVarE.getContentType();
        }
        InterfaceC15885r interfaceC15885rInvoke = this.itemProvider.invoke();
        int iC = interfaceC15885rInvoke.c(key);
        if (iC != -1) {
            return interfaceC15885rInvoke.f(iC);
        }
        return null;
    }

    public final Function2<Composer, Integer, Unit> b(int index, Object key, Object contentType) {
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null && aVarE.getIndex() == index && Intrinsics.e(aVarE.getContentType(), contentType)) {
            return aVarE.d();
        }
        a aVar = new a(index, key, contentType);
        this.lambdasCache.x(key, aVar);
        return aVar.d();
    }

    public final Function0<InterfaceC15885r> d() {
        return this.itemProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15883p(L0.e eVar, Function0<? extends InterfaceC15885r> function0) {
        this.saveableStateHolder = eVar;
        this.itemProvider = function0;
    }
}
