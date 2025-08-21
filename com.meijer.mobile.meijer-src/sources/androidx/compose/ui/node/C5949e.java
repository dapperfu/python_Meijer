package androidx.compose.ui.node;

import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/e;", "Landroidx/compose/ui/focus/u;", "<init>", "()V", "", "n", "()Z", "", "o", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "i", "g", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5949e implements androidx.compose.ui.focus.u {

    /* renamed from: a, reason: collision with root package name */
    public static final C5949e f51735a = new C5949e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Boolean canFocusValue;

    public final void o() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.u
    public boolean i() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        C14920a.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final boolean n() {
        return canFocusValue != null;
    }

    private C5949e() {
    }

    @Override // androidx.compose.ui.focus.u
    public void g(boolean z10) {
        canFocusValue = Boolean.valueOf(z10);
    }
}
