package androidx.compose.runtime;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH ¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH ¢\u0006\u0004\b!\u0010 J+\u0010&\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H ¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b*\u0010\fR\u0014\u0010.\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0016\u0010:\u001a\u0004\u0018\u0001078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/runtime/k;", "", "<init>", "()V", "Landroidx/compose/runtime/z;", "composition", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/runtime/z;Lkotlin/jvm/functions/Function2;)V", "k", "(Landroidx/compose/runtime/z;)V", "", "LO0/a;", "table", "n", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/Composer;", "composer", "o", "(Landroidx/compose/runtime/Composer;)V", "r", "s", "Landroidx/compose/runtime/y0;", "f", "()Landroidx/compose/runtime/y0;", "q", "c", "Landroidx/compose/runtime/g0;", "reference", "j", "(Landroidx/compose/runtime/g0;)V", "b", "Landroidx/compose/runtime/f0;", "data", "Landroidx/compose/runtime/Applier;", "applier", "l", "(Landroidx/compose/runtime/g0;Landroidx/compose/runtime/f0;Landroidx/compose/runtime/Applier;)V", "m", "(Landroidx/compose/runtime/g0;)Landroidx/compose/runtime/f0;", "p", "", "g", "()I", "compoundHashKey", "", "e", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "d", "collectingCallByInformation", "Landroidx/compose/runtime/u;", "i", "()Landroidx/compose/runtime/u;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5869k {
    public abstract void a(InterfaceC5898z composition, Function2<? super Composer, ? super Integer, Unit> content);

    public abstract void b(C5862g0 reference);

    public void c() {
    }

    public abstract boolean d();

    public abstract boolean e();

    public abstract int g();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    /* renamed from: h */
    public abstract CoroutineContext getEffectCoroutineContext();

    public C5888u i() {
        return null;
    }

    public abstract void j(C5862g0 reference);

    public abstract void k(InterfaceC5898z composition);

    public abstract void l(C5862g0 reference, C5860f0 data, Applier<?> applier);

    public C5860f0 m(C5862g0 reference) {
        return null;
    }

    public void n(Set<O0.a> table) {
    }

    public void o(Composer composer) {
    }

    public abstract void p(InterfaceC5898z composition);

    public void q() {
    }

    public void r(Composer composer) {
    }

    public abstract void s(InterfaceC5898z composition);

    public InterfaceC5897y0 f() {
        return C5871l.f50510a;
    }
}
