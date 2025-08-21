package cg;

/* renamed from: cg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC6506b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");


    /* renamed from: a, reason: collision with root package name */
    private String f62445a;

    @Override // java.lang.Enum
    public String toString() {
        return this.f62445a;
    }

    EnumC6506b(String str) {
        this.f62445a = str;
    }
}
