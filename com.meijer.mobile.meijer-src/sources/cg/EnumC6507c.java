package cg;

/* renamed from: cg.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC6507c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* renamed from: a, reason: collision with root package name */
    private String f62453a;

    @Override // java.lang.Enum
    public String toString() {
        return this.f62453a;
    }

    EnumC6507c(String str) {
        this.f62453a = str;
    }
}
