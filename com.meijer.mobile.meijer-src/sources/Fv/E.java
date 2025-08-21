package Fv;

import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LFv/E;", "LFv/c;", "LEv/b;", "json", "LEv/i;", "value", "", "polymorphicDiscriminator", "<init>", "(LEv/b;LEv/i;Ljava/lang/String;)V", "LBv/f;", "descriptor", "", "f", "(LBv/f;)I", "tag", "j0", "(Ljava/lang/String;)LEv/i;", "g", "LEv/i;", "w0", "()LEv/i;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class E extends AbstractC3593c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ev.i value;

    public /* synthetic */ E(AbstractC3260b abstractC3260b, Ev.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3260b, iVar, (i10 & 4) != 0 ? null : str);
    }

    @Override // Cv.c
    public int f(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC3260b json, Ev.i value, String str) {
        super(json, value, str, null);
        Intrinsics.j(json, "json");
        Intrinsics.j(value, "value");
        this.value = value;
        a0("primitive");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Fv.AbstractC3593c
    public Ev.i j0(String tag) {
        Intrinsics.j(tag, "tag");
        if (tag == "primitive") {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Fv.AbstractC3593c
    /* renamed from: w0, reason: from getter */
    public Ev.i getValue() {
        return this.value;
    }
}
