package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18416D;
import z1.InterfaceInputConnectionC18438v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/K0;", "", "Landroidx/compose/ui/platform/b1;", "request", "Lkotlin/Function0;", "", "onAllConnectionsClosed", "<init>", "(Landroidx/compose/ui/platform/b1;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "c", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "d", "()V", "a", "Landroidx/compose/ui/platform/b1;", "b", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "lock", "LD0/c;", "Landroidx/compose/ui/node/F0;", "Lz1/v;", "LD0/c;", "connections", "", "e", "Z", "disposed", "()Z", "isActive", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class K0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5982b1 request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAllConnectionsClosed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private D0.c<androidx.compose.ui.node.F0<InterfaceInputConnectionC18438v>> connections = new D0.c<>(new androidx.compose.ui.node.F0[16], 0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/v;", "closedConnection", "", "a", "(Lz1/v;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<InterfaceInputConnectionC18438v, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceInputConnectionC18438v interfaceInputConnectionC18438v) {
            a(interfaceInputConnectionC18438v);
            return Unit.f143329a;
        }

        public final void a(InterfaceInputConnectionC18438v interfaceInputConnectionC18438v) {
            interfaceInputConnectionC18438v.a();
            D0.c cVar = K0.this.connections;
            Object[] objArr = cVar.content;
            int size = cVar.getSize();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (Intrinsics.e((androidx.compose.ui.node.F0) objArr[i10], interfaceInputConnectionC18438v)) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                K0.this.connections.u(i10);
            }
            if (K0.this.connections.getSize() == 0) {
                K0.this.onAllConnectionsClosed.invoke();
            }
        }
    }

    public final InputConnection c(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            InterfaceInputConnectionC18438v interfaceInputConnectionC18438vA = C18416D.a(this.request.a(outAttrs), new a());
            this.connections.c(new androidx.compose.ui.node.F0<>(interfaceInputConnectionC18438vA));
            return interfaceInputConnectionC18438vA;
        }
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                D0.c<androidx.compose.ui.node.F0<InterfaceInputConnectionC18438v>> cVar = this.connections;
                androidx.compose.ui.node.F0<InterfaceInputConnectionC18438v>[] f0Arr = cVar.content;
                int size = cVar.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceInputConnectionC18438v interfaceInputConnectionC18438v = f0Arr[i10].get();
                    if (interfaceInputConnectionC18438v != null) {
                        interfaceInputConnectionC18438v.a();
                    }
                }
                this.connections.k();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.disposed;
    }

    public K0(InterfaceC5982b1 interfaceC5982b1, Function0<Unit> function0) {
        this.request = interfaceC5982b1;
        this.onAllConnectionsClosed = function0;
    }
}
