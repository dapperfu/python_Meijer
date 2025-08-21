package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/v1;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "", "a", "(Landroid/view/RenderNode;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6041v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C6041v1 f52491a = new C6041v1();

    private C6041v1() {
    }

    public final void a(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
