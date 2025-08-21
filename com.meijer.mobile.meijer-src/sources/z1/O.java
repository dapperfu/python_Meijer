package z1;

import androidx.compose.ui.text.input.ImeOptions;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Deprecated
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lz1/O;", "", "Lz1/I;", "platformTextInputService", "<init>", "(Lz1/I;)V", "Lz1/M;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Lz1/i;", "", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "Lz1/T;", "d", "(Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/T;", "e", "()V", "session", "g", "(Lz1/T;)V", "f", "c", "b", "a", "Lz1/I;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()Lz1/T;", "currentInputSession", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I platformTextInputService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<T> _currentInputSession = new AtomicReference<>(null);

    public final T a() {
        return this._currentInputSession.get();
    }

    @Deprecated
    public final void b() {
        this.platformTextInputService.c();
    }

    public T d(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        this.platformTextInputService.d(value, imeOptions, onEditCommand, onImeActionPerformed);
        T t10 = new T(this, this.platformTextInputService);
        this._currentInputSession.set(t10);
        return t10;
    }

    public final void e() {
        this.platformTextInputService.a();
        this._currentInputSession.set(new T(this, this.platformTextInputService));
    }

    public final void f() {
        this._currentInputSession.set(null);
        this.platformTextInputService.b();
    }

    public void g(T session) {
        if (U.d.a(this._currentInputSession, session, null)) {
            this.platformTextInputService.b();
        }
    }

    public O(I i10) {
        this.platformTextInputService = i10;
    }

    @Deprecated
    public final void c() {
        if (a() != null) {
            this.platformTextInputService.f();
        }
    }
}
