package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/x;", "T", "Landroidx/compose/runtime/F0;", "Lkotlin/Function1;", "Landroidx/compose/runtime/q;", "Lkotlin/ExtensionFunctionType;", "defaultComputation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "Landroidx/compose/runtime/G0;", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/G0;", "Landroidx/compose/runtime/y;", "b", "Landroidx/compose/runtime/y;", "g", "()Landroidx/compose/runtime/y;", "defaultValueHolder", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5894x<T> extends F0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComputedValueHolder<T> defaultValueHolder;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.x$a */
    static final class a extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50720f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            ComposerKt.u("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public C5894x(Function1<? super InterfaceC5881q, ? extends T> function1) {
        super(a.f50720f);
        this.defaultValueHolder = new ComputedValueHolder<>(function1);
    }

    @Override // androidx.compose.runtime.F0
    public G0<T> c(T value) {
        return new G0<>(this, value, value == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.AbstractC5879p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ComputedValueHolder<T> a() {
        return this.defaultValueHolder;
    }
}
