package Ed;

/* renamed from: Ed.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3507l5 extends AbstractC3548r5 {

    /* renamed from: a, reason: collision with root package name */
    private String f8580a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8581b;

    /* renamed from: c, reason: collision with root package name */
    private int f8582c;

    /* renamed from: d, reason: collision with root package name */
    private byte f8583d;

    @Override // Ed.AbstractC3548r5
    public final AbstractC3548r5 a(boolean z10) {
        this.f8581b = true;
        this.f8583d = (byte) (1 | this.f8583d);
        return this;
    }

    @Override // Ed.AbstractC3548r5
    public final AbstractC3548r5 b(int i10) {
        this.f8582c = 1;
        this.f8583d = (byte) (this.f8583d | 2);
        return this;
    }

    @Override // Ed.AbstractC3548r5
    public final AbstractC3555s5 c() {
        String str;
        if (this.f8583d == 3 && (str = this.f8580a) != null) {
            return new C3528o5(str, this.f8581b, this.f8582c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8580a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f8583d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f8583d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC3548r5 d(String str) {
        this.f8580a = "vision-common";
        return this;
    }

    C3507l5() {
    }
}
