package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import m1.C15541a;
import m1.C15543c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/O;", "Landroidx/compose/ui/platform/H1;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "e", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "c", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "a", "Landroid/view/View;", "Landroid/view/ActionMode;", "Landroid/view/ActionMode;", "actionMode", "Lm1/c;", "Lm1/c;", "textActionModeCallback", "Landroidx/compose/ui/platform/J1;", "<set-?>", "d", "Landroidx/compose/ui/platform/J1;", "()Landroidx/compose/ui/platform/J1;", "status", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O implements H1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ActionMode actionMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15543c textActionModeCallback = new C15543c(new a(), null, null, null, null, null, null, 126, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private J1 status = J1.f51826b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O.this.actionMode = null;
        }
    }

    @Override // androidx.compose.ui.platform.H1
    public void c(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
        e(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, null);
    }

    @Override // androidx.compose.ui.platform.H1
    /* renamed from: a, reason: from getter */
    public J1 getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.H1
    public void b() {
        this.status = J1.f51826b;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.H1
    public void e(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested, Function0<Unit> onAutofillRequested) {
        this.textActionModeCallback.m(rect);
        this.textActionModeCallback.i(onCopyRequested);
        this.textActionModeCallback.j(onCutRequested);
        this.textActionModeCallback.k(onPasteRequested);
        this.textActionModeCallback.l(onSelectAllRequested);
        this.textActionModeCallback.h(onAutofillRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = J1.f51825a;
            this.actionMode = I1.f51822a.a(this.view, new C15541a(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public O(View view) {
        this.view = view;
    }
}
