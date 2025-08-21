package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/F0;", "T", "Landroidx/compose/runtime/p;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/G0;", "value", "Landroidx/compose/runtime/E1;", "f", "(Landroidx/compose/runtime/G0;)Landroidx/compose/runtime/E1;", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/G0;", "d", "e", "previous", "b", "(Landroidx/compose/runtime/G0;Landroidx/compose/runtime/E1;)Landroidx/compose/runtime/E1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class F0<T> extends AbstractC5879p<T> {
    public F0(Function0<? extends T> function0) {
        super(function0, null);
    }

    public abstract G0<T> c(T value);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.I) = (r5v5 androidx.compose.runtime.I), (r5v6 androidx.compose.runtime.I) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.AbstractC5879p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.E1<T> b(androidx.compose.runtime.G0<T> r4, androidx.compose.runtime.E1<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.getIsDynamic()
            if (r0 == 0) goto L47
            r1 = r5
            androidx.compose.runtime.I r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.l0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.d()
            androidx.compose.runtime.B1 r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L47
            kotlin.jvm.functions.Function1 r0 = r4.c()
            androidx.compose.runtime.y r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            kotlin.jvm.functions.Function1 r2 = r5.b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            androidx.compose.runtime.E1 r4 = r3.f(r4)
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.F0.b(androidx.compose.runtime.G0, androidx.compose.runtime.E1):androidx.compose.runtime.E1");
    }

    private final E1<T> f(G0<T> value) {
        if (value.getIsDynamic()) {
            InterfaceC5872l0<T> interfaceC5872l0F = value.f();
            if (interfaceC5872l0F == null) {
                T tG = value.g();
                n1<T> n1VarE = value.e();
                if (n1VarE == null) {
                    n1VarE = o1.r();
                }
                interfaceC5872l0F = o1.i(tG, n1VarE);
            }
            return new DynamicValueHolder(interfaceC5872l0F);
        }
        if (value.c() != null) {
            return new ComputedValueHolder(value.c());
        }
        if (value.f() != null) {
            return new DynamicValueHolder(value.f());
        }
        return new StaticValueHolder(value.d());
    }

    public final G0<T> d(T value) {
        return c(value);
    }

    public final G0<T> e(T value) {
        return c(value).h();
    }
}
