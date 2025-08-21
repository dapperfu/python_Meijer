package Ed;

/* loaded from: classes6.dex */
final class C extends H {

    /* renamed from: a, reason: collision with root package name */
    private String f7080a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7081b;

    /* renamed from: c, reason: collision with root package name */
    private int f7082c;

    /* renamed from: d, reason: collision with root package name */
    private byte f7083d;

    @Override // Ed.H
    public final H a(boolean z10) {
        this.f7081b = true;
        this.f7083d = (byte) (1 | this.f7083d);
        return this;
    }

    @Override // Ed.H
    public final H b(int i10) {
        this.f7082c = 1;
        this.f7083d = (byte) (this.f7083d | 2);
        return this;
    }

    @Override // Ed.H
    public final I c() {
        String str;
        if (this.f7083d == 3 && (str = this.f7080a) != null) {
            return new E(str, this.f7081b, this.f7082c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7080a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f7083d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f7083d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final H d(String str) {
        this.f7080a = "common";
        return this;
    }

    C() {
    }
}
