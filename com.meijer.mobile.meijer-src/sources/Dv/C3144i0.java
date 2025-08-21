package Dv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LDv/i0;", "LDv/I;", "LBv/f;", "primitive", "<init>", "(LBv/f;)V", "", "c", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Dv.i0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3144i0 extends I {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3144i0(Bv.f primitive) {
        super(primitive, null);
        Intrinsics.j(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // Bv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }
}
