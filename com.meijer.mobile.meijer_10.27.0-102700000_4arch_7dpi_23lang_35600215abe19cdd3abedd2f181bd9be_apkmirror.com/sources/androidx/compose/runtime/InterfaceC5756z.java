package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u00032\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0018H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H&¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0003H&¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0003H&¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u0003H&¢\u0006\u0004\b'\u0010#J5\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u00010\u00002\u0006\u0010+\u001a\u00020*2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017\u0082\u0001\u00010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/j;", "Lkotlin/Function0;", "", "content", "b", "(Lkotlin/jvm/functions/Function2;)V", "", "", "values", "n", "(Ljava/util/Set;)V", "", "j", "(Ljava/util/Set;)Z", "block", "m", "(Lkotlin/jvm/functions/Function0;)V", "value", "a", "(Ljava/lang/Object;)V", "r", "i", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/g0;", "references", "f", "(Ljava/util/List;)V", "Landroidx/compose/runtime/f0;", "state", "e", "(Landroidx/compose/runtime/f0;)V", "o", "()V", "c", "u", "t", "v", "R", "to", "", "groupIndex", "g", "(Landroidx/compose/runtime/z;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "p", "isComposing", "Landroidx/compose/runtime/n;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5756z extends InterfaceC5725j {
    void a(Object value);

    void b(Function2<? super Composer, ? super Integer, Unit> content);

    void c();

    void e(C5718f0 state);

    void f(List<Pair<C5720g0, C5720g0>> references);

    <R> R g(InterfaceC5756z to2, int groupIndex, Function0<? extends R> block);

    boolean i();

    boolean j(Set<? extends Object> values);

    void m(Function0<Unit> block);

    void n(Set<? extends Object> values);

    void o();

    boolean p();

    void r(Object value);

    void t();

    void u();

    void v();
}
