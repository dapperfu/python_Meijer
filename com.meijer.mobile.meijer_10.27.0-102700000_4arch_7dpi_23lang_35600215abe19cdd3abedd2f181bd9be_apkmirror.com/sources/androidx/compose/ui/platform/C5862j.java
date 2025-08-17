package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/j;", "Landroidx/compose/ui/platform/q0;", "Landroidx/compose/ui/platform/k;", "androidClipboardManager", "<init>", "(Landroidx/compose/ui/platform/k;)V", "Landroidx/compose/ui/platform/p0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clipEntry", "", "b", "(Landroidx/compose/ui/platform/p0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5862j implements InterfaceC5884q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5865k androidClipboardManager;

    @Override // androidx.compose.ui.platform.InterfaceC5884q0
    public Object a(Continuation<? super C5881p0> continuation) {
        return this.androidClipboardManager.b();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5884q0
    public Object b(C5881p0 c5881p0, Continuation<? super Unit> continuation) {
        this.androidClipboardManager.d(c5881p0);
        return Unit.f142422a;
    }

    public C5862j(C5865k c5865k) {
        this.androidClipboardManager = c5865k;
    }
}
