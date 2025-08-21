package Dv;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LDv/A;", "LDv/e0;", "", "name", "LDv/z;", "generatedSerializer", "<init>", "(Ljava/lang/String;LDv/z;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class A extends C3136e0 {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isInline;

    @Override // Dv.C3136e0
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof A)) {
            return false;
        }
        Bv.f fVar = (Bv.f) other;
        if (!Intrinsics.e(getSerialName(), fVar.getSerialName())) {
            return false;
        }
        A a10 = (A) other;
        if (!a10.getIsInline() || !Arrays.equals(t(), a10.t()) || getElementsCount() != fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!Intrinsics.e(l(i10).getSerialName(), fVar.l(i10).getSerialName()) || !Intrinsics.e(l(i10).f(), fVar.l(i10).f())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String name, InterfaceC3160z<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.j(name, "name");
        Intrinsics.j(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // Dv.C3136e0, Bv.f
    /* renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }

    @Override // Dv.C3136e0
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
