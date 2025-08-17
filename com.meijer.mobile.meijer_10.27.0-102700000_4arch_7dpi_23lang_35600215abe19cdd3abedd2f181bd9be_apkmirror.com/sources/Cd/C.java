package Cd;

/* loaded from: classes6.dex */
final class C extends H {

    /* renamed from: a, reason: collision with root package name */
    private String f3768a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3769b;

    /* renamed from: c, reason: collision with root package name */
    private int f3770c;

    /* renamed from: d, reason: collision with root package name */
    private byte f3771d;

    @Override // Cd.H
    public final H a(boolean z10) {
        this.f3769b = true;
        this.f3771d = (byte) (1 | this.f3771d);
        return this;
    }

    @Override // Cd.H
    public final H b(int i10) {
        this.f3770c = 1;
        this.f3771d = (byte) (this.f3771d | 2);
        return this;
    }

    @Override // Cd.H
    public final I c() {
        String str;
        if (this.f3771d == 3 && (str = this.f3768a) != null) {
            return new E(str, this.f3769b, this.f3770c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f3768a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f3771d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f3771d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final H d(String str) {
        this.f3768a = "common";
        return this;
    }

    C() {
    }
}
