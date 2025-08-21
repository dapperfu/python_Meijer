package z1;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lz1/v;", "", "onConnectionClosed", "a", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)Lz1/v;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18416D {
    public static final InterfaceInputConnectionC18438v a(InputConnection inputConnection, Function1<? super InterfaceInputConnectionC18438v, Unit> function1) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 34 ? new C18415C(inputConnection, function1) : i10 >= 25 ? new z(inputConnection, function1) : new x(inputConnection, function1);
    }
}
