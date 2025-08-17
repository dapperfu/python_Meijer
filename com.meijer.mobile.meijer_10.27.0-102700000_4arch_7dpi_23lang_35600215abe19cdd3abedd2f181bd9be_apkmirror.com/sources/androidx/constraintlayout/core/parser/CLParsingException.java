package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final String f52993a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52994b;

    /* renamed from: c, reason: collision with root package name */
    private final String f52995c;

    public String a() {
        return this.f52993a + " (" + this.f52995c + " at line " + this.f52994b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
