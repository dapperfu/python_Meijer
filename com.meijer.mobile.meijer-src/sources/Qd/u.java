package Qd;

/* loaded from: classes6.dex */
public enum u {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    private final String f28067a;

    @Override // java.lang.Enum
    public final String toString() {
        return this.f28067a;
    }

    u(String str) {
        this.f28067a = str;
    }
}
