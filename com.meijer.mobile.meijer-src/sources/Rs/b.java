package Rs;

import Ev.AbstractC3260b;
import Ev.C;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LRs/b;", "LRs/a;", "LEv/C;", "claims", "LEv/b;", "json", "<init>", "(LEv/C;LEv/b;)V", "T", "Lzv/a;", "deserializationStrategy", "a", "(Lzv/a;)Ljava/lang/Object;", "LEv/C;", "b", "LEv/b;", "c", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C claims;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3260b json;

    public b(C claims, AbstractC3260b json) {
        Intrinsics.j(claims, "claims");
        Intrinsics.j(json, "json");
        this.claims = claims;
        this.json = json;
    }

    @Override // Rs.a
    public <T> T a(InterfaceC18555a<? extends T> deserializationStrategy) {
        Intrinsics.j(deserializationStrategy, "deserializationStrategy");
        return (T) this.json.a(deserializationStrategy, this.claims);
    }
}
