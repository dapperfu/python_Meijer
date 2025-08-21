package s6;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC17023c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: a, reason: collision with root package name */
    public final String f160062a;

    public String b() {
        return ".temp" + this.f160062a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f160062a;
    }

    EnumC17023c(String str) {
        this.f160062a = str;
    }
}
