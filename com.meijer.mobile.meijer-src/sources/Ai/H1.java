package Ai;

import androidx.compose.runtime.Composer;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ=\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J=\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bJ%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH&¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"LAi/H1;", "LJi/h;", "Lki/q1$j;", "template", "", "value", "", "d", "(Lki/q1$j;Ljava/lang/String;)V", "i", "Lki/q1$h$b;", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lkotlin/Function0;", "onClick", "g", "(Lki/q1$h$b;LKi/C;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "q0", "n", "f", "Lki/q1$i;", "content", "e", "(Lki/q1$i;Lkotlin/jvm/functions/Function2;)V", "D", "(Lkotlin/jvm/functions/Function2;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface H1 extends Ji.h {
    void D(Function2<? super Composer, ? super Integer, Unit> content);

    void d(q1.Label template, String value);

    void e(q1.InfoBlock template, Function2<? super Composer, ? super Integer, Unit> content);

    void f(q1.Label template, String value);

    void g(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick);

    void i(q1.Label template, String value);

    void n(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick);

    void q0(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void L(H1 h12, q1.h.DrawableIcon drawableIcon, Ki.C c10, String str, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leadingIcon");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        h12.n(drawableIcon, c10, str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g0(H1 h12, q1.h.DrawableIcon drawableIcon, Ki.C c10, String str, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: labelIcon");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        h12.g(drawableIcon, c10, str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void z(H1 h12, q1.h.DrawableIcon drawableIcon, Ki.C c10, String str, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trailingIcon");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        h12.q0(drawableIcon, c10, str, function0);
    }
}
