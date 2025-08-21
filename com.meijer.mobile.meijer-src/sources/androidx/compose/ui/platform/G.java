package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/G;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f52040a = new G();

    public final void b(View view) {
        view.setViewTranslationCallback(D.a(C.f51990a));
    }

    private G() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }
}
