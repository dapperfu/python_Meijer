package kotlin;

import java.util.Set;
import kotlin.C6446d0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lx0/u1;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "Lx0/V0;", "c", "(Ljava/util/Set;FF)Lx0/V0;", "Lc0/d0;", "b", "Lc0/d0;", "a", "()Lc0/d0;", "AnimationSpec", "LH1/h;", "F", "()F", "VelocityThreshold", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f169798a = new u1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C6446d0<Float> AnimationSpec = new C6446d0<>(0.0f, 0.0f, null, 7, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float VelocityThreshold = H1.h.p(125);

    public static /* synthetic */ ResistanceConfig d(u1 u1Var, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return u1Var.c(set, f10, f11);
    }

    public final C6446d0<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return VelocityThreshold;
    }

    private u1() {
    }

    public final ResistanceConfig c(Set<Float> anchors, float factorAtMin, float factorAtMax) {
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        Float fI0 = CollectionsKt.I0(set);
        Intrinsics.g(fI0);
        float fFloatValue = fI0.floatValue();
        Float fK0 = CollectionsKt.K0(set);
        Intrinsics.g(fK0);
        return new ResistanceConfig(fFloatValue - fK0.floatValue(), factorAtMin, factorAtMax);
    }
}
