package Dd;

/* renamed from: Dd.z9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3367z9 extends E9 {

    /* renamed from: a, reason: collision with root package name */
    private String f6385a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6386b;

    /* renamed from: c, reason: collision with root package name */
    private int f6387c;

    /* renamed from: d, reason: collision with root package name */
    private byte f6388d;

    @Override // Dd.E9
    public final E9 a(boolean z10) {
        this.f6386b = true;
        this.f6388d = (byte) (1 | this.f6388d);
        return this;
    }

    @Override // Dd.E9
    public final E9 b(int i10) {
        this.f6387c = 1;
        this.f6388d = (byte) (this.f6388d | 2);
        return this;
    }

    @Override // Dd.E9
    public final F9 c() {
        String str;
        if (this.f6388d == 3 && (str = this.f6385a) != null) {
            return new B9(str, this.f6386b, this.f6387c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6385a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f6388d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f6388d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final E9 d(String str) {
        this.f6385a = str;
        return this;
    }

    C3367z9() {
    }
}
