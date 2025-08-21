package c1;

import android.view.View;
import c1.C6471b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lc1/c;", "Lc1/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lc1/b;", "hapticFeedbackType", "", "a", "(I)V", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6472c implements InterfaceC6470a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    @Override // c1.InterfaceC6470a
    public void a(int hapticFeedbackType) {
        C6471b.Companion companion = C6471b.INSTANCE;
        if (C6471b.b(hapticFeedbackType, companion.a())) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.b())) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.c())) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.d())) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.e())) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.f())) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.g())) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.h())) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.i())) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (C6471b.b(hapticFeedbackType, companion.j())) {
            this.view.performHapticFeedback(22);
        } else if (C6471b.b(hapticFeedbackType, companion.k())) {
            this.view.performHapticFeedback(21);
        } else if (C6471b.b(hapticFeedbackType, companion.l())) {
            this.view.performHapticFeedback(1);
        }
    }

    public C6472c(View view) {
        this.view = view;
    }
}
