package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
final class t0 {

    /* renamed from: c, reason: collision with root package name */
    private static t0 f93031c;

    /* renamed from: a, reason: collision with root package name */
    private ConfigurationContract f93032a;

    /* renamed from: b, reason: collision with root package name */
    private ConfigurationUUID f93033b;

    private t0() {
    }

    protected static t0 c() {
        if (f93031c == null) {
            f93031c = new t0();
        }
        return f93031c;
    }

    protected ConfigurationContract a() {
        return this.f93032a;
    }

    protected ConfigurationUUID b() {
        return this.f93033b;
    }

    protected void a(ConfigurationContract configurationContract) {
        this.f93032a = configurationContract;
    }

    protected void a(ConfigurationUUID configurationUUID) {
        this.f93033b = configurationUUID;
    }

    public void a(PropertyConfigurationContract propertyConfigurationContract) {
        this.f93032a.propertyConfiguration = propertyConfigurationContract;
    }
}
