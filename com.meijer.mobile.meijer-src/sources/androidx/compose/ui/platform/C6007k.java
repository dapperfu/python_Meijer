package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/k;", "Landroidx/compose/ui/platform/r0;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "c", "()Z", "Landroidx/compose/ui/platform/p0;", "b", "()Landroidx/compose/ui/platform/p0;", "clipEntry", "d", "(Landroidx/compose/ui/platform/p0;)V", "Landroid/content/ClipboardManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6007k implements InterfaceC6028r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClipboardManager clipboardManager;

    public C6007k(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6028r0
    public void a(AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", C6010l.a(annotatedString)));
    }

    public C6023p0 b() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return new C6023p0(primaryClip);
        }
        return null;
    }

    public boolean c() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void d(C6023p0 clipEntry) {
        if (clipEntry != null) {
            this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
        } else if (Build.VERSION.SDK_INT >= 28) {
            C5984c0.a(this.clipboardManager);
        } else {
            this.clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6007k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
