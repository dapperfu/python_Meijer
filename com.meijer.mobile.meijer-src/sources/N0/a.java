package N0;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LN0/a;", "", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public a(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        this.readObserver = function1;
        this.writeObserver = function12;
    }

    public final Function1<Object, Unit> a() {
        return this.readObserver;
    }

    public final Function1<Object, Unit> b() {
        return this.writeObserver;
    }

    public /* synthetic */ a(Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function12);
    }
}
