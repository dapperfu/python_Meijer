package I1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ5\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"LI1/d;", "", "<init>", "()V", "", "start", "stop", "amount", "b", "(FFF)F", "a", "value", "c", "rangeMin", "rangeMax", "valueMin", "valueMax", "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f13456a = new d();

    public final float b(float start, float stop, float amount) {
        return start + ((stop - start) * amount);
    }

    public final float a(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return b(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, c(valueMin, valueMax, value))));
    }

    public final float c(float a10, float b10, float value) {
        if (a10 == b10) {
            return 0.0f;
        }
        return (value - a10) / (b10 - a10);
    }

    private d() {
    }
}
