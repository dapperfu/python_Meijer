package z1;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz1/z;", "Lz1/x;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lz1/v;", "", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/InputContentInfo;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
class z extends x {
    public z(InputConnection inputConnection, Function1<? super InterfaceInputConnectionC18375v, Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // z1.C18376w, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p02, int p12, Bundle p22) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.commitContent(p02, p12, p22);
        }
        return false;
    }
}
