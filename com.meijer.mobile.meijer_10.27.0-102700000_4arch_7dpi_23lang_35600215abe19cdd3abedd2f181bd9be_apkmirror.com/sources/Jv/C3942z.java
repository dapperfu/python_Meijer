package Jv;

import Hv.C3714v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"LJv/z;", "", "LFv/f;", "descriptor", "<init>", "(LFv/f;)V", "", "index", "", "e", "(LFv/f;I)Z", "", "c", "(I)V", "d", "()I", "LHv/v;", "a", "LHv/v;", "origin", "value", "b", "Z", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Jv.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3942z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3714v origin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isUnmarkedNull;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Jv.z$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Fv.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, C3942z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(Fv.f p02, int i10) {
            Intrinsics.j(p02, "p0");
            return Boolean.valueOf(((C3942z) this.receiver).e(p02, i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Fv.f fVar, Integer num) {
            return a(fVar, num.intValue());
        }
    }

    public C3942z(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        this.origin = new C3714v(descriptor, new a(this));
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsUnmarkedNull() {
        return this.isUnmarkedNull;
    }

    public final void c(int index) {
        this.origin.a(index);
    }

    public final int d() {
        return this.origin.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(Fv.f descriptor, int index) {
        boolean z10;
        if (!descriptor.n(index) && descriptor.l(index).g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isUnmarkedNull = z10;
        return z10;
    }
}
