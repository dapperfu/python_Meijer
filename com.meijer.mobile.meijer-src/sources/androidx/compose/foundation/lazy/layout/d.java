package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.C15861U;
import kotlin.InterfaceC15859S;
import kotlin.InterfaceC15862V;
import kotlin.InterfaceC15864X;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0014B0\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R'\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001c\u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "", "Ln0/X;", "prefetchScheduler", "Lkotlin/Function1;", "Ln0/S;", "", "Lkotlin/ExtensionFunctionType;", "onNestedPrefetch", "<init>", "(Ln0/X;Lkotlin/jvm/functions/Function1;)V", "", "index", "LH1/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d$b;", "e", "(IJ)Landroidx/compose/foundation/lazy/layout/d$b;", "", "Ln0/V;", "b", "()Ljava/util/List;", "a", "Ln0/X;", "d", "()Ln0/X;", "Lkotlin/jvm/functions/Function1;", "Ln0/U;", "c", "Ln0/U;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/compose/foundation/lazy/layout/h;", "()Landroidx/compose/foundation/lazy/layout/h;", "f", "(Landroidx/compose/foundation/lazy/layout/h;)V", "prefetchHandleProvider", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15864X prefetchScheduler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC15859S, Unit> onNestedPrefetch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15861U prefetchMetrics;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h prefetchHandleProvider;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$a;", "Ln0/S;", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "", "index", "", "a", "(I)V", "LH1/b;", "constraints", "c", "(IJ)V", "", "Ln0/V;", "Ljava/util/List;", "_requests", "", "b", "()Ljava/util/List;", "requests", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a implements InterfaceC15859S {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC15862V> _requests = new ArrayList();

        public a() {
        }

        public final List<InterfaceC15862V> b() {
            return this._requests;
        }

        public void c(int index, long constraints) {
            h prefetchHandleProvider = d.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider.c(index, constraints, d.this.prefetchMetrics));
        }

        @Override // kotlin.InterfaceC15859S
        public void a(int index) {
            c(index, e.f49064a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$b;", "", "", "cancel", "()V", "a", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/h$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC15864X interfaceC15864X, Function1<? super InterfaceC15859S, Unit> function1) {
        this.prefetchScheduler = interfaceC15864X;
        this.onNestedPrefetch = function1;
        this.prefetchMetrics = new C15861U();
    }

    public final List<InterfaceC15862V> b() {
        Function1<InterfaceC15859S, Unit> function1 = this.onNestedPrefetch;
        if (function1 == null) {
            return CollectionsKt.m();
        }
        a aVar = new a();
        function1.invoke(aVar);
        return aVar.b();
    }

    /* renamed from: c, reason: from getter */
    public final h getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    /* renamed from: d, reason: from getter */
    public final InterfaceC15864X getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final b e(int index, long constraints) {
        b bVarD;
        h hVar = this.prefetchHandleProvider;
        return (hVar == null || (bVarD = hVar.d(index, constraints, this.prefetchMetrics)) == null) ? androidx.compose.foundation.lazy.layout.a.f49006a : bVarD;
    }

    public final void f(h hVar) {
        this.prefetchHandleProvider = hVar;
    }

    public /* synthetic */ d(InterfaceC15864X interfaceC15864X, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC15864X, (i10 & 2) != 0 ? null : function1);
    }
}
