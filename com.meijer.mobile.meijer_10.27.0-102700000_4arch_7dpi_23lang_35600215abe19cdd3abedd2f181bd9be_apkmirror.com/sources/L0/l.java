package L0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a~\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\"\"\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "LL0/m;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "LL0/k;", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)LL0/k;", "T", "b", "()LL0/k;", "LL0/k;", "AutoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final k<Object, Object> f17619a = a(a.f17620f, b.f17621f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/m;", "", "it", "a", "(LL0/m;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<m, Object, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f17620f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m mVar, Object obj) {
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function1<Object, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f17621f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"L0/l$c", "LL0/k;", "LL0/m;", "value", "a", "(LL0/m;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<Original, Saveable> implements k<Original, Saveable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<m, Original, Saveable> f17622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Saveable, Original> f17623b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super m, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f17622a = function2;
            this.f17623b = function1;
        }

        @Override // L0.k
        public Saveable a(m mVar, Original original) {
            return this.f17622a.invoke(mVar, original);
        }

        @Override // L0.k
        public Original b(Saveable value) {
            return this.f17623b.invoke(value);
        }
    }

    public static final <Original, Saveable> k<Original, Saveable> a(Function2<? super m, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new c(function2, function1);
    }

    public static final <T> k<T, Object> b() {
        k<T, Object> kVar = (k<T, Object>) f17619a;
        Intrinsics.h(kVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return kVar;
    }
}
