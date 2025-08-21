package Gd;

/* renamed from: Gd.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3699l5 extends AbstractC3740r5 {

    /* renamed from: a, reason: collision with root package name */
    private String f12132a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12133b;

    /* renamed from: c, reason: collision with root package name */
    private int f12134c;

    /* renamed from: d, reason: collision with root package name */
    private byte f12135d;

    @Override // Gd.AbstractC3740r5
    public final AbstractC3740r5 a(boolean z10) {
        this.f12133b = true;
        this.f12135d = (byte) (1 | this.f12135d);
        return this;
    }

    @Override // Gd.AbstractC3740r5
    public final AbstractC3740r5 b(int i10) {
        this.f12134c = 1;
        this.f12135d = (byte) (this.f12135d | 2);
        return this;
    }

    @Override // Gd.AbstractC3740r5
    public final AbstractC3747s5 c() {
        String str;
        if (this.f12135d == 3 && (str = this.f12132a) != null) {
            return new C3720o5(str, this.f12133b, this.f12134c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12132a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f12135d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f12135d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC3740r5 d(String str) {
        this.f12132a = "vision-common";
        return this;
    }

    C3699l5() {
    }
}
