package k1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lk1/c;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lk1/l;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<T> defaultFactory;

    public /* synthetic */ c(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(Function0<? extends T> function0) {
        this.defaultFactory = function0;
    }

    public final Function0<T> a() {
        return this.defaultFactory;
    }
}
