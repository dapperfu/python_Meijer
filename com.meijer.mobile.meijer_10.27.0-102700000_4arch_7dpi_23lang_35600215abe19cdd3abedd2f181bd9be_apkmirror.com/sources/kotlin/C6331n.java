package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010(\u001a\u00020\f8\u0010X\u0090D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010\u001c¨\u0006)"}, d2 = {"Lc0/n;", "Lc0/q;", "", "v1", "v2", "<init>", "(FF)V", "", "d", "()V", "h", "()Lc0/n;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "b", "g", "setV2$animation_core_release", "c", "I", "size", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6331n extends AbstractC6334q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float v2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public C6331n(float f10, float f11) {
        super(null);
        this.v1 = f10;
        this.v2 = f11;
        this.size = 2;
    }

    @Override // kotlin.AbstractC6334q
    public void d() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
    }

    @Override // kotlin.AbstractC6334q
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index != 1) {
            return 0.0f;
        }
        return this.v2;
    }

    @Override // kotlin.AbstractC6334q
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.AbstractC6334q
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
        } else {
            if (index != 1) {
                return;
            }
            this.v2 = value;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof C6331n)) {
            return false;
        }
        C6331n c6331n = (C6331n) other;
        return c6331n.v1 == this.v1 && c6331n.v2 == this.v2;
    }

    /* renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    @Override // kotlin.AbstractC6334q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6331n c() {
        return new C6331n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.v1 + ", v2 = " + this.v2;
    }
}
