package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final String f53217a;

    /* renamed from: b, reason: collision with root package name */
    private final int f53218b;

    /* renamed from: c, reason: collision with root package name */
    private final String f53219c;

    public String a() {
        return this.f53217a + " (" + this.f53219c + " at line " + this.f53218b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
