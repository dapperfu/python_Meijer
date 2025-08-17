package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010.\u001a\u00020\u000e8\u0010X\u0090D¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b%\u0010\u001e¨\u0006/"}, d2 = {"Lc0/p;", "Lc0/q;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "", "d", "()V", "j", "()Lc0/p;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "b", "g", "setV2$animation_core_release", "c", "h", "setV3$animation_core_release", "i", "setV4$animation_core_release", "I", "size", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6333p extends AbstractC6334q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float v2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float v3;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float v4;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public C6333p(float f10, float f11, float f12, float f13) {
        super(null);
        this.v1 = f10;
        this.v2 = f11;
        this.v3 = f12;
        this.v4 = f13;
        this.size = 4;
    }

    @Override // kotlin.AbstractC6334q
    public void d() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // kotlin.AbstractC6334q
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index == 2) {
            return this.v3;
        }
        if (index != 3) {
            return 0.0f;
        }
        return this.v4;
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
            return;
        }
        if (index == 1) {
            this.v2 = value;
        } else if (index == 2) {
            this.v3 = value;
        } else {
            if (index != 3) {
                return;
            }
            this.v4 = value;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof C6333p)) {
            return false;
        }
        C6333p c6333p = (C6333p) other;
        return c6333p.v1 == this.v1 && c6333p.v2 == this.v2 && c6333p.v3 == this.v3 && c6333p.v4 == this.v4;
    }

    /* renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    /* renamed from: h, reason: from getter */
    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }

    /* renamed from: i, reason: from getter */
    public final float getV4() {
        return this.v4;
    }

    @Override // kotlin.AbstractC6334q
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C6333p c() {
        return new C6333p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
