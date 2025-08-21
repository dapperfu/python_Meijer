package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
final class t0 {

    /* renamed from: c, reason: collision with root package name */
    private static t0 f93870c;

    /* renamed from: a, reason: collision with root package name */
    private ConfigurationContract f93871a;

    /* renamed from: b, reason: collision with root package name */
    private ConfigurationUUID f93872b;

    private t0() {
    }

    protected static t0 c() {
        if (f93870c == null) {
            f93870c = new t0();
        }
        return f93870c;
    }

    protected ConfigurationContract a() {
        return this.f93871a;
    }

    protected ConfigurationUUID b() {
        return this.f93872b;
    }

    protected void a(ConfigurationContract configurationContract) {
        this.f93871a = configurationContract;
    }

    protected void a(ConfigurationUUID configurationUUID) {
        this.f93872b = configurationUUID;
    }

    public void a(PropertyConfigurationContract propertyConfigurationContract) {
        this.f93871a.propertyConfiguration = propertyConfigurationContract;
    }
}
