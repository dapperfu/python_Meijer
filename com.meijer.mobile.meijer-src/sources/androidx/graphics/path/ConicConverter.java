package androidx.graphics.path;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "a", "[F", "quadraticData", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConicConverter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float[] quadraticData = new float[130];

    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);
}
