package androidx.compose.ui.platform;

import androidx.compose.runtime.InterfaceC5730l0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR+\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/S0;", "Landroidx/compose/ui/platform/W1;", "<init>", "()V", "Lkotlin/Function0;", "LH1/r;", "onInitializeContainerSize", "", "e", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/l0;", "b", "Landroidx/compose/runtime/l0;", "_containerSize", "", "<set-?>", "c", "()Z", "f", "(Z)V", "isWindowFocused", "Lg1/N;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "d", "(I)V", "keyboardModifiers", "()J", "containerSize", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class S0 implements W1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function0<H1.r> onInitializeContainerSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5730l0<H1.r> _containerSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isWindowFocused = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.W1
    public long a() {
        if (this._containerSize == null) {
            Function0<H1.r> function0 = this.onInitializeContainerSize;
            this._containerSize = androidx.compose.runtime.t1.e(H1.r.b(function0 != null ? function0.invoke().getPackedValue() : H1.r.INSTANCE.a()), null, 2, null);
            this.onInitializeContainerSize = null;
        }
        InterfaceC5730l0<H1.r> interfaceC5730l0 = this._containerSize;
        Intrinsics.g(interfaceC5730l0);
        return interfaceC5730l0.getValue().getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.W1
    public boolean b() {
        return ((Boolean) this.isWindowFocused.getValue()).booleanValue();
    }

    public void d(int i10) {
        X1.INSTANCE.a().setValue(g1.N.a(i10));
    }

    public final void e(Function0<H1.r> onInitializeContainerSize) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = onInitializeContainerSize;
        }
    }

    public void f(boolean z10) {
        this.isWindowFocused.setValue(Boolean.valueOf(z10));
    }
}
