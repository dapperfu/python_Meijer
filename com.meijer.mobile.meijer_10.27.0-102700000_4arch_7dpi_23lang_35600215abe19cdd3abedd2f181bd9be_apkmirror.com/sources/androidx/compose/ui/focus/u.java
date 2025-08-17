package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRF\u0010,\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RF\u0010/\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/u;", "", "", "i", "()Z", "g", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/y;", "<anonymous parameter 0>", "a", "()Landroidx/compose/ui/focus/y;", "setNext", "(Landroidx/compose/ui/focus/y;)V", "next", "j", "setPrevious", "previous", "d", "setUp", "up", "f", "setDown", "down", "b", "setLeft", "left", "c", "setRight", "right", "getStart", "setStart", "start", "e", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/g;", "", "Lkotlin/ExtensionFunctionType;", "k", "()Lkotlin/jvm/functions/Function1;", "h", "(Lkotlin/jvm/functions/Function1;)V", "onEnter", "l", "m", "onExit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<InterfaceC5764g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50674f = new a();

        a() {
            super(1);
        }

        public final void a(InterfaceC5764g interfaceC5764g) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5764g interfaceC5764g) {
            a(interfaceC5764g);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<InterfaceC5764g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f50675f = new b();

        b() {
            super(1);
        }

        public final void a(InterfaceC5764g interfaceC5764g) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5764g interfaceC5764g) {
            a(interfaceC5764g);
            return Unit.f142422a;
        }
    }

    void g(boolean z10);

    default void h(Function1<? super InterfaceC5764g, Unit> function1) {
    }

    boolean i();

    default void m(Function1<? super InterfaceC5764g, Unit> function1) {
    }

    default y a() {
        return y.INSTANCE.b();
    }

    default y b() {
        return y.INSTANCE.b();
    }

    default y c() {
        return y.INSTANCE.b();
    }

    default y d() {
        return y.INSTANCE.b();
    }

    default y e() {
        return y.INSTANCE.b();
    }

    default y f() {
        return y.INSTANCE.b();
    }

    default y getStart() {
        return y.INSTANCE.b();
    }

    default y j() {
        return y.INSTANCE.b();
    }

    default Function1<InterfaceC5764g, Unit> k() {
        return a.f50674f;
    }

    default Function1<InterfaceC5764g, Unit> l() {
        return b.f50675f;
    }
}
