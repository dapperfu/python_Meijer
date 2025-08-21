package a1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"La1/l;", "", "<init>", "()V", "", "c", "LX0/f;", "a", "(LX0/f;)V", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "d", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "La1/c;", "La1/g;", "La1/m;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function1<? super l, Unit> invalidateListener;

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(X0.f fVar);

    private l() {
    }

    public Function1<l, Unit> b() {
        return this.invalidateListener;
    }

    public void d(Function1<? super l, Unit> function1) {
        this.invalidateListener = function1;
    }

    public final void c() {
        Function1<l, Unit> function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }
}
