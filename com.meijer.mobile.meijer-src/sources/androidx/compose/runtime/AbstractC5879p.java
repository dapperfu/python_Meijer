package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/p;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/G0;", "value", "Landroidx/compose/runtime/E1;", "previous", "b", "(Landroidx/compose/runtime/G0;Landroidx/compose/runtime/E1;)Landroidx/compose/runtime/E1;", "a", "Landroidx/compose/runtime/E1;", "()Landroidx/compose/runtime/E1;", "defaultValueHolder", "Landroidx/compose/runtime/F0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5879p<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final E1<T> defaultValueHolder;

    public /* synthetic */ AbstractC5879p(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public abstract E1<T> b(G0<T> value, E1<T> previous);

    private AbstractC5879p(Function0<? extends T> function0) {
        this.defaultValueHolder = new Y(function0);
    }

    public E1<T> a() {
        return this.defaultValueHolder;
    }
}
