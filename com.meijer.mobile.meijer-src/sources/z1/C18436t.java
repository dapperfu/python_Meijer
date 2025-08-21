package z1;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Deprecated
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%¨\u0006'"}, d2 = {"Lz1/t;", "Lz1/s;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "a", "()Z", "", "d", "()V", "f", "g", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "b", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "c", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "e", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "i", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/e;", "Landroidx/core/view/e;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18436t implements InterfaceC18435s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy imm = LazyKt.a(LazyThreadSafetyMode.f143288c, new a());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.core.view.e softwareKeyboardControllerCompat;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "c", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z1.t$a */
    static final class a extends Lambda implements Function0<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = C18436t.this.view.getContext().getSystemService("input_method");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    private final InputMethodManager i() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // z1.InterfaceC18435s
    public void f() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // z1.InterfaceC18435s
    public void g() {
        this.softwareKeyboardControllerCompat.a();
    }

    public C18436t(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new androidx.core.view.e(view);
    }

    @Override // z1.InterfaceC18435s
    public boolean a() {
        return i().isActive(this.view);
    }

    @Override // z1.InterfaceC18435s
    public void b(int token, ExtractedText extractedText) {
        i().updateExtractedText(this.view, token, extractedText);
    }

    @Override // z1.InterfaceC18435s
    public void c(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        i().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // z1.InterfaceC18435s
    public void d() {
        i().restartInput(this.view);
    }

    @Override // z1.InterfaceC18435s
    public void e(CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }
}
