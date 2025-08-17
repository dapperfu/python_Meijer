package Ai;

import androidx.compose.runtime.Composer;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\bJ%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LAi/n0;", "LIi/h;", "Lji/q1$j;", "template", "", "value", "", "d", "(Lji/q1$j;Ljava/lang/String;)V", "i", "Lji/q1$h$b;", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lkotlin/Function0;", "onClick", "g", "(Lji/q1$h$b;LJi/C;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "e", "Lji/q1$i;", "content", "f", "(Lji/q1$i;Lkotlin/jvm/functions/Function2;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface n0 extends Ii.h {
    void d(q1.Label template, String value);

    void e(q1.Label template, String value);

    void f(q1.InfoBlock template, Function2<? super Composer, ? super Integer, Unit> content);

    void g(q1.h.DrawableIcon template, Ji.C icon, String contentDescription, Function0<Unit> onClick);

    void i(q1.Label template, String value);
}
