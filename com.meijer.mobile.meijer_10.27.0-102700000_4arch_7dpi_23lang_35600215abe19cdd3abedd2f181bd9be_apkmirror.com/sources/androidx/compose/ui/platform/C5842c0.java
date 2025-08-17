package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/c0;", "", "<init>", "()V", "Landroid/content/ClipboardManager;", "clipboardManager", "", "a", "(Landroid/content/ClipboardManager;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5842c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5842c0 f52042a = new C5842c0();

    private C5842c0() {
    }

    @JvmStatic
    public static final void a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
