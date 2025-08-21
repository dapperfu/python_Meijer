package Fv;

import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\n"}, d2 = {"", "LBv/f;", "a", "Ljava/util/Set;", "unsignedNumberDescriptors", "", "b", "(LBv/f;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Bv.f> f11020a = SetsKt.i(Av.a.r(UInt.INSTANCE).getDescriptor(), Av.a.s(ULong.INSTANCE).getDescriptor(), Av.a.q(UByte.INSTANCE).getDescriptor(), Av.a.t(UShort.INSTANCE).getDescriptor());

    public static final boolean a(Bv.f fVar) {
        Intrinsics.j(fVar, "<this>");
        return fVar.getIsInline() && Intrinsics.e(fVar, Ev.j.i());
    }

    public static final boolean b(Bv.f fVar) {
        Intrinsics.j(fVar, "<this>");
        return fVar.getIsInline() && f11020a.contains(fVar);
    }
}
