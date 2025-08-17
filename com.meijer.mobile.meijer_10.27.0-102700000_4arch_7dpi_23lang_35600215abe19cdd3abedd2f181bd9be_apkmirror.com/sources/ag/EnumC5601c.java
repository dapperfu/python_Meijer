package ag;

/* renamed from: ag.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC5601c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* renamed from: a, reason: collision with root package name */
    private String f45438a;

    @Override // java.lang.Enum
    public String toString() {
        return this.f45438a;
    }

    EnumC5601c(String str) {
        this.f45438a = str;
    }
}
