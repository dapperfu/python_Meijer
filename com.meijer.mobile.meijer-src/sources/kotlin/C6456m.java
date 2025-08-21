package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005R\u001a\u0010#\u001a\u00020\u000b8\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lc0/m;", "Lc0/q;", "", "initVal", "<init>", "(F)V", "", "d", "()V", "g", "()Lc0/m;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setValue$animation_core_release", "b", "I", "size", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6456m extends AbstractC6460q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public C6456m(float f10) {
        super(null);
        this.value = f10;
        this.size = 1;
    }

    @Override // kotlin.AbstractC6460q
    public void d() {
        this.value = 0.0f;
    }

    @Override // kotlin.AbstractC6460q
    public float a(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // kotlin.AbstractC6460q
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.AbstractC6460q
    public void e(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    public boolean equals(Object other) {
        return (other instanceof C6456m) && ((C6456m) other).value == this.value;
    }

    /* renamed from: f, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // kotlin.AbstractC6460q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6456m c() {
        return new C6456m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
