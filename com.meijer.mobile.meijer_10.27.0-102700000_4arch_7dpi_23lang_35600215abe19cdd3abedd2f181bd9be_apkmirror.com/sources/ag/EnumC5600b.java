package ag;

/* renamed from: ag.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC5600b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");


    /* renamed from: a, reason: collision with root package name */
    private String f45430a;

    @Override // java.lang.Enum
    public String toString() {
        return this.f45430a;
    }

    EnumC5600b(String str) {
        this.f45430a = str;
    }
}
