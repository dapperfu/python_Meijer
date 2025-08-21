package androidx.compose.runtime;

import E0.f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0012J/\u0010\t\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/y0;", "LE0/f;", "Landroidx/compose/runtime/p;", "", "Landroidx/compose/runtime/E1;", "Landroidx/compose/runtime/s;", "Landroidx/compose/runtime/q;", "key", "value", "l", "(Landroidx/compose/runtime/p;Landroidx/compose/runtime/E1;)Landroidx/compose/runtime/y0;", "Landroidx/compose/runtime/y0$a;", "builder", "()Landroidx/compose/runtime/y0$a;", "T", "e", "(Landroidx/compose/runtime/p;)Ljava/lang/Object;", "currentValue", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5897y0 extends E0.f<AbstractC5879p<Object>, E1<Object>>, InterfaceC5884s, InterfaceC5881q {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/y0$a;", "LE0/f$a;", "Landroidx/compose/runtime/p;", "", "Landroidx/compose/runtime/E1;", "Landroidx/compose/runtime/y0;", "build", "()Landroidx/compose/runtime/y0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.y0$a */
    public interface a extends f.a<AbstractC5879p<Object>, E1<Object>> {
        @Override // E0.f.a
        E0.f<AbstractC5879p<Object>, E1<Object>> build();
    }

    @Override // E0.f
    f.a<AbstractC5879p<Object>, E1<Object>> builder();

    InterfaceC5897y0 l(AbstractC5879p<Object> key, E1<Object> value);

    @Override // androidx.compose.runtime.InterfaceC5881q
    default <T> T e(AbstractC5879p<T> abstractC5879p) {
        return (T) C5886t.b(this, abstractC5879p);
    }
}
