package Fd;

/* renamed from: Fd.z9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3589z9 extends E9 {

    /* renamed from: a, reason: collision with root package name */
    private String f10418a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10419b;

    /* renamed from: c, reason: collision with root package name */
    private int f10420c;

    /* renamed from: d, reason: collision with root package name */
    private byte f10421d;

    @Override // Fd.E9
    public final E9 a(boolean z10) {
        this.f10419b = true;
        this.f10421d = (byte) (1 | this.f10421d);
        return this;
    }

    @Override // Fd.E9
    public final E9 b(int i10) {
        this.f10420c = 1;
        this.f10421d = (byte) (this.f10421d | 2);
        return this;
    }

    @Override // Fd.E9
    public final F9 c() {
        String str;
        if (this.f10421d == 3 && (str = this.f10418a) != null) {
            return new B9(str, this.f10419b, this.f10420c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10418a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f10421d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f10421d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final E9 d(String str) {
        this.f10418a = str;
        return this;
    }

    C3589z9() {
    }
}
