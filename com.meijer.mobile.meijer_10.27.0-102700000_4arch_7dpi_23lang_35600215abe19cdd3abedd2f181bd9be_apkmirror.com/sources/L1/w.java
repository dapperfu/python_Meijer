package L1;

import L1.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\b\u0000\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eR$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R-\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR-\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R$\u0010#\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b\"\u0004\b\u001f\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"LL1/w;", "LL1/v$a;", "LL1/v$d;", "LL1/v$c;", "LL1/v;", "Lkotlin/Function1;", "LL1/B;", "LO1/b;", "Landroidx/constraintlayout/compose/SolverDimension;", "baseDimension", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "g", "(LL1/B;)LO1/b;", "b", "Lkotlin/jvm/functions/Function1;", "LH1/h;", "c", "LH1/h;", "()LH1/h;", "setMin-YLDhkOg", "(LH1/h;)V", "min", "", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "f", "(Ljava/lang/Object;)V", "minSymbol", "e", "a", "setMax-YLDhkOg", "max", "maxSymbol", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class w implements v.a, v.d, v.c, v {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<B, O1.b> baseDimension;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private H1.h min;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object minSymbol;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private H1.h max;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object maxSymbol;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Function1<? super B, ? extends O1.b> baseDimension) {
        Intrinsics.j(baseDimension, "baseDimension");
        this.baseDimension = baseDimension;
    }

    /* renamed from: a, reason: from getter */
    public final H1.h getMax() {
        return this.max;
    }

    /* renamed from: b, reason: from getter */
    public final Object getMaxSymbol() {
        return this.maxSymbol;
    }

    /* renamed from: c, reason: from getter */
    public final H1.h getMin() {
        return this.min;
    }

    /* renamed from: d, reason: from getter */
    public final Object getMinSymbol() {
        return this.minSymbol;
    }

    public final void e(Object obj) {
        this.maxSymbol = obj;
    }

    public final void f(Object obj) {
        this.minSymbol = obj;
    }

    public final O1.b g(B state) {
        Intrinsics.j(state, "state");
        O1.b bVarInvoke = this.baseDimension.invoke(state);
        if (getMinSymbol() != null) {
            bVarInvoke.m(getMinSymbol());
        } else if (getMin() != null) {
            H1.h min = getMin();
            Intrinsics.g(min);
            bVarInvoke.l(state.c(min));
        }
        if (getMaxSymbol() != null) {
            bVarInvoke.k(getMaxSymbol());
            return bVarInvoke;
        }
        if (getMax() != null) {
            H1.h max = getMax();
            Intrinsics.g(max);
            bVarInvoke.j(state.c(max));
        }
        return bVarInvoke;
    }
}
