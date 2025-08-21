package G6;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LG6/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lpv/g;", "owner", "<init>", "(Lpv/g;)V", "", "a", "Lpv/g;", "getOwner", "()Lpv/g;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16562g<?> owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC16562g<?> owner) {
        super("Flow was aborted, no more elements needed");
        Intrinsics.j(owner, "owner");
        this.owner = owner;
    }

    public final void a(InterfaceC16562g<?> owner) {
        Intrinsics.j(owner, "owner");
        if (this.owner != owner) {
            throw this;
        }
    }
}
