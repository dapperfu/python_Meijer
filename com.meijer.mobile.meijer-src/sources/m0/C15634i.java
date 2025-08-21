package m0;

import Z.AbstractC5617o;
import Z.C5618p;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.AbstractC15880m;
import kotlin.C15857P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 72\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001#B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJW\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J°\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018¢\u0006\u0002\b\u00062#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042,\u0010\u0019\u001a(\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lm0/i;", "Lm0/C;", "Ln0/m;", "Lm0/h;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "Lm0/p;", "Lm0/c;", "span", "contentType", "Lm0/n;", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "h", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lm0/H;", "a", "Lm0/H;", "q", "()Lm0/H;", "spanLayoutProvider", "Ln0/P;", "b", "Ln0/P;", "p", "()Ln0/P;", "intervals", "", "Z", "n", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "hasCustomSpans", "LZ/J;", "d", "LZ/J;", "_headerIndexes", "LZ/o;", "o", "()LZ/o;", "headerIndexes", "e", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15634i extends AbstractC15880m<C15633h> implements InterfaceC15617C {

    /* renamed from: e, reason: collision with root package name */
    private static final b f150351e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f150352f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final Function2<InterfaceC15641p, Integer, C15628c> f150353g = a.f150358f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15622H spanLayoutProvider = new C15622H(this);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15857P<C15633h> intervals = new C15857P<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasCustomSpans;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Z.J _headerIndexes;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/p;", "", "it", "Lm0/c;", "a", "(Lm0/p;I)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.i$a */
    static final class a extends Lambda implements Function2<InterfaceC15641p, Integer, C15628c> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f150358f = new a();

        a() {
            super(2);
        }

        public final long a(InterfaceC15641p interfaceC15641p, int i10) {
            return C15621G.a(1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C15628c invoke(InterfaceC15641p interfaceC15641p, Integer num) {
            return C15628c.a(a(interfaceC15641p, num.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm0/i$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.i$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.i$c */
    static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f150359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f150359f = obj;
        }

        public final Object a(int i10) {
            return this.f150359f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/p;", "", "it", "Lm0/c;", "a", "(Lm0/p;I)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.i$d */
    static final class d extends Lambda implements Function2<InterfaceC15641p, Integer, C15628c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC15641p, C15628c> f150360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super InterfaceC15641p, C15628c> function1) {
            super(2);
            this.f150360f = function1;
        }

        public final long a(InterfaceC15641p interfaceC15641p, int i10) {
            return this.f150360f.invoke(interfaceC15641p).getPackedValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C15628c invoke(InterfaceC15641p interfaceC15641p, Integer num) {
            return C15628c.a(a(interfaceC15641p, num.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.i$e */
    static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f150361f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.f150361f = obj;
        }

        public final Object a(int i10) {
            return this.f150361f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.i$f */
    static final class f extends Lambda implements Function4<InterfaceC15639n, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC15639n, Composer, Integer, Unit> f150362f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function3<? super InterfaceC15639n, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f150362f = function3;
        }

        public final void a(InterfaceC15639n interfaceC15639n, int i10, Composer composer, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= composer.V(interfaceC15639n) ? 4 : 2;
            }
            if (!composer.p((i11 & 131) != 130, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-34608120, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            this.f150362f.invoke(interfaceC15639n, composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Integer num, Composer composer, Integer num2) {
            a(interfaceC15639n, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* renamed from: n, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final AbstractC5617o o() {
        Z.J j10 = this._headerIndexes;
        return j10 != null ? j10 : C5618p.a();
    }

    @Override // kotlin.AbstractC15880m
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C15857P<C15633h> k() {
        return this.intervals;
    }

    /* renamed from: q, reason: from getter */
    public final C15622H getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }

    public C15634i(Function1<? super InterfaceC15617C, Unit> function1) {
        function1.invoke(this);
    }

    @Override // m0.InterfaceC15617C
    public void c(Object key, Function1<? super InterfaceC15641p, C15628c> span, Object contentType, Function3<? super InterfaceC15639n, ? super Composer, ? super Integer, Unit> content) {
        c cVar;
        Function2 dVar;
        C15857P<C15633h> c15857pK = k();
        if (key != null) {
            cVar = new c(key);
        } else {
            cVar = null;
        }
        if (span != null) {
            dVar = new d(span);
        } else {
            dVar = f150353g;
        }
        c15857pK.b(1, new C15633h(cVar, dVar, new e(contentType), ComposableLambdaKt.composableLambdaInstance(-34608120, true, new f(content))));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // m0.InterfaceC15617C
    public void h(int count, Function1<? super Integer, ? extends Object> key, Function2<? super InterfaceC15641p, ? super Integer, C15628c> span, Function1<? super Integer, ? extends Object> contentType, Function4<? super InterfaceC15639n, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Function2<? super InterfaceC15641p, ? super Integer, C15628c> function2;
        C15857P<C15633h> c15857pK = k();
        if (span == null) {
            function2 = f150353g;
        } else {
            function2 = span;
        }
        c15857pK.b(count, new C15633h(key, function2, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }
}
