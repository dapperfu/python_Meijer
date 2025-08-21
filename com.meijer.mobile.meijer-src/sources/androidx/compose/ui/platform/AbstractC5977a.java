package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/f;", "<init>", "()V", "", "text", "", "e", "(Ljava/lang/String;)V", "", "start", "end", "", "c", "(II)[I", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "b", "[I", "segment", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5977a implements InterfaceC5992f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    protected String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] segment = new int[2];

    protected final int[] c(int start, int end) {
        if (start < 0 || end < 0 || start == end) {
            return null;
        }
        int[] iArr = this.segment;
        iArr[0] = start;
        iArr[1] = end;
        return iArr;
    }

    protected final String d() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        Intrinsics.x("text");
        return null;
    }

    protected final void f(String str) {
        this.text = str;
    }

    public void e(String text) {
        f(text);
    }
}
