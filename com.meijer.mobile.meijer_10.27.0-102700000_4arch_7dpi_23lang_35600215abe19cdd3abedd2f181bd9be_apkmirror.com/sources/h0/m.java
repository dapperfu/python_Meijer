package h0;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import sv.EnumC17050a;
import tv.C17146H;
import tv.InterfaceC17139A;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh0/m;", "Lh0/l;", "<init>", "()V", "Lh0/i;", "interaction", "", "c", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lh0/i;)Z", "Ltv/A;", "Ltv/A;", "d", "()Ltv/A;", "interactions", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class m implements l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<i> interactions = C17146H.b(0, 16, EnumC17050a.f161241b, 1, null);

    @Override // h0.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC17139A<i> b() {
        return this.interactions;
    }

    @Override // h0.l
    public boolean a(i interaction) {
        return b().b(interaction);
    }

    @Override // h0.l
    public Object c(i iVar, Continuation<? super Unit> continuation) {
        Object objEmit = b().emit(iVar, continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f142422a;
    }
}
