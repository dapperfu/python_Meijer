package r6;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC16726c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: a, reason: collision with root package name */
    public final String f157847a;

    public String b() {
        return ".temp" + this.f157847a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f157847a;
    }

    EnumC16726c(String str) {
        this.f157847a = str;
    }
}
