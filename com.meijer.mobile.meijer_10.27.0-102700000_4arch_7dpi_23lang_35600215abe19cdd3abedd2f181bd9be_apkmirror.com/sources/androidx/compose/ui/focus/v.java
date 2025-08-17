package androidx.compose.ui.focus;

import androidx.compose.ui.focus.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0019\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\"\u0010\u001d\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010!\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010%\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\"\u0010'\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b&\u0010\u0011R3\u00100\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(¢\u0006\u0002\b+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\"\u0010/R3\u00103\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(¢\u0006\u0002\b+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010/¨\u00064"}, d2 = {"Landroidx/compose/ui/focus/v;", "Landroidx/compose/ui/focus/u;", "<init>", "()V", "", "a", "Z", "i", "()Z", "g", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/y;", "b", "Landroidx/compose/ui/focus/y;", "()Landroidx/compose/ui/focus/y;", "setNext", "(Landroidx/compose/ui/focus/y;)V", "next", "c", "j", "setPrevious", "previous", "d", "setUp", "up", "e", "f", "setDown", "down", "setLeft", "left", "setRight", "right", "h", "getStart", "setStart", "start", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/g;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onEnter", "l", "m", "onExit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private y next;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private y previous;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private y up;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private y down;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private y left;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private y right;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private y start;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private y end;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1<? super InterfaceC5764g, Unit> onEnter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Function1<? super InterfaceC5764g, Unit> onExit;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<InterfaceC5764g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50687f = new a();

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
        public static final b f50688f = new b();

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

    @Override // androidx.compose.ui.focus.u
    /* renamed from: a, reason: from getter */
    public y getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: b, reason: from getter */
    public y getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: c, reason: from getter */
    public y getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: d, reason: from getter */
    public y getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: e, reason: from getter */
    public y getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: f, reason: from getter */
    public y getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.u
    public void g(boolean z10) {
        this.canFocus = z10;
    }

    @Override // androidx.compose.ui.focus.u
    public y getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.u
    public void h(Function1<? super InterfaceC5764g, Unit> function1) {
        this.onEnter = function1;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: i, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.u
    /* renamed from: j, reason: from getter */
    public y getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.u
    public Function1<InterfaceC5764g, Unit> k() {
        return this.onEnter;
    }

    @Override // androidx.compose.ui.focus.u
    public Function1<InterfaceC5764g, Unit> l() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.u
    public void m(Function1<? super InterfaceC5764g, Unit> function1) {
        this.onExit = function1;
    }

    public v() {
        y.Companion companion = y.INSTANCE;
        this.next = companion.b();
        this.previous = companion.b();
        this.up = companion.b();
        this.down = companion.b();
        this.left = companion.b();
        this.right = companion.b();
        this.start = companion.b();
        this.end = companion.b();
        this.onEnter = a.f50687f;
        this.onExit = b.f50688f;
    }
}
