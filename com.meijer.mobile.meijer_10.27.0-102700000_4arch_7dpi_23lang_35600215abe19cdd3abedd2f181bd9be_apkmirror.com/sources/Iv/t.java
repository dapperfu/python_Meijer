package Iv;

import Jv.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LIv/t;", "LIv/b;", "LIv/g;", "configuration", "LMv/c;", "module", "<init>", "(LIv/g;LMv/c;)V", "", "g", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class t extends AbstractC3761b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(JsonConfiguration configuration, Mv.c module) {
        super(configuration, module, null);
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(module, "module");
        g();
    }

    private final void g() {
        if (Intrinsics.e(getSerializersModule(), Mv.d.a())) {
            return;
        }
        getSerializersModule().a(new M(getConfiguration().getUseArrayPolymorphism(), getConfiguration().getClassDiscriminator()));
    }
}
