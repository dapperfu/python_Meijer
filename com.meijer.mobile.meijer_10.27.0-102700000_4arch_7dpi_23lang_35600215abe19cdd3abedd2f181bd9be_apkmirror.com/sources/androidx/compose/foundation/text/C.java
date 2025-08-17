package androidx.compose.foundation.text;

import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.InterfaceC5726j0;
import h0.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/C;", "", "Lh0/j;", "interactionSource", "<init>", "(Lh0/j;)V", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lh0/j;", "", "b", "I", "Focused", "c", "Hovered", "d", "Pressed", "Landroidx/compose/runtime/j0;", "Landroidx/compose/runtime/j0;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0.j interactionSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int Focused = 1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int Hovered = 2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int Pressed = 4;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 interactionState = C5702c1.a(0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.T<h0.i> f49018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f49019b;

        a(Z.T<h0.i> t10, C c10) {
            this.f49018a = t10;
            this.f49019b = c10;
        }

        @Override // tv.InterfaceC17153g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
            int i10;
            if (iVar instanceof h0.g ? true : iVar instanceof h0.d ? true : iVar instanceof n.b) {
                this.f49018a.n(iVar);
            } else if (iVar instanceof h0.h) {
                this.f49018a.y(((h0.h) iVar).getEnter());
            } else if (iVar instanceof h0.e) {
                this.f49018a.y(((h0.e) iVar).getFocus());
            } else if (iVar instanceof n.c) {
                this.f49018a.y(((n.c) iVar).getPress());
            } else if (iVar instanceof n.a) {
                this.f49018a.y(((n.a) iVar).getPress());
            }
            Z.T<h0.i> t10 = this.f49018a;
            C c10 = this.f49019b;
            Object[] objArr = t10.content;
            int i11 = t10._size;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                h0.i iVar2 = (h0.i) objArr[i13];
                if (iVar2 instanceof h0.g) {
                    i10 = c10.Hovered;
                } else if (iVar2 instanceof h0.d) {
                    i10 = c10.Focused;
                } else if (iVar2 instanceof n.b) {
                    i10 = c10.Pressed;
                }
                i12 |= i10;
            }
            this.f49019b.interactionState.j(i12);
            return Unit.f142422a;
        }
    }

    public final Object e(Continuation<? super Unit> continuation) {
        Object objCollect = this.interactionSource.b().collect(new a(new Z.T(0, 1, null), this), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }

    public final boolean f() {
        return (this.interactionState.a() & this.Focused) != 0;
    }

    public final boolean g() {
        return (this.interactionState.a() & this.Hovered) != 0;
    }

    public final boolean h() {
        return (this.interactionState.a() & this.Pressed) != 0;
    }

    public C(h0.j jVar) {
        this.interactionSource = jVar;
    }
}
